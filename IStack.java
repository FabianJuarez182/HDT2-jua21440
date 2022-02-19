/**
 * Copyright (C), 2022-2023, FabianJuarez
 * FileName: Controladora
 * Author:   Fabián Juárez
 * Date:     18/02/2022
 * @author Fabian Juarez
 */
public interface IStack<T> {

	void push(T value);

	T pull();

	T peek();

	int count();

	boolean isEmpty();
}
