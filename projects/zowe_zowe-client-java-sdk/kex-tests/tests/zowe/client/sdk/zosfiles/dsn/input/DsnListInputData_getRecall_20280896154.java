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

public class DsnListInputData_getRecall_20280896154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23890;

    public DsnListInputData_getRecall_20280896154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23984 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term23983 = ((Class) term23984).getDeclaredField((String) "MEMBER");
        ((Field) term23983).setAccessible(true);
        Object enum24 = ((Field) term23983).get((Object) null);
        term23890 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term23890, term23890.getClass(), "volume", "Bcivwcjece");
        setField(term23890, term23890.getClass(), "attribute", enum24);
        setField(term23890, term23890.getClass(), "maxLength", "QTefjRuiez");
        setField(term23890, term23890.getClass(), "start", "SQZVNkAVBB");
        setField(term23890, term23890.getClass(), "recall", "mrSAYJlddZ");
        setField(term23890, term23890.getClass(), "pattern", "KbwxawvYsw");
        setField(term23890, term23890.getClass(), "responseTimeout", "gvjdfHNzOa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecall", argTypes, term23890, args);
    }

};


