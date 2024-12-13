package fr.unica.miage.boatti.Dice;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class DiceRollLog {
    @Id
    @GeneratedValue
    private long id;
    private int diceCount;

    @ElementCollection
    private List<Integer> results;

    private LocalDateTime timestamp;

}