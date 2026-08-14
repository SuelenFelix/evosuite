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

public class Job_getType_55688400510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11859;

    public Job_getType_55688400510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11971 = new Long(-3936701866695933852L);
        Long term12059 = new Long(1215116475929634177L);
        Long term12147 = new Long(1597484336218508869L);
        Long term12235 = new Long(-685023850445639859L);
        Long term12323 = new Long(-6950146046121430355L);
        Long term12411 = new Long(1667122142089513324L);
        Long term12521 = new Long(-6342139649364011743L);
        term11859 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term11956 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term11957 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term12045 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term12133 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term12221 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term12309 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term12397 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term11859, term11859.getClass(), "jobId", "DzKFxEuEEC");
        setField(term11859, term11859.getClass(), "jobName", "CAMnvfDLJL");
        setField(term11859, term11859.getClass(), "subSystem", "mfHtgSbdjD");
        setField(term11859, term11859.getClass(), "owner", "cmuaUiHMVL");
        setField(term11859, term11859.getClass(), "status", "xjoSGPWUgu");
        setField(term11859, term11859.getClass(), "type", "uzmqjnOUXu");
        setField(term11859, term11859.getClass(), "classs", "xeyjTOCOJb");
        setField(term11859, term11859.getClass(), "retCode", "DGRqjjdhzy");
        setBooleanField(term11957, term11957.getClass(), "active", true);
        setField(term11957, term11957.getClass(), "smfid", "lQFkjJUPAR");
        setField(term11957, term11957.getClass(), "stepNumber", term11971);
        setField(term11957, term11957.getClass(), "owner", "BsuVlGUUjV");
        setField(term11957, term11957.getClass(), "programName", "bHHjfDCntT");
        setField(term11957, term11957.getClass(), "stepName", "sEphiduvkv");
        setField(term11957, term11957.getClass(), "pathName", "PbLgCSAHce");
        setField(term11957, term11957.getClass(), "procStepName", "NWldOLAbqk");
        setField(term11957, term11957.getClass(), "completion", "qnYaYSpDwO");
        setElement(term11956, 0, term11957);
        setBooleanField(term12045, term12045.getClass(), "active", true);
        setField(term12045, term12045.getClass(), "smfid", "dgbFDCdHtj");
        setField(term12045, term12045.getClass(), "stepNumber", term12059);
        setField(term12045, term12045.getClass(), "owner", "EKpdCBubDE");
        setField(term12045, term12045.getClass(), "programName", "zMsSLTfGhl");
        setField(term12045, term12045.getClass(), "stepName", "bEmHScVZaQ");
        setField(term12045, term12045.getClass(), "pathName", "TcuXODkzBV");
        setField(term12045, term12045.getClass(), "procStepName", "coJPjrBZNe");
        setField(term12045, term12045.getClass(), "completion", "vMsWjuPTnO");
        setElement(term11956, 1, term12045);
        setBooleanField(term12133, term12133.getClass(), "active", true);
        setField(term12133, term12133.getClass(), "smfid", "zHvfKaOstO");
        setField(term12133, term12133.getClass(), "stepNumber", term12147);
        setField(term12133, term12133.getClass(), "owner", "tOszriqETr");
        setField(term12133, term12133.getClass(), "programName", "ncSPTkhKjO");
        setField(term12133, term12133.getClass(), "stepName", "jcWKHRWhyj");
        setField(term12133, term12133.getClass(), "pathName", "nrQjODRMLD");
        setField(term12133, term12133.getClass(), "procStepName", "PNoWXrsFic");
        setField(term12133, term12133.getClass(), "completion", "QZBHZqZope");
        setElement(term11956, 2, term12133);
        setBooleanField(term12221, term12221.getClass(), "active", false);
        setField(term12221, term12221.getClass(), "smfid", "VBUahCvyxC");
        setField(term12221, term12221.getClass(), "stepNumber", term12235);
        setField(term12221, term12221.getClass(), "owner", "MlzTkzKMCX");
        setField(term12221, term12221.getClass(), "programName", "UqKUbMyPMJ");
        setField(term12221, term12221.getClass(), "stepName", "QpYltHAdyY");
        setField(term12221, term12221.getClass(), "pathName", "lbmSGBwIiV");
        setField(term12221, term12221.getClass(), "procStepName", "DAxyHoTLzZ");
        setField(term12221, term12221.getClass(), "completion", "fhZgTouhCC");
        setElement(term11956, 3, term12221);
        setBooleanField(term12309, term12309.getClass(), "active", false);
        setField(term12309, term12309.getClass(), "smfid", "wrikqJwXvL");
        setField(term12309, term12309.getClass(), "stepNumber", term12323);
        setField(term12309, term12309.getClass(), "owner", "UiWhvbypdr");
        setField(term12309, term12309.getClass(), "programName", "CgleElJNje");
        setField(term12309, term12309.getClass(), "stepName", "ZrchvNGMtd");
        setField(term12309, term12309.getClass(), "pathName", "WaEcyVlcIx");
        setField(term12309, term12309.getClass(), "procStepName", "ONcbPCQnHd");
        setField(term12309, term12309.getClass(), "completion", "AobDaplFLl");
        setElement(term11956, 4, term12309);
        setBooleanField(term12397, term12397.getClass(), "active", false);
        setField(term12397, term12397.getClass(), "smfid", "pDkMNnAGgv");
        setField(term12397, term12397.getClass(), "stepNumber", term12411);
        setField(term12397, term12397.getClass(), "owner", "PaCpFXGzdX");
        setField(term12397, term12397.getClass(), "programName", "FftYCNbnks");
        setField(term12397, term12397.getClass(), "stepName", "lJoltmsadS");
        setField(term12397, term12397.getClass(), "pathName", "mvfDtZNEHr");
        setField(term12397, term12397.getClass(), "procStepName", "bvSgmFUDOU");
        setField(term12397, term12397.getClass(), "completion", "XMHwbfiHRl");
        setElement(term11956, 5, term12397);
        setField(term11859, term11859.getClass(), "stepData", term11956);
        setField(term11859, term11859.getClass(), "url", "bucTnYicnp");
        setField(term11859, term11859.getClass(), "filesUrl", "EkgprvqZlM");
        setField(term11859, term11859.getClass(), "jobCorrelator", "fbnKvthhOz");
        setField(term11859, term11859.getClass(), "phase", term12521);
        setField(term11859, term11859.getClass(), "phaseName", "PGfCDJTBek");
        setField(term11859, term11859.getClass(), "execSystem", "ZwjARhAtHC");
        setField(term11859, term11859.getClass(), "execMember", "XXvscsYBWv");
        setField(term11859, term11859.getClass(), "execSubmitted", "uePedtiAfL");
        setField(term11859, term11859.getClass(), "execStarted", "AdSHvysxQB");
        setField(term11859, term11859.getClass(), "execEnded", "jlraKkBWFA");
        setField(term11859, term11859.getClass(), "reasonNotRunning", "mRBtFTxVdE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11859, args);
    }

};


