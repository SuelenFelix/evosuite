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

public class WorkflowListResponse_toString_155498628211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2431;

    public WorkflowListResponse_toString_155498628211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2431 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term2431, term2431.getClass(), "workflowName", "eVpkWxjuki");
        setField(term2431, term2431.getClass(), "workflowKey", "SJiQaLvSKv");
        setField(term2431, term2431.getClass(), "workflowDescription", "OEXDRUKcFl");
        setField(term2431, term2431.getClass(), "workflowID", "RYdKCNNMBR");
        setField(term2431, term2431.getClass(), "workflowVersion", "yGtHPyvYiQ");
        setField(term2431, term2431.getClass(), "workflowDefinitionFileMD5Value", "MvRIxilFMJ");
        setField(term2431, term2431.getClass(), "instanceURI", "iNwOJRBEjp");
        setField(term2431, term2431.getClass(), "owner", "XylxrMBraH");
        setField(term2431, term2431.getClass(), "vendor", "pORebkoRdD");
        setField(term2431, term2431.getClass(), "access", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2431, args);
    }

};


