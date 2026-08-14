package zowe.client.sdk.zosmfworkflow.response;

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
import static zowe.client.sdk.zosmfworkflow.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowListResponse_getWorkflowID_13282552824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884;

    public WorkflowListResponse_getWorkflowID_13282552824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term884, term884.getClass(), "workflowName", "wSQxaModmm");
        setField(term884, term884.getClass(), "workflowKey", "UlajhuVLaP");
        setField(term884, term884.getClass(), "workflowDescription", "gGSMzuGICf");
        setField(term884, term884.getClass(), "workflowID", "hxCBltsObl");
        setField(term884, term884.getClass(), "workflowVersion", "BndsHwAFMv");
        setField(term884, term884.getClass(), "workflowDefinitionFileMD5Value", "GzFkzHGYFt");
        setField(term884, term884.getClass(), "instanceURI", "tShwQLRGNe");
        setField(term884, term884.getClass(), "owner", "LvtrsXUliU");
        setField(term884, term884.getClass(), "vendor", "xLbjWUgOIL");
        setField(term884, term884.getClass(), "access", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowID", argTypes, term884, args);
    }

};


