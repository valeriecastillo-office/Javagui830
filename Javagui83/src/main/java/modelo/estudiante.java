/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DORA LIBIA
 */
public class estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
   private double resultado;
    
   public estudiante(String nombre, double nota1, double nota2){
   this.nombre =nombre;
   this.nota1= nota1;
   this.nota2= nota2;
   this.resultado = resultado;
   
} 

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public estudiante(double resultado) {
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calculardefinitiva(){
        resultado = (nota1 +nota2)/2.0;
    return resultado;}
    public String obtenerResultado(){
    if (resultado >=3.0){
    String estado ="aprobado";
    return estado;
    }else{
    String estado ="no aprobado";
            return estado;
            }}}

