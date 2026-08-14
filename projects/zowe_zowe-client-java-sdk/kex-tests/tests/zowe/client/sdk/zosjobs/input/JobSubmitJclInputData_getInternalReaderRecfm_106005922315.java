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

public class JobSubmitJclInputData_getInternalReaderRecfm_106005922315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5019;

    public JobSubmitJclInputData_getInternalReaderRecfm_106005922315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5019 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData"));
        setField(term5019, term5019.getClass(), "jcl", null);
        setField(term5019, term5019.getClass(), "internalReaderRecfm", null);
        setField(term5019, term5019.getClass(), "internalReaderLrecl", null);
        setField(term5019, term5019.getClass(), "jclSymbols", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalReaderRecfm", argTypes, term5019, args);
    }

};


