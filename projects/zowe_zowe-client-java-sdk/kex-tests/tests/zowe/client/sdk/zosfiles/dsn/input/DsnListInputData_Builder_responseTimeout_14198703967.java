package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnListInputData_Builder_responseTimeout_14198703967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21428;

    public DsnListInputData_Builder_responseTimeout_14198703967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21534 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term21533 = ((Class) term21534).getDeclaredField((String) "MEMBER");
        ((Field) term21533).setAccessible(true);
        Object enum18 = ((Field) term21533).get((Object) null);
        term21428 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term21428, term21428.getClass(), "volume", "ReruUQRXwl");
        setField(term21428, term21428.getClass(), "attribute", enum18);
        setField(term21428, term21428.getClass(), "maxLength", "DWEsVQwuaE");
        setField(term21428, term21428.getClass(), "start", "qGkNzZAeDN");
        setField(term21428, term21428.getClass(), "recall", "wdtiuPgTVJ");
        setField(term21428, term21428.getClass(), "pattern", "HUgzMgrpsK");
        setField(term21428, term21428.getClass(), "responseTimeout", "ubaBUfLolu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "itAUCFhZhq";
        callMethod(klass, "responseTimeout", argTypes, term21428, args);
    }

};


