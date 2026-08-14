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

public class JobMonitor_waitByOutputStatus_107006369114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15941;

    public JobMonitor_waitByOutputStatus_107006369114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15941 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term15941, term15941.getClass(), "connection", null);
        setIntField(term15941, term15941.getClass(), "attempts", -1530420153);
        setIntField(term15941, term15941.getClass(), "watchDelay", -469968304);
        setIntField(term15941, term15941.getClass(), "lineLimit", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "fLRqcTSfzF";
        args[1] = "EBYHwsuWAU";
        callMethod(klass, "waitByOutputStatus", argTypes, term15941, args);
    }

};


