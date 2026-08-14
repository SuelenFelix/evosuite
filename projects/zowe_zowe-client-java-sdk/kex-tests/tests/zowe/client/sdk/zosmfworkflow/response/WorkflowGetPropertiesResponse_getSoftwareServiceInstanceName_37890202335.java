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
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class WorkflowGetPropertiesResponse_getSoftwareServiceInstanceName_37890202335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31822;

    public WorkflowGetPropertiesResponse_getSoftwareServiceInstanceName_37890202335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32003 = new Integer(-226514366);
        Boolean term32005 = new Boolean(false);
        Boolean term32007 = new Boolean(true);
        Boolean term32033 = new Boolean(false);
        Long term32048 = new Long(414749984815662075L);
        Long term32050 = new Long(463622836963501975L);
        Boolean term32112 = new Boolean(true);
        ArrayList term32270 = new ArrayList();
        ((ArrayList) term32270).add((Object)null);
        ((ArrayList) term32270).add((Object)null);
        ((ArrayList) term32270).add((Object)null);
        ((ArrayList) term32270).add((Object)null);
        Object term32276 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term32276, term32276.getClass(), "name", "");
        setField(term32276, term32276.getClass(), "scope", "");
        setField(term32276, term32276.getClass(), "type", "");
        setField(term32276, term32276.getClass(), "value", "");
        setField(term32276, term32276.getClass(), "visibility", "");
        Object term32282 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term32282, term32282.getClass(), "name", "");
        setField(term32282, term32282.getClass(), "scope", "");
        setField(term32282, term32282.getClass(), "type", "");
        setField(term32282, term32282.getClass(), "value", "");
        setField(term32282, term32282.getClass(), "visibility", "");
        Object term32288 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term32288, term32288.getClass(), "name", "");
        setField(term32288, term32288.getClass(), "scope", "");
        setField(term32288, term32288.getClass(), "type", "");
        setField(term32288, term32288.getClass(), "value", "");
        setField(term32288, term32288.getClass(), "visibility", "");
        ArrayList term32274 = new ArrayList();
        ((ArrayList) term32274).add(term32276);
        ((ArrayList) term32274).add(term32282);
        ((ArrayList) term32274).add(term32288);
        term31822 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term32035 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term31822, term31822.getClass(), "workflowName", "zhXtSGLnJR");
        setField(term31822, term31822.getClass(), "workflowKey", "XlNXxsYNss");
        setField(term31822, term31822.getClass(), "workflowDescription", "jheRZWjuaB");
        setField(term31822, term31822.getClass(), "workflowID", "IERziToRSQ");
        setField(term31822, term31822.getClass(), "workflowVersion", "mDTRMwjBpc");
        setField(term31822, term31822.getClass(), "workflowDefinitionFileMD5Value", "sCLAuKoiVL");
        setField(term31822, term31822.getClass(), "vendor", "pFWiDEnVnU");
        setField(term31822, term31822.getClass(), "owner", "NeEetzFhTt");
        setField(term31822, term31822.getClass(), "workflowArchiveSAFID", "UgvuvUxKed");
        setField(term31822, term31822.getClass(), "system", "ljBBMsQpaM");
        setField(term31822, term31822.getClass(), "jobsOutputDirectory", "hHNIOlOzJc");
        setField(term31822, term31822.getClass(), "category", "ALRSeULyWV");
        setField(term31822, term31822.getClass(), "productID", "WVhzXHdyFF");
        setField(term31822, term31822.getClass(), "productName", "GLAWYoxkyw");
        setField(term31822, term31822.getClass(), "productVersion", "cfpPTNNVnW");
        setField(term31822, term31822.getClass(), "percentComplete", term32003);
        setField(term31822, term31822.getClass(), "isCallable", term32005);
        setField(term31822, term31822.getClass(), "containsParallelSteps", term32007);
        setField(term31822, term31822.getClass(), "scope", "VPkEFShMUB");
        setField(term31822, term31822.getClass(), "statusName", "ZIgHysIFcL");
        setField(term31822, term31822.getClass(), "deleteCompletedJobs", term32033);
        setField(term32035, term32035.getClass(), "startUser", "ofSfQtWBjp");
        setField(term32035, term32035.getClass(), "startedTime", term32048);
        setField(term32035, term32035.getClass(), "stoppedTime", term32050);
        setField(term32035, term32035.getClass(), "currentStepName", "vkbIpZOlcY");
        setField(term32035, term32035.getClass(), "currentStepNumber", "XbAeosZekH");
        setField(term32035, term32035.getClass(), "currentStepTitle", "EvGPvjswTz");
        setField(term32035, term32035.getClass(), "messageID", "lbnnCkEZgE");
        setField(term32035, term32035.getClass(), "messageText", "YaWdTQZkTw");
        setField(term31822, term31822.getClass(), "automationStatus", term32035);
        setField(term31822, term31822.getClass(), "autoDeleteOnCompletion", term32112);
        setField(term31822, term31822.getClass(), "access", "QqsjlsXtmm");
        setField(term31822, term31822.getClass(), "accountInfo", "FuWUjAYXxz");
        setField(term31822, term31822.getClass(), "jobStatement", "rKIvvYydou");
        setField(term31822, term31822.getClass(), "templateID", "KNgeIkQoef");
        setField(term31822, term31822.getClass(), "actionID", "MeMWAHyjMR");
        setField(term31822, term31822.getClass(), "registryID", "lTuLOcnSnJ");
        setField(term31822, term31822.getClass(), "parentRegistryID", "govbBrRstA");
        setField(term31822, term31822.getClass(), "domainID", "zSMUNzRRyM");
        setField(term31822, term31822.getClass(), "tenantID", "aKwJiIZSjJ");
        setField(term31822, term31822.getClass(), "softwareServiceInstanceName", "lYbeaINKud");
        setField(term31822, term31822.getClass(), "templateName", "BrwuUkkatt");
        setField(term31822, term31822.getClass(), "globalVariableGroup", "NjmSJhbVEM");
        setField(term31822, term31822.getClass(), "isInstanceVariableWithoutPrefix", "aftnGRjhKN");
        setField(term31822, term31822.getClass(), "steps", term32270);
        setField(term31822, term31822.getClass(), "variables", term32274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSoftwareServiceInstanceName", argTypes, term31822, args);
    }

};


