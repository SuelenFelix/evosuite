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

public class JobModifyInputData_init_19723849000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2434;

    public JobModifyInputData_init_19723849000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2434 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData$Builder"));
        setField(term2434, term2434.getClass(), "jobName", "Ghbwtircqb");
        setField(term2434, term2434.getClass(), "jobId", "xrwlQZdwCp");
        setField(term2434, term2434.getClass(), "jobClass", "IDCWpPLRkE");
        setField(term2434, term2434.getClass(), "version", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobModifyInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term2434;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


