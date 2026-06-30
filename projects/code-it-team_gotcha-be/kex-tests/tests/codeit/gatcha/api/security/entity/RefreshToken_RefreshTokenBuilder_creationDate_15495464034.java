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

public class RefreshToken_RefreshTokenBuilder_creationDate_15495464034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;
     Object term1840;

    public RefreshToken_RefreshTokenBuilder_creationDate_15495464034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1814 = new Integer(-159494544);
        Integer term1828 = new Integer(-75206835);
        term1813 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder"));
        Object term1830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1835 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1813, term1813.getClass(), "id", term1814);
        setField(term1813, term1813.getClass(), "value", "RCOqfVsRHt");
        setField(term1813, term1813.getClass(), "userId", term1828);
        setIntField(term1831, term1831.getClass(), "year", 2029);
        setShortField(term1831, term1831.getClass(), "month", (short) 8);
        setShortField(term1831, term1831.getClass(), "day", (short) 29);
        setField(term1830, term1830.getClass(), "date", term1831);
        setByteField(term1835, term1835.getClass(), "hour", (byte) 15);
        setByteField(term1835, term1835.getClass(), "minute", (byte) 50);
        setByteField(term1835, term1835.getClass(), "second", (byte) 1);
        setIntField(term1835, term1835.getClass(), "nano", 277971904);
        setField(term1830, term1830.getClass(), "time", term1835);
        setField(term1813, term1813.getClass(), "creationDate", term1830);
        term1840 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1841 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1845 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1841, term1841.getClass(), "year", 2022);
        setShortField(term1841, term1841.getClass(), "month", (short) 11);
        setShortField(term1841, term1841.getClass(), "day", (short) 16);
        setField(term1840, term1840.getClass(), "date", term1841);
        setByteField(term1845, term1845.getClass(), "hour", (byte) 15);
        setByteField(term1845, term1845.getClass(), "minute", (byte) 54);
        setByteField(term1845, term1845.getClass(), "second", (byte) 2);
        setIntField(term1845, term1845.getClass(), "nano", 733274103);
        setField(term1840, term1840.getClass(), "time", term1845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1840;
        callMethod(klass, "creationDate", argTypes, term1813, args);
    }

};


