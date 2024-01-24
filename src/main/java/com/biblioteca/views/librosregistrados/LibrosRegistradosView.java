package com.biblioteca.views.librosregistrados;

import com.biblioteca.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Libros Registrados")
@Route(value = "libros-registrados", layout = MainLayout.class)
@Uses(Icon.class)
public class LibrosRegistradosView extends Composite<VerticalLayout> {

    public LibrosRegistradosView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
