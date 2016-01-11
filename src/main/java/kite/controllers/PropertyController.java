package kite.controllers;


import kite.beans.Property;
import kite.services.PropertyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/property", produces = "application/json", consumes = "application/json")
public class PropertyController {

    @Autowired
    private PropertyDAO propertyDAO;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Property getProperty(@PathVariable Long id) {
        return propertyDAO.getById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public @ResponseBody
    long createProperty(@RequestBody Property property) {
        return propertyDAO.create(property);
    }
}
