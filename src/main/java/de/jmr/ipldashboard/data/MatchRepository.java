package de.jmr.ipldashboard.data;

import org.springframework.data.repository.CrudRepository;

import de.jmr.ipldashboard.model.Match;

public interface MatchRepository extends CrudRepository<Match, String> {

}
