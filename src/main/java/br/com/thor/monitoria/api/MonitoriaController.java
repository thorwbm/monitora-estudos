package br.com.thor.monitoria.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thor.monitoria.dto.MonitoriaDto;
import br.com.thor.monitoria.dto.RequestMonitoriaDto;


@RestController
@RequestMapping("/monitoria")
public class MonitoriaController {
    
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public MonitoriaDto enviarMonitoria(@RequestBody final RequestMonitoriaDto requestMonitoriaDto){
        return new MonitoriaDto();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public MonitoriaDto buscarMonitoria(@PathVariable("id") final String uuid){
        return new MonitoriaDto();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public MonitoriaDto removerMonitoria(@PathVariable("id") final String uuid){
        return new MonitoriaDto();
    } 

    @PatchMapping(value = "/{id}/confirmar")
    public MonitoriaDto ativarMonitoria(@PathVariable("id") final String uuid){
        return new MonitoriaDto();
    }
    //public Mono<MonitoriaDto> 
}
