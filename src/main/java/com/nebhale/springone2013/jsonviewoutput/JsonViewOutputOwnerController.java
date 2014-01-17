
package com.nebhale.springone2013.jsonviewoutput;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/jsonviewoutput/owners", produces = MediaType.APPLICATION_JSON_VALUE)
class JsonViewOutputOwnerController {

    @RequestMapping(method = RequestMethod.GET, value = "/{ownerId}")
    @ResponseBody
    Owner read(@PathVariable Integer ownerId) {
        return new Owner();
    }
}
