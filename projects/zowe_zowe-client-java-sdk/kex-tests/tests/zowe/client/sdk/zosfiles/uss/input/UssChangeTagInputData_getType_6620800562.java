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

public class UssChangeTagInputData_getType_6620800562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21509;

    public UssChangeTagInputData_getType_6620800562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21572 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term21571 = ((Class) term21572).getDeclaredField((String) "SET");
        ((Field) term21571).setAccessible(true);
        Object enum66 = ((Field) term21571).get((Object) null);
        Class<? extends Object> term21838 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term21837 = ((Class) term21838).getDeclaredField((String) "BINARY");
        ((Field) term21837).setAccessible(true);
        Object enum67 = ((Field) term21837).get((Object) null);
        Class<? extends Object> term22113 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term22112 = ((Class) term22113).getDeclaredField((String) "FOLLOW");
        ((Field) term22112).setAccessible(true);
        Object enum68 = ((Field) term22112).get((Object) null);
        term21509 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData"));
        setField(term21509, term21509.getClass(), "action", enum66);
        setField(term21509, term21509.getClass(), "type", enum67);
        setField(term21509, term21509.getClass(), "codeset", "ZVecLZMLHF");
        setBooleanField(term21509, term21509.getClass(), "recursive", true);
        setField(term21509, term21509.getClass(), "links", enum68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term21509, args);
    }

};


