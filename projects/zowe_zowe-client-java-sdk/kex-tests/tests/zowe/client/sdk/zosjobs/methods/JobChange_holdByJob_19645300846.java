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

public class JobChange_holdByJob_19645300846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;
     Object term1483;

    public JobChange_holdByJob_19645300846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1482 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobChange"));
        setField(term1482, term1482.getClass(), "connection", null);
        setField(term1482, term1482.getClass(), "request", null);
        Long term1595 = new Long(4872422362414183754L);
        Long term1683 = new Long(6811161968424632369L);
        Long term1771 = new Long(-7237588299778557629L);
        Long term1859 = new Long(6967924379644551255L);
        Long term1969 = new Long(-2813493605142626659L);
        term1483 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term1580 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 4);
        Object term1581 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term1669 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term1757 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term1845 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term1483, term1483.getClass(), "jobId", "kBdSllIBVz");
        setField(term1483, term1483.getClass(), "jobName", "TJmVBGfTML");
        setField(term1483, term1483.getClass(), "subSystem", "tPlsykYBqO");
        setField(term1483, term1483.getClass(), "owner", "bLPjGVBhlX");
        setField(term1483, term1483.getClass(), "status", "whBvTVIIlC");
        setField(term1483, term1483.getClass(), "type", "IgRJUzaCwW");
        setField(term1483, term1483.getClass(), "classs", "JUmudUmaaV");
        setField(term1483, term1483.getClass(), "retCode", "KoyGrUJeJW");
        setBooleanField(term1581, term1581.getClass(), "active", true);
        setField(term1581, term1581.getClass(), "smfid", "HqBOwkVqjD");
        setField(term1581, term1581.getClass(), "stepNumber", term1595);
        setField(term1581, term1581.getClass(), "owner", "MAcUBcBckh");
        setField(term1581, term1581.getClass(), "programName", "oVgzLbrsFr");
        setField(term1581, term1581.getClass(), "stepName", "vQVyKLdtaz");
        setField(term1581, term1581.getClass(), "pathName", "OWKQODBLzb");
        setField(term1581, term1581.getClass(), "procStepName", "wGmYcqUkgE");
        setField(term1581, term1581.getClass(), "completion", "idgaQsnJpQ");
        setElement(term1580, 0, term1581);
        setBooleanField(term1669, term1669.getClass(), "active", true);
        setField(term1669, term1669.getClass(), "smfid", "VgZnGoIFwQ");
        setField(term1669, term1669.getClass(), "stepNumber", term1683);
        setField(term1669, term1669.getClass(), "owner", "jUbSRrkrYZ");
        setField(term1669, term1669.getClass(), "programName", "bWWfajKbEX");
        setField(term1669, term1669.getClass(), "stepName", "cAPeiZHKGJ");
        setField(term1669, term1669.getClass(), "pathName", "LvJFtLBaxj");
        setField(term1669, term1669.getClass(), "procStepName", "PHvxnGHptP");
        setField(term1669, term1669.getClass(), "completion", "TimdotUuNC");
        setElement(term1580, 1, term1669);
        setBooleanField(term1757, term1757.getClass(), "active", true);
        setField(term1757, term1757.getClass(), "smfid", "PkWMRdJcBb");
        setField(term1757, term1757.getClass(), "stepNumber", term1771);
        setField(term1757, term1757.getClass(), "owner", "jSpAteRute");
        setField(term1757, term1757.getClass(), "programName", "swZVeJAxjt");
        setField(term1757, term1757.getClass(), "stepName", "xOcJIiQQDu");
        setField(term1757, term1757.getClass(), "pathName", "GVizqqzXpy");
        setField(term1757, term1757.getClass(), "procStepName", "JqXGgAhZPl");
        setField(term1757, term1757.getClass(), "completion", "jiKYgYHqIS");
        setElement(term1580, 2, term1757);
        setBooleanField(term1845, term1845.getClass(), "active", false);
        setField(term1845, term1845.getClass(), "smfid", "DfISiziTgG");
        setField(term1845, term1845.getClass(), "stepNumber", term1859);
        setField(term1845, term1845.getClass(), "owner", "XqgfKFvPSD");
        setField(term1845, term1845.getClass(), "programName", "JiVRgTZvKc");
        setField(term1845, term1845.getClass(), "stepName", "XPKmummaqg");
        setField(term1845, term1845.getClass(), "pathName", "BKLfkLiZTH");
        setField(term1845, term1845.getClass(), "procStepName", "SPpkrGcPRr");
        setField(term1845, term1845.getClass(), "completion", "sEccwbJKYE");
        setElement(term1580, 3, term1845);
        setField(term1483, term1483.getClass(), "stepData", term1580);
        setField(term1483, term1483.getClass(), "url", "AWRooQKkdW");
        setField(term1483, term1483.getClass(), "filesUrl", "vjxIhXHxGR");
        setField(term1483, term1483.getClass(), "jobCorrelator", "QXzGXbEXMu");
        setField(term1483, term1483.getClass(), "phase", term1969);
        setField(term1483, term1483.getClass(), "phaseName", "qxSDVejjiY");
        setField(term1483, term1483.getClass(), "execSystem", "xBsXSDjXYK");
        setField(term1483, term1483.getClass(), "execMember", "sEnIVFtZuQ");
        setField(term1483, term1483.getClass(), "execSubmitted", "ZVecLZMLHF");
        setField(term1483, term1483.getClass(), "execStarted", "fztQhjqwdP");
        setField(term1483, term1483.getClass(), "execEnded", "eVpkWxjuki");
        setField(term1483, term1483.getClass(), "reasonNotRunning", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobChange");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1483;
        args[1] = "OEXDRUKcFl";
        callMethod(klass, "holdByJob", argTypes, term1482, args);
    }

};


