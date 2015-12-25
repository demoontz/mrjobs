package org.demoon.mrjobs.converters;

import org.demoon.mrjobs.model.entity.Answer;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created by demoon on 27.09.2015.
 */
@FacesConverter("eventCatConv")
public class OneConv
    implements Converter {


    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && value.trim().length() > 0) {

            return new Answer();
        } else {
            return null;
        }
    }

    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if (obj != null) {
            return ((Answer) obj).getText();
        } else {
            return null;
        }
    }
}
