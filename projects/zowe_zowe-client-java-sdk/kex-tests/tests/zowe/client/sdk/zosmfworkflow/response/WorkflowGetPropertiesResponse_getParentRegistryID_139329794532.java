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

public class WorkflowGetPropertiesResponse_getParentRegistryID_139329794532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29314;

    public WorkflowGetPropertiesResponse_getParentRegistryID_139329794532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29495 = new Integer(-203030934);
        Boolean term29497 = new Boolean(false);
        Boolean term29499 = new Boolean(false);
        Boolean term29525 = new Boolean(false);
        Long term29540 = new Long(5953383087795962419L);
        Long term29542 = new Long(7994303628307559416L);
        Boolean term29604 = new Boolean(false);
        ArrayList term29762 = new ArrayList();
        ((ArrayList) term29762).add((Object)null);
        ((ArrayList) term29762).add((Object)null);
        Object term29768 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term29768, term29768.getClass(), "name", "");
        setField(term29768, term29768.getClass(), "scope", "");
        setField(term29768, term29768.getClass(), "type", "");
        setField(term29768, term29768.getClass(), "value", "");
        setField(term29768, term29768.getClass(), "visibility", "");
        Object term29774 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term29774, term29774.getClass(), "name", "");
        setField(term29774, term29774.getClass(), "scope", "");
        setField(term29774, term29774.getClass(), "type", "");
        setField(term29774, term29774.getClass(), "value", "");
        setField(term29774, term29774.getClass(), "visibility", "");
        ArrayList term29766 = new ArrayList();
        ((ArrayList) term29766).add(term29768);
        ((ArrayList) term29766).add(term29774);
        term29314 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term29527 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term29314, term29314.getClass(), "workflowName", "SNqwfZGLFh");
        setField(term29314, term29314.getClass(), "workflowKey", "sMqpXbgEga");
        setField(term29314, term29314.getClass(), "workflowDescription", "nYJlDpoMcL");
        setField(term29314, term29314.getClass(), "workflowID", "SQnbnBmbcf");
        setField(term29314, term29314.getClass(), "workflowVersion", "jaNVteZrZi");
        setField(term29314, term29314.getClass(), "workflowDefinitionFileMD5Value", "bMRkDiPUGu");
        setField(term29314, term29314.getClass(), "vendor", "xjKxECGyLT");
        setField(term29314, term29314.getClass(), "owner", "ffKeJGEXBT");
        setField(term29314, term29314.getClass(), "workflowArchiveSAFID", "rsnXTpfhqf");
        setField(term29314, term29314.getClass(), "system", "gzvlGZVfnZ");
        setField(term29314, term29314.getClass(), "jobsOutputDirectory", "rmSqCaXWHi");
        setField(term29314, term29314.getClass(), "category", "ScztqspySK");
        setField(term29314, term29314.getClass(), "productID", "IvYxGwWoVu");
        setField(term29314, term29314.getClass(), "productName", "XnZHOhTfxL");
        setField(term29314, term29314.getClass(), "productVersion", "oFBhNamtAs");
        setField(term29314, term29314.getClass(), "percentComplete", term29495);
        setField(term29314, term29314.getClass(), "isCallable", term29497);
        setField(term29314, term29314.getClass(), "containsParallelSteps", term29499);
        setField(term29314, term29314.getClass(), "scope", "YURcpRjwSt");
        setField(term29314, term29314.getClass(), "statusName", "SXMdNSGPog");
        setField(term29314, term29314.getClass(), "deleteCompletedJobs", term29525);
        setField(term29527, term29527.getClass(), "startUser", "vsqwOLpDjj");
        setField(term29527, term29527.getClass(), "startedTime", term29540);
        setField(term29527, term29527.getClass(), "stoppedTime", term29542);
        setField(term29527, term29527.getClass(), "currentStepName", "rJgXQRsPCl");
        setField(term29527, term29527.getClass(), "currentStepNumber", "RgqpoBknjN");
        setField(term29527, term29527.getClass(), "currentStepTitle", "nUDhadopHE");
        setField(term29527, term29527.getClass(), "messageID", "vLrTnQTIPg");
        setField(term29527, term29527.getClass(), "messageText", "GsXvLZCFtf");
        setField(term29314, term29314.getClass(), "automationStatus", term29527);
        setField(term29314, term29314.getClass(), "autoDeleteOnCompletion", term29604);
        setField(term29314, term29314.getClass(), "access", "JqSCTBGSUs");
        setField(term29314, term29314.getClass(), "accountInfo", "bZrrPiMnsr");
        setField(term29314, term29314.getClass(), "jobStatement", "IeromvfDmz");
        setField(term29314, term29314.getClass(), "templateID", "xJLHPTRSqe");
        setField(term29314, term29314.getClass(), "actionID", "OIFZYdbUZz");
        setField(term29314, term29314.getClass(), "registryID", "FPablxseTr");
        setField(term29314, term29314.getClass(), "parentRegistryID", "wNndrIQDbr");
        setField(term29314, term29314.getClass(), "domainID", "JiSIFtJnYv");
        setField(term29314, term29314.getClass(), "tenantID", "wxAHQRVgKc");
        setField(term29314, term29314.getClass(), "softwareServiceInstanceName", "bYsZEHeoeV");
        setField(term29314, term29314.getClass(), "templateName", "IwvwrQylib");
        setField(term29314, term29314.getClass(), "globalVariableGroup", "ZWJgSttNjg");
        setField(term29314, term29314.getClass(), "isInstanceVariableWithoutPrefix", "LQTIjJLkXH");
        setField(term29314, term29314.getClass(), "steps", term29762);
        setField(term29314, term29314.getClass(), "variables", term29766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentRegistryID", argTypes, term29314, args);
    }

};


