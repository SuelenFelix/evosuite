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

public class WorkflowTemplateStepInfo_getOutput_5813626286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37037;

    public WorkflowTemplateStepInfo_getOutput_5813626286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term37050 = new Boolean(false);
        Integer term37064 = new Integer(-1410220680);
        Integer term37167 = new Integer(389427431);
        Integer term37169 = new Integer(-1945706126);
        Integer term37171 = new Integer(1152356969);
        Object term37166 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term37166, term37166.getClass(), "id", term37167);
        setField(term37166, term37166.getClass(), "ddname", null);
        setField(term37166, term37166.getClass(), "byteCount", term37169);
        setField(term37166, term37166.getClass(), "recordCount", term37171);
        setField(term37166, term37166.getClass(), "classs", null);
        setField(term37166, term37166.getClass(), "stepname", null);
        setField(term37166, term37166.getClass(), "procstep", null);
        ArrayList term37164 = new ArrayList();
        ((ArrayList) term37164).add(term37166);
        Boolean term37187 = new Boolean(true);
        Boolean term37249 = new Boolean(true);
        Boolean term37263 = new Boolean(true);
        ArrayList term37289 = new ArrayList();
        ((ArrayList) term37289).add("nnkddhphsi");
        ((ArrayList) term37289).add("VPJfuXpuzc");
        ((ArrayList) term37289).add("zdrDwRmBqL");
        ((ArrayList) term37289).add("DhSRNlYOFL");
        ((ArrayList) term37289).add("mrmNORhOYE");
        ((ArrayList) term37289).add("IAlXRzFnsw");
        ((ArrayList) term37289).add("QGWHwsqzqh");
        Boolean term37401 = new Boolean(false);
        Object term37405 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term37405, term37405.getClass(), "name", "");
        setField(term37405, term37405.getClass(), "scope", "");
        Object term37408 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term37408, term37408.getClass(), "name", "");
        setField(term37408, term37408.getClass(), "scope", "");
        Object term37411 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term37411, term37411.getClass(), "name", "");
        setField(term37411, term37411.getClass(), "scope", "");
        Object term37414 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term37414, term37414.getClass(), "name", "");
        setField(term37414, term37414.getClass(), "scope", "");
        ArrayList term37403 = new ArrayList();
        ((ArrayList) term37403).add(term37405);
        ((ArrayList) term37403).add(term37408);
        ((ArrayList) term37403).add(term37411);
        ((ArrayList) term37403).add(term37414);
        Boolean term37479 = new Boolean(true);
        Boolean term37481 = new Boolean(false);
        ArrayList term37483 = new ArrayList();
        ((ArrayList) term37483).add("NifhlBZIDF");
        Boolean term37499 = new Boolean(false);
        Boolean term37513 = new Boolean(false);
        Boolean term37515 = new Boolean(false);
        Boolean term37565 = new Boolean(false);
        Boolean term37567 = new Boolean(true);
        ArrayList term37569 = new ArrayList();
        ((ArrayList) term37569).add((Object)null);
        ((ArrayList) term37569).add((Object)null);
        ((ArrayList) term37569).add((Object)null);
        term37037 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term37066 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term37067 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term37037, term37037.getClass(), "template", "CXekzSdVWc");
        setField(term37037, term37037.getClass(), "templateSub", term37050);
        setField(term37037, term37037.getClass(), "submitAs", "heJZxFqAJC");
        setField(term37037, term37037.getClass(), "maxLrecl", term37064);
        setField(term37067, term37067.getClass(), "retcode", "DGNjGJtXwQ");
        setField(term37067, term37067.getClass(), "jobName", "BIFQrvbqSd");
        setField(term37067, term37067.getClass(), "status", "wcVhMnVVMH");
        setField(term37067, term37067.getClass(), "owner", "EUWyNZxbWR");
        setField(term37067, term37067.getClass(), "subsystem", "TaoriKlxVP");
        setField(term37067, term37067.getClass(), "jobClass", "CDKCMwdzTR");
        setField(term37067, term37067.getClass(), "type", "ehviwWrUip");
        setField(term37067, term37067.getClass(), "jobId", "LNsNBvvYgQ");
        setField(term37066, term37066.getClass(), "jobStatus", term37067);
        setField(term37066, term37066.getClass(), "jobFiles", term37164);
        setField(term37037, term37037.getClass(), "jobInfo", term37066);
        setField(term37037, term37037.getClass(), "output", "nComTwhtzu");
        setField(term37037, term37037.getClass(), "outputSub", term37187);
        setField(term37037, term37037.getClass(), "outputVariablesPrefix", "gXyUtfRzMt");
        setField(term37037, term37037.getClass(), "procName", "RUmloTNkOF");
        setField(term37037, term37037.getClass(), "regionSize", "xlEdrgoOEf");
        setField(term37037, term37037.getClass(), "returnCode", "DfKLAuTNTf");
        setField(term37037, term37037.getClass(), "saveAsDataset", "lWuRJaTZQB");
        setField(term37037, term37037.getClass(), "saveAsDatasetSub", term37249);
        setField(term37037, term37037.getClass(), "saveAsUnixFile", "jiQYzmbdOz");
        setField(term37037, term37037.getClass(), "saveAsUnixFileSub", term37263);
        setField(term37037, term37037.getClass(), "scriptParameters", "HBnovMFfRR");
        setField(term37037, term37037.getClass(), "successPattern", "kvBRGWtVMY");
        setField(term37037, term37037.getClass(), "failedPattern", term37289);
        setField(term37037, term37037.getClass(), "timeout", "HToXzWGnjh");
        setField(term37037, term37037.getClass(), "instructions", "ymGhnCkAFG");
        setField(term37037, term37037.getClass(), "instructionsSub", term37401);
        setField(term37037, term37037.getClass(), "variableReferences", term37403);
        setField(term37037, term37037.getClass(), "name", "vuGxdvURpp");
        setField(term37037, term37037.getClass(), "title", "zUgAERZZFZ");
        setField(term37037, term37037.getClass(), "description", "QhkdVFKaoy");
        setField(term37037, term37037.getClass(), "state", "WCQDPwVjsS");
        setField(term37037, term37037.getClass(), "stepNumber", "XkZOYFvTGI");
        setField(term37037, term37037.getClass(), "optional", term37479);
        setField(term37037, term37037.getClass(), "autoEnable", term37481);
        setField(term37037, term37037.getClass(), "prereqStep", term37483);
        setField(term37037, term37037.getClass(), "userDefined", term37499);
        setField(term37037, term37037.getClass(), "runAsUser", "vKEgtSbaYp");
        setField(term37037, term37037.getClass(), "runAsUserDynamic", term37513);
        setField(term37037, term37037.getClass(), "isRestStep", term37515);
        setField(term37037, term37037.getClass(), "owner", "FnjEwOlAkC");
        setField(term37037, term37037.getClass(), "assignees", "ZsGqLnRMml");
        setField(term37037, term37037.getClass(), "skills", "BTXsqJgjjs");
        setField(term37037, term37037.getClass(), "weight", "OjFRpvsLzi");
        setField(term37037, term37037.getClass(), "hasCalledWorkflow", term37565);
        setField(term37037, term37037.getClass(), "isConditionStep", term37567);
        setField(term37037, term37037.getClass(), "steps", term37569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutput", argTypes, term37037, args);
    }

};


