package ar.edu.unju.fi.tp1pto1.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import ar.edu.unju.fi.tp1pto1.model.CalculadoraModel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculadoraControllerTest {

    @InjectMocks
    CalculadoraController calculadoraController;

    @Mock
    Model model;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetMenuCalculadora() {
        String expectedView = "calculadora";
        when(model.addAttribute(eq("calculadora"), any(CalculadoraModel.class))).thenReturn(model);
        when(model.addAttribute(eq("resultado"), any())).thenReturn(model);

        String actualView = calculadoraController.getMenuCalculadora(model);

        verify(model).addAttribute(eq("calculadora"), any(CalculadoraModel.class));
        verify(model).addAttribute(eq("resultado"), any());
        assertEquals(expectedView, actualView);
    }

    @Test
    public void testGetCalculo() {
        String expectedView = "calculadora";
        CalculadoraModel calculadoraModel = new CalculadoraModel();
        calculadoraModel.setOp("+");
        when(model.addAttribute(eq("calculadora"), any(CalculadoraModel.class))).thenReturn(model);

        String actualView = calculadoraController.getCalculo(calculadoraModel, model);

        verify(model).addAttribute(eq("calculadora"), any(CalculadoraModel.class));
        assertEquals(expectedView, actualView);
    }
}
