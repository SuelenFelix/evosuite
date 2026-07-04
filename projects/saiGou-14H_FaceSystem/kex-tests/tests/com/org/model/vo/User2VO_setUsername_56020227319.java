package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class User2VO_setUsername_56020227319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22545;

    public User2VO_setUsername_56020227319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22546 = new Integer(-781832877);
        Integer term22620 = new Integer(797203987);
        Class<? extends Object> term22900 = Class.forName((String) "java.io.File$PathStatus");
        Field term22899 = ((Class) term22900).getDeclaredField((String) "INVALID");
        ((Field) term22899).setAccessible(true);
        Object enum18 = ((Field) term22899).get((Object) null);
        ArrayList term22707 = new ArrayList();
        ((ArrayList) term22707).add("dcGBEVfYLI");
        ((ArrayList) term22707).add("AbYQkbUCWK");
        ((ArrayList) term22707).add("PjENVjWdrp");
        ((ArrayList) term22707).add("nNjXJbBqnD");
        ((ArrayList) term22707).add("IPIWZFytSS");
        ((ArrayList) term22707).add("BOKRfsJbBj");
        ((ArrayList) term22707).add("AbIDnsFOzO");
        ((ArrayList) term22707).add("ekTUXbqVGx");
        term22545 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term22634 = newInstance(Class.forName("java.io.File"));
        setField(term22545, term22545.getClass(), "id", term22546);
        setField(term22545, term22545.getClass(), "email", "VNHIbCXqhH");
        setField(term22545, term22545.getClass(), "password", "csnhUIxUaP");
        setField(term22545, term22545.getClass(), "username", "fmWYICGnwt");
        setField(term22545, term22545.getClass(), "power", "FlZbOFNISk");
        setField(term22545, term22545.getClass(), "nickname", "zDtePZrZQH");
        setField(term22545, term22545.getClass(), "sex", "YPVZjrbvVl");
        setField(term22545, term22545.getClass(), "age", term22620);
        setField(term22545, term22545.getClass(), "phone", "TWsXTUTREq");
        setField(term22634, term22634.getClass(), "path", "tVsPWASlsh");
        setField(term22634, term22634.getClass(), "status", enum18);
        setIntField(term22634, term22634.getClass(), "prefixLength", 1622346318);
        setField(term22634, term22634.getClass(), "filePath", null);
        setField(term22545, term22545.getClass(), "facePic", term22634);
        setField(term22545, term22545.getClass(), "faceUrl", "PjZoebHrvq");
        setField(term22545, term22545.getClass(), "headUrl", "VwpicfUdWr");
        setField(term22545, term22545.getClass(), "introduce", "UDKBkeWilS");
        setField(term22545, term22545.getClass(), "ip", "bNeNAYRdqb");
        setField(term22545, term22545.getClass(), "partnames", term22707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ECPFDcnHIT";
        callMethod(klass, "setUsername", argTypes, term22545, args);
    }

};


