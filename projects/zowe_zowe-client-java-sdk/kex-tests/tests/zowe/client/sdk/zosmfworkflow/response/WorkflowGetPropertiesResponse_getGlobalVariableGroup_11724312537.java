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

public class WorkflowGetPropertiesResponse_getGlobalVariableGroup_11724312537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33520;

    public WorkflowGetPropertiesResponse_getGlobalVariableGroup_11724312537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33701 = new Integer(-1087774327);
        Boolean term33703 = new Boolean(true);
        Boolean term33705 = new Boolean(false);
        Boolean term33731 = new Boolean(true);
        Long term33746 = new Long(-5248475803419977214L);
        Long term33748 = new Long(-6723783499250797216L);
        Boolean term33810 = new Boolean(false);
        ArrayList term33968 = new ArrayList();
        ((ArrayList) term33968).add((Object)null);
        Object term33974 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33974, term33974.getClass(), "name", "");
        setField(term33974, term33974.getClass(), "scope", "");
        setField(term33974, term33974.getClass(), "type", "");
        setField(term33974, term33974.getClass(), "value", "");
        setField(term33974, term33974.getClass(), "visibility", "");
        Object term33980 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33980, term33980.getClass(), "name", "");
        setField(term33980, term33980.getClass(), "scope", "");
        setField(term33980, term33980.getClass(), "type", "");
        setField(term33980, term33980.getClass(), "value", "");
        setField(term33980, term33980.getClass(), "visibility", "");
        Object term33986 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33986, term33986.getClass(), "name", "");
        setField(term33986, term33986.getClass(), "scope", "");
        setField(term33986, term33986.getClass(), "type", "");
        setField(term33986, term33986.getClass(), "value", "");
        setField(term33986, term33986.getClass(), "visibility", "");
        Object term33992 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33992, term33992.getClass(), "name", "");
        setField(term33992, term33992.getClass(), "scope", "");
        setField(term33992, term33992.getClass(), "type", "");
        setField(term33992, term33992.getClass(), "value", "");
        setField(term33992, term33992.getClass(), "visibility", "");
        Object term33998 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term33998, term33998.getClass(), "name", "");
        setField(term33998, term33998.getClass(), "scope", "");
        setField(term33998, term33998.getClass(), "type", "");
        setField(term33998, term33998.getClass(), "value", "");
        setField(term33998, term33998.getClass(), "visibility", "");
        Object term34004 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term34004, term34004.getClass(), "name", "");
        setField(term34004, term34004.getClass(), "scope", "");
        setField(term34004, term34004.getClass(), "type", "");
        setField(term34004, term34004.getClass(), "value", "");
        setField(term34004, term34004.getClass(), "visibility", "");
        Object term34010 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term34010, term34010.getClass(), "name", "");
        setField(term34010, term34010.getClass(), "scope", "");
        setField(term34010, term34010.getClass(), "type", "");
        setField(term34010, term34010.getClass(), "value", "");
        setField(term34010, term34010.getClass(), "visibility", "");
        Object term34016 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term34016, term34016.getClass(), "name", "");
        setField(term34016, term34016.getClass(), "scope", "");
        setField(term34016, term34016.getClass(), "type", "");
        setField(term34016, term34016.getClass(), "value", "");
        setField(term34016, term34016.getClass(), "visibility", "");
        ArrayList term33972 = new ArrayList();
        ((ArrayList) term33972).add(term33974);
        ((ArrayList) term33972).add(term33980);
        ((ArrayList) term33972).add(term33986);
        ((ArrayList) term33972).add(term33992);
        ((ArrayList) term33972).add(term33998);
        ((ArrayList) term33972).add(term34004);
        ((ArrayList) term33972).add(term34010);
        ((ArrayList) term33972).add(term34016);
        term33520 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term33733 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term33520, term33520.getClass(), "workflowName", "MQvSpklpkB");
        setField(term33520, term33520.getClass(), "workflowKey", "SbTxRdDQQc");
        setField(term33520, term33520.getClass(), "workflowDescription", "MrVdoUYAdO");
        setField(term33520, term33520.getClass(), "workflowID", "schPUnVfDW");
        setField(term33520, term33520.getClass(), "workflowVersion", "CpdMEgjUka");
        setField(term33520, term33520.getClass(), "workflowDefinitionFileMD5Value", "WRisHdgnmm");
        setField(term33520, term33520.getClass(), "vendor", "XxZiwWPLOx");
        setField(term33520, term33520.getClass(), "owner", "nyqsjMHTba");
        setField(term33520, term33520.getClass(), "workflowArchiveSAFID", "ylUHzURWyg");
        setField(term33520, term33520.getClass(), "system", "VuAuFBlHxQ");
        setField(term33520, term33520.getClass(), "jobsOutputDirectory", "nOLtCslMMH");
        setField(term33520, term33520.getClass(), "category", "dIQWOeKQVj");
        setField(term33520, term33520.getClass(), "productID", "tHiDGaNXAL");
        setField(term33520, term33520.getClass(), "productName", "VsizBWhPWL");
        setField(term33520, term33520.getClass(), "productVersion", "jAFSxnVMcD");
        setField(term33520, term33520.getClass(), "percentComplete", term33701);
        setField(term33520, term33520.getClass(), "isCallable", term33703);
        setField(term33520, term33520.getClass(), "containsParallelSteps", term33705);
        setField(term33520, term33520.getClass(), "scope", "BuNQAVaNCe");
        setField(term33520, term33520.getClass(), "statusName", "iaYiUQnOLD");
        setField(term33520, term33520.getClass(), "deleteCompletedJobs", term33731);
        setField(term33733, term33733.getClass(), "startUser", "upnleTLVdf");
        setField(term33733, term33733.getClass(), "startedTime", term33746);
        setField(term33733, term33733.getClass(), "stoppedTime", term33748);
        setField(term33733, term33733.getClass(), "currentStepName", "pvjlKAnxzJ");
        setField(term33733, term33733.getClass(), "currentStepNumber", "ejxUBDQQKB");
        setField(term33733, term33733.getClass(), "currentStepTitle", "IbOvZLmtSE");
        setField(term33733, term33733.getClass(), "messageID", "AOsIglRFcp");
        setField(term33733, term33733.getClass(), "messageText", "bdONLhBZoA");
        setField(term33520, term33520.getClass(), "automationStatus", term33733);
        setField(term33520, term33520.getClass(), "autoDeleteOnCompletion", term33810);
        setField(term33520, term33520.getClass(), "access", "qPVeRcolUe");
        setField(term33520, term33520.getClass(), "accountInfo", "AscZyfQFkU");
        setField(term33520, term33520.getClass(), "jobStatement", "nPfruizWey");
        setField(term33520, term33520.getClass(), "templateID", "RvgkUqMUFX");
        setField(term33520, term33520.getClass(), "actionID", "nOqmldTbXj");
        setField(term33520, term33520.getClass(), "registryID", "xNDnWDGUNx");
        setField(term33520, term33520.getClass(), "parentRegistryID", "faGVqjLquQ");
        setField(term33520, term33520.getClass(), "domainID", "MbsTNUmNqV");
        setField(term33520, term33520.getClass(), "tenantID", "VdDIonpedU");
        setField(term33520, term33520.getClass(), "softwareServiceInstanceName", "VjtXZcUFNx");
        setField(term33520, term33520.getClass(), "templateName", "bOZSTccXbt");
        setField(term33520, term33520.getClass(), "globalVariableGroup", "MBSsxxeNUU");
        setField(term33520, term33520.getClass(), "isInstanceVariableWithoutPrefix", "NmUhmPLSgG");
        setField(term33520, term33520.getClass(), "steps", term33968);
        setField(term33520, term33520.getClass(), "variables", term33972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlobalVariableGroup", argTypes, term33520, args);
    }

};


