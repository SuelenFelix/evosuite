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
import java.lang.Boolean;

public class Notification_setRead_21504028911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4704;
     Object term4706;

    public Notification_setRead_21504028911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4704 = newInstance(Class.forName("core.alert.Notification"));
        setField(term4704, term4704.getClass(), "heading", null);
        setField(term4704, term4704.getClass(), "summary", null);
        setField(term4704, term4704.getClass(), "information", null);
        setBooleanField(term4704, term4704.getClass(), "isRead", false);
        setField(term4704, term4704.getClass(), "date", null);
        setField(term4704, term4704.getClass(), "layer", null);
        setField(term4704, term4704.getClass(), "innerLabel", null);
        term4706 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.Notification");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4706;
        callMethod(klass, "setRead", argTypes, term4704, args);
    }

};


