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

public class UssChangeTagInputData_getAction_2465967881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20656;

    public UssChangeTagInputData_getAction_2465967881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20723 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term20722 = ((Class) term20723).getDeclaredField((String) "SET");
        ((Field) term20722).setAccessible(true);
        Object enum63 = ((Field) term20722).get((Object) null);
        Class<? extends Object> term20989 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term20988 = ((Class) term20989).getDeclaredField((String) "BINARY");
        ((Field) term20988).setAccessible(true);
        Object enum64 = ((Field) term20988).get((Object) null);
        Class<? extends Object> term21264 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term21263 = ((Class) term21264).getDeclaredField((String) "SUPPRESS");
        ((Field) term21263).setAccessible(true);
        Object enum65 = ((Field) term21263).get((Object) null);
        term20656 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData"));
        setField(term20656, term20656.getClass(), "action", enum63);
        setField(term20656, term20656.getClass(), "type", enum64);
        setField(term20656, term20656.getClass(), "codeset", "sEnIVFtZuQ");
        setBooleanField(term20656, term20656.getClass(), "recursive", true);
        setField(term20656, term20656.getClass(), "links", enum65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term20656, args);
    }

};


