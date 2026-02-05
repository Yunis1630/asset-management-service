package com.test.asset_management_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetHistory extends JpaRepository<AssetHistory,Long> {

    List<AssetHistory> findByAssetHistoryId(Long id);

}
