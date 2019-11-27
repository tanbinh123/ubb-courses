package ubb.courses.backend.services.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ubb.courses.backend.models.Course;
import ubb.courses.backend.repositories.CourseRepository;

import java.util.Collection;

@Service
public class CourseService implements ICourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Collection<Course> getAllCourses(){
        return this.courseRepository.findAll();
    }
}
