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

public class RefreshToken_RefreshTokenBuilder_toString_10392707696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1897;

    public RefreshToken_RefreshTokenBuilder_toString_10392707696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1898 = new Integer(388157121);
        Integer term1912 = new Integer(1684998508);
        term1897 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder"));
        Object term1914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1897, term1897.getClass(), "id", term1898);
        setField(term1897, term1897.getClass(), "value", "JeZFtaqkzW");
        setField(term1897, term1897.getClass(), "userId", term1912);
        setIntField(term1915, term1915.getClass(), "year", 2018);
        setShortField(term1915, term1915.getClass(), "month", (short) 9);
        setShortField(term1915, term1915.getClass(), "day", (short) 28);
        setField(term1914, term1914.getClass(), "date", term1915);
        setByteField(term1919, term1919.getClass(), "hour", (byte) 3);
        setByteField(term1919, term1919.getClass(), "minute", (byte) 37);
        setByteField(term1919, term1919.getClass(), "second", (byte) 46);
        setIntField(term1919, term1919.getClass(), "nano", 763326845);
        setField(term1914, term1914.getClass(), "time", term1919);
        setField(term1897, term1897.getClass(), "creationDate", term1914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1897, args);
    }

};


