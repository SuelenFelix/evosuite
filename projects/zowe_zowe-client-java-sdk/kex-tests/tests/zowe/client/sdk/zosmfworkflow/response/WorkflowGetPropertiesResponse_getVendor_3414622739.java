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

public class WorkflowGetPropertiesResponse_getVendor_3414622739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10240;

    public WorkflowGetPropertiesResponse_getVendor_3414622739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10421 = new Integer(-2038273078);
        Boolean term10423 = new Boolean(true);
        Boolean term10425 = new Boolean(true);
        Boolean term10451 = new Boolean(true);
        Long term10466 = new Long(-5476826692763582090L);
        Long term10468 = new Long(-872011222785455006L);
        Boolean term10530 = new Boolean(true);
        ArrayList term10688 = new ArrayList();
        ((ArrayList) term10688).add((Object)null);
        ((ArrayList) term10688).add((Object)null);
        ((ArrayList) term10688).add((Object)null);
        ((ArrayList) term10688).add((Object)null);
        ((ArrayList) term10688).add((Object)null);
        ((ArrayList) term10688).add((Object)null);
        Object term10694 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term10694, term10694.getClass(), "name", "");
        setField(term10694, term10694.getClass(), "scope", "");
        setField(term10694, term10694.getClass(), "type", "");
        setField(term10694, term10694.getClass(), "value", "");
        setField(term10694, term10694.getClass(), "visibility", "");
        ArrayList term10692 = new ArrayList();
        ((ArrayList) term10692).add(term10694);
        term10240 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term10453 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term10240, term10240.getClass(), "workflowName", "mvfDtZNEHr");
        setField(term10240, term10240.getClass(), "workflowKey", "bvSgmFUDOU");
        setField(term10240, term10240.getClass(), "workflowDescription", "XMHwbfiHRl");
        setField(term10240, term10240.getClass(), "workflowID", "bucTnYicnp");
        setField(term10240, term10240.getClass(), "workflowVersion", "EkgprvqZlM");
        setField(term10240, term10240.getClass(), "workflowDefinitionFileMD5Value", "fbnKvthhOz");
        setField(term10240, term10240.getClass(), "vendor", "PGfCDJTBek");
        setField(term10240, term10240.getClass(), "owner", "ZwjARhAtHC");
        setField(term10240, term10240.getClass(), "workflowArchiveSAFID", "XXvscsYBWv");
        setField(term10240, term10240.getClass(), "system", "uePedtiAfL");
        setField(term10240, term10240.getClass(), "jobsOutputDirectory", "AdSHvysxQB");
        setField(term10240, term10240.getClass(), "category", "jlraKkBWFA");
        setField(term10240, term10240.getClass(), "productID", "mRBtFTxVdE");
        setField(term10240, term10240.getClass(), "productName", "IVacFDAZcj");
        setField(term10240, term10240.getClass(), "productVersion", "EEYmuwyVDP");
        setField(term10240, term10240.getClass(), "percentComplete", term10421);
        setField(term10240, term10240.getClass(), "isCallable", term10423);
        setField(term10240, term10240.getClass(), "containsParallelSteps", term10425);
        setField(term10240, term10240.getClass(), "scope", "EWFbEDAVrE");
        setField(term10240, term10240.getClass(), "statusName", "EMiMtYgfvr");
        setField(term10240, term10240.getClass(), "deleteCompletedJobs", term10451);
        setField(term10453, term10453.getClass(), "startUser", "OyYyYYnJuF");
        setField(term10453, term10453.getClass(), "startedTime", term10466);
        setField(term10453, term10453.getClass(), "stoppedTime", term10468);
        setField(term10453, term10453.getClass(), "currentStepName", "aYLvcxZohT");
        setField(term10453, term10453.getClass(), "currentStepNumber", "mnHyQbMyld");
        setField(term10453, term10453.getClass(), "currentStepTitle", "KHtaDOIcJZ");
        setField(term10453, term10453.getClass(), "messageID", "vgdwrCZczl");
        setField(term10453, term10453.getClass(), "messageText", "gKMNrpKBpu");
        setField(term10240, term10240.getClass(), "automationStatus", term10453);
        setField(term10240, term10240.getClass(), "autoDeleteOnCompletion", term10530);
        setField(term10240, term10240.getClass(), "access", "ZbHJVEqcoa");
        setField(term10240, term10240.getClass(), "accountInfo", "awDQVEVIKi");
        setField(term10240, term10240.getClass(), "jobStatement", "HJwNgUzZZR");
        setField(term10240, term10240.getClass(), "templateID", "FvUCZgTXhq");
        setField(term10240, term10240.getClass(), "actionID", "wWWidPCHzx");
        setField(term10240, term10240.getClass(), "registryID", "OwPIiBRuKK");
        setField(term10240, term10240.getClass(), "parentRegistryID", "sgfGySMODT");
        setField(term10240, term10240.getClass(), "domainID", "ndAITnOsny");
        setField(term10240, term10240.getClass(), "tenantID", "CVZnTiJucs");
        setField(term10240, term10240.getClass(), "softwareServiceInstanceName", "ecHEQufXoq");
        setField(term10240, term10240.getClass(), "templateName", "btBLMvHzJg");
        setField(term10240, term10240.getClass(), "globalVariableGroup", "JdOMfNWgLP");
        setField(term10240, term10240.getClass(), "isInstanceVariableWithoutPrefix", "uWqXrwAsDU");
        setField(term10240, term10240.getClass(), "steps", term10688);
        setField(term10240, term10240.getClass(), "variables", term10692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVendor", argTypes, term10240, args);
    }

};


