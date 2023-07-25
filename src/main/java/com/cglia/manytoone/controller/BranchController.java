package com.cglia.manytoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.manytoone.model.Branch;
import com.cglia.manytoone.service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	  @Autowired
	    private BranchService branchService;

	    @GetMapping
	    public List<Branch> getAllBranches() {
	        return branchService.getAllBranches();
	    }

	    @GetMapping("/{id}")
	    public Branch getBranchById(@PathVariable int id) {
	        return branchService.getBranchById(id);
	    }

	    @PostMapping
	    public Branch createBranch(@RequestBody Branch branch) {
	        return branchService.createBranch(branch);
	    }

	    @PutMapping("/{id}")
	    public Branch updateBranch(@PathVariable int id, @RequestBody Branch updatedBranch) {
	        return branchService.updateBranch(id, updatedBranch);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBranch(@PathVariable int id) {
	        branchService.deleteBranch(id);
	    }
}
