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

public class WorkflowTemplateStepInfo_getSaveAsDataset_46471487212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43261;

    public WorkflowTemplateStepInfo_getSaveAsDataset_46471487212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term43274 = new Boolean(false);
        Integer term43288 = new Integer(199287428);
        ArrayList term43388 = new ArrayList();
        Boolean term43404 = new Boolean(true);
        Boolean term43466 = new Boolean(true);
        Boolean term43480 = new Boolean(false);
        ArrayList term43506 = new ArrayList();
        ((ArrayList) term43506).add("OYnrHBNcZV");
        ((ArrayList) term43506).add("pwkepWBxgL");
        ((ArrayList) term43506).add("RDXQLsyKOu");
        Boolean term43570 = new Boolean(true);
        Object term43574 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term43574, term43574.getClass(), "name", "");
        setField(term43574, term43574.getClass(), "scope", "");
        Object term43577 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term43577, term43577.getClass(), "name", "");
        setField(term43577, term43577.getClass(), "scope", "");
        Object term43580 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term43580, term43580.getClass(), "name", "");
        setField(term43580, term43580.getClass(), "scope", "");
        Object term43583 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term43583, term43583.getClass(), "name", "");
        setField(term43583, term43583.getClass(), "scope", "");
        Object term43586 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term43586, term43586.getClass(), "name", "");
        setField(term43586, term43586.getClass(), "scope", "");
        ArrayList term43572 = new ArrayList();
        ((ArrayList) term43572).add(term43574);
        ((ArrayList) term43572).add(term43577);
        ((ArrayList) term43572).add(term43580);
        ((ArrayList) term43572).add(term43583);
        ((ArrayList) term43572).add(term43586);
        Boolean term43651 = new Boolean(false);
        Boolean term43653 = new Boolean(true);
        ArrayList term43655 = new ArrayList();
        ((ArrayList) term43655).add("ROkWEBVPGe");
        ((ArrayList) term43655).add("BHWsGhxwwy");
        ((ArrayList) term43655).add("AOwXDxldzy");
        ((ArrayList) term43655).add("oPjvcZQHAL");
        Boolean term43707 = new Boolean(true);
        Boolean term43721 = new Boolean(false);
        Boolean term43723 = new Boolean(true);
        Boolean term43773 = new Boolean(false);
        Boolean term43775 = new Boolean(false);
        ArrayList term43777 = new ArrayList();
        ((ArrayList) term43777).add((Object)null);
        ((ArrayList) term43777).add((Object)null);
        ((ArrayList) term43777).add((Object)null);
        ((ArrayList) term43777).add((Object)null);
        ((ArrayList) term43777).add((Object)null);
        ((ArrayList) term43777).add((Object)null);
        term43261 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term43290 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term43291 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term43261, term43261.getClass(), "template", "XNHngduAPd");
        setField(term43261, term43261.getClass(), "templateSub", term43274);
        setField(term43261, term43261.getClass(), "submitAs", "ewowfKAPBz");
        setField(term43261, term43261.getClass(), "maxLrecl", term43288);
        setField(term43291, term43291.getClass(), "retcode", "yOYHYOdvNm");
        setField(term43291, term43291.getClass(), "jobName", "RsOIgNcrMD");
        setField(term43291, term43291.getClass(), "status", "JDwFepEsNs");
        setField(term43291, term43291.getClass(), "owner", "YFjmdvvUEp");
        setField(term43291, term43291.getClass(), "subsystem", "jCSXDmxVEW");
        setField(term43291, term43291.getClass(), "jobClass", "ucSaPNSgwx");
        setField(term43291, term43291.getClass(), "type", "rsRvTIjmLJ");
        setField(term43291, term43291.getClass(), "jobId", "VOBEeWmzSF");
        setField(term43290, term43290.getClass(), "jobStatus", term43291);
        setField(term43290, term43290.getClass(), "jobFiles", term43388);
        setField(term43261, term43261.getClass(), "jobInfo", term43290);
        setField(term43261, term43261.getClass(), "output", "cVeaNxcyvs");
        setField(term43261, term43261.getClass(), "outputSub", term43404);
        setField(term43261, term43261.getClass(), "outputVariablesPrefix", "fIMpTnCtOM");
        setField(term43261, term43261.getClass(), "procName", "zsVQmqfyvx");
        setField(term43261, term43261.getClass(), "regionSize", "DKFEMZUVhd");
        setField(term43261, term43261.getClass(), "returnCode", "xhjqWwsjmc");
        setField(term43261, term43261.getClass(), "saveAsDataset", "GmFORCKDuz");
        setField(term43261, term43261.getClass(), "saveAsDatasetSub", term43466);
        setField(term43261, term43261.getClass(), "saveAsUnixFile", "uiZFXEVOdS");
        setField(term43261, term43261.getClass(), "saveAsUnixFileSub", term43480);
        setField(term43261, term43261.getClass(), "scriptParameters", "kLUzmGfJsV");
        setField(term43261, term43261.getClass(), "successPattern", "NtSnrngAmM");
        setField(term43261, term43261.getClass(), "failedPattern", term43506);
        setField(term43261, term43261.getClass(), "timeout", "ZnIRhQxVXw");
        setField(term43261, term43261.getClass(), "instructions", "AVAyxUcLrK");
        setField(term43261, term43261.getClass(), "instructionsSub", term43570);
        setField(term43261, term43261.getClass(), "variableReferences", term43572);
        setField(term43261, term43261.getClass(), "name", "RlMsoYxesz");
        setField(term43261, term43261.getClass(), "title", "FkuWKCInZG");
        setField(term43261, term43261.getClass(), "description", "WoRWEXpkMK");
        setField(term43261, term43261.getClass(), "state", "EkKMYiEKHU");
        setField(term43261, term43261.getClass(), "stepNumber", "gvLQDVFTIF");
        setField(term43261, term43261.getClass(), "optional", term43651);
        setField(term43261, term43261.getClass(), "autoEnable", term43653);
        setField(term43261, term43261.getClass(), "prereqStep", term43655);
        setField(term43261, term43261.getClass(), "userDefined", term43707);
        setField(term43261, term43261.getClass(), "runAsUser", "uCNCXXRNau");
        setField(term43261, term43261.getClass(), "runAsUserDynamic", term43721);
        setField(term43261, term43261.getClass(), "isRestStep", term43723);
        setField(term43261, term43261.getClass(), "owner", "eRcAzhxOsA");
        setField(term43261, term43261.getClass(), "assignees", "uyydsCcltT");
        setField(term43261, term43261.getClass(), "skills", "gRGZBrxxxv");
        setField(term43261, term43261.getClass(), "weight", "YvYPXzCrcU");
        setField(term43261, term43261.getClass(), "hasCalledWorkflow", term43773);
        setField(term43261, term43261.getClass(), "isConditionStep", term43775);
        setField(term43261, term43261.getClass(), "steps", term43777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaveAsDataset", argTypes, term43261, args);
    }

};


