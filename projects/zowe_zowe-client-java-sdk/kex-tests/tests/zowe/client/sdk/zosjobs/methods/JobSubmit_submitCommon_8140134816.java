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

public class JobSubmit_submitCommon_8140134816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10769;
     Object term10770;

    public JobSubmit_submitCommon_8140134816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10769 = newInstance(Class.forName("zowe.client.sdk.zosjobs.methods.JobSubmit"));
        setField(term10769, term10769.getClass(), "connection", null);
        setField(term10769, term10769.getClass(), "request", null);
        HashMap term10783 = new HashMap();
        term10770 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitInputData"));
        setField(term10770, term10770.getClass(), "jobDataSet", "ckQLZGFjMX");
        setField(term10770, term10770.getClass(), "jclSymbols", term10783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.methods.JobSubmit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosjobs.input.JobSubmitInputData");
        Object[] args = new Object[1];
        args[0] = term10770;
        callMethod(klass, "submitCommon", argTypes, term10769, args);
    }

};


