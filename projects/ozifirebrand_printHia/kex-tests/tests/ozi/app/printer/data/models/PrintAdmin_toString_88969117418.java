package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PrintAdmin_toString_88969117418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23225;

    public PrintAdmin_toString_88969117418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23357 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term23356 = ((Class) term23357).getDeclaredField((String) "USER");
        ((Field) term23356).setAccessible(true);
        Object enum82 = ((Field) term23356).get((Object) null);
        term23225 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term23225, term23225.getClass(), "id", "IApvtmfhnq");
        setField(term23225, term23225.getClass(), "firstName", "VSaNnhMpRc");
        setField(term23225, term23225.getClass(), "lastName", "QNjNTLlUaV");
        setField(term23225, term23225.getClass(), "phoneNumber", "hIYsRyOZxk");
        setField(term23225, term23225.getClass(), "email", "RjNoEywJbC");
        setField(term23225, term23225.getClass(), "role", enum82);
        setField(term23225, term23225.getClass(), "password", "RTTvrwwhou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23225, args);
    }

};


