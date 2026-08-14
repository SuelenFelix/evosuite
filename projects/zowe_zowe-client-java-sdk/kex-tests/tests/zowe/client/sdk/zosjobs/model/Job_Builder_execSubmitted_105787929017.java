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

public class Job_Builder_execSubmitted_105787929017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46641;

    public Job_Builder_execSubmitted_105787929017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46753 = new Long(6130232388739280211L);
        Long term46841 = new Long(3423965054378869855L);
        Long term46929 = new Long(-593735869267672817L);
        Long term47017 = new Long(6041374912351843923L);
        Long term47127 = new Long(2535970782317488741L);
        term46641 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term46738 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 4);
        Object term46739 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term46827 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term46915 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term47003 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term46641, term46641.getClass(), "jobId", "QjsqHrtVMY");
        setField(term46641, term46641.getClass(), "jobName", "PlQZGGhnZK");
        setField(term46641, term46641.getClass(), "subSystem", "sTtLCWDEPO");
        setField(term46641, term46641.getClass(), "owner", "UGMtNRjhnC");
        setField(term46641, term46641.getClass(), "status", "oTnPmmIphJ");
        setField(term46641, term46641.getClass(), "type", "vTgJolwQXF");
        setField(term46641, term46641.getClass(), "classs", "QuNSfeKtAH");
        setField(term46641, term46641.getClass(), "retCode", "vFhRdscfFA");
        setBooleanField(term46739, term46739.getClass(), "active", true);
        setField(term46739, term46739.getClass(), "smfid", "ZmfocrvaII");
        setField(term46739, term46739.getClass(), "stepNumber", term46753);
        setField(term46739, term46739.getClass(), "owner", "LTbQXrGKuA");
        setField(term46739, term46739.getClass(), "programName", "gzmGmDALUv");
        setField(term46739, term46739.getClass(), "stepName", "ZRoptBRTDM");
        setField(term46739, term46739.getClass(), "pathName", "vVVFChfeBQ");
        setField(term46739, term46739.getClass(), "procStepName", "aASfcqfBbh");
        setField(term46739, term46739.getClass(), "completion", "DwpOIkpRFT");
        setElement(term46738, 0, term46739);
        setBooleanField(term46827, term46827.getClass(), "active", false);
        setField(term46827, term46827.getClass(), "smfid", "LPlTDoLrUy");
        setField(term46827, term46827.getClass(), "stepNumber", term46841);
        setField(term46827, term46827.getClass(), "owner", "XETimBHIKG");
        setField(term46827, term46827.getClass(), "programName", "nOKVZSyfbZ");
        setField(term46827, term46827.getClass(), "stepName", "adHZFgDoEH");
        setField(term46827, term46827.getClass(), "pathName", "vjNETNMDhQ");
        setField(term46827, term46827.getClass(), "procStepName", "pexqQqwSNj");
        setField(term46827, term46827.getClass(), "completion", "myfXkIEBSV");
        setElement(term46738, 1, term46827);
        setBooleanField(term46915, term46915.getClass(), "active", true);
        setField(term46915, term46915.getClass(), "smfid", "LSrqDVjzEP");
        setField(term46915, term46915.getClass(), "stepNumber", term46929);
        setField(term46915, term46915.getClass(), "owner", "CPZCLJxTuA");
        setField(term46915, term46915.getClass(), "programName", "ivAOXnVjmg");
        setField(term46915, term46915.getClass(), "stepName", "FivesaUeHG");
        setField(term46915, term46915.getClass(), "pathName", "TnpXhZmCRY");
        setField(term46915, term46915.getClass(), "procStepName", "ECVAXFhrTP");
        setField(term46915, term46915.getClass(), "completion", "ypytdNbrBc");
        setElement(term46738, 2, term46915);
        setBooleanField(term47003, term47003.getClass(), "active", true);
        setField(term47003, term47003.getClass(), "smfid", "XvrJCOSYei");
        setField(term47003, term47003.getClass(), "stepNumber", term47017);
        setField(term47003, term47003.getClass(), "owner", "QdRcxOxNSl");
        setField(term47003, term47003.getClass(), "programName", "lvdsucnNvR");
        setField(term47003, term47003.getClass(), "stepName", "mSjSKfeMUn");
        setField(term47003, term47003.getClass(), "pathName", "nVXCBYnEcg");
        setField(term47003, term47003.getClass(), "procStepName", "fcLnKXxzfM");
        setField(term47003, term47003.getClass(), "completion", "FtyaWnfsgn");
        setElement(term46738, 3, term47003);
        setField(term46641, term46641.getClass(), "stepData", term46738);
        setField(term46641, term46641.getClass(), "url", "qphbpPdwrD");
        setField(term46641, term46641.getClass(), "filesUrl", "xHdHafzFSM");
        setField(term46641, term46641.getClass(), "jobCorrelator", "fAsiOEKVaH");
        setField(term46641, term46641.getClass(), "phase", term47127);
        setField(term46641, term46641.getClass(), "phaseName", "EltrILhEwT");
        setField(term46641, term46641.getClass(), "execSystem", "wCcSeUJzhg");
        setField(term46641, term46641.getClass(), "execMember", "HlVHAsOBmJ");
        setField(term46641, term46641.getClass(), "execSubmitted", "nyThJEXHhd");
        setField(term46641, term46641.getClass(), "execStarted", "TRfRRMMCZw");
        setField(term46641, term46641.getClass(), "execEnded", "rwbfUcOMVc");
        setField(term46641, term46641.getClass(), "reasonNotRunning", "ljTkNgJRUl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "siRXAywvyp";
        callMethod(klass, "execSubmitted", argTypes, term46641, args);
    }

};


