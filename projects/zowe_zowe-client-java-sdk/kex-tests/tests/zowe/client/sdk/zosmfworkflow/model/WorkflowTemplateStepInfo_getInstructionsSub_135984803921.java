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

public class WorkflowTemplateStepInfo_getInstructionsSub_135984803921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51936;

    public WorkflowTemplateStepInfo_getInstructionsSub_135984803921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term51949 = new Boolean(true);
        Integer term51963 = new Integer(1774507971);
        Integer term52066 = new Integer(-1420269858);
        Integer term52068 = new Integer(-2119545015);
        Integer term52070 = new Integer(1272542218);
        Object term52065 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term52065, term52065.getClass(), "id", term52066);
        setField(term52065, term52065.getClass(), "ddname", null);
        setField(term52065, term52065.getClass(), "byteCount", term52068);
        setField(term52065, term52065.getClass(), "recordCount", term52070);
        setField(term52065, term52065.getClass(), "classs", null);
        setField(term52065, term52065.getClass(), "stepname", null);
        setField(term52065, term52065.getClass(), "procstep", null);
        Integer term52073 = new Integer(1209799204);
        Integer term52075 = new Integer(1094107751);
        Integer term52077 = new Integer(844222656);
        Object term52072 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobFile"));
        setField(term52072, term52072.getClass(), "id", term52073);
        setField(term52072, term52072.getClass(), "ddname", null);
        setField(term52072, term52072.getClass(), "byteCount", term52075);
        setField(term52072, term52072.getClass(), "recordCount", term52077);
        setField(term52072, term52072.getClass(), "classs", null);
        setField(term52072, term52072.getClass(), "stepname", null);
        setField(term52072, term52072.getClass(), "procstep", null);
        ArrayList term52063 = new ArrayList();
        ((ArrayList) term52063).add(term52065);
        ((ArrayList) term52063).add(term52072);
        Boolean term52093 = new Boolean(true);
        Boolean term52155 = new Boolean(false);
        Boolean term52169 = new Boolean(false);
        ArrayList term52195 = new ArrayList();
        ((ArrayList) term52195).add("FuPIwSZZLv");
        ((ArrayList) term52195).add("IHnthsxNjP");
        ((ArrayList) term52195).add("AmuZWWgIan");
        ((ArrayList) term52195).add("niexDrHktN");
        ((ArrayList) term52195).add("zkKyhlpdHO");
        Boolean term52283 = new Boolean(true);
        ArrayList term52285 = new ArrayList();
        Boolean term52349 = new Boolean(true);
        Boolean term52351 = new Boolean(false);
        ArrayList term52353 = new ArrayList();
        ((ArrayList) term52353).add("ojFfVocDNH");
        ((ArrayList) term52353).add("gqBOEdccip");
        ((ArrayList) term52353).add("biglNwhOOx");
        ((ArrayList) term52353).add("mianqYKlGq");
        ((ArrayList) term52353).add("GmpbCvsoQd");
        ((ArrayList) term52353).add("ypYkYRcFQq");
        ((ArrayList) term52353).add("lXLLmOVwcF");
        ((ArrayList) term52353).add("lIrBbPBrDY");
        Boolean term52453 = new Boolean(false);
        Boolean term52467 = new Boolean(false);
        Boolean term52469 = new Boolean(true);
        Boolean term52519 = new Boolean(true);
        Boolean term52521 = new Boolean(false);
        ArrayList term52523 = new ArrayList();
        ((ArrayList) term52523).add((Object)null);
        ((ArrayList) term52523).add((Object)null);
        ((ArrayList) term52523).add((Object)null);
        term51936 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term51965 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term51966 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term51936, term51936.getClass(), "template", "vbEYtFntxd");
        setField(term51936, term51936.getClass(), "templateSub", term51949);
        setField(term51936, term51936.getClass(), "submitAs", "ZiYiKyRQTQ");
        setField(term51936, term51936.getClass(), "maxLrecl", term51963);
        setField(term51966, term51966.getClass(), "retcode", "aaACqoZRFl");
        setField(term51966, term51966.getClass(), "jobName", "CtIecpnHzx");
        setField(term51966, term51966.getClass(), "status", "lgGoogCJeG");
        setField(term51966, term51966.getClass(), "owner", "EyskfGpFOR");
        setField(term51966, term51966.getClass(), "subsystem", "eEKpyfnNFi");
        setField(term51966, term51966.getClass(), "jobClass", "WjMAISAxtn");
        setField(term51966, term51966.getClass(), "type", "GiDsfCiYsm");
        setField(term51966, term51966.getClass(), "jobId", "RuvnkQFdLv");
        setField(term51965, term51965.getClass(), "jobStatus", term51966);
        setField(term51965, term51965.getClass(), "jobFiles", term52063);
        setField(term51936, term51936.getClass(), "jobInfo", term51965);
        setField(term51936, term51936.getClass(), "output", "FKYroLkXZi");
        setField(term51936, term51936.getClass(), "outputSub", term52093);
        setField(term51936, term51936.getClass(), "outputVariablesPrefix", "qnoyvZRqBI");
        setField(term51936, term51936.getClass(), "procName", "iBRFyvlgRW");
        setField(term51936, term51936.getClass(), "regionSize", "UjtHbgdpKi");
        setField(term51936, term51936.getClass(), "returnCode", "QZUqVBZaTe");
        setField(term51936, term51936.getClass(), "saveAsDataset", "ulsJyRLpjn");
        setField(term51936, term51936.getClass(), "saveAsDatasetSub", term52155);
        setField(term51936, term51936.getClass(), "saveAsUnixFile", "mPvRCwfDas");
        setField(term51936, term51936.getClass(), "saveAsUnixFileSub", term52169);
        setField(term51936, term51936.getClass(), "scriptParameters", "XTbkEKEVGp");
        setField(term51936, term51936.getClass(), "successPattern", "cJBWpbUYku");
        setField(term51936, term51936.getClass(), "failedPattern", term52195);
        setField(term51936, term51936.getClass(), "timeout", "deRevaCteK");
        setField(term51936, term51936.getClass(), "instructions", "dVepDETefb");
        setField(term51936, term51936.getClass(), "instructionsSub", term52283);
        setField(term51936, term51936.getClass(), "variableReferences", term52285);
        setField(term51936, term51936.getClass(), "name", "IVzSENeLxP");
        setField(term51936, term51936.getClass(), "title", "XlXuNQwqYb");
        setField(term51936, term51936.getClass(), "description", "ePtDnXODVc");
        setField(term51936, term51936.getClass(), "state", "NupNPsPxZu");
        setField(term51936, term51936.getClass(), "stepNumber", "bOTZrbSitH");
        setField(term51936, term51936.getClass(), "optional", term52349);
        setField(term51936, term51936.getClass(), "autoEnable", term52351);
        setField(term51936, term51936.getClass(), "prereqStep", term52353);
        setField(term51936, term51936.getClass(), "userDefined", term52453);
        setField(term51936, term51936.getClass(), "runAsUser", "RDqKYQTmEE");
        setField(term51936, term51936.getClass(), "runAsUserDynamic", term52467);
        setField(term51936, term51936.getClass(), "isRestStep", term52469);
        setField(term51936, term51936.getClass(), "owner", "MrUUMyYAHK");
        setField(term51936, term51936.getClass(), "assignees", "mltJfFDGWB");
        setField(term51936, term51936.getClass(), "skills", "jXearfyNpX");
        setField(term51936, term51936.getClass(), "weight", "BhmFDzFKBZ");
        setField(term51936, term51936.getClass(), "hasCalledWorkflow", term52519);
        setField(term51936, term51936.getClass(), "isConditionStep", term52521);
        setField(term51936, term51936.getClass(), "steps", term52523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstructionsSub", argTypes, term51936, args);
    }

};


