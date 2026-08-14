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

public class UssChangeTagInputData_Builder_action_15259202401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13761;
     Object enum42;

    public UssChangeTagInputData_Builder_action_15259202401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13886 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term13885 = ((Class) term13886).getDeclaredField((String) "REMOVE");
        ((Field) term13885).setAccessible(true);
        Object enum39 = ((Field) term13885).get((Object) null);
        Class<? extends Object> term14209 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term14208 = ((Class) term14209).getDeclaredField((String) "MIXED");
        ((Field) term14208).setAccessible(true);
        Object enum40 = ((Field) term14208).get((Object) null);
        Class<? extends Object> term14481 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term14480 = ((Class) term14481).getDeclaredField((String) "FOLLOW");
        ((Field) term14480).setAccessible(true);
        Object enum41 = ((Field) term14480).get((Object) null);
        term13761 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term13761, term13761.getClass(), "action", enum39);
        setField(term13761, term13761.getClass(), "type", enum40);
        setField(term13761, term13761.getClass(), "codeset", "BKLfkLiZTH");
        setBooleanField(term13761, term13761.getClass(), "recursive", true);
        setField(term13761, term13761.getClass(), "links", enum41);
        Class<? extends Object> term14721 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term14720 = ((Class) term14721).getDeclaredField((String) "LIST");
        ((Field) term14720).setAccessible(true);
        enum42 = ((Field) term14720).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Object[] args = new Object[1];
        args[0] = enum42;
        callMethod(klass, "action", argTypes, term13761, args);
    }

};


