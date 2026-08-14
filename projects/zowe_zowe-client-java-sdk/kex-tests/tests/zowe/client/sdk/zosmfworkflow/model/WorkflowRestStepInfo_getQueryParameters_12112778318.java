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

public class WorkflowRestStepInfo_getQueryParameters_12112778318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13085;

    public WorkflowRestStepInfo_getQueryParameters_12112778318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term13122 = new Boolean(true);
        Boolean term13148 = new Boolean(true);
        Boolean term13162 = new Boolean(true);
        Boolean term13176 = new Boolean(true);
        Boolean term13190 = new Boolean(false);
        Boolean term13204 = new Boolean(false);
        Boolean term13266 = new Boolean(false);
        Boolean term13268 = new Boolean(true);
        ArrayList term13270 = new ArrayList();
        ((ArrayList) term13270).add("FQODEbQeKa");
        ((ArrayList) term13270).add("iLsUPvsdys");
        ((ArrayList) term13270).add("zsglFxvzdp");
        ((ArrayList) term13270).add("zhXtSGLnJR");
        ((ArrayList) term13270).add("XlNXxsYNss");
        ((ArrayList) term13270).add("jheRZWjuaB");
        Boolean term13346 = new Boolean(true);
        Boolean term13360 = new Boolean(false);
        Boolean term13362 = new Boolean(true);
        Boolean term13412 = new Boolean(true);
        Boolean term13414 = new Boolean(false);
        ArrayList term13416 = new ArrayList();
        ((ArrayList) term13416).add((Object)null);
        ((ArrayList) term13416).add((Object)null);
        ((ArrayList) term13416).add((Object)null);
        ((ArrayList) term13416).add((Object)null);
        ((ArrayList) term13416).add((Object)null);
        ((ArrayList) term13416).add((Object)null);
        ((ArrayList) term13416).add((Object)null);
        term13085 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term13085, term13085.getClass(), "actualStatusCode", "mkEWcQdwUn");
        setField(term13085, term13085.getClass(), "expectedStatusCode", "VRjVlzFSIx");
        setField(term13085, term13085.getClass(), "hostname", "fNlDLqQZFT");
        setField(term13085, term13085.getClass(), "hostnameSub", term13122);
        setField(term13085, term13085.getClass(), "httpMethod", "szCfpoTDXX");
        setField(term13085, term13085.getClass(), "port", "blnSDUyHkS");
        setField(term13085, term13085.getClass(), "portSub", term13148);
        setField(term13085, term13085.getClass(), "queryParameters", "byyepwHlHN");
        setField(term13085, term13085.getClass(), "queryParametersSub", term13162);
        setField(term13085, term13085.getClass(), "requestBody", "akVNsUcFra");
        setField(term13085, term13085.getClass(), "requestBodySub", term13176);
        setField(term13085, term13085.getClass(), "schemeName", "BKiHMTzLoY");
        setField(term13085, term13085.getClass(), "schemeNameSub", term13190);
        setField(term13085, term13085.getClass(), "uriPath", "arrHHpXCBD");
        setField(term13085, term13085.getClass(), "uriPathSub", term13204);
        setField(term13085, term13085.getClass(), "name", "zzfzxQYlis");
        setField(term13085, term13085.getClass(), "title", "TJJQwVEzxz");
        setField(term13085, term13085.getClass(), "description", "kHtEHBrsFo");
        setField(term13085, term13085.getClass(), "state", "EmAvkhGlPV");
        setField(term13085, term13085.getClass(), "stepNumber", "mBrbyQVzve");
        setField(term13085, term13085.getClass(), "optional", term13266);
        setField(term13085, term13085.getClass(), "autoEnable", term13268);
        setField(term13085, term13085.getClass(), "prereqStep", term13270);
        setField(term13085, term13085.getClass(), "userDefined", term13346);
        setField(term13085, term13085.getClass(), "runAsUser", "IERziToRSQ");
        setField(term13085, term13085.getClass(), "runAsUserDynamic", term13360);
        setField(term13085, term13085.getClass(), "isRestStep", term13362);
        setField(term13085, term13085.getClass(), "owner", "mDTRMwjBpc");
        setField(term13085, term13085.getClass(), "assignees", "sCLAuKoiVL");
        setField(term13085, term13085.getClass(), "skills", "pFWiDEnVnU");
        setField(term13085, term13085.getClass(), "weight", "NeEetzFhTt");
        setField(term13085, term13085.getClass(), "hasCalledWorkflow", term13412);
        setField(term13085, term13085.getClass(), "isConditionStep", term13414);
        setField(term13085, term13085.getClass(), "steps", term13416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQueryParameters", argTypes, term13085, args);
    }

};


