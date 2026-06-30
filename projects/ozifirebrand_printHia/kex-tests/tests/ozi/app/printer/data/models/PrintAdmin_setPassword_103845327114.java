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

public class PrintAdmin_setPassword_103845327114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21905;

    public PrintAdmin_setPassword_103845327114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22050 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term22049 = ((Class) term22050).getDeclaredField((String) "ADMIN");
        ((Field) term22049).setAccessible(true);
        Object enum78 = ((Field) term22049).get((Object) null);
        term21905 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term21905, term21905.getClass(), "id", "VkPSXewZfB");
        setField(term21905, term21905.getClass(), "firstName", "ubodzJoMGW");
        setField(term21905, term21905.getClass(), "lastName", "weddIktxOA");
        setField(term21905, term21905.getClass(), "phoneNumber", "uSlMeISsDD");
        setField(term21905, term21905.getClass(), "email", "WdCiTDUKqn");
        setField(term21905, term21905.getClass(), "role", enum78);
        setField(term21905, term21905.getClass(), "password", "PSizQDoxxe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mKaHyMybrK";
        callMethod(klass, "setPassword", argTypes, term21905, args);
    }

};


