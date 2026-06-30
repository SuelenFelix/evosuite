package refactoring.app.chapter11.replaceQueryWithParameter;

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
import static refactoring.app.chapter11.replaceQueryWithParameter.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Example_client_12122492291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Example_client_12122492291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter11.replaceQueryWithParameter.Example"));
        Object term2 = newInstance(Class.forName("refactoring.app.chapter11.replaceQueryWithParameter.HeatingPlan"));
        setIntField(term2, term2.getClass(), "max", 568599855);
        setIntField(term2, term2.getClass(), "min", 1162663216);
        setField(term1, term1.getClass(), "heatingPlan", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceQueryWithParameter.Example");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "client", argTypes, term1, args);
    }

};


