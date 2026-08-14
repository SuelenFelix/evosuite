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

public class Job_Builder_phaseName_178277292614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43795;

    public Job_Builder_phaseName_178277292614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43907 = new Long(8403492202041709902L);
        Long term44017 = new Long(-113028659747841511L);
        term43795 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term43892 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 1);
        Object term43893 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term43795, term43795.getClass(), "jobId", "nyqsjMHTba");
        setField(term43795, term43795.getClass(), "jobName", "ylUHzURWyg");
        setField(term43795, term43795.getClass(), "subSystem", "VuAuFBlHxQ");
        setField(term43795, term43795.getClass(), "owner", "nOLtCslMMH");
        setField(term43795, term43795.getClass(), "status", "dIQWOeKQVj");
        setField(term43795, term43795.getClass(), "type", "tHiDGaNXAL");
        setField(term43795, term43795.getClass(), "classs", "VsizBWhPWL");
        setField(term43795, term43795.getClass(), "retCode", "jAFSxnVMcD");
        setBooleanField(term43893, term43893.getClass(), "active", false);
        setField(term43893, term43893.getClass(), "smfid", "BuNQAVaNCe");
        setField(term43893, term43893.getClass(), "stepNumber", term43907);
        setField(term43893, term43893.getClass(), "owner", "iaYiUQnOLD");
        setField(term43893, term43893.getClass(), "programName", "upnleTLVdf");
        setField(term43893, term43893.getClass(), "stepName", "pvjlKAnxzJ");
        setField(term43893, term43893.getClass(), "pathName", "ejxUBDQQKB");
        setField(term43893, term43893.getClass(), "procStepName", "IbOvZLmtSE");
        setField(term43893, term43893.getClass(), "completion", "AOsIglRFcp");
        setElement(term43892, 0, term43893);
        setField(term43795, term43795.getClass(), "stepData", term43892);
        setField(term43795, term43795.getClass(), "url", "bdONLhBZoA");
        setField(term43795, term43795.getClass(), "filesUrl", "qPVeRcolUe");
        setField(term43795, term43795.getClass(), "jobCorrelator", "AscZyfQFkU");
        setField(term43795, term43795.getClass(), "phase", term44017);
        setField(term43795, term43795.getClass(), "phaseName", "nPfruizWey");
        setField(term43795, term43795.getClass(), "execSystem", "RvgkUqMUFX");
        setField(term43795, term43795.getClass(), "execMember", "nOqmldTbXj");
        setField(term43795, term43795.getClass(), "execSubmitted", "xNDnWDGUNx");
        setField(term43795, term43795.getClass(), "execStarted", "faGVqjLquQ");
        setField(term43795, term43795.getClass(), "execEnded", "MbsTNUmNqV");
        setField(term43795, term43795.getClass(), "reasonNotRunning", "VdDIonpedU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VjtXZcUFNx";
        callMethod(klass, "phaseName", argTypes, term43795, args);
    }

};


