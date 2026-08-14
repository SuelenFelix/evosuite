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

public class User_canEqual_28558004313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2911;
     Object term2989;

    public User_canEqual_28558004313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2911 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2961 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2911, term2911.getClass(), "id", -2170847986967241072L);
        setField(term2911, term2911.getClass(), "email", "WzMEhMXkKx");
        setField(term2911, term2911.getClass(), "firstName", "XOiDvlDhdc");
        setField(term2911, term2911.getClass(), "lastName", "AdxvLJhNLe");
        setField(term2911, term2911.getClass(), "password", "lHfTrWKMPk");
        setLongField(term2961, term2961.getClass(), "id", 4044358158040652353L);
        setField(term2961, term2961.getClass(), "place", "JDaAnsVTGV");
        setField(term2961, term2961.getClass(), "description", "mLUZFTfjle");
        setDoubleField(term2961, term2961.getClass(), "longitude", 0.13246999699526574);
        setDoubleField(term2961, term2961.getClass(), "latitude", 0.9126850255993704);
        setField(term2911, term2911.getClass(), "location", term2961);
        term2989 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2989;
        callMethod(klass, "canEqual", argTypes, term2911, args);
    }

};


