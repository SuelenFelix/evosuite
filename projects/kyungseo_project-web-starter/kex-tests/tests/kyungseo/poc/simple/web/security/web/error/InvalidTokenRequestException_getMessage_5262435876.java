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

public class InvalidTokenRequestException_getMessage_5262435876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8263;

    public InvalidTokenRequestException_getMessage_5262435876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8263 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.InvalidTokenRequestException"));
        setField(term8263, term8263.getClass(), "tokenType", null);
        setField(term8263, term8263.getClass(), "token", null);
        setField(term8263, term8263.getClass(), "message", null);
        setField(term8263, term8263.getClass(), "backtrace", null);
        setField(term8263, term8263.getClass(), "detailMessage", null);
        setField(term8263, term8263.getClass(), "cause", null);
        setField(term8263, term8263.getClass(), "stackTrace", null);
        setIntField(term8263, term8263.getClass(), "depth", 0);
        setField(term8263, term8263.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.InvalidTokenRequestException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term8263, args);
    }

};


