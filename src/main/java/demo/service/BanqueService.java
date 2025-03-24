package demo.service;

import org.springframework.stereotype.Service;


@Service
public class BanqueService {

    public ServiceResponseDTO<Float> debit (float amount) {
        // 2300 €
        if (amount > 2300) {
            return ServiceResponseDTO.buildResponse("789","Solde insuffisant");
        }
        return ServiceResponseDTO.buildResponseWithData("207","prélèvement effectué avec succès", 2300-amount);
    }
}
