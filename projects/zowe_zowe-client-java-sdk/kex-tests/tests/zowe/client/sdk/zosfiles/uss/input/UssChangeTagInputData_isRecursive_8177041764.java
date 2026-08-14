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

public class UssChangeTagInputData_isRecursive_8177041764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23205;

    public UssChangeTagInputData_isRecursive_8177041764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23272 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term23271 = ((Class) term23272).getDeclaredField((String) "SET");
        ((Field) term23271).setAccessible(true);
        Object enum72 = ((Field) term23271).get((Object) null);
        Class<? extends Object> term23538 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term23537 = ((Class) term23538).getDeclaredField((String) "BINARY");
        ((Field) term23537).setAccessible(true);
        Object enum73 = ((Field) term23537).get((Object) null);
        Class<? extends Object> term23813 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term23812 = ((Class) term23813).getDeclaredField((String) "SUPPRESS");
        ((Field) term23812).setAccessible(true);
        Object enum74 = ((Field) term23812).get((Object) null);
        term23205 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData"));
        setField(term23205, term23205.getClass(), "action", enum72);
        setField(term23205, term23205.getClass(), "type", enum73);
        setField(term23205, term23205.getClass(), "codeset", "eVpkWxjuki");
        setBooleanField(term23205, term23205.getClass(), "recursive", false);
        setField(term23205, term23205.getClass(), "links", enum74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRecursive", argTypes, term23205, args);
    }

};


