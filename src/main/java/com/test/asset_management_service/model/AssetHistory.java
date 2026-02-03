package com.test.asset_management_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Table(name = "asset_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssetHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Asset asset;

    @Enumerated(EnumType.STRING)
    private AssetStatus status;

    @Enumerated(EnumType.STRING)
    private AssetType type;

    @Column(nullable = false)
    private LocalDateTime changedAt = LocalDateTime.now();

    @Column(nullable = false)
    private Long changedBy;

    private String reason;

}
