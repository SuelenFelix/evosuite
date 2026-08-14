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

public class Job_Builder_jobCorrelator_108413507012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41391;

    public Job_Builder_jobCorrelator_108413507012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41503 = new Long(6906379511067694917L);
        Long term41591 = new Long(-9204303423581447271L);
        Long term41679 = new Long(6248239231585852341L);
        Long term41767 = new Long(-88538481937688851L);
        Long term41855 = new Long(4069264186851023313L);
        Long term41965 = new Long(5184635470881147510L);
        term41391 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term41488 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 5);
        Object term41489 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term41577 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term41665 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term41753 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term41841 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term41391, term41391.getClass(), "jobId", "MeMWAHyjMR");
        setField(term41391, term41391.getClass(), "jobName", "lTuLOcnSnJ");
        setField(term41391, term41391.getClass(), "subSystem", "govbBrRstA");
        setField(term41391, term41391.getClass(), "owner", "zSMUNzRRyM");
        setField(term41391, term41391.getClass(), "status", "aKwJiIZSjJ");
        setField(term41391, term41391.getClass(), "type", "lYbeaINKud");
        setField(term41391, term41391.getClass(), "classs", "BrwuUkkatt");
        setField(term41391, term41391.getClass(), "retCode", "NjmSJhbVEM");
        setBooleanField(term41489, term41489.getClass(), "active", true);
        setField(term41489, term41489.getClass(), "smfid", "aftnGRjhKN");
        setField(term41489, term41489.getClass(), "stepNumber", term41503);
        setField(term41489, term41489.getClass(), "owner", "TirWkyiCHh");
        setField(term41489, term41489.getClass(), "programName", "lsQrIFMkgZ");
        setField(term41489, term41489.getClass(), "stepName", "VgAyBhgBhq");
        setField(term41489, term41489.getClass(), "pathName", "nhpssUKjpK");
        setField(term41489, term41489.getClass(), "procStepName", "lnJVsFNsCN");
        setField(term41489, term41489.getClass(), "completion", "CUagRkEuzN");
        setElement(term41488, 0, term41489);
        setBooleanField(term41577, term41577.getClass(), "active", false);
        setField(term41577, term41577.getClass(), "smfid", "eWIWfWobXm");
        setField(term41577, term41577.getClass(), "stepNumber", term41591);
        setField(term41577, term41577.getClass(), "owner", "lkPJVVXhDd");
        setField(term41577, term41577.getClass(), "programName", "OpMnUyJTrb");
        setField(term41577, term41577.getClass(), "stepName", "ACBGZgugev");
        setField(term41577, term41577.getClass(), "pathName", "rcbQDpUkab");
        setField(term41577, term41577.getClass(), "procStepName", "oZAbUeXmhW");
        setField(term41577, term41577.getClass(), "completion", "NDSDpOeQda");
        setElement(term41488, 1, term41577);
        setBooleanField(term41665, term41665.getClass(), "active", false);
        setField(term41665, term41665.getClass(), "smfid", "HlKwxzAqTg");
        setField(term41665, term41665.getClass(), "stepNumber", term41679);
        setField(term41665, term41665.getClass(), "owner", "xKjkdjTYfe");
        setField(term41665, term41665.getClass(), "programName", "HcfabJkuEQ");
        setField(term41665, term41665.getClass(), "stepName", "JlnoFYxLfk");
        setField(term41665, term41665.getClass(), "pathName", "tMMLkDkFYW");
        setField(term41665, term41665.getClass(), "procStepName", "EYJXMlkLoO");
        setField(term41665, term41665.getClass(), "completion", "qJtkJJhOSV");
        setElement(term41488, 2, term41665);
        setBooleanField(term41753, term41753.getClass(), "active", false);
        setField(term41753, term41753.getClass(), "smfid", "vQbiGKncal");
        setField(term41753, term41753.getClass(), "stepNumber", term41767);
        setField(term41753, term41753.getClass(), "owner", "NTSNSiYeUu");
        setField(term41753, term41753.getClass(), "programName", "SBTEFDmQVY");
        setField(term41753, term41753.getClass(), "stepName", "ohZpRiNDZM");
        setField(term41753, term41753.getClass(), "pathName", "qEXIxhmUwz");
        setField(term41753, term41753.getClass(), "procStepName", "RlyxtfCqKY");
        setField(term41753, term41753.getClass(), "completion", "kyTUkLCRYm");
        setElement(term41488, 3, term41753);
        setBooleanField(term41841, term41841.getClass(), "active", true);
        setField(term41841, term41841.getClass(), "smfid", "oAotZgNUFH");
        setField(term41841, term41841.getClass(), "stepNumber", term41855);
        setField(term41841, term41841.getClass(), "owner", "TowhQcovXu");
        setField(term41841, term41841.getClass(), "programName", "UFGOnIMOzf");
        setField(term41841, term41841.getClass(), "stepName", "ySiyRlAQpt");
        setField(term41841, term41841.getClass(), "pathName", "MiankJgKCp");
        setField(term41841, term41841.getClass(), "procStepName", "lmZBCmpOeb");
        setField(term41841, term41841.getClass(), "completion", "cPlYOAUqsP");
        setElement(term41488, 4, term41841);
        setField(term41391, term41391.getClass(), "stepData", term41488);
        setField(term41391, term41391.getClass(), "url", "ritBUyuuKt");
        setField(term41391, term41391.getClass(), "filesUrl", "YfziBBiPvL");
        setField(term41391, term41391.getClass(), "jobCorrelator", "lNBaHEkYui");
        setField(term41391, term41391.getClass(), "phase", term41965);
        setField(term41391, term41391.getClass(), "phaseName", "BqxRCYZwmn");
        setField(term41391, term41391.getClass(), "execSystem", "KHPDZjrXQp");
        setField(term41391, term41391.getClass(), "execMember", "fpyUFzdCwQ");
        setField(term41391, term41391.getClass(), "execSubmitted", "OQqBkSGDem");
        setField(term41391, term41391.getClass(), "execStarted", "vZzZOvsIYn");
        setField(term41391, term41391.getClass(), "execEnded", "pAIBwhAbDu");
        setField(term41391, term41391.getClass(), "reasonNotRunning", "iqhNUjVbRG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SSqIrPwJXd";
        callMethod(klass, "jobCorrelator", argTypes, term41391, args);
    }

};


