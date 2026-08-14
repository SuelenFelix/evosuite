package zowe.client.sdk.zosjobs.methods;

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
import static zowe.client.sdk.zosjobs.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class JobCancel_cancelByJob_3405828943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10976;
     Object term10977;

    public JobCancel_cancelByJob_3405828943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10976 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobCancel"));
        setField(term10976, term10976.getClass(), "connection", null);
        setField(term10976, term10976.getClass(), "request", null);
        Long term11089 = new Long(-4443169559037975007L);
        Long term11177 = new Long(-3842548265506930260L);
        Long term11265 = new Long(-5788180182343976541L);
        Long term11375 = new Long(2936323121573284007L);
        term10977 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term11074 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 3);
        Object term11075 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term11163 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term11251 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term10977, term10977.getClass(), "jobId", "UxgSdhxPCH");
        setField(term10977, term10977.getClass(), "jobName", "DAujxZPHJC");
        setField(term10977, term10977.getClass(), "subSystem", "IlBhdrCvHq");
        setField(term10977, term10977.getClass(), "owner", "OirVUQhauU");
        setField(term10977, term10977.getClass(), "status", "GLbyDfbNZI");
        setField(term10977, term10977.getClass(), "type", "oNLcCYDAsO");
        setField(term10977, term10977.getClass(), "classs", "CNqMxLvtcJ");
        setField(term10977, term10977.getClass(), "retCode", "ktbqerIaKW");
        setBooleanField(term11075, term11075.getClass(), "active", false);
        setField(term11075, term11075.getClass(), "smfid", "VoghngXfsK");
        setField(term11075, term11075.getClass(), "stepNumber", term11089);
        setField(term11075, term11075.getClass(), "owner", "GbahCBMvct");
        setField(term11075, term11075.getClass(), "programName", "iiHBhsNFgk");
        setField(term11075, term11075.getClass(), "stepName", "HknsTajwxJ");
        setField(term11075, term11075.getClass(), "pathName", "XtiurrVYKw");
        setField(term11075, term11075.getClass(), "procStepName", "rsumfoDNHa");
        setField(term11075, term11075.getClass(), "completion", "ceCWHUTQUM");
        setElement(term11074, 0, term11075);
        setBooleanField(term11163, term11163.getClass(), "active", true);
        setField(term11163, term11163.getClass(), "smfid", "LrqwfrKKtS");
        setField(term11163, term11163.getClass(), "stepNumber", term11177);
        setField(term11163, term11163.getClass(), "owner", "ZUdnQXfzCI");
        setField(term11163, term11163.getClass(), "programName", "EULDrUNQvw");
        setField(term11163, term11163.getClass(), "stepName", "BtvAvsJSei");
        setField(term11163, term11163.getClass(), "pathName", "vqnBkkxoIa");
        setField(term11163, term11163.getClass(), "procStepName", "bycpZjxXFn");
        setField(term11163, term11163.getClass(), "completion", "jQWttOAiwL");
        setElement(term11074, 1, term11163);
        setBooleanField(term11251, term11251.getClass(), "active", true);
        setField(term11251, term11251.getClass(), "smfid", "DzKFxEuEEC");
        setField(term11251, term11251.getClass(), "stepNumber", term11265);
        setField(term11251, term11251.getClass(), "owner", "CAMnvfDLJL");
        setField(term11251, term11251.getClass(), "programName", "mfHtgSbdjD");
        setField(term11251, term11251.getClass(), "stepName", "cmuaUiHMVL");
        setField(term11251, term11251.getClass(), "pathName", "xjoSGPWUgu");
        setField(term11251, term11251.getClass(), "procStepName", "uzmqjnOUXu");
        setField(term11251, term11251.getClass(), "completion", "xeyjTOCOJb");
        setElement(term11074, 2, term11251);
        setField(term10977, term10977.getClass(), "stepData", term11074);
        setField(term10977, term10977.getClass(), "url", "DGRqjjdhzy");
        setField(term10977, term10977.getClass(), "filesUrl", "lQFkjJUPAR");
        setField(term10977, term10977.getClass(), "jobCorrelator", "BsuVlGUUjV");
        setField(term10977, term10977.getClass(), "phase", term11375);
        setField(term10977, term10977.getClass(), "phaseName", "bHHjfDCntT");
        setField(term10977, term10977.getClass(), "execSystem", "sEphiduvkv");
        setField(term10977, term10977.getClass(), "execMember", "PbLgCSAHce");
        setField(term10977, term10977.getClass(), "execSubmitted", "NWldOLAbqk");
        setField(term10977, term10977.getClass(), "execStarted", "qnYaYSpDwO");
        setField(term10977, term10977.getClass(), "execEnded", "dgbFDCdHtj");
        setField(term10977, term10977.getClass(), "reasonNotRunning", "EKpdCBubDE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobCancel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term10977;
        args[1] = "zMsSLTfGhl";
        callMethod(klass, "cancelByJob", argTypes, term10976, args);
    }

};


