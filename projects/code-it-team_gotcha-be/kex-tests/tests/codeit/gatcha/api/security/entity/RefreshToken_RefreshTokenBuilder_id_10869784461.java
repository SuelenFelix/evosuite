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

public class RefreshToken_RefreshTokenBuilder_id_10869784461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1676;
     Object term1703;

    public RefreshToken_RefreshTokenBuilder_id_10869784461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1677 = new Integer(1694224101);
        Integer term1691 = new Integer(937859191);
        term1676 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder"));
        Object term1693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1698 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1676, term1676.getClass(), "id", term1677);
        setField(term1676, term1676.getClass(), "value", "TXyHhqeCjR");
        setField(term1676, term1676.getClass(), "userId", term1691);
        setIntField(term1694, term1694.getClass(), "year", 2026);
        setShortField(term1694, term1694.getClass(), "month", (short) 12);
        setShortField(term1694, term1694.getClass(), "day", (short) 14);
        setField(term1693, term1693.getClass(), "date", term1694);
        setByteField(term1698, term1698.getClass(), "hour", (byte) 16);
        setByteField(term1698, term1698.getClass(), "minute", (byte) 34);
        setByteField(term1698, term1698.getClass(), "second", (byte) 9);
        setIntField(term1698, term1698.getClass(), "nano", 518326996);
        setField(term1693, term1693.getClass(), "time", term1698);
        setField(term1676, term1676.getClass(), "creationDate", term1693);
        term1703 = new Integer(-916584829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1703;
        callMethod(klass, "id", argTypes, term1676, args);
    }

};


