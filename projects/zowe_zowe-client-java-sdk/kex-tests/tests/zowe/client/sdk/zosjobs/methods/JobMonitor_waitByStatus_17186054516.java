package zowe.client.sdk.zosjobs.methods;

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
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JobMonitor_waitByStatus_17186054516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16806;
     Object enum7;

    public JobMonitor_waitByStatus_17186054516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16806 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term16806, term16806.getClass(), "connection", null);
        setIntField(term16806, term16806.getClass(), "attempts", -602026508);
        setIntField(term16806, term16806.getClass(), "watchDelay", -157887805);
        setIntField(term16806, term16806.getClass(), "lineLimit", 1876565163);
        Class<? extends Object> term16864 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term16863 = ((Class) term16864).getDeclaredField((String) "INPUT");
        ((Field) term16863).setAccessible(true);
        enum7 = ((Field) term16863).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Object[] args = new Object[3];
        args[0] = "bIrtpkYJWT";
        args[1] = "VuLLXpvPpZ";
        args[2] = enum7;
        callMethod(klass, "waitByStatus", argTypes, term16806, args);
    }

};


