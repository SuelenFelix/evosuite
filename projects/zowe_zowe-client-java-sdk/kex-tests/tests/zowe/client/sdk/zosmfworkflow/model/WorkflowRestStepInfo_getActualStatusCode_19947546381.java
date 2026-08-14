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

public class WorkflowRestStepInfo_getActualStatusCode_19947546381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9100;

    public WorkflowRestStepInfo_getActualStatusCode_19947546381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term9137 = new Boolean(true);
        Boolean term9163 = new Boolean(true);
        Boolean term9177 = new Boolean(true);
        Boolean term9191 = new Boolean(false);
        Boolean term9205 = new Boolean(true);
        Boolean term9219 = new Boolean(false);
        Boolean term9281 = new Boolean(true);
        Boolean term9283 = new Boolean(true);
        ArrayList term9285 = new ArrayList();
        ((ArrayList) term9285).add("hpTAdtnQku");
        ((ArrayList) term9285).add("GdMAXFBAtl");
        Boolean term9313 = new Boolean(false);
        Boolean term9327 = new Boolean(false);
        Boolean term9329 = new Boolean(false);
        Boolean term9379 = new Boolean(false);
        Boolean term9381 = new Boolean(true);
        ArrayList term9383 = new ArrayList();
        ((ArrayList) term9383).add((Object)null);
        ((ArrayList) term9383).add((Object)null);
        ((ArrayList) term9383).add((Object)null);
        ((ArrayList) term9383).add((Object)null);
        ((ArrayList) term9383).add((Object)null);
        ((ArrayList) term9383).add((Object)null);
        ((ArrayList) term9383).add((Object)null);
        ((ArrayList) term9383).add((Object)null);
        term9100 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term9100, term9100.getClass(), "actualStatusCode", "GAxMzRqmXU");
        setField(term9100, term9100.getClass(), "expectedStatusCode", "XMhUDGKSWO");
        setField(term9100, term9100.getClass(), "hostname", "jLgzxtuvVo");
        setField(term9100, term9100.getClass(), "hostnameSub", term9137);
        setField(term9100, term9100.getClass(), "httpMethod", "wmmxjOkPnH");
        setField(term9100, term9100.getClass(), "port", "jgRohUQWxJ");
        setField(term9100, term9100.getClass(), "portSub", term9163);
        setField(term9100, term9100.getClass(), "queryParameters", "CJlAiZDIQO");
        setField(term9100, term9100.getClass(), "queryParametersSub", term9177);
        setField(term9100, term9100.getClass(), "requestBody", "osgWaTBVoE");
        setField(term9100, term9100.getClass(), "requestBodySub", term9191);
        setField(term9100, term9100.getClass(), "schemeName", "mvkMYcgAod");
        setField(term9100, term9100.getClass(), "schemeNameSub", term9205);
        setField(term9100, term9100.getClass(), "uriPath", "esbhDGQDgF");
        setField(term9100, term9100.getClass(), "uriPathSub", term9219);
        setField(term9100, term9100.getClass(), "name", "tKlyiBloWu");
        setField(term9100, term9100.getClass(), "title", "uIgRFcwqLd");
        setField(term9100, term9100.getClass(), "description", "AvdsiEyCve");
        setField(term9100, term9100.getClass(), "state", "XMArCaVAEc");
        setField(term9100, term9100.getClass(), "stepNumber", "URWnZtbrQH");
        setField(term9100, term9100.getClass(), "optional", term9281);
        setField(term9100, term9100.getClass(), "autoEnable", term9283);
        setField(term9100, term9100.getClass(), "prereqStep", term9285);
        setField(term9100, term9100.getClass(), "userDefined", term9313);
        setField(term9100, term9100.getClass(), "runAsUser", "KWVRAlcIqd");
        setField(term9100, term9100.getClass(), "runAsUserDynamic", term9327);
        setField(term9100, term9100.getClass(), "isRestStep", term9329);
        setField(term9100, term9100.getClass(), "owner", "GeVOqtDiGv");
        setField(term9100, term9100.getClass(), "assignees", "vbRAJCwftU");
        setField(term9100, term9100.getClass(), "skills", "baJbjUImxp");
        setField(term9100, term9100.getClass(), "weight", "lPERFqPpGz");
        setField(term9100, term9100.getClass(), "hasCalledWorkflow", term9379);
        setField(term9100, term9100.getClass(), "isConditionStep", term9381);
        setField(term9100, term9100.getClass(), "steps", term9383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActualStatusCode", argTypes, term9100, args);
    }

};


