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

public class Job_getExecSubmitted_157154735121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22263;

    public Job_getExecSubmitted_157154735121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22375 = new Long(-7278883608542636188L);
        Long term22463 = new Long(-1539859611880912454L);
        Long term22551 = new Long(4100236067313034103L);
        Long term22639 = new Long(1195529027276497124L);
        Long term22727 = new Long(-2783999800714825789L);
        Long term22815 = new Long(4266570509071948633L);
        Long term22903 = new Long(-7291742736502427077L);
        Long term22991 = new Long(-8121849829073967555L);
        Long term23101 = new Long(5219030281405653303L);
        term22263 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term22360 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 8);
        Object term22361 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term22449 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term22537 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term22625 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term22713 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term22801 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term22889 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term22977 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term22263, term22263.getClass(), "jobId", "urlyLwPBVn");
        setField(term22263, term22263.getClass(), "jobName", "SPQVzOlOzZ");
        setField(term22263, term22263.getClass(), "subSystem", "bOUAgAptAI");
        setField(term22263, term22263.getClass(), "owner", "KSZfGbvzPE");
        setField(term22263, term22263.getClass(), "status", "YfgYGgzYER");
        setField(term22263, term22263.getClass(), "type", "IDClvDZuqE");
        setField(term22263, term22263.getClass(), "classs", "cMvKxpZOvg");
        setField(term22263, term22263.getClass(), "retCode", "WWBYemIuiK");
        setBooleanField(term22361, term22361.getClass(), "active", false);
        setField(term22361, term22361.getClass(), "smfid", "nHYQYkycCR");
        setField(term22361, term22361.getClass(), "stepNumber", term22375);
        setField(term22361, term22361.getClass(), "owner", "yBiVacDcZX");
        setField(term22361, term22361.getClass(), "programName", "QrKfEgQeoy");
        setField(term22361, term22361.getClass(), "stepName", "oApgdbwnti");
        setField(term22361, term22361.getClass(), "pathName", "YcgHACNgyo");
        setField(term22361, term22361.getClass(), "procStepName", "MrUPJzBTEn");
        setField(term22361, term22361.getClass(), "completion", "IaSymdfFGa");
        setElement(term22360, 0, term22361);
        setBooleanField(term22449, term22449.getClass(), "active", false);
        setField(term22449, term22449.getClass(), "smfid", "FxSvJCIpul");
        setField(term22449, term22449.getClass(), "stepNumber", term22463);
        setField(term22449, term22449.getClass(), "owner", "HCjKwpexJj");
        setField(term22449, term22449.getClass(), "programName", "sCpIHVPdfl");
        setField(term22449, term22449.getClass(), "stepName", "lMUBBGRjfY");
        setField(term22449, term22449.getClass(), "pathName", "olYpqbolWL");
        setField(term22449, term22449.getClass(), "procStepName", "MCMCjxXzjw");
        setField(term22449, term22449.getClass(), "completion", "pZbbwCURge");
        setElement(term22360, 1, term22449);
        setBooleanField(term22537, term22537.getClass(), "active", true);
        setField(term22537, term22537.getClass(), "smfid", "RsOfgdMCMv");
        setField(term22537, term22537.getClass(), "stepNumber", term22551);
        setField(term22537, term22537.getClass(), "owner", "nsofCJqJOR");
        setField(term22537, term22537.getClass(), "programName", "CitJiZwsjF");
        setField(term22537, term22537.getClass(), "stepName", "ZiyMvLArWJ");
        setField(term22537, term22537.getClass(), "pathName", "MaeokjEfWD");
        setField(term22537, term22537.getClass(), "procStepName", "ocZcumnXEz");
        setField(term22537, term22537.getClass(), "completion", "rNNwyactDR");
        setElement(term22360, 2, term22537);
        setBooleanField(term22625, term22625.getClass(), "active", false);
        setField(term22625, term22625.getClass(), "smfid", "QJrTMTdxyh");
        setField(term22625, term22625.getClass(), "stepNumber", term22639);
        setField(term22625, term22625.getClass(), "owner", "rgZSPplPSs");
        setField(term22625, term22625.getClass(), "programName", "NPUSTXlEKx");
        setField(term22625, term22625.getClass(), "stepName", "KKFprGoNpl");
        setField(term22625, term22625.getClass(), "pathName", "tWVISJlxKZ");
        setField(term22625, term22625.getClass(), "procStepName", "rOZkUKEoaf");
        setField(term22625, term22625.getClass(), "completion", "yLnzGqyHGL");
        setElement(term22360, 3, term22625);
        setBooleanField(term22713, term22713.getClass(), "active", false);
        setField(term22713, term22713.getClass(), "smfid", "IjprPXBDuY");
        setField(term22713, term22713.getClass(), "stepNumber", term22727);
        setField(term22713, term22713.getClass(), "owner", "wkqPmmFDAa");
        setField(term22713, term22713.getClass(), "programName", "rLTDtNqLyW");
        setField(term22713, term22713.getClass(), "stepName", "CLsbWobdgS");
        setField(term22713, term22713.getClass(), "pathName", "TbYrjEyFPc");
        setField(term22713, term22713.getClass(), "procStepName", "muefchpJiZ");
        setField(term22713, term22713.getClass(), "completion", "tuYaAqvYrh");
        setElement(term22360, 4, term22713);
        setBooleanField(term22801, term22801.getClass(), "active", true);
        setField(term22801, term22801.getClass(), "smfid", "CIbhheukbR");
        setField(term22801, term22801.getClass(), "stepNumber", term22815);
        setField(term22801, term22801.getClass(), "owner", "VOHPpErtan");
        setField(term22801, term22801.getClass(), "programName", "GDMUlolTNs");
        setField(term22801, term22801.getClass(), "stepName", "xpLvWisjzN");
        setField(term22801, term22801.getClass(), "pathName", "IKfozyyKEj");
        setField(term22801, term22801.getClass(), "procStepName", "thCjwQjRBL");
        setField(term22801, term22801.getClass(), "completion", "ojLrjltndD");
        setElement(term22360, 5, term22801);
        setBooleanField(term22889, term22889.getClass(), "active", false);
        setField(term22889, term22889.getClass(), "smfid", "VJtFSexKat");
        setField(term22889, term22889.getClass(), "stepNumber", term22903);
        setField(term22889, term22889.getClass(), "owner", "xPVddlPSQR");
        setField(term22889, term22889.getClass(), "programName", "MxrhCLTMTH");
        setField(term22889, term22889.getClass(), "stepName", "kEehLMZcOU");
        setField(term22889, term22889.getClass(), "pathName", "RhLliqMiOF");
        setField(term22889, term22889.getClass(), "procStepName", "jlhonEGrJH");
        setField(term22889, term22889.getClass(), "completion", "RKcKwlEYZb");
        setElement(term22360, 6, term22889);
        setBooleanField(term22977, term22977.getClass(), "active", false);
        setField(term22977, term22977.getClass(), "smfid", "acPRDlpsid");
        setField(term22977, term22977.getClass(), "stepNumber", term22991);
        setField(term22977, term22977.getClass(), "owner", "YyojIzvxLZ");
        setField(term22977, term22977.getClass(), "programName", "fxapaYlZea");
        setField(term22977, term22977.getClass(), "stepName", "VJgREHwfRM");
        setField(term22977, term22977.getClass(), "pathName", "kXnpLIZTAr");
        setField(term22977, term22977.getClass(), "procStepName", "ZiMAmqpbzk");
        setField(term22977, term22977.getClass(), "completion", "UwJtBPAtSU");
        setElement(term22360, 7, term22977);
        setField(term22263, term22263.getClass(), "stepData", term22360);
        setField(term22263, term22263.getClass(), "url", "nBaMiSdFmS");
        setField(term22263, term22263.getClass(), "filesUrl", "ezwGsjqTai");
        setField(term22263, term22263.getClass(), "jobCorrelator", "ngeHWMRjnn");
        setField(term22263, term22263.getClass(), "phase", term23101);
        setField(term22263, term22263.getClass(), "phaseName", "FOKfDXQxMM");
        setField(term22263, term22263.getClass(), "execSystem", "gbxMvhrWpA");
        setField(term22263, term22263.getClass(), "execMember", "huNTIobUHx");
        setField(term22263, term22263.getClass(), "execSubmitted", "MrVeCmRVzF");
        setField(term22263, term22263.getClass(), "execStarted", "CPVnQYACKw");
        setField(term22263, term22263.getClass(), "execEnded", "sbdLhVCRsw");
        setField(term22263, term22263.getClass(), "reasonNotRunning", "soJHvZwbtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecSubmitted", argTypes, term22263, args);
    }

};


