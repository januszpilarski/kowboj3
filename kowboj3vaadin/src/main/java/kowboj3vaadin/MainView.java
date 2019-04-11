package kowboj3vaadin;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;


@SpringComponent
@Route("")
@Theme(Lumo.class)
public class MainView extends VerticalLayout {

    public MainView() {

        Label label = new Label("Hi");
        Button btn = new Button("check");

        btn.addClickListener(buttonClickEvent ->{
            String text = "Kto";
            Notification.show(text, 5000, Notification.Position.BOTTOM_CENTER);
        });

        add(label);
        add(btn);
    }
}
