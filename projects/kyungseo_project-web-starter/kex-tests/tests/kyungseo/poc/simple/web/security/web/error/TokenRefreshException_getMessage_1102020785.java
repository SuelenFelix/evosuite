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

public class TokenRefreshException_getMessage_1102020785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13887;

    public TokenRefreshException_getMessage_1102020785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13887 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.TokenRefreshException"));
        setField(term13887, term13887.getClass(), "token", null);
        setField(term13887, term13887.getClass(), "message", null);
        setField(term13887, term13887.getClass(), "backtrace", null);
        setField(term13887, term13887.getClass(), "detailMessage", null);
        setField(term13887, term13887.getClass(), "cause", null);
        setField(term13887, term13887.getClass(), "stackTrace", null);
        setIntField(term13887, term13887.getClass(), "depth", 0);
        setField(term13887, term13887.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.TokenRefreshException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term13887, args);
    }

};


