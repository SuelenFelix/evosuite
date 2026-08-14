package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class UssChangeTagInputData_Builder_recursive_3467578374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16985;
     Object term17047;

    public UssChangeTagInputData_Builder_recursive_3467578374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17050 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term17049 = ((Class) term17050).getDeclaredField((String) "SET");
        ((Field) term17049).setAccessible(true);
        Object enum50 = ((Field) term17049).get((Object) null);
        Class<? extends Object> term17316 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term17315 = ((Class) term17316).getDeclaredField((String) "BINARY");
        ((Field) term17315).setAccessible(true);
        Object enum51 = ((Field) term17315).get((Object) null);
        Class<? extends Object> term17591 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term17590 = ((Class) term17591).getDeclaredField((String) "FOLLOW");
        ((Field) term17590).setAccessible(true);
        Object enum52 = ((Field) term17590).get((Object) null);
        term16985 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term16985, term16985.getClass(), "action", enum50);
        setField(term16985, term16985.getClass(), "type", enum51);
        setField(term16985, term16985.getClass(), "codeset", "vjxIhXHxGR");
        setBooleanField(term16985, term16985.getClass(), "recursive", true);
        setField(term16985, term16985.getClass(), "links", enum52);
        term17047 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17047;
        callMethod(klass, "recursive", argTypes, term16985, args);
    }

};


