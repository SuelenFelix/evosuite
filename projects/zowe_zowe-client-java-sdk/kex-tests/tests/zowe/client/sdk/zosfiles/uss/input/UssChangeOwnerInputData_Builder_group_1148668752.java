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

public class UssChangeOwnerInputData_Builder_group_1148668752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30446;

    public UssChangeOwnerInputData_Builder_group_1148668752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30527 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term30526 = ((Class) term30527).getDeclaredField((String) "SUPPRESS");
        ((Field) term30526).setAccessible(true);
        Object enum94 = ((Field) term30526).get((Object) null);
        term30446 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder"));
        setField(term30446, term30446.getClass(), "owner", "VeDtgDzGAN");
        setField(term30446, term30446.getClass(), "group", "aWYOWZFyaX");
        setBooleanField(term30446, term30446.getClass(), "recursive", true);
        setField(term30446, term30446.getClass(), "links", enum94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BRIVNtfUWU";
        callMethod(klass, "group", argTypes, term30446, args);
    }

};


