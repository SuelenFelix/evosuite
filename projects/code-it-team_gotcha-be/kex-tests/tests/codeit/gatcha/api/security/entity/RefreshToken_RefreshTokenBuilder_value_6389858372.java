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

public class RefreshToken_RefreshTokenBuilder_value_6389858372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1715;

    public RefreshToken_RefreshTokenBuilder_value_6389858372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1716 = new Integer(-2131181468);
        Integer term1730 = new Integer(282916351);
        term1715 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder"));
        Object term1732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1737 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1715, term1715.getClass(), "id", term1716);
        setField(term1715, term1715.getClass(), "value", "lZIgPZPgTu");
        setField(term1715, term1715.getClass(), "userId", term1730);
        setIntField(term1733, term1733.getClass(), "year", 2025);
        setShortField(term1733, term1733.getClass(), "month", (short) 4);
        setShortField(term1733, term1733.getClass(), "day", (short) 24);
        setField(term1732, term1732.getClass(), "date", term1733);
        setByteField(term1737, term1737.getClass(), "hour", (byte) 18);
        setByteField(term1737, term1737.getClass(), "minute", (byte) 11);
        setByteField(term1737, term1737.getClass(), "second", (byte) 40);
        setIntField(term1737, term1737.getClass(), "nano", 137454929);
        setField(term1732, term1732.getClass(), "time", term1737);
        setField(term1715, term1715.getClass(), "creationDate", term1732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iuCxnHGMoW";
        callMethod(klass, "value", argTypes, term1715, args);
    }

};


