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

public class User_getLocation_13995840206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;

    public User_getLocation_13995840206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term743 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term693, term693.getClass(), "id", -2813493605142626659L);
        setField(term693, term693.getClass(), "email", "OWDIEULEFu");
        setField(term693, term693.getClass(), "firstName", "dWRymuLBtr");
        setField(term693, term693.getClass(), "lastName", "AijpHYOFuy");
        setField(term693, term693.getClass(), "password", "SbAoxhfrkn");
        setLongField(term743, term743.getClass(), "id", -8885298608300233488L);
        setField(term743, term743.getClass(), "place", "kuTXqwMtDB");
        setField(term743, term743.getClass(), "description", "Ghbwtircqb");
        setDoubleField(term743, term743.getClass(), "longitude", 0.8474802076607362);
        setDoubleField(term743, term743.getClass(), "latitude", 0.5183269973490326);
        setField(term693, term693.getClass(), "location", term743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term693, args);
    }

};


