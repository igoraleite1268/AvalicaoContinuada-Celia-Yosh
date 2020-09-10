package bandtec.com.br.avalicaocontinuada1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/testar")
public class  Controller {


    public List<Manga> lista = new ArrayList<>();

    @GetMapping("/teste")
    public ResponseEntity getLista() {
        if (lista.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.status(200).body(lista);
        }


    }

    @PostMapping("/Shounen")
    public ResponseEntity addManga(@RequestBody Shounen  addShounen){
        lista.add(addShounen);
        return ResponseEntity.status(201).build();
    }


    @PostMapping("/Weebton")
    public ResponseEntity addManga(@RequestBody Weebton  addWeebton){
        lista.add(addWeebton);
        return ResponseEntity.status(201).build();
    }



    @DeleteMapping("/id")
    public ResponseEntity deletaManga (@PathVariable int id){
        if(lista.size() >= id){
            lista.remove(id-1);
            return ResponseEntity.status(201).build();
        }else{
            return ResponseEntity.status(500).build();
        }

    }
    @Override
    public String toString() {
        return "Controller{" +
                "lista=" + lista +
                '}';
    }
    }

