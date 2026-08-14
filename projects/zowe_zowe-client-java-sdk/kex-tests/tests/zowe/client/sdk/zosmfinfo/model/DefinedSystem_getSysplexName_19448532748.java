package zowe.client.sdk.zosmfinfo.model;

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
import static zowe.client.sdk.zosmfinfo.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefinedSystem_getSysplexName_19448532748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2458;

    public DefinedSystem_getSysplexName_19448532748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2458 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term2458, term2458.getClass(), "systemNickName", "SJiQaLvSKv");
        setField(term2458, term2458.getClass(), "groupNames", "OEXDRUKcFl");
        setField(term2458, term2458.getClass(), "cpcSerial", "RYdKCNNMBR");
        setField(term2458, term2458.getClass(), "zosVR", "yGtHPyvYiQ");
        setField(term2458, term2458.getClass(), "systemName", "MvRIxilFMJ");
        setField(term2458, term2458.getClass(), "jesType", "iNwOJRBEjp");
        setField(term2458, term2458.getClass(), "sysplexName", "XylxrMBraH");
        setField(term2458, term2458.getClass(), "jesMemberName", "pORebkoRdD");
        setField(term2458, term2458.getClass(), "httpProxyName", "mXGCWJDOqA");
        setField(term2458, term2458.getClass(), "ftpDestinationName", "dpNsDgfPso");
        setField(term2458, term2458.getClass(), "url", "hCWPJQKpdc");
        setField(term2458, term2458.getClass(), "cpcName", "WzMEhMXkKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSysplexName", argTypes, term2458, args);
    }

};


