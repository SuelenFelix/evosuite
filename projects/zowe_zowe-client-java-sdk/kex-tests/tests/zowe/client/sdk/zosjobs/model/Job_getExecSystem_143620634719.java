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

public class Job_getExecSystem_143620634719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21147;

    public Job_getExecSystem_143620634719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21281 = new Long(3452833434644634217L);
        term21147 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.Job"));
        Object[] term21244 = (Object[]) newArray("zowe.client.sdk.zosjobs.model.JobStepData", 0);
        setField(term21147, term21147.getClass(), "jobId", "HejzvyejjG");
        setField(term21147, term21147.getClass(), "jobName", "pbqJjeooBM");
        setField(term21147, term21147.getClass(), "subSystem", "ccnotFfPXt");
        setField(term21147, term21147.getClass(), "owner", "plWlgdgIhn");
        setField(term21147, term21147.getClass(), "status", "RZaKVKWtND");
        setField(term21147, term21147.getClass(), "type", "vXiaNiquft");
        setField(term21147, term21147.getClass(), "classs", "lucCeiVnYe");
        setField(term21147, term21147.getClass(), "retCode", "iYwkCLMsbJ");
        setField(term21147, term21147.getClass(), "stepData", term21244);
        setField(term21147, term21147.getClass(), "url", "MXLsVQWrwc");
        setField(term21147, term21147.getClass(), "filesUrl", "lRaSlqzqNY");
        setField(term21147, term21147.getClass(), "jobCorrelator", "TiEyxWXsra");
        setField(term21147, term21147.getClass(), "phase", term21281);
        setField(term21147, term21147.getClass(), "phaseName", "TuLgwTZsPP");
        setField(term21147, term21147.getClass(), "execSystem", "KoasxTJGpx");
        setField(term21147, term21147.getClass(), "execMember", "ceGeARYMoa");
        setField(term21147, term21147.getClass(), "execSubmitted", "fFWllaiFvh");
        setField(term21147, term21147.getClass(), "execStarted", "PFTdEDSbvZ");
        setField(term21147, term21147.getClass(), "execEnded", "TbiwoiebNe");
        setField(term21147, term21147.getClass(), "reasonNotRunning", "laTITSWZuc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecSystem", argTypes, term21147, args);
    }

};


