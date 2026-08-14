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

public class UssChangeTagInputData_Builder_type_6689502242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14989;
     Object enum46;

    public UssChangeTagInputData_Builder_type_6689502242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15070 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term15069 = ((Class) term15070).getDeclaredField((String) "REMOVE");
        ((Field) term15069).setAccessible(true);
        Object enum43 = ((Field) term15069).get((Object) null);
        Class<? extends Object> term15345 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term15344 = ((Class) term15345).getDeclaredField((String) "TEXT");
        ((Field) term15344).setAccessible(true);
        Object enum44 = ((Field) term15344).get((Object) null);
        Class<? extends Object> term15614 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term15613 = ((Class) term15614).getDeclaredField((String) "FOLLOW");
        ((Field) term15613).setAccessible(true);
        Object enum45 = ((Field) term15613).get((Object) null);
        term14989 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term14989, term14989.getClass(), "action", enum43);
        setField(term14989, term14989.getClass(), "type", enum44);
        setField(term14989, term14989.getClass(), "codeset", "SPpkrGcPRr");
        setBooleanField(term14989, term14989.getClass(), "recursive", false);
        setField(term14989, term14989.getClass(), "links", enum45);
        Class<? extends Object> term15854 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term15853 = ((Class) term15854).getDeclaredField((String) "MIXED");
        ((Field) term15853).setAccessible(true);
        enum46 = ((Field) term15853).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Object[] args = new Object[1];
        args[0] = enum46;
        callMethod(klass, "type", argTypes, term14989, args);
    }

};


