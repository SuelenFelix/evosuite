package kyungseo.poc.simple.web.appcore.exception;

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
import static kyungseo.poc.simple.web.appcore.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BizException_getErrors_152426000810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8410;

    public BizException_getErrors_152426000810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8410 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.exception.BizException"));
        setField(term8410, term8410.getClass(), "errors", null);
        setField(term8410, term8410.getClass(), "backtrace", null);
        setField(term8410, term8410.getClass(), "detailMessage", null);
        setField(term8410, term8410.getClass(), "cause", null);
        setField(term8410, term8410.getClass(), "stackTrace", null);
        setIntField(term8410, term8410.getClass(), "depth", 0);
        setField(term8410, term8410.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.exception.BizException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrors", argTypes, term8410, args);
    }

};


