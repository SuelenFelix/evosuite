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

public class WorkflowGetPropertiesResponse_getJobStatement_179544962328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26002;

    public WorkflowGetPropertiesResponse_getJobStatement_179544962328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26183 = new Integer(590364439);
        Boolean term26185 = new Boolean(true);
        Boolean term26187 = new Boolean(true);
        Boolean term26213 = new Boolean(true);
        Long term26228 = new Long(-1154553077993834885L);
        Long term26230 = new Long(-2850532706972744550L);
        Boolean term26292 = new Boolean(false);
        ArrayList term26450 = new ArrayList();
        ((ArrayList) term26450).add((Object)null);
        ((ArrayList) term26450).add((Object)null);
        ((ArrayList) term26450).add((Object)null);
        ((ArrayList) term26450).add((Object)null);
        ((ArrayList) term26450).add((Object)null);
        ((ArrayList) term26450).add((Object)null);
        ((ArrayList) term26450).add((Object)null);
        Object term26456 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term26456, term26456.getClass(), "name", "");
        setField(term26456, term26456.getClass(), "scope", "");
        setField(term26456, term26456.getClass(), "type", "");
        setField(term26456, term26456.getClass(), "value", "");
        setField(term26456, term26456.getClass(), "visibility", "");
        Object term26462 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term26462, term26462.getClass(), "name", "");
        setField(term26462, term26462.getClass(), "scope", "");
        setField(term26462, term26462.getClass(), "type", "");
        setField(term26462, term26462.getClass(), "value", "");
        setField(term26462, term26462.getClass(), "visibility", "");
        Object term26468 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term26468, term26468.getClass(), "name", "");
        setField(term26468, term26468.getClass(), "scope", "");
        setField(term26468, term26468.getClass(), "type", "");
        setField(term26468, term26468.getClass(), "value", "");
        setField(term26468, term26468.getClass(), "visibility", "");
        Object term26474 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term26474, term26474.getClass(), "name", "");
        setField(term26474, term26474.getClass(), "scope", "");
        setField(term26474, term26474.getClass(), "type", "");
        setField(term26474, term26474.getClass(), "value", "");
        setField(term26474, term26474.getClass(), "visibility", "");
        ArrayList term26454 = new ArrayList();
        ((ArrayList) term26454).add(term26456);
        ((ArrayList) term26454).add(term26462);
        ((ArrayList) term26454).add(term26468);
        ((ArrayList) term26454).add(term26474);
        term26002 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term26215 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term26002, term26002.getClass(), "workflowName", "yqEphNxUPZ");
        setField(term26002, term26002.getClass(), "workflowKey", "mJJxTuZuKO");
        setField(term26002, term26002.getClass(), "workflowDescription", "anSZCikKpS");
        setField(term26002, term26002.getClass(), "workflowID", "zvMQGbTtsV");
        setField(term26002, term26002.getClass(), "workflowVersion", "DyUuIDzZPG");
        setField(term26002, term26002.getClass(), "workflowDefinitionFileMD5Value", "EGQLusEtRN");
        setField(term26002, term26002.getClass(), "vendor", "GwGUMPdvZq");
        setField(term26002, term26002.getClass(), "owner", "iXRAYcFyfS");
        setField(term26002, term26002.getClass(), "workflowArchiveSAFID", "lokyclbLEz");
        setField(term26002, term26002.getClass(), "system", "hAPmQGaxkI");
        setField(term26002, term26002.getClass(), "jobsOutputDirectory", "ojrnLnJZjT");
        setField(term26002, term26002.getClass(), "category", "rtvXSMjOdJ");
        setField(term26002, term26002.getClass(), "productID", "EDkfjuDpNv");
        setField(term26002, term26002.getClass(), "productName", "LNHkTUfuHX");
        setField(term26002, term26002.getClass(), "productVersion", "SVWcOAHiTp");
        setField(term26002, term26002.getClass(), "percentComplete", term26183);
        setField(term26002, term26002.getClass(), "isCallable", term26185);
        setField(term26002, term26002.getClass(), "containsParallelSteps", term26187);
        setField(term26002, term26002.getClass(), "scope", "oShLCaneoQ");
        setField(term26002, term26002.getClass(), "statusName", "nwKkzNpzyC");
        setField(term26002, term26002.getClass(), "deleteCompletedJobs", term26213);
        setField(term26215, term26215.getClass(), "startUser", "CwrsdYnHpH");
        setField(term26215, term26215.getClass(), "startedTime", term26228);
        setField(term26215, term26215.getClass(), "stoppedTime", term26230);
        setField(term26215, term26215.getClass(), "currentStepName", "jifjXNXluS");
        setField(term26215, term26215.getClass(), "currentStepNumber", "uDayZDXPOP");
        setField(term26215, term26215.getClass(), "currentStepTitle", "kbjWxMAIhY");
        setField(term26215, term26215.getClass(), "messageID", "GmtlSgqKcI");
        setField(term26215, term26215.getClass(), "messageText", "ssSbvPoMjB");
        setField(term26002, term26002.getClass(), "automationStatus", term26215);
        setField(term26002, term26002.getClass(), "autoDeleteOnCompletion", term26292);
        setField(term26002, term26002.getClass(), "access", "mhRVADhaKm");
        setField(term26002, term26002.getClass(), "accountInfo", "rLldJrTAay");
        setField(term26002, term26002.getClass(), "jobStatement", "HvSKssbEES");
        setField(term26002, term26002.getClass(), "templateID", "UjIAQAHhul");
        setField(term26002, term26002.getClass(), "actionID", "oWBXOvjPUT");
        setField(term26002, term26002.getClass(), "registryID", "DcKqrrTdId");
        setField(term26002, term26002.getClass(), "parentRegistryID", "fwtOJhjXbW");
        setField(term26002, term26002.getClass(), "domainID", "ltWBKZaXwJ");
        setField(term26002, term26002.getClass(), "tenantID", "FSQpgxQnsH");
        setField(term26002, term26002.getClass(), "softwareServiceInstanceName", "LBPwnVMEpP");
        setField(term26002, term26002.getClass(), "templateName", "cwALzyQVjH");
        setField(term26002, term26002.getClass(), "globalVariableGroup", "jlYNjpdkoz");
        setField(term26002, term26002.getClass(), "isInstanceVariableWithoutPrefix", "DZAGnhJkeU");
        setField(term26002, term26002.getClass(), "steps", term26450);
        setField(term26002, term26002.getClass(), "variables", term26454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobStatement", argTypes, term26002, args);
    }

};


