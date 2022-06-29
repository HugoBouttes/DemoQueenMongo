package insee.stage.demo.service;


import insee.stage.demo.model.Paradata;
import insee.stage.demo.repository.ParadataRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParadataService {

    private final ParadataRepository paradataRepository;

    public ParadataService(ParadataRepository paradataRepository){
        this.paradataRepository = paradataRepository;
    }

    public void addParadata(Paradata paradata) {
        System.out.print(paradata.toString());
        paradataRepository.insert(paradata);}


    public List<Paradata> getAllParadata() {
        Example paradataexample = Example.of(new Paradata());
//        Paradata matcherObject = new Paradata();
//        matcherObject.setIdSU("0");
//        JSONArray ja = new JSONArray();
//        matcherObject.setEvents(ja);
//        ExampleMatcher matcher = ExampleMatcher.matching();
//        Example<Paradata> example = Example.of(matcherObject,matcher);
        return paradataRepository.findAll(paradataexample);
    }


}
