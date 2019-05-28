package com.pluralsight.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalRepository;

@Service("goalService")
public class GoalServiceimpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	@Override
	@Transactional
	public Goal save(Goal goal) {
		
		return goalRepository.save(goal);
	}

	@Override
	public List<Goal> findAllGoals() {
		return goalRepository.loadAll();
	}
}

