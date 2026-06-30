package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AdminCreationResponse_setFirstName_8498506577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23027;

    public AdminCreationResponse_setFirstName_8498506577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23137 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term23136 = ((Class) term23137).getDeclaredField((String) "USER");
        ((Field) term23136).setAccessible(true);
        Object enum83 = ((Field) term23136).get((Object) null);
        term23027 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term23027, term23027.getClass(), "id", "huVIXUWLtI");
        setField(term23027, term23027.getClass(), "firstName", "vhKzFyKPOT");
        setField(term23027, term23027.getClass(), "lastName", "nQhIgWXdRc");
        setField(term23027, term23027.getClass(), "email", "EusenEbIoF");
        setField(term23027, term23027.getClass(), "role", enum83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SScVQYSvWH";
        callMethod(klass, "setFirstName", argTypes, term23027, args);
    }

};


