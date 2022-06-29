package insee.stage.demo.controller;

import insee.stage.demo.model.Paradata;
import insee.stage.demo.model.SurveyUnit;
import insee.stage.demo.service.ParadataService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/paradata")
public class ParadataController {


    private final ParadataService paradataService;

    public ParadataController(ParadataService paradataService){
        this.paradataService = paradataService;
    }




    @GetMapping("/get")
    public ResponseEntity<List<Paradata>> getAllParadata() {
        return ResponseEntity.ok(paradataService.getAllParadata());
    }

    /** POST paradata **/

    @PostMapping()
    public ResponseEntity<Paradata> addParadata(@RequestBody String events ) {
//        System.out.println(events.toString());
        JSONObject jsonObject = new JSONObject(events);
        Paradata paradata = new Paradata();
        paradata.setEvents(jsonObject);
        paradataService.addParadata(paradata);
        return new ResponseEntity<>(paradata, HttpStatus.CREATED);
    }

}
