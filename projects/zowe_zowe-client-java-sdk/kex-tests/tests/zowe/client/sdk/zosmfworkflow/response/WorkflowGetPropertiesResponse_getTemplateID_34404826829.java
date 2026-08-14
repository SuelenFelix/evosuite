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

public class WorkflowGetPropertiesResponse_getTemplateID_34404826829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26842;

    public WorkflowGetPropertiesResponse_getTemplateID_34404826829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27023 = new Integer(865208305);
        Boolean term27025 = new Boolean(true);
        Boolean term27027 = new Boolean(true);
        Boolean term27053 = new Boolean(true);
        Long term27068 = new Long(-2644215923136513282L);
        Long term27070 = new Long(-1468719814009985452L);
        Boolean term27132 = new Boolean(false);
        ArrayList term27290 = new ArrayList();
        ((ArrayList) term27290).add((Object)null);
        ((ArrayList) term27290).add((Object)null);
        ((ArrayList) term27290).add((Object)null);
        ((ArrayList) term27290).add((Object)null);
        ((ArrayList) term27290).add((Object)null);
        ((ArrayList) term27290).add((Object)null);
        ((ArrayList) term27290).add((Object)null);
        ((ArrayList) term27290).add((Object)null);
        ArrayList term27294 = new ArrayList();
        term26842 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term27055 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term26842, term26842.getClass(), "workflowName", "DLFXidLbuT");
        setField(term26842, term26842.getClass(), "workflowKey", "FjkxfTXGIH");
        setField(term26842, term26842.getClass(), "workflowDescription", "KJkWSFFnmR");
        setField(term26842, term26842.getClass(), "workflowID", "FBYRIDZvmW");
        setField(term26842, term26842.getClass(), "workflowVersion", "IyjLfrDZrV");
        setField(term26842, term26842.getClass(), "workflowDefinitionFileMD5Value", "BRMTHqqoRg");
        setField(term26842, term26842.getClass(), "vendor", "nOElYZBeyU");
        setField(term26842, term26842.getClass(), "owner", "eUXPtGmoNg");
        setField(term26842, term26842.getClass(), "workflowArchiveSAFID", "ZjqXyUmAJY");
        setField(term26842, term26842.getClass(), "system", "pjEERkBbYo");
        setField(term26842, term26842.getClass(), "jobsOutputDirectory", "FQPqmjhWog");
        setField(term26842, term26842.getClass(), "category", "sYtJsiIiSX");
        setField(term26842, term26842.getClass(), "productID", "KgfsAwTFFn");
        setField(term26842, term26842.getClass(), "productName", "hFnFlgThhp");
        setField(term26842, term26842.getClass(), "productVersion", "aEZAnHuGSR");
        setField(term26842, term26842.getClass(), "percentComplete", term27023);
        setField(term26842, term26842.getClass(), "isCallable", term27025);
        setField(term26842, term26842.getClass(), "containsParallelSteps", term27027);
        setField(term26842, term26842.getClass(), "scope", "uMzGGnJFYF");
        setField(term26842, term26842.getClass(), "statusName", "iAIRLRjFkP");
        setField(term26842, term26842.getClass(), "deleteCompletedJobs", term27053);
        setField(term27055, term27055.getClass(), "startUser", "cdXvvxXVTz");
        setField(term27055, term27055.getClass(), "startedTime", term27068);
        setField(term27055, term27055.getClass(), "stoppedTime", term27070);
        setField(term27055, term27055.getClass(), "currentStepName", "tXsfWIqIPn");
        setField(term27055, term27055.getClass(), "currentStepNumber", "tDmfqEyHaN");
        setField(term27055, term27055.getClass(), "currentStepTitle", "mTSMXFkWRr");
        setField(term27055, term27055.getClass(), "messageID", "qdIiMKwfzT");
        setField(term27055, term27055.getClass(), "messageText", "qrmUWIxufo");
        setField(term26842, term26842.getClass(), "automationStatus", term27055);
        setField(term26842, term26842.getClass(), "autoDeleteOnCompletion", term27132);
        setField(term26842, term26842.getClass(), "access", "SeWCUkXfZv");
        setField(term26842, term26842.getClass(), "accountInfo", "woQcQRYwNH");
        setField(term26842, term26842.getClass(), "jobStatement", "uQjzusifTg");
        setField(term26842, term26842.getClass(), "templateID", "mOulGkUjOk");
        setField(term26842, term26842.getClass(), "actionID", "hNWRuNEgOf");
        setField(term26842, term26842.getClass(), "registryID", "CEtjGBplmv");
        setField(term26842, term26842.getClass(), "parentRegistryID", "XosDTAzIAT");
        setField(term26842, term26842.getClass(), "domainID", "lcCEhCpiZM");
        setField(term26842, term26842.getClass(), "tenantID", "OPJlqMJxdq");
        setField(term26842, term26842.getClass(), "softwareServiceInstanceName", "COhzwXcfds");
        setField(term26842, term26842.getClass(), "templateName", "anncJTnzrg");
        setField(term26842, term26842.getClass(), "globalVariableGroup", "GMylOocLnB");
        setField(term26842, term26842.getClass(), "isInstanceVariableWithoutPrefix", "spOehuHwSl");
        setField(term26842, term26842.getClass(), "steps", term27290);
        setField(term26842, term26842.getClass(), "variables", term27294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateID", argTypes, term26842, args);
    }

};


