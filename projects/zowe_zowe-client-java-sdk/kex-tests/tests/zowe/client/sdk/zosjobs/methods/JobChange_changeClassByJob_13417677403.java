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

public class JobChange_changeClassByJob_13417677403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term91;

    public JobChange_changeClassByJob_13417677403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobChange"));
        setField(term90, term90.getClass(), "connection", null);
        setField(term90, term90.getClass(), "request", null);
        Long term203 = new Long(2442117782898005296L);
        Long term291 = new Long(6375119433582206027L);
        Long term379 = new Long(-8257434502486459194L);
        Long term467 = new Long(-8400487765614892086L);
        Long term555 = new Long(5270370404989704783L);
        Long term665 = new Long(7411271909051562686L);
        term91 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term188 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term189 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term277 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term365 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term453 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term541 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term91, term91.getClass(), "jobId", "jJCZpVmanW");
        setField(term91, term91.getClass(), "jobName", "EGtDIRbSSb");
        setField(term91, term91.getClass(), "subSystem", "SzjVpOQTyS");
        setField(term91, term91.getClass(), "owner", "MjGYSRKTNF");
        setField(term91, term91.getClass(), "status", "hRNSzYYIrc");
        setField(term91, term91.getClass(), "type", "RMFIsYGgne");
        setField(term91, term91.getClass(), "classs", "NRdvgJlhkX");
        setField(term91, term91.getClass(), "retCode", "uuaPigETmJ");
        setBooleanField(term189, term189.getClass(), "active", false);
        setField(term189, term189.getClass(), "smfid", "MxlszYVzRf");
        setField(term189, term189.getClass(), "stepNumber", term203);
        setField(term189, term189.getClass(), "owner", "LQFpaHEwXR");
        setField(term189, term189.getClass(), "programName", "oVcInYnLWB");
        setField(term189, term189.getClass(), "stepName", "aJlieCFVtF");
        setField(term189, term189.getClass(), "pathName", "ZiaGIbnzTs");
        setField(term189, term189.getClass(), "procStepName", "tbcdzjIfER");
        setField(term189, term189.getClass(), "completion", "HyxfbSQYBe");
        setElement(term188, 0, term189);
        setBooleanField(term277, term277.getClass(), "active", false);
        setField(term277, term277.getClass(), "smfid", "pCTimMblYc");
        setField(term277, term277.getClass(), "stepNumber", term291);
        setField(term277, term277.getClass(), "owner", "hNxWaHcfhY");
        setField(term277, term277.getClass(), "programName", "RkybSrpybU");
        setField(term277, term277.getClass(), "stepName", "xOEqzGAmDU");
        setField(term277, term277.getClass(), "pathName", "eZFUvlxvGV");
        setField(term277, term277.getClass(), "procStepName", "BYqFIqCKAV");
        setField(term277, term277.getClass(), "completion", "vrQLuWIDJX");
        setElement(term188, 1, term277);
        setBooleanField(term365, term365.getClass(), "active", false);
        setField(term365, term365.getClass(), "smfid", "flxyYxBRtu");
        setField(term365, term365.getClass(), "stepNumber", term379);
        setField(term365, term365.getClass(), "owner", "OclPbYPkcH");
        setField(term365, term365.getClass(), "programName", "IoAlmYsBwc");
        setField(term365, term365.getClass(), "stepName", "TEParAifyi");
        setField(term365, term365.getClass(), "pathName", "OWDIEULEFu");
        setField(term365, term365.getClass(), "procStepName", "dWRymuLBtr");
        setField(term365, term365.getClass(), "completion", "AijpHYOFuy");
        setElement(term188, 2, term365);
        setBooleanField(term453, term453.getClass(), "active", false);
        setField(term453, term453.getClass(), "smfid", "SbAoxhfrkn");
        setField(term453, term453.getClass(), "stepNumber", term467);
        setField(term453, term453.getClass(), "owner", "kuTXqwMtDB");
        setField(term453, term453.getClass(), "programName", "Ghbwtircqb");
        setField(term453, term453.getClass(), "stepName", "xrwlQZdwCp");
        setField(term453, term453.getClass(), "pathName", "IDCWpPLRkE");
        setField(term453, term453.getClass(), "procStepName", "nyiiPDVjAc");
        setField(term453, term453.getClass(), "completion", "aKnKipADSo");
        setElement(term188, 3, term453);
        setBooleanField(term541, term541.getClass(), "active", true);
        setField(term541, term541.getClass(), "smfid", "wSQxaModmm");
        setField(term541, term541.getClass(), "stepNumber", term555);
        setField(term541, term541.getClass(), "owner", "UlajhuVLaP");
        setField(term541, term541.getClass(), "programName", "gGSMzuGICf");
        setField(term541, term541.getClass(), "stepName", "hxCBltsObl");
        setField(term541, term541.getClass(), "pathName", "BndsHwAFMv");
        setField(term541, term541.getClass(), "procStepName", "GzFkzHGYFt");
        setField(term541, term541.getClass(), "completion", "tShwQLRGNe");
        setElement(term188, 4, term541);
        setField(term91, term91.getClass(), "stepData", term188);
        setField(term91, term91.getClass(), "url", "LvtrsXUliU");
        setField(term91, term91.getClass(), "filesUrl", "xLbjWUgOIL");
        setField(term91, term91.getClass(), "jobCorrelator", "jDtqGUpnZN");
        setField(term91, term91.getClass(), "phase", term665);
        setField(term91, term91.getClass(), "phaseName", "nGKItKLYNC");
        setField(term91, term91.getClass(), "execSystem", "UiUYnPrcCi");
        setField(term91, term91.getClass(), "execMember", "UoYtihxVaS");
        setField(term91, term91.getClass(), "execSubmitted", "JDswTTCZHV");
        setField(term91, term91.getClass(), "execStarted", "onpbIeEKoi");
        setField(term91, term91.getClass(), "execEnded", "YRHGsAkhxb");
        setField(term91, term91.getClass(), "reasonNotRunning", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobChange");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term91;
        args[1] = "MLqYREekMl";
        args[2] = "ytSBIKXogI";
        callMethod(klass, "changeClassByJob", argTypes, term90, args);
    }

};


