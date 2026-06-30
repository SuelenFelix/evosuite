package refactoring.app.chapter11.replaceParameterWithQuery;

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
import static refactoring.app.chapter11.replaceParameterWithQuery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Order_discountLevel_3904581656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public Order_discountLevel_3904581656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("refactoring.app.chapter11.replaceParameterWithQuery.Order"));
        setIntField(term15, term15.getClass(), "quantity", 0);
        setIntField(term15, term15.getClass(), "itemPrice", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceParameterWithQuery.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "discountLevel", argTypes, term15, args);
    }

};


