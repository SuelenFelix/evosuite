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

public class WorkflowGetPropertiesResponse_getSteps_79054013939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35212;

    public WorkflowGetPropertiesResponse_getSteps_79054013939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35393 = new Integer(-469968304);
        Boolean term35395 = new Boolean(false);
        Boolean term35397 = new Boolean(true);
        Boolean term35423 = new Boolean(true);
        Long term35438 = new Long(682356318767179819L);
        Long term35440 = new Long(-7291743527973326814L);
        Boolean term35502 = new Boolean(false);
        ArrayList term35660 = new ArrayList();
        ((ArrayList) term35660).add((Object)null);
        ((ArrayList) term35660).add((Object)null);
        ((ArrayList) term35660).add((Object)null);
        ((ArrayList) term35660).add((Object)null);
        ((ArrayList) term35660).add((Object)null);
        Object term35666 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35666, term35666.getClass(), "name", "");
        setField(term35666, term35666.getClass(), "scope", "");
        setField(term35666, term35666.getClass(), "type", "");
        setField(term35666, term35666.getClass(), "value", "");
        setField(term35666, term35666.getClass(), "visibility", "");
        Object term35672 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35672, term35672.getClass(), "name", "");
        setField(term35672, term35672.getClass(), "scope", "");
        setField(term35672, term35672.getClass(), "type", "");
        setField(term35672, term35672.getClass(), "value", "");
        setField(term35672, term35672.getClass(), "visibility", "");
        Object term35678 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35678, term35678.getClass(), "name", "");
        setField(term35678, term35678.getClass(), "scope", "");
        setField(term35678, term35678.getClass(), "type", "");
        setField(term35678, term35678.getClass(), "value", "");
        setField(term35678, term35678.getClass(), "visibility", "");
        Object term35684 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35684, term35684.getClass(), "name", "");
        setField(term35684, term35684.getClass(), "scope", "");
        setField(term35684, term35684.getClass(), "type", "");
        setField(term35684, term35684.getClass(), "value", "");
        setField(term35684, term35684.getClass(), "visibility", "");
        Object term35690 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35690, term35690.getClass(), "name", "");
        setField(term35690, term35690.getClass(), "scope", "");
        setField(term35690, term35690.getClass(), "type", "");
        setField(term35690, term35690.getClass(), "value", "");
        setField(term35690, term35690.getClass(), "visibility", "");
        Object term35696 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35696, term35696.getClass(), "name", "");
        setField(term35696, term35696.getClass(), "scope", "");
        setField(term35696, term35696.getClass(), "type", "");
        setField(term35696, term35696.getClass(), "value", "");
        setField(term35696, term35696.getClass(), "visibility", "");
        Object term35702 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35702, term35702.getClass(), "name", "");
        setField(term35702, term35702.getClass(), "scope", "");
        setField(term35702, term35702.getClass(), "type", "");
        setField(term35702, term35702.getClass(), "value", "");
        setField(term35702, term35702.getClass(), "visibility", "");
        Object term35708 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35708, term35708.getClass(), "name", "");
        setField(term35708, term35708.getClass(), "scope", "");
        setField(term35708, term35708.getClass(), "type", "");
        setField(term35708, term35708.getClass(), "value", "");
        setField(term35708, term35708.getClass(), "visibility", "");
        Object term35714 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term35714, term35714.getClass(), "name", "");
        setField(term35714, term35714.getClass(), "scope", "");
        setField(term35714, term35714.getClass(), "type", "");
        setField(term35714, term35714.getClass(), "value", "");
        setField(term35714, term35714.getClass(), "visibility", "");
        ArrayList term35664 = new ArrayList();
        ((ArrayList) term35664).add(term35666);
        ((ArrayList) term35664).add(term35672);
        ((ArrayList) term35664).add(term35678);
        ((ArrayList) term35664).add(term35684);
        ((ArrayList) term35664).add(term35690);
        ((ArrayList) term35664).add(term35696);
        ((ArrayList) term35664).add(term35702);
        ((ArrayList) term35664).add(term35708);
        ((ArrayList) term35664).add(term35714);
        term35212 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term35425 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term35212, term35212.getClass(), "workflowName", "QEJBgSNviH");
        setField(term35212, term35212.getClass(), "workflowKey", "bjigisSVNp");
        setField(term35212, term35212.getClass(), "workflowDescription", "yJCCaWqQuK");
        setField(term35212, term35212.getClass(), "workflowID", "tgBNqkdndl");
        setField(term35212, term35212.getClass(), "workflowVersion", "GXKhRJLVFZ");
        setField(term35212, term35212.getClass(), "workflowDefinitionFileMD5Value", "qDflhZTJjR");
        setField(term35212, term35212.getClass(), "vendor", "bzQSjpIauE");
        setField(term35212, term35212.getClass(), "owner", "ESQqarFUtp");
        setField(term35212, term35212.getClass(), "workflowArchiveSAFID", "TiCRQbKtcf");
        setField(term35212, term35212.getClass(), "system", "shGEZulpDG");
        setField(term35212, term35212.getClass(), "jobsOutputDirectory", "twDnEqZglX");
        setField(term35212, term35212.getClass(), "category", "TWzZFATLAj");
        setField(term35212, term35212.getClass(), "productID", "QjsqHrtVMY");
        setField(term35212, term35212.getClass(), "productName", "PlQZGGhnZK");
        setField(term35212, term35212.getClass(), "productVersion", "sTtLCWDEPO");
        setField(term35212, term35212.getClass(), "percentComplete", term35393);
        setField(term35212, term35212.getClass(), "isCallable", term35395);
        setField(term35212, term35212.getClass(), "containsParallelSteps", term35397);
        setField(term35212, term35212.getClass(), "scope", "UGMtNRjhnC");
        setField(term35212, term35212.getClass(), "statusName", "oTnPmmIphJ");
        setField(term35212, term35212.getClass(), "deleteCompletedJobs", term35423);
        setField(term35425, term35425.getClass(), "startUser", "vTgJolwQXF");
        setField(term35425, term35425.getClass(), "startedTime", term35438);
        setField(term35425, term35425.getClass(), "stoppedTime", term35440);
        setField(term35425, term35425.getClass(), "currentStepName", "QuNSfeKtAH");
        setField(term35425, term35425.getClass(), "currentStepNumber", "vFhRdscfFA");
        setField(term35425, term35425.getClass(), "currentStepTitle", "ZmfocrvaII");
        setField(term35425, term35425.getClass(), "messageID", "LTbQXrGKuA");
        setField(term35425, term35425.getClass(), "messageText", "gzmGmDALUv");
        setField(term35212, term35212.getClass(), "automationStatus", term35425);
        setField(term35212, term35212.getClass(), "autoDeleteOnCompletion", term35502);
        setField(term35212, term35212.getClass(), "access", "ZRoptBRTDM");
        setField(term35212, term35212.getClass(), "accountInfo", "vVVFChfeBQ");
        setField(term35212, term35212.getClass(), "jobStatement", "aASfcqfBbh");
        setField(term35212, term35212.getClass(), "templateID", "DwpOIkpRFT");
        setField(term35212, term35212.getClass(), "actionID", "LPlTDoLrUy");
        setField(term35212, term35212.getClass(), "registryID", "XETimBHIKG");
        setField(term35212, term35212.getClass(), "parentRegistryID", "nOKVZSyfbZ");
        setField(term35212, term35212.getClass(), "domainID", "adHZFgDoEH");
        setField(term35212, term35212.getClass(), "tenantID", "vjNETNMDhQ");
        setField(term35212, term35212.getClass(), "softwareServiceInstanceName", "pexqQqwSNj");
        setField(term35212, term35212.getClass(), "templateName", "myfXkIEBSV");
        setField(term35212, term35212.getClass(), "globalVariableGroup", "LSrqDVjzEP");
        setField(term35212, term35212.getClass(), "isInstanceVariableWithoutPrefix", "CPZCLJxTuA");
        setField(term35212, term35212.getClass(), "steps", term35660);
        setField(term35212, term35212.getClass(), "variables", term35664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSteps", argTypes, term35212, args);
    }

};


