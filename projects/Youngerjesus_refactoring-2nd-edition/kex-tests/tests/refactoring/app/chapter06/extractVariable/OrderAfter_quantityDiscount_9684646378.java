package refactoring.app.chapter06.extractVariable;

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
import static refactoring.app.chapter06.extractVariable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OrderAfter_quantityDiscount_9684646378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public OrderAfter_quantityDiscount_9684646378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("refactoring.app.chapter06.extractVariable.OrderAfter"));
        setIntField(term27, term27.getClass(), "quantity", 0);
        setIntField(term27, term27.getClass(), "itemPrice", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.extractVariable.OrderAfter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "quantityDiscount", argTypes, term27, args);
    }

};


