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

public class Job_getFilesUrl_211109321915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17809;

    public Job_getFilesUrl_211109321915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17921 = new Long(8802866251294305945L);
        Long term18009 = new Long(4513004407927379358L);
        Long term18097 = new Long(-7115418542247301000L);
        Long term18185 = new Long(8034714140377562739L);
        Long term18273 = new Long(-2924531382671518368L);
        Long term18383 = new Long(-3948863953565024517L);
        term17809 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term17906 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term17907 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term17995 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term18083 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term18171 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term18259 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term17809, term17809.getClass(), "jobId", "eWnrMSbYbT");
        setField(term17809, term17809.getClass(), "jobName", "AjoFvDFyCY");
        setField(term17809, term17809.getClass(), "subSystem", "OFTJwdPiTG");
        setField(term17809, term17809.getClass(), "owner", "QiUprSEluR");
        setField(term17809, term17809.getClass(), "status", "cDOXXottZh");
        setField(term17809, term17809.getClass(), "type", "rfqJDkDppz");
        setField(term17809, term17809.getClass(), "classs", "MGorMVGauT");
        setField(term17809, term17809.getClass(), "retCode", "jXKxUGTuEF");
        setBooleanField(term17907, term17907.getClass(), "active", false);
        setField(term17907, term17907.getClass(), "smfid", "nDCcyhiTnS");
        setField(term17907, term17907.getClass(), "stepNumber", term17921);
        setField(term17907, term17907.getClass(), "owner", "Bcivwcjece");
        setField(term17907, term17907.getClass(), "programName", "QTefjRuiez");
        setField(term17907, term17907.getClass(), "stepName", "SQZVNkAVBB");
        setField(term17907, term17907.getClass(), "pathName", "mrSAYJlddZ");
        setField(term17907, term17907.getClass(), "procStepName", "KbwxawvYsw");
        setField(term17907, term17907.getClass(), "completion", "gvjdfHNzOa");
        setElement(term17906, 0, term17907);
        setBooleanField(term17995, term17995.getClass(), "active", true);
        setField(term17995, term17995.getClass(), "smfid", "HqitWglYWX");
        setField(term17995, term17995.getClass(), "stepNumber", term18009);
        setField(term17995, term17995.getClass(), "owner", "pOuFRlHmbK");
        setField(term17995, term17995.getClass(), "programName", "WrzdBkinqV");
        setField(term17995, term17995.getClass(), "stepName", "vydWXHfFTw");
        setField(term17995, term17995.getClass(), "pathName", "DRhkpDneCC");
        setField(term17995, term17995.getClass(), "procStepName", "vuIJRrypuA");
        setField(term17995, term17995.getClass(), "completion", "AxfSZmaiyA");
        setElement(term17906, 1, term17995);
        setBooleanField(term18083, term18083.getClass(), "active", true);
        setField(term18083, term18083.getClass(), "smfid", "lBpveIKbea");
        setField(term18083, term18083.getClass(), "stepNumber", term18097);
        setField(term18083, term18083.getClass(), "owner", "uyLBVQYcOV");
        setField(term18083, term18083.getClass(), "programName", "PoTZjDuBHa");
        setField(term18083, term18083.getClass(), "stepName", "MIwvgVrhzP");
        setField(term18083, term18083.getClass(), "pathName", "HcUUieXdep");
        setField(term18083, term18083.getClass(), "procStepName", "AbonCTtbef");
        setField(term18083, term18083.getClass(), "completion", "maXrGOGoKA");
        setElement(term17906, 2, term18083);
        setBooleanField(term18171, term18171.getClass(), "active", false);
        setField(term18171, term18171.getClass(), "smfid", "zAkgWQVCpM");
        setField(term18171, term18171.getClass(), "stepNumber", term18185);
        setField(term18171, term18171.getClass(), "owner", "yQUDyOroXU");
        setField(term18171, term18171.getClass(), "programName", "xweqkPdyJH");
        setField(term18171, term18171.getClass(), "stepName", "kwteHWzwcc");
        setField(term18171, term18171.getClass(), "pathName", "uMsWXqNhln");
        setField(term18171, term18171.getClass(), "procStepName", "MAnhIPOtHL");
        setField(term18171, term18171.getClass(), "completion", "dikKjYjmRO");
        setElement(term17906, 3, term18171);
        setBooleanField(term18259, term18259.getClass(), "active", false);
        setField(term18259, term18259.getClass(), "smfid", "GJnnMDVnEP");
        setField(term18259, term18259.getClass(), "stepNumber", term18273);
        setField(term18259, term18259.getClass(), "owner", "zSMVllDpfk");
        setField(term18259, term18259.getClass(), "programName", "iptRXVDoYE");
        setField(term18259, term18259.getClass(), "stepName", "kucsxnvbES");
        setField(term18259, term18259.getClass(), "pathName", "IdGzDFfcZf");
        setField(term18259, term18259.getClass(), "procStepName", "KDdRNhZmnU");
        setField(term18259, term18259.getClass(), "completion", "iMsqJaKlDC");
        setElement(term17906, 4, term18259);
        setField(term17809, term17809.getClass(), "stepData", term17906);
        setField(term17809, term17809.getClass(), "url", "aPkGHbZyjj");
        setField(term17809, term17809.getClass(), "filesUrl", "nSWdsVyJRI");
        setField(term17809, term17809.getClass(), "jobCorrelator", "JBOPGgGKnc");
        setField(term17809, term17809.getClass(), "phase", term18383);
        setField(term17809, term17809.getClass(), "phaseName", "GlPTiCMCGP");
        setField(term17809, term17809.getClass(), "execSystem", "jlcBpLoWfd");
        setField(term17809, term17809.getClass(), "execMember", "oYymmLqbfJ");
        setField(term17809, term17809.getClass(), "execSubmitted", "YaDWphDOSz");
        setField(term17809, term17809.getClass(), "execStarted", "nnnmCgFBLw");
        setField(term17809, term17809.getClass(), "execEnded", "hSSCyNEhyH");
        setField(term17809, term17809.getClass(), "reasonNotRunning", "jDFNSuvZqm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilesUrl", argTypes, term17809, args);
    }

};


