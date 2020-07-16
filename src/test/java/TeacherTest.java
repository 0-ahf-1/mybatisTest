import com.ahf.dao.ITeacherMapper;
import com.ahf.entity.Teacher;
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

public class TeacherTest {
    private InputStream in;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private ITeacherMapper mapper;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapperConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        session = factory.openSession();
        mapper = session.getMapper(ITeacherMapper.class);
    }

    @After
    public void close() throws IOException {
        session.close();
        in.close();
    }
    @Test
    public void findAll(){
        List<Teacher> teachers = new ArrayList<>();
        teachers = mapper.findAll();
        Iterator<Teacher> it = teachers.iterator();
        it.forEachRemaining(obj -> System.out.println(obj));
    }
}
