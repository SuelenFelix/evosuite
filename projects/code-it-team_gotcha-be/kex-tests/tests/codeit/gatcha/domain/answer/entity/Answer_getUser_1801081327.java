package codeit.gatcha.domain.answer.entity;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static codeit.gatcha.domain.answer.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Answer_getUser_1801081327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657;

    public Answer_getUser_1801081327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term658 = new Integer(-478195677);
        Integer term673 = new Integer(972867650);
        Integer term689 = new Integer(1655935355);
        Integer term692 = new Integer(-481533957);
        HashMap term707 = new HashMap();
        Set<Object> term767 =  ((Map) term707).keySet();
        HashSet term706 = new HashSet((Collection<? extends Object>) term767);
        term657 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term672 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term688 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term691 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term657, term657.getClass(), "id", term658);
        setField(term657, term657.getClass(), "body", "dpNsDgfPso");
        setField(term672, term672.getClass(), "id", term673);
        setField(term672, term672.getClass(), "body", "hCWPJQKpdc");
        setBooleanField(term672, term672.getClass(), "valid", true);
        setField(term657, term657.getClass(), "question", term672);
        setField(term688, term688.getClass(), "id", term689);
        setField(term691, term691.getClass(), "id", term692);
        setField(term691, term691.getClass(), "role", "WzMEhMXkKx");
        setField(term691, term691.getClass(), "users", term706);
        setField(term688, term688.getClass(), "authority", term691);
        setField(term688, term688.getClass(), "email", "GgZWSjxjyE");
        setField(term688, term688.getClass(), "password", "EeBVbzjcCI");
        setBooleanField(term688, term688.getClass(), "enabled", true);
        setField(term657, term657.getClass(), "user", term688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term657, args);
    }

};


