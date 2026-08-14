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

public class UssChangeModeInputData_toString_2345289324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55542;

    public UssChangeModeInputData_toString_2345289324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55585 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term55584 = ((Class) term55585).getDeclaredField((String) "FOLLOW");
        ((Field) term55584).setAccessible(true);
        Object enum155 = ((Field) term55584).get((Object) null);
        term55542 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData"));
        setField(term55542, term55542.getClass(), "mode", "mNHyqmOAFy");
        setBooleanField(term55542, term55542.getClass(), "recursive", true);
        setField(term55542, term55542.getClass(), "links", enum155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term55542, args);
    }

};


