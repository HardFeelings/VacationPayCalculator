package ru.shatsckij.vacationpaycalculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shatsckij.vacationpaycalculator.model.Employee;

@Controller
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculate(@RequestParam(name = "avgSalary") double avgSalary,
                            @RequestParam(name = "vacationDays") int vacationDays,
                            Model model){
        Employee employee = new Employee(avgSalary,vacationDays);
        model.addAttribute("result", employee.calculateVacationPay());

        return "calc_result_page";
    }
}
