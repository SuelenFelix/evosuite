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

public class WorkflowGetPropertiesResponse_getPercentComplete_195417303818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17710;

    public WorkflowGetPropertiesResponse_getPercentComplete_195417303818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17891 = new Integer(-1685132342);
        Boolean term17893 = new Boolean(false);
        Boolean term17895 = new Boolean(false);
        Boolean term17921 = new Boolean(true);
        Long term17936 = new Long(5262507301787091109L);
        Long term17938 = new Long(-6823727938421990489L);
        Boolean term18000 = new Boolean(true);
        ArrayList term18158 = new ArrayList();
        Object term18164 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term18164, term18164.getClass(), "name", "");
        setField(term18164, term18164.getClass(), "scope", "");
        setField(term18164, term18164.getClass(), "type", "");
        setField(term18164, term18164.getClass(), "value", "");
        setField(term18164, term18164.getClass(), "visibility", "");
        ArrayList term18162 = new ArrayList();
        ((ArrayList) term18162).add(term18164);
        term17710 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term17923 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term17710, term17710.getClass(), "workflowName", "YcgHACNgyo");
        setField(term17710, term17710.getClass(), "workflowKey", "MrUPJzBTEn");
        setField(term17710, term17710.getClass(), "workflowDescription", "IaSymdfFGa");
        setField(term17710, term17710.getClass(), "workflowID", "FxSvJCIpul");
        setField(term17710, term17710.getClass(), "workflowVersion", "HCjKwpexJj");
        setField(term17710, term17710.getClass(), "workflowDefinitionFileMD5Value", "sCpIHVPdfl");
        setField(term17710, term17710.getClass(), "vendor", "lMUBBGRjfY");
        setField(term17710, term17710.getClass(), "owner", "olYpqbolWL");
        setField(term17710, term17710.getClass(), "workflowArchiveSAFID", "MCMCjxXzjw");
        setField(term17710, term17710.getClass(), "system", "pZbbwCURge");
        setField(term17710, term17710.getClass(), "jobsOutputDirectory", "RsOfgdMCMv");
        setField(term17710, term17710.getClass(), "category", "nsofCJqJOR");
        setField(term17710, term17710.getClass(), "productID", "CitJiZwsjF");
        setField(term17710, term17710.getClass(), "productName", "ZiyMvLArWJ");
        setField(term17710, term17710.getClass(), "productVersion", "MaeokjEfWD");
        setField(term17710, term17710.getClass(), "percentComplete", term17891);
        setField(term17710, term17710.getClass(), "isCallable", term17893);
        setField(term17710, term17710.getClass(), "containsParallelSteps", term17895);
        setField(term17710, term17710.getClass(), "scope", "ocZcumnXEz");
        setField(term17710, term17710.getClass(), "statusName", "rNNwyactDR");
        setField(term17710, term17710.getClass(), "deleteCompletedJobs", term17921);
        setField(term17923, term17923.getClass(), "startUser", "QJrTMTdxyh");
        setField(term17923, term17923.getClass(), "startedTime", term17936);
        setField(term17923, term17923.getClass(), "stoppedTime", term17938);
        setField(term17923, term17923.getClass(), "currentStepName", "rgZSPplPSs");
        setField(term17923, term17923.getClass(), "currentStepNumber", "NPUSTXlEKx");
        setField(term17923, term17923.getClass(), "currentStepTitle", "KKFprGoNpl");
        setField(term17923, term17923.getClass(), "messageID", "tWVISJlxKZ");
        setField(term17923, term17923.getClass(), "messageText", "rOZkUKEoaf");
        setField(term17710, term17710.getClass(), "automationStatus", term17923);
        setField(term17710, term17710.getClass(), "autoDeleteOnCompletion", term18000);
        setField(term17710, term17710.getClass(), "access", "yLnzGqyHGL");
        setField(term17710, term17710.getClass(), "accountInfo", "IjprPXBDuY");
        setField(term17710, term17710.getClass(), "jobStatement", "wkqPmmFDAa");
        setField(term17710, term17710.getClass(), "templateID", "rLTDtNqLyW");
        setField(term17710, term17710.getClass(), "actionID", "CLsbWobdgS");
        setField(term17710, term17710.getClass(), "registryID", "TbYrjEyFPc");
        setField(term17710, term17710.getClass(), "parentRegistryID", "muefchpJiZ");
        setField(term17710, term17710.getClass(), "domainID", "tuYaAqvYrh");
        setField(term17710, term17710.getClass(), "tenantID", "CIbhheukbR");
        setField(term17710, term17710.getClass(), "softwareServiceInstanceName", "VOHPpErtan");
        setField(term17710, term17710.getClass(), "templateName", "GDMUlolTNs");
        setField(term17710, term17710.getClass(), "globalVariableGroup", "xpLvWisjzN");
        setField(term17710, term17710.getClass(), "isInstanceVariableWithoutPrefix", "IKfozyyKEj");
        setField(term17710, term17710.getClass(), "steps", term18158);
        setField(term17710, term17710.getClass(), "variables", term18162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPercentComplete", argTypes, term17710, args);
    }

};


