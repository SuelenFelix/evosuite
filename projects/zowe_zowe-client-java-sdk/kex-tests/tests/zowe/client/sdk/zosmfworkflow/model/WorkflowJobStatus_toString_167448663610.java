package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowJobStatus_toString_167448663610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19953;

    public WorkflowJobStatus_toString_167448663610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19953 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term19953, term19953.getClass(), "retcode", "adHZFgDoEH");
        setField(term19953, term19953.getClass(), "jobName", "vjNETNMDhQ");
        setField(term19953, term19953.getClass(), "status", "pexqQqwSNj");
        setField(term19953, term19953.getClass(), "owner", "myfXkIEBSV");
        setField(term19953, term19953.getClass(), "subsystem", "LSrqDVjzEP");
        setField(term19953, term19953.getClass(), "jobClass", "CPZCLJxTuA");
        setField(term19953, term19953.getClass(), "type", "ivAOXnVjmg");
        setField(term19953, term19953.getClass(), "jobId", "FivesaUeHG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term19953, args);
    }

};


