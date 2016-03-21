package kite.controllers;


import kite.beans.Property;
import kite.dtos.SearchDTO;
import kite.dao.PropertyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/property", produces = "application/json")
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
        Property property = propertyDAO.getById(id);
        return property;
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    long createMainProperty(@RequestBody Property property) {
        property.setCreationDate(new Date());
        property.setModifiedDate(new Date());
        return propertyDAO.create(property);
    }

    @RequestMapping(value = "/{parentId}", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    long createChildProperty(@RequestBody Property property, @PathVariable Long parentId) {
        property.setParentProperty(propertyDAO.getById(parentId));
        return propertyDAO.create(property);
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public @ResponseBody
    List<Property> search(@RequestBody SearchDTO dto) {
        return propertyDAO.search(dto);
    }

}
