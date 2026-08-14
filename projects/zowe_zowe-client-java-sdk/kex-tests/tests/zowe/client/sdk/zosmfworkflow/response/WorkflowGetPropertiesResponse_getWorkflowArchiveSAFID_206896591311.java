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

public class WorkflowGetPropertiesResponse_getWorkflowArchiveSAFID_206896591311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11890;

    public WorkflowGetPropertiesResponse_getWorkflowArchiveSAFID_206896591311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12071 = new Integer(-1339778481);
        Boolean term12073 = new Boolean(true);
        Boolean term12075 = new Boolean(true);
        Boolean term12101 = new Boolean(true);
        Long term12116 = new Long(-6573104506744284592L);
        Long term12118 = new Long(-4920224193275732920L);
        Boolean term12180 = new Boolean(false);
        ArrayList term12338 = new ArrayList();
        ((ArrayList) term12338).add((Object)null);
        ((ArrayList) term12338).add((Object)null);
        ((ArrayList) term12338).add((Object)null);
        Object term12344 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term12344, term12344.getClass(), "name", "");
        setField(term12344, term12344.getClass(), "scope", "");
        setField(term12344, term12344.getClass(), "type", "");
        setField(term12344, term12344.getClass(), "value", "");
        setField(term12344, term12344.getClass(), "visibility", "");
        Object term12350 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term12350, term12350.getClass(), "name", "");
        setField(term12350, term12350.getClass(), "scope", "");
        setField(term12350, term12350.getClass(), "type", "");
        setField(term12350, term12350.getClass(), "value", "");
        setField(term12350, term12350.getClass(), "visibility", "");
        Object term12356 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term12356, term12356.getClass(), "name", "");
        setField(term12356, term12356.getClass(), "scope", "");
        setField(term12356, term12356.getClass(), "type", "");
        setField(term12356, term12356.getClass(), "value", "");
        setField(term12356, term12356.getClass(), "visibility", "");
        Object term12362 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term12362, term12362.getClass(), "name", "");
        setField(term12362, term12362.getClass(), "scope", "");
        setField(term12362, term12362.getClass(), "type", "");
        setField(term12362, term12362.getClass(), "value", "");
        setField(term12362, term12362.getClass(), "visibility", "");
        ArrayList term12342 = new ArrayList();
        ((ArrayList) term12342).add(term12344);
        ((ArrayList) term12342).add(term12350);
        ((ArrayList) term12342).add(term12356);
        ((ArrayList) term12342).add(term12362);
        term11890 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term12103 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term11890, term11890.getClass(), "workflowName", "AhOHzCsHKW");
        setField(term11890, term11890.getClass(), "workflowKey", "UqgLPaaAHi");
        setField(term11890, term11890.getClass(), "workflowDescription", "xypryEkUPF");
        setField(term11890, term11890.getClass(), "workflowID", "zyZTzHNjQr");
        setField(term11890, term11890.getClass(), "workflowVersion", "YSrFKQQwXE");
        setField(term11890, term11890.getClass(), "workflowDefinitionFileMD5Value", "qxhOsmyyjm");
        setField(term11890, term11890.getClass(), "vendor", "DuKcNfVVYR");
        setField(term11890, term11890.getClass(), "owner", "fRujHWvXjJ");
        setField(term11890, term11890.getClass(), "workflowArchiveSAFID", "EAIAAStlTz");
        setField(term11890, term11890.getClass(), "system", "yIWXcOQTgy");
        setField(term11890, term11890.getClass(), "jobsOutputDirectory", "xAWekqanqc");
        setField(term11890, term11890.getClass(), "category", "GSOWFHMlbF");
        setField(term11890, term11890.getClass(), "productID", "vpZIqpFbKM");
        setField(term11890, term11890.getClass(), "productName", "dAbwpJCDif");
        setField(term11890, term11890.getClass(), "productVersion", "ATSXJPySio");
        setField(term11890, term11890.getClass(), "percentComplete", term12071);
        setField(term11890, term11890.getClass(), "isCallable", term12073);
        setField(term11890, term11890.getClass(), "containsParallelSteps", term12075);
        setField(term11890, term11890.getClass(), "scope", "XZkOUcbfFg");
        setField(term11890, term11890.getClass(), "statusName", "TGiJfagfky");
        setField(term11890, term11890.getClass(), "deleteCompletedJobs", term12101);
        setField(term12103, term12103.getClass(), "startUser", "BJklinBmhN");
        setField(term12103, term12103.getClass(), "startedTime", term12116);
        setField(term12103, term12103.getClass(), "stoppedTime", term12118);
        setField(term12103, term12103.getClass(), "currentStepName", "IOddzvEWcl");
        setField(term12103, term12103.getClass(), "currentStepNumber", "bIrtpkYJWT");
        setField(term12103, term12103.getClass(), "currentStepTitle", "VuLLXpvPpZ");
        setField(term12103, term12103.getClass(), "messageID", "UEdzEKEEEV");
        setField(term12103, term12103.getClass(), "messageText", "BcENaQFYSd");
        setField(term11890, term11890.getClass(), "automationStatus", term12103);
        setField(term11890, term11890.getClass(), "autoDeleteOnCompletion", term12180);
        setField(term11890, term11890.getClass(), "access", "POPYycoDBy");
        setField(term11890, term11890.getClass(), "accountInfo", "LuWMOXdAPA");
        setField(term11890, term11890.getClass(), "jobStatement", "blSffTnsOv");
        setField(term11890, term11890.getClass(), "templateID", "qbUMcIvEXH");
        setField(term11890, term11890.getClass(), "actionID", "TVxGTjeDcu");
        setField(term11890, term11890.getClass(), "registryID", "ABPtcyCzkR");
        setField(term11890, term11890.getClass(), "parentRegistryID", "QgHhxMyKvr");
        setField(term11890, term11890.getClass(), "domainID", "VGiXZZTWRO");
        setField(term11890, term11890.getClass(), "tenantID", "MlPtwXnJOJ");
        setField(term11890, term11890.getClass(), "softwareServiceInstanceName", "DbfiyFeaTe");
        setField(term11890, term11890.getClass(), "templateName", "dQxXGBtDLZ");
        setField(term11890, term11890.getClass(), "globalVariableGroup", "EgSgEFIyyN");
        setField(term11890, term11890.getClass(), "isInstanceVariableWithoutPrefix", "iAOFcXaLSf");
        setField(term11890, term11890.getClass(), "steps", term12338);
        setField(term11890, term11890.getClass(), "variables", term12342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowArchiveSAFID", argTypes, term11890, args);
    }

};


