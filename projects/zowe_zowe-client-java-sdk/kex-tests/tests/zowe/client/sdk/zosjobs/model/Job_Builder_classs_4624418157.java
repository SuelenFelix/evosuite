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

public class Job_Builder_classs_4624418157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35510;

    public Job_Builder_classs_4624418157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35622 = new Long(3238645206498300107L);
        Long term35710 = new Long(-1592696983130738594L);
        Long term35820 = new Long(6902365338255307910L);
        term35510 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder"));
        Object[] term35607 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 2);
        Object term35608 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        Object term35696 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setField(term35510, term35510.getClass(), "jobId", "qSnwPXRuzC");
        setField(term35510, term35510.getClass(), "jobName", "gqhqalMaKC");
        setField(term35510, term35510.getClass(), "subSystem", "qkMduZHBXR");
        setField(term35510, term35510.getClass(), "owner", "jMQsCLYfKd");
        setField(term35510, term35510.getClass(), "status", "dpcpGqEQLd");
        setField(term35510, term35510.getClass(), "type", "pButgbcWlR");
        setField(term35510, term35510.getClass(), "classs", "tPiZMhJIXj");
        setField(term35510, term35510.getClass(), "retCode", "lrEkNimddJ");
        setBooleanField(term35608, term35608.getClass(), "active", true);
        setField(term35608, term35608.getClass(), "smfid", "fkeYGEUxMA");
        setField(term35608, term35608.getClass(), "stepNumber", term35622);
        setField(term35608, term35608.getClass(), "owner", "aJUGPodUIW");
        setField(term35608, term35608.getClass(), "programName", "NpjPDfnDRd");
        setField(term35608, term35608.getClass(), "stepName", "SWMYovqYdk");
        setField(term35608, term35608.getClass(), "pathName", "TQuvAoQcBe");
        setField(term35608, term35608.getClass(), "procStepName", "nGYLfZrtWO");
        setField(term35608, term35608.getClass(), "completion", "DBufEhhBCQ");
        setElement(term35607, 0, term35608);
        setBooleanField(term35696, term35696.getClass(), "active", true);
        setField(term35696, term35696.getClass(), "smfid", "GiNZRBZjgO");
        setField(term35696, term35696.getClass(), "stepNumber", term35710);
        setField(term35696, term35696.getClass(), "owner", "ceGAKcClsG");
        setField(term35696, term35696.getClass(), "programName", "SEldZGJyvX");
        setField(term35696, term35696.getClass(), "stepName", "vyvpqcHTQN");
        setField(term35696, term35696.getClass(), "pathName", "QQcpNMSHvA");
        setField(term35696, term35696.getClass(), "procStepName", "FLLklaMZvg");
        setField(term35696, term35696.getClass(), "completion", "jRDZpkFkoD");
        setElement(term35607, 1, term35696);
        setField(term35510, term35510.getClass(), "stepData", term35607);
        setField(term35510, term35510.getClass(), "url", "wwSknqIBIO");
        setField(term35510, term35510.getClass(), "filesUrl", "zQPAxUFaeX");
        setField(term35510, term35510.getClass(), "jobCorrelator", "cKNHUkrYfK");
        setField(term35510, term35510.getClass(), "phase", term35820);
        setField(term35510, term35510.getClass(), "phaseName", "crMeWqJOCQ");
        setField(term35510, term35510.getClass(), "execSystem", "VUVgiQvSYa");
        setField(term35510, term35510.getClass(), "execMember", "sEGgJJplmE");
        setField(term35510, term35510.getClass(), "execSubmitted", "jyexiarswN");
        setField(term35510, term35510.getClass(), "execStarted", "ZBLFNFVEHD");
        setField(term35510, term35510.getClass(), "execEnded", "miNxpUfOyL");
        setField(term35510, term35510.getClass(), "reasonNotRunning", "BAPTojeHRU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uqDEIRoVVf";
        callMethod(klass, "classs", argTypes, term35510, args);
    }

};


