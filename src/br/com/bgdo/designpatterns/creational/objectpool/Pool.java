package br.com.bgdo.designpatterns.creational.objectpool;

public interface Pool<T> {
	T acquire();

	void release(T t);
}
