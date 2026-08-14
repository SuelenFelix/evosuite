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

public class WorkflowListResponse_getVendor_2552958769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1989;

    public WorkflowListResponse_getVendor_2552958769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1989 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term1989, term1989.getClass(), "workflowName", "swZVeJAxjt");
        setField(term1989, term1989.getClass(), "workflowKey", "xOcJIiQQDu");
        setField(term1989, term1989.getClass(), "workflowDescription", "GVizqqzXpy");
        setField(term1989, term1989.getClass(), "workflowID", "JqXGgAhZPl");
        setField(term1989, term1989.getClass(), "workflowVersion", "jiKYgYHqIS");
        setField(term1989, term1989.getClass(), "workflowDefinitionFileMD5Value", "DfISiziTgG");
        setField(term1989, term1989.getClass(), "instanceURI", "XqgfKFvPSD");
        setField(term1989, term1989.getClass(), "owner", "JiVRgTZvKc");
        setField(term1989, term1989.getClass(), "vendor", "XPKmummaqg");
        setField(term1989, term1989.getClass(), "access", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVendor", argTypes, term1989, args);
    }

};


