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

public class Job_getReasonNotRunning_139334982924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25991;

    public Job_getReasonNotRunning_139334982924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26103 = new Long(-6100012593724108983L);
        Long term26213 = new Long(5465527210299101732L);
        term25991 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term26088 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 1);
        Object term26089 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term25991, term25991.getClass(), "jobId", "NNkIIFpxiB");
        setField(term25991, term25991.getClass(), "jobName", "sBmtvFPDso");
        setField(term25991, term25991.getClass(), "subSystem", "qsUIxrLolr");
        setField(term25991, term25991.getClass(), "owner", "IlQxArYcgB");
        setField(term25991, term25991.getClass(), "status", "lIgKCvCuoH");
        setField(term25991, term25991.getClass(), "type", "dHuWgRwLOm");
        setField(term25991, term25991.getClass(), "classs", "PsTQDxNIld");
        setField(term25991, term25991.getClass(), "retCode", "uoBijJjvaj");
        setBooleanField(term26089, term26089.getClass(), "active", true);
        setField(term26089, term26089.getClass(), "smfid", "BdsLFSRWda");
        setField(term26089, term26089.getClass(), "stepNumber", term26103);
        setField(term26089, term26089.getClass(), "owner", "tMhhBYonAI");
        setField(term26089, term26089.getClass(), "programName", "AaQRshwIQC");
        setField(term26089, term26089.getClass(), "stepName", "rHgKCfgCsg");
        setField(term26089, term26089.getClass(), "pathName", "AWtIUOuutt");
        setField(term26089, term26089.getClass(), "procStepName", "jBgJZpHifl");
        setField(term26089, term26089.getClass(), "completion", "azMTTmEXnh");
        setElement(term26088, 0, term26089);
        setField(term25991, term25991.getClass(), "stepData", term26088);
        setField(term25991, term25991.getClass(), "url", "BjJtxwsIpt");
        setField(term25991, term25991.getClass(), "filesUrl", "gUQhOyGfzF");
        setField(term25991, term25991.getClass(), "jobCorrelator", "IqDObvPBZX");
        setField(term25991, term25991.getClass(), "phase", term26213);
        setField(term25991, term25991.getClass(), "phaseName", "NITCrIISoC");
        setField(term25991, term25991.getClass(), "execSystem", "nSzzeexTDI");
        setField(term25991, term25991.getClass(), "execMember", "WBrpvMhmsz");
        setField(term25991, term25991.getClass(), "execSubmitted", "ZzqRHVEXcM");
        setField(term25991, term25991.getClass(), "execStarted", "YYwIEARNxi");
        setField(term25991, term25991.getClass(), "execEnded", "rblXBUdTFc");
        setField(term25991, term25991.getClass(), "reasonNotRunning", "rbsXSOJFKW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReasonNotRunning", argTypes, term25991, args);
    }

};


