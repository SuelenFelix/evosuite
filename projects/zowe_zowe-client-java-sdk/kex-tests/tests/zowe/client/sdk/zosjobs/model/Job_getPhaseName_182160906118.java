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

public class Job_getPhaseName_182160906118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20589;

    public Job_getPhaseName_182160906118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20701 = new Long(-4360569253593381888L);
        Long term20811 = new Long(1457594663983990440L);
        term20589 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term20686 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 1);
        Object term20687 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term20589, term20589.getClass(), "jobId", "osFrHWYeRy");
        setField(term20589, term20589.getClass(), "jobName", "scpIQUfPKw");
        setField(term20589, term20589.getClass(), "subSystem", "QKYBpCjuYt");
        setField(term20589, term20589.getClass(), "owner", "vjiRfoGdkl");
        setField(term20589, term20589.getClass(), "status", "TwaxeSHvnR");
        setField(term20589, term20589.getClass(), "type", "paPzDETzIq");
        setField(term20589, term20589.getClass(), "classs", "fufeuGfwpN");
        setField(term20589, term20589.getClass(), "retCode", "XJbkXbljvz");
        setBooleanField(term20687, term20687.getClass(), "active", false);
        setField(term20687, term20687.getClass(), "smfid", "fuvdkDwBeH");
        setField(term20687, term20687.getClass(), "stepNumber", term20701);
        setField(term20687, term20687.getClass(), "owner", "NTefzwLPhx");
        setField(term20687, term20687.getClass(), "programName", "dirFuhqyNu");
        setField(term20687, term20687.getClass(), "stepName", "YVLRenzuoR");
        setField(term20687, term20687.getClass(), "pathName", "JukEMhPWql");
        setField(term20687, term20687.getClass(), "procStepName", "ZdNcodHERG");
        setField(term20687, term20687.getClass(), "completion", "CLHomjAqIM");
        setElement(term20686, 0, term20687);
        setField(term20589, term20589.getClass(), "stepData", term20686);
        setField(term20589, term20589.getClass(), "url", "mzCFLzFuSj");
        setField(term20589, term20589.getClass(), "filesUrl", "WQnMpDlSfA");
        setField(term20589, term20589.getClass(), "jobCorrelator", "aOIvTQtXiv");
        setField(term20589, term20589.getClass(), "phase", term20811);
        setField(term20589, term20589.getClass(), "phaseName", "IyjDiknqhA");
        setField(term20589, term20589.getClass(), "execSystem", "IHsXSAFYKi");
        setField(term20589, term20589.getClass(), "execMember", "KyGbLglqbW");
        setField(term20589, term20589.getClass(), "execSubmitted", "ZKVeStsSNT");
        setField(term20589, term20589.getClass(), "execStarted", "cqCXYaAnFB");
        setField(term20589, term20589.getClass(), "execEnded", "UPLNFZHXjw");
        setField(term20589, term20589.getClass(), "reasonNotRunning", "CwrrJlrGmg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhaseName", argTypes, term20589, args);
    }

};


