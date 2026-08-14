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
import java.lang.Boolean;
import java.util.ArrayList;

public class WorkflowGetDefinitionResponse_getWorkflowDefinitionFileMD5Value_8437117368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42297;

    public WorkflowGetDefinitionResponse_getWorkflowDefinitionFileMD5Value_8437117368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term42382 = new Boolean(true);
        Boolean term42468 = new Boolean(false);
        ArrayList term42470 = new ArrayList();
        ArrayList term42474 = new ArrayList();
        term42297 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse"));
        setField(term42297, term42297.getClass(), "workflowDefaultName", "SsLBbqIZdp");
        setField(term42297, term42297.getClass(), "workflowDescription", "SCyDnkiMeE");
        setField(term42297, term42297.getClass(), "workflowID", "WtfwBvpVGp");
        setField(term42297, term42297.getClass(), "workflowVersion", "nqNHstnjtW");
        setField(term42297, term42297.getClass(), "vendor", "xWqIkjeUFn");
        setField(term42297, term42297.getClass(), "workflowDefinitionFileMD5Value", "vBcZiZnuXD");
        setField(term42297, term42297.getClass(), "isCallable", "NRKOkpSTQr");
        setField(term42297, term42297.getClass(), "containsParallelSteps", term42382);
        setField(term42297, term42297.getClass(), "scope", "XwevHLOcph");
        setField(term42297, term42297.getClass(), "jobsOutputDirectory", "BwsQOfTpXz");
        setField(term42297, term42297.getClass(), "category", "ywBwAaqimp");
        setField(term42297, term42297.getClass(), "productID", "ksNDLlwYiK");
        setField(term42297, term42297.getClass(), "productName", "KNuSMewyWo");
        setField(term42297, term42297.getClass(), "productVersion", "OeZpauZbQm");
        setField(term42297, term42297.getClass(), "globalVariableGroup", "UjNsLLEXru");
        setField(term42297, term42297.getClass(), "isInstanceVariableWithoutPrefix", term42468);
        setField(term42297, term42297.getClass(), "steps", term42470);
        setField(term42297, term42297.getClass(), "variables", term42474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDefinitionFileMD5Value", argTypes, term42297, args);
    }

};


