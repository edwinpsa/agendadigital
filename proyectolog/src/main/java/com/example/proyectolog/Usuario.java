package com.example.proyectolog;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;
@Entity
@Table(name="Usuario")
public class Usuario {		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name="CONTRASENA")
		private String contrasena;
		@Column(name="NOMBRE")
		private String nombre;
		
		@Column(name="TELEFONOPERSONAL")
		private String telefonopersonal;
		
		@Column(name="TELEFONOOFICINA")
		private String telefonooficina;
		
		@Column(name="CORREOPERSONAL")
		private String correopersonal;
		
		@Column(name="CORREOOFICINA")
		private String correooficina;

		@Column(name="FECHADECUMPLEANOS")
		private String fechadecumpleanos;
			
		public Usuario() {
			super();
		}
		
		public Usuario(Long id,String contrasena, String nombre,String telefonopersonal,String telefonooficina,String correopersonal,String correooficina,String fechadecumpleanos ) 
		{
			super();
			this.id = id;
			this.contrasena = contrasena;
			this.nombre = nombre;
			this.telefonopersonal = telefonopersonal;
			this.telefonooficina = telefonooficina;
			this.correopersonal = correopersonal;
			this.correooficina = correooficina;
			this.fechadecumpleanos = fechadecumpleanos;

		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}                                              

		public String getContrasena() {
			return contrasena;
		}

		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}		
		public String getTelefonopersonal() {
			return telefonopersonal;
		}

		public void setTelefonopersonal(String telefonopersonal) {
			this.telefonopersonal = telefonopersonal;
		}
		public String getTelefonooficina() {
			return telefonooficina;
		}

		public void setTelefonooficina(String telefonooficina) {
			this.telefonooficina = telefonooficina;
		}
		
		public String getCorreopersonal() {
			return correopersonal;
		}

		public void setCorreopersonal(String correopersonal) {
			this.correopersonal = correopersonal;
		}
	
		public String getCorreooficina() {
			return correooficina;
		}
		public void setCorreooficina(String correooficina) {
			this.correooficina = correooficina;
		}
		
		public String getFechadecumpleanos() {
			return fechadecumpleanos;
		}

		public void setFechadecumpleanos(String fechadecumpleanos) {
			this.fechadecumpleanos = fechadecumpleanos;
		}
		@Override
		public String toString() {
			return "Alumno [id=" + id + ", contrasena="+contrasena+", nombre=" + nombre + ", "
					+ "telefonopersonal=" + telefonopersonal + ", telefonooficina=" + telefonooficina + ", correopersonal=" + correopersonal +",correooficina="+correooficina+",fechadecumpleanos="+fechadecumpleanos+"]";
						
		}

	}



