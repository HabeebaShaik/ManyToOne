package com.cglia.manytoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.manytoone.model.Branch;
import com.cglia.manytoone.repository.BranchRepository;

@Service
public class BranchService {
	 @Autowired
	    private BranchRepository branchRepository;

	    public List<Branch> getAllBranches() {
	        return branchRepository.findAll();
	    }

	    public Branch getBranchById(int branchId) {
	        return branchRepository.findById(branchId).orElse(null);
	    }

	    public Branch createBranch(Branch branch) {
	        return branchRepository.save(branch);
	    }

	    public Branch updateBranch(int branchId, Branch updatedBranch) {
	        Branch existingBranch = branchRepository.findById(branchId).orElse(null);
	        if (existingBranch != null) {
	            existingBranch.setBranchCode(updatedBranch.getBranchCode());
	            return branchRepository.save(existingBranch);
	        }
	        return null;
	    }

	    public void deleteBranch(int branchId) {
	        branchRepository.deleteById(branchId);
	    }
}
