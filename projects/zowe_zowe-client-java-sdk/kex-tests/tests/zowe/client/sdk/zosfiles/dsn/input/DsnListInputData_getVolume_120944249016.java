package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DsnListInputData_getVolume_120944249016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25908;

    public DsnListInputData_getVolume_120944249016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25908 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term25908, term25908.getClass(), "volume", null);
        setField(term25908, term25908.getClass(), "attribute", null);
        setField(term25908, term25908.getClass(), "maxLength", null);
        setField(term25908, term25908.getClass(), "start", null);
        setField(term25908, term25908.getClass(), "recall", null);
        setField(term25908, term25908.getClass(), "pattern", null);
        setField(term25908, term25908.getClass(), "responseTimeout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term25908, args);
    }

};


