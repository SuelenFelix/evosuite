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

public class WorkflowListResponse_getWorkflowName_254502701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;

    public WorkflowListResponse_getWorkflowName_254502701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term221, term221.getClass(), "workflowName", "NRdvgJlhkX");
        setField(term221, term221.getClass(), "workflowKey", "uuaPigETmJ");
        setField(term221, term221.getClass(), "workflowDescription", "MxlszYVzRf");
        setField(term221, term221.getClass(), "workflowID", "LQFpaHEwXR");
        setField(term221, term221.getClass(), "workflowVersion", "oVcInYnLWB");
        setField(term221, term221.getClass(), "workflowDefinitionFileMD5Value", "aJlieCFVtF");
        setField(term221, term221.getClass(), "instanceURI", "ZiaGIbnzTs");
        setField(term221, term221.getClass(), "owner", "tbcdzjIfER");
        setField(term221, term221.getClass(), "vendor", "HyxfbSQYBe");
        setField(term221, term221.getClass(), "access", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowName", argTypes, term221, args);
    }

};


