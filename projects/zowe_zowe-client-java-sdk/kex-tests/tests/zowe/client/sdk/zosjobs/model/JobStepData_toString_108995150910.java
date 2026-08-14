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

public class JobStepData_toString_108995150910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5305;

    public JobStepData_toString_108995150910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5319 = new Long(-7291743527973326814L);
        term5305 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobStepData"));
        setBooleanField(term5305, term5305.getClass(), "active", false);
        setField(term5305, term5305.getClass(), "smfid", "HBGNxdNURv");
        setField(term5305, term5305.getClass(), "stepNumber", term5319);
        setField(term5305, term5305.getClass(), "owner", "mfCpTPPQQm");
        setField(term5305, term5305.getClass(), "programName", "OcJCIDNIXA");
        setField(term5305, term5305.getClass(), "stepName", "XfRABIFVEp");
        setField(term5305, term5305.getClass(), "pathName", "MHGKyEnwKc");
        setField(term5305, term5305.getClass(), "procStepName", "ShIELyuULw");
        setField(term5305, term5305.getClass(), "completion", "IpQuOGMgmj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobStepData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5305, args);
    }

};


