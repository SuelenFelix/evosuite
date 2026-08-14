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

public class UssChangeTagInputData_getLinks_10388274675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24058;

    public UssChangeTagInputData_getLinks_10388274675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24129 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term24128 = ((Class) term24129).getDeclaredField((String) "REMOVE");
        ((Field) term24128).setAccessible(true);
        Object enum75 = ((Field) term24128).get((Object) null);
        Class<? extends Object> term24404 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term24403 = ((Class) term24404).getDeclaredField((String) "MIXED");
        ((Field) term24403).setAccessible(true);
        Object enum76 = ((Field) term24403).get((Object) null);
        Class<? extends Object> term24676 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term24675 = ((Class) term24676).getDeclaredField((String) "SUPPRESS");
        ((Field) term24675).setAccessible(true);
        Object enum77 = ((Field) term24675).get((Object) null);
        term24058 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData"));
        setField(term24058, term24058.getClass(), "action", enum75);
        setField(term24058, term24058.getClass(), "type", enum76);
        setField(term24058, term24058.getClass(), "codeset", "SJiQaLvSKv");
        setBooleanField(term24058, term24058.getClass(), "recursive", true);
        setField(term24058, term24058.getClass(), "links", enum77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinks", argTypes, term24058, args);
    }

};


