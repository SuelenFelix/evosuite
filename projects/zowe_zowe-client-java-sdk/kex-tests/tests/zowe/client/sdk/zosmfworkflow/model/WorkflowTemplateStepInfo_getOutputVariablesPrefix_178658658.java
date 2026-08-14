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

public class WorkflowTemplateStepInfo_getOutputVariablesPrefix_178658658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39129;

    public WorkflowTemplateStepInfo_getOutputVariablesPrefix_178658658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term39142 = new Boolean(false);
        Integer term39156 = new Integer(-165587447);
        Integer term39259 = new Integer(-1347358701);
        Integer term39261 = new Integer(806595993);
        Integer term39263 = new Integer(548228925);
        Object term39258 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term39258, term39258.getClass(), "id", term39259);
        setField(term39258, term39258.getClass(), "ddname", null);
        setField(term39258, term39258.getClass(), "byteCount", term39261);
        setField(term39258, term39258.getClass(), "recordCount", term39263);
        setField(term39258, term39258.getClass(), "classs", null);
        setField(term39258, term39258.getClass(), "stepname", null);
        setField(term39258, term39258.getClass(), "procstep", null);
        Integer term39266 = new Integer(-749861210);
        Integer term39268 = new Integer(1694224101);
        Integer term39270 = new Integer(937859191);
        Object term39265 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term39265, term39265.getClass(), "id", term39266);
        setField(term39265, term39265.getClass(), "ddname", null);
        setField(term39265, term39265.getClass(), "byteCount", term39268);
        setField(term39265, term39265.getClass(), "recordCount", term39270);
        setField(term39265, term39265.getClass(), "classs", null);
        setField(term39265, term39265.getClass(), "stepname", null);
        setField(term39265, term39265.getClass(), "procstep", null);
        ArrayList term39256 = new ArrayList();
        ((ArrayList) term39256).add(term39258);
        ((ArrayList) term39256).add(term39265);
        Boolean term39286 = new Boolean(false);
        Boolean term39348 = new Boolean(false);
        Boolean term39362 = new Boolean(false);
        ArrayList term39388 = new ArrayList();
        ((ArrayList) term39388).add("ufopOhWQkB");
        ((ArrayList) term39388).add("RqVPcaMpxk");
        ((ArrayList) term39388).add("zOsnJKDwhL");
        ((ArrayList) term39388).add("VCOuRNQveV");
        ((ArrayList) term39388).add("wOBUMePcSQ");
        ((ArrayList) term39388).add("SkfJvbcpSy");
        ((ArrayList) term39388).add("NQVfrHmuUQ");
        Boolean term39500 = new Boolean(true);
        ArrayList term39502 = new ArrayList();
        Boolean term39566 = new Boolean(true);
        Boolean term39568 = new Boolean(true);
        ArrayList term39570 = new ArrayList();
        ((ArrayList) term39570).add("BIcjuljzhc");
        ((ArrayList) term39570).add("SQDHGXSyaX");
        ((ArrayList) term39570).add("apdJoJDItV");
        ((ArrayList) term39570).add("UidjRWfqYK");
        ((ArrayList) term39570).add("SrmUNtssfz");
        Boolean term39634 = new Boolean(true);
        Boolean term39648 = new Boolean(false);
        Boolean term39650 = new Boolean(false);
        Boolean term39700 = new Boolean(false);
        Boolean term39702 = new Boolean(true);
        ArrayList term39704 = new ArrayList();
        ((ArrayList) term39704).add((Object)null);
        ((ArrayList) term39704).add((Object)null);
        ((ArrayList) term39704).add((Object)null);
        ((ArrayList) term39704).add((Object)null);
        ((ArrayList) term39704).add((Object)null);
        ((ArrayList) term39704).add((Object)null);
        ((ArrayList) term39704).add((Object)null);
        ((ArrayList) term39704).add((Object)null);
        term39129 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term39158 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term39159 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term39129, term39129.getClass(), "template", "cXTrsrxYFN");
        setField(term39129, term39129.getClass(), "templateSub", term39142);
        setField(term39129, term39129.getClass(), "submitAs", "pEUndHGBiE");
        setField(term39129, term39129.getClass(), "maxLrecl", term39156);
        setField(term39159, term39159.getClass(), "retcode", "PCzKLiLqoO");
        setField(term39159, term39159.getClass(), "jobName", "JuYhKUgElF");
        setField(term39159, term39159.getClass(), "status", "NInWPlYtwe");
        setField(term39159, term39159.getClass(), "owner", "qVYRtrgZJt");
        setField(term39159, term39159.getClass(), "subsystem", "PCttFvFDzJ");
        setField(term39159, term39159.getClass(), "jobClass", "fwAMmjMsDq");
        setField(term39159, term39159.getClass(), "type", "aqdKzesECj");
        setField(term39159, term39159.getClass(), "jobId", "voSygcVEYO");
        setField(term39158, term39158.getClass(), "jobStatus", term39159);
        setField(term39158, term39158.getClass(), "jobFiles", term39256);
        setField(term39129, term39129.getClass(), "jobInfo", term39158);
        setField(term39129, term39129.getClass(), "output", "AXVMtieJQT");
        setField(term39129, term39129.getClass(), "outputSub", term39286);
        setField(term39129, term39129.getClass(), "outputVariablesPrefix", "BKaXfQaGqm");
        setField(term39129, term39129.getClass(), "procName", "OpadJlQqJc");
        setField(term39129, term39129.getClass(), "regionSize", "ZXdFbwHLvQ");
        setField(term39129, term39129.getClass(), "returnCode", "VEastYHDbF");
        setField(term39129, term39129.getClass(), "saveAsDataset", "CVrxrIRbBP");
        setField(term39129, term39129.getClass(), "saveAsDatasetSub", term39348);
        setField(term39129, term39129.getClass(), "saveAsUnixFile", "qMveUiByVL");
        setField(term39129, term39129.getClass(), "saveAsUnixFileSub", term39362);
        setField(term39129, term39129.getClass(), "scriptParameters", "VfhPQKCIrE");
        setField(term39129, term39129.getClass(), "successPattern", "RUgpUeqcGS");
        setField(term39129, term39129.getClass(), "failedPattern", term39388);
        setField(term39129, term39129.getClass(), "timeout", "BxUEPMTBxW");
        setField(term39129, term39129.getClass(), "instructions", "OkwcYhqTPO");
        setField(term39129, term39129.getClass(), "instructionsSub", term39500);
        setField(term39129, term39129.getClass(), "variableReferences", term39502);
        setField(term39129, term39129.getClass(), "name", "XeHaPiTvPt");
        setField(term39129, term39129.getClass(), "title", "GsyGZIlHgo");
        setField(term39129, term39129.getClass(), "description", "DPTUtDUuOf");
        setField(term39129, term39129.getClass(), "state", "TwTeGrJqeV");
        setField(term39129, term39129.getClass(), "stepNumber", "EmqjtKbtwp");
        setField(term39129, term39129.getClass(), "optional", term39566);
        setField(term39129, term39129.getClass(), "autoEnable", term39568);
        setField(term39129, term39129.getClass(), "prereqStep", term39570);
        setField(term39129, term39129.getClass(), "userDefined", term39634);
        setField(term39129, term39129.getClass(), "runAsUser", "ARMUeNVaDF");
        setField(term39129, term39129.getClass(), "runAsUserDynamic", term39648);
        setField(term39129, term39129.getClass(), "isRestStep", term39650);
        setField(term39129, term39129.getClass(), "owner", "EUduJelZVE");
        setField(term39129, term39129.getClass(), "assignees", "uwfvHKGrlb");
        setField(term39129, term39129.getClass(), "skills", "pSLljKyfgK");
        setField(term39129, term39129.getClass(), "weight", "JTQXicvesT");
        setField(term39129, term39129.getClass(), "hasCalledWorkflow", term39700);
        setField(term39129, term39129.getClass(), "isConditionStep", term39702);
        setField(term39129, term39129.getClass(), "steps", term39704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputVariablesPrefix", argTypes, term39129, args);
    }

};


