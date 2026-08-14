package zowe.client.sdk.zosjobs.input;

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
import static zowe.client.sdk.zosjobs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class JobSubmitJclInputData_getInternalReaderRecfm_10600592234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4401;

    public JobSubmitJclInputData_getInternalReaderRecfm_10600592234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4438 = new HashMap();
        term4401 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData"));
        setField(term4401, term4401.getClass(), "jcl", "UfQtPRyWRC");
        setField(term4401, term4401.getClass(), "internalReaderRecfm", "FPvxVzzSvD");
        setField(term4401, term4401.getClass(), "internalReaderLrecl", "WHcwFgsGFC");
        setField(term4401, term4401.getClass(), "jclSymbols", term4438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalReaderRecfm", argTypes, term4401, args);
    }

};


