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
import java.lang.Long;

public class JobStepData_getPathName_18078673337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4831;

    public JobStepData_getPathName_18078673337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4845 = new Long(41775768178052008L);
        term4831 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term4831, term4831.getClass(), "active", true);
        setField(term4831, term4831.getClass(), "smfid", "QduALnDSVo");
        setField(term4831, term4831.getClass(), "stepNumber", term4845);
        setField(term4831, term4831.getClass(), "owner", "izPpKDErnQ");
        setField(term4831, term4831.getClass(), "programName", "NnpwZBUTvx");
        setField(term4831, term4831.getClass(), "stepName", "tlQSNgTkQX");
        setField(term4831, term4831.getClass(), "pathName", "PCipZnmBOF");
        setField(term4831, term4831.getClass(), "procStepName", "zcorEihhLK");
        setField(term4831, term4831.getClass(), "completion", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathName", argTypes, term4831, args);
    }

};


