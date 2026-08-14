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

public class DsnCopyInputData_getToVolser_81919174312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18618;

    public DsnCopyInputData_getToVolser_81919174312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18618 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData"));
        setField(term18618, term18618.getClass(), "fromVolser", null);
        setField(term18618, term18618.getClass(), "fromDataSet", null);
        setField(term18618, term18618.getClass(), "toVolser", null);
        setField(term18618, term18618.getClass(), "toDataSet", null);
        setBooleanField(term18618, term18618.getClass(), "replace", false);
        setBooleanField(term18618, term18618.getClass(), "copyAllMembers", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToVolser", argTypes, term18618, args);
    }

};


