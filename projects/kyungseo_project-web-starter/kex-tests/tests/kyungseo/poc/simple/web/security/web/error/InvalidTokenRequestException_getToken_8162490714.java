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

public class InvalidTokenRequestException_getToken_8162490714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4964;

    public InvalidTokenRequestException_getToken_8162490714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4964 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.InvalidTokenRequestException"));
        setField(term4964, term4964.getClass(), "tokenType", null);
        setField(term4964, term4964.getClass(), "token", null);
        setField(term4964, term4964.getClass(), "message", null);
        setField(term4964, term4964.getClass(), "backtrace", null);
        setField(term4964, term4964.getClass(), "detailMessage", null);
        setField(term4964, term4964.getClass(), "cause", null);
        setField(term4964, term4964.getClass(), "stackTrace", null);
        setIntField(term4964, term4964.getClass(), "depth", 0);
        setField(term4964, term4964.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.InvalidTokenRequestException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term4964, args);
    }

};


