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

public class Job_Builder_execEnded_51212069919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49381;

    public Job_Builder_execEnded_51212069919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49493 = new Long(7735460540091431012L);
        Long term49581 = new Long(1346299551708610248L);
        Long term49669 = new Long(-7191625829563442696L);
        Long term49757 = new Long(1463379874413441830L);
        Long term49845 = new Long(7998051124369147543L);
        Long term49933 = new Long(-1481367303699139651L);
        Long term50043 = new Long(-7709317346333670618L);
        term49381 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term49478 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term49479 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term49567 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term49655 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term49743 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term49831 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term49919 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term49381, term49381.getClass(), "jobId", "kAbILlhsZw");
        setField(term49381, term49381.getClass(), "jobName", "QsIOCSpRow");
        setField(term49381, term49381.getClass(), "subSystem", "gcFzvYOUch");
        setField(term49381, term49381.getClass(), "owner", "NnFSMXLOUA");
        setField(term49381, term49381.getClass(), "status", "bacruLIvDW");
        setField(term49381, term49381.getClass(), "type", "ydbVEuslYx");
        setField(term49381, term49381.getClass(), "classs", "DKWEhukBpG");
        setField(term49381, term49381.getClass(), "retCode", "YaowqyqxBH");
        setBooleanField(term49479, term49479.getClass(), "active", true);
        setField(term49479, term49479.getClass(), "smfid", "dbxhsKyZWZ");
        setField(term49479, term49479.getClass(), "stepNumber", term49493);
        setField(term49479, term49479.getClass(), "owner", "oXxafKyyrx");
        setField(term49479, term49479.getClass(), "programName", "TapDFGQNLY");
        setField(term49479, term49479.getClass(), "stepName", "vgHeAegSfV");
        setField(term49479, term49479.getClass(), "pathName", "qShfKMgKGs");
        setField(term49479, term49479.getClass(), "procStepName", "bLCaDnEUyS");
        setField(term49479, term49479.getClass(), "completion", "yfHcOCDrGy");
        setElement(term49478, 0, term49479);
        setBooleanField(term49567, term49567.getClass(), "active", true);
        setField(term49567, term49567.getClass(), "smfid", "juKqILstcn");
        setField(term49567, term49567.getClass(), "stepNumber", term49581);
        setField(term49567, term49567.getClass(), "owner", "QSCQJRyiPa");
        setField(term49567, term49567.getClass(), "programName", "jPPOVoAOLQ");
        setField(term49567, term49567.getClass(), "stepName", "kZKzEkUFFI");
        setField(term49567, term49567.getClass(), "pathName", "dnYvoLZjCf");
        setField(term49567, term49567.getClass(), "procStepName", "ZsvLlzqETk");
        setField(term49567, term49567.getClass(), "completion", "DqrZwuHriF");
        setElement(term49478, 1, term49567);
        setBooleanField(term49655, term49655.getClass(), "active", true);
        setField(term49655, term49655.getClass(), "smfid", "daaMmTkwOR");
        setField(term49655, term49655.getClass(), "stepNumber", term49669);
        setField(term49655, term49655.getClass(), "owner", "WfJKDOFrUv");
        setField(term49655, term49655.getClass(), "programName", "CbwfWaINrF");
        setField(term49655, term49655.getClass(), "stepName", "AVCzSfXhGU");
        setField(term49655, term49655.getClass(), "pathName", "nTUCmQGFDE");
        setField(term49655, term49655.getClass(), "procStepName", "rfFTBanxEx");
        setField(term49655, term49655.getClass(), "completion", "MQJTCGewxT");
        setElement(term49478, 2, term49655);
        setBooleanField(term49743, term49743.getClass(), "active", false);
        setField(term49743, term49743.getClass(), "smfid", "DRdgywxCcP");
        setField(term49743, term49743.getClass(), "stepNumber", term49757);
        setField(term49743, term49743.getClass(), "owner", "uelmUHzwnS");
        setField(term49743, term49743.getClass(), "programName", "iKuSKqVzvy");
        setField(term49743, term49743.getClass(), "stepName", "SgyGAlytLF");
        setField(term49743, term49743.getClass(), "pathName", "OoXopVvpwr");
        setField(term49743, term49743.getClass(), "procStepName", "lwwreKJCFL");
        setField(term49743, term49743.getClass(), "completion", "PWBggYjpOQ");
        setElement(term49478, 3, term49743);
        setBooleanField(term49831, term49831.getClass(), "active", false);
        setField(term49831, term49831.getClass(), "smfid", "FDzNpfjYDI");
        setField(term49831, term49831.getClass(), "stepNumber", term49845);
        setField(term49831, term49831.getClass(), "owner", "vSbbcByIuA");
        setField(term49831, term49831.getClass(), "programName", "QSvdWzkkPx");
        setField(term49831, term49831.getClass(), "stepName", "vStdEtWvae");
        setField(term49831, term49831.getClass(), "pathName", "iApJWgnQkP");
        setField(term49831, term49831.getClass(), "procStepName", "kHKzzYJxiP");
        setField(term49831, term49831.getClass(), "completion", "INFnBrMIka");
        setElement(term49478, 4, term49831);
        setBooleanField(term49919, term49919.getClass(), "active", false);
        setField(term49919, term49919.getClass(), "smfid", "EwmpEgdvZs");
        setField(term49919, term49919.getClass(), "stepNumber", term49933);
        setField(term49919, term49919.getClass(), "owner", "vRjHouXWLC");
        setField(term49919, term49919.getClass(), "programName", "XghDInkWEe");
        setField(term49919, term49919.getClass(), "stepName", "zPDuGbsYGT");
        setField(term49919, term49919.getClass(), "pathName", "apnNoBOovC");
        setField(term49919, term49919.getClass(), "procStepName", "SyGIHWAumE");
        setField(term49919, term49919.getClass(), "completion", "bMQUwQqyMc");
        setElement(term49478, 5, term49919);
        setField(term49381, term49381.getClass(), "stepData", term49478);
        setField(term49381, term49381.getClass(), "url", "CVaGhXmAUN");
        setField(term49381, term49381.getClass(), "filesUrl", "KnclcuNYRb");
        setField(term49381, term49381.getClass(), "jobCorrelator", "UDZJbJPmCC");
        setField(term49381, term49381.getClass(), "phase", term50043);
        setField(term49381, term49381.getClass(), "phaseName", "oVkgUUfHis");
        setField(term49381, term49381.getClass(), "execSystem", "hoCKQzIOhx");
        setField(term49381, term49381.getClass(), "execMember", "znUxTdEvUD");
        setField(term49381, term49381.getClass(), "execSubmitted", "PvtJhtGffh");
        setField(term49381, term49381.getClass(), "execStarted", "KReGJTSQuY");
        setField(term49381, term49381.getClass(), "execEnded", "hqZmoXoMuS");
        setField(term49381, term49381.getClass(), "reasonNotRunning", "PUPJWadLXP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TBNsemBBKA";
        callMethod(klass, "execEnded", argTypes, term49381, args);
    }

};


