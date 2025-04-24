public class App {
    public void main(String [] args){

        Scanner leer = new Scanner(System.in);
        Articulo articulo = new Articulo("123456789","<NAME>",1000,TipoProducto.Alimento,10);
        System.out.println(articulo);

        System.out.println("Sistema de Gestion de Compras ERP");
        System.out.println( "1. Registrar proveedor\n" +
                            "2. Registrar producto\n" +
                            "3. Registrar solicitud de compra\n" +
                            "4. Listar proveedores\n" +
                            "5. Listar productos\n" +
                            "6. Listar solicitudes de compra\n" +
                            "7. Buscar proveedor por ID\n" +
                            "8. Buscar producto por nombre\n" +
                            "9. Buscar solicitud por número\n" +
                            "10. Aprobar / Rechazar solicitud de compra\n" +
                            "11. Calcular total de una solicitud\n" +
                            "12. Salir\n" +
                            "Seleccione una opción:");
        int opcion = leer.nextInt();
        int cont =10;
        while(cont != 0)
            switch (opcion){
                case 1:
                    System.out.println("Registrar proveedor");
                case 2:
                    System.out.println("Registrar producto");
                case 3:
                    System.out.println("Registrar solicitud de compra");
                case 4:
                    System.out.println("Listar Proveedores");
                case 5:
                    System.out.println("Listar Productos");
                case 6:
                    System.out.println("Listar solicitudes de compra");
                case 7:
                    System.out.println("Buscar proveedor por ID");
                case 8:
                    System.out.println("Buscar solicitud por número");
                case 9:
                    System.out.println(" Buscar producto por nombre");
                case 10:
                    System.out.println("Aprobar / Rechazar solicitud de compra");
                case 11:
                    System.out.println(" Calcular total de una solicitud");
                case 12:
                    System.out.println("Salir");
                    cont = 0;
                    break;
            }




    }
}
