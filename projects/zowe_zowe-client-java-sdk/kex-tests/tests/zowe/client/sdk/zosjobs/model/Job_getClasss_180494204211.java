package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Job_getClasss_180494204211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13207;

    public Job_getClasss_180494204211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13319 = new Long(-4924950707540628022L);
        Long term13407 = new Long(-4393710401270724527L);
        Long term13495 = new Long(-4822736661741380518L);
        Long term13583 = new Long(-5386201758403679145L);
        Long term13671 = new Long(-7268507582722666254L);
        Long term13759 = new Long(5671808784468963649L);
        Long term13847 = new Long(2297097306706899827L);
        Long term13957 = new Long(-900457279156388404L);
        term13207 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term13304 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 7);
        Object term13305 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term13393 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term13481 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term13569 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term13657 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term13745 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term13833 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term13207, term13207.getClass(), "jobId", "IVacFDAZcj");
        setField(term13207, term13207.getClass(), "jobName", "EEYmuwyVDP");
        setField(term13207, term13207.getClass(), "subSystem", "EWFbEDAVrE");
        setField(term13207, term13207.getClass(), "owner", "EMiMtYgfvr");
        setField(term13207, term13207.getClass(), "status", "OyYyYYnJuF");
        setField(term13207, term13207.getClass(), "type", "aYLvcxZohT");
        setField(term13207, term13207.getClass(), "classs", "mnHyQbMyld");
        setField(term13207, term13207.getClass(), "retCode", "KHtaDOIcJZ");
        setBooleanField(term13305, term13305.getClass(), "active", true);
        setField(term13305, term13305.getClass(), "smfid", "vgdwrCZczl");
        setField(term13305, term13305.getClass(), "stepNumber", term13319);
        setField(term13305, term13305.getClass(), "owner", "gKMNrpKBpu");
        setField(term13305, term13305.getClass(), "programName", "ZbHJVEqcoa");
        setField(term13305, term13305.getClass(), "stepName", "awDQVEVIKi");
        setField(term13305, term13305.getClass(), "pathName", "HJwNgUzZZR");
        setField(term13305, term13305.getClass(), "procStepName", "FvUCZgTXhq");
        setField(term13305, term13305.getClass(), "completion", "wWWidPCHzx");
        setElement(term13304, 0, term13305);
        setBooleanField(term13393, term13393.getClass(), "active", true);
        setField(term13393, term13393.getClass(), "smfid", "OwPIiBRuKK");
        setField(term13393, term13393.getClass(), "stepNumber", term13407);
        setField(term13393, term13393.getClass(), "owner", "sgfGySMODT");
        setField(term13393, term13393.getClass(), "programName", "ndAITnOsny");
        setField(term13393, term13393.getClass(), "stepName", "CVZnTiJucs");
        setField(term13393, term13393.getClass(), "pathName", "ecHEQufXoq");
        setField(term13393, term13393.getClass(), "procStepName", "btBLMvHzJg");
        setField(term13393, term13393.getClass(), "completion", "JdOMfNWgLP");
        setElement(term13304, 1, term13393);
        setBooleanField(term13481, term13481.getClass(), "active", false);
        setField(term13481, term13481.getClass(), "smfid", "uWqXrwAsDU");
        setField(term13481, term13481.getClass(), "stepNumber", term13495);
        setField(term13481, term13481.getClass(), "owner", "hgFbWAUtsu");
        setField(term13481, term13481.getClass(), "programName", "HqoTWlkbwF");
        setField(term13481, term13481.getClass(), "stepName", "CwNELDTAPP");
        setField(term13481, term13481.getClass(), "pathName", "GSzQdbHLHw");
        setField(term13481, term13481.getClass(), "procStepName", "IkfarsYNJO");
        setField(term13481, term13481.getClass(), "completion", "aZKOWhHMEh");
        setElement(term13304, 2, term13481);
        setBooleanField(term13569, term13569.getClass(), "active", true);
        setField(term13569, term13569.getClass(), "smfid", "YfkhviKZwl");
        setField(term13569, term13569.getClass(), "stepNumber", term13583);
        setField(term13569, term13569.getClass(), "owner", "DcOhhAfJTI");
        setField(term13569, term13569.getClass(), "programName", "gYTIkBFOoS");
        setField(term13569, term13569.getClass(), "stepName", "xmzSoVgiED");
        setField(term13569, term13569.getClass(), "pathName", "pdSvedKgPq");
        setField(term13569, term13569.getClass(), "procStepName", "epPTwvcoyb");
        setField(term13569, term13569.getClass(), "completion", "UBPHmOICBs");
        setElement(term13304, 3, term13569);
        setBooleanField(term13657, term13657.getClass(), "active", true);
        setField(term13657, term13657.getClass(), "smfid", "IDJUVPgUJf");
        setField(term13657, term13657.getClass(), "stepNumber", term13671);
        setField(term13657, term13657.getClass(), "owner", "JmnWRJUxGr");
        setField(term13657, term13657.getClass(), "programName", "wgRGBNrTGP");
        setField(term13657, term13657.getClass(), "stepName", "FIdNVptZpW");
        setField(term13657, term13657.getClass(), "pathName", "rQjxAhisjm");
        setField(term13657, term13657.getClass(), "procStepName", "ZDhASPHjDG");
        setField(term13657, term13657.getClass(), "completion", "HNVOAXYNEZ");
        setElement(term13304, 4, term13657);
        setBooleanField(term13745, term13745.getClass(), "active", true);
        setField(term13745, term13745.getClass(), "smfid", "gbbYBYyfvr");
        setField(term13745, term13745.getClass(), "stepNumber", term13759);
        setField(term13745, term13745.getClass(), "owner", "SrWMUlbtWV");
        setField(term13745, term13745.getClass(), "programName", "VePIumgrrU");
        setField(term13745, term13745.getClass(), "stepName", "DPwIqlszZo");
        setField(term13745, term13745.getClass(), "pathName", "mNgDshwZNc");
        setField(term13745, term13745.getClass(), "procStepName", "pDqgDbJoFw");
        setField(term13745, term13745.getClass(), "completion", "iVOvTzOxwt");
        setElement(term13304, 5, term13745);
        setBooleanField(term13833, term13833.getClass(), "active", false);
        setField(term13833, term13833.getClass(), "smfid", "BjZQdecXvB");
        setField(term13833, term13833.getClass(), "stepNumber", term13847);
        setField(term13833, term13833.getClass(), "owner", "iUkOOQhEkw");
        setField(term13833, term13833.getClass(), "programName", "wmVoFoUVmU");
        setField(term13833, term13833.getClass(), "stepName", "lLiSiPCciB");
        setField(term13833, term13833.getClass(), "pathName", "PsMKIIEwdR");
        setField(term13833, term13833.getClass(), "procStepName", "RbQmXqfXAT");
        setField(term13833, term13833.getClass(), "completion", "fcCAsvfBbe");
        setElement(term13304, 6, term13833);
        setField(term13207, term13207.getClass(), "stepData", term13304);
        setField(term13207, term13207.getClass(), "url", "mUNcKUxghj");
        setField(term13207, term13207.getClass(), "filesUrl", "lnvLKbtveE");
        setField(term13207, term13207.getClass(), "jobCorrelator", "FfrrEhTHzQ");
        setField(term13207, term13207.getClass(), "phase", term13957);
        setField(term13207, term13207.getClass(), "phaseName", "LXnDNrMsqT");
        setField(term13207, term13207.getClass(), "execSystem", "ZLQamJFBmu");
        setField(term13207, term13207.getClass(), "execMember", "ZWcOCwKNvd");
        setField(term13207, term13207.getClass(), "execSubmitted", "GTmoNrziyc");
        setField(term13207, term13207.getClass(), "execStarted", "LvztehSlhM");
        setField(term13207, term13207.getClass(), "execEnded", "njvnWFTMxN");
        setField(term13207, term13207.getClass(), "reasonNotRunning", "fLRqcTSfzF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClasss", argTypes, term13207, args);
    }

};


