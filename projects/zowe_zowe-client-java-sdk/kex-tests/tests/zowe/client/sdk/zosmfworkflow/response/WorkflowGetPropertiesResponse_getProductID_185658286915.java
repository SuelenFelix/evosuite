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

public class WorkflowGetPropertiesResponse_getProductID_185658286915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15250;

    public WorkflowGetPropertiesResponse_getProductID_185658286915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15431 = new Integer(-883034806);
        Boolean term15433 = new Boolean(true);
        Boolean term15435 = new Boolean(false);
        Boolean term15461 = new Boolean(true);
        Long term15476 = new Long(-7672528020740371001L);
        Long term15478 = new Long(-4502405999831680926L);
        Boolean term15540 = new Boolean(false);
        ArrayList term15698 = new ArrayList();
        ((ArrayList) term15698).add((Object)null);
        ((ArrayList) term15698).add((Object)null);
        Object term15704 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term15704, term15704.getClass(), "name", "");
        setField(term15704, term15704.getClass(), "scope", "");
        setField(term15704, term15704.getClass(), "type", "");
        setField(term15704, term15704.getClass(), "value", "");
        setField(term15704, term15704.getClass(), "visibility", "");
        Object term15710 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term15710, term15710.getClass(), "name", "");
        setField(term15710, term15710.getClass(), "scope", "");
        setField(term15710, term15710.getClass(), "type", "");
        setField(term15710, term15710.getClass(), "value", "");
        setField(term15710, term15710.getClass(), "visibility", "");
        ArrayList term15702 = new ArrayList();
        ((ArrayList) term15702).add(term15704);
        ((ArrayList) term15702).add(term15710);
        term15250 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term15463 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term15250, term15250.getClass(), "workflowName", "GrTaccOQzl");
        setField(term15250, term15250.getClass(), "workflowKey", "uuSYOUCVHU");
        setField(term15250, term15250.getClass(), "workflowDescription", "DfWwbodtVw");
        setField(term15250, term15250.getClass(), "workflowID", "kTbFMpVWqx");
        setField(term15250, term15250.getClass(), "workflowVersion", "HegRNsidFg");
        setField(term15250, term15250.getClass(), "workflowDefinitionFileMD5Value", "udRdJkgXmH");
        setField(term15250, term15250.getClass(), "vendor", "FBCXbjHVXO");
        setField(term15250, term15250.getClass(), "owner", "dIWAnvmLiC");
        setField(term15250, term15250.getClass(), "workflowArchiveSAFID", "CuWebzZQjZ");
        setField(term15250, term15250.getClass(), "system", "wRVaaJxKYI");
        setField(term15250, term15250.getClass(), "jobsOutputDirectory", "yOQuJXRvOo");
        setField(term15250, term15250.getClass(), "category", "XmLHcnVsch");
        setField(term15250, term15250.getClass(), "productID", "Yrvtdcltri");
        setField(term15250, term15250.getClass(), "productName", "RxrsjXRVcT");
        setField(term15250, term15250.getClass(), "productVersion", "cfRimmJxqA");
        setField(term15250, term15250.getClass(), "percentComplete", term15431);
        setField(term15250, term15250.getClass(), "isCallable", term15433);
        setField(term15250, term15250.getClass(), "containsParallelSteps", term15435);
        setField(term15250, term15250.getClass(), "scope", "oOnRVGqFmy");
        setField(term15250, term15250.getClass(), "statusName", "LaXzFIlWMk");
        setField(term15250, term15250.getClass(), "deleteCompletedJobs", term15461);
        setField(term15463, term15463.getClass(), "startUser", "GuVQjhBxma");
        setField(term15463, term15463.getClass(), "startedTime", term15476);
        setField(term15463, term15463.getClass(), "stoppedTime", term15478);
        setField(term15463, term15463.getClass(), "currentStepName", "WAVMPPbIfL");
        setField(term15463, term15463.getClass(), "currentStepNumber", "GISHLsgALf");
        setField(term15463, term15463.getClass(), "currentStepTitle", "PVykkUSgBq");
        setField(term15463, term15463.getClass(), "messageID", "tnKbZaCsuj");
        setField(term15463, term15463.getClass(), "messageText", "ZFpcYBgLNC");
        setField(term15250, term15250.getClass(), "automationStatus", term15463);
        setField(term15250, term15250.getClass(), "autoDeleteOnCompletion", term15540);
        setField(term15250, term15250.getClass(), "access", "VAGkRppBem");
        setField(term15250, term15250.getClass(), "accountInfo", "eKcEJRxNSu");
        setField(term15250, term15250.getClass(), "jobStatement", "NTXQPWFYSA");
        setField(term15250, term15250.getClass(), "templateID", "fOuOhBpldm");
        setField(term15250, term15250.getClass(), "actionID", "qQQRKGPyIM");
        setField(term15250, term15250.getClass(), "registryID", "lzcwhvjdFg");
        setField(term15250, term15250.getClass(), "parentRegistryID", "dfzWTjcjnI");
        setField(term15250, term15250.getClass(), "domainID", "bsnZXGEvFv");
        setField(term15250, term15250.getClass(), "tenantID", "osFrHWYeRy");
        setField(term15250, term15250.getClass(), "softwareServiceInstanceName", "scpIQUfPKw");
        setField(term15250, term15250.getClass(), "templateName", "QKYBpCjuYt");
        setField(term15250, term15250.getClass(), "globalVariableGroup", "vjiRfoGdkl");
        setField(term15250, term15250.getClass(), "isInstanceVariableWithoutPrefix", "TwaxeSHvnR");
        setField(term15250, term15250.getClass(), "steps", term15698);
        setField(term15250, term15250.getClass(), "variables", term15702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductID", argTypes, term15250, args);
    }

};


