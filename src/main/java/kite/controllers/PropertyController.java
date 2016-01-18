package kite.controllers;


import kite.beans.Property;
import kite.services.PropertyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/property", produces = "application/json", consumes = "application/json")
@SuppressWarnings("unused")
public class PropertyController {

    @Autowired
    private PropertyDAO propertyDAO;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody
    List<Property> getAllProperties() {
        return propertyDAO.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Property getProperty(@PathVariable Long id) {
        return propertyDAO.getById(id);
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public @ResponseBody
    long createMainProperty(@RequestBody Property property) {
        return propertyDAO.create(property);
    }

    @RequestMapping(value = "/{parentId}", method = RequestMethod.POST)
    public @ResponseBody
    long createChildProperty(@RequestBody Property property, @PathVariable Long parentId) {
        property.setParentProperty(propertyDAO.getById(parentId));
        return propertyDAO.create(property);
    }
}
