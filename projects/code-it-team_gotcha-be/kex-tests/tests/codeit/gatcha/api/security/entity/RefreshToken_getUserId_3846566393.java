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

public class RefreshToken_getUserId_3846566393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1561;

    public RefreshToken_getUserId_3846566393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1562 = new Integer(318591690);
        Integer term1576 = new Integer(-165587447);
        term1561 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken"));
        Object term1578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1583 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1561, term1561.getClass(), "id", term1562);
        setField(term1561, term1561.getClass(), "value", "PJcSNDruWd");
        setField(term1561, term1561.getClass(), "userId", term1576);
        setIntField(term1579, term1579.getClass(), "year", 2015);
        setShortField(term1579, term1579.getClass(), "month", (short) 9);
        setShortField(term1579, term1579.getClass(), "day", (short) 19);
        setField(term1578, term1578.getClass(), "date", term1579);
        setByteField(term1583, term1583.getClass(), "hour", (byte) 9);
        setByteField(term1583, term1583.getClass(), "minute", (byte) 4);
        setByteField(term1583, term1583.getClass(), "second", (byte) 10);
        setIntField(term1583, term1583.getClass(), "nano", 401765865);
        setField(term1578, term1578.getClass(), "time", term1583);
        setField(term1561, term1561.getClass(), "creationDate", term1578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term1561, args);
    }

};


