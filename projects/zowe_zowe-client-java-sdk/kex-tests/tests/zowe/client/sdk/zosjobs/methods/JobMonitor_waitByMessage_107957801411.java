package zowe.client.sdk.zosjobs.methods;

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
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class JobMonitor_waitByMessage_107957801411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13935;
     Object term13939;

    public JobMonitor_waitByMessage_107957801411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13935 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor"));
        setField(term13935, term13935.getClass(), "connection", null);
        setIntField(term13935, term13935.getClass(), "attempts", 865208305);
        setIntField(term13935, term13935.getClass(), "watchDelay", -1275173084);
        setIntField(term13935, term13935.getClass(), "lineLimit", -244121226);
        Long term14051 = new Long(-1154553077993834885L);
        Long term14139 = new Long(-2850532706972744550L);
        Long term14227 = new Long(-2644215923136513282L);
        Long term14315 = new Long(-1468719814009985452L);
        Long term14403 = new Long(-7738503207562305297L);
        Long term14491 = new Long(3825396310311739952L);
        Long term14579 = new Long(-3838084482494604218L);
        Long term14689 = new Long(3892018155439224435L);
        term13939 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term14036 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 7);
        Object term14037 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term14125 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term14213 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term14301 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term14389 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term14477 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term14565 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term13939, term13939.getClass(), "jobId", "UiWhvbypdr");
        setField(term13939, term13939.getClass(), "jobName", "CgleElJNje");
        setField(term13939, term13939.getClass(), "subSystem", "ZrchvNGMtd");
        setField(term13939, term13939.getClass(), "owner", "WaEcyVlcIx");
        setField(term13939, term13939.getClass(), "status", "ONcbPCQnHd");
        setField(term13939, term13939.getClass(), "type", "AobDaplFLl");
        setField(term13939, term13939.getClass(), "classs", "pDkMNnAGgv");
        setField(term13939, term13939.getClass(), "retCode", "PaCpFXGzdX");
        setBooleanField(term14037, term14037.getClass(), "active", true);
        setField(term14037, term14037.getClass(), "smfid", "FftYCNbnks");
        setField(term14037, term14037.getClass(), "stepNumber", term14051);
        setField(term14037, term14037.getClass(), "owner", "lJoltmsadS");
        setField(term14037, term14037.getClass(), "programName", "mvfDtZNEHr");
        setField(term14037, term14037.getClass(), "stepName", "bvSgmFUDOU");
        setField(term14037, term14037.getClass(), "pathName", "XMHwbfiHRl");
        setField(term14037, term14037.getClass(), "procStepName", "bucTnYicnp");
        setField(term14037, term14037.getClass(), "completion", "EkgprvqZlM");
        setElement(term14036, 0, term14037);
        setBooleanField(term14125, term14125.getClass(), "active", false);
        setField(term14125, term14125.getClass(), "smfid", "fbnKvthhOz");
        setField(term14125, term14125.getClass(), "stepNumber", term14139);
        setField(term14125, term14125.getClass(), "owner", "PGfCDJTBek");
        setField(term14125, term14125.getClass(), "programName", "ZwjARhAtHC");
        setField(term14125, term14125.getClass(), "stepName", "XXvscsYBWv");
        setField(term14125, term14125.getClass(), "pathName", "uePedtiAfL");
        setField(term14125, term14125.getClass(), "procStepName", "AdSHvysxQB");
        setField(term14125, term14125.getClass(), "completion", "jlraKkBWFA");
        setElement(term14036, 1, term14125);
        setBooleanField(term14213, term14213.getClass(), "active", false);
        setField(term14213, term14213.getClass(), "smfid", "mRBtFTxVdE");
        setField(term14213, term14213.getClass(), "stepNumber", term14227);
        setField(term14213, term14213.getClass(), "owner", "IVacFDAZcj");
        setField(term14213, term14213.getClass(), "programName", "EEYmuwyVDP");
        setField(term14213, term14213.getClass(), "stepName", "EWFbEDAVrE");
        setField(term14213, term14213.getClass(), "pathName", "EMiMtYgfvr");
        setField(term14213, term14213.getClass(), "procStepName", "OyYyYYnJuF");
        setField(term14213, term14213.getClass(), "completion", "aYLvcxZohT");
        setElement(term14036, 2, term14213);
        setBooleanField(term14301, term14301.getClass(), "active", false);
        setField(term14301, term14301.getClass(), "smfid", "mnHyQbMyld");
        setField(term14301, term14301.getClass(), "stepNumber", term14315);
        setField(term14301, term14301.getClass(), "owner", "KHtaDOIcJZ");
        setField(term14301, term14301.getClass(), "programName", "vgdwrCZczl");
        setField(term14301, term14301.getClass(), "stepName", "gKMNrpKBpu");
        setField(term14301, term14301.getClass(), "pathName", "ZbHJVEqcoa");
        setField(term14301, term14301.getClass(), "procStepName", "awDQVEVIKi");
        setField(term14301, term14301.getClass(), "completion", "HJwNgUzZZR");
        setElement(term14036, 3, term14301);
        setBooleanField(term14389, term14389.getClass(), "active", true);
        setField(term14389, term14389.getClass(), "smfid", "FvUCZgTXhq");
        setField(term14389, term14389.getClass(), "stepNumber", term14403);
        setField(term14389, term14389.getClass(), "owner", "wWWidPCHzx");
        setField(term14389, term14389.getClass(), "programName", "OwPIiBRuKK");
        setField(term14389, term14389.getClass(), "stepName", "sgfGySMODT");
        setField(term14389, term14389.getClass(), "pathName", "ndAITnOsny");
        setField(term14389, term14389.getClass(), "procStepName", "CVZnTiJucs");
        setField(term14389, term14389.getClass(), "completion", "ecHEQufXoq");
        setElement(term14036, 4, term14389);
        setBooleanField(term14477, term14477.getClass(), "active", true);
        setField(term14477, term14477.getClass(), "smfid", "btBLMvHzJg");
        setField(term14477, term14477.getClass(), "stepNumber", term14491);
        setField(term14477, term14477.getClass(), "owner", "JdOMfNWgLP");
        setField(term14477, term14477.getClass(), "programName", "uWqXrwAsDU");
        setField(term14477, term14477.getClass(), "stepName", "hgFbWAUtsu");
        setField(term14477, term14477.getClass(), "pathName", "HqoTWlkbwF");
        setField(term14477, term14477.getClass(), "procStepName", "CwNELDTAPP");
        setField(term14477, term14477.getClass(), "completion", "GSzQdbHLHw");
        setElement(term14036, 5, term14477);
        setBooleanField(term14565, term14565.getClass(), "active", false);
        setField(term14565, term14565.getClass(), "smfid", "IkfarsYNJO");
        setField(term14565, term14565.getClass(), "stepNumber", term14579);
        setField(term14565, term14565.getClass(), "owner", "aZKOWhHMEh");
        setField(term14565, term14565.getClass(), "programName", "YfkhviKZwl");
        setField(term14565, term14565.getClass(), "stepName", "DcOhhAfJTI");
        setField(term14565, term14565.getClass(), "pathName", "gYTIkBFOoS");
        setField(term14565, term14565.getClass(), "procStepName", "xmzSoVgiED");
        setField(term14565, term14565.getClass(), "completion", "pdSvedKgPq");
        setElement(term14036, 6, term14565);
        setField(term13939, term13939.getClass(), "stepData", term14036);
        setField(term13939, term13939.getClass(), "url", "epPTwvcoyb");
        setField(term13939, term13939.getClass(), "filesUrl", "UBPHmOICBs");
        setField(term13939, term13939.getClass(), "jobCorrelator", "IDJUVPgUJf");
        setField(term13939, term13939.getClass(), "phase", term14689);
        setField(term13939, term13939.getClass(), "phaseName", "JmnWRJUxGr");
        setField(term13939, term13939.getClass(), "execSystem", "wgRGBNrTGP");
        setField(term13939, term13939.getClass(), "execMember", "FIdNVptZpW");
        setField(term13939, term13939.getClass(), "execSubmitted", "rQjxAhisjm");
        setField(term13939, term13939.getClass(), "execStarted", "ZDhASPHjDG");
        setField(term13939, term13939.getClass(), "execEnded", "HNVOAXYNEZ");
        setField(term13939, term13939.getClass(), "reasonNotRunning", "gbbYBYyfvr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobMonitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term13939;
        args[1] = "SrWMUlbtWV";
        callMethod(klass, "waitByMessage", argTypes, term13935, args);
    }

};


