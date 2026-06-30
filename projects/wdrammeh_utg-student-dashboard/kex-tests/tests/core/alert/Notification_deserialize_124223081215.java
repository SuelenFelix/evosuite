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

public class Notification_deserialize_124223081215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714;

    public Notification_deserialize_124223081215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4714 = newInstance(Class.forName("core.alert.Notification"));
        setField(term4714, term4714.getClass(), "heading", null);
        setField(term4714, term4714.getClass(), "summary", null);
        setField(term4714, term4714.getClass(), "information", null);
        setBooleanField(term4714, term4714.getClass(), "isRead", false);
        setField(term4714, term4714.getClass(), "date", null);
        setField(term4714, term4714.getClass(), "layer", null);
        setField(term4714, term4714.getClass(), "innerLabel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.Notification");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deserialize", argTypes, term4714, args);
    }

};


