package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class News_deserialize_46007358311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175762;

    public News_deserialize_46007358311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175762 = newInstance(Class.forName("core.News"));
        setField(term175762, term175762.getClass(), "present", null);
        setField(term175762, term175762.getClass(), "scrollPane", null);
        setField(term175762, term175762.getClass(), "refreshButton", null);
        setField(term175762, term175762.getClass(), "accessLabel", null);
        setField(term175762, term175762.getClass(), "accessResident", null);
        setBooleanField(term175762, term175762.getClass(), "isFirstView", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.News");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deserialize", argTypes, term175762, args);
    }

};


