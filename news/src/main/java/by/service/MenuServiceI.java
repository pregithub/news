package by.service;

import java.util.List;

import by.model.page.Menu;

public interface MenuServiceI {
	public List<Menu> getTreeNode(String id);
	public List<Menu> getAllTreeNode();
}
