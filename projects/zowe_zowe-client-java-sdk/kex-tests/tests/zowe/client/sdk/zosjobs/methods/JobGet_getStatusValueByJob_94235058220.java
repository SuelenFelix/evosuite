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

public class JobGet_getStatusValueByJob_94235058220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9094;
     Object term9107;

    public JobGet_getStatusValueByJob_94235058220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9094 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobGet"));
        setField(term9094, term9094.getClass(), "connection", null);
        setField(term9094, term9094.getClass(), "request", null);
        setField(term9094, term9094.getClass(), "url", "CVRGEomOth");
        Long term9219 = new Long(-2068172595987555756L);
        Long term9307 = new Long(-6292278961887936280L);
        Long term9395 = new Long(-6645965768855543712L);
        Long term9483 = new Long(4784595517102746672L);
        Long term9571 = new Long(-7612550318181586304L);
        Long term9659 = new Long(-2170847986967241072L);
        Long term9769 = new Long(4044358158040652353L);
        term9107 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term9204 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 6);
        Object term9205 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term9293 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term9381 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term9469 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term9557 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term9645 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term9107, term9107.getClass(), "jobId", "vSeruUyNWX");
        setField(term9107, term9107.getClass(), "jobName", "UkKvaeJfEC");
        setField(term9107, term9107.getClass(), "subSystem", "WPxXsahPRq");
        setField(term9107, term9107.getClass(), "owner", "IENRuqmwUU");
        setField(term9107, term9107.getClass(), "status", "GsWxOwXvSu");
        setField(term9107, term9107.getClass(), "type", "bKBSncrMEZ");
        setField(term9107, term9107.getClass(), "classs", "yeSXGqQExb");
        setField(term9107, term9107.getClass(), "retCode", "uXYcXVYJZM");
        setBooleanField(term9205, term9205.getClass(), "active", false);
        setField(term9205, term9205.getClass(), "smfid", "BJhjdJUhkz");
        setField(term9205, term9205.getClass(), "stepNumber", term9219);
        setField(term9205, term9205.getClass(), "owner", "cdHYQDgUZR");
        setField(term9205, term9205.getClass(), "programName", "KAORSSPSeV");
        setField(term9205, term9205.getClass(), "stepName", "UimMMORkzd");
        setField(term9205, term9205.getClass(), "pathName", "huVIXUWLtI");
        setField(term9205, term9205.getClass(), "procStepName", "vhKzFyKPOT");
        setField(term9205, term9205.getClass(), "completion", "nQhIgWXdRc");
        setElement(term9204, 0, term9205);
        setBooleanField(term9293, term9293.getClass(), "active", true);
        setField(term9293, term9293.getClass(), "smfid", "EusenEbIoF");
        setField(term9293, term9293.getClass(), "stepNumber", term9307);
        setField(term9293, term9293.getClass(), "owner", "SScVQYSvWH");
        setField(term9293, term9293.getClass(), "programName", "MnovcqFhCl");
        setField(term9293, term9293.getClass(), "stepName", "qYtAeLzOhW");
        setField(term9293, term9293.getClass(), "pathName", "tJzmOfcUnY");
        setField(term9293, term9293.getClass(), "procStepName", "TKlccZUpjz");
        setField(term9293, term9293.getClass(), "completion", "GGzwMoHZXC");
        setElement(term9204, 1, term9293);
        setBooleanField(term9381, term9381.getClass(), "active", true);
        setField(term9381, term9381.getClass(), "smfid", "IpmgwHTgnG");
        setField(term9381, term9381.getClass(), "stepNumber", term9395);
        setField(term9381, term9381.getClass(), "owner", "tIpkeYIezR");
        setField(term9381, term9381.getClass(), "programName", "YkZtEtthvz");
        setField(term9381, term9381.getClass(), "stepName", "dwlZSxlXOo");
        setField(term9381, term9381.getClass(), "pathName", "lKrEAkypza");
        setField(term9381, term9381.getClass(), "procStepName", "KtuuNAqGCQ");
        setField(term9381, term9381.getClass(), "completion", "OGQsfjmReM");
        setElement(term9204, 2, term9381);
        setBooleanField(term9469, term9469.getClass(), "active", true);
        setField(term9469, term9469.getClass(), "smfid", "YsUtbngnRO");
        setField(term9469, term9469.getClass(), "stepNumber", term9483);
        setField(term9469, term9469.getClass(), "owner", "JisaWUxcNb");
        setField(term9469, term9469.getClass(), "programName", "NxgmYPzWCI");
        setField(term9469, term9469.getClass(), "stepName", "SqjyKmayBx");
        setField(term9469, term9469.getClass(), "pathName", "XjDhvToxJy");
        setField(term9469, term9469.getClass(), "procStepName", "nxSTJflLQy");
        setField(term9469, term9469.getClass(), "completion", "FlHzxEfFzI");
        setElement(term9204, 3, term9469);
        setBooleanField(term9557, term9557.getClass(), "active", true);
        setField(term9557, term9557.getClass(), "smfid", "aSATgQUpoe");
        setField(term9557, term9557.getClass(), "stepNumber", term9571);
        setField(term9557, term9557.getClass(), "owner", "VkPSXewZfB");
        setField(term9557, term9557.getClass(), "programName", "ubodzJoMGW");
        setField(term9557, term9557.getClass(), "stepName", "weddIktxOA");
        setField(term9557, term9557.getClass(), "pathName", "uSlMeISsDD");
        setField(term9557, term9557.getClass(), "procStepName", "WdCiTDUKqn");
        setField(term9557, term9557.getClass(), "completion", "PSizQDoxxe");
        setElement(term9204, 4, term9557);
        setBooleanField(term9645, term9645.getClass(), "active", true);
        setField(term9645, term9645.getClass(), "smfid", "mKaHyMybrK");
        setField(term9645, term9645.getClass(), "stepNumber", term9659);
        setField(term9645, term9645.getClass(), "owner", "AyrEXuGrEj");
        setField(term9645, term9645.getClass(), "programName", "yevIIoVYHq");
        setField(term9645, term9645.getClass(), "stepName", "UuYWMTqWTV");
        setField(term9645, term9645.getClass(), "pathName", "DSFGlcaXUb");
        setField(term9645, term9645.getClass(), "procStepName", "sHMXNUzNeM");
        setField(term9645, term9645.getClass(), "completion", "gPzGDOEPPw");
        setElement(term9204, 5, term9645);
        setField(term9107, term9107.getClass(), "stepData", term9204);
        setField(term9107, term9107.getClass(), "url", "rwKoAngzCu");
        setField(term9107, term9107.getClass(), "filesUrl", "VUkRVwROTl");
        setField(term9107, term9107.getClass(), "jobCorrelator", "UDlkdccCRn");
        setField(term9107, term9107.getClass(), "phase", term9769);
        setField(term9107, term9107.getClass(), "phaseName", "McpzErOcYb");
        setField(term9107, term9107.getClass(), "execSystem", "jqrVEUvYEz");
        setField(term9107, term9107.getClass(), "execMember", "QITgiBrmfj");
        setField(term9107, term9107.getClass(), "execSubmitted", "pXxkiXgQnq");
        setField(term9107, term9107.getClass(), "execStarted", "tKmrUDURku");
        setField(term9107, term9107.getClass(), "execEnded", "JeZbrwZmsP");
        setField(term9107, term9107.getClass(), "reasonNotRunning", "bxyfeicqrK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobGet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Object[] args = new Object[1];
        args[0] = term9107;
        callMethod(klass, "getStatusValueByJob", argTypes, term9094, args);
    }

};


