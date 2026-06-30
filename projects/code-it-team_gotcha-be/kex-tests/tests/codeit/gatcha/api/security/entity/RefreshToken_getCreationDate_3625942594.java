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

public class RefreshToken_getCreationDate_3625942594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1598;

    public RefreshToken_getCreationDate_3625942594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1599 = new Integer(-1347358701);
        Integer term1613 = new Integer(806595993);
        term1598 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken"));
        Object term1615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1620 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1598, term1598.getClass(), "id", term1599);
        setField(term1598, term1598.getClass(), "value", "VVNNlAePXF");
        setField(term1598, term1598.getClass(), "userId", term1613);
        setIntField(term1616, term1616.getClass(), "year", 2015);
        setShortField(term1616, term1616.getClass(), "month", (short) 4);
        setShortField(term1616, term1616.getClass(), "day", (short) 14);
        setField(term1615, term1615.getClass(), "date", term1616);
        setByteField(term1620, term1620.getClass(), "hour", (byte) 18);
        setByteField(term1620, term1620.getClass(), "minute", (byte) 24);
        setByteField(term1620, term1620.getClass(), "second", (byte) 32);
        setIntField(term1620, term1620.getClass(), "nano", 369233818);
        setField(term1615, term1615.getClass(), "time", term1620);
        setField(term1598, term1598.getClass(), "creationDate", term1615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreationDate", argTypes, term1598, args);
    }

};


