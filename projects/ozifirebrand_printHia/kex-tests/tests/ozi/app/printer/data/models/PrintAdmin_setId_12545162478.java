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

public class PrintAdmin_setId_12545162478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19664;

    public PrintAdmin_setId_12545162478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19809 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term19808 = ((Class) term19809).getDeclaredField((String) "ADMIN");
        ((Field) term19808).setAccessible(true);
        Object enum71 = ((Field) term19808).get((Object) null);
        term19664 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term19664, term19664.getClass(), "id", "QtrylgCLiF");
        setField(term19664, term19664.getClass(), "firstName", "orEuhCStGM");
        setField(term19664, term19664.getClass(), "lastName", "HhEaSXWvrY");
        setField(term19664, term19664.getClass(), "phoneNumber", "CVRGEomOth");
        setField(term19664, term19664.getClass(), "email", "vSeruUyNWX");
        setField(term19664, term19664.getClass(), "role", enum71);
        setField(term19664, term19664.getClass(), "password", "UkKvaeJfEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WPxXsahPRq";
        callMethod(klass, "setId", argTypes, term19664, args);
    }

};


