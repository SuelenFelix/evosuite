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

public class WorkflowGetPropertiesResponse_getRegistryID_907345731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28498;

    public WorkflowGetPropertiesResponse_getRegistryID_907345731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28679 = new Integer(-244121226);
        Boolean term28681 = new Boolean(true);
        Boolean term28683 = new Boolean(true);
        Boolean term28709 = new Boolean(false);
        Long term28724 = new Long(-3838084482494604218L);
        Long term28726 = new Long(3892018155439224435L);
        Boolean term28788 = new Boolean(false);
        ArrayList term28946 = new ArrayList();
        ((ArrayList) term28946).add((Object)null);
        ((ArrayList) term28946).add((Object)null);
        ((ArrayList) term28946).add((Object)null);
        ((ArrayList) term28946).add((Object)null);
        ((ArrayList) term28946).add((Object)null);
        ((ArrayList) term28946).add((Object)null);
        ((ArrayList) term28946).add((Object)null);
        ((ArrayList) term28946).add((Object)null);
        ArrayList term28950 = new ArrayList();
        term28498 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term28711 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term28498, term28498.getClass(), "workflowName", "eZGxUfdoFn");
        setField(term28498, term28498.getClass(), "workflowKey", "yCWSlaOrSv");
        setField(term28498, term28498.getClass(), "workflowDescription", "PFpWKxDIRz");
        setField(term28498, term28498.getClass(), "workflowID", "qePuOCwoCf");
        setField(term28498, term28498.getClass(), "workflowVersion", "vJPujDInGq");
        setField(term28498, term28498.getClass(), "workflowDefinitionFileMD5Value", "cHZGcMhatT");
        setField(term28498, term28498.getClass(), "vendor", "OZGyrUPedG");
        setField(term28498, term28498.getClass(), "owner", "GAxMzRqmXU");
        setField(term28498, term28498.getClass(), "workflowArchiveSAFID", "XMhUDGKSWO");
        setField(term28498, term28498.getClass(), "system", "jLgzxtuvVo");
        setField(term28498, term28498.getClass(), "jobsOutputDirectory", "wmmxjOkPnH");
        setField(term28498, term28498.getClass(), "category", "jgRohUQWxJ");
        setField(term28498, term28498.getClass(), "productID", "CJlAiZDIQO");
        setField(term28498, term28498.getClass(), "productName", "osgWaTBVoE");
        setField(term28498, term28498.getClass(), "productVersion", "mvkMYcgAod");
        setField(term28498, term28498.getClass(), "percentComplete", term28679);
        setField(term28498, term28498.getClass(), "isCallable", term28681);
        setField(term28498, term28498.getClass(), "containsParallelSteps", term28683);
        setField(term28498, term28498.getClass(), "scope", "esbhDGQDgF");
        setField(term28498, term28498.getClass(), "statusName", "tKlyiBloWu");
        setField(term28498, term28498.getClass(), "deleteCompletedJobs", term28709);
        setField(term28711, term28711.getClass(), "startUser", "uIgRFcwqLd");
        setField(term28711, term28711.getClass(), "startedTime", term28724);
        setField(term28711, term28711.getClass(), "stoppedTime", term28726);
        setField(term28711, term28711.getClass(), "currentStepName", "AvdsiEyCve");
        setField(term28711, term28711.getClass(), "currentStepNumber", "XMArCaVAEc");
        setField(term28711, term28711.getClass(), "currentStepTitle", "URWnZtbrQH");
        setField(term28711, term28711.getClass(), "messageID", "hpTAdtnQku");
        setField(term28711, term28711.getClass(), "messageText", "GdMAXFBAtl");
        setField(term28498, term28498.getClass(), "automationStatus", term28711);
        setField(term28498, term28498.getClass(), "autoDeleteOnCompletion", term28788);
        setField(term28498, term28498.getClass(), "access", "KWVRAlcIqd");
        setField(term28498, term28498.getClass(), "accountInfo", "GeVOqtDiGv");
        setField(term28498, term28498.getClass(), "jobStatement", "vbRAJCwftU");
        setField(term28498, term28498.getClass(), "templateID", "baJbjUImxp");
        setField(term28498, term28498.getClass(), "actionID", "lPERFqPpGz");
        setField(term28498, term28498.getClass(), "registryID", "jleFBTYSNb");
        setField(term28498, term28498.getClass(), "parentRegistryID", "WmSSWHEELj");
        setField(term28498, term28498.getClass(), "domainID", "ggFhMyQvdw");
        setField(term28498, term28498.getClass(), "tenantID", "vZpMxQNHKu");
        setField(term28498, term28498.getClass(), "softwareServiceInstanceName", "QLMSDWYwBC");
        setField(term28498, term28498.getClass(), "templateName", "feyxNWUenU");
        setField(term28498, term28498.getClass(), "globalVariableGroup", "qvqwmSUIiP");
        setField(term28498, term28498.getClass(), "isInstanceVariableWithoutPrefix", "eNOEXYoAtV");
        setField(term28498, term28498.getClass(), "steps", term28946);
        setField(term28498, term28498.getClass(), "variables", term28950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegistryID", argTypes, term28498, args);
    }

};


