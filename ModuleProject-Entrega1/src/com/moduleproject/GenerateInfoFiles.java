package com.moduleproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {

    public static void main(String[] args) {
        String basePath = System.getProperty("user.dir") + File.separator + "input";
        File inputDir = new File(basePath);
        if (!inputDir.exists()) {
            inputDir.mkdirs();
        }

        generateProductos(basePath + File.separator + "productos.txt");
        generateInfoVendedores(basePath + File.separator + "info_vendedores.txt");
        generateVentasPorVendedor(basePath + File.separator + "vendedores");

        System.out.println("Archivos de prueba generados correctamente.");
    }

    private static void generateProductos(String filePath) {
        String[] productos = {
            "Celular Samsung Galaxy S22",
            "iPhone 14 Pro Max",
            "Xiaomi Redmi Note 12",
            "Laptop Lenovo ThinkPad X1",
            "Tablet iPad Air 2022",
            "Smartwatch Huawei GT3",
            "Cámara Canon EOS 90D",
            "Audífonos Sony WH-1000XM4",
            "Consola PlayStation 5",
            "Televisor LG OLED 55\""
        };
        writeToFile(filePath, productos);
    }

    private static void generateInfoVendedores(String filePath) {
        String[] vendedores = {
            "Juan Pérez,juan.perez@example.com,3012345678",
            "María López,maria.lopez@example.com,3023456789",
            "Carlos Gómez,carlos.gomez@example.com,3034567890",
            "Ana Torres,ana.torres@example.com,3045678901",
            "Luis Martínez,luis.martinez@example.com,3056789012"
        };
        writeToFile(filePath, vendedores);
    }

    private static void generateVentasPorVendedor(String folderPath) {
        File vendedoresDir = new File(folderPath);
        if (!vendedoresDir.exists()) {
            vendedoresDir.mkdirs();
        }

        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            String filePath = folderPath + File.separator + "ventas_vendedor_" + i + ".txt";
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= 5; j++) {
                sb.append("Producto ").append(j).append(" - Unidades: ").append(random.nextInt(10) + 1).append("\n");
            }
            writeToFile(filePath, sb.toString().split("\n"));
        }
    }

    private static void writeToFile(String filePath, String[] lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
