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

public class DsnListInputData_Builder_recall_18110562115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20588;

    public DsnListInputData_Builder_recall_18110562115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20692 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term20691 = ((Class) term20692).getDeclaredField((String) "BASE");
        ((Field) term20691).setAccessible(true);
        Object enum16 = ((Field) term20691).get((Object) null);
        term20588 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder"));
        setField(term20588, term20588.getClass(), "volume", "JptuwlirlS");
        setField(term20588, term20588.getClass(), "attribute", enum16);
        setField(term20588, term20588.getClass(), "maxLength", "TKOMaGswbU");
        setField(term20588, term20588.getClass(), "start", "YcTbglHiUq");
        setField(term20588, term20588.getClass(), "recall", "TiUqHrjoEU");
        setField(term20588, term20588.getClass(), "pattern", "eoEvZbdLjL");
        setField(term20588, term20588.getClass(), "responseTimeout", "BkIxsyPkGy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mrMGwoRgVY";
        callMethod(klass, "recall", argTypes, term20588, args);
    }

};


