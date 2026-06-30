package refactoring.app.chapter06.inlineMethod;

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
import static refactoring.app.chapter06.inlineMethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Before_moreThanFiveLateDeliveries_19563724462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;
     Object term9;

    public Before_moreThanFiveLateDeliveries_19563724462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("refactoring.app.chapter06.inlineMethod.Before"));
        term9 = newInstance(Class.forName("refactoring.app.chapter06.inlineMethod.Driver"));
        setIntField(term9, term9.getClass(), "numberOfLateDeliveries", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.inlineMethod.Before");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.inlineMethod.Driver");
        Object[] args = new Object[1];
        args[0] = term9;
        callMethod(klass, "moreThanFiveLateDeliveries", argTypes, term8, args);
    }

};


