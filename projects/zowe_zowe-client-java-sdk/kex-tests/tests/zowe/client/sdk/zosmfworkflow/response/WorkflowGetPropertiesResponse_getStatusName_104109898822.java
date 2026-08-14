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

public class WorkflowGetPropertiesResponse_getStatusName_104109898822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21016;

    public WorkflowGetPropertiesResponse_getStatusName_104109898822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21197 = new Integer(-655067527);
        Boolean term21199 = new Boolean(false);
        Boolean term21201 = new Boolean(false);
        Boolean term21227 = new Boolean(true);
        Long term21242 = new Long(4178434741742309755L);
        Long term21244 = new Long(-2068172595987555756L);
        Boolean term21306 = new Boolean(false);
        ArrayList term21464 = new ArrayList();
        ((ArrayList) term21464).add((Object)null);
        Object term21470 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term21470, term21470.getClass(), "name", "");
        setField(term21470, term21470.getClass(), "scope", "");
        setField(term21470, term21470.getClass(), "type", "");
        setField(term21470, term21470.getClass(), "value", "");
        setField(term21470, term21470.getClass(), "visibility", "");
        Object term21476 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term21476, term21476.getClass(), "name", "");
        setField(term21476, term21476.getClass(), "scope", "");
        setField(term21476, term21476.getClass(), "type", "");
        setField(term21476, term21476.getClass(), "value", "");
        setField(term21476, term21476.getClass(), "visibility", "");
        Object term21482 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term21482, term21482.getClass(), "name", "");
        setField(term21482, term21482.getClass(), "scope", "");
        setField(term21482, term21482.getClass(), "type", "");
        setField(term21482, term21482.getClass(), "value", "");
        setField(term21482, term21482.getClass(), "visibility", "");
        Object term21488 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term21488, term21488.getClass(), "name", "");
        setField(term21488, term21488.getClass(), "scope", "");
        setField(term21488, term21488.getClass(), "type", "");
        setField(term21488, term21488.getClass(), "value", "");
        setField(term21488, term21488.getClass(), "visibility", "");
        Object term21494 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term21494, term21494.getClass(), "name", "");
        setField(term21494, term21494.getClass(), "scope", "");
        setField(term21494, term21494.getClass(), "type", "");
        setField(term21494, term21494.getClass(), "value", "");
        setField(term21494, term21494.getClass(), "visibility", "");
        Object term21500 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term21500, term21500.getClass(), "name", "");
        setField(term21500, term21500.getClass(), "scope", "");
        setField(term21500, term21500.getClass(), "type", "");
        setField(term21500, term21500.getClass(), "value", "");
        setField(term21500, term21500.getClass(), "visibility", "");
        ArrayList term21468 = new ArrayList();
        ((ArrayList) term21468).add(term21470);
        ((ArrayList) term21468).add(term21476);
        ((ArrayList) term21468).add(term21482);
        ((ArrayList) term21468).add(term21488);
        ((ArrayList) term21468).add(term21494);
        ((ArrayList) term21468).add(term21500);
        term21016 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term21229 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term21016, term21016.getClass(), "workflowName", "sAgGDoUNlf");
        setField(term21016, term21016.getClass(), "workflowKey", "TSTZcXdFFi");
        setField(term21016, term21016.getClass(), "workflowDescription", "RyaaOzWfYO");
        setField(term21016, term21016.getClass(), "workflowID", "HAkxFBZZzz");
        setField(term21016, term21016.getClass(), "workflowVersion", "yejonZnVuy");
        setField(term21016, term21016.getClass(), "workflowDefinitionFileMD5Value", "ouesGIsvuG");
        setField(term21016, term21016.getClass(), "vendor", "pHBHlmLIZQ");
        setField(term21016, term21016.getClass(), "owner", "ZWRAbOuktl");
        setField(term21016, term21016.getClass(), "workflowArchiveSAFID", "iqFRvFmVID");
        setField(term21016, term21016.getClass(), "system", "pNAEtppZdv");
        setField(term21016, term21016.getClass(), "jobsOutputDirectory", "VsFWNMdyRt");
        setField(term21016, term21016.getClass(), "category", "QaoYFZhScg");
        setField(term21016, term21016.getClass(), "productID", "UTvXIenLCR");
        setField(term21016, term21016.getClass(), "productName", "PLeKpWaxhQ");
        setField(term21016, term21016.getClass(), "productVersion", "EBSKhqDdUW");
        setField(term21016, term21016.getClass(), "percentComplete", term21197);
        setField(term21016, term21016.getClass(), "isCallable", term21199);
        setField(term21016, term21016.getClass(), "containsParallelSteps", term21201);
        setField(term21016, term21016.getClass(), "scope", "LvLbdICdfA");
        setField(term21016, term21016.getClass(), "statusName", "rtifrlITwl");
        setField(term21016, term21016.getClass(), "deleteCompletedJobs", term21227);
        setField(term21229, term21229.getClass(), "startUser", "yGWXZDjnPS");
        setField(term21229, term21229.getClass(), "startedTime", term21242);
        setField(term21229, term21229.getClass(), "stoppedTime", term21244);
        setField(term21229, term21229.getClass(), "currentStepName", "vZucxbGVyo");
        setField(term21229, term21229.getClass(), "currentStepNumber", "ZZoLNbeORl");
        setField(term21229, term21229.getClass(), "currentStepTitle", "XjIOUIzJUP");
        setField(term21229, term21229.getClass(), "messageID", "iGTpXnnTqB");
        setField(term21229, term21229.getClass(), "messageText", "XgJzBOYfQB");
        setField(term21016, term21016.getClass(), "automationStatus", term21229);
        setField(term21016, term21016.getClass(), "autoDeleteOnCompletion", term21306);
        setField(term21016, term21016.getClass(), "access", "GAPGgDekVG");
        setField(term21016, term21016.getClass(), "accountInfo", "WmTogHwGLE");
        setField(term21016, term21016.getClass(), "jobStatement", "qYOIXsGycY");
        setField(term21016, term21016.getClass(), "templateID", "sJNXNshRLe");
        setField(term21016, term21016.getClass(), "actionID", "AYnbmgRCKr");
        setField(term21016, term21016.getClass(), "registryID", "iQRfDlaoYD");
        setField(term21016, term21016.getClass(), "parentRegistryID", "kpcyrjDQzN");
        setField(term21016, term21016.getClass(), "domainID", "IyukykAHLQ");
        setField(term21016, term21016.getClass(), "tenantID", "CwZcgFJqMh");
        setField(term21016, term21016.getClass(), "softwareServiceInstanceName", "RldCZqgRbO");
        setField(term21016, term21016.getClass(), "templateName", "LOVugCAgJs");
        setField(term21016, term21016.getClass(), "globalVariableGroup", "SNmHXwCiFY");
        setField(term21016, term21016.getClass(), "isInstanceVariableWithoutPrefix", "HZfkWoqyUW");
        setField(term21016, term21016.getClass(), "steps", term21464);
        setField(term21016, term21016.getClass(), "variables", term21468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusName", argTypes, term21016, args);
    }

};


