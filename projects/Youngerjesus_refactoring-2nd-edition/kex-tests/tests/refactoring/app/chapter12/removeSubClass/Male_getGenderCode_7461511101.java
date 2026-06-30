package refactoring.app.chapter12.removeSubClass;

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
import static refactoring.app.chapter12.removeSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Male_getGenderCode_7461511101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public Male_getGenderCode_7461511101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("refactoring.app.chapter12.removeSubClass.Male"));
        setField(term91, term91.getClass(), "name", "jJCZpVmanW");
        setField(term91, term91.getClass(), "gender", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.removeSubClass.Male");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenderCode", argTypes, term91, args);
    }

};


