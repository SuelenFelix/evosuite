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
import java.util.HashMap;

public class JobSubmit_submitJclCommon_13898679014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10668;
     Object term10669;

    public JobSubmit_submitJclCommon_13898679014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10668 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobSubmit"));
        setField(term10668, term10668.getClass(), "connection", null);
        setField(term10668, term10668.getClass(), "request", null);
        HashMap term10706 = new HashMap();
        term10669 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData"));
        setField(term10669, term10669.getClass(), "jcl", "lRORwXipuk");
        setField(term10669, term10669.getClass(), "internalReaderRecfm", "fVdTcjgHdw");
        setField(term10669, term10669.getClass(), "internalReaderLrecl", "wwAwLLcLPp");
        setField(term10669, term10669.getClass(), "jclSymbols", term10706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobSubmit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitJclInputData");
        Object[] args = new Object[1];
        args[0] = term10669;
        callMethod(klass, "submitJclCommon", argTypes, term10668, args);
    }

};


