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

public class Job_getSubSystem_19249643387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9237;

    public Job_getSubSystem_19249643387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9349 = new Long(2135754395358000892L);
        Long term9459 = new Long(-8085190702504231560L);
        term9237 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term9334 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 1);
        Object term9335 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term9237, term9237.getClass(), "jobId", "UkKvaeJfEC");
        setField(term9237, term9237.getClass(), "jobName", "WPxXsahPRq");
        setField(term9237, term9237.getClass(), "subSystem", "IENRuqmwUU");
        setField(term9237, term9237.getClass(), "owner", "GsWxOwXvSu");
        setField(term9237, term9237.getClass(), "status", "bKBSncrMEZ");
        setField(term9237, term9237.getClass(), "type", "yeSXGqQExb");
        setField(term9237, term9237.getClass(), "classs", "uXYcXVYJZM");
        setField(term9237, term9237.getClass(), "retCode", "BJhjdJUhkz");
        setBooleanField(term9335, term9335.getClass(), "active", false);
        setField(term9335, term9335.getClass(), "smfid", "cdHYQDgUZR");
        setField(term9335, term9335.getClass(), "stepNumber", term9349);
        setField(term9335, term9335.getClass(), "owner", "KAORSSPSeV");
        setField(term9335, term9335.getClass(), "programName", "UimMMORkzd");
        setField(term9335, term9335.getClass(), "stepName", "huVIXUWLtI");
        setField(term9335, term9335.getClass(), "pathName", "vhKzFyKPOT");
        setField(term9335, term9335.getClass(), "procStepName", "nQhIgWXdRc");
        setField(term9335, term9335.getClass(), "completion", "EusenEbIoF");
        setElement(term9334, 0, term9335);
        setField(term9237, term9237.getClass(), "stepData", term9334);
        setField(term9237, term9237.getClass(), "url", "SScVQYSvWH");
        setField(term9237, term9237.getClass(), "filesUrl", "MnovcqFhCl");
        setField(term9237, term9237.getClass(), "jobCorrelator", "qYtAeLzOhW");
        setField(term9237, term9237.getClass(), "phase", term9459);
        setField(term9237, term9237.getClass(), "phaseName", "tJzmOfcUnY");
        setField(term9237, term9237.getClass(), "execSystem", "TKlccZUpjz");
        setField(term9237, term9237.getClass(), "execMember", "GGzwMoHZXC");
        setField(term9237, term9237.getClass(), "execSubmitted", "IpmgwHTgnG");
        setField(term9237, term9237.getClass(), "execStarted", "tIpkeYIezR");
        setField(term9237, term9237.getClass(), "execEnded", "YkZtEtthvz");
        setField(term9237, term9237.getClass(), "reasonNotRunning", "dwlZSxlXOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubSystem", argTypes, term9237, args);
    }

};


