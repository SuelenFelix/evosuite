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

public class DsnDeleteInputData_getMemberName_17828674656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16442;

    public DsnDeleteInputData_getMemberName_17828674656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16495 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.DeleteType");
        Field term16494 = ((Class) term16495).getDeclaredField((String) "UNCATALOGED");
        ((Field) term16494).setAccessible(true);
        Object enum9 = ((Field) term16494).get((Object) null);
        term16442 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData"));
        setField(term16442, term16442.getClass(), "type", enum9);
        setField(term16442, term16442.getClass(), "datasetName", "fLRqcTSfzF");
        setField(term16442, term16442.getClass(), "memberName", "EBYHwsuWAU");
        setField(term16442, term16442.getClass(), "volume", "PtIjKpiSix");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberName", argTypes, term16442, args);
    }

};


