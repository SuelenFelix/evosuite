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

public class WorkflowListResponse_getVendor_25529587621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2660;

    public WorkflowListResponse_getVendor_25529587621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2660 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term2660, term2660.getClass(), "workflowName", null);
        setField(term2660, term2660.getClass(), "workflowKey", null);
        setField(term2660, term2660.getClass(), "workflowDescription", null);
        setField(term2660, term2660.getClass(), "workflowID", null);
        setField(term2660, term2660.getClass(), "workflowVersion", null);
        setField(term2660, term2660.getClass(), "workflowDefinitionFileMD5Value", null);
        setField(term2660, term2660.getClass(), "instanceURI", null);
        setField(term2660, term2660.getClass(), "owner", null);
        setField(term2660, term2660.getClass(), "vendor", null);
        setField(term2660, term2660.getClass(), "access", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVendor", argTypes, term2660, args);
    }

};


