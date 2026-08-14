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

public class WorkflowCreateLocalResponse_getFilesKept_17722599492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3261;

    public WorkflowCreateLocalResponse_getFilesKept_17722599492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3323 = new ArrayList();
        ((ArrayList) term3323).add("HHmNoYxIGj");
        ((ArrayList) term3323).add("PtirvZmsGt");
        ((ArrayList) term3323).add("HWkpTmtlrc");
        ((ArrayList) term3323).add("hMmaoREuCK");
        ArrayList term3375 = new ArrayList();
        ((ArrayList) term3375).add("VeDtgDzGAN");
        term3261 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse"));
        Object term3262 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term3262, term3262.getClass(), "workflowKey", "ZfdXfCCFDf");
        setField(term3262, term3262.getClass(), "workflowDescription", "MwwjNtdOFT");
        setField(term3262, term3262.getClass(), "workflowID", "VYkqXKVlAJ");
        setField(term3262, term3262.getClass(), "workflowVersion", "XkIoWJRNwN");
        setField(term3262, term3262.getClass(), "vendor", "aNWLJdrZMq");
        setField(term3261, term3261.getClass(), "workflow", term3262);
        setField(term3261, term3261.getClass(), "filesKept", term3323);
        setField(term3261, term3261.getClass(), "failedToDelete", term3375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilesKept", argTypes, term3261, args);
    }

};


