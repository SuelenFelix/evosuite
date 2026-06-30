package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class News_packNews_5301400569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175758;

    public News_packNews_5301400569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175758 = newInstance(Class.forName("core.News"));
        setField(term175758, term175758.getClass(), "present", null);
        setField(term175758, term175758.getClass(), "scrollPane", null);
        setField(term175758, term175758.getClass(), "refreshButton", null);
        setField(term175758, term175758.getClass(), "accessLabel", null);
        setField(term175758, term175758.getClass(), "accessResident", null);
        setBooleanField(term175758, term175758.getClass(), "isFirstView", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.News");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "packNews", argTypes, term175758, args);
    }

};


