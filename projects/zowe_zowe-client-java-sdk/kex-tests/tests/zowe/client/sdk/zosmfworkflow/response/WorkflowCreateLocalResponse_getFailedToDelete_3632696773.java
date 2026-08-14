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

public class WorkflowCreateLocalResponse_getFailedToDelete_3632696773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3491;

    public WorkflowCreateLocalResponse_getFailedToDelete_3632696773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3553 = new ArrayList();
        ((ArrayList) term3553).add("smnHEqRFRx");
        ((ArrayList) term3553).add("XYtryyobou");
        ((ArrayList) term3553).add("OYbzXylRWW");
        ((ArrayList) term3553).add("DSNsTGYXDF");
        ((ArrayList) term3553).add("sQvGcVjdEx");
        ((ArrayList) term3553).add("rLHAoqXgPh");
        ArrayList term3629 = new ArrayList();
        ((ArrayList) term3629).add("zUlRdimJtU");
        ((ArrayList) term3629).add("vwbEQQNQrx");
        term3491 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse"));
        Object term3492 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateResponse"));
        setField(term3492, term3492.getClass(), "workflowKey", "aWYOWZFyaX");
        setField(term3492, term3492.getClass(), "workflowDescription", "BRIVNtfUWU");
        setField(term3492, term3492.getClass(), "workflowID", "DbiCVtPPCT");
        setField(term3492, term3492.getClass(), "workflowVersion", "WzFopsaDuG");
        setField(term3492, term3492.getClass(), "vendor", "PapWxkhEWe");
        setField(term3491, term3491.getClass(), "workflow", term3492);
        setField(term3491, term3491.getClass(), "filesKept", term3553);
        setField(term3491, term3491.getClass(), "failedToDelete", term3629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowCreateLocalResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailedToDelete", argTypes, term3491, args);
    }

};


