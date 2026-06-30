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

public class Notification_serialize_211915391514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4712;

    public Notification_serialize_211915391514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4712 = newInstance(Class.forName("core.alert.Notification"));
        setField(term4712, term4712.getClass(), "heading", null);
        setField(term4712, term4712.getClass(), "summary", null);
        setField(term4712, term4712.getClass(), "information", null);
        setBooleanField(term4712, term4712.getClass(), "isRead", false);
        setField(term4712, term4712.getClass(), "date", null);
        setField(term4712, term4712.getClass(), "layer", null);
        setField(term4712, term4712.getClass(), "innerLabel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.Notification");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "serialize", argTypes, term4712, args);
    }

};


