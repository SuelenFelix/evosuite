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

public class DefinedSystem_getJesMemberName_187377371220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4053;

    public DefinedSystem_getJesMemberName_187377371220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4053 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term4053, term4053.getClass(), "systemNickName", null);
        setField(term4053, term4053.getClass(), "groupNames", null);
        setField(term4053, term4053.getClass(), "cpcSerial", null);
        setField(term4053, term4053.getClass(), "zosVR", null);
        setField(term4053, term4053.getClass(), "systemName", null);
        setField(term4053, term4053.getClass(), "jesType", null);
        setField(term4053, term4053.getClass(), "sysplexName", null);
        setField(term4053, term4053.getClass(), "jesMemberName", null);
        setField(term4053, term4053.getClass(), "httpProxyName", null);
        setField(term4053, term4053.getClass(), "ftpDestinationName", null);
        setField(term4053, term4053.getClass(), "url", null);
        setField(term4053, term4053.getClass(), "cpcName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJesMemberName", argTypes, term4053, args);
    }

};


