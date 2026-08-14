package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_setFirstName_12006060689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1131;

    public User_setFirstName_12006060689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1131 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1181 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1131, term1131.getClass(), "id", 5127676408959197577L);
        setField(term1131, term1131.getClass(), "email", "jDtqGUpnZN");
        setField(term1131, term1131.getClass(), "firstName", "nGKItKLYNC");
        setField(term1131, term1131.getClass(), "lastName", "UiUYnPrcCi");
        setField(term1131, term1131.getClass(), "password", "UoYtihxVaS");
        setLongField(term1181, term1181.getClass(), "id", -6573104506744284592L);
        setField(term1181, term1181.getClass(), "place", "JDswTTCZHV");
        setField(term1181, term1181.getClass(), "description", "onpbIeEKoi");
        setDoubleField(term1181, term1181.getClass(), "longitude", 0.9828442029246764);
        setDoubleField(term1181, term1181.getClass(), "latitude", 0.2779719046761513);
        setField(term1131, term1131.getClass(), "location", term1181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "setFirstName", argTypes, term1131, args);
    }

};


