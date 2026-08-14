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

public class UssChangeTagInputData_Builder_links_3845895875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17830;
     Object enum56;

    public UssChangeTagInputData_Builder_links_3845895875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17919 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term17918 = ((Class) term17919).getDeclaredField((String) "REMOVE");
        ((Field) term17918).setAccessible(true);
        Object enum53 = ((Field) term17918).get((Object) null);
        Class<? extends Object> term18194 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term18193 = ((Class) term18194).getDeclaredField((String) "MIXED");
        ((Field) term18193).setAccessible(true);
        Object enum54 = ((Field) term18193).get((Object) null);
        Class<? extends Object> term18466 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term18465 = ((Class) term18466).getDeclaredField((String) "SUPPRESS");
        ((Field) term18465).setAccessible(true);
        Object enum55 = ((Field) term18465).get((Object) null);
        term17830 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term17830, term17830.getClass(), "action", enum53);
        setField(term17830, term17830.getClass(), "type", enum54);
        setField(term17830, term17830.getClass(), "codeset", "QXzGXbEXMu");
        setBooleanField(term17830, term17830.getClass(), "recursive", false);
        setField(term17830, term17830.getClass(), "links", enum55);
        Class<? extends Object> term18712 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term18711 = ((Class) term18712).getDeclaredField((String) "FOLLOW");
        ((Field) term18711).setAccessible(true);
        enum56 = ((Field) term18711).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[1];
        args[0] = enum56;
        callMethod(klass, "links", argTypes, term17830, args);
    }

};


