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

public class News_NewsSavior_equals_1814898991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123572;
     Object term123621;

    public News_NewsSavior_equals_1814898991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123572 = newInstance(Class.forName("core.News$NewsSavior"));
        setField(term123572, term123572.getClass(), "heading", "bIrtpkYJWT");
        setField(term123572, term123572.getClass(), "body", "VuLLXpvPpZ");
        setField(term123572, term123572.getClass(), "link", "UEdzEKEEEV");
        setField(term123572, term123572.getClass(), "content", "BcENaQFYSd");
        term123621 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.News$NewsSavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123621;
        callMethod(klass, "equals", argTypes, term123572, args);
    }

};


