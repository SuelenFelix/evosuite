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

public class Job_toString_149461296125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26549;

    public Job_toString_149461296125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26661 = new Long(4699157009689333952L);
        Long term26749 = new Long(-78240609295693193L);
        Long term26837 = new Long(3090901538358721367L);
        Long term26925 = new Long(-1677189124507026637L);
        Long term27013 = new Long(4795660804170399986L);
        Long term27101 = new Long(-4030863184426321096L);
        Long term27189 = new Long(-8010214112439224349L);
        Long term27277 = new Long(-6673920710396545553L);
        Long term27365 = new Long(3412644969878030772L);
        Long term27475 = new Long(6698455537431331246L);
        term26549 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term26646 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 9);
        Object term26647 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term26735 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term26823 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term26911 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term26999 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term27087 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term27175 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term27263 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term27351 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term26549, term26549.getClass(), "jobId", "sAgGDoUNlf");
        setField(term26549, term26549.getClass(), "jobName", "TSTZcXdFFi");
        setField(term26549, term26549.getClass(), "subSystem", "RyaaOzWfYO");
        setField(term26549, term26549.getClass(), "owner", "HAkxFBZZzz");
        setField(term26549, term26549.getClass(), "status", "yejonZnVuy");
        setField(term26549, term26549.getClass(), "type", "ouesGIsvuG");
        setField(term26549, term26549.getClass(), "classs", "pHBHlmLIZQ");
        setField(term26549, term26549.getClass(), "retCode", "ZWRAbOuktl");
        setBooleanField(term26647, term26647.getClass(), "active", true);
        setField(term26647, term26647.getClass(), "smfid", "iqFRvFmVID");
        setField(term26647, term26647.getClass(), "stepNumber", term26661);
        setField(term26647, term26647.getClass(), "owner", "pNAEtppZdv");
        setField(term26647, term26647.getClass(), "programName", "VsFWNMdyRt");
        setField(term26647, term26647.getClass(), "stepName", "QaoYFZhScg");
        setField(term26647, term26647.getClass(), "pathName", "UTvXIenLCR");
        setField(term26647, term26647.getClass(), "procStepName", "PLeKpWaxhQ");
        setField(term26647, term26647.getClass(), "completion", "EBSKhqDdUW");
        setElement(term26646, 0, term26647);
        setBooleanField(term26735, term26735.getClass(), "active", true);
        setField(term26735, term26735.getClass(), "smfid", "LvLbdICdfA");
        setField(term26735, term26735.getClass(), "stepNumber", term26749);
        setField(term26735, term26735.getClass(), "owner", "rtifrlITwl");
        setField(term26735, term26735.getClass(), "programName", "yGWXZDjnPS");
        setField(term26735, term26735.getClass(), "stepName", "vZucxbGVyo");
        setField(term26735, term26735.getClass(), "pathName", "ZZoLNbeORl");
        setField(term26735, term26735.getClass(), "procStepName", "XjIOUIzJUP");
        setField(term26735, term26735.getClass(), "completion", "iGTpXnnTqB");
        setElement(term26646, 1, term26735);
        setBooleanField(term26823, term26823.getClass(), "active", true);
        setField(term26823, term26823.getClass(), "smfid", "XgJzBOYfQB");
        setField(term26823, term26823.getClass(), "stepNumber", term26837);
        setField(term26823, term26823.getClass(), "owner", "GAPGgDekVG");
        setField(term26823, term26823.getClass(), "programName", "WmTogHwGLE");
        setField(term26823, term26823.getClass(), "stepName", "qYOIXsGycY");
        setField(term26823, term26823.getClass(), "pathName", "sJNXNshRLe");
        setField(term26823, term26823.getClass(), "procStepName", "AYnbmgRCKr");
        setField(term26823, term26823.getClass(), "completion", "iQRfDlaoYD");
        setElement(term26646, 2, term26823);
        setBooleanField(term26911, term26911.getClass(), "active", false);
        setField(term26911, term26911.getClass(), "smfid", "kpcyrjDQzN");
        setField(term26911, term26911.getClass(), "stepNumber", term26925);
        setField(term26911, term26911.getClass(), "owner", "IyukykAHLQ");
        setField(term26911, term26911.getClass(), "programName", "CwZcgFJqMh");
        setField(term26911, term26911.getClass(), "stepName", "RldCZqgRbO");
        setField(term26911, term26911.getClass(), "pathName", "LOVugCAgJs");
        setField(term26911, term26911.getClass(), "procStepName", "SNmHXwCiFY");
        setField(term26911, term26911.getClass(), "completion", "HZfkWoqyUW");
        setElement(term26646, 3, term26911);
        setBooleanField(term26999, term26999.getClass(), "active", false);
        setField(term26999, term26999.getClass(), "smfid", "QRwANPSyfT");
        setField(term26999, term26999.getClass(), "stepNumber", term27013);
        setField(term26999, term26999.getClass(), "owner", "DbZKLwYBgy");
        setField(term26999, term26999.getClass(), "programName", "LnNRVsjmxw");
        setField(term26999, term26999.getClass(), "stepName", "PlOnDkNrvX");
        setField(term26999, term26999.getClass(), "pathName", "MltgFGldop");
        setField(term26999, term26999.getClass(), "procStepName", "JCWSoxnBJs");
        setField(term26999, term26999.getClass(), "completion", "vAxcpvjEEa");
        setElement(term26646, 4, term26999);
        setBooleanField(term27087, term27087.getClass(), "active", true);
        setField(term27087, term27087.getClass(), "smfid", "FCkOgIBqXE");
        setField(term27087, term27087.getClass(), "stepNumber", term27101);
        setField(term27087, term27087.getClass(), "owner", "kadRHthQRD");
        setField(term27087, term27087.getClass(), "programName", "cGbJSRSpNn");
        setField(term27087, term27087.getClass(), "stepName", "MzXzaqaiHW");
        setField(term27087, term27087.getClass(), "pathName", "jWOWtrhVkA");
        setField(term27087, term27087.getClass(), "procStepName", "IyOhWYyaDV");
        setField(term27087, term27087.getClass(), "completion", "omWrkCSFzy");
        setElement(term26646, 5, term27087);
        setBooleanField(term27175, term27175.getClass(), "active", true);
        setField(term27175, term27175.getClass(), "smfid", "VFYvUTgYFB");
        setField(term27175, term27175.getClass(), "stepNumber", term27189);
        setField(term27175, term27175.getClass(), "owner", "BrWqhEIUUj");
        setField(term27175, term27175.getClass(), "programName", "WfUmxdiHcU");
        setField(term27175, term27175.getClass(), "stepName", "BRrftvRvmF");
        setField(term27175, term27175.getClass(), "pathName", "fvoyRbZTsm");
        setField(term27175, term27175.getClass(), "procStepName", "iOCnOQXWTl");
        setField(term27175, term27175.getClass(), "completion", "ARnOWpgtAg");
        setElement(term26646, 6, term27175);
        setBooleanField(term27263, term27263.getClass(), "active", true);
        setField(term27263, term27263.getClass(), "smfid", "MRrYxZoJBW");
        setField(term27263, term27263.getClass(), "stepNumber", term27277);
        setField(term27263, term27263.getClass(), "owner", "fheZXFNQZh");
        setField(term27263, term27263.getClass(), "programName", "YxHVWlebna");
        setField(term27263, term27263.getClass(), "stepName", "IEmAQCkrPE");
        setField(term27263, term27263.getClass(), "pathName", "lqFGhtlNRM");
        setField(term27263, term27263.getClass(), "procStepName", "GLxLHUsuLw");
        setField(term27263, term27263.getClass(), "completion", "HuKdqrrxIm");
        setElement(term26646, 7, term27263);
        setBooleanField(term27351, term27351.getClass(), "active", false);
        setField(term27351, term27351.getClass(), "smfid", "yJKKddLqMb");
        setField(term27351, term27351.getClass(), "stepNumber", term27365);
        setField(term27351, term27351.getClass(), "owner", "LWEYaXeKBe");
        setField(term27351, term27351.getClass(), "programName", "cNoFvpHBHw");
        setField(term27351, term27351.getClass(), "stepName", "DoSWbCtsBg");
        setField(term27351, term27351.getClass(), "pathName", "NrXtkbXwDc");
        setField(term27351, term27351.getClass(), "procStepName", "EUapSrAmOe");
        setField(term27351, term27351.getClass(), "completion", "dUHylIprea");
        setElement(term26646, 8, term27351);
        setField(term26549, term26549.getClass(), "stepData", term26646);
        setField(term26549, term26549.getClass(), "url", "FKDqHRpMcc");
        setField(term26549, term26549.getClass(), "filesUrl", "mIRMQIxHUD");
        setField(term26549, term26549.getClass(), "jobCorrelator", "FbBMtntDbw");
        setField(term26549, term26549.getClass(), "phase", term27475);
        setField(term26549, term26549.getClass(), "phaseName", "zRnpRGaHlI");
        setField(term26549, term26549.getClass(), "execSystem", "dVHfxjbMRK");
        setField(term26549, term26549.getClass(), "execMember", "LzwyLxKJpw");
        setField(term26549, term26549.getClass(), "execSubmitted", "ZhWJlplAVK");
        setField(term26549, term26549.getClass(), "execStarted", "pnmjTuTojv");
        setField(term26549, term26549.getClass(), "execEnded", "eMtshhmGEm");
        setField(term26549, term26549.getClass(), "reasonNotRunning", "VJUbzHGOvg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term26549, args);
    }

};


