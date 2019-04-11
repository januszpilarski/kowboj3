package kowboj3vaadin;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.templatemodel.TemplateModel;

//@SpringComponent
@Tag("my-form")
@HtmlImport("src/my-form.html")
public class MyForm extends PolymerTemplate<MyForm.FormModel> {

    private @Id("name") TextField name;
    private @Id("email") TextField email;
    private @Id("submitBtn") Button submitBtn;

    public interface FormModel extends TemplateModel{

    }

    public MyForm(){

        submitBtn.addClickListener(buttonClickEvent ->{
            String text = "name: " + name.getValue()+"/n Email id: " + email.getValue();
            Notification.show(text, 5000, Notification.Position.BOTTOM_CENTER);
        });
    }
}
