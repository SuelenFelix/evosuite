package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UssGetInputData_isInsensitive_8528832913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9767;

    public UssGetInputData_isInsensitive_8528832913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9793 = new Integer(391863371);
        term9767 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term9767, term9767.getClass(), "search", "bLPjGVBhlX");
        setField(term9767, term9767.getClass(), "research", "whBvTVIIlC");
        setBooleanField(term9767, term9767.getClass(), "insensitive", true);
        setField(term9767, term9767.getClass(), "maxreturnsize", term9793);
        setIntField(term9767, term9767.getClass(), "queryCount", 391863371);
        setBooleanField(term9767, term9767.getClass(), "binary", true);
        setField(term9767, term9767.getClass(), "recordsRange", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInsensitive", argTypes, term9767, args);
    }

};


