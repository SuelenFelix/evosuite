package br.com.training.model;

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
import static br.com.training.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setCpf_118713829010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708;

    public User_setCpf_118713829010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term709 = new Long(-2813493605142626659L);
        term708 = newInstance(Class.forName("br.com.training.model.User"));
        Object term747 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term708, term708.getClass(), "id", term709);
        setField(term708, term708.getClass(), "name", "TEParAifyi");
        setField(term708, term708.getClass(), "email", "OWDIEULEFu");
        setField(term708, term708.getClass(), "cpf", "dWRymuLBtr");
        setIntField(term747, term747.getClass(), "year", 2026);
        setShortField(term747, term747.getClass(), "month", (short) 12);
        setShortField(term747, term747.getClass(), "day", (short) 13);
        setField(term708, term708.getClass(), "birthDate", term747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AijpHYOFuy";
        callMethod(klass, "setCpf", argTypes, term708, args);
    }

};


