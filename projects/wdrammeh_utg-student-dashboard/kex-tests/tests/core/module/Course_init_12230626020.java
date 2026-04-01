package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Boolean;

public class Course_init_12230626020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27824;
     Object term27826;
     Object term27840;

    public Course_init_12230626020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27824 = new Double(0.5523635872663106);
        term27826 = new Integer(-375014958);
        term27840 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = double.class;
        argTypes[10] = int.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = boolean.class;
        Object[] args = new Object[13];
        args[0] = "UiUYnPrcCi";
        args[1] = "UoYtihxVaS";
        args[2] = "JDswTTCZHV";
        args[3] = "onpbIeEKoi";
        args[4] = "YRHGsAkhxb";
        args[5] = "ffYhPOzlUs";
        args[6] = "MLqYREekMl";
        args[7] = "ytSBIKXogI";
        args[8] = "nHXjMycHlU";
        args[9] = term27824;
        args[10] = term27826;
        args[11] = "ieCtQFdkii";
        args[12] = term27840;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


