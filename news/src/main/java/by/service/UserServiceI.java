package by.service;

import by.model.page.DataGrid;
import by.model.page.User;

public interface UserServiceI {

	public User save(User user);

	public User login(User user);

	public DataGrid datagrid(User user);

	public void remove(String ids);

	public void edit(User user);

}
