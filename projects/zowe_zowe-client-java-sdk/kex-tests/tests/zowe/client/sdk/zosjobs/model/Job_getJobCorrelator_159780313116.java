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

public class Job_getJobCorrelator_159780313116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18999;

    public Job_getJobCorrelator_159780313116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19111 = new Long(-6587807377747738663L);
        Long term19199 = new Long(-6301101997917060727L);
        Long term19309 = new Long(8166095254618543564L);
        term18999 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term19096 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term19097 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term19185 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term18999, term18999.getClass(), "jobId", "pLvkKHqNYX");
        setField(term18999, term18999.getClass(), "jobName", "PwqnuJJwjR");
        setField(term18999, term18999.getClass(), "subSystem", "NFkbBiPeiw");
        setField(term18999, term18999.getClass(), "owner", "tlRvilQyjJ");
        setField(term18999, term18999.getClass(), "status", "gwTUlYNpjM");
        setField(term18999, term18999.getClass(), "type", "uXYojRmxrM");
        setField(term18999, term18999.getClass(), "classs", "cxRwRcodud");
        setField(term18999, term18999.getClass(), "retCode", "GDGBPlYeLn");
        setBooleanField(term19097, term19097.getClass(), "active", true);
        setField(term19097, term19097.getClass(), "smfid", "jdQANIXSTq");
        setField(term19097, term19097.getClass(), "stepNumber", term19111);
        setField(term19097, term19097.getClass(), "owner", "stVcZLTNpu");
        setField(term19097, term19097.getClass(), "programName", "LgXdqWrsLL");
        setField(term19097, term19097.getClass(), "stepName", "bbHWyibNmy");
        setField(term19097, term19097.getClass(), "pathName", "vYYOYhWMWZ");
        setField(term19097, term19097.getClass(), "procStepName", "FLQJOzEXff");
        setField(term19097, term19097.getClass(), "completion", "qlaIVJBSfQ");
        setElement(term19096, 0, term19097);
        setBooleanField(term19185, term19185.getClass(), "active", true);
        setField(term19185, term19185.getClass(), "smfid", "lYvIWBFFsq");
        setField(term19185, term19185.getClass(), "stepNumber", term19199);
        setField(term19185, term19185.getClass(), "owner", "tThwsqWKcE");
        setField(term19185, term19185.getClass(), "programName", "bkSgsDrkCN");
        setField(term19185, term19185.getClass(), "stepName", "hwjlcimgJH");
        setField(term19185, term19185.getClass(), "pathName", "TLxQzxvizR");
        setField(term19185, term19185.getClass(), "procStepName", "uUgJfKAzDM");
        setField(term19185, term19185.getClass(), "completion", "gZPZNkweEp");
        setElement(term19096, 1, term19185);
        setField(term18999, term18999.getClass(), "stepData", term19096);
        setField(term18999, term18999.getClass(), "url", "vfennwtmqe");
        setField(term18999, term18999.getClass(), "filesUrl", "zZxoNkohbw");
        setField(term18999, term18999.getClass(), "jobCorrelator", "DQrjPcLysX");
        setField(term18999, term18999.getClass(), "phase", term19309);
        setField(term18999, term18999.getClass(), "phaseName", "VWPFyrpmmb");
        setField(term18999, term18999.getClass(), "execSystem", "gYYKrIeThw");
        setField(term18999, term18999.getClass(), "execMember", "UsxeLMVkAK");
        setField(term18999, term18999.getClass(), "execSubmitted", "ITrhiKKzcb");
        setField(term18999, term18999.getClass(), "execStarted", "qMKmSzOQXg");
        setField(term18999, term18999.getClass(), "execEnded", "CURQCMkqbZ");
        setField(term18999, term18999.getClass(), "reasonNotRunning", "VZwkkQktrm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobCorrelator", argTypes, term18999, args);
    }

};


