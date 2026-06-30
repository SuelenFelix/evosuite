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

public class User_setName_21468159406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372;

    public User_setName_21468159406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term373 = new Long(4872422362414183754L);
        term372 = newInstance(Class.forName("br.com.training.model.User"));
        Object term411 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term372, term372.getClass(), "id", term373);
        setField(term372, term372.getClass(), "name", "aJlieCFVtF");
        setField(term372, term372.getClass(), "email", "ZiaGIbnzTs");
        setField(term372, term372.getClass(), "cpf", "tbcdzjIfER");
        setIntField(term411, term411.getClass(), "year", 2015);
        setShortField(term411, term411.getClass(), "month", (short) 4);
        setShortField(term411, term411.getClass(), "day", (short) 14);
        setField(term372, term372.getClass(), "birthDate", term411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setName", argTypes, term372, args);
    }

};


