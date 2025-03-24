package demo.api;

import demo.service.BanqueService;
import demo.service.ServiceResponseDTO;
import demo.service.debitRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanqueRestController {
    @Autowired
    BanqueService banqueService;

    @PostMapping("/debit")
    public ServiceResponseDTO debit(@RequestBody debitRequestDTO debitRequestDto) {
        return banqueService.debit(debitRequestDto.amount);
    }
}
