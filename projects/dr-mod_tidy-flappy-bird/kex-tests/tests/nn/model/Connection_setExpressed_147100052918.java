package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Connection_setExpressed_147100052918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2791;
     Object term2795;

    public Connection_setExpressed_147100052918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2791 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2791, term2791.getClass(), "in", null);
        setField(term2791, term2791.getClass(), "out", null);
        setFloatField(term2791, term2791.getClass(), "weight", 0.0F);
        setBooleanField(term2791, term2791.getClass(), "expressed", false);
        setIntField(term2791, term2791.getClass(), "innovation", 0);
        term2795 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2795;
        callMethod(klass, "setExpressed", argTypes, term2791, args);
    }

};


