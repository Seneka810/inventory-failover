package com.kord.inventoryfailover.web;

import com.kord.inventoryfailover.model.BeerInventoryDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class InventoryHandler {
    public Mono<ServerResponse> listInventory(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_NDJSON )
                .body(Mono.just(List.of(BeerInventoryDto.builder()
                        .id(UUID.randomUUID())
                        .beerId(UUID.fromString("0000000-0000-0000-0000-000000000000"))
                        .quantityOnHand(999)
                        .createDate(OffsetDateTime.now())
                        .lastModifiedDate(OffsetDateTime.now())
                        .build())), List.class);
    }
}
