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

public class Job_Builder_stepData_13912028029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37618;
     Object term38366;

    public Job_Builder_stepData_13912028029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37730 = new Long(21047099434645581L);
        Long term37818 = new Long(-8862087040734407227L);
        Long term37906 = new Long(-6394943900800506753L);
        Long term37994 = new Long(-4867941246533901410L);
        Long term38082 = new Long(1044883697493326351L);
        Long term38170 = new Long(-7406618974062419277L);
        Long term38280 = new Long(868503089567085985L);
        term37618 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term37715 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term37716 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term37804 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term37892 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term37980 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term38068 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term38156 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term37618, term37618.getClass(), "jobId", "vsqwOLpDjj");
        setField(term37618, term37618.getClass(), "jobName", "rJgXQRsPCl");
        setField(term37618, term37618.getClass(), "subSystem", "RgqpoBknjN");
        setField(term37618, term37618.getClass(), "owner", "nUDhadopHE");
        setField(term37618, term37618.getClass(), "status", "vLrTnQTIPg");
        setField(term37618, term37618.getClass(), "type", "GsXvLZCFtf");
        setField(term37618, term37618.getClass(), "classs", "JqSCTBGSUs");
        setField(term37618, term37618.getClass(), "retCode", "bZrrPiMnsr");
        setBooleanField(term37716, term37716.getClass(), "active", false);
        setField(term37716, term37716.getClass(), "smfid", "IeromvfDmz");
        setField(term37716, term37716.getClass(), "stepNumber", term37730);
        setField(term37716, term37716.getClass(), "owner", "xJLHPTRSqe");
        setField(term37716, term37716.getClass(), "programName", "OIFZYdbUZz");
        setField(term37716, term37716.getClass(), "stepName", "FPablxseTr");
        setField(term37716, term37716.getClass(), "pathName", "wNndrIQDbr");
        setField(term37716, term37716.getClass(), "procStepName", "JiSIFtJnYv");
        setField(term37716, term37716.getClass(), "completion", "wxAHQRVgKc");
        setElement(term37715, 0, term37716);
        setBooleanField(term37804, term37804.getClass(), "active", true);
        setField(term37804, term37804.getClass(), "smfid", "bYsZEHeoeV");
        setField(term37804, term37804.getClass(), "stepNumber", term37818);
        setField(term37804, term37804.getClass(), "owner", "IwvwrQylib");
        setField(term37804, term37804.getClass(), "programName", "ZWJgSttNjg");
        setField(term37804, term37804.getClass(), "stepName", "LQTIjJLkXH");
        setField(term37804, term37804.getClass(), "pathName", "RvkBwedFKx");
        setField(term37804, term37804.getClass(), "procStepName", "DYzWJljbaE");
        setField(term37804, term37804.getClass(), "completion", "idwbHVHUcz");
        setElement(term37715, 1, term37804);
        setBooleanField(term37892, term37892.getClass(), "active", true);
        setField(term37892, term37892.getClass(), "smfid", "sWJHIWZMuX");
        setField(term37892, term37892.getClass(), "stepNumber", term37906);
        setField(term37892, term37892.getClass(), "owner", "PwMdJRwzDW");
        setField(term37892, term37892.getClass(), "programName", "sMiHxgXUuN");
        setField(term37892, term37892.getClass(), "stepName", "oVChCWWDag");
        setField(term37892, term37892.getClass(), "pathName", "EteTxkDxin");
        setField(term37892, term37892.getClass(), "procStepName", "mKgLwPdYbY");
        setField(term37892, term37892.getClass(), "completion", "zqykonsLIo");
        setElement(term37715, 2, term37892);
        setBooleanField(term37980, term37980.getClass(), "active", true);
        setField(term37980, term37980.getClass(), "smfid", "KoPzTuvIeK");
        setField(term37980, term37980.getClass(), "stepNumber", term37994);
        setField(term37980, term37980.getClass(), "owner", "SMoWUILIhn");
        setField(term37980, term37980.getClass(), "programName", "SvSKSCjgTM");
        setField(term37980, term37980.getClass(), "stepName", "UFxnRbWtog");
        setField(term37980, term37980.getClass(), "pathName", "NSxzAUSujy");
        setField(term37980, term37980.getClass(), "procStepName", "FEezgglqXC");
        setField(term37980, term37980.getClass(), "completion", "rvYqMRgiPA");
        setElement(term37715, 3, term37980);
        setBooleanField(term38068, term38068.getClass(), "active", false);
        setField(term38068, term38068.getClass(), "smfid", "qOZXeUUmdz");
        setField(term38068, term38068.getClass(), "stepNumber", term38082);
        setField(term38068, term38068.getClass(), "owner", "FCovVZHqPx");
        setField(term38068, term38068.getClass(), "programName", "jSTBfkWjge");
        setField(term38068, term38068.getClass(), "stepName", "uKYhZULSHp");
        setField(term38068, term38068.getClass(), "pathName", "xdYuLllgpn");
        setField(term38068, term38068.getClass(), "procStepName", "ayonlqalLA");
        setField(term38068, term38068.getClass(), "completion", "fzzIOVxKdF");
        setElement(term37715, 4, term38068);
        setBooleanField(term38156, term38156.getClass(), "active", true);
        setField(term38156, term38156.getClass(), "smfid", "cdvmxZaBEK");
        setField(term38156, term38156.getClass(), "stepNumber", term38170);
        setField(term38156, term38156.getClass(), "owner", "QHYZiyDyPC");
        setField(term38156, term38156.getClass(), "programName", "kcHMyiheuH");
        setField(term38156, term38156.getClass(), "stepName", "DGMBBNDEYs");
        setField(term38156, term38156.getClass(), "pathName", "vpuKZSMmKQ");
        setField(term38156, term38156.getClass(), "procStepName", "IXQQwaXITf");
        setField(term38156, term38156.getClass(), "completion", "fNzFTiRCjp");
        setElement(term37715, 5, term38156);
        setField(term37618, term37618.getClass(), "stepData", term37715);
        setField(term37618, term37618.getClass(), "url", "yaCGGogKro");
        setField(term37618, term37618.getClass(), "filesUrl", "qxrRUnjshF");
        setField(term37618, term37618.getClass(), "jobCorrelator", "WmVcapKAeJ");
        setField(term37618, term37618.getClass(), "phase", term38280);
        setField(term37618, term37618.getClass(), "phaseName", "jevOVdQdpc");
        setField(term37618, term37618.getClass(), "execSystem", "TLLVSGTNsz");
        setField(term37618, term37618.getClass(), "execMember", "mbBWfaHCrP");
        setField(term37618, term37618.getClass(), "execSubmitted", "wFyiZloCxg");
        setField(term37618, term37618.getClass(), "execStarted", "xYztJEIPWy");
        setField(term37618, term37618.getClass(), "execEnded", "TDQIAXaJru");
        setField(term37618, term37618.getClass(), "reasonNotRunning", "frPMFqGmrE");
        Long term38381 = new Long(-3277773415369003529L);
        Long term38469 = new Long(1253549421411622358L);
        term38366 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term38367 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term38455 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term38367, term38367.getClass(), "active", false);
        setField(term38367, term38367.getClass(), "smfid", "DvfOYWcNBN");
        setField(term38367, term38367.getClass(), "stepNumber", term38381);
        setField(term38367, term38367.getClass(), "owner", "cvbvwpPlNk");
        setField(term38367, term38367.getClass(), "programName", "uCdLbhvYeG");
        setField(term38367, term38367.getClass(), "stepName", "ipoyEHBfoG");
        setField(term38367, term38367.getClass(), "pathName", "iSBTpbiteU");
        setField(term38367, term38367.getClass(), "procStepName", "MTwFbEoMZj");
        setField(term38367, term38367.getClass(), "completion", "uEQbnHbyAn");
        setElement(term38366, 0, term38367);
        setBooleanField(term38455, term38455.getClass(), "active", false);
        setField(term38455, term38455.getClass(), "smfid", "JpFIuyNEKW");
        setField(term38455, term38455.getClass(), "stepNumber", term38469);
        setField(term38455, term38455.getClass(), "owner", "NksHsgcqDx");
        setField(term38455, term38455.getClass(), "programName", "RjSNvOEvcT");
        setField(term38455, term38455.getClass(), "stepName", "HLzuMxigqS");
        setField(term38455, term38455.getClass(), "pathName", "wiBOoDCyzd");
        setField(term38455, term38455.getClass(), "procStepName", "TIaFKUJELS");
        setField(term38455, term38455.getClass(), "completion", "IPmndzGjtG");
        setElement(term38366, 1, term38455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term38366;
        callMethod(klass, "stepData", argTypes, term37618, args);
    }

};


