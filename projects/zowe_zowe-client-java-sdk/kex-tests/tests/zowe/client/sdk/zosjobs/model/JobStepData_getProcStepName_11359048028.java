package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobStepData_getProcStepName_11359048028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4989;

    public JobStepData_getProcStepName_11359048028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5003 = new Long(6682528376118987775L);
        term4989 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4989, term4989.getClass(), "active", false);
        setField(term4989, term4989.getClass(), "smfid", "CFyoseFGLF");
        setField(term4989, term4989.getClass(), "stepNumber", term5003);
        setField(term4989, term4989.getClass(), "owner", "SFqCrhEWLm");
        setField(term4989, term4989.getClass(), "programName", "GZdcJyZntS");
        setField(term4989, term4989.getClass(), "stepName", "OIHoJeysUi");
        setField(term4989, term4989.getClass(), "pathName", "WXMWFDGcLB");
        setField(term4989, term4989.getClass(), "procStepName", "wKWbJssZuG");
        setField(term4989, term4989.getClass(), "completion", "NzBMMhkhpT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcStepName", argTypes, term4989, args);
    }

};


