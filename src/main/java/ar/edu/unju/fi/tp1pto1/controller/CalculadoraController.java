package ar.edu.unju.fi.tp1pto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.tp1pto1.model.CalculadoraModel;

@Controller
public class CalculadoraController {

	@GetMapping({"/calculadora", "/"})
	public String getMenuCalculadora(Model model) {
		model.addAttribute("calculadora", new CalculadoraModel());
		model.addAttribute("resultado", null);
		return "calculadora";
	}

	@PostMapping(value = "/calculo")
	public String getCalculo(@ModelAttribute("calculadora") CalculadoraModel calculadoraModel, Model model) {
		switch (calculadoraModel.getOp()) {
			case "+": // suma
				calculadoraModel.calcular();
				break;
			case "-": // resta
				calculadoraModel.calcular();
				break;
			case "X": // multiplicacion
				calculadoraModel.calcular();
				break;
			case "/": // division
				calculadoraModel.calcular();
				break;
			default:
		}
		model.addAttribute("calculadora", calculadoraModel);
		return "calculadora";
	}
}
