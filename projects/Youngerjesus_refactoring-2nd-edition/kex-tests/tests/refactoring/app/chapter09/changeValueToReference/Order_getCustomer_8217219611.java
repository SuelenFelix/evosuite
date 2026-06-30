package refactoring.app.chapter09.changeValueToReference;

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
import static refactoring.app.chapter09.changeValueToReference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Order_getCustomer_8217219611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public Order_getCustomer_8217219611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("refactoring.app.chapter09.changeValueToReference.Order"));
        Object term6 = newInstance(Class.forName("refactoring.app.chapter09.changeValueToReference.Customer"));
        setLongField(term6, term6.getClass(), "id", -8257434502486459194L);
        setField(term5, term5.getClass(), "customer", term6);
        setLongField(term5, term5.getClass(), "number", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.changeValueToReference.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomer", argTypes, term5, args);
    }

};


