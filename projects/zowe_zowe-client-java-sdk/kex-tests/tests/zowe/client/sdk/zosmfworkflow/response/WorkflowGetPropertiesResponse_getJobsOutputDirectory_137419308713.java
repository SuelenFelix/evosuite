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

public class WorkflowGetPropertiesResponse_getJobsOutputDirectory_137419308713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13570;

    public WorkflowGetPropertiesResponse_getJobsOutputDirectory_137419308713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13751 = new Integer(-522618178);
        Boolean term13753 = new Boolean(false);
        Boolean term13755 = new Boolean(true);
        Boolean term13781 = new Boolean(true);
        Long term13796 = new Long(8059786003080744426L);
        Long term13798 = new Long(-4365849114644724155L);
        Boolean term13860 = new Boolean(true);
        ArrayList term14018 = new ArrayList();
        ((ArrayList) term14018).add((Object)null);
        ((ArrayList) term14018).add((Object)null);
        ((ArrayList) term14018).add((Object)null);
        ((ArrayList) term14018).add((Object)null);
        ((ArrayList) term14018).add((Object)null);
        ((ArrayList) term14018).add((Object)null);
        ((ArrayList) term14018).add((Object)null);
        Object term14024 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term14024, term14024.getClass(), "name", "");
        setField(term14024, term14024.getClass(), "scope", "");
        setField(term14024, term14024.getClass(), "type", "");
        setField(term14024, term14024.getClass(), "value", "");
        setField(term14024, term14024.getClass(), "visibility", "");
        ArrayList term14022 = new ArrayList();
        ((ArrayList) term14022).add(term14024);
        term13570 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term13783 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term13570, term13570.getClass(), "workflowName", "tkmmGweDwJ");
        setField(term13570, term13570.getClass(), "workflowKey", "pMfTuAFXxg");
        setField(term13570, term13570.getClass(), "workflowDescription", "XCZmhkblRc");
        setField(term13570, term13570.getClass(), "workflowID", "gFUWMydGCU");
        setField(term13570, term13570.getClass(), "workflowVersion", "LLegSTfqJt");
        setField(term13570, term13570.getClass(), "workflowDefinitionFileMD5Value", "XQfmqLbqHS");
        setField(term13570, term13570.getClass(), "vendor", "jLVLqQSjqg");
        setField(term13570, term13570.getClass(), "owner", "JKGueoHesL");
        setField(term13570, term13570.getClass(), "workflowArchiveSAFID", "CRAUqtVBkU");
        setField(term13570, term13570.getClass(), "system", "DddqUYfomL");
        setField(term13570, term13570.getClass(), "jobsOutputDirectory", "YQwoogpPyi");
        setField(term13570, term13570.getClass(), "category", "rnPhHoorxj");
        setField(term13570, term13570.getClass(), "productID", "GuwJLKquuI");
        setField(term13570, term13570.getClass(), "productName", "vYMCjgnztg");
        setField(term13570, term13570.getClass(), "productVersion", "YupgKTSEiI");
        setField(term13570, term13570.getClass(), "percentComplete", term13751);
        setField(term13570, term13570.getClass(), "isCallable", term13753);
        setField(term13570, term13570.getClass(), "containsParallelSteps", term13755);
        setField(term13570, term13570.getClass(), "scope", "HuOUlaFmvJ");
        setField(term13570, term13570.getClass(), "statusName", "dWVwcwFGNo");
        setField(term13570, term13570.getClass(), "deleteCompletedJobs", term13781);
        setField(term13783, term13783.getClass(), "startUser", "PNdLRrSAIY");
        setField(term13783, term13783.getClass(), "startedTime", term13796);
        setField(term13783, term13783.getClass(), "stoppedTime", term13798);
        setField(term13783, term13783.getClass(), "currentStepName", "nJnRIRiLZK");
        setField(term13783, term13783.getClass(), "currentStepNumber", "eWnrMSbYbT");
        setField(term13783, term13783.getClass(), "currentStepTitle", "AjoFvDFyCY");
        setField(term13783, term13783.getClass(), "messageID", "OFTJwdPiTG");
        setField(term13783, term13783.getClass(), "messageText", "QiUprSEluR");
        setField(term13570, term13570.getClass(), "automationStatus", term13783);
        setField(term13570, term13570.getClass(), "autoDeleteOnCompletion", term13860);
        setField(term13570, term13570.getClass(), "access", "cDOXXottZh");
        setField(term13570, term13570.getClass(), "accountInfo", "rfqJDkDppz");
        setField(term13570, term13570.getClass(), "jobStatement", "MGorMVGauT");
        setField(term13570, term13570.getClass(), "templateID", "jXKxUGTuEF");
        setField(term13570, term13570.getClass(), "actionID", "nDCcyhiTnS");
        setField(term13570, term13570.getClass(), "registryID", "Bcivwcjece");
        setField(term13570, term13570.getClass(), "parentRegistryID", "QTefjRuiez");
        setField(term13570, term13570.getClass(), "domainID", "SQZVNkAVBB");
        setField(term13570, term13570.getClass(), "tenantID", "mrSAYJlddZ");
        setField(term13570, term13570.getClass(), "softwareServiceInstanceName", "KbwxawvYsw");
        setField(term13570, term13570.getClass(), "templateName", "gvjdfHNzOa");
        setField(term13570, term13570.getClass(), "globalVariableGroup", "HqitWglYWX");
        setField(term13570, term13570.getClass(), "isInstanceVariableWithoutPrefix", "pOuFRlHmbK");
        setField(term13570, term13570.getClass(), "steps", term14018);
        setField(term13570, term13570.getClass(), "variables", term14022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobsOutputDirectory", argTypes, term13570, args);
    }

};


