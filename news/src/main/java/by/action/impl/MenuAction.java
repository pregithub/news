package by.action.impl;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import by.model.page.Menu;
import by.service.MenuServiceI;
import by.service.impl.UserServiceImpl;

import com.opensymphony.xwork2.ModelDriven;

@Namespace("/")
@Action(value = "menuAction")
public class MenuAction extends BaseAction implements ModelDriven<Menu> {
	private static final Logger logger = Logger
			.getLogger(UserServiceImpl.class);
	private Menu menu = new Menu();

	@Override
	public Menu getModel() {
		return menu;
	}

	private MenuServiceI menuService;

	public MenuServiceI getMenuService() {
		return menuService;
	}

	@Autowired
	public void setMenuService(MenuServiceI menuService) {
		this.menuService = menuService;
	}

	// the asynchronic method of getting tree node
	public void getTreeNode() {
		super.writeJson(menuService.getTreeNode(menu.getId()));
	}

	public void getAllTreeNode() {
		super.writeJson(menuService.getAllTreeNode());
	}
}
