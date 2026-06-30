package kyungseo.poc.simple.web.appcore.data.mybatis;

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
import static kyungseo.poc.simple.web.appcore.data.mybatis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class RefreshableSqlSessionFactoryBean_1_invoke_8189288200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term221;

    public RefreshableSqlSessionFactoryBean_1_invoke_8189288200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term266 = Class.forName((String) "java.nio.file.attribute.AclEntryType");
        Class<? extends Object> term455 = Class.forName((String) "java.lang.String");
        Object[] term456 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term456, 0, term455);
        term2 = ((Class) term266).getDeclaredMethod((String) "valueOf", (Class[]) term456);
        ((Method) term2).setAccessible(true);
        term221 = (Object[]) newArray("java.lang.Object", 6);
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        Object term225 = newInstance(Class.forName("java.lang.Object"));
        Object term226 = newInstance(Class.forName("java.lang.Object"));
        Object term227 = newInstance(Class.forName("java.lang.Object"));
        setElement(term221, 0, term222);
        setElement(term221, 1, term223);
        setElement(term221, 2, term224);
        setElement(term221, 3, term225);
        setElement(term221, 4, term226);
        setElement(term221, 5, term227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.data.mybatis.RefreshableSqlSessionFactoryBean$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.reflect.Method");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term2;
        args[2] = term221;
        callMethod(klass, "invoke", argTypes, null, args);
    }

};


