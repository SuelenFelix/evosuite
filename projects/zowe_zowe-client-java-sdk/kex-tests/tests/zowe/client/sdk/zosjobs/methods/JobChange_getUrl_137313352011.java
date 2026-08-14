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

public class JobChange_getUrl_137313352011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3693;

    public JobChange_getUrl_137313352011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3693 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData"));
        setField(term3693, term3693.getClass(), "jobName", "PapWxkhEWe");
        setField(term3693, term3693.getClass(), "jobId", "smnHEqRFRx");
        setField(term3693, term3693.getClass(), "version", "XYtryyobou");
        setField(term3693, term3693.getClass(), "jobClass", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobChange");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData");
        Object[] args = new Object[2];
        args[0] = "WzFopsaDuG";
        args[1] = term3693;
        callMethod(klass, "getUrl", argTypes, null, args);
    }

};


