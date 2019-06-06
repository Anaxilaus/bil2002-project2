package mu.Project.Controllers;

import mu.Project.Models.Account;

public abstract class AccountController extends ChildController {

    @Override
    Account getModel() {
        return (Account) super.getModel();
    }

    public void close() {
        getFrame().dispose();
        getParent().closeProgram();
    }
}
