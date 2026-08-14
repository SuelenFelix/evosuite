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

public class Job_Builder_phase_131837409213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42603;
     Object term43263;

    public Job_Builder_phase_131837409213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42715 = new Long(918397384129253729L);
        Long term42803 = new Long(-2187638136407967948L);
        Long term42891 = new Long(8708846223293804408L);
        Long term42979 = new Long(-2986201902216133814L);
        Long term43067 = new Long(4255811647459029682L);
        Long term43177 = new Long(8000844860910174690L);
        term42603 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term42700 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term42701 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term42789 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term42877 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term42965 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term43053 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term42603, term42603.getClass(), "jobId", "jAxYagPvcV");
        setField(term42603, term42603.getClass(), "jobName", "ZXLgGUqgyW");
        setField(term42603, term42603.getClass(), "subSystem", "PdeSzTcBgY");
        setField(term42603, term42603.getClass(), "owner", "PmSvMYNoIS");
        setField(term42603, term42603.getClass(), "status", "zejWtMxJdV");
        setField(term42603, term42603.getClass(), "type", "YUIUZeZiMK");
        setField(term42603, term42603.getClass(), "classs", "rrPETbKRef");
        setField(term42603, term42603.getClass(), "retCode", "viZRlrisPY");
        setBooleanField(term42701, term42701.getClass(), "active", false);
        setField(term42701, term42701.getClass(), "smfid", "VSfRsPLslq");
        setField(term42701, term42701.getClass(), "stepNumber", term42715);
        setField(term42701, term42701.getClass(), "owner", "dwygneuBjP");
        setField(term42701, term42701.getClass(), "programName", "LfKgkzPZpX");
        setField(term42701, term42701.getClass(), "stepName", "belyXxMqFm");
        setField(term42701, term42701.getClass(), "pathName", "LPotuCwkwB");
        setField(term42701, term42701.getClass(), "procStepName", "zpCKXLOzse");
        setField(term42701, term42701.getClass(), "completion", "qhlWSiHAHt");
        setElement(term42700, 0, term42701);
        setBooleanField(term42789, term42789.getClass(), "active", false);
        setField(term42789, term42789.getClass(), "smfid", "XrKIhxpIJD");
        setField(term42789, term42789.getClass(), "stepNumber", term42803);
        setField(term42789, term42789.getClass(), "owner", "RSuRSjiLvm");
        setField(term42789, term42789.getClass(), "programName", "aoeNWgMpNx");
        setField(term42789, term42789.getClass(), "stepName", "RQvXfSweVs");
        setField(term42789, term42789.getClass(), "pathName", "jGxArBjtep");
        setField(term42789, term42789.getClass(), "procStepName", "dUXsPNSUez");
        setField(term42789, term42789.getClass(), "completion", "PxGDfPOAFS");
        setElement(term42700, 1, term42789);
        setBooleanField(term42877, term42877.getClass(), "active", false);
        setField(term42877, term42877.getClass(), "smfid", "dZVxzYEeZe");
        setField(term42877, term42877.getClass(), "stepNumber", term42891);
        setField(term42877, term42877.getClass(), "owner", "TnCQRmzwPf");
        setField(term42877, term42877.getClass(), "programName", "ZGnUKGTWCn");
        setField(term42877, term42877.getClass(), "stepName", "cHRLXsgRzr");
        setField(term42877, term42877.getClass(), "pathName", "QpqQKmCtoC");
        setField(term42877, term42877.getClass(), "procStepName", "AYRvbRJxWI");
        setField(term42877, term42877.getClass(), "completion", "MGNiaVqEDc");
        setElement(term42700, 2, term42877);
        setBooleanField(term42965, term42965.getClass(), "active", true);
        setField(term42965, term42965.getClass(), "smfid", "qeVNCFrTbT");
        setField(term42965, term42965.getClass(), "stepNumber", term42979);
        setField(term42965, term42965.getClass(), "owner", "sreEtRBWQl");
        setField(term42965, term42965.getClass(), "programName", "UKQejaeJWY");
        setField(term42965, term42965.getClass(), "stepName", "lNbVasLAKL");
        setField(term42965, term42965.getClass(), "pathName", "wKeyHBCSLZ");
        setField(term42965, term42965.getClass(), "procStepName", "iQCLduwSPi");
        setField(term42965, term42965.getClass(), "completion", "ZcODLNhxqg");
        setElement(term42700, 3, term42965);
        setBooleanField(term43053, term43053.getClass(), "active", false);
        setField(term43053, term43053.getClass(), "smfid", "iNtHOROBMq");
        setField(term43053, term43053.getClass(), "stepNumber", term43067);
        setField(term43053, term43053.getClass(), "owner", "GbvfbbsrOl");
        setField(term43053, term43053.getClass(), "programName", "IIZlqzOmtY");
        setField(term43053, term43053.getClass(), "stepName", "iRFRSxtnkr");
        setField(term43053, term43053.getClass(), "pathName", "iGWkLjLGBY");
        setField(term43053, term43053.getClass(), "procStepName", "jUkXaNkoAg");
        setField(term43053, term43053.getClass(), "completion", "mZsPsRzyhQ");
        setElement(term42700, 4, term43053);
        setField(term42603, term42603.getClass(), "stepData", term42700);
        setField(term42603, term42603.getClass(), "url", "IExlbTemvJ");
        setField(term42603, term42603.getClass(), "filesUrl", "zaljyXXCoy");
        setField(term42603, term42603.getClass(), "jobCorrelator", "dKoYnXLGEI");
        setField(term42603, term42603.getClass(), "phase", term43177);
        setField(term42603, term42603.getClass(), "phaseName", "MQvSpklpkB");
        setField(term42603, term42603.getClass(), "execSystem", "SbTxRdDQQc");
        setField(term42603, term42603.getClass(), "execMember", "MrVdoUYAdO");
        setField(term42603, term42603.getClass(), "execSubmitted", "schPUnVfDW");
        setField(term42603, term42603.getClass(), "execStarted", "CpdMEgjUka");
        setField(term42603, term42603.getClass(), "execEnded", "WRisHdgnmm");
        setField(term42603, term42603.getClass(), "reasonNotRunning", "XxZiwWPLOx");
        term43263 = new Long(2209808079059619773L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term43263;
        callMethod(klass, "phase", argTypes, term42603, args);
    }

};


