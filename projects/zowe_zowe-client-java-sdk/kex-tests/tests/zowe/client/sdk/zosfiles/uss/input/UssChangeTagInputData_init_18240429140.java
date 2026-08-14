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

public class UssChangeTagInputData_init_18240429140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19803;

    public UssChangeTagInputData_init_18240429140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19870 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term19869 = ((Class) term19870).getDeclaredField((String) "SET");
        ((Field) term19869).setAccessible(true);
        Object enum60 = ((Field) term19869).get((Object) null);
        Class<? extends Object> term20136 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term20135 = ((Class) term20136).getDeclaredField((String) "BINARY");
        ((Field) term20135).setAccessible(true);
        Object enum61 = ((Field) term20135).get((Object) null);
        Class<? extends Object> term20411 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term20410 = ((Class) term20411).getDeclaredField((String) "SUPPRESS");
        ((Field) term20410).setAccessible(true);
        Object enum62 = ((Field) term20410).get((Object) null);
        term19803 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term19803, term19803.getClass(), "action", enum60);
        setField(term19803, term19803.getClass(), "type", enum61);
        setField(term19803, term19803.getClass(), "codeset", "xBsXSDjXYK");
        setBooleanField(term19803, term19803.getClass(), "recursive", false);
        setField(term19803, term19803.getClass(), "links", enum62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term19803;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


