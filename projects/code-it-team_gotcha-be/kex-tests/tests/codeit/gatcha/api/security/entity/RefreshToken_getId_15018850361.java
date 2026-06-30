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

public class RefreshToken_getId_15018850361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1487;

    public RefreshToken_getId_15018850361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1488 = new Integer(-1870495012);
        Integer term1502 = new Integer(-1310015129);
        term1487 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken"));
        Object term1504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1509 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1487, term1487.getClass(), "id", term1488);
        setField(term1487, term1487.getClass(), "value", "IBpaxltauX");
        setField(term1487, term1487.getClass(), "userId", term1502);
        setIntField(term1505, term1505.getClass(), "year", 2012);
        setShortField(term1505, term1505.getClass(), "month", (short) 8);
        setShortField(term1505, term1505.getClass(), "day", (short) 25);
        setField(term1504, term1504.getClass(), "date", term1505);
        setByteField(term1509, term1509.getClass(), "hour", (byte) 5);
        setByteField(term1509, term1509.getClass(), "minute", (byte) 20);
        setByteField(term1509, term1509.getClass(), "second", (byte) 50);
        setIntField(term1509, term1509.getClass(), "nano", 345595912);
        setField(term1504, term1504.getClass(), "time", term1509);
        setField(term1487, term1487.getClass(), "creationDate", term1504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1487, args);
    }

};


