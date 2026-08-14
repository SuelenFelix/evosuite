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

public class Job_Builder_reasonNotRunning_166785461220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50751;

    public Job_Builder_reasonNotRunning_166785461220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50863 = new Long(-1964501434345816975L);
        Long term50951 = new Long(4689907154423223972L);
        Long term51061 = new Long(8512025621149521819L);
        term50751 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term50848 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term50849 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term50937 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term50751, term50751.getClass(), "jobId", "DpNDxwXKkX");
        setField(term50751, term50751.getClass(), "jobName", "uxoFwkPfXf");
        setField(term50751, term50751.getClass(), "subSystem", "OoVnZTvxUt");
        setField(term50751, term50751.getClass(), "owner", "MnqnyndkhF");
        setField(term50751, term50751.getClass(), "status", "MZzoPKpFlh");
        setField(term50751, term50751.getClass(), "type", "skVZETaBKX");
        setField(term50751, term50751.getClass(), "classs", "jcJNIBACPb");
        setField(term50751, term50751.getClass(), "retCode", "mPQmjoknqi");
        setBooleanField(term50849, term50849.getClass(), "active", false);
        setField(term50849, term50849.getClass(), "smfid", "gLgvePQRQT");
        setField(term50849, term50849.getClass(), "stepNumber", term50863);
        setField(term50849, term50849.getClass(), "owner", "SCmsfHIEPK");
        setField(term50849, term50849.getClass(), "programName", "dFOuezLNWb");
        setField(term50849, term50849.getClass(), "stepName", "PUWJnLuyiR");
        setField(term50849, term50849.getClass(), "pathName", "ADhJCRgHaS");
        setField(term50849, term50849.getClass(), "procStepName", "qociGUMzem");
        setField(term50849, term50849.getClass(), "completion", "HHAfSjIdNi");
        setElement(term50848, 0, term50849);
        setBooleanField(term50937, term50937.getClass(), "active", false);
        setField(term50937, term50937.getClass(), "smfid", "oTqQEKklHi");
        setField(term50937, term50937.getClass(), "stepNumber", term50951);
        setField(term50937, term50937.getClass(), "owner", "riyKkxMvWm");
        setField(term50937, term50937.getClass(), "programName", "WENnGcBSTd");
        setField(term50937, term50937.getClass(), "stepName", "juEYcOCxLW");
        setField(term50937, term50937.getClass(), "pathName", "YsWgGEhEmC");
        setField(term50937, term50937.getClass(), "procStepName", "PBcepqkBBV");
        setField(term50937, term50937.getClass(), "completion", "mukHRKZmND");
        setElement(term50848, 1, term50937);
        setField(term50751, term50751.getClass(), "stepData", term50848);
        setField(term50751, term50751.getClass(), "url", "WVPSokrFPV");
        setField(term50751, term50751.getClass(), "filesUrl", "jELmrpQCNf");
        setField(term50751, term50751.getClass(), "jobCorrelator", "NkjAcBXmmT");
        setField(term50751, term50751.getClass(), "phase", term51061);
        setField(term50751, term50751.getClass(), "phaseName", "KgtGJGInhu");
        setField(term50751, term50751.getClass(), "execSystem", "mVHDjrsMAV");
        setField(term50751, term50751.getClass(), "execMember", "rjWnqcjYuU");
        setField(term50751, term50751.getClass(), "execSubmitted", "JhszTkUWCg");
        setField(term50751, term50751.getClass(), "execStarted", "gfNPCeiULY");
        setField(term50751, term50751.getClass(), "execEnded", "aUJLXfcWME");
        setField(term50751, term50751.getClass(), "reasonNotRunning", "ixeIpUaVug");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TELyWFMBJv";
        callMethod(klass, "reasonNotRunning", argTypes, term50751, args);
    }

};


