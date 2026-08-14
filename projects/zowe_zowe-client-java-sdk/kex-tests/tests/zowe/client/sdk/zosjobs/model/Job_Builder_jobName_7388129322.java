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

public class Job_Builder_jobName_7388129322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29292;

    public Job_Builder_jobName_7388129322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29404 = new Long(5973526439563541711L);
        Long term29492 = new Long(5246058710498845622L);
        Long term29580 = new Long(4394651392080968777L);
        Long term29668 = new Long(-7310273014364148916L);
        Long term29756 = new Long(8863790908271299748L);
        Long term29866 = new Long(9205327385733285058L);
        term29292 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term29389 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term29390 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term29478 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term29566 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term29654 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term29742 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term29292, term29292.getClass(), "jobId", "DbxrFiyttv");
        setField(term29292, term29292.getClass(), "jobName", "iVIrSxTsaM");
        setField(term29292, term29292.getClass(), "subSystem", "FmJNEfmYgq");
        setField(term29292, term29292.getClass(), "owner", "NqQofgWsJd");
        setField(term29292, term29292.getClass(), "status", "ZlVRdHsBMO");
        setField(term29292, term29292.getClass(), "type", "UMMXkhuqzw");
        setField(term29292, term29292.getClass(), "classs", "KyGXZcXJwq");
        setField(term29292, term29292.getClass(), "retCode", "TqiCjeuoWE");
        setBooleanField(term29390, term29390.getClass(), "active", false);
        setField(term29390, term29390.getClass(), "smfid", "GWWfkXOYLP");
        setField(term29390, term29390.getClass(), "stepNumber", term29404);
        setField(term29390, term29390.getClass(), "owner", "qvykDllgpT");
        setField(term29390, term29390.getClass(), "programName", "hzdUbcLZhZ");
        setField(term29390, term29390.getClass(), "stepName", "GlxnEJvYeC");
        setField(term29390, term29390.getClass(), "pathName", "SLdOGaqmNv");
        setField(term29390, term29390.getClass(), "procStepName", "QZfhwDBzyR");
        setField(term29390, term29390.getClass(), "completion", "HvnMmAOZev");
        setElement(term29389, 0, term29390);
        setBooleanField(term29478, term29478.getClass(), "active", true);
        setField(term29478, term29478.getClass(), "smfid", "JTPAQsfRtT");
        setField(term29478, term29478.getClass(), "stepNumber", term29492);
        setField(term29478, term29478.getClass(), "owner", "otxkkKfDfl");
        setField(term29478, term29478.getClass(), "programName", "bqIuFFFwnP");
        setField(term29478, term29478.getClass(), "stepName", "hDxvvVgGlk");
        setField(term29478, term29478.getClass(), "pathName", "XdjSvjaTqk");
        setField(term29478, term29478.getClass(), "procStepName", "ukrlYVcvsg");
        setField(term29478, term29478.getClass(), "completion", "cpjqTCNflQ");
        setElement(term29389, 1, term29478);
        setBooleanField(term29566, term29566.getClass(), "active", true);
        setField(term29566, term29566.getClass(), "smfid", "wiYGATEfmw");
        setField(term29566, term29566.getClass(), "stepNumber", term29580);
        setField(term29566, term29566.getClass(), "owner", "FiALSqneIg");
        setField(term29566, term29566.getClass(), "programName", "lGVACSQceQ");
        setField(term29566, term29566.getClass(), "stepName", "jpgWRbSvyQ");
        setField(term29566, term29566.getClass(), "pathName", "tFMlYmPEBX");
        setField(term29566, term29566.getClass(), "procStepName", "ljkZxGNgjZ");
        setField(term29566, term29566.getClass(), "completion", "hrFtgdcZKS");
        setElement(term29389, 2, term29566);
        setBooleanField(term29654, term29654.getClass(), "active", true);
        setField(term29654, term29654.getClass(), "smfid", "ZhZJvpPaTU");
        setField(term29654, term29654.getClass(), "stepNumber", term29668);
        setField(term29654, term29654.getClass(), "owner", "NZwUsJxDLI");
        setField(term29654, term29654.getClass(), "programName", "wlusYBOfXW");
        setField(term29654, term29654.getClass(), "stepName", "HEWWLhfKIa");
        setField(term29654, term29654.getClass(), "pathName", "mJJkYzNPob");
        setField(term29654, term29654.getClass(), "procStepName", "mRDwekkZQg");
        setField(term29654, term29654.getClass(), "completion", "RIGChgqpTI");
        setElement(term29389, 3, term29654);
        setBooleanField(term29742, term29742.getClass(), "active", false);
        setField(term29742, term29742.getClass(), "smfid", "YCrgXnhgoK");
        setField(term29742, term29742.getClass(), "stepNumber", term29756);
        setField(term29742, term29742.getClass(), "owner", "nQodIeQekM");
        setField(term29742, term29742.getClass(), "programName", "YXORpHCDcd");
        setField(term29742, term29742.getClass(), "stepName", "XzZbAcRADD");
        setField(term29742, term29742.getClass(), "pathName", "UqSNWSoTRy");
        setField(term29742, term29742.getClass(), "procStepName", "VesRqDfjMa");
        setField(term29742, term29742.getClass(), "completion", "AQTTebOiZR");
        setElement(term29389, 4, term29742);
        setField(term29292, term29292.getClass(), "stepData", term29389);
        setField(term29292, term29292.getClass(), "url", "mgeIhswNtk");
        setField(term29292, term29292.getClass(), "filesUrl", "QwKYpiVQlL");
        setField(term29292, term29292.getClass(), "jobCorrelator", "kSGsHNQQoW");
        setField(term29292, term29292.getClass(), "phase", term29866);
        setField(term29292, term29292.getClass(), "phaseName", "MWezlyjdaG");
        setField(term29292, term29292.getClass(), "execSystem", "drpBJuEKQG");
        setField(term29292, term29292.getClass(), "execMember", "GGpORnLrOW");
        setField(term29292, term29292.getClass(), "execSubmitted", "gDGZwlpOZx");
        setField(term29292, term29292.getClass(), "execStarted", "gkDpxkHPDg");
        setField(term29292, term29292.getClass(), "execEnded", "pADwkrWiMW");
        setField(term29292, term29292.getClass(), "reasonNotRunning", "FDORDJuAXQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yjqoDeLBLg";
        callMethod(klass, "jobName", argTypes, term29292, args);
    }

};


