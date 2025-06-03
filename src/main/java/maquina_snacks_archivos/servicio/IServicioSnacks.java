package maquina_snacks_archivos.servicio;

import java.util.List;
import maquina_snacks_archivos.dominio.Snack;

public interface IServicioSnacks {

    void agregarSnack(Snack snack);

    void mostrarSnacks();

    List<Snack> getSnacks();
}
