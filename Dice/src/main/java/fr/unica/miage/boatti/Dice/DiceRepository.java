package fr.unica.miage.boatti.Dice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiceRepository extends JpaRepository<DiceRollLog, Long> {
}
