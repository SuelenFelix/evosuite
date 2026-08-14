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

public class Job_Builder_filesUrl_183580887611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40495;

    public Job_Builder_filesUrl_183580887611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40607 = new Long(5806367330808555223L);
        Long term40695 = new Long(4576699120365923235L);
        Long term40783 = new Long(-1635471392209071620L);
        Long term40893 = new Long(-4714000263923324167L);
        term40495 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term40592 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term40593 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term40681 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term40769 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term40495, term40495.getClass(), "jobId", "blnSDUyHkS");
        setField(term40495, term40495.getClass(), "jobName", "byyepwHlHN");
        setField(term40495, term40495.getClass(), "subSystem", "akVNsUcFra");
        setField(term40495, term40495.getClass(), "owner", "BKiHMTzLoY");
        setField(term40495, term40495.getClass(), "status", "arrHHpXCBD");
        setField(term40495, term40495.getClass(), "type", "zzfzxQYlis");
        setField(term40495, term40495.getClass(), "classs", "TJJQwVEzxz");
        setField(term40495, term40495.getClass(), "retCode", "kHtEHBrsFo");
        setBooleanField(term40593, term40593.getClass(), "active", true);
        setField(term40593, term40593.getClass(), "smfid", "EmAvkhGlPV");
        setField(term40593, term40593.getClass(), "stepNumber", term40607);
        setField(term40593, term40593.getClass(), "owner", "mBrbyQVzve");
        setField(term40593, term40593.getClass(), "programName", "FQODEbQeKa");
        setField(term40593, term40593.getClass(), "stepName", "iLsUPvsdys");
        setField(term40593, term40593.getClass(), "pathName", "zsglFxvzdp");
        setField(term40593, term40593.getClass(), "procStepName", "zhXtSGLnJR");
        setField(term40593, term40593.getClass(), "completion", "XlNXxsYNss");
        setElement(term40592, 0, term40593);
        setBooleanField(term40681, term40681.getClass(), "active", false);
        setField(term40681, term40681.getClass(), "smfid", "jheRZWjuaB");
        setField(term40681, term40681.getClass(), "stepNumber", term40695);
        setField(term40681, term40681.getClass(), "owner", "IERziToRSQ");
        setField(term40681, term40681.getClass(), "programName", "mDTRMwjBpc");
        setField(term40681, term40681.getClass(), "stepName", "sCLAuKoiVL");
        setField(term40681, term40681.getClass(), "pathName", "pFWiDEnVnU");
        setField(term40681, term40681.getClass(), "procStepName", "NeEetzFhTt");
        setField(term40681, term40681.getClass(), "completion", "UgvuvUxKed");
        setElement(term40592, 1, term40681);
        setBooleanField(term40769, term40769.getClass(), "active", true);
        setField(term40769, term40769.getClass(), "smfid", "ljBBMsQpaM");
        setField(term40769, term40769.getClass(), "stepNumber", term40783);
        setField(term40769, term40769.getClass(), "owner", "hHNIOlOzJc");
        setField(term40769, term40769.getClass(), "programName", "ALRSeULyWV");
        setField(term40769, term40769.getClass(), "stepName", "WVhzXHdyFF");
        setField(term40769, term40769.getClass(), "pathName", "GLAWYoxkyw");
        setField(term40769, term40769.getClass(), "procStepName", "cfpPTNNVnW");
        setField(term40769, term40769.getClass(), "completion", "VPkEFShMUB");
        setElement(term40592, 2, term40769);
        setField(term40495, term40495.getClass(), "stepData", term40592);
        setField(term40495, term40495.getClass(), "url", "ZIgHysIFcL");
        setField(term40495, term40495.getClass(), "filesUrl", "ofSfQtWBjp");
        setField(term40495, term40495.getClass(), "jobCorrelator", "vkbIpZOlcY");
        setField(term40495, term40495.getClass(), "phase", term40893);
        setField(term40495, term40495.getClass(), "phaseName", "XbAeosZekH");
        setField(term40495, term40495.getClass(), "execSystem", "EvGPvjswTz");
        setField(term40495, term40495.getClass(), "execMember", "lbnnCkEZgE");
        setField(term40495, term40495.getClass(), "execSubmitted", "YaWdTQZkTw");
        setField(term40495, term40495.getClass(), "execStarted", "QqsjlsXtmm");
        setField(term40495, term40495.getClass(), "execEnded", "FuWUjAYXxz");
        setField(term40495, term40495.getClass(), "reasonNotRunning", "rKIvvYydou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KNgeIkQoef";
        callMethod(klass, "filesUrl", argTypes, term40495, args);
    }

};


