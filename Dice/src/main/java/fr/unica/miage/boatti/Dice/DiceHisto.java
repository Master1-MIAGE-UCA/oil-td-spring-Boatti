package fr.unica.miage.boatti.Dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.List;

@RestController
@RequestMapping("/diceLogs")
public class DiceHisto {

    @Autowired
    private DiceRepository diceRepository;

    @Operation(summary = "Get all dice roll logs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @io.swagger.v3.oas.annotations.media.Content),
            @ApiResponse(responseCode = "500", description = "Error")
    })
    @GetMapping
    public List<DiceRollLog> getDiceRollLogs() {
        return diceRepository.findAll();
    }

}