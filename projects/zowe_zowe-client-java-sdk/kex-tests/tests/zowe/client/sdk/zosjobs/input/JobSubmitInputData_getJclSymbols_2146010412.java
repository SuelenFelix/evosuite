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

public class JobSubmitInputData_getJclSymbols_2146010412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3775;

    public JobSubmitInputData_getJclSymbols_2146010412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3788 = new HashMap();
        term3775 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitInputData"));
        setField(term3775, term3775.getClass(), "jobDataSet", "BKLfkLiZTH");
        setField(term3775, term3775.getClass(), "jclSymbols", term3788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJclSymbols", argTypes, term3775, args);
    }

};


