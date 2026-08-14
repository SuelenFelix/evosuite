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

public class UssChangeOwnerInputData_Builder_recursive_6981718853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30782;
     Object term30826;

    public UssChangeOwnerInputData_Builder_recursive_6981718853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30849 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term30848 = ((Class) term30849).getDeclaredField((String) "FOLLOW");
        ((Field) term30848).setAccessible(true);
        Object enum95 = ((Field) term30848).get((Object) null);
        term30782 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder"));
        setField(term30782, term30782.getClass(), "owner", "DbiCVtPPCT");
        setField(term30782, term30782.getClass(), "group", "WzFopsaDuG");
        setBooleanField(term30782, term30782.getClass(), "recursive", false);
        setField(term30782, term30782.getClass(), "links", enum95);
        term30826 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30826;
        callMethod(klass, "recursive", argTypes, term30782, args);
    }

};


