package com.cursosdedesarrollo.steps;

import io.cucumber.java.*;
import java.nio.charset.StandardCharsets;

/**
 * Ejemplo integral de hooks en Cucumber JVM con JUnit 5.
 * Demuestra todos los tipos principales de hooks en una sola clase.
 */
public class HooksSteps {

    /*
     COMENTADO PARA EVITAR CONFLICTOS CON OTROS EJEMPLOS


    private long inicioEscenario;
    private long inicioStep;

    // -------------------------------------------------------------------------
    // 1️⃣ Hooks globales: corren una sola vez por suite
    // -------------------------------------------------------------------------
    @BeforeAll
    public static void beforeAll() {
        System.out.println("[GLOBAL] Iniciando suite de pruebas Cucumber...");
        System.setProperty("env", "test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("[GLOBAL] Suite de pruebas finalizada.");
    }

    // -------------------------------------------------------------------------
    // 2️⃣ Hooks por escenario
    // -------------------------------------------------------------------------
    @Before(order = 0)
    public void beforeEach(Scenario scenario) {
        inicioEscenario = System.nanoTime();
        System.out.println("→ Iniciando escenario: " + scenario.getName());
    }

    // Hook filtrado por tag: solo escenarios con @critico
    @Before(value = "@critico", order = 1)
    public void beforeCritico(Scenario scenario) {
        scenario.log("⚠️ Configuración especial para escenario crítico");
    }

    @After(order = 1)
    public void afterEach(Scenario scenario) {
        long duracionMs = (System.nanoTime() - inicioEscenario) / 1_000_000;
        scenario.log("⏱ Duración del escenario: " + duracionMs + " ms");

        // Si el escenario falló, adjuntamos logs
        if (scenario.isFailed()) {
            String detalle = "Escenario fallido: " + scenario.getName();
            scenario.attach(detalle.getBytes(StandardCharsets.UTF_8),
                    "text/plain",
                    "detalle-fallo.txt");
            System.err.println("[HOOK] Escenario fallido: " + scenario.getName());
        } else {
            scenario.log("✅ Escenario completado correctamente");
        }
    }

    // Hook filtrado por tag: solo escenarios con @db
    @After(value = "@db", order = 2)
    public void afterDB(Scenario scenario) {
        scenario.log("🧹 Cerrando conexiones de base de datos (@db)");
    }

    // -------------------------------------------------------------------------
    // 3️⃣ Hooks por step
    // -------------------------------------------------------------------------
    @BeforeStep
    public void beforeStep(Scenario scenario) {
        inicioStep = System.nanoTime();
        scenario.log("➡️ Iniciando step...");
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        long duracionMs = (System.nanoTime() - inicioStep) / 1_000_000;
        scenario.log("⬅️ Step finalizado en " + duracionMs + " ms");
    }
     */
}
