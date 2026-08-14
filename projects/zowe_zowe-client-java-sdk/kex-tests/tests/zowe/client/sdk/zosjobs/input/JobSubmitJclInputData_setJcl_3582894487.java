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

public class JobSubmitJclInputData_setJcl_3582894487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4654;

    public JobSubmitJclInputData_setJcl_3582894487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4691 = new HashMap();
        term4654 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData"));
        setField(term4654, term4654.getClass(), "jcl", "BRIVNtfUWU");
        setField(term4654, term4654.getClass(), "internalReaderRecfm", "DbiCVtPPCT");
        setField(term4654, term4654.getClass(), "internalReaderLrecl", "WzFopsaDuG");
        setField(term4654, term4654.getClass(), "jclSymbols", term4691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XYtryyobou";
        callMethod(klass, "setJcl", argTypes, term4654, args);
    }

};


