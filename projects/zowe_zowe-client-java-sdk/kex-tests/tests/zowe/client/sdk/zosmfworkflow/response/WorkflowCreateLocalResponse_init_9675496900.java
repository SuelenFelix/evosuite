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
import java.util.LinkedList;
import java.lang.Object;

public class WorkflowCreateLocalResponse_init_9675496900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2733;
     Object term2794;
     Object term2839;

    public WorkflowCreateLocalResponse_init_9675496900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2733 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term2733, term2733.getClass(), "workflowKey", "XOiDvlDhdc");
        setField(term2733, term2733.getClass(), "workflowDescription", "AdxvLJhNLe");
        setField(term2733, term2733.getClass(), "workflowID", "lHfTrWKMPk");
        setField(term2733, term2733.getClass(), "workflowVersion", "JDaAnsVTGV");
        setField(term2733, term2733.getClass(), "vendor", "mLUZFTfjle");
        term2794 = new LinkedList();
        ((LinkedList) term2794).add("xIeFjkHkOe");
        ((LinkedList) term2794).add("SdCKLMIYnX");
        ((LinkedList) term2794).add("");
        ((LinkedList) term2794).add((Object)null);
        ((LinkedList) term2794).add((Object)null);
        term2839 = new LinkedList();
        ((LinkedList) term2839).add("EYtfuJaxiM");
        ((LinkedList) term2839).add("gCWtLVKVVe");
        ((LinkedList) term2839).add("");
        ((LinkedList) term2839).add((Object)null);
        ((LinkedList) term2839).add((Object)null);
        ((LinkedList) term2839).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term2733;
        args[1] = term2794;
        args[2] = term2839;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


