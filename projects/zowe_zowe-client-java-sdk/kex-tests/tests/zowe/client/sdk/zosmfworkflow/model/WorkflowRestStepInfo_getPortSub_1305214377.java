package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class WorkflowRestStepInfo_getPortSub_1305214377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12434;

    public WorkflowRestStepInfo_getPortSub_1305214377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term12471 = new Boolean(true);
        Boolean term12497 = new Boolean(false);
        Boolean term12511 = new Boolean(false);
        Boolean term12525 = new Boolean(false);
        Boolean term12539 = new Boolean(false);
        Boolean term12553 = new Boolean(false);
        Boolean term12615 = new Boolean(false);
        Boolean term12617 = new Boolean(true);
        ArrayList term12619 = new ArrayList();
        ((ArrayList) term12619).add("jEdjRikQtN");
        ((ArrayList) term12619).add("fSNUaokVWs");
        ((ArrayList) term12619).add("dTxnMmHoVm");
        ((ArrayList) term12619).add("iswxaQUQgT");
        ((ArrayList) term12619).add("MxUSQqhNse");
        ((ArrayList) term12619).add("skwxdosvQV");
        ((ArrayList) term12619).add("DBYTggnCkD");
        ((ArrayList) term12619).add("RyXrJxJQiY");
        ((ArrayList) term12619).add("JfnQeTdzWs");
        Boolean term12731 = new Boolean(false);
        Boolean term12745 = new Boolean(true);
        Boolean term12747 = new Boolean(true);
        Boolean term12797 = new Boolean(false);
        Boolean term12799 = new Boolean(false);
        ArrayList term12801 = new ArrayList();
        ((ArrayList) term12801).add((Object)null);
        ((ArrayList) term12801).add((Object)null);
        ((ArrayList) term12801).add((Object)null);
        ((ArrayList) term12801).add((Object)null);
        ((ArrayList) term12801).add((Object)null);
        ((ArrayList) term12801).add((Object)null);
        ((ArrayList) term12801).add((Object)null);
        ((ArrayList) term12801).add((Object)null);
        term12434 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term12434, term12434.getClass(), "actualStatusCode", "PqduvNFXXw");
        setField(term12434, term12434.getClass(), "expectedStatusCode", "bMQrxvaBAI");
        setField(term12434, term12434.getClass(), "hostname", "StFtysZlWm");
        setField(term12434, term12434.getClass(), "hostnameSub", term12471);
        setField(term12434, term12434.getClass(), "httpMethod", "CoqUcmjnkF");
        setField(term12434, term12434.getClass(), "port", "oOrXvGaFwa");
        setField(term12434, term12434.getClass(), "portSub", term12497);
        setField(term12434, term12434.getClass(), "queryParameters", "KJSTLGsSvO");
        setField(term12434, term12434.getClass(), "queryParametersSub", term12511);
        setField(term12434, term12434.getClass(), "requestBody", "kSkiIpaepq");
        setField(term12434, term12434.getClass(), "requestBodySub", term12525);
        setField(term12434, term12434.getClass(), "schemeName", "FzJhDecyvI");
        setField(term12434, term12434.getClass(), "schemeNameSub", term12539);
        setField(term12434, term12434.getClass(), "uriPath", "zOxseYMSdY");
        setField(term12434, term12434.getClass(), "uriPathSub", term12553);
        setField(term12434, term12434.getClass(), "name", "jEKlkqpHMQ");
        setField(term12434, term12434.getClass(), "title", "QpEVWispEh");
        setField(term12434, term12434.getClass(), "description", "STofGrqXqL");
        setField(term12434, term12434.getClass(), "state", "IoRhBfdSuN");
        setField(term12434, term12434.getClass(), "stepNumber", "JGdxVjQzts");
        setField(term12434, term12434.getClass(), "optional", term12615);
        setField(term12434, term12434.getClass(), "autoEnable", term12617);
        setField(term12434, term12434.getClass(), "prereqStep", term12619);
        setField(term12434, term12434.getClass(), "userDefined", term12731);
        setField(term12434, term12434.getClass(), "runAsUser", "HGhGqMiMOk");
        setField(term12434, term12434.getClass(), "runAsUserDynamic", term12745);
        setField(term12434, term12434.getClass(), "isRestStep", term12747);
        setField(term12434, term12434.getClass(), "owner", "VtTzFdKpZI");
        setField(term12434, term12434.getClass(), "assignees", "yCqQIOXRXO");
        setField(term12434, term12434.getClass(), "skills", "aevLPMVcYW");
        setField(term12434, term12434.getClass(), "weight", "orHcHVrwHz");
        setField(term12434, term12434.getClass(), "hasCalledWorkflow", term12797);
        setField(term12434, term12434.getClass(), "isConditionStep", term12799);
        setField(term12434, term12434.getClass(), "steps", term12801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPortSub", argTypes, term12434, args);
    }

};


