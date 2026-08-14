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

public class DsnListInputData_Builder_volume_14264758941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18630;

    public DsnListInputData_Builder_volume_14264758941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18759 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term18758 = ((Class) term18759).getDeclaredField((String) "BASE");
        ((Field) term18758).setAccessible(true);
        Object enum11 = ((Field) term18758).get((Object) null);
        term18630 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term18630, term18630.getClass(), "volume", "PTEndmPMzk");
        setField(term18630, term18630.getClass(), "attribute", enum11);
        setField(term18630, term18630.getClass(), "maxLength", "aJQuCOCvZs");
        setField(term18630, term18630.getClass(), "start", "lHYNCJRiOv");
        setField(term18630, term18630.getClass(), "recall", "QVLresHoaP");
        setField(term18630, term18630.getClass(), "pattern", "IbxeAMwLVt");
        setField(term18630, term18630.getClass(), "responseTimeout", "bShlAqoTmZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nOKlKlNhtU";
        callMethod(klass, "volume", argTypes, term18630, args);
    }

};


