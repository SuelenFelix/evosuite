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

public class Job_getExecEnded_120270600823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25275;

    public Job_getExecEnded_120270600823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25387 = new Long(-8614778293741404325L);
        Long term25475 = new Long(-5447369594017685765L);
        Long term25585 = new Long(-5724112525188606013L);
        term25275 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term25372 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term25373 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term25461 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term25275, term25275.getClass(), "jobId", "XeSDJYKMBf");
        setField(term25275, term25275.getClass(), "jobName", "tIsFcOGTUX");
        setField(term25275, term25275.getClass(), "subSystem", "XUVRcnELFP");
        setField(term25275, term25275.getClass(), "owner", "xIeSbezmkD");
        setField(term25275, term25275.getClass(), "status", "txUWLZRkSv");
        setField(term25275, term25275.getClass(), "type", "gHRMJRsBGm");
        setField(term25275, term25275.getClass(), "classs", "rZyrfnMvHa");
        setField(term25275, term25275.getClass(), "retCode", "GMyMhTZeDC");
        setBooleanField(term25373, term25373.getClass(), "active", false);
        setField(term25373, term25373.getClass(), "smfid", "KqQOTshBOL");
        setField(term25373, term25373.getClass(), "stepNumber", term25387);
        setField(term25373, term25373.getClass(), "owner", "cuWgFcYkPC");
        setField(term25373, term25373.getClass(), "programName", "HfbcOKkXBm");
        setField(term25373, term25373.getClass(), "stepName", "pLbTzSMbsN");
        setField(term25373, term25373.getClass(), "pathName", "lFSbxerCPP");
        setField(term25373, term25373.getClass(), "procStepName", "vjaZIyixCm");
        setField(term25373, term25373.getClass(), "completion", "gAAPyftlIR");
        setElement(term25372, 0, term25373);
        setBooleanField(term25461, term25461.getClass(), "active", true);
        setField(term25461, term25461.getClass(), "smfid", "kevWstoxwq");
        setField(term25461, term25461.getClass(), "stepNumber", term25475);
        setField(term25461, term25461.getClass(), "owner", "aSYOhFwzSm");
        setField(term25461, term25461.getClass(), "programName", "pVZlzrBeDB");
        setField(term25461, term25461.getClass(), "stepName", "EfSUvjuZAA");
        setField(term25461, term25461.getClass(), "pathName", "PrHWfHydsG");
        setField(term25461, term25461.getClass(), "procStepName", "igruEzTbBE");
        setField(term25461, term25461.getClass(), "completion", "LFjgROsRUV");
        setElement(term25372, 1, term25461);
        setField(term25275, term25275.getClass(), "stepData", term25372);
        setField(term25275, term25275.getClass(), "url", "kHxujKiCsr");
        setField(term25275, term25275.getClass(), "filesUrl", "cseZveWowm");
        setField(term25275, term25275.getClass(), "jobCorrelator", "idfslIPhgx");
        setField(term25275, term25275.getClass(), "phase", term25585);
        setField(term25275, term25275.getClass(), "phaseName", "HyFLOXeoDX");
        setField(term25275, term25275.getClass(), "execSystem", "crkNabVaWs");
        setField(term25275, term25275.getClass(), "execMember", "qBcAJgrABE");
        setField(term25275, term25275.getClass(), "execSubmitted", "JKdZuLFRwC");
        setField(term25275, term25275.getClass(), "execStarted", "hfhLLoWnRU");
        setField(term25275, term25275.getClass(), "execEnded", "RpofnOPYha");
        setField(term25275, term25275.getClass(), "reasonNotRunning", "CQYmAsjvPU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecEnded", argTypes, term25275, args);
    }

};


