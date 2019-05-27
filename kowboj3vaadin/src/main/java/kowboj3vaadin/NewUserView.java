//package kowboj3vaadin;
//
//import com.vaadin.flow.component.ReconnectDialogConfiguration;
//import com.vaadin.flow.component.UI;
//import com.vaadin.flow.component.html.H2;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.router.Route;
//
//
//import kowboj3b.Services.UserDaoImpl;
//import kowboj3b.domain.User;
//import org.vaadin.crudui.crud.impl.GridCrud;
//import org.vaadin.crudui.layout.impl.VerticalCrudLayout;
//
//
////@SpringUI
//@Route("user")
//public class NewUserView extends VerticalLayout {
//
//    private GridCrud<User> crud = new GridCrud<>(User.class, new VerticalCrudLayout());
//
//    private UserDaoImpl userService;
//
//    public NewUserView() {
//            ReconnectDialogConfiguration configuration =
//                    UI.getCurrent().getReconnectDialogConfiguration();
//            configuration.setDialogText("Please wait...");
//            configuration.setReconnectInterval(1000);
//
//            H2 title = new H2("Users");
//
//            crud.getGrid().setColumns("firstName", "lastName");
//            crud.getCrudFormFactory().setVisibleProperties("name", "twitterUsername");
//            crud.getCrudFormFactory().setUseBeanValidation(true);
//            crud.setClickRowToUpdate(true);
//            crud.setUpdateOperationVisible(false);
////            crud.setFindAllOperation(() -> (Collection<User>) userService.findUserByEmail("dty"));
//
//
//            add(title, crud);
//            setMargin(false);
//            setHeight(null);
//        }
//
//}
