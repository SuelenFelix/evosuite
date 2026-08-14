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

public class WorkflowTemplateStepInfo_getSuccessPattern_51943124017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48102;

    public WorkflowTemplateStepInfo_getSuccessPattern_51943124017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term48115 = new Boolean(false);
        Integer term48129 = new Integer(-1694747156);
        Integer term48232 = new Integer(1466373988);
        Integer term48234 = new Integer(-358526505);
        Integer term48236 = new Integer(1843268026);
        Object term48231 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term48231, term48231.getClass(), "id", term48232);
        setField(term48231, term48231.getClass(), "ddname", null);
        setField(term48231, term48231.getClass(), "byteCount", term48234);
        setField(term48231, term48231.getClass(), "recordCount", term48236);
        setField(term48231, term48231.getClass(), "classs", null);
        setField(term48231, term48231.getClass(), "stepname", null);
        setField(term48231, term48231.getClass(), "procstep", null);
        Integer term48239 = new Integer(954660603);
        Integer term48241 = new Integer(-1351605385);
        Integer term48243 = new Integer(278355793);
        Object term48238 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term48238, term48238.getClass(), "id", term48239);
        setField(term48238, term48238.getClass(), "ddname", null);
        setField(term48238, term48238.getClass(), "byteCount", term48241);
        setField(term48238, term48238.getClass(), "recordCount", term48243);
        setField(term48238, term48238.getClass(), "classs", null);
        setField(term48238, term48238.getClass(), "stepname", null);
        setField(term48238, term48238.getClass(), "procstep", null);
        ArrayList term48229 = new ArrayList();
        ((ArrayList) term48229).add(term48231);
        ((ArrayList) term48229).add(term48238);
        Boolean term48259 = new Boolean(false);
        Boolean term48321 = new Boolean(true);
        Boolean term48335 = new Boolean(true);
        ArrayList term48361 = new ArrayList();
        ((ArrayList) term48361).add("FTbhYKJKQL");
        ((ArrayList) term48361).add("CssqWIyxap");
        ((ArrayList) term48361).add("EtmaqZMoVN");
        ((ArrayList) term48361).add("mluXYJByNP");
        ((ArrayList) term48361).add("kLMqANSDgO");
        ((ArrayList) term48361).add("nStYnHGCom");
        Boolean term48461 = new Boolean(true);
        Object term48465 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term48465, term48465.getClass(), "name", "");
        setField(term48465, term48465.getClass(), "scope", "");
        Object term48468 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term48468, term48468.getClass(), "name", "");
        setField(term48468, term48468.getClass(), "scope", "");
        Object term48471 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term48471, term48471.getClass(), "name", "");
        setField(term48471, term48471.getClass(), "scope", "");
        Object term48474 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableReference"));
        setField(term48474, term48474.getClass(), "name", "");
        setField(term48474, term48474.getClass(), "scope", "");
        ArrayList term48463 = new ArrayList();
        ((ArrayList) term48463).add(term48465);
        ((ArrayList) term48463).add(term48468);
        ((ArrayList) term48463).add(term48471);
        ((ArrayList) term48463).add(term48474);
        Boolean term48539 = new Boolean(false);
        Boolean term48541 = new Boolean(true);
        ArrayList term48543 = new ArrayList();
        ((ArrayList) term48543).add("lujQENuAbC");
        ((ArrayList) term48543).add("qkbmnArlda");
        Boolean term48571 = new Boolean(true);
        Boolean term48585 = new Boolean(true);
        Boolean term48587 = new Boolean(false);
        Boolean term48637 = new Boolean(false);
        Boolean term48639 = new Boolean(true);
        ArrayList term48641 = new ArrayList();
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        ((ArrayList) term48641).add((Object)null);
        term48102 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term48131 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term48132 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term48102, term48102.getClass(), "template", "ZPnUGVLyiF");
        setField(term48102, term48102.getClass(), "templateSub", term48115);
        setField(term48102, term48102.getClass(), "submitAs", "iGWKoojIzf");
        setField(term48102, term48102.getClass(), "maxLrecl", term48129);
        setField(term48132, term48132.getClass(), "retcode", "hBwCfmunWp");
        setField(term48132, term48132.getClass(), "jobName", "dEmUNxEaGp");
        setField(term48132, term48132.getClass(), "status", "FiihXkdDjE");
        setField(term48132, term48132.getClass(), "owner", "ttkSFEAzwY");
        setField(term48132, term48132.getClass(), "subsystem", "ZTUqSMjJHU");
        setField(term48132, term48132.getClass(), "jobClass", "TAvUGVCPaa");
        setField(term48132, term48132.getClass(), "type", "oacMptGUKE");
        setField(term48132, term48132.getClass(), "jobId", "vjVwvYdNhl");
        setField(term48131, term48131.getClass(), "jobStatus", term48132);
        setField(term48131, term48131.getClass(), "jobFiles", term48229);
        setField(term48102, term48102.getClass(), "jobInfo", term48131);
        setField(term48102, term48102.getClass(), "output", "paZAviFqsm");
        setField(term48102, term48102.getClass(), "outputSub", term48259);
        setField(term48102, term48102.getClass(), "outputVariablesPrefix", "GohPpeqrRh");
        setField(term48102, term48102.getClass(), "procName", "pfGxZUUbIW");
        setField(term48102, term48102.getClass(), "regionSize", "GhZQSLeLeq");
        setField(term48102, term48102.getClass(), "returnCode", "vCJwFnMbeg");
        setField(term48102, term48102.getClass(), "saveAsDataset", "HiMyMWtfDT");
        setField(term48102, term48102.getClass(), "saveAsDatasetSub", term48321);
        setField(term48102, term48102.getClass(), "saveAsUnixFile", "bTxfZATYLW");
        setField(term48102, term48102.getClass(), "saveAsUnixFileSub", term48335);
        setField(term48102, term48102.getClass(), "scriptParameters", "lFWdVTokyG");
        setField(term48102, term48102.getClass(), "successPattern", "PwXoorKXoP");
        setField(term48102, term48102.getClass(), "failedPattern", term48361);
        setField(term48102, term48102.getClass(), "timeout", "gfqZitqjcH");
        setField(term48102, term48102.getClass(), "instructions", "QfJOLCTCHY");
        setField(term48102, term48102.getClass(), "instructionsSub", term48461);
        setField(term48102, term48102.getClass(), "variableReferences", term48463);
        setField(term48102, term48102.getClass(), "name", "eugajHLhOv");
        setField(term48102, term48102.getClass(), "title", "sCSkTLnMUp");
        setField(term48102, term48102.getClass(), "description", "MGfUFAWSlA");
        setField(term48102, term48102.getClass(), "state", "eCRXbBPOdv");
        setField(term48102, term48102.getClass(), "stepNumber", "eNcuSzCfin");
        setField(term48102, term48102.getClass(), "optional", term48539);
        setField(term48102, term48102.getClass(), "autoEnable", term48541);
        setField(term48102, term48102.getClass(), "prereqStep", term48543);
        setField(term48102, term48102.getClass(), "userDefined", term48571);
        setField(term48102, term48102.getClass(), "runAsUser", "yvOcemZnPj");
        setField(term48102, term48102.getClass(), "runAsUserDynamic", term48585);
        setField(term48102, term48102.getClass(), "isRestStep", term48587);
        setField(term48102, term48102.getClass(), "owner", "xAxPUWaeyn");
        setField(term48102, term48102.getClass(), "assignees", "QrXzPOoTMM");
        setField(term48102, term48102.getClass(), "skills", "ovDeGFzsPr");
        setField(term48102, term48102.getClass(), "weight", "MetUQYZAvL");
        setField(term48102, term48102.getClass(), "hasCalledWorkflow", term48637);
        setField(term48102, term48102.getClass(), "isConditionStep", term48639);
        setField(term48102, term48102.getClass(), "steps", term48641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessPattern", argTypes, term48102, args);
    }

};


