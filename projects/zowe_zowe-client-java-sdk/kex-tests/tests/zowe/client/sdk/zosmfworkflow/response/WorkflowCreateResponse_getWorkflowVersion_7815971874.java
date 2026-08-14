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

public class WorkflowCreateResponse_getWorkflowVersion_7815971874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38288;

    public WorkflowCreateResponse_getWorkflowVersion_7815971874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38288 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term38288, term38288.getClass(), "workflowKey", "zQtuUgUIjK");
        setField(term38288, term38288.getClass(), "workflowDescription", "VBeGRjPsPN");
        setField(term38288, term38288.getClass(), "workflowID", "pZrAdSHQIs");
        setField(term38288, term38288.getClass(), "workflowVersion", "XTOiucaEva");
        setField(term38288, term38288.getClass(), "vendor", "JMekRNxFMU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowVersion", argTypes, term38288, args);
    }

};


