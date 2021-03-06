package com.smartsense.edc.Repository;

import com.smartsense.edc.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, String> {

    Consumer getByAssetId(String assetId);
}
