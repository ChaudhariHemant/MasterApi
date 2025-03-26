package com.Master.Service;

import com.Master.Entity.MasterEntity;
import com.Master.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MasterService {
    @Autowired
    private MasterRepository masterRepository;

    public MasterEntity saveMasterData(MasterEntity entity) {
        Optional<MasterEntity> existingEntity = masterRepository.findByName(entity.getName());
        return existingEntity.orElseGet(() -> masterRepository.save(entity));
    }

    public Page<MasterEntity> getAllMasterData(int page, int size) {
        return masterRepository.findAll(PageRequest.of(page, size));
    }
}
