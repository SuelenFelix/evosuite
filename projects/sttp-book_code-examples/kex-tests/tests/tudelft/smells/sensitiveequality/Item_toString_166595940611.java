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

public class Item_toString_166595940611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public Item_toString_166595940611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        setField(term293, term293.getClass(), "name", null);
        setIntField(term293, term293.getClass(), "qty", 0);
        setField(term293, term293.getClass(), "individualPrice", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term293, args);
    }

};


