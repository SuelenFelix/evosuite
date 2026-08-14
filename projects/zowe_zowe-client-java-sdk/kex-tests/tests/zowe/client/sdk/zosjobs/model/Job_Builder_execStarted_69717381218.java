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

public class Job_Builder_execStarted_69717381218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47695;

    public Job_Builder_execStarted_69717381218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47807 = new Long(-5258945362776941718L);
        Long term47895 = new Long(24067105862153728L);
        Long term47983 = new Long(-8477368071089201577L);
        Long term48071 = new Long(-1526729287349763895L);
        Long term48159 = new Long(7017605765544766728L);
        Long term48247 = new Long(-6078481855513028760L);
        Long term48335 = new Long(-6985556670871089725L);
        Long term48423 = new Long(-8469818909085103606L);
        Long term48533 = new Long(11315815278355083L);
        term47695 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term47792 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 8);
        Object term47793 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term47881 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term47969 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term48057 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term48145 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term48233 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term48321 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term48409 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term47695, term47695.getClass(), "jobId", "ZRLaReQeFg");
        setField(term47695, term47695.getClass(), "jobName", "cOcXspUxKR");
        setField(term47695, term47695.getClass(), "subSystem", "JNzgWUmqtl");
        setField(term47695, term47695.getClass(), "owner", "UxVfWaXiSr");
        setField(term47695, term47695.getClass(), "status", "yTrvklotrs");
        setField(term47695, term47695.getClass(), "type", "kNkFIdfwqs");
        setField(term47695, term47695.getClass(), "classs", "sHLdqoTjnP");
        setField(term47695, term47695.getClass(), "retCode", "UakuVGzEav");
        setBooleanField(term47793, term47793.getClass(), "active", true);
        setField(term47793, term47793.getClass(), "smfid", "DxiwTTouEo");
        setField(term47793, term47793.getClass(), "stepNumber", term47807);
        setField(term47793, term47793.getClass(), "owner", "ghoklPMuMt");
        setField(term47793, term47793.getClass(), "programName", "uAgfQbLPeZ");
        setField(term47793, term47793.getClass(), "stepName", "aZiFZfzhQT");
        setField(term47793, term47793.getClass(), "pathName", "HbzAbCwWRh");
        setField(term47793, term47793.getClass(), "procStepName", "yBgWgFtVxP");
        setField(term47793, term47793.getClass(), "completion", "NAwiEDVBcB");
        setElement(term47792, 0, term47793);
        setBooleanField(term47881, term47881.getClass(), "active", false);
        setField(term47881, term47881.getClass(), "smfid", "jxuVQHHLqy");
        setField(term47881, term47881.getClass(), "stepNumber", term47895);
        setField(term47881, term47881.getClass(), "owner", "TnUXNtKOns");
        setField(term47881, term47881.getClass(), "programName", "umsYdaPflb");
        setField(term47881, term47881.getClass(), "stepName", "CnNmpSyiBE");
        setField(term47881, term47881.getClass(), "pathName", "JvKKIGdUWh");
        setField(term47881, term47881.getClass(), "procStepName", "DInvDrzBtt");
        setField(term47881, term47881.getClass(), "completion", "igZJubDPuK");
        setElement(term47792, 1, term47881);
        setBooleanField(term47969, term47969.getClass(), "active", true);
        setField(term47969, term47969.getClass(), "smfid", "qxBdFhLbAN");
        setField(term47969, term47969.getClass(), "stepNumber", term47983);
        setField(term47969, term47969.getClass(), "owner", "KyUmXHRrED");
        setField(term47969, term47969.getClass(), "programName", "eOMBFVrNcf");
        setField(term47969, term47969.getClass(), "stepName", "gOwOIsocMB");
        setField(term47969, term47969.getClass(), "pathName", "GqTBOhQBgV");
        setField(term47969, term47969.getClass(), "procStepName", "DQhxOWqEyi");
        setField(term47969, term47969.getClass(), "completion", "dSszYGDwAk");
        setElement(term47792, 2, term47969);
        setBooleanField(term48057, term48057.getClass(), "active", false);
        setField(term48057, term48057.getClass(), "smfid", "gNeMyGSVIG");
        setField(term48057, term48057.getClass(), "stepNumber", term48071);
        setField(term48057, term48057.getClass(), "owner", "qxEkaqdKPG");
        setField(term48057, term48057.getClass(), "programName", "VclIptmKrF");
        setField(term48057, term48057.getClass(), "stepName", "wcTeSHCZwz");
        setField(term48057, term48057.getClass(), "pathName", "fxxnbYOiZZ");
        setField(term48057, term48057.getClass(), "procStepName", "CTnRYaYXia");
        setField(term48057, term48057.getClass(), "completion", "SUIYUFtCCe");
        setElement(term47792, 3, term48057);
        setBooleanField(term48145, term48145.getClass(), "active", true);
        setField(term48145, term48145.getClass(), "smfid", "eKCrPCkedw");
        setField(term48145, term48145.getClass(), "stepNumber", term48159);
        setField(term48145, term48145.getClass(), "owner", "VAFSknHLsZ");
        setField(term48145, term48145.getClass(), "programName", "MamzBtwhiz");
        setField(term48145, term48145.getClass(), "stepName", "wVOypfVLsP");
        setField(term48145, term48145.getClass(), "pathName", "pEazBcUUWX");
        setField(term48145, term48145.getClass(), "procStepName", "nlvRWrTxvz");
        setField(term48145, term48145.getClass(), "completion", "isMKwgUmka");
        setElement(term47792, 4, term48145);
        setBooleanField(term48233, term48233.getClass(), "active", false);
        setField(term48233, term48233.getClass(), "smfid", "pDIyzhDtTy");
        setField(term48233, term48233.getClass(), "stepNumber", term48247);
        setField(term48233, term48233.getClass(), "owner", "wXiUlhXQoC");
        setField(term48233, term48233.getClass(), "programName", "gKhmgJzimH");
        setField(term48233, term48233.getClass(), "stepName", "OzRiWLVXNx");
        setField(term48233, term48233.getClass(), "pathName", "pktmgYsknu");
        setField(term48233, term48233.getClass(), "procStepName", "SsMHzYNeji");
        setField(term48233, term48233.getClass(), "completion", "wzAFLFdaEQ");
        setElement(term47792, 5, term48233);
        setBooleanField(term48321, term48321.getClass(), "active", false);
        setField(term48321, term48321.getClass(), "smfid", "IcbBNUXJqX");
        setField(term48321, term48321.getClass(), "stepNumber", term48335);
        setField(term48321, term48321.getClass(), "owner", "LONFjqAsUp");
        setField(term48321, term48321.getClass(), "programName", "tAhydlbSMf");
        setField(term48321, term48321.getClass(), "stepName", "wNYtcPFyIe");
        setField(term48321, term48321.getClass(), "pathName", "tlIqgTUSQw");
        setField(term48321, term48321.getClass(), "procStepName", "UvweyXjDhG");
        setField(term48321, term48321.getClass(), "completion", "wnoVhNwdJy");
        setElement(term47792, 6, term48321);
        setBooleanField(term48409, term48409.getClass(), "active", true);
        setField(term48409, term48409.getClass(), "smfid", "uQGMBLrmAj");
        setField(term48409, term48409.getClass(), "stepNumber", term48423);
        setField(term48409, term48409.getClass(), "owner", "vNFaheDeBv");
        setField(term48409, term48409.getClass(), "programName", "CiPMRxGoHO");
        setField(term48409, term48409.getClass(), "stepName", "LauKpKmenw");
        setField(term48409, term48409.getClass(), "pathName", "TydzbTXvbY");
        setField(term48409, term48409.getClass(), "procStepName", "yNogNNecFu");
        setField(term48409, term48409.getClass(), "completion", "tcaaotqgDF");
        setElement(term47792, 7, term48409);
        setField(term47695, term47695.getClass(), "stepData", term47792);
        setField(term47695, term47695.getClass(), "url", "bXInWdOeyi");
        setField(term47695, term47695.getClass(), "filesUrl", "HdwopulXkf");
        setField(term47695, term47695.getClass(), "jobCorrelator", "FuCKfgAhpC");
        setField(term47695, term47695.getClass(), "phase", term48533);
        setField(term47695, term47695.getClass(), "phaseName", "gqMysJhxfA");
        setField(term47695, term47695.getClass(), "execSystem", "HtLEppUqzI");
        setField(term47695, term47695.getClass(), "execMember", "bVlRrMQeRY");
        setField(term47695, term47695.getClass(), "execSubmitted", "SXaXhlzAIB");
        setField(term47695, term47695.getClass(), "execStarted", "UPVTXSXUNh");
        setField(term47695, term47695.getClass(), "execEnded", "cjCXbXuiFn");
        setField(term47695, term47695.getClass(), "reasonNotRunning", "fhdhDeWdoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FqrcltWSUd";
        callMethod(klass, "execStarted", argTypes, term47695, args);
    }

};


