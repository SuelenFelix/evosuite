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

public class Connection_getInnovation_143140578519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2797;

    public Connection_getInnovation_143140578519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2797 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2797, term2797.getClass(), "in", null);
        setField(term2797, term2797.getClass(), "out", null);
        setFloatField(term2797, term2797.getClass(), "weight", 0.0F);
        setBooleanField(term2797, term2797.getClass(), "expressed", false);
        setIntField(term2797, term2797.getClass(), "innovation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInnovation", argTypes, term2797, args);
    }

};


