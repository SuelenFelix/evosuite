package kyungseo.poc.simple.web.security.web.error;

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
import static kyungseo.poc.simple.web.security.web.error.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TokenRefreshException_getToken_14526947362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11431;

    public TokenRefreshException_getToken_14526947362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11431 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.TokenRefreshException"));
        setField(term11431, term11431.getClass(), "token", null);
        setField(term11431, term11431.getClass(), "message", null);
        setField(term11431, term11431.getClass(), "backtrace", null);
        setField(term11431, term11431.getClass(), "detailMessage", null);
        setField(term11431, term11431.getClass(), "cause", null);
        setField(term11431, term11431.getClass(), "stackTrace", null);
        setIntField(term11431, term11431.getClass(), "depth", 0);
        setField(term11431, term11431.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.TokenRefreshException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term11431, args);
    }

};


