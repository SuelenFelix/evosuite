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

public class Job_getOwner_2981964308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9795;

    public Job_getOwner_2981964308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9907 = new Long(1672578078364590450L);
        Long term9995 = new Long(4949335493504695457L);
        Long term10083 = new Long(-5216789073301458893L);
        Long term10171 = new Long(-1832940336320585644L);
        Long term10259 = new Long(-8033714905181142681L);
        Long term10347 = new Long(-9040825890007374809L);
        Long term10457 = new Long(1368340889161782793L);
        term9795 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term9892 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term9893 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term9981 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term10069 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term10157 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term10245 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term10333 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term9795, term9795.getClass(), "jobId", "lKrEAkypza");
        setField(term9795, term9795.getClass(), "jobName", "KtuuNAqGCQ");
        setField(term9795, term9795.getClass(), "subSystem", "OGQsfjmReM");
        setField(term9795, term9795.getClass(), "owner", "YsUtbngnRO");
        setField(term9795, term9795.getClass(), "status", "JisaWUxcNb");
        setField(term9795, term9795.getClass(), "type", "NxgmYPzWCI");
        setField(term9795, term9795.getClass(), "classs", "SqjyKmayBx");
        setField(term9795, term9795.getClass(), "retCode", "XjDhvToxJy");
        setBooleanField(term9893, term9893.getClass(), "active", true);
        setField(term9893, term9893.getClass(), "smfid", "nxSTJflLQy");
        setField(term9893, term9893.getClass(), "stepNumber", term9907);
        setField(term9893, term9893.getClass(), "owner", "FlHzxEfFzI");
        setField(term9893, term9893.getClass(), "programName", "aSATgQUpoe");
        setField(term9893, term9893.getClass(), "stepName", "VkPSXewZfB");
        setField(term9893, term9893.getClass(), "pathName", "ubodzJoMGW");
        setField(term9893, term9893.getClass(), "procStepName", "weddIktxOA");
        setField(term9893, term9893.getClass(), "completion", "uSlMeISsDD");
        setElement(term9892, 0, term9893);
        setBooleanField(term9981, term9981.getClass(), "active", true);
        setField(term9981, term9981.getClass(), "smfid", "WdCiTDUKqn");
        setField(term9981, term9981.getClass(), "stepNumber", term9995);
        setField(term9981, term9981.getClass(), "owner", "PSizQDoxxe");
        setField(term9981, term9981.getClass(), "programName", "mKaHyMybrK");
        setField(term9981, term9981.getClass(), "stepName", "AyrEXuGrEj");
        setField(term9981, term9981.getClass(), "pathName", "yevIIoVYHq");
        setField(term9981, term9981.getClass(), "procStepName", "UuYWMTqWTV");
        setField(term9981, term9981.getClass(), "completion", "DSFGlcaXUb");
        setElement(term9892, 1, term9981);
        setBooleanField(term10069, term10069.getClass(), "active", true);
        setField(term10069, term10069.getClass(), "smfid", "sHMXNUzNeM");
        setField(term10069, term10069.getClass(), "stepNumber", term10083);
        setField(term10069, term10069.getClass(), "owner", "gPzGDOEPPw");
        setField(term10069, term10069.getClass(), "programName", "rwKoAngzCu");
        setField(term10069, term10069.getClass(), "stepName", "VUkRVwROTl");
        setField(term10069, term10069.getClass(), "pathName", "UDlkdccCRn");
        setField(term10069, term10069.getClass(), "procStepName", "McpzErOcYb");
        setField(term10069, term10069.getClass(), "completion", "jqrVEUvYEz");
        setElement(term9892, 2, term10069);
        setBooleanField(term10157, term10157.getClass(), "active", true);
        setField(term10157, term10157.getClass(), "smfid", "QITgiBrmfj");
        setField(term10157, term10157.getClass(), "stepNumber", term10171);
        setField(term10157, term10157.getClass(), "owner", "pXxkiXgQnq");
        setField(term10157, term10157.getClass(), "programName", "tKmrUDURku");
        setField(term10157, term10157.getClass(), "stepName", "JeZbrwZmsP");
        setField(term10157, term10157.getClass(), "pathName", "bxyfeicqrK");
        setField(term10157, term10157.getClass(), "procStepName", "vBnWPlsZMk");
        setField(term10157, term10157.getClass(), "completion", "fIZsWucfXz");
        setElement(term9892, 3, term10157);
        setBooleanField(term10245, term10245.getClass(), "active", true);
        setField(term10245, term10245.getClass(), "smfid", "IApvtmfhnq");
        setField(term10245, term10245.getClass(), "stepNumber", term10259);
        setField(term10245, term10245.getClass(), "owner", "VSaNnhMpRc");
        setField(term10245, term10245.getClass(), "programName", "QNjNTLlUaV");
        setField(term10245, term10245.getClass(), "stepName", "hIYsRyOZxk");
        setField(term10245, term10245.getClass(), "pathName", "RjNoEywJbC");
        setField(term10245, term10245.getClass(), "procStepName", "RTTvrwwhou");
        setField(term10245, term10245.getClass(), "completion", "lRORwXipuk");
        setElement(term9892, 4, term10245);
        setBooleanField(term10333, term10333.getClass(), "active", true);
        setField(term10333, term10333.getClass(), "smfid", "fVdTcjgHdw");
        setField(term10333, term10333.getClass(), "stepNumber", term10347);
        setField(term10333, term10333.getClass(), "owner", "wwAwLLcLPp");
        setField(term10333, term10333.getClass(), "programName", "nHpMKOmlpQ");
        setField(term10333, term10333.getClass(), "stepName", "fKhrQsJToZ");
        setField(term10333, term10333.getClass(), "pathName", "wsysQLGFnl");
        setField(term10333, term10333.getClass(), "procStepName", "ckQLZGFjMX");
        setField(term10333, term10333.getClass(), "completion", "qphdrqUtNx");
        setElement(term9892, 5, term10333);
        setField(term9795, term9795.getClass(), "stepData", term9892);
        setField(term9795, term9795.getClass(), "url", "bwlLFAfNWx");
        setField(term9795, term9795.getClass(), "filesUrl", "JWodNQzjjV");
        setField(term9795, term9795.getClass(), "jobCorrelator", "CAgxWjhxNf");
        setField(term9795, term9795.getClass(), "phase", term10457);
        setField(term9795, term9795.getClass(), "phaseName", "goAoCMhKBu");
        setField(term9795, term9795.getClass(), "execSystem", "BWxJSgKHRT");
        setField(term9795, term9795.getClass(), "execMember", "AGXoIndFnm");
        setField(term9795, term9795.getClass(), "execSubmitted", "mwmFMNEzkK");
        setField(term9795, term9795.getClass(), "execStarted", "kVAmKknVln");
        setField(term9795, term9795.getClass(), "execEnded", "MRFLbEGYKG");
        setField(term9795, term9795.getClass(), "reasonNotRunning", "BYrGukTyof");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term9795, args);
    }

};


