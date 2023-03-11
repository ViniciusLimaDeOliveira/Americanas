package br.ada.americanas.moviesbattle.battle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BattleRepository extends JpaRepository<Battle, Long> {
}
