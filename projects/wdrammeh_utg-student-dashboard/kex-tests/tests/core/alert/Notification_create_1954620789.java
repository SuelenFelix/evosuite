package core.alert;

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
import static core.alert.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Notification_create_1954620789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4700;

    public Notification_create_1954620789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4700 = newInstance(Class.forName("core.alert.Notification"));
        setField(term4700, term4700.getClass(), "heading", null);
        setField(term4700, term4700.getClass(), "summary", null);
        setField(term4700, term4700.getClass(), "information", null);
        setBooleanField(term4700, term4700.getClass(), "isRead", false);
        setField(term4700, term4700.getClass(), "date", null);
        setField(term4700, term4700.getClass(), "layer", null);
        setField(term4700, term4700.getClass(), "innerLabel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.Notification");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "create", argTypes, term4700, args);
    }

};


