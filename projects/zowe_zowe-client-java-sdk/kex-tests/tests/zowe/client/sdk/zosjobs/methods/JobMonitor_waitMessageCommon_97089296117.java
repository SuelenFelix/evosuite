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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class JobMonitor_waitMessageCommon_97089296117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17105;
     Object term17109;

    public JobMonitor_waitMessageCommon_97089296117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17105 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term17105, term17105.getClass(), "connection", null);
        setIntField(term17105, term17105.getClass(), "attempts", -817164822);
        setIntField(term17105, term17105.getClass(), "watchDelay", -1016503459);
        setIntField(term17105, term17105.getClass(), "lineLimit", -1968847291);
        Integer term17134 = new Integer(1048535127);
        Class<? extends Object> term17182 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term17181 = ((Class) term17182).getDeclaredField((String) "INPUT");
        ((Field) term17181).setAccessible(true);
        Object enum8 = ((Field) term17181).get((Object) null);
        Integer term17145 = new Integer(-655067527);
        Integer term17147 = new Integer(-6029667);
        term17109 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData"));
        setField(term17109, term17109.getClass(), "jobId", "UEdzEKEEEV");
        setField(term17109, term17109.getClass(), "jobName", "BcENaQFYSd");
        setField(term17109, term17109.getClass(), "watchDelay", term17134);
        setField(term17109, term17109.getClass(), "jobStatus", enum8);
        setField(term17109, term17109.getClass(), "attempts", term17145);
        setField(term17109, term17109.getClass(), "lineLimit", term17147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term17109;
        args[1] = "POPYycoDBy";
        callMethod(klass, "waitMessageCommon", argTypes, term17105, args);
    }

};


