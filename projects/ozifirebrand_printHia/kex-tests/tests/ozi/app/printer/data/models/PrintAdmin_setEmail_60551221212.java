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

public class PrintAdmin_setEmail_60551221212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21048;

    public PrintAdmin_setEmail_60551221212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21193 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term21192 = ((Class) term21193).getDeclaredField((String) "ADMIN");
        ((Field) term21192).setAccessible(true);
        Object enum75 = ((Field) term21192).get((Object) null);
        term21048 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term21048, term21048.getClass(), "id", "YkZtEtthvz");
        setField(term21048, term21048.getClass(), "firstName", "dwlZSxlXOo");
        setField(term21048, term21048.getClass(), "lastName", "lKrEAkypza");
        setField(term21048, term21048.getClass(), "phoneNumber", "KtuuNAqGCQ");
        setField(term21048, term21048.getClass(), "email", "OGQsfjmReM");
        setField(term21048, term21048.getClass(), "role", enum75);
        setField(term21048, term21048.getClass(), "password", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JisaWUxcNb";
        callMethod(klass, "setEmail", argTypes, term21048, args);
    }

};


