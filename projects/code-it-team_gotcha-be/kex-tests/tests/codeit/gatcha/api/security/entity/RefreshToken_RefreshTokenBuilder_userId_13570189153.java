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

public class RefreshToken_RefreshTokenBuilder_userId_13570189153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1774;
     Object term1801;

    public RefreshToken_RefreshTokenBuilder_userId_13570189153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1775 = new Integer(880977281);
        Integer term1789 = new Integer(371943306);
        term1774 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder"));
        Object term1791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1796 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1774, term1774.getClass(), "id", term1775);
        setField(term1774, term1774.getClass(), "value", "GPSEWEDSTo");
        setField(term1774, term1774.getClass(), "userId", term1789);
        setIntField(term1792, term1792.getClass(), "year", 2024);
        setShortField(term1792, term1792.getClass(), "month", (short) 1);
        setShortField(term1792, term1792.getClass(), "day", (short) 24);
        setField(term1791, term1791.getClass(), "date", term1792);
        setByteField(term1796, term1796.getClass(), "hour", (byte) 20);
        setByteField(term1796, term1796.getClass(), "minute", (byte) 28);
        setByteField(term1796, term1796.getClass(), "second", (byte) 39);
        setIntField(term1796, term1796.getClass(), "nano", 952728177);
        setField(term1791, term1791.getClass(), "time", term1796);
        setField(term1774, term1774.getClass(), "creationDate", term1791);
        term1801 = new Integer(982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1801;
        callMethod(klass, "userId", argTypes, term1774, args);
    }

};


