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

public class DefinedSystem_getFtpDestinationName_1693899303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1133;

    public DefinedSystem_getFtpDestinationName_1693899303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1133 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term1133, term1133.getClass(), "systemNickName", "UiUYnPrcCi");
        setField(term1133, term1133.getClass(), "groupNames", "UoYtihxVaS");
        setField(term1133, term1133.getClass(), "cpcSerial", "JDswTTCZHV");
        setField(term1133, term1133.getClass(), "zosVR", "onpbIeEKoi");
        setField(term1133, term1133.getClass(), "systemName", "YRHGsAkhxb");
        setField(term1133, term1133.getClass(), "jesType", "ffYhPOzlUs");
        setField(term1133, term1133.getClass(), "sysplexName", "MLqYREekMl");
        setField(term1133, term1133.getClass(), "jesMemberName", "ytSBIKXogI");
        setField(term1133, term1133.getClass(), "httpProxyName", "nHXjMycHlU");
        setField(term1133, term1133.getClass(), "ftpDestinationName", "ieCtQFdkii");
        setField(term1133, term1133.getClass(), "url", "dEnhdmILtU");
        setField(term1133, term1133.getClass(), "cpcName", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFtpDestinationName", argTypes, term1133, args);
    }

};


