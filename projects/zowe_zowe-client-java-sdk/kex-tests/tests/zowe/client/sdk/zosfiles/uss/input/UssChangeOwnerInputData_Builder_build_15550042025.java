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

public class UssChangeOwnerInputData_Builder_build_15550042025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31660;

    public UssChangeOwnerInputData_Builder_build_15550042025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31725 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term31724 = ((Class) term31725).getDeclaredField((String) "FOLLOW");
        ((Field) term31724).setAccessible(true);
        Object enum98 = ((Field) term31724).get((Object) null);
        term31660 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder"));
        setField(term31660, term31660.getClass(), "owner", "XYtryyobou");
        setField(term31660, term31660.getClass(), "group", "OYbzXylRWW");
        setBooleanField(term31660, term31660.getClass(), "recursive", false);
        setField(term31660, term31660.getClass(), "links", enum98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term31660, args);
    }

};


