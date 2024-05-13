public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria vet1 = new Veterinaria();
        // Crear dos clientes
        Cliente clie1 = new Cliente("Raul", "SomeWhere", "123456789");
        Cliente clie2 = new Cliente("Julio", "NoWhere", "987654321");
        // Agregar clientes a la veterinaria
        vet1.agregarCliente(clie1);
        vet1.agregarCliente(clie2);
        // Crear dos animales
        Animal ani1 = new Animal("Perrete", "Perro", "Alguna", clie1);
        Animal ani2 = new Animal("Gatete", "Gato", "Ninguna", clie2);
        // Agregar animales a la veterinaria
        vet1.agregarAnimal(ani1);
        vet1.agregarAnimal(ani2);
        //Crear un veterinario 
        Veterinario veto1 = new Veterinario("Paco", "Desconocida");
        // Crear una consulta
        Consulta con1 = new Consulta("01-01-2024", "Dolencia", "Pata rota", "Inmovilización de la articulacion", veto1);
        // Asignar la consulta a un animal
        ani1.agregarConsulta(con1);
        //Imprimir todas las consultas de los animales de la clínica 
        vet1.imprimirConsultas();
    }

}