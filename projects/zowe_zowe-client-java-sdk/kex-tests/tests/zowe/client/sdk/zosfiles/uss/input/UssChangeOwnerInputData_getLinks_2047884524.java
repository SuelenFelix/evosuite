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

public class UssChangeOwnerInputData_getLinks_2047884524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47554;

    public UssChangeOwnerInputData_getLinks_2047884524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47623 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term47622 = ((Class) term47623).getDeclaredField((String) "SUPPRESS");
        ((Field) term47622).setAccessible(true);
        Object enum143 = ((Field) term47622).get((Object) null);
        term47554 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData"));
        setField(term47554, term47554.getClass(), "owner", "QSrDQfEsTR");
        setField(term47554, term47554.getClass(), "group", "PsqusYmejD");
        setBooleanField(term47554, term47554.getClass(), "recursive", true);
        setField(term47554, term47554.getClass(), "links", enum143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinks", argTypes, term47554, args);
    }

};


