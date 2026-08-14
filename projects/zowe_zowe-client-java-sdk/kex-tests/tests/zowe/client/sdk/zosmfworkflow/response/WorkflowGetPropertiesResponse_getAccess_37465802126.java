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

public class WorkflowGetPropertiesResponse_getAccess_37465802126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24370;

    public WorkflowGetPropertiesResponse_getAccess_37465802126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24551 = new Integer(-1007160944);
        Boolean term24553 = new Boolean(true);
        Boolean term24555 = new Boolean(true);
        Boolean term24581 = new Boolean(true);
        Long term24596 = new Long(-4443169559037975007L);
        Long term24598 = new Long(-3842548265506930260L);
        Boolean term24660 = new Boolean(false);
        ArrayList term24818 = new ArrayList();
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ((ArrayList) term24818).add((Object)null);
        ArrayList term24822 = new ArrayList();
        term24370 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term24583 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term24370, term24370.getClass(), "workflowName", "SDbDgydVpg");
        setField(term24370, term24370.getClass(), "workflowKey", "EEMaiNkiOH");
        setField(term24370, term24370.getClass(), "workflowDescription", "sFdmTylvqh");
        setField(term24370, term24370.getClass(), "workflowID", "rgniLaOaiz");
        setField(term24370, term24370.getClass(), "workflowVersion", "fzQzzdIOMC");
        setField(term24370, term24370.getClass(), "workflowDefinitionFileMD5Value", "hLVDOhfCKX");
        setField(term24370, term24370.getClass(), "vendor", "yXLTfzOgfX");
        setField(term24370, term24370.getClass(), "owner", "MANlfBKTPY");
        setField(term24370, term24370.getClass(), "workflowArchiveSAFID", "mRoEmuCJhW");
        setField(term24370, term24370.getClass(), "system", "JJUWbMXpyM");
        setField(term24370, term24370.getClass(), "jobsOutputDirectory", "KDrRQWVXok");
        setField(term24370, term24370.getClass(), "category", "oOOwvWgxtf");
        setField(term24370, term24370.getClass(), "productID", "ywoADeiUfF");
        setField(term24370, term24370.getClass(), "productName", "loHiudJxbt");
        setField(term24370, term24370.getClass(), "productVersion", "lRbxbybNew");
        setField(term24370, term24370.getClass(), "percentComplete", term24551);
        setField(term24370, term24370.getClass(), "isCallable", term24553);
        setField(term24370, term24370.getClass(), "containsParallelSteps", term24555);
        setField(term24370, term24370.getClass(), "scope", "WzGudiEARD");
        setField(term24370, term24370.getClass(), "statusName", "IoefPqGtaj");
        setField(term24370, term24370.getClass(), "deleteCompletedJobs", term24581);
        setField(term24583, term24583.getClass(), "startUser", "YMmtjELJuB");
        setField(term24583, term24583.getClass(), "startedTime", term24596);
        setField(term24583, term24583.getClass(), "stoppedTime", term24598);
        setField(term24583, term24583.getClass(), "currentStepName", "FzyIShiOmb");
        setField(term24583, term24583.getClass(), "currentStepNumber", "PEUfeJaZTk");
        setField(term24583, term24583.getClass(), "currentStepTitle", "AIvyeIdskz");
        setField(term24583, term24583.getClass(), "messageID", "iSQqMWMRlU");
        setField(term24583, term24583.getClass(), "messageText", "djWEnlbOXu");
        setField(term24370, term24370.getClass(), "automationStatus", term24583);
        setField(term24370, term24370.getClass(), "autoDeleteOnCompletion", term24660);
        setField(term24370, term24370.getClass(), "access", "MvDMzQBWME");
        setField(term24370, term24370.getClass(), "accountInfo", "sZyAwmdGVS");
        setField(term24370, term24370.getClass(), "jobStatement", "VoKhXiLAaW");
        setField(term24370, term24370.getClass(), "templateID", "CaalXzRXQI");
        setField(term24370, term24370.getClass(), "actionID", "eRBnKPjyVg");
        setField(term24370, term24370.getClass(), "registryID", "svPqsHBvrm");
        setField(term24370, term24370.getClass(), "parentRegistryID", "sRzUJLYMmB");
        setField(term24370, term24370.getClass(), "domainID", "XxILklSDwz");
        setField(term24370, term24370.getClass(), "tenantID", "TLjhFZbwKO");
        setField(term24370, term24370.getClass(), "softwareServiceInstanceName", "nxEbLIApFc");
        setField(term24370, term24370.getClass(), "templateName", "zzsdNZhejE");
        setField(term24370, term24370.getClass(), "globalVariableGroup", "ILoodMZrgR");
        setField(term24370, term24370.getClass(), "isInstanceVariableWithoutPrefix", "XQiKmsCacK");
        setField(term24370, term24370.getClass(), "steps", term24818);
        setField(term24370, term24370.getClass(), "variables", term24822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccess", argTypes, term24370, args);
    }

};


