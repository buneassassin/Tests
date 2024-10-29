package com.primerp.tests;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Configura la ventana para el modo Edge-to-Edge (sin la clase EdgeToEdge)
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false); // Desactiva el ajuste automático de la ventana
        }

        setContentView(R.layout.activity_main);

        // Ocultar la barra de estado y la barra de navegación
        hideSystemBars();

        // Configurar los WindowInsets para ajustar el contenido a la pantalla
        View rootView = findViewById(android.R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> {
            // Obtiene los insets del sistema (barra de estado, navegación)
            Insets systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            // Ajusta el padding de la vista principal con los valores de insets
            v.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom);

            return insets;
        });

    }

    private void hideSystemBars() {
        View decorView = getWindow().getDecorView();
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(decorView);

        if (windowInsetsController != null) {
            // Ocultar la barra de estado y la barra de navegación
            windowInsetsController.hide(WindowInsetsCompat.Type.systemBars());
            windowInsetsController.setSystemBarsBehavior(WindowInsetsControllerCompat.BEHAVIOR_DEFAULT);
        }
    }
}
