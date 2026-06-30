package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class RefreshToken_init_14064702116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1635;
     Object term1649;
     Object term1651;

    public RefreshToken_init_14064702116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1635 = new Integer(548228925);
        term1649 = new Integer(-749861210);
        term1651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1656 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1652, term1652.getClass(), "year", 2022);
        setShortField(term1652, term1652.getClass(), "month", (short) 2);
        setShortField(term1652, term1652.getClass(), "day", (short) 26);
        setField(term1651, term1651.getClass(), "date", term1652);
        setByteField(term1656, term1656.getClass(), "hour", (byte) 11);
        setByteField(term1656, term1656.getClass(), "minute", (byte) 42);
        setByteField(term1656, term1656.getClass(), "second", (byte) 15);
        setIntField(term1656, term1656.getClass(), "nano", 377731937);
        setField(term1651, term1651.getClass(), "time", term1656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[4];
        args[0] = term1635;
        args[1] = "jnwVnmKAFv";
        args[2] = term1649;
        args[3] = term1651;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


