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

public class WorkflowListResponse_getWorkflowDefinitionFileMD5Value_18058228276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1326;

    public WorkflowListResponse_getWorkflowDefinitionFileMD5Value_18058228276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1326 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term1326, term1326.getClass(), "workflowName", "ieCtQFdkii");
        setField(term1326, term1326.getClass(), "workflowKey", "dEnhdmILtU");
        setField(term1326, term1326.getClass(), "workflowDescription", "hoicvmsovO");
        setField(term1326, term1326.getClass(), "workflowID", "eqJfYWRaEL");
        setField(term1326, term1326.getClass(), "workflowVersion", "fhkbdRViHi");
        setField(term1326, term1326.getClass(), "workflowDefinitionFileMD5Value", "uWHnvSvaPl");
        setField(term1326, term1326.getClass(), "instanceURI", "kBdSllIBVz");
        setField(term1326, term1326.getClass(), "owner", "TJmVBGfTML");
        setField(term1326, term1326.getClass(), "vendor", "tPlsykYBqO");
        setField(term1326, term1326.getClass(), "access", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDefinitionFileMD5Value", argTypes, term1326, args);
    }

};


