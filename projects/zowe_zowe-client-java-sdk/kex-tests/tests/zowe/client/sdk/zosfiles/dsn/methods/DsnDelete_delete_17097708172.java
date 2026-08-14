package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnDelete_delete_17097708172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2689;
     Object term2690;

    public DsnDelete_delete_17097708172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2689 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnDelete"));
        setField(term2689, term2689.getClass(), "connection", null);
        setField(term2689, term2689.getClass(), "request", null);
        Class<? extends Object> term2774 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.DeleteType");
        Field term2773 = ((Class) term2774).getDeclaredField((String) "MEMBER");
        ((Field) term2773).setAccessible(true);
        Object enum4 = ((Field) term2773).get((Object) null);
        term2690 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData"));
        setField(term2690, term2690.getClass(), "type", enum4);
        setField(term2690, term2690.getClass(), "datasetName", "IgRJUzaCwW");
        setField(term2690, term2690.getClass(), "memberName", "JUmudUmaaV");
        setField(term2690, term2690.getClass(), "volume", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnDelete");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData");
        Object[] args = new Object[1];
        args[0] = term2690;
        callMethod(klass, "delete", argTypes, term2689, args);
    }

};


