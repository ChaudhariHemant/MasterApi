package com.Master.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Master.Entity.MasterEntity;
import com.Master.Service.MasterService;

import java.util.List;

@RestController
@RequestMapping("/v2/master_list")
public class MasterController {
	@Autowired
	private MasterService masterService;

	@PostMapping
	public ResponseEntity<MasterEntity> createMasterData(@RequestBody MasterEntity masterEntity) {
		MasterEntity savedEntity = masterService.saveMasterData(masterEntity);
		return ResponseEntity.ok(savedEntity);
	}

	@GetMapping
	public ResponseEntity<Page<MasterEntity>> getAllMasterData(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {
		return ResponseEntity.ok(masterService.getAllMasterData(page, size));
	}
}
