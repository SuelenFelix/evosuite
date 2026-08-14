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

public class WorkflowTemplateStepInfo_getTemplateSub_1609951002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32546;

    public WorkflowTemplateStepInfo_getTemplateSub_1609951002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term32559 = new Boolean(false);
        Integer term32573 = new Integer(1861318859);
        Integer term32676 = new Integer(1474524152);
        Integer term32678 = new Integer(568954359);
        Integer term32680 = new Integer(53410913);
        Object term32675 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term32675, term32675.getClass(), "id", term32676);
        setField(term32675, term32675.getClass(), "ddname", null);
        setField(term32675, term32675.getClass(), "byteCount", term32678);
        setField(term32675, term32675.getClass(), "recordCount", term32680);
        setField(term32675, term32675.getClass(), "classs", null);
        setField(term32675, term32675.getClass(), "stepname", null);
        setField(term32675, term32675.getClass(), "procstep", null);
        Integer term32683 = new Integer(-375014958);
        Integer term32685 = new Integer(1107176718);
        Integer term32687 = new Integer(480137250);
        Object term32682 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term32682, term32682.getClass(), "id", term32683);
        setField(term32682, term32682.getClass(), "ddname", null);
        setField(term32682, term32682.getClass(), "byteCount", term32685);
        setField(term32682, term32682.getClass(), "recordCount", term32687);
        setField(term32682, term32682.getClass(), "classs", null);
        setField(term32682, term32682.getClass(), "stepname", null);
        setField(term32682, term32682.getClass(), "procstep", null);
        Integer term32690 = new Integer(-341152642);
        Integer term32692 = new Integer(-2015854073);
        Integer term32694 = new Integer(538259104);
        Object term32689 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term32689, term32689.getClass(), "id", term32690);
        setField(term32689, term32689.getClass(), "ddname", null);
        setField(term32689, term32689.getClass(), "byteCount", term32692);
        setField(term32689, term32689.getClass(), "recordCount", term32694);
        setField(term32689, term32689.getClass(), "classs", null);
        setField(term32689, term32689.getClass(), "stepname", null);
        setField(term32689, term32689.getClass(), "procstep", null);
        ArrayList term32673 = new ArrayList();
        ((ArrayList) term32673).add(term32675);
        ((ArrayList) term32673).add(term32682);
        ((ArrayList) term32673).add(term32689);
        Boolean term32710 = new Boolean(false);
        Boolean term32772 = new Boolean(false);
        Boolean term32786 = new Boolean(false);
        ArrayList term32812 = new ArrayList();
        ((ArrayList) term32812).add("zoVKwYYMOI");
        ((ArrayList) term32812).add("DGCeQsmIOU");
        ((ArrayList) term32812).add("otcpSHwkzG");
        ((ArrayList) term32812).add("BixZhUjVme");
        ((ArrayList) term32812).add("BmnUezUoWz");
        ((ArrayList) term32812).add("QqeCgeRpIS");
        Boolean term32912 = new Boolean(false);
        Object term32916 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term32916, term32916.getClass(), "name", "");
        setField(term32916, term32916.getClass(), "scope", "");
        Object term32919 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term32919, term32919.getClass(), "name", "");
        setField(term32919, term32919.getClass(), "scope", "");
        ArrayList term32914 = new ArrayList();
        ((ArrayList) term32914).add(term32916);
        ((ArrayList) term32914).add(term32919);
        Boolean term32984 = new Boolean(false);
        Boolean term32986 = new Boolean(false);
        ArrayList term32988 = new ArrayList();
        ((ArrayList) term32988).add("QZCuYHcIBC");
        ((ArrayList) term32988).add("hpvoFaAyIu");
        ((ArrayList) term32988).add("dyqukIBJxC");
        ((ArrayList) term32988).add("MVMiGQdgnX");
        ((ArrayList) term32988).add("cQnJIENJHe");
        ((ArrayList) term32988).add("ExjdCvAxlG");
        ((ArrayList) term32988).add("moMySSiBuB");
        ((ArrayList) term32988).add("iuuazALDWB");
        ((ArrayList) term32988).add("GqehccUels");
        Boolean term33100 = new Boolean(true);
        Boolean term33114 = new Boolean(true);
        Boolean term33116 = new Boolean(false);
        Boolean term33166 = new Boolean(true);
        Boolean term33168 = new Boolean(true);
        ArrayList term33170 = new ArrayList();
        ((ArrayList) term33170).add((Object)null);
        ((ArrayList) term33170).add((Object)null);
        ((ArrayList) term33170).add((Object)null);
        ((ArrayList) term33170).add((Object)null);
        ((ArrayList) term33170).add((Object)null);
        term32546 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term32575 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term32576 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term32546, term32546.getClass(), "template", "qTiIgMQXbW");
        setField(term32546, term32546.getClass(), "templateSub", term32559);
        setField(term32546, term32546.getClass(), "submitAs", "rARmHDyRHE");
        setField(term32546, term32546.getClass(), "maxLrecl", term32573);
        setField(term32576, term32576.getClass(), "retcode", "bvybTJUNMY");
        setField(term32576, term32576.getClass(), "jobName", "MoGyMoOkMi");
        setField(term32576, term32576.getClass(), "status", "qDEvNqJeGg");
        setField(term32576, term32576.getClass(), "owner", "fUxWNxirZc");
        setField(term32576, term32576.getClass(), "subsystem", "vHkrNjGRyv");
        setField(term32576, term32576.getClass(), "jobClass", "PxGAOnzJzj");
        setField(term32576, term32576.getClass(), "type", "fQVSHtJlDS");
        setField(term32576, term32576.getClass(), "jobId", "CGdXCWNTxp");
        setField(term32575, term32575.getClass(), "jobStatus", term32576);
        setField(term32575, term32575.getClass(), "jobFiles", term32673);
        setField(term32546, term32546.getClass(), "jobInfo", term32575);
        setField(term32546, term32546.getClass(), "output", "SfWiFjkLGW");
        setField(term32546, term32546.getClass(), "outputSub", term32710);
        setField(term32546, term32546.getClass(), "outputVariablesPrefix", "urBahuOkUQ");
        setField(term32546, term32546.getClass(), "procName", "zHcZrTMdOT");
        setField(term32546, term32546.getClass(), "regionSize", "zIAIXHeKXt");
        setField(term32546, term32546.getClass(), "returnCode", "fVkSkOqFEO");
        setField(term32546, term32546.getClass(), "saveAsDataset", "DLfgyAqDDu");
        setField(term32546, term32546.getClass(), "saveAsDatasetSub", term32772);
        setField(term32546, term32546.getClass(), "saveAsUnixFile", "ryuQaXtwNj");
        setField(term32546, term32546.getClass(), "saveAsUnixFileSub", term32786);
        setField(term32546, term32546.getClass(), "scriptParameters", "OutjKNDSgR");
        setField(term32546, term32546.getClass(), "successPattern", "brfLLGXcwA");
        setField(term32546, term32546.getClass(), "failedPattern", term32812);
        setField(term32546, term32546.getClass(), "timeout", "xVwossmLda");
        setField(term32546, term32546.getClass(), "instructions", "EvSQeALexj");
        setField(term32546, term32546.getClass(), "instructionsSub", term32912);
        setField(term32546, term32546.getClass(), "variableReferences", term32914);
        setField(term32546, term32546.getClass(), "name", "RMTgBohsAX");
        setField(term32546, term32546.getClass(), "title", "kdYeXJnJGG");
        setField(term32546, term32546.getClass(), "description", "XEdoshuvxD");
        setField(term32546, term32546.getClass(), "state", "ljtopXMcRl");
        setField(term32546, term32546.getClass(), "stepNumber", "HHtcAGkfuz");
        setField(term32546, term32546.getClass(), "optional", term32984);
        setField(term32546, term32546.getClass(), "autoEnable", term32986);
        setField(term32546, term32546.getClass(), "prereqStep", term32988);
        setField(term32546, term32546.getClass(), "userDefined", term33100);
        setField(term32546, term32546.getClass(), "runAsUser", "llbDGujrPe");
        setField(term32546, term32546.getClass(), "runAsUserDynamic", term33114);
        setField(term32546, term32546.getClass(), "isRestStep", term33116);
        setField(term32546, term32546.getClass(), "owner", "QEoeITwBfz");
        setField(term32546, term32546.getClass(), "assignees", "rWOKjAUIvS");
        setField(term32546, term32546.getClass(), "skills", "IcpfsIGlDf");
        setField(term32546, term32546.getClass(), "weight", "xCfGcRdHTK");
        setField(term32546, term32546.getClass(), "hasCalledWorkflow", term33166);
        setField(term32546, term32546.getClass(), "isConditionStep", term33168);
        setField(term32546, term32546.getClass(), "steps", term33170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateSub", argTypes, term32546, args);
    }

};


