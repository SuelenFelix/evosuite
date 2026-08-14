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

public class WorkflowTemplateStepInfo_getInstructions_103221673620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51118;

    public WorkflowTemplateStepInfo_getInstructions_103221673620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term51131 = new Boolean(true);
        Integer term51145 = new Integer(-1332748804);
        ArrayList term51245 = new ArrayList();
        Boolean term51261 = new Boolean(true);
        Boolean term51323 = new Boolean(false);
        Boolean term51337 = new Boolean(false);
        ArrayList term51363 = new ArrayList();
        ((ArrayList) term51363).add("YAFTYAtere");
        ((ArrayList) term51363).add("EYQnrjiZfX");
        ((ArrayList) term51363).add("xydFPTvtMs");
        Boolean term51427 = new Boolean(true);
        Object term51431 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term51431, term51431.getClass(), "name", "");
        setField(term51431, term51431.getClass(), "scope", "");
        Object term51434 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term51434, term51434.getClass(), "name", "");
        setField(term51434, term51434.getClass(), "scope", "");
        Object term51437 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term51437, term51437.getClass(), "name", "");
        setField(term51437, term51437.getClass(), "scope", "");
        Object term51440 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term51440, term51440.getClass(), "name", "");
        setField(term51440, term51440.getClass(), "scope", "");
        Object term51443 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term51443, term51443.getClass(), "name", "");
        setField(term51443, term51443.getClass(), "scope", "");
        Object term51446 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term51446, term51446.getClass(), "name", "");
        setField(term51446, term51446.getClass(), "scope", "");
        Object term51449 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term51449, term51449.getClass(), "name", "");
        setField(term51449, term51449.getClass(), "scope", "");
        ArrayList term51429 = new ArrayList();
        ((ArrayList) term51429).add(term51431);
        ((ArrayList) term51429).add(term51434);
        ((ArrayList) term51429).add(term51437);
        ((ArrayList) term51429).add(term51440);
        ((ArrayList) term51429).add(term51443);
        ((ArrayList) term51429).add(term51446);
        ((ArrayList) term51429).add(term51449);
        Boolean term51514 = new Boolean(true);
        Boolean term51516 = new Boolean(true);
        ArrayList term51518 = new ArrayList();
        Boolean term51522 = new Boolean(true);
        Boolean term51536 = new Boolean(true);
        Boolean term51538 = new Boolean(true);
        Boolean term51588 = new Boolean(true);
        Boolean term51590 = new Boolean(false);
        ArrayList term51592 = new ArrayList();
        ((ArrayList) term51592).add((Object)null);
        ((ArrayList) term51592).add((Object)null);
        ((ArrayList) term51592).add((Object)null);
        ((ArrayList) term51592).add((Object)null);
        ((ArrayList) term51592).add((Object)null);
        ((ArrayList) term51592).add((Object)null);
        ((ArrayList) term51592).add((Object)null);
        ((ArrayList) term51592).add((Object)null);
        term51118 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term51147 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term51148 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term51118, term51118.getClass(), "template", "rgZeldfAMO");
        setField(term51118, term51118.getClass(), "templateSub", term51131);
        setField(term51118, term51118.getClass(), "submitAs", "btsBDylBZe");
        setField(term51118, term51118.getClass(), "maxLrecl", term51145);
        setField(term51148, term51148.getClass(), "retcode", "eAWJddaxnT");
        setField(term51148, term51148.getClass(), "jobName", "PyaMftIAzC");
        setField(term51148, term51148.getClass(), "status", "QiSmNdQUzl");
        setField(term51148, term51148.getClass(), "owner", "FsjVOWFhLi");
        setField(term51148, term51148.getClass(), "subsystem", "RReQXZQnIR");
        setField(term51148, term51148.getClass(), "jobClass", "VnHgyPgIAn");
        setField(term51148, term51148.getClass(), "type", "EIkLuLTIDO");
        setField(term51148, term51148.getClass(), "jobId", "rQFJbYZksA");
        setField(term51147, term51147.getClass(), "jobStatus", term51148);
        setField(term51147, term51147.getClass(), "jobFiles", term51245);
        setField(term51118, term51118.getClass(), "jobInfo", term51147);
        setField(term51118, term51118.getClass(), "output", "jndrnlnwbO");
        setField(term51118, term51118.getClass(), "outputSub", term51261);
        setField(term51118, term51118.getClass(), "outputVariablesPrefix", "qdFzHeHbQc");
        setField(term51118, term51118.getClass(), "procName", "EcxYliBmNQ");
        setField(term51118, term51118.getClass(), "regionSize", "MGbwgunHMQ");
        setField(term51118, term51118.getClass(), "returnCode", "wCgQVdppSI");
        setField(term51118, term51118.getClass(), "saveAsDataset", "oQWxaFnrYq");
        setField(term51118, term51118.getClass(), "saveAsDatasetSub", term51323);
        setField(term51118, term51118.getClass(), "saveAsUnixFile", "uZcUOSgoMp");
        setField(term51118, term51118.getClass(), "saveAsUnixFileSub", term51337);
        setField(term51118, term51118.getClass(), "scriptParameters", "eMxNpewLIS");
        setField(term51118, term51118.getClass(), "successPattern", "GxNdoXawUZ");
        setField(term51118, term51118.getClass(), "failedPattern", term51363);
        setField(term51118, term51118.getClass(), "timeout", "lopARHjeMT");
        setField(term51118, term51118.getClass(), "instructions", "wizysRLgRr");
        setField(term51118, term51118.getClass(), "instructionsSub", term51427);
        setField(term51118, term51118.getClass(), "variableReferences", term51429);
        setField(term51118, term51118.getClass(), "name", "BSdXqptUKz");
        setField(term51118, term51118.getClass(), "title", "UtzMtwAaid");
        setField(term51118, term51118.getClass(), "description", "bchxgKxuUf");
        setField(term51118, term51118.getClass(), "state", "mjXKuwKUyR");
        setField(term51118, term51118.getClass(), "stepNumber", "UfdjcAQclb");
        setField(term51118, term51118.getClass(), "optional", term51514);
        setField(term51118, term51118.getClass(), "autoEnable", term51516);
        setField(term51118, term51118.getClass(), "prereqStep", term51518);
        setField(term51118, term51118.getClass(), "userDefined", term51522);
        setField(term51118, term51118.getClass(), "runAsUser", "skKLlFIRTI");
        setField(term51118, term51118.getClass(), "runAsUserDynamic", term51536);
        setField(term51118, term51118.getClass(), "isRestStep", term51538);
        setField(term51118, term51118.getClass(), "owner", "SfjOvqPCwx");
        setField(term51118, term51118.getClass(), "assignees", "rinBVtrpcr");
        setField(term51118, term51118.getClass(), "skills", "KjCvQWfqew");
        setField(term51118, term51118.getClass(), "weight", "WewLrXvLmC");
        setField(term51118, term51118.getClass(), "hasCalledWorkflow", term51588);
        setField(term51118, term51118.getClass(), "isConditionStep", term51590);
        setField(term51118, term51118.getClass(), "steps", term51592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstructions", argTypes, term51118, args);
    }

};


