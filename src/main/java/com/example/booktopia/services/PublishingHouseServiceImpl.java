package com.example.booktopia.services;

import com.example.booktopia.entities.PublishingHouse;
import com.example.booktopia.repositories.PublishingHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublishingHouseServiceImpl implements PublishingHouseService {
    @Autowired
    PublishingHouseRepository publishingHouseRepository;
    @Override
    public PublishingHouse savePublishingHouse(PublishingHouse publishingHouse){return publishingHouseRepository.save(publishingHouse);}

    @Override
    public PublishingHouse updatePublishingHouse(PublishingHouse publishingHouse) {
        return publishingHouseRepository.save(publishingHouse);
    }

    @Override
    public PublishingHouse getPublishingHouse(Long id) {
        return publishingHouseRepository.findById(id).get();

    }

    @Override
    public List<PublishingHouse> getAllPublishingHouses() {
        return publishingHouseRepository.findAll();
    }

    @Override
    public void deletePublishingHouseById(Long id) {
        publishingHouseRepository.deleteById(id);

    }

    @Override
    public void deletePublishingHouses() {
        publishingHouseRepository.deleteAll();

    }

    @Override
    public Page<PublishingHouse> getAllPubHousesByPage(int page, int size) {
        return publishingHouseRepository.findAll(PageRequest.of(page, size));
    }
}
