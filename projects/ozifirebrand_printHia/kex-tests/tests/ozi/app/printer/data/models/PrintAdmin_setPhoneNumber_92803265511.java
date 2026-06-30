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

public class PrintAdmin_setPhoneNumber_92803265511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20702;

    public PrintAdmin_setPhoneNumber_92803265511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20847 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term20846 = ((Class) term20847).getDeclaredField((String) "ADMIN");
        ((Field) term20846).setAccessible(true);
        Object enum74 = ((Field) term20846).get((Object) null);
        term20702 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term20702, term20702.getClass(), "id", "MnovcqFhCl");
        setField(term20702, term20702.getClass(), "firstName", "qYtAeLzOhW");
        setField(term20702, term20702.getClass(), "lastName", "tJzmOfcUnY");
        setField(term20702, term20702.getClass(), "phoneNumber", "TKlccZUpjz");
        setField(term20702, term20702.getClass(), "email", "GGzwMoHZXC");
        setField(term20702, term20702.getClass(), "role", enum74);
        setField(term20702, term20702.getClass(), "password", "IpmgwHTgnG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tIpkeYIezR";
        callMethod(klass, "setPhoneNumber", argTypes, term20702, args);
    }

};


