package insee.stage.demo.service;


import insee.stage.demo.model.Campaign;
import insee.stage.demo.repository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {

    private final CampaignRepository campaignRepository ;

    public CampaignService(CampaignRepository campaignRepository){
        this.campaignRepository = campaignRepository;
    }




    public Campaign getCampaignById(String id){
        return campaignRepository.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot fin survey units by Id %s", id)));
    }

    public List<Campaign> getAllCampaign() {
        return campaignRepository.findAll();
    }

}
