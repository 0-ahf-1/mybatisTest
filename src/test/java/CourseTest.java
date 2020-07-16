import com.ahf.dao.ICourseMapper;
import com.ahf.entity.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseTest {
    private InputStream in;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private ICourseMapper mapper;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapperConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        session = factory.openSession();
        mapper = session.getMapper(ICourseMapper.class);
    }

    @After
    public void close() throws IOException {
        session.close();
        in.close();
    }
    @Test
    public void findBySid(){
        List<Course> courses = new ArrayList<>();
        courses = mapper.findBySid(3);
        Iterator<Course> it = courses.iterator();
        it.forEachRemaining(obj -> System.out.println(obj));
    }
}
