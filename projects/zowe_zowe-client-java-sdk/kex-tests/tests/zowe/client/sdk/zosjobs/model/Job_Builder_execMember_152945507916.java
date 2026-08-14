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

public class Job_Builder_execMember_152945507916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44797;

    public Job_Builder_execMember_152945507916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44909 = new Long(-8514728180792822493L);
        Long term44997 = new Long(5315236285592892506L);
        Long term45085 = new Long(-6969704322644192945L);
        Long term45173 = new Long(-6685235643232255177L);
        Long term45261 = new Long(-5656664340499957324L);
        Long term45349 = new Long(-5460517064177800852L);
        Long term45437 = new Long(-5242567610844514867L);
        Long term45525 = new Long(-2951854704066477061L);
        Long term45613 = new Long(174253963298276221L);
        Long term45723 = new Long(3713624957161771816L);
        term44797 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term44894 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 9);
        Object term44895 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term44983 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term45071 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term45159 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term45247 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term45335 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term45423 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term45511 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term45599 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term44797, term44797.getClass(), "jobId", "voDQuoTpgt");
        setField(term44797, term44797.getClass(), "jobName", "wgwSIKAsrj");
        setField(term44797, term44797.getClass(), "subSystem", "aGJCHRHyCe");
        setField(term44797, term44797.getClass(), "owner", "WingwhSgfc");
        setField(term44797, term44797.getClass(), "status", "YEcmxINfnL");
        setField(term44797, term44797.getClass(), "type", "EGytMwlDVe");
        setField(term44797, term44797.getClass(), "classs", "GFQCmYZmcg");
        setField(term44797, term44797.getClass(), "retCode", "qPgbFtsgtk");
        setBooleanField(term44895, term44895.getClass(), "active", true);
        setField(term44895, term44895.getClass(), "smfid", "nkmiePLZgp");
        setField(term44895, term44895.getClass(), "stepNumber", term44909);
        setField(term44895, term44895.getClass(), "owner", "VoCvDpwwFr");
        setField(term44895, term44895.getClass(), "programName", "zYOmoQqDOd");
        setField(term44895, term44895.getClass(), "stepName", "kmgEVEqTGa");
        setField(term44895, term44895.getClass(), "pathName", "qakIqInzyM");
        setField(term44895, term44895.getClass(), "procStepName", "EOsBgwlmva");
        setField(term44895, term44895.getClass(), "completion", "qcSJruZuJy");
        setElement(term44894, 0, term44895);
        setBooleanField(term44983, term44983.getClass(), "active", true);
        setField(term44983, term44983.getClass(), "smfid", "NOSJtfgqAs");
        setField(term44983, term44983.getClass(), "stepNumber", term44997);
        setField(term44983, term44983.getClass(), "owner", "SUDRrjpChc");
        setField(term44983, term44983.getClass(), "programName", "pmpprxfFwy");
        setField(term44983, term44983.getClass(), "stepName", "AQbnQoJwOO");
        setField(term44983, term44983.getClass(), "pathName", "NnicBPzNzw");
        setField(term44983, term44983.getClass(), "procStepName", "WADNPbexnT");
        setField(term44983, term44983.getClass(), "completion", "rMbsSfMKvX");
        setElement(term44894, 1, term44983);
        setBooleanField(term45071, term45071.getClass(), "active", false);
        setField(term45071, term45071.getClass(), "smfid", "oCsqRJXMBc");
        setField(term45071, term45071.getClass(), "stepNumber", term45085);
        setField(term45071, term45071.getClass(), "owner", "npPxKNoqdS");
        setField(term45071, term45071.getClass(), "programName", "tGgCtmAQPu");
        setField(term45071, term45071.getClass(), "stepName", "HokisXXNMR");
        setField(term45071, term45071.getClass(), "pathName", "JbtvoXZZHr");
        setField(term45071, term45071.getClass(), "procStepName", "eMlkqCfrnK");
        setField(term45071, term45071.getClass(), "completion", "HCiwohQDUV");
        setElement(term44894, 2, term45071);
        setBooleanField(term45159, term45159.getClass(), "active", true);
        setField(term45159, term45159.getClass(), "smfid", "RRWTUIdKkl");
        setField(term45159, term45159.getClass(), "stepNumber", term45173);
        setField(term45159, term45159.getClass(), "owner", "pBnfJsGPNO");
        setField(term45159, term45159.getClass(), "programName", "hzaRTeUQpV");
        setField(term45159, term45159.getClass(), "stepName", "RlIgxHiNOB");
        setField(term45159, term45159.getClass(), "pathName", "kSpBCSqyfl");
        setField(term45159, term45159.getClass(), "procStepName", "OUrtbTvuiW");
        setField(term45159, term45159.getClass(), "completion", "UnkpYLSsCR");
        setElement(term44894, 3, term45159);
        setBooleanField(term45247, term45247.getClass(), "active", true);
        setField(term45247, term45247.getClass(), "smfid", "AaxnITALtd");
        setField(term45247, term45247.getClass(), "stepNumber", term45261);
        setField(term45247, term45247.getClass(), "owner", "RdnRRpWglh");
        setField(term45247, term45247.getClass(), "programName", "YcXTXuOFYV");
        setField(term45247, term45247.getClass(), "stepName", "HGhIlMCaKM");
        setField(term45247, term45247.getClass(), "pathName", "pPxivEPfHY");
        setField(term45247, term45247.getClass(), "procStepName", "BiitfiJmRW");
        setField(term45247, term45247.getClass(), "completion", "ILHarzuGbn");
        setElement(term44894, 4, term45247);
        setBooleanField(term45335, term45335.getClass(), "active", false);
        setField(term45335, term45335.getClass(), "smfid", "uNGHHAwCFL");
        setField(term45335, term45335.getClass(), "stepNumber", term45349);
        setField(term45335, term45335.getClass(), "owner", "fbshyuUfqy");
        setField(term45335, term45335.getClass(), "programName", "eupNcihLEw");
        setField(term45335, term45335.getClass(), "stepName", "iFFcolxwcm");
        setField(term45335, term45335.getClass(), "pathName", "bAsZBSqnyM");
        setField(term45335, term45335.getClass(), "procStepName", "urrmpQzmTU");
        setField(term45335, term45335.getClass(), "completion", "GWoZyTTlNx");
        setElement(term44894, 5, term45335);
        setBooleanField(term45423, term45423.getClass(), "active", false);
        setField(term45423, term45423.getClass(), "smfid", "ntUYcalSmz");
        setField(term45423, term45423.getClass(), "stepNumber", term45437);
        setField(term45423, term45423.getClass(), "owner", "lnZXLpyQoO");
        setField(term45423, term45423.getClass(), "programName", "lOIEIGbwPj");
        setField(term45423, term45423.getClass(), "stepName", "TvmWaJWmLY");
        setField(term45423, term45423.getClass(), "pathName", "TSUdwgvHgU");
        setField(term45423, term45423.getClass(), "procStepName", "YBQxTjzIrN");
        setField(term45423, term45423.getClass(), "completion", "xfqaJVcHGx");
        setElement(term44894, 6, term45423);
        setBooleanField(term45511, term45511.getClass(), "active", true);
        setField(term45511, term45511.getClass(), "smfid", "bANxpqKESI");
        setField(term45511, term45511.getClass(), "stepNumber", term45525);
        setField(term45511, term45511.getClass(), "owner", "sgpUSVSuVZ");
        setField(term45511, term45511.getClass(), "programName", "ZOYhOzwINI");
        setField(term45511, term45511.getClass(), "stepName", "sPqjQQfymN");
        setField(term45511, term45511.getClass(), "pathName", "tNKFzflLBd");
        setField(term45511, term45511.getClass(), "procStepName", "xHLlctEoGh");
        setField(term45511, term45511.getClass(), "completion", "aqgUzcnqpE");
        setElement(term44894, 7, term45511);
        setBooleanField(term45599, term45599.getClass(), "active", false);
        setField(term45599, term45599.getClass(), "smfid", "yZDlWLIKEp");
        setField(term45599, term45599.getClass(), "stepNumber", term45613);
        setField(term45599, term45599.getClass(), "owner", "dAEiXUxDrI");
        setField(term45599, term45599.getClass(), "programName", "AgQWngzXPH");
        setField(term45599, term45599.getClass(), "stepName", "EZJmAIzdHM");
        setField(term45599, term45599.getClass(), "pathName", "LAOkeXXkDr");
        setField(term45599, term45599.getClass(), "procStepName", "YkZqFgrgVM");
        setField(term45599, term45599.getClass(), "completion", "QEJBgSNviH");
        setElement(term44894, 8, term45599);
        setField(term44797, term44797.getClass(), "stepData", term44894);
        setField(term44797, term44797.getClass(), "url", "bjigisSVNp");
        setField(term44797, term44797.getClass(), "filesUrl", "yJCCaWqQuK");
        setField(term44797, term44797.getClass(), "jobCorrelator", "tgBNqkdndl");
        setField(term44797, term44797.getClass(), "phase", term45723);
        setField(term44797, term44797.getClass(), "phaseName", "GXKhRJLVFZ");
        setField(term44797, term44797.getClass(), "execSystem", "qDflhZTJjR");
        setField(term44797, term44797.getClass(), "execMember", "bzQSjpIauE");
        setField(term44797, term44797.getClass(), "execSubmitted", "ESQqarFUtp");
        setField(term44797, term44797.getClass(), "execStarted", "TiCRQbKtcf");
        setField(term44797, term44797.getClass(), "execEnded", "shGEZulpDG");
        setField(term44797, term44797.getClass(), "reasonNotRunning", "twDnEqZglX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TWzZFATLAj";
        callMethod(klass, "execMember", argTypes, term44797, args);
    }

};


