package ru.dmitriypetrov.MyDemo_SpringBot.module;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User,Long>{
}
