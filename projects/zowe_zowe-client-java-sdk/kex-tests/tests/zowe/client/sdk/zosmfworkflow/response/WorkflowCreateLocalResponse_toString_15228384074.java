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
import java.lang.Object;
import java.util.ArrayList;

public class WorkflowCreateLocalResponse_toString_15228384074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3787;

    public WorkflowCreateLocalResponse_toString_15228384074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3849 = new ArrayList();
        ((ArrayList) term3849).add("igCAtimmYB");
        ((ArrayList) term3849).add("DyiXbeYIaN");
        ((ArrayList) term3849).add("VGizxZnyHX");
        ((ArrayList) term3849).add("kVEZMHmRtR");
        ((ArrayList) term3849).add("ekxGuOYIwi");
        ((ArrayList) term3849).add("RbVQXSpxXy");
        ArrayList term3925 = new ArrayList();
        ((ArrayList) term3925).add("YpJbIgJWWv");
        ((ArrayList) term3925).add("JppkknKVOw");
        ((ArrayList) term3925).add("iljANwuEjk");
        ((ArrayList) term3925).add("kNqaJKIATy");
        ((ArrayList) term3925).add("vKQukfbJUd");
        ((ArrayList) term3925).add("lFRJFUMVbx");
        ((ArrayList) term3925).add("sZdUNdggUW");
        term3787 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse"));
        Object term3788 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term3788, term3788.getClass(), "workflowKey", "xtftXXMbem");
        setField(term3788, term3788.getClass(), "workflowDescription", "cudZvLMQon");
        setField(term3788, term3788.getClass(), "workflowID", "lihXWlGDxk");
        setField(term3788, term3788.getClass(), "workflowVersion", "JmcmxoGhIK");
        setField(term3788, term3788.getClass(), "vendor", "jXzmYyrnnT");
        setField(term3787, term3787.getClass(), "workflow", term3788);
        setField(term3787, term3787.getClass(), "filesKept", term3849);
        setField(term3787, term3787.getClass(), "failedToDelete", term3925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3787, args);
    }

};


