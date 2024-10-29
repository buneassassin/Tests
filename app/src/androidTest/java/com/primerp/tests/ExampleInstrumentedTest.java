package com.primerp.tests;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Prueba instrumentada que se ejecutará en un dispositivo Android.
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Test
    public void useAppContext() {
        // Contexto de la aplicación que se está probando
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        // Asegúrate de que el nombre del paquete sea el correcto
        assertEquals("com.primerp.tests", appContext.getPackageName());
    }
}
