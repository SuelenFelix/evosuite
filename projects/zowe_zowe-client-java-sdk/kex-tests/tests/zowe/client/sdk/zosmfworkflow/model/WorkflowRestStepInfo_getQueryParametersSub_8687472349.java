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

public class WorkflowRestStepInfo_getQueryParametersSub_8687472349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13670;

    public WorkflowRestStepInfo_getQueryParametersSub_8687472349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term13707 = new Boolean(false);
        Boolean term13733 = new Boolean(false);
        Boolean term13747 = new Boolean(true);
        Boolean term13761 = new Boolean(false);
        Boolean term13775 = new Boolean(false);
        Boolean term13789 = new Boolean(true);
        Boolean term13851 = new Boolean(true);
        Boolean term13853 = new Boolean(false);
        ArrayList term13855 = new ArrayList();
        ((ArrayList) term13855).add("YaWdTQZkTw");
        ((ArrayList) term13855).add("QqsjlsXtmm");
        Boolean term13883 = new Boolean(false);
        Boolean term13897 = new Boolean(false);
        Boolean term13899 = new Boolean(false);
        Boolean term13949 = new Boolean(false);
        Boolean term13951 = new Boolean(true);
        ArrayList term13953 = new ArrayList();
        ((ArrayList) term13953).add((Object)null);
        ((ArrayList) term13953).add((Object)null);
        ((ArrayList) term13953).add((Object)null);
        term13670 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term13670, term13670.getClass(), "actualStatusCode", "UgvuvUxKed");
        setField(term13670, term13670.getClass(), "expectedStatusCode", "ljBBMsQpaM");
        setField(term13670, term13670.getClass(), "hostname", "hHNIOlOzJc");
        setField(term13670, term13670.getClass(), "hostnameSub", term13707);
        setField(term13670, term13670.getClass(), "httpMethod", "ALRSeULyWV");
        setField(term13670, term13670.getClass(), "port", "WVhzXHdyFF");
        setField(term13670, term13670.getClass(), "portSub", term13733);
        setField(term13670, term13670.getClass(), "queryParameters", "GLAWYoxkyw");
        setField(term13670, term13670.getClass(), "queryParametersSub", term13747);
        setField(term13670, term13670.getClass(), "requestBody", "cfpPTNNVnW");
        setField(term13670, term13670.getClass(), "requestBodySub", term13761);
        setField(term13670, term13670.getClass(), "schemeName", "VPkEFShMUB");
        setField(term13670, term13670.getClass(), "schemeNameSub", term13775);
        setField(term13670, term13670.getClass(), "uriPath", "ZIgHysIFcL");
        setField(term13670, term13670.getClass(), "uriPathSub", term13789);
        setField(term13670, term13670.getClass(), "name", "ofSfQtWBjp");
        setField(term13670, term13670.getClass(), "title", "vkbIpZOlcY");
        setField(term13670, term13670.getClass(), "description", "XbAeosZekH");
        setField(term13670, term13670.getClass(), "state", "EvGPvjswTz");
        setField(term13670, term13670.getClass(), "stepNumber", "lbnnCkEZgE");
        setField(term13670, term13670.getClass(), "optional", term13851);
        setField(term13670, term13670.getClass(), "autoEnable", term13853);
        setField(term13670, term13670.getClass(), "prereqStep", term13855);
        setField(term13670, term13670.getClass(), "userDefined", term13883);
        setField(term13670, term13670.getClass(), "runAsUser", "FuWUjAYXxz");
        setField(term13670, term13670.getClass(), "runAsUserDynamic", term13897);
        setField(term13670, term13670.getClass(), "isRestStep", term13899);
        setField(term13670, term13670.getClass(), "owner", "rKIvvYydou");
        setField(term13670, term13670.getClass(), "assignees", "KNgeIkQoef");
        setField(term13670, term13670.getClass(), "skills", "MeMWAHyjMR");
        setField(term13670, term13670.getClass(), "weight", "lTuLOcnSnJ");
        setField(term13670, term13670.getClass(), "hasCalledWorkflow", term13949);
        setField(term13670, term13670.getClass(), "isConditionStep", term13951);
        setField(term13670, term13670.getClass(), "steps", term13953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQueryParametersSub", argTypes, term13670, args);
    }

};


