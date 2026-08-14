package tudelft.smells.sensitiveequality;

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
import static tudelft.smells.sensitiveequality.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Item_finalAmount_198555565810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public Item_finalAmount_198555565810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        setField(term291, term291.getClass(), "name", null);
        setIntField(term291, term291.getClass(), "qty", 0);
        setField(term291, term291.getClass(), "individualPrice", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finalAmount", argTypes, term291, args);
    }

};


