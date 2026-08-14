package zowe.client.sdk.zosjobs.input;

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
import static zowe.client.sdk.zosjobs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobModifyInputData_getJobClass_14626130184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;

    public JobModifyInputData_getJobClass_14626130184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2790 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData"));
        setField(term2790, term2790.getClass(), "jobName", "UiUYnPrcCi");
        setField(term2790, term2790.getClass(), "jobId", "UoYtihxVaS");
        setField(term2790, term2790.getClass(), "version", "JDswTTCZHV");
        setField(term2790, term2790.getClass(), "jobClass", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobClass", argTypes, term2790, args);
    }

};


