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

public class WorkflowGetPropertiesResponse_getProductVersion_135824188817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16894;

    public WorkflowGetPropertiesResponse_getProductVersion_135824188817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17075 = new Integer(597278769);
        Boolean term17077 = new Boolean(false);
        Boolean term17079 = new Boolean(false);
        Boolean term17105 = new Boolean(true);
        Long term17120 = new Long(6855071767938501807L);
        Long term17122 = new Long(-5892135042702373494L);
        Boolean term17184 = new Boolean(true);
        ArrayList term17342 = new ArrayList();
        ((ArrayList) term17342).add((Object)null);
        ((ArrayList) term17342).add((Object)null);
        ((ArrayList) term17342).add((Object)null);
        ((ArrayList) term17342).add((Object)null);
        ((ArrayList) term17342).add((Object)null);
        ((ArrayList) term17342).add((Object)null);
        ((ArrayList) term17342).add((Object)null);
        ((ArrayList) term17342).add((Object)null);
        ArrayList term17346 = new ArrayList();
        term16894 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term17107 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term16894, term16894.getClass(), "workflowName", "vjNPcTSqmS");
        setField(term16894, term16894.getClass(), "workflowKey", "fFhdWuJbdC");
        setField(term16894, term16894.getClass(), "workflowDescription", "JlgLIHPabR");
        setField(term16894, term16894.getClass(), "workflowID", "LHnkeoNwHq");
        setField(term16894, term16894.getClass(), "workflowVersion", "gVnDVbSyKa");
        setField(term16894, term16894.getClass(), "workflowDefinitionFileMD5Value", "kdCYNMSuoD");
        setField(term16894, term16894.getClass(), "vendor", "eRYlSLwtvV");
        setField(term16894, term16894.getClass(), "owner", "duOyJsARTD");
        setField(term16894, term16894.getClass(), "workflowArchiveSAFID", "xPnOHsNlyc");
        setField(term16894, term16894.getClass(), "system", "OTSPWPJefj");
        setField(term16894, term16894.getClass(), "jobsOutputDirectory", "EOTYMqXRmE");
        setField(term16894, term16894.getClass(), "category", "iTxNduwSjE");
        setField(term16894, term16894.getClass(), "productID", "MQUTfIiFnh");
        setField(term16894, term16894.getClass(), "productName", "JeyKRznnft");
        setField(term16894, term16894.getClass(), "productVersion", "vQJUCtuYpK");
        setField(term16894, term16894.getClass(), "percentComplete", term17075);
        setField(term16894, term16894.getClass(), "isCallable", term17077);
        setField(term16894, term16894.getClass(), "containsParallelSteps", term17079);
        setField(term16894, term16894.getClass(), "scope", "GHtOeztAdz");
        setField(term16894, term16894.getClass(), "statusName", "gSAtqakaLY");
        setField(term16894, term16894.getClass(), "deleteCompletedJobs", term17105);
        setField(term17107, term17107.getClass(), "startUser", "taPBiMFNEZ");
        setField(term17107, term17107.getClass(), "startedTime", term17120);
        setField(term17107, term17107.getClass(), "stoppedTime", term17122);
        setField(term17107, term17107.getClass(), "currentStepName", "NoAFAfGyYL");
        setField(term17107, term17107.getClass(), "currentStepNumber", "MFtfkBMyOD");
        setField(term17107, term17107.getClass(), "currentStepTitle", "rdiIyXfRtL");
        setField(term17107, term17107.getClass(), "messageID", "douzkltmiI");
        setField(term17107, term17107.getClass(), "messageText", "MFKjhvLtpe");
        setField(term16894, term16894.getClass(), "automationStatus", term17107);
        setField(term16894, term16894.getClass(), "autoDeleteOnCompletion", term17184);
        setField(term16894, term16894.getClass(), "access", "xpbLKEsput");
        setField(term16894, term16894.getClass(), "accountInfo", "urlyLwPBVn");
        setField(term16894, term16894.getClass(), "jobStatement", "SPQVzOlOzZ");
        setField(term16894, term16894.getClass(), "templateID", "bOUAgAptAI");
        setField(term16894, term16894.getClass(), "actionID", "KSZfGbvzPE");
        setField(term16894, term16894.getClass(), "registryID", "YfgYGgzYER");
        setField(term16894, term16894.getClass(), "parentRegistryID", "IDClvDZuqE");
        setField(term16894, term16894.getClass(), "domainID", "cMvKxpZOvg");
        setField(term16894, term16894.getClass(), "tenantID", "WWBYemIuiK");
        setField(term16894, term16894.getClass(), "softwareServiceInstanceName", "nHYQYkycCR");
        setField(term16894, term16894.getClass(), "templateName", "yBiVacDcZX");
        setField(term16894, term16894.getClass(), "globalVariableGroup", "QrKfEgQeoy");
        setField(term16894, term16894.getClass(), "isInstanceVariableWithoutPrefix", "oApgdbwnti");
        setField(term16894, term16894.getClass(), "steps", term17342);
        setField(term16894, term16894.getClass(), "variables", term17346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductVersion", argTypes, term16894, args);
    }

};


