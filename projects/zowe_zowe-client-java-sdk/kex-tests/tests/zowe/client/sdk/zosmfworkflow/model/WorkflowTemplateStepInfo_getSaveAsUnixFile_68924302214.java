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

public class WorkflowTemplateStepInfo_getSaveAsUnixFile_68924302214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45085;

    public WorkflowTemplateStepInfo_getSaveAsUnixFile_68924302214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term45098 = new Boolean(false);
        Integer term45112 = new Integer(1166710220);
        ArrayList term45212 = new ArrayList();
        Boolean term45228 = new Boolean(false);
        Boolean term45290 = new Boolean(true);
        Boolean term45304 = new Boolean(false);
        ArrayList term45330 = new ArrayList();
        ((ArrayList) term45330).add("CeaAfrYZQU");
        ((ArrayList) term45330).add("hLWnnngzRq");
        Boolean term45382 = new Boolean(false);
        ArrayList term45384 = new ArrayList();
        Boolean term45448 = new Boolean(true);
        Boolean term45450 = new Boolean(true);
        ArrayList term45452 = new ArrayList();
        ((ArrayList) term45452).add("OzwvrniiKl");
        ((ArrayList) term45452).add("beAkHVBeEQ");
        ((ArrayList) term45452).add("tiGVUUaQMv");
        ((ArrayList) term45452).add("NzoNAsaJqr");
        Boolean term45504 = new Boolean(false);
        Boolean term45518 = new Boolean(true);
        Boolean term45520 = new Boolean(true);
        Boolean term45570 = new Boolean(false);
        Boolean term45572 = new Boolean(true);
        ArrayList term45574 = new ArrayList();
        ((ArrayList) term45574).add((Object)null);
        ((ArrayList) term45574).add((Object)null);
        ((ArrayList) term45574).add((Object)null);
        ((ArrayList) term45574).add((Object)null);
        ((ArrayList) term45574).add((Object)null);
        ((ArrayList) term45574).add((Object)null);
        ((ArrayList) term45574).add((Object)null);
        term45085 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo"));
        Object term45114 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobInfo"));
        Object term45115 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowJobStatus"));
        setField(term45085, term45085.getClass(), "template", "NSPCJaizlC");
        setField(term45085, term45085.getClass(), "templateSub", term45098);
        setField(term45085, term45085.getClass(), "submitAs", "JoFUYaQQtF");
        setField(term45085, term45085.getClass(), "maxLrecl", term45112);
        setField(term45115, term45115.getClass(), "retcode", "SAKoORlZVA");
        setField(term45115, term45115.getClass(), "jobName", "HhYVbmMRiN");
        setField(term45115, term45115.getClass(), "status", "UYEVBNEKyf");
        setField(term45115, term45115.getClass(), "owner", "EXduYtKPaE");
        setField(term45115, term45115.getClass(), "subsystem", "UVMEqArKpY");
        setField(term45115, term45115.getClass(), "jobClass", "fLbDziHEHK");
        setField(term45115, term45115.getClass(), "type", "lzRecPiQNU");
        setField(term45115, term45115.getClass(), "jobId", "CVfKmjoLKq");
        setField(term45114, term45114.getClass(), "jobStatus", term45115);
        setField(term45114, term45114.getClass(), "jobFiles", term45212);
        setField(term45085, term45085.getClass(), "jobInfo", term45114);
        setField(term45085, term45085.getClass(), "output", "zvqciKTUAl");
        setField(term45085, term45085.getClass(), "outputSub", term45228);
        setField(term45085, term45085.getClass(), "outputVariablesPrefix", "hvNiDuvOYJ");
        setField(term45085, term45085.getClass(), "procName", "unTIyPhfcW");
        setField(term45085, term45085.getClass(), "regionSize", "McPsgamHga");
        setField(term45085, term45085.getClass(), "returnCode", "wiqxbqDkJU");
        setField(term45085, term45085.getClass(), "saveAsDataset", "psNunGzDVf");
        setField(term45085, term45085.getClass(), "saveAsDatasetSub", term45290);
        setField(term45085, term45085.getClass(), "saveAsUnixFile", "YFOetAfnRt");
        setField(term45085, term45085.getClass(), "saveAsUnixFileSub", term45304);
        setField(term45085, term45085.getClass(), "scriptParameters", "VgCCefhtcT");
        setField(term45085, term45085.getClass(), "successPattern", "DEvoiMeeMr");
        setField(term45085, term45085.getClass(), "failedPattern", term45330);
        setField(term45085, term45085.getClass(), "timeout", "iLNHwyhEDE");
        setField(term45085, term45085.getClass(), "instructions", "duILkPooNH");
        setField(term45085, term45085.getClass(), "instructionsSub", term45382);
        setField(term45085, term45085.getClass(), "variableReferences", term45384);
        setField(term45085, term45085.getClass(), "name", "bUJrQeiZOb");
        setField(term45085, term45085.getClass(), "title", "mQqpexSybQ");
        setField(term45085, term45085.getClass(), "description", "KxEBqnheIv");
        setField(term45085, term45085.getClass(), "state", "ExgxdQmpcx");
        setField(term45085, term45085.getClass(), "stepNumber", "SUwVfgXZzs");
        setField(term45085, term45085.getClass(), "optional", term45448);
        setField(term45085, term45085.getClass(), "autoEnable", term45450);
        setField(term45085, term45085.getClass(), "prereqStep", term45452);
        setField(term45085, term45085.getClass(), "userDefined", term45504);
        setField(term45085, term45085.getClass(), "runAsUser", "VRKEuPftph");
        setField(term45085, term45085.getClass(), "runAsUserDynamic", term45518);
        setField(term45085, term45085.getClass(), "isRestStep", term45520);
        setField(term45085, term45085.getClass(), "owner", "DkRegMkIWt");
        setField(term45085, term45085.getClass(), "assignees", "IIOFAGjcXe");
        setField(term45085, term45085.getClass(), "skills", "XsAUdWVfqM");
        setField(term45085, term45085.getClass(), "weight", "WRKAHqtTqT");
        setField(term45085, term45085.getClass(), "hasCalledWorkflow", term45570);
        setField(term45085, term45085.getClass(), "isConditionStep", term45572);
        setField(term45085, term45085.getClass(), "steps", term45574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowTemplateStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaveAsUnixFile", argTypes, term45085, args);
    }

};


