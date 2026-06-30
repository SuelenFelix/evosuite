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

public class RefreshToken_RefreshTokenBuilder_build_12189709245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1860;

    public RefreshToken_RefreshTokenBuilder_build_12189709245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1861 = new Integer(-1618206977);
        Integer term1875 = new Integer(-1747406163);
        term1860 = newInstance(Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder"));
        Object term1877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1882 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1860, term1860.getClass(), "id", term1861);
        setField(term1860, term1860.getClass(), "value", "TSyCeEZPaT");
        setField(term1860, term1860.getClass(), "userId", term1875);
        setIntField(term1878, term1878.getClass(), "year", 2019);
        setShortField(term1878, term1878.getClass(), "month", (short) 2);
        setShortField(term1878, term1878.getClass(), "day", (short) 21);
        setField(term1877, term1877.getClass(), "date", term1878);
        setByteField(term1882, term1882.getClass(), "hour", (byte) 5);
        setByteField(term1882, term1882.getClass(), "minute", (byte) 41);
        setByteField(term1882, term1882.getClass(), "second", (byte) 11);
        setIntField(term1882, term1882.getClass(), "nano", 859829782);
        setField(term1877, term1877.getClass(), "time", term1882);
        setField(term1860, term1860.getClass(), "creationDate", term1877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1860, args);
    }

};


