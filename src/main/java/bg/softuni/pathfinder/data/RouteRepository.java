package bg.softuni.pathfinder.data;

import bg.softuni.pathfinder.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {



}
