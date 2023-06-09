package com.example.booktopia.services;
import com.example.booktopia.entities.Author;
import com.example.booktopia.entities.PublishingHouse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublishingHouseService {

    PublishingHouse savePublishingHouse(PublishingHouse publishingHouse);

    PublishingHouse updatePublishingHouse(PublishingHouse publishingHouse);

    PublishingHouse getPublishingHouse(Long id);

    List<PublishingHouse> getAllPublishingHouses();

    void deletePublishingHouseById(Long id);

    void deletePublishingHouses();

    Page<PublishingHouse> getAllPubHousesByPage(int page, int size);

}
