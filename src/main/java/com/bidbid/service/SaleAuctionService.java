package com.bidbid.service;

import com.bidbid.dto.saleauction.BidHigherRequest;
import com.bidbid.dto.saleauction.SaleAuctionRequest;
import com.bidbid.entity.Member;
import com.bidbid.entity.saleauction.SaleAuction;
import com.bidbid.repository.SaleAuctionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleAuctionService {
    private final SaleAuctionRepository saleAuctionRepository;

    public SaleAuction upload(SaleAuctionRequest dto) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public void bidHigherPrice(BidHigherRequest dto, Member buyer) {
        throw new UnsupportedOperationException("Not supported yet");
    }

}
