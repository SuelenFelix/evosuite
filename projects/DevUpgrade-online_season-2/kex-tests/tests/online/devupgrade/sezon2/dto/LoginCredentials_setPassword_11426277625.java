package online.devupgrade.sezon2.dto;

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
import static online.devupgrade.sezon2.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class LoginCredentials_setPassword_11426277625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565;

    public LoginCredentials_setPassword_11426277625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term590 = new ArrayList();
        ((ArrayList) term590).add("TEParAifyi");
        ((ArrayList) term590).add("OWDIEULEFu");
        ((ArrayList) term590).add("dWRymuLBtr");
        ((ArrayList) term590).add("AijpHYOFuy");
        ((ArrayList) term590).add("SbAoxhfrkn");
        term565 = newInstance(Class.forName("online.devupgrade.sezon2.dto.LoginCredentials"));
        setField(term565, term565.getClass(), "login", "OclPbYPkcH");
        setField(term565, term565.getClass(), "password", "IoAlmYsBwc");
        setField(term565, term565.getClass(), "roles", term590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.dto.LoginCredentials");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "setPassword", argTypes, term565, args);
    }

};


