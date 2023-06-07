import domain.Cultura;
import domain.Fazenda;
import domain.Sensor;
import domain.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;



public class Main {


    public static void main(String[] args) {




     Cultura cultura = new Cultura();

     cultura.setId(01);
     cultura.setNome("Milho");
     cultura.setDataPlantio(LocalDate.ofEpochDay(01/03/22));
     cultura.setDataColheita(LocalDate.ofEpochDay(01/07/22));

     Usuario usuario = new Usuario();

    usuario.setId(01);
    usuario.setNome("Gabriel");
    usuario.setEmail("gabriel@email.com");
    usuario.setTelefone("119898989");

     Fazenda fazenda = new Fazenda();

     fazenda.setId(01);
     fazenda.setNome("Fazenda Primavera");
     fazenda.setEndereco("Cidade A");
     fazenda.setTamanho(100);

     Sensor sensor = new Sensor();
     sensor.setId(01);
     sensor.setLocalSensor("Estufa 1");
     sensor.setTipoSensor("Temperatura");




var factory = Persistence.createEntityManagerFactory("oracle");

 var manager = factory.createEntityManager();



 var jpql = "FROM Fazenda";


 manager.createQuery(jpql);


 manager.getTransaction().begin();

        manager.getTransaction().begin();
        manager.persist(fazenda);
        manager.persist(usuario);
        manager.persist(cultura);
        manager.persist(sensor);

 manager.getTransaction().commit();
 manager.close();




    }
}
