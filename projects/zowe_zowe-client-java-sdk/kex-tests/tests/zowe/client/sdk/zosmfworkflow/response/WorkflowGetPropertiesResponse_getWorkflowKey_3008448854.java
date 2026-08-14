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

public class WorkflowGetPropertiesResponse_getWorkflowKey_3008448854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6052;

    public WorkflowGetPropertiesResponse_getWorkflowKey_3008448854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6233 = new Integer(1484323161);
        Boolean term6235 = new Boolean(false);
        Boolean term6237 = new Boolean(true);
        Boolean term6263 = new Boolean(false);
        Long term6278 = new Long(5270370404989704783L);
        Long term6280 = new Long(7411271909051562686L);
        Boolean term6342 = new Boolean(true);
        ArrayList term6500 = new ArrayList();
        ((ArrayList) term6500).add((Object)null);
        ArrayList term6504 = new ArrayList();
        term6052 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term6265 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term6052, term6052.getClass(), "workflowName", "vLerpqavFM");
        setField(term6052, term6052.getClass(), "workflowKey", "qnvxzwuGKX");
        setField(term6052, term6052.getClass(), "workflowDescription", "EdPAvpluZg");
        setField(term6052, term6052.getClass(), "workflowID", "DzHVBMqWtE");
        setField(term6052, term6052.getClass(), "workflowVersion", "THZSpzBRYP");
        setField(term6052, term6052.getClass(), "workflowDefinitionFileMD5Value", "ZfBIVGBQOE");
        setField(term6052, term6052.getClass(), "vendor", "QSrDQfEsTR");
        setField(term6052, term6052.getClass(), "owner", "PsqusYmejD");
        setField(term6052, term6052.getClass(), "workflowArchiveSAFID", "NTWMiBEaDF");
        setField(term6052, term6052.getClass(), "system", "SPBstwKFVr");
        setField(term6052, term6052.getClass(), "jobsOutputDirectory", "WxYUTuqmIq");
        setField(term6052, term6052.getClass(), "category", "OeQLvhVERT");
        setField(term6052, term6052.getClass(), "productID", "IlvgFINwIa");
        setField(term6052, term6052.getClass(), "productName", "GEJABPlHSI");
        setField(term6052, term6052.getClass(), "productVersion", "aQFUvuaYxd");
        setField(term6052, term6052.getClass(), "percentComplete", term6233);
        setField(term6052, term6052.getClass(), "isCallable", term6235);
        setField(term6052, term6052.getClass(), "containsParallelSteps", term6237);
        setField(term6052, term6052.getClass(), "scope", "zNFLXMifnS");
        setField(term6052, term6052.getClass(), "statusName", "HHQcYMSBVc");
        setField(term6052, term6052.getClass(), "deleteCompletedJobs", term6263);
        setField(term6265, term6265.getClass(), "startUser", "wdoqITnaAP");
        setField(term6265, term6265.getClass(), "startedTime", term6278);
        setField(term6265, term6265.getClass(), "stoppedTime", term6280);
        setField(term6265, term6265.getClass(), "currentStepName", "rIPMBcrNqB");
        setField(term6265, term6265.getClass(), "currentStepNumber", "UDaboHZHhz");
        setField(term6265, term6265.getClass(), "currentStepTitle", "nRvKihUSPj");
        setField(term6265, term6265.getClass(), "messageID", "BbNeQJpYPr");
        setField(term6265, term6265.getClass(), "messageText", "riMtzCoxNj");
        setField(term6052, term6052.getClass(), "automationStatus", term6265);
        setField(term6052, term6052.getClass(), "autoDeleteOnCompletion", term6342);
        setField(term6052, term6052.getClass(), "access", "YAXkVjQZcV");
        setField(term6052, term6052.getClass(), "accountInfo", "pumvwBWvpy");
        setField(term6052, term6052.getClass(), "jobStatement", "HwLHeGLyhe");
        setField(term6052, term6052.getClass(), "templateID", "RDnkgWkcbz");
        setField(term6052, term6052.getClass(), "actionID", "IBpaxltauX");
        setField(term6052, term6052.getClass(), "registryID", "hePqROaplw");
        setField(term6052, term6052.getClass(), "parentRegistryID", "PJcSNDruWd");
        setField(term6052, term6052.getClass(), "domainID", "VVNNlAePXF");
        setField(term6052, term6052.getClass(), "tenantID", "jnwVnmKAFv");
        setField(term6052, term6052.getClass(), "softwareServiceInstanceName", "TXyHhqeCjR");
        setField(term6052, term6052.getClass(), "templateName", "lZIgPZPgTu");
        setField(term6052, term6052.getClass(), "globalVariableGroup", "iuCxnHGMoW");
        setField(term6052, term6052.getClass(), "isInstanceVariableWithoutPrefix", "GPSEWEDSTo");
        setField(term6052, term6052.getClass(), "steps", term6500);
        setField(term6052, term6052.getClass(), "variables", term6504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowKey", argTypes, term6052, args);
    }

};


