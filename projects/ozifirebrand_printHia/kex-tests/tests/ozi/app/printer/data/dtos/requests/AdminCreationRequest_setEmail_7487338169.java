package ozi.app.printer.data.dtos.requests;

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
import static ozi.app.printer.data.dtos.requests.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AdminCreationRequest_setEmail_7487338169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2837;

    public AdminCreationRequest_setEmail_7487338169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2837 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest"));
        setField(term2837, term2837.getClass(), "firstName", "hCWPJQKpdc");
        setField(term2837, term2837.getClass(), "lastName", "WzMEhMXkKx");
        setField(term2837, term2837.getClass(), "phoneNumber", "XOiDvlDhdc");
        setField(term2837, term2837.getClass(), "email", "AdxvLJhNLe");
        setField(term2837, term2837.getClass(), "password", "lHfTrWKMPk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "setEmail", argTypes, term2837, args);
    }

};


