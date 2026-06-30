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

public class AdminCreationResponse_setLastName_18788699418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23325;

    public AdminCreationResponse_setLastName_18788699418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23435 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term23434 = ((Class) term23435).getDeclaredField((String) "USER");
        ((Field) term23434).setAccessible(true);
        Object enum84 = ((Field) term23434).get((Object) null);
        term23325 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term23325, term23325.getClass(), "id", "MnovcqFhCl");
        setField(term23325, term23325.getClass(), "firstName", "qYtAeLzOhW");
        setField(term23325, term23325.getClass(), "lastName", "tJzmOfcUnY");
        setField(term23325, term23325.getClass(), "email", "TKlccZUpjz");
        setField(term23325, term23325.getClass(), "role", enum84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GGzwMoHZXC";
        callMethod(klass, "setLastName", argTypes, term23325, args);
    }

};


