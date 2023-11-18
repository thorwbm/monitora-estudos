package br.com.thor.monitoria.dto;

import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class MonitoriaDto {
    
    private UUID uuid;
}
