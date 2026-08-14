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

public class Job_Builder_url_11845637310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39283;

    public Job_Builder_url_11845637310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39395 = new Long(3666226122807672448L);
        Long term39483 = new Long(3108750145697087661L);
        Long term39571 = new Long(3752337209837437327L);
        Long term39659 = new Long(1860789353508856614L);
        Long term39747 = new Long(-7456852906235966771L);
        Long term39857 = new Long(-67485388932970712L);
        term39283 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term39380 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term39381 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term39469 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term39557 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term39645 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term39733 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term39283, term39283.getClass(), "jobId", "pkQiBgYrkQ");
        setField(term39283, term39283.getClass(), "jobName", "SJLRFsNagf");
        setField(term39283, term39283.getClass(), "subSystem", "UsCZaSgXzI");
        setField(term39283, term39283.getClass(), "owner", "IXZCeVwvBM");
        setField(term39283, term39283.getClass(), "status", "ElTdyUVQYi");
        setField(term39283, term39283.getClass(), "type", "KkgJnxXxVl");
        setField(term39283, term39283.getClass(), "classs", "TGnzPlGFMb");
        setField(term39283, term39283.getClass(), "retCode", "yEvLMSpdHy");
        setBooleanField(term39381, term39381.getClass(), "active", true);
        setField(term39381, term39381.getClass(), "smfid", "qdErlZeTVv");
        setField(term39381, term39381.getClass(), "stepNumber", term39395);
        setField(term39381, term39381.getClass(), "owner", "OCCDQbndDE");
        setField(term39381, term39381.getClass(), "programName", "NMANMKfctU");
        setField(term39381, term39381.getClass(), "stepName", "mQsaqUltLU");
        setField(term39381, term39381.getClass(), "pathName", "jwENwZiGlR");
        setField(term39381, term39381.getClass(), "procStepName", "rfFHGPcfpz");
        setField(term39381, term39381.getClass(), "completion", "fViQeyMrrL");
        setElement(term39380, 0, term39381);
        setBooleanField(term39469, term39469.getClass(), "active", false);
        setField(term39469, term39469.getClass(), "smfid", "zzeaToyLmI");
        setField(term39469, term39469.getClass(), "stepNumber", term39483);
        setField(term39469, term39469.getClass(), "owner", "sKYWhmRMLx");
        setField(term39469, term39469.getClass(), "programName", "SOJpgWUZCf");
        setField(term39469, term39469.getClass(), "stepName", "jgywFOzBDw");
        setField(term39469, term39469.getClass(), "pathName", "yKIXLtCWYi");
        setField(term39469, term39469.getClass(), "procStepName", "EhuyRKrUJu");
        setField(term39469, term39469.getClass(), "completion", "UlBxuoBXcJ");
        setElement(term39380, 1, term39469);
        setBooleanField(term39557, term39557.getClass(), "active", false);
        setField(term39557, term39557.getClass(), "smfid", "PqduvNFXXw");
        setField(term39557, term39557.getClass(), "stepNumber", term39571);
        setField(term39557, term39557.getClass(), "owner", "bMQrxvaBAI");
        setField(term39557, term39557.getClass(), "programName", "StFtysZlWm");
        setField(term39557, term39557.getClass(), "stepName", "CoqUcmjnkF");
        setField(term39557, term39557.getClass(), "pathName", "oOrXvGaFwa");
        setField(term39557, term39557.getClass(), "procStepName", "KJSTLGsSvO");
        setField(term39557, term39557.getClass(), "completion", "kSkiIpaepq");
        setElement(term39380, 2, term39557);
        setBooleanField(term39645, term39645.getClass(), "active", false);
        setField(term39645, term39645.getClass(), "smfid", "FzJhDecyvI");
        setField(term39645, term39645.getClass(), "stepNumber", term39659);
        setField(term39645, term39645.getClass(), "owner", "zOxseYMSdY");
        setField(term39645, term39645.getClass(), "programName", "jEKlkqpHMQ");
        setField(term39645, term39645.getClass(), "stepName", "QpEVWispEh");
        setField(term39645, term39645.getClass(), "pathName", "STofGrqXqL");
        setField(term39645, term39645.getClass(), "procStepName", "IoRhBfdSuN");
        setField(term39645, term39645.getClass(), "completion", "JGdxVjQzts");
        setElement(term39380, 3, term39645);
        setBooleanField(term39733, term39733.getClass(), "active", true);
        setField(term39733, term39733.getClass(), "smfid", "jEdjRikQtN");
        setField(term39733, term39733.getClass(), "stepNumber", term39747);
        setField(term39733, term39733.getClass(), "owner", "fSNUaokVWs");
        setField(term39733, term39733.getClass(), "programName", "dTxnMmHoVm");
        setField(term39733, term39733.getClass(), "stepName", "iswxaQUQgT");
        setField(term39733, term39733.getClass(), "pathName", "MxUSQqhNse");
        setField(term39733, term39733.getClass(), "procStepName", "skwxdosvQV");
        setField(term39733, term39733.getClass(), "completion", "DBYTggnCkD");
        setElement(term39380, 4, term39733);
        setField(term39283, term39283.getClass(), "stepData", term39380);
        setField(term39283, term39283.getClass(), "url", "RyXrJxJQiY");
        setField(term39283, term39283.getClass(), "filesUrl", "JfnQeTdzWs");
        setField(term39283, term39283.getClass(), "jobCorrelator", "HGhGqMiMOk");
        setField(term39283, term39283.getClass(), "phase", term39857);
        setField(term39283, term39283.getClass(), "phaseName", "VtTzFdKpZI");
        setField(term39283, term39283.getClass(), "execSystem", "yCqQIOXRXO");
        setField(term39283, term39283.getClass(), "execMember", "aevLPMVcYW");
        setField(term39283, term39283.getClass(), "execSubmitted", "orHcHVrwHz");
        setField(term39283, term39283.getClass(), "execStarted", "mkEWcQdwUn");
        setField(term39283, term39283.getClass(), "execEnded", "VRjVlzFSIx");
        setField(term39283, term39283.getClass(), "reasonNotRunning", "fNlDLqQZFT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "szCfpoTDXX";
        callMethod(klass, "url", argTypes, term39283, args);
    }

};


