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

public class UserLogoutException_getUser_2071750732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16997;

    public UserLogoutException_getUser_2071750732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16997 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.error.UserLogoutException"));
        setField(term16997, term16997.getClass(), "user", null);
        setField(term16997, term16997.getClass(), "message", null);
        setField(term16997, term16997.getClass(), "backtrace", null);
        setField(term16997, term16997.getClass(), "detailMessage", null);
        setField(term16997, term16997.getClass(), "cause", null);
        setField(term16997, term16997.getClass(), "stackTrace", null);
        setIntField(term16997, term16997.getClass(), "depth", 0);
        setField(term16997, term16997.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.error.UserLogoutException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term16997, args);
    }

};


