package com.kord.inventoryfailover.model;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerInventoryDto {
    private UUID id;
    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;
    private UUID beerId;
    private Integer quantityOnHand;
}
