package es.joseluisgs.springdam.models;

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
import static es.joseluisgs.springdam.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;

public class Producto_init_1135911342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term15;
     Object term17;
     Object term31;

    public Producto_init_1135911342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term15 = new Double(0.13238746331190498);
        term17 = new Integer(568599855);
        term31 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32, term32.getClass(), "year", 2012);
        setShortField(term32, term32.getClass(), "month", (short) 8);
        setShortField(term32, term32.getClass(), "day", (short) 25);
        setField(term31, term31.getClass(), "date", term32);
        setByteField(term36, term36.getClass(), "hour", (byte) 5);
        setByteField(term36, term36.getClass(), "minute", (byte) 20);
        setByteField(term36, term36.getClass(), "second", (byte) 50);
        setIntField(term36, term36.getClass(), "nano", 345595912);
        setField(term31, term31.getClass(), "time", term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Double");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[6];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = term15;
        args[3] = term17;
        args[4] = "sjlJAEtRrb";
        args[5] = term31;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


