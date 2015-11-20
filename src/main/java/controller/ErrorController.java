package controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zane on 11/19/2015.
 */
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error heaven";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
