package insee.stage.demo.controller;

import insee.stage.demo.model.Campaign;
import insee.stage.demo.model.Metadata;
import insee.stage.demo.model.SurveyUnit;
import insee.stage.demo.service.CampaignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService){
        this.campaignService = campaignService;
    }


    /** GET/ ALL campaign **/
    @GetMapping
    public ResponseEntity<List<Campaign>> getAllCampaign() {
        return ResponseEntity.ok(campaignService.getAllCampaign());
    }


    /** GET/ api/campaign/idCampagn **/
    @GetMapping("/{id}")
    public ResponseEntity<Campaign> getCampaignById(@PathVariable String id) {
        return ResponseEntity.ok(campaignService.getCampaignById(id));
    }

}
