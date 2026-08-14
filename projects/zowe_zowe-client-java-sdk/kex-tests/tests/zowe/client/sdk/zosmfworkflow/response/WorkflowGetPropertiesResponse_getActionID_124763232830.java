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

public class WorkflowGetPropertiesResponse_getActionID_124763232830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27658;

    public WorkflowGetPropertiesResponse_getActionID_124763232830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27839 = new Integer(-1275173084);
        Boolean term27841 = new Boolean(true);
        Boolean term27843 = new Boolean(false);
        Boolean term27869 = new Boolean(false);
        Long term27884 = new Long(-7738503207562305297L);
        Long term27886 = new Long(3825396310311739952L);
        Boolean term27948 = new Boolean(false);
        ArrayList term28106 = new ArrayList();
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        ((ArrayList) term28106).add((Object)null);
        Object term28112 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term28112, term28112.getClass(), "name", "");
        setField(term28112, term28112.getClass(), "scope", "");
        setField(term28112, term28112.getClass(), "type", "");
        setField(term28112, term28112.getClass(), "value", "");
        setField(term28112, term28112.getClass(), "visibility", "");
        Object term28118 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term28118, term28118.getClass(), "name", "");
        setField(term28118, term28118.getClass(), "scope", "");
        setField(term28118, term28118.getClass(), "type", "");
        setField(term28118, term28118.getClass(), "value", "");
        setField(term28118, term28118.getClass(), "visibility", "");
        Object term28124 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term28124, term28124.getClass(), "name", "");
        setField(term28124, term28124.getClass(), "scope", "");
        setField(term28124, term28124.getClass(), "type", "");
        setField(term28124, term28124.getClass(), "value", "");
        setField(term28124, term28124.getClass(), "visibility", "");
        Object term28130 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term28130, term28130.getClass(), "name", "");
        setField(term28130, term28130.getClass(), "scope", "");
        setField(term28130, term28130.getClass(), "type", "");
        setField(term28130, term28130.getClass(), "value", "");
        setField(term28130, term28130.getClass(), "visibility", "");
        ArrayList term28110 = new ArrayList();
        ((ArrayList) term28110).add(term28112);
        ((ArrayList) term28110).add(term28118);
        ((ArrayList) term28110).add(term28124);
        ((ArrayList) term28110).add(term28130);
        term27658 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term27871 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term27658, term27658.getClass(), "workflowName", "cyobgydTWP");
        setField(term27658, term27658.getClass(), "workflowKey", "moHYQFfLnp");
        setField(term27658, term27658.getClass(), "workflowDescription", "BrPqlvIbEQ");
        setField(term27658, term27658.getClass(), "workflowID", "JDTrhGRsDT");
        setField(term27658, term27658.getClass(), "workflowVersion", "vHxsVQImjS");
        setField(term27658, term27658.getClass(), "workflowDefinitionFileMD5Value", "jkVaRrZHQX");
        setField(term27658, term27658.getClass(), "vendor", "gSFFUuJipG");
        setField(term27658, term27658.getClass(), "owner", "bQWfIFvxkQ");
        setField(term27658, term27658.getClass(), "workflowArchiveSAFID", "aDoBLXfFQI");
        setField(term27658, term27658.getClass(), "system", "HTimNhSNVi");
        setField(term27658, term27658.getClass(), "jobsOutputDirectory", "IWJWbrHcqm");
        setField(term27658, term27658.getClass(), "category", "ucTcadpUdW");
        setField(term27658, term27658.getClass(), "productID", "AscVKZhCwm");
        setField(term27658, term27658.getClass(), "productName", "HCvSsQWjLn");
        setField(term27658, term27658.getClass(), "productVersion", "FTuOcSieav");
        setField(term27658, term27658.getClass(), "percentComplete", term27839);
        setField(term27658, term27658.getClass(), "isCallable", term27841);
        setField(term27658, term27658.getClass(), "containsParallelSteps", term27843);
        setField(term27658, term27658.getClass(), "scope", "qSnwPXRuzC");
        setField(term27658, term27658.getClass(), "statusName", "gqhqalMaKC");
        setField(term27658, term27658.getClass(), "deleteCompletedJobs", term27869);
        setField(term27871, term27871.getClass(), "startUser", "qkMduZHBXR");
        setField(term27871, term27871.getClass(), "startedTime", term27884);
        setField(term27871, term27871.getClass(), "stoppedTime", term27886);
        setField(term27871, term27871.getClass(), "currentStepName", "jMQsCLYfKd");
        setField(term27871, term27871.getClass(), "currentStepNumber", "dpcpGqEQLd");
        setField(term27871, term27871.getClass(), "currentStepTitle", "pButgbcWlR");
        setField(term27871, term27871.getClass(), "messageID", "tPiZMhJIXj");
        setField(term27871, term27871.getClass(), "messageText", "lrEkNimddJ");
        setField(term27658, term27658.getClass(), "automationStatus", term27871);
        setField(term27658, term27658.getClass(), "autoDeleteOnCompletion", term27948);
        setField(term27658, term27658.getClass(), "access", "fkeYGEUxMA");
        setField(term27658, term27658.getClass(), "accountInfo", "aJUGPodUIW");
        setField(term27658, term27658.getClass(), "jobStatement", "NpjPDfnDRd");
        setField(term27658, term27658.getClass(), "templateID", "SWMYovqYdk");
        setField(term27658, term27658.getClass(), "actionID", "TQuvAoQcBe");
        setField(term27658, term27658.getClass(), "registryID", "nGYLfZrtWO");
        setField(term27658, term27658.getClass(), "parentRegistryID", "DBufEhhBCQ");
        setField(term27658, term27658.getClass(), "domainID", "GiNZRBZjgO");
        setField(term27658, term27658.getClass(), "tenantID", "ceGAKcClsG");
        setField(term27658, term27658.getClass(), "softwareServiceInstanceName", "SEldZGJyvX");
        setField(term27658, term27658.getClass(), "templateName", "vyvpqcHTQN");
        setField(term27658, term27658.getClass(), "globalVariableGroup", "QQcpNMSHvA");
        setField(term27658, term27658.getClass(), "isInstanceVariableWithoutPrefix", "FLLklaMZvg");
        setField(term27658, term27658.getClass(), "steps", term28106);
        setField(term27658, term27658.getClass(), "variables", term28110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActionID", argTypes, term27658, args);
    }

};


