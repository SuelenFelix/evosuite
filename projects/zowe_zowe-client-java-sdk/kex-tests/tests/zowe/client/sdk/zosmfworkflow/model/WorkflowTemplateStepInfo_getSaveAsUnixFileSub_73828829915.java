package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class WorkflowTemplateStepInfo_getSaveAsUnixFileSub_73828829915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45948;

    public WorkflowTemplateStepInfo_getSaveAsUnixFileSub_73828829915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term45961 = new Boolean(false);
        Integer term45975 = new Integer(-1070592289);
        Integer term46078 = new Integer(-1464172784);
        Integer term46080 = new Integer(32185364);
        Integer term46082 = new Integer(1768204942);
        Object term46077 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term46077, term46077.getClass(), "id", term46078);
        setField(term46077, term46077.getClass(), "ddname", null);
        setField(term46077, term46077.getClass(), "byteCount", term46080);
        setField(term46077, term46077.getClass(), "recordCount", term46082);
        setField(term46077, term46077.getClass(), "classs", null);
        setField(term46077, term46077.getClass(), "stepname", null);
        setField(term46077, term46077.getClass(), "procstep", null);
        Integer term46085 = new Integer(1252951645);
        Integer term46087 = new Integer(574481092);
        Integer term46089 = new Integer(-310528004);
        Object term46084 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term46084, term46084.getClass(), "id", term46085);
        setField(term46084, term46084.getClass(), "ddname", null);
        setField(term46084, term46084.getClass(), "byteCount", term46087);
        setField(term46084, term46084.getClass(), "recordCount", term46089);
        setField(term46084, term46084.getClass(), "classs", null);
        setField(term46084, term46084.getClass(), "stepname", null);
        setField(term46084, term46084.getClass(), "procstep", null);
        Integer term46092 = new Integer(-634976996);
        Integer term46094 = new Integer(-1015274146);
        Integer term46096 = new Integer(-49052672);
        Object term46091 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term46091, term46091.getClass(), "id", term46092);
        setField(term46091, term46091.getClass(), "ddname", null);
        setField(term46091, term46091.getClass(), "byteCount", term46094);
        setField(term46091, term46091.getClass(), "recordCount", term46096);
        setField(term46091, term46091.getClass(), "classs", null);
        setField(term46091, term46091.getClass(), "stepname", null);
        setField(term46091, term46091.getClass(), "procstep", null);
        ArrayList term46075 = new ArrayList();
        ((ArrayList) term46075).add(term46077);
        ((ArrayList) term46075).add(term46084);
        ((ArrayList) term46075).add(term46091);
        Boolean term46112 = new Boolean(true);
        Boolean term46174 = new Boolean(true);
        Boolean term46188 = new Boolean(false);
        ArrayList term46214 = new ArrayList();
        ((ArrayList) term46214).add("jYJrGEVHCD");
        ((ArrayList) term46214).add("wlBPkhpzWH");
        Boolean term46266 = new Boolean(false);
        Object term46270 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term46270, term46270.getClass(), "name", "");
        setField(term46270, term46270.getClass(), "scope", "");
        Object term46273 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term46273, term46273.getClass(), "name", "");
        setField(term46273, term46273.getClass(), "scope", "");
        Object term46276 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term46276, term46276.getClass(), "name", "");
        setField(term46276, term46276.getClass(), "scope", "");
        ArrayList term46268 = new ArrayList();
        ((ArrayList) term46268).add(term46270);
        ((ArrayList) term46268).add(term46273);
        ((ArrayList) term46268).add(term46276);
        Boolean term46341 = new Boolean(true);
        Boolean term46343 = new Boolean(false);
        ArrayList term46345 = new ArrayList();
        ((ArrayList) term46345).add("vHdYsSmEmG");
        ((ArrayList) term46345).add("UDIVCqBmxp");
        ((ArrayList) term46345).add("npyBQorcHP");
        ((ArrayList) term46345).add("pzvYCQwkoA");
        ((ArrayList) term46345).add("TGLDiqWTkO");
        ((ArrayList) term46345).add("NwjEUxXUkk");
        ((ArrayList) term46345).add("CFBoXISoRu");
        ((ArrayList) term46345).add("gRmiKAUyCW");
        ((ArrayList) term46345).add("rfXVAViErl");
        Boolean term46457 = new Boolean(false);
        Boolean term46471 = new Boolean(true);
        Boolean term46473 = new Boolean(false);
        Boolean term46523 = new Boolean(true);
        Boolean term46525 = new Boolean(true);
        ArrayList term46527 = new ArrayList();
        ((ArrayList) term46527).add((Object)null);
        ((ArrayList) term46527).add((Object)null);
        ((ArrayList) term46527).add((Object)null);
        ((ArrayList) term46527).add((Object)null);
        ((ArrayList) term46527).add((Object)null);
        term45948 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term45977 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term45978 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term45948, term45948.getClass(), "template", "EkgwvUqGYF");
        setField(term45948, term45948.getClass(), "templateSub", term45961);
        setField(term45948, term45948.getClass(), "submitAs", "sbtPNrurvf");
        setField(term45948, term45948.getClass(), "maxLrecl", term45975);
        setField(term45978, term45978.getClass(), "retcode", "zomtOAIouP");
        setField(term45978, term45978.getClass(), "jobName", "pwHkUmkBGN");
        setField(term45978, term45978.getClass(), "status", "TZJzEpeSDz");
        setField(term45978, term45978.getClass(), "owner", "CEVnfPOBDk");
        setField(term45978, term45978.getClass(), "subsystem", "JUpDTRXGtv");
        setField(term45978, term45978.getClass(), "jobClass", "cKBnwzMCia");
        setField(term45978, term45978.getClass(), "type", "QWmZpWASOK");
        setField(term45978, term45978.getClass(), "jobId", "ZNLWGsxniS");
        setField(term45977, term45977.getClass(), "jobStatus", term45978);
        setField(term45977, term45977.getClass(), "jobFiles", term46075);
        setField(term45948, term45948.getClass(), "jobInfo", term45977);
        setField(term45948, term45948.getClass(), "output", "TAqcGSOgIz");
        setField(term45948, term45948.getClass(), "outputSub", term46112);
        setField(term45948, term45948.getClass(), "outputVariablesPrefix", "hqyMxHWbGv");
        setField(term45948, term45948.getClass(), "procName", "ucSkoerFDq");
        setField(term45948, term45948.getClass(), "regionSize", "UasONzOTXn");
        setField(term45948, term45948.getClass(), "returnCode", "gRkWWojcfo");
        setField(term45948, term45948.getClass(), "saveAsDataset", "FHujUNXIxu");
        setField(term45948, term45948.getClass(), "saveAsDatasetSub", term46174);
        setField(term45948, term45948.getClass(), "saveAsUnixFile", "OMWsPUFcoJ");
        setField(term45948, term45948.getClass(), "saveAsUnixFileSub", term46188);
        setField(term45948, term45948.getClass(), "scriptParameters", "oWooJBZOyh");
        setField(term45948, term45948.getClass(), "successPattern", "iNnWLGJCBN");
        setField(term45948, term45948.getClass(), "failedPattern", term46214);
        setField(term45948, term45948.getClass(), "timeout", "aBZsgezjug");
        setField(term45948, term45948.getClass(), "instructions", "hvlXhuKNfP");
        setField(term45948, term45948.getClass(), "instructionsSub", term46266);
        setField(term45948, term45948.getClass(), "variableReferences", term46268);
        setField(term45948, term45948.getClass(), "name", "xNKBQkfPIU");
        setField(term45948, term45948.getClass(), "title", "IaRILCkXUB");
        setField(term45948, term45948.getClass(), "description", "XRaUSsHhJf");
        setField(term45948, term45948.getClass(), "state", "ndknwPavsb");
        setField(term45948, term45948.getClass(), "stepNumber", "XbwSBHmjuZ");
        setField(term45948, term45948.getClass(), "optional", term46341);
        setField(term45948, term45948.getClass(), "autoEnable", term46343);
        setField(term45948, term45948.getClass(), "prereqStep", term46345);
        setField(term45948, term45948.getClass(), "userDefined", term46457);
        setField(term45948, term45948.getClass(), "runAsUser", "GcMaBtNShc");
        setField(term45948, term45948.getClass(), "runAsUserDynamic", term46471);
        setField(term45948, term45948.getClass(), "isRestStep", term46473);
        setField(term45948, term45948.getClass(), "owner", "kqGufqJbqf");
        setField(term45948, term45948.getClass(), "assignees", "wqMYxsvXwx");
        setField(term45948, term45948.getClass(), "skills", "qUfONYtlAU");
        setField(term45948, term45948.getClass(), "weight", "QMHmlsCFoq");
        setField(term45948, term45948.getClass(), "hasCalledWorkflow", term46523);
        setField(term45948, term45948.getClass(), "isConditionStep", term46525);
        setField(term45948, term45948.getClass(), "steps", term46527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaveAsUnixFileSub", argTypes, term45948, args);
    }

};


