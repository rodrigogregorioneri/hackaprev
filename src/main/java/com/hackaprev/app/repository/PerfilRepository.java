package com.hackaprev.app.repository;

import com.hackaprev.app.dto.PerfilModel;
import com.hackaprev.app.dto.PlanoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PerfilRepository extends MongoRepository<PerfilModel, String> {
}
