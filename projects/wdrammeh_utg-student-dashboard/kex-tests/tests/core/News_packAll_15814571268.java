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
import java.lang.Boolean;

public class News_packAll_15814571268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175754;
     Object term175756;

    public News_packAll_15814571268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175754 = newInstance(Class.forName("core.News"));
        setField(term175754, term175754.getClass(), "present", null);
        setField(term175754, term175754.getClass(), "scrollPane", null);
        setField(term175754, term175754.getClass(), "refreshButton", null);
        setField(term175754, term175754.getClass(), "accessLabel", null);
        setField(term175754, term175754.getClass(), "accessResident", null);
        setBooleanField(term175754, term175754.getClass(), "isFirstView", false);
        term175756 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.News");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term175756;
        callMethod(klass, "packAll", argTypes, term175754, args);
    }

};


