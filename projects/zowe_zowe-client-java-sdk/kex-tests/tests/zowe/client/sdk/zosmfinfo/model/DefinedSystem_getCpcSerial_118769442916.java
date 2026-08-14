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

public class DefinedSystem_getCpcSerial_118769442916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4049;

    public DefinedSystem_getCpcSerial_118769442916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4049 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term4049, term4049.getClass(), "systemNickName", null);
        setField(term4049, term4049.getClass(), "groupNames", null);
        setField(term4049, term4049.getClass(), "cpcSerial", null);
        setField(term4049, term4049.getClass(), "zosVR", null);
        setField(term4049, term4049.getClass(), "systemName", null);
        setField(term4049, term4049.getClass(), "jesType", null);
        setField(term4049, term4049.getClass(), "sysplexName", null);
        setField(term4049, term4049.getClass(), "jesMemberName", null);
        setField(term4049, term4049.getClass(), "httpProxyName", null);
        setField(term4049, term4049.getClass(), "ftpDestinationName", null);
        setField(term4049, term4049.getClass(), "url", null);
        setField(term4049, term4049.getClass(), "cpcName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpcSerial", argTypes, term4049, args);
    }

};


