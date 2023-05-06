package com.SocialNetSys.NetSys.Repositories;

import com.SocialNetSys.NetSys.Models.Entities.Publication;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.UUID;

public interface PublicationRepository extends MongoRepository<Publication, UUID> {
}
