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

public class WorkflowGetPropertiesResponse_getIsCallable_75159575219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18532;

    public WorkflowGetPropertiesResponse_getIsCallable_75159575219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18713 = new Integer(-1456670397);
        Boolean term18715 = new Boolean(true);
        Boolean term18717 = new Boolean(false);
        Boolean term18743 = new Boolean(false);
        Long term18758 = new Long(-484994522244390100L);
        Long term18760 = new Long(1233889271256172047L);
        Boolean term18822 = new Boolean(false);
        ArrayList term18980 = new ArrayList();
        ((ArrayList) term18980).add((Object)null);
        ((ArrayList) term18980).add((Object)null);
        ((ArrayList) term18980).add((Object)null);
        ((ArrayList) term18980).add((Object)null);
        ((ArrayList) term18980).add((Object)null);
        Object term18986 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term18986, term18986.getClass(), "name", "");
        setField(term18986, term18986.getClass(), "scope", "");
        setField(term18986, term18986.getClass(), "type", "");
        setField(term18986, term18986.getClass(), "value", "");
        setField(term18986, term18986.getClass(), "visibility", "");
        Object term18992 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term18992, term18992.getClass(), "name", "");
        setField(term18992, term18992.getClass(), "scope", "");
        setField(term18992, term18992.getClass(), "type", "");
        setField(term18992, term18992.getClass(), "value", "");
        setField(term18992, term18992.getClass(), "visibility", "");
        Object term18998 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term18998, term18998.getClass(), "name", "");
        setField(term18998, term18998.getClass(), "scope", "");
        setField(term18998, term18998.getClass(), "type", "");
        setField(term18998, term18998.getClass(), "value", "");
        setField(term18998, term18998.getClass(), "visibility", "");
        Object term19004 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term19004, term19004.getClass(), "name", "");
        setField(term19004, term19004.getClass(), "scope", "");
        setField(term19004, term19004.getClass(), "type", "");
        setField(term19004, term19004.getClass(), "value", "");
        setField(term19004, term19004.getClass(), "visibility", "");
        ArrayList term18984 = new ArrayList();
        ((ArrayList) term18984).add(term18986);
        ((ArrayList) term18984).add(term18992);
        ((ArrayList) term18984).add(term18998);
        ((ArrayList) term18984).add(term19004);
        term18532 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term18745 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term18532, term18532.getClass(), "workflowName", "kEehLMZcOU");
        setField(term18532, term18532.getClass(), "workflowKey", "RhLliqMiOF");
        setField(term18532, term18532.getClass(), "workflowDescription", "jlhonEGrJH");
        setField(term18532, term18532.getClass(), "workflowID", "RKcKwlEYZb");
        setField(term18532, term18532.getClass(), "workflowVersion", "acPRDlpsid");
        setField(term18532, term18532.getClass(), "workflowDefinitionFileMD5Value", "YyojIzvxLZ");
        setField(term18532, term18532.getClass(), "vendor", "fxapaYlZea");
        setField(term18532, term18532.getClass(), "owner", "VJgREHwfRM");
        setField(term18532, term18532.getClass(), "workflowArchiveSAFID", "kXnpLIZTAr");
        setField(term18532, term18532.getClass(), "system", "ZiMAmqpbzk");
        setField(term18532, term18532.getClass(), "jobsOutputDirectory", "UwJtBPAtSU");
        setField(term18532, term18532.getClass(), "category", "nBaMiSdFmS");
        setField(term18532, term18532.getClass(), "productID", "ezwGsjqTai");
        setField(term18532, term18532.getClass(), "productName", "ngeHWMRjnn");
        setField(term18532, term18532.getClass(), "productVersion", "FOKfDXQxMM");
        setField(term18532, term18532.getClass(), "percentComplete", term18713);
        setField(term18532, term18532.getClass(), "isCallable", term18715);
        setField(term18532, term18532.getClass(), "containsParallelSteps", term18717);
        setField(term18532, term18532.getClass(), "scope", "gbxMvhrWpA");
        setField(term18532, term18532.getClass(), "statusName", "huNTIobUHx");
        setField(term18532, term18532.getClass(), "deleteCompletedJobs", term18743);
        setField(term18745, term18745.getClass(), "startUser", "MrVeCmRVzF");
        setField(term18745, term18745.getClass(), "startedTime", term18758);
        setField(term18745, term18745.getClass(), "stoppedTime", term18760);
        setField(term18745, term18745.getClass(), "currentStepName", "CPVnQYACKw");
        setField(term18745, term18745.getClass(), "currentStepNumber", "sbdLhVCRsw");
        setField(term18745, term18745.getClass(), "currentStepTitle", "soJHvZwbtF");
        setField(term18745, term18745.getClass(), "messageID", "dTGwgkfDVj");
        setField(term18745, term18745.getClass(), "messageText", "zHiuLPzYQM");
        setField(term18532, term18532.getClass(), "automationStatus", term18745);
        setField(term18532, term18532.getClass(), "autoDeleteOnCompletion", term18822);
        setField(term18532, term18532.getClass(), "access", "ioYxUYJBrh");
        setField(term18532, term18532.getClass(), "accountInfo", "GXoLEdKEIe");
        setField(term18532, term18532.getClass(), "jobStatement", "EugWXkztim");
        setField(term18532, term18532.getClass(), "templateID", "DvRdOzzihn");
        setField(term18532, term18532.getClass(), "actionID", "wIygCdQAKO");
        setField(term18532, term18532.getClass(), "registryID", "JsXroBYqwr");
        setField(term18532, term18532.getClass(), "parentRegistryID", "YciMAObLwl");
        setField(term18532, term18532.getClass(), "domainID", "qAmVqwwdyf");
        setField(term18532, term18532.getClass(), "tenantID", "IXPaHQnEUy");
        setField(term18532, term18532.getClass(), "softwareServiceInstanceName", "zhcWVVrrjs");
        setField(term18532, term18532.getClass(), "templateName", "EAMaFLdmaG");
        setField(term18532, term18532.getClass(), "globalVariableGroup", "DYZSJMwbhX");
        setField(term18532, term18532.getClass(), "isInstanceVariableWithoutPrefix", "QGcshsIIWo");
        setField(term18532, term18532.getClass(), "steps", term18980);
        setField(term18532, term18532.getClass(), "variables", term18984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsCallable", argTypes, term18532, args);
    }

};


