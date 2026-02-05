package com.test.asset_management_service.repository;

import com.test.asset_management_service.model.Asset;
import com.test.asset_management_service.model.AssetStatus;
import com.test.asset_management_service.model.AssetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset,Long> {

    List<Asset> findByType(AssetType type);

    List<Asset> findByStatus(AssetStatus status);

}
