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

public class Job_Builder_status_10886813585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33086;

    public Job_Builder_status_10886813585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33198 = new Long(185793058502220865L);
        Long term33286 = new Long(-7698746988132548371L);
        Long term33374 = new Long(2145420811068634601L);
        Long term33484 = new Long(2191130532479601175L);
        term33086 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term33183 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term33184 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term33272 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term33360 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term33086, term33086.getClass(), "jobId", "OCtePrLDhe");
        setField(term33086, term33086.getClass(), "jobName", "yqEphNxUPZ");
        setField(term33086, term33086.getClass(), "subSystem", "mJJxTuZuKO");
        setField(term33086, term33086.getClass(), "owner", "anSZCikKpS");
        setField(term33086, term33086.getClass(), "status", "zvMQGbTtsV");
        setField(term33086, term33086.getClass(), "type", "DyUuIDzZPG");
        setField(term33086, term33086.getClass(), "classs", "EGQLusEtRN");
        setField(term33086, term33086.getClass(), "retCode", "GwGUMPdvZq");
        setBooleanField(term33184, term33184.getClass(), "active", false);
        setField(term33184, term33184.getClass(), "smfid", "iXRAYcFyfS");
        setField(term33184, term33184.getClass(), "stepNumber", term33198);
        setField(term33184, term33184.getClass(), "owner", "lokyclbLEz");
        setField(term33184, term33184.getClass(), "programName", "hAPmQGaxkI");
        setField(term33184, term33184.getClass(), "stepName", "ojrnLnJZjT");
        setField(term33184, term33184.getClass(), "pathName", "rtvXSMjOdJ");
        setField(term33184, term33184.getClass(), "procStepName", "EDkfjuDpNv");
        setField(term33184, term33184.getClass(), "completion", "LNHkTUfuHX");
        setElement(term33183, 0, term33184);
        setBooleanField(term33272, term33272.getClass(), "active", false);
        setField(term33272, term33272.getClass(), "smfid", "SVWcOAHiTp");
        setField(term33272, term33272.getClass(), "stepNumber", term33286);
        setField(term33272, term33272.getClass(), "owner", "oShLCaneoQ");
        setField(term33272, term33272.getClass(), "programName", "nwKkzNpzyC");
        setField(term33272, term33272.getClass(), "stepName", "CwrsdYnHpH");
        setField(term33272, term33272.getClass(), "pathName", "jifjXNXluS");
        setField(term33272, term33272.getClass(), "procStepName", "uDayZDXPOP");
        setField(term33272, term33272.getClass(), "completion", "kbjWxMAIhY");
        setElement(term33183, 1, term33272);
        setBooleanField(term33360, term33360.getClass(), "active", false);
        setField(term33360, term33360.getClass(), "smfid", "GmtlSgqKcI");
        setField(term33360, term33360.getClass(), "stepNumber", term33374);
        setField(term33360, term33360.getClass(), "owner", "ssSbvPoMjB");
        setField(term33360, term33360.getClass(), "programName", "mhRVADhaKm");
        setField(term33360, term33360.getClass(), "stepName", "rLldJrTAay");
        setField(term33360, term33360.getClass(), "pathName", "HvSKssbEES");
        setField(term33360, term33360.getClass(), "procStepName", "UjIAQAHhul");
        setField(term33360, term33360.getClass(), "completion", "oWBXOvjPUT");
        setElement(term33183, 2, term33360);
        setField(term33086, term33086.getClass(), "stepData", term33183);
        setField(term33086, term33086.getClass(), "url", "DcKqrrTdId");
        setField(term33086, term33086.getClass(), "filesUrl", "fwtOJhjXbW");
        setField(term33086, term33086.getClass(), "jobCorrelator", "ltWBKZaXwJ");
        setField(term33086, term33086.getClass(), "phase", term33484);
        setField(term33086, term33086.getClass(), "phaseName", "FSQpgxQnsH");
        setField(term33086, term33086.getClass(), "execSystem", "LBPwnVMEpP");
        setField(term33086, term33086.getClass(), "execMember", "cwALzyQVjH");
        setField(term33086, term33086.getClass(), "execSubmitted", "jlYNjpdkoz");
        setField(term33086, term33086.getClass(), "execStarted", "DZAGnhJkeU");
        setField(term33086, term33086.getClass(), "execEnded", "xQuVexkiVz");
        setField(term33086, term33086.getClass(), "reasonNotRunning", "LqNgPziYtv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wiDfuaXnrP";
        callMethod(klass, "status", argTypes, term33086, args);
    }

};


