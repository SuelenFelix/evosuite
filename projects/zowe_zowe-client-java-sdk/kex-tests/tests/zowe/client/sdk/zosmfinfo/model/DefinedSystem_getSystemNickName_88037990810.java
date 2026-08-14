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

public class DefinedSystem_getSystemNickName_88037990810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2988;

    public DefinedSystem_getSystemNickName_88037990810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2988 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term2988, term2988.getClass(), "systemNickName", "fWKJoSoCwE");
        setField(term2988, term2988.getClass(), "groupNames", "wfaXBpWAUH");
        setField(term2988, term2988.getClass(), "cpcSerial", "VMeAzAHwZj");
        setField(term2988, term2988.getClass(), "zosVR", "PznxWXsZME");
        setField(term2988, term2988.getClass(), "systemName", "ZzIujlwVsw");
        setField(term2988, term2988.getClass(), "jesType", "LWyEaeIyAo");
        setField(term2988, term2988.getClass(), "sysplexName", "yVMkkQhvmN");
        setField(term2988, term2988.getClass(), "jesMemberName", "mvrkADEgpp");
        setField(term2988, term2988.getClass(), "httpProxyName", "pXOkjyeIRb");
        setField(term2988, term2988.getClass(), "ftpDestinationName", "GgZWSjxjyE");
        setField(term2988, term2988.getClass(), "url", "EeBVbzjcCI");
        setField(term2988, term2988.getClass(), "cpcName", "UfQtPRyWRC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemNickName", argTypes, term2988, args);
    }

};


