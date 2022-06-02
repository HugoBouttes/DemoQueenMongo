package insee.stage.demo.controller;

import insee.stage.demo.model.Nomenclature;
import insee.stage.demo.service.NomenclatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/api/nomenclature")
    public class NomenclatureController {
        private final NomenclatureService nomenclatureService;

        public NomenclatureController(NomenclatureService nomenclatureService){
            this.nomenclatureService = nomenclatureService;
        }

        @GetMapping
        public ResponseEntity<List<Nomenclature>> getAllExpenses() {
            return ResponseEntity.ok(nomenclatureService.getAllNomenclature());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Nomenclature> getNomenclatureById(@PathVariable String id) {
            return ResponseEntity.ok(nomenclatureService.getNomenclatureById(id));
        }
    }

