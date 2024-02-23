package org.example.ums.Contoller;

import org.example.ums.Model.Ums;
import org.example.ums.Services.UmsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ums")
public class UmsController {


    UmsService umsService;
    public UmsController(UmsService umsService){
        this.umsService=umsService;
    }

    @GetMapping("Get the Record by Registration Number {regNo}")
    public Ums getById(@PathVariable("regNo") int regNo){
       return umsService.getById(regNo);

    }

    @GetMapping("/Get the All Records")
        public List<Ums> getAll(){
        return umsService.getAll();

    }

    @PostMapping("/Create a New Record")
    public String createDetails(@RequestBody Ums ums){
        umsService.createDetails(ums);
        return "Created Successfully ";
    }

    @PutMapping("/Update any Record")
    public String updateDetails(@RequestBody Ums ums){
        umsService.updateDetails(ums);
        return "Updated Successfully";
    }

    @DeleteMapping("Delete the record by Registration Number {regNo}")
    public String deleteById(@PathVariable("regNo") int regNo){
        umsService.deleteById(regNo);
        return "deleted by id Successfully";

    }

    @DeleteMapping("/Delete the All Records")
    public List<Ums> deleteAll(){
       return umsService.deleteAll();

    }
}
