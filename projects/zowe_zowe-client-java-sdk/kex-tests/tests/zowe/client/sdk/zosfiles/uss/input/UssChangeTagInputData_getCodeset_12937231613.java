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

public class UssChangeTagInputData_getCodeset_12937231613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22352;

    public UssChangeTagInputData_getCodeset_12937231613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22419 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term22418 = ((Class) term22419).getDeclaredField((String) "REMOVE");
        ((Field) term22418).setAccessible(true);
        Object enum69 = ((Field) term22418).get((Object) null);
        Class<? extends Object> term22694 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term22693 = ((Class) term22694).getDeclaredField((String) "MIXED");
        ((Field) term22693).setAccessible(true);
        Object enum70 = ((Field) term22693).get((Object) null);
        Class<? extends Object> term22966 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term22965 = ((Class) term22966).getDeclaredField((String) "FOLLOW");
        ((Field) term22965).setAccessible(true);
        Object enum71 = ((Field) term22965).get((Object) null);
        term22352 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData"));
        setField(term22352, term22352.getClass(), "action", enum69);
        setField(term22352, term22352.getClass(), "type", enum70);
        setField(term22352, term22352.getClass(), "codeset", "fztQhjqwdP");
        setBooleanField(term22352, term22352.getClass(), "recursive", false);
        setField(term22352, term22352.getClass(), "links", enum71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodeset", argTypes, term22352, args);
    }

};


