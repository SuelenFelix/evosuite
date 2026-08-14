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

public class UssChangeOwnerInputData_isRecursive_163348393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47250;

    public UssChangeOwnerInputData_isRecursive_163348393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47315 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term47314 = ((Class) term47315).getDeclaredField((String) "CHANGE");
        ((Field) term47314).setAccessible(true);
        Object enum142 = ((Field) term47314).get((Object) null);
        term47250 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData"));
        setField(term47250, term47250.getClass(), "owner", "THZSpzBRYP");
        setField(term47250, term47250.getClass(), "group", "ZfBIVGBQOE");
        setBooleanField(term47250, term47250.getClass(), "recursive", false);
        setField(term47250, term47250.getClass(), "links", enum142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRecursive", argTypes, term47250, args);
    }

};


