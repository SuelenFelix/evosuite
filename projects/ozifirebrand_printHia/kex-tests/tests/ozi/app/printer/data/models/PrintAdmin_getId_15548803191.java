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

public class PrintAdmin_getId_15548803191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17408;

    public PrintAdmin_getId_15548803191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17541 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term17540 = ((Class) term17541).getDeclaredField((String) "ADMIN");
        ((Field) term17540).setAccessible(true);
        Object enum64 = ((Field) term17540).get((Object) null);
        term17408 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term17408, term17408.getClass(), "id", "IoSfuKDFRe");
        setField(term17408, term17408.getClass(), "firstName", "AWYyZiNfsm");
        setField(term17408, term17408.getClass(), "lastName", "ITRRYiuDwH");
        setField(term17408, term17408.getClass(), "phoneNumber", "llRfwANcVF");
        setField(term17408, term17408.getClass(), "email", "sUEeHQTWkA");
        setField(term17408, term17408.getClass(), "role", enum64);
        setField(term17408, term17408.getClass(), "password", "BDIRCxAWLA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term17408, args);
    }

};


