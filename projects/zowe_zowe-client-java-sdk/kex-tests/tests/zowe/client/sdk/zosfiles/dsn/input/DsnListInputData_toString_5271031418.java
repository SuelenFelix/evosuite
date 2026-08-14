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

public class DsnListInputData_toString_5271031418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25494;

    public DsnListInputData_toString_5271031418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25588 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term25587 = ((Class) term25588).getDeclaredField((String) "MEMBER");
        ((Field) term25587).setAccessible(true);
        Object enum28 = ((Field) term25587).get((Object) null);
        term25494 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term25494, term25494.getClass(), "volume", "uMsWXqNhln");
        setField(term25494, term25494.getClass(), "attribute", enum28);
        setField(term25494, term25494.getClass(), "maxLength", "MAnhIPOtHL");
        setField(term25494, term25494.getClass(), "start", "dikKjYjmRO");
        setField(term25494, term25494.getClass(), "recall", "GJnnMDVnEP");
        setField(term25494, term25494.getClass(), "pattern", "zSMVllDpfk");
        setField(term25494, term25494.getClass(), "responseTimeout", "iptRXVDoYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25494, args);
    }

};


