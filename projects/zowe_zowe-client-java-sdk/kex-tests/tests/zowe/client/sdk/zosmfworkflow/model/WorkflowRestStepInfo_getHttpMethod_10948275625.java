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

public class WorkflowRestStepInfo_getHttpMethod_10948275625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11308;

    public WorkflowRestStepInfo_getHttpMethod_10948275625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term11345 = new Boolean(false);
        Boolean term11371 = new Boolean(false);
        Boolean term11385 = new Boolean(true);
        Boolean term11399 = new Boolean(true);
        Boolean term11413 = new Boolean(true);
        Boolean term11427 = new Boolean(true);
        Boolean term11489 = new Boolean(false);
        Boolean term11491 = new Boolean(false);
        ArrayList term11493 = new ArrayList();
        ((ArrayList) term11493).add("uCdLbhvYeG");
        ((ArrayList) term11493).add("ipoyEHBfoG");
        ((ArrayList) term11493).add("iSBTpbiteU");
        Boolean term11533 = new Boolean(false);
        Boolean term11547 = new Boolean(true);
        Boolean term11549 = new Boolean(false);
        Boolean term11599 = new Boolean(false);
        Boolean term11601 = new Boolean(false);
        ArrayList term11603 = new ArrayList();
        ((ArrayList) term11603).add((Object)null);
        ((ArrayList) term11603).add((Object)null);
        ((ArrayList) term11603).add((Object)null);
        ((ArrayList) term11603).add((Object)null);
        ((ArrayList) term11603).add((Object)null);
        ((ArrayList) term11603).add((Object)null);
        ((ArrayList) term11603).add((Object)null);
        term11308 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term11308, term11308.getClass(), "actualStatusCode", "IXQQwaXITf");
        setField(term11308, term11308.getClass(), "expectedStatusCode", "fNzFTiRCjp");
        setField(term11308, term11308.getClass(), "hostname", "yaCGGogKro");
        setField(term11308, term11308.getClass(), "hostnameSub", term11345);
        setField(term11308, term11308.getClass(), "httpMethod", "qxrRUnjshF");
        setField(term11308, term11308.getClass(), "port", "WmVcapKAeJ");
        setField(term11308, term11308.getClass(), "portSub", term11371);
        setField(term11308, term11308.getClass(), "queryParameters", "jevOVdQdpc");
        setField(term11308, term11308.getClass(), "queryParametersSub", term11385);
        setField(term11308, term11308.getClass(), "requestBody", "TLLVSGTNsz");
        setField(term11308, term11308.getClass(), "requestBodySub", term11399);
        setField(term11308, term11308.getClass(), "schemeName", "mbBWfaHCrP");
        setField(term11308, term11308.getClass(), "schemeNameSub", term11413);
        setField(term11308, term11308.getClass(), "uriPath", "wFyiZloCxg");
        setField(term11308, term11308.getClass(), "uriPathSub", term11427);
        setField(term11308, term11308.getClass(), "name", "xYztJEIPWy");
        setField(term11308, term11308.getClass(), "title", "TDQIAXaJru");
        setField(term11308, term11308.getClass(), "description", "frPMFqGmrE");
        setField(term11308, term11308.getClass(), "state", "DvfOYWcNBN");
        setField(term11308, term11308.getClass(), "stepNumber", "cvbvwpPlNk");
        setField(term11308, term11308.getClass(), "optional", term11489);
        setField(term11308, term11308.getClass(), "autoEnable", term11491);
        setField(term11308, term11308.getClass(), "prereqStep", term11493);
        setField(term11308, term11308.getClass(), "userDefined", term11533);
        setField(term11308, term11308.getClass(), "runAsUser", "MTwFbEoMZj");
        setField(term11308, term11308.getClass(), "runAsUserDynamic", term11547);
        setField(term11308, term11308.getClass(), "isRestStep", term11549);
        setField(term11308, term11308.getClass(), "owner", "uEQbnHbyAn");
        setField(term11308, term11308.getClass(), "assignees", "JpFIuyNEKW");
        setField(term11308, term11308.getClass(), "skills", "NksHsgcqDx");
        setField(term11308, term11308.getClass(), "weight", "RjSNvOEvcT");
        setField(term11308, term11308.getClass(), "hasCalledWorkflow", term11599);
        setField(term11308, term11308.getClass(), "isConditionStep", term11601);
        setField(term11308, term11308.getClass(), "steps", term11603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpMethod", argTypes, term11308, args);
    }

};


