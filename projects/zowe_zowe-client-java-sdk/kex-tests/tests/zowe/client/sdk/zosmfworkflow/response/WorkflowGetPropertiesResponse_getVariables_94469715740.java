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

public class WorkflowGetPropertiesResponse_getVariables_94469715740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36082;

    public WorkflowGetPropertiesResponse_getVariables_94469715740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36263 = new Integer(-1145578966);
        Boolean term36265 = new Boolean(true);
        Boolean term36267 = new Boolean(true);
        Boolean term36293 = new Boolean(false);
        Long term36308 = new Long(-5963439350418910964L);
        Long term36310 = new Long(9013624480170062917L);
        Boolean term36372 = new Boolean(false);
        ArrayList term36530 = new ArrayList();
        Object term36536 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36536, term36536.getClass(), "name", "");
        setField(term36536, term36536.getClass(), "scope", "");
        setField(term36536, term36536.getClass(), "type", "");
        setField(term36536, term36536.getClass(), "value", "");
        setField(term36536, term36536.getClass(), "visibility", "");
        Object term36542 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36542, term36542.getClass(), "name", "");
        setField(term36542, term36542.getClass(), "scope", "");
        setField(term36542, term36542.getClass(), "type", "");
        setField(term36542, term36542.getClass(), "value", "");
        setField(term36542, term36542.getClass(), "visibility", "");
        Object term36548 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36548, term36548.getClass(), "name", "");
        setField(term36548, term36548.getClass(), "scope", "");
        setField(term36548, term36548.getClass(), "type", "");
        setField(term36548, term36548.getClass(), "value", "");
        setField(term36548, term36548.getClass(), "visibility", "");
        Object term36554 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36554, term36554.getClass(), "name", "");
        setField(term36554, term36554.getClass(), "scope", "");
        setField(term36554, term36554.getClass(), "type", "");
        setField(term36554, term36554.getClass(), "value", "");
        setField(term36554, term36554.getClass(), "visibility", "");
        Object term36560 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36560, term36560.getClass(), "name", "");
        setField(term36560, term36560.getClass(), "scope", "");
        setField(term36560, term36560.getClass(), "type", "");
        setField(term36560, term36560.getClass(), "value", "");
        setField(term36560, term36560.getClass(), "visibility", "");
        Object term36566 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36566, term36566.getClass(), "name", "");
        setField(term36566, term36566.getClass(), "scope", "");
        setField(term36566, term36566.getClass(), "type", "");
        setField(term36566, term36566.getClass(), "value", "");
        setField(term36566, term36566.getClass(), "visibility", "");
        Object term36572 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36572, term36572.getClass(), "name", "");
        setField(term36572, term36572.getClass(), "scope", "");
        setField(term36572, term36572.getClass(), "type", "");
        setField(term36572, term36572.getClass(), "value", "");
        setField(term36572, term36572.getClass(), "visibility", "");
        Object term36578 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term36578, term36578.getClass(), "name", "");
        setField(term36578, term36578.getClass(), "scope", "");
        setField(term36578, term36578.getClass(), "type", "");
        setField(term36578, term36578.getClass(), "value", "");
        setField(term36578, term36578.getClass(), "visibility", "");
        ArrayList term36534 = new ArrayList();
        ((ArrayList) term36534).add(term36536);
        ((ArrayList) term36534).add(term36542);
        ((ArrayList) term36534).add(term36548);
        ((ArrayList) term36534).add(term36554);
        ((ArrayList) term36534).add(term36560);
        ((ArrayList) term36534).add(term36566);
        ((ArrayList) term36534).add(term36572);
        ((ArrayList) term36534).add(term36578);
        term36082 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term36295 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term36082, term36082.getClass(), "workflowName", "qxBdFhLbAN");
        setField(term36082, term36082.getClass(), "workflowKey", "KyUmXHRrED");
        setField(term36082, term36082.getClass(), "workflowDescription", "eOMBFVrNcf");
        setField(term36082, term36082.getClass(), "workflowID", "gOwOIsocMB");
        setField(term36082, term36082.getClass(), "workflowVersion", "GqTBOhQBgV");
        setField(term36082, term36082.getClass(), "workflowDefinitionFileMD5Value", "DQhxOWqEyi");
        setField(term36082, term36082.getClass(), "vendor", "dSszYGDwAk");
        setField(term36082, term36082.getClass(), "owner", "gNeMyGSVIG");
        setField(term36082, term36082.getClass(), "workflowArchiveSAFID", "qxEkaqdKPG");
        setField(term36082, term36082.getClass(), "system", "VclIptmKrF");
        setField(term36082, term36082.getClass(), "jobsOutputDirectory", "wcTeSHCZwz");
        setField(term36082, term36082.getClass(), "category", "fxxnbYOiZZ");
        setField(term36082, term36082.getClass(), "productID", "CTnRYaYXia");
        setField(term36082, term36082.getClass(), "productName", "SUIYUFtCCe");
        setField(term36082, term36082.getClass(), "productVersion", "eKCrPCkedw");
        setField(term36082, term36082.getClass(), "percentComplete", term36263);
        setField(term36082, term36082.getClass(), "isCallable", term36265);
        setField(term36082, term36082.getClass(), "containsParallelSteps", term36267);
        setField(term36082, term36082.getClass(), "scope", "VAFSknHLsZ");
        setField(term36082, term36082.getClass(), "statusName", "MamzBtwhiz");
        setField(term36082, term36082.getClass(), "deleteCompletedJobs", term36293);
        setField(term36295, term36295.getClass(), "startUser", "wVOypfVLsP");
        setField(term36295, term36295.getClass(), "startedTime", term36308);
        setField(term36295, term36295.getClass(), "stoppedTime", term36310);
        setField(term36295, term36295.getClass(), "currentStepName", "pEazBcUUWX");
        setField(term36295, term36295.getClass(), "currentStepNumber", "nlvRWrTxvz");
        setField(term36295, term36295.getClass(), "currentStepTitle", "isMKwgUmka");
        setField(term36295, term36295.getClass(), "messageID", "pDIyzhDtTy");
        setField(term36295, term36295.getClass(), "messageText", "wXiUlhXQoC");
        setField(term36082, term36082.getClass(), "automationStatus", term36295);
        setField(term36082, term36082.getClass(), "autoDeleteOnCompletion", term36372);
        setField(term36082, term36082.getClass(), "access", "gKhmgJzimH");
        setField(term36082, term36082.getClass(), "accountInfo", "OzRiWLVXNx");
        setField(term36082, term36082.getClass(), "jobStatement", "pktmgYsknu");
        setField(term36082, term36082.getClass(), "templateID", "SsMHzYNeji");
        setField(term36082, term36082.getClass(), "actionID", "wzAFLFdaEQ");
        setField(term36082, term36082.getClass(), "registryID", "IcbBNUXJqX");
        setField(term36082, term36082.getClass(), "parentRegistryID", "LONFjqAsUp");
        setField(term36082, term36082.getClass(), "domainID", "tAhydlbSMf");
        setField(term36082, term36082.getClass(), "tenantID", "wNYtcPFyIe");
        setField(term36082, term36082.getClass(), "softwareServiceInstanceName", "tlIqgTUSQw");
        setField(term36082, term36082.getClass(), "templateName", "UvweyXjDhG");
        setField(term36082, term36082.getClass(), "globalVariableGroup", "wnoVhNwdJy");
        setField(term36082, term36082.getClass(), "isInstanceVariableWithoutPrefix", "uQGMBLrmAj");
        setField(term36082, term36082.getClass(), "steps", term36530);
        setField(term36082, term36082.getClass(), "variables", term36534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariables", argTypes, term36082, args);
    }

};


