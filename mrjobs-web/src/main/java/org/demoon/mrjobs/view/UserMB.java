package org.demoon.mrjobs.view;

import org.demoon.mrjobs.facade.UserFacade;
import org.demoon.mrjobs.model.entity.User;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@SessionScoped
@ManagedBean
public class UserMB {
    private User user;

    @Inject
    private UserFacade userFacade;

    private HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance()
                                                .getExternalContext().getRequest();
    }

    public String logOut() {
        getRequest().getSession().invalidate();
        return "index";
    }

    public void saveUser() {
        if (user.getId() == 0) {

            userFacade.create(user);
            message("рега ок");

        } else {
            userFacade.update(user);
            message("сохранен");
        }

    }


    public void message(String message) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Achtung!", message));
    }

    // ---------------------getters setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
