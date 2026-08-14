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
import java.lang.String;
import java.lang.Object;

public class DsnListInputData_Builder_build_6004636908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21858;

    public DsnListInputData_Builder_build_6004636908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21952 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term21951 = ((Class) term21952).getDeclaredField((String) "MEMBER");
        ((Field) term21951).setAccessible(true);
        Object enum19 = ((Field) term21951).get((Object) null);
        term21858 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term21858, term21858.getClass(), "volume", "bIqaKgXgPm");
        setField(term21858, term21858.getClass(), "attribute", enum19);
        setField(term21858, term21858.getClass(), "maxLength", "uOJFOUcNvv");
        setField(term21858, term21858.getClass(), "start", "tkmmGweDwJ");
        setField(term21858, term21858.getClass(), "recall", "pMfTuAFXxg");
        setField(term21858, term21858.getClass(), "pattern", "XCZmhkblRc");
        setField(term21858, term21858.getClass(), "responseTimeout", "gFUWMydGCU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term21858, args);
    }

};


