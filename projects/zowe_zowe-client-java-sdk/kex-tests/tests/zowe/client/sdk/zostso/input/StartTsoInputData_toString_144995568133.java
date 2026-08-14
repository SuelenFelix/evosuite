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

public class StartTsoInputData_toString_144995568133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2648;

    public StartTsoInputData_toString_144995568133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2648 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term2648, term2648.getClass(), "account", null);
        setField(term2648, term2648.getClass(), "characterSet", null);
        setField(term2648, term2648.getClass(), "codePage", null);
        setField(term2648, term2648.getClass(), "columns", null);
        setField(term2648, term2648.getClass(), "logonProcedure", null);
        setField(term2648, term2648.getClass(), "regionSize", null);
        setField(term2648, term2648.getClass(), "rows", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2648, args);
    }

};


