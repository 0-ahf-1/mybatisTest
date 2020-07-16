import com.ahf.dao.IGradeMapper;
import com.ahf.entity.Grade;
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

public class GradeTest {
    private InputStream in;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IGradeMapper mapper;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapperConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        session = factory.openSession();
        mapper = session.getMapper(IGradeMapper.class);
    }

    @After
    public void close() throws IOException {
        session.close();
        in.close();
    }
    @Test
    public void findAll(){
        List<Grade> grades = new ArrayList<Grade>();
        grades = mapper.findAll();
        Iterator it = grades.iterator();
        it.forEachRemaining(obj -> System.out.println(obj));
    }
    @Test
    public void findGradeById(){
        Grade grade = mapper.findById(1);
        System.out.println(grade);
    }
}
