# ModuleProject-Entrega1

**Entrega 1 — Generación de archivos de prueba**

Este proyecto genera automáticamente los archivos de entrada requeridos por la primera entrega del módulo:
- `input/productos.txt` — lista de productos (ID;Nombre;Precio)
- `input/info_vendedores.txt` — información de vendedores (TipoDocumento;Número;Nombres;Apellidos)
- `input/vendedores/` — archivos por vendedor con ventas (primera línea: TipoDocumento;Número; siguientes líneas: IDProducto;Cantidad;)

## Requisitos
- Java JDK 8 (Java SE 1.8)
- Eclipse IDE for Java Developers (o Eclipse Enterprise) configurado con JDK 8

## Cómo ejecutar
1. Importar el proyecto en Eclipse:
   - `File → Import → Existing Projects into Workspace` → seleccionar la carpeta del proyecto.
2. Asegurarse que el JRE del proyecto sea **JavaSE-1.8**:
   - Click derecho en el proyecto → `Properties → Java Build Path → Libraries` → seleccionar JavaSE-1.8.
   - `Properties → Java Compiler` → Compiler compliance level = 1.8.
3. Ejecutar la clase:
   - `src/com/moduleproject/GenerateInfoFiles.java` → Clic derecho → `Run As → Java Application`.
4. Al terminar, se mostrará en la consola:
