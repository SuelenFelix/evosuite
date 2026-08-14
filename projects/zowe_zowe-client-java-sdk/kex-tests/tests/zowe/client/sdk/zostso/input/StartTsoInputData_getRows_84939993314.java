package zowe.client.sdk.zostso.input;

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
import static zowe.client.sdk.zostso.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartTsoInputData_getRows_84939993314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2147;

    public StartTsoInputData_getRows_84939993314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2147 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term2147, term2147.getClass(), "account", "JiVRgTZvKc");
        setField(term2147, term2147.getClass(), "characterSet", "XPKmummaqg");
        setField(term2147, term2147.getClass(), "codePage", "BKLfkLiZTH");
        setField(term2147, term2147.getClass(), "columns", "SPpkrGcPRr");
        setField(term2147, term2147.getClass(), "logonProcedure", "sEccwbJKYE");
        setField(term2147, term2147.getClass(), "regionSize", "AWRooQKkdW");
        setField(term2147, term2147.getClass(), "rows", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRows", argTypes, term2147, args);
    }

};


