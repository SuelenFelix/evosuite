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

public class RefreshToken_getValue_16336757832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1524;

    public RefreshToken_getValue_16336757832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1525 = new Integer(-2104981311);
        Integer term1539 = new Integer(-571169753);
        term1524 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken"));
        Object term1541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1546 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1524, term1524.getClass(), "id", term1525);
        setField(term1524, term1524.getClass(), "value", "hePqROaplw");
        setField(term1524, term1524.getClass(), "userId", term1539);
        setIntField(term1542, term1542.getClass(), "year", 2021);
        setShortField(term1542, term1542.getClass(), "month", (short) 1);
        setShortField(term1542, term1542.getClass(), "day", (short) 18);
        setField(term1541, term1541.getClass(), "date", term1542);
        setByteField(term1546, term1546.getClass(), "hour", (byte) 13);
        setByteField(term1546, term1546.getClass(), "minute", (byte) 38);
        setByteField(term1546, term1546.getClass(), "second", (byte) 26);
        setIntField(term1546, term1546.getClass(), "nano", 544608644);
        setField(term1541, term1541.getClass(), "time", term1546);
        setField(term1524, term1524.getClass(), "creationDate", term1541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term1524, args);
    }

};


