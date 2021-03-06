package org.demoon.mrjobs.view;

import lombok.Getter;
import lombok.Setter;
import org.demoon.mrjobs.facade.UserFacade;
import org.demoon.mrjobs.model.entity.User;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@SessionScoped
@ManagedBean(name = "usermb")
public class UserMB {
    @Getter @Setter
    private User user;

    @Inject
    private UserFacade userFacade;

    @PostConstruct
    private void init() {
        this.user = new User();
    }

    private HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance()
                                                .getExternalContext().getRequest();
    }

    public String logOut() {
        getRequest().getSession().invalidate();
        return "/index";
    }

    public void saveUser() {
        System.out.println(user);
        if (user.getId() == null) {
            user.setRole("USER");
            userFacade.create(user);
            message("успешно");

        } else {
            userFacade.update(user);
            message("сохранен");
        }
    }


    public void message(String message) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Регистрация:", message));
    }

    // ---------------------getters setters
//    public User getUser() {
//        if (user == null)
//            user = new User();
//
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
