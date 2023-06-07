package domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Sensor")
public class Sensor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_Sensor")
	@SequenceGenerator(name = "SQ_Sensor", sequenceName = "SQ_Sensor")
	@Column(name = "id_sensor")
	private long id;
	@Column(name = "localizacao_sensor")
	private String localSensor;
	@Column(name = "tipo_sensor")
	private String tipoSensor;

	public Sensor() {
	}

	public Sensor(long id, String localSensor, String tipoSensor) {
		this.id = id;
		this.localSensor = localSensor;
		this.tipoSensor = tipoSensor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocalSensor() {
		return localSensor;
	}

	public void setLocalSensor(String localSensor) {
		this.localSensor = localSensor;
	}

	public String getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(String tipoSensor) {
		this.tipoSensor = tipoSensor;
	}
}