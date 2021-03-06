package co.deivisjoro.apipartidos.util;

public class UsuarioUtil {
	
	private Integer id;
	private String nombre;
	private String correo;
	private String username;
	private String password;
	private String token;
	
		
	public UsuarioUtil() {
		super();
	}


	public UsuarioUtil(Integer id, String nombre, String correo, String username, String password, String token) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.username = username;
		this.password = password;
		this.token = token;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}

	
	
	

}
