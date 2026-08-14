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

public class UssChangeTagInputData_toString_17035470796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24921;

    public UssChangeTagInputData_toString_17035470796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24984 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term24983 = ((Class) term24984).getDeclaredField((String) "SET");
        ((Field) term24983).setAccessible(true);
        Object enum78 = ((Field) term24983).get((Object) null);
        Class<? extends Object> term25250 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term25249 = ((Class) term25250).getDeclaredField((String) "BINARY");
        ((Field) term25249).setAccessible(true);
        Object enum79 = ((Field) term25249).get((Object) null);
        Class<? extends Object> term25525 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term25524 = ((Class) term25525).getDeclaredField((String) "FOLLOW");
        ((Field) term25524).setAccessible(true);
        Object enum80 = ((Field) term25524).get((Object) null);
        term24921 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData"));
        setField(term24921, term24921.getClass(), "action", enum78);
        setField(term24921, term24921.getClass(), "type", enum79);
        setField(term24921, term24921.getClass(), "codeset", "OEXDRUKcFl");
        setBooleanField(term24921, term24921.getClass(), "recursive", true);
        setField(term24921, term24921.getClass(), "links", enum80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term24921, args);
    }

};


