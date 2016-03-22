package org.foodie.server.service;

import java.util.List;

import org.foodie.server.entity.Dish;
import org.foodie.server.entity.DishLogView;
import org.springframework.stereotype.Service;

@Service
public interface DishService {
	public void create(Dish newDish);
	public void remove(Dish removedDish);
	public void update(Dish updatedDish);
	public List<DishLogView> query(long shop_id);
	public Dish queryOne(long dishId);
}
