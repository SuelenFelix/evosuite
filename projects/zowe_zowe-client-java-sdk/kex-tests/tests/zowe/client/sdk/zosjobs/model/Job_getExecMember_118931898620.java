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

public class Job_getExecMember_118931898620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21547;

    public Job_getExecMember_118931898620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21659 = new Long(-8603648071751666348L);
        Long term21747 = new Long(-7884871963229073324L);
        Long term21857 = new Long(-8649738738252714180L);
        term21547 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term21644 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term21645 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term21733 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term21547, term21547.getClass(), "jobId", "fkzRpxlAqS");
        setField(term21547, term21547.getClass(), "jobName", "VYvbTGKslj");
        setField(term21547, term21547.getClass(), "subSystem", "owLqDDnwZA");
        setField(term21547, term21547.getClass(), "owner", "eBcTbweeYp");
        setField(term21547, term21547.getClass(), "status", "drcmjfQUDq");
        setField(term21547, term21547.getClass(), "type", "GjdWUoUSyA");
        setField(term21547, term21547.getClass(), "classs", "YEkxWsWaUl");
        setField(term21547, term21547.getClass(), "retCode", "RINhPkhhct");
        setBooleanField(term21645, term21645.getClass(), "active", false);
        setField(term21645, term21645.getClass(), "smfid", "vjNPcTSqmS");
        setField(term21645, term21645.getClass(), "stepNumber", term21659);
        setField(term21645, term21645.getClass(), "owner", "fFhdWuJbdC");
        setField(term21645, term21645.getClass(), "programName", "JlgLIHPabR");
        setField(term21645, term21645.getClass(), "stepName", "LHnkeoNwHq");
        setField(term21645, term21645.getClass(), "pathName", "gVnDVbSyKa");
        setField(term21645, term21645.getClass(), "procStepName", "kdCYNMSuoD");
        setField(term21645, term21645.getClass(), "completion", "eRYlSLwtvV");
        setElement(term21644, 0, term21645);
        setBooleanField(term21733, term21733.getClass(), "active", false);
        setField(term21733, term21733.getClass(), "smfid", "duOyJsARTD");
        setField(term21733, term21733.getClass(), "stepNumber", term21747);
        setField(term21733, term21733.getClass(), "owner", "xPnOHsNlyc");
        setField(term21733, term21733.getClass(), "programName", "OTSPWPJefj");
        setField(term21733, term21733.getClass(), "stepName", "EOTYMqXRmE");
        setField(term21733, term21733.getClass(), "pathName", "iTxNduwSjE");
        setField(term21733, term21733.getClass(), "procStepName", "MQUTfIiFnh");
        setField(term21733, term21733.getClass(), "completion", "JeyKRznnft");
        setElement(term21644, 1, term21733);
        setField(term21547, term21547.getClass(), "stepData", term21644);
        setField(term21547, term21547.getClass(), "url", "vQJUCtuYpK");
        setField(term21547, term21547.getClass(), "filesUrl", "GHtOeztAdz");
        setField(term21547, term21547.getClass(), "jobCorrelator", "gSAtqakaLY");
        setField(term21547, term21547.getClass(), "phase", term21857);
        setField(term21547, term21547.getClass(), "phaseName", "taPBiMFNEZ");
        setField(term21547, term21547.getClass(), "execSystem", "NoAFAfGyYL");
        setField(term21547, term21547.getClass(), "execMember", "MFtfkBMyOD");
        setField(term21547, term21547.getClass(), "execSubmitted", "rdiIyXfRtL");
        setField(term21547, term21547.getClass(), "execStarted", "douzkltmiI");
        setField(term21547, term21547.getClass(), "execEnded", "MFKjhvLtpe");
        setField(term21547, term21547.getClass(), "reasonNotRunning", "xpbLKEsput");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecMember", argTypes, term21547, args);
    }

};


