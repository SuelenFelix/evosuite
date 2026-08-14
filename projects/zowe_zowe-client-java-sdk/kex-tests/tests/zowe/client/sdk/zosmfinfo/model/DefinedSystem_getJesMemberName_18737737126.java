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

public class DefinedSystem_getJesMemberName_18737737126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1928;

    public DefinedSystem_getJesMemberName_18737737126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1928 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term1928, term1928.getClass(), "systemNickName", "TimdotUuNC");
        setField(term1928, term1928.getClass(), "groupNames", "PkWMRdJcBb");
        setField(term1928, term1928.getClass(), "cpcSerial", "jSpAteRute");
        setField(term1928, term1928.getClass(), "zosVR", "swZVeJAxjt");
        setField(term1928, term1928.getClass(), "systemName", "xOcJIiQQDu");
        setField(term1928, term1928.getClass(), "jesType", "GVizqqzXpy");
        setField(term1928, term1928.getClass(), "sysplexName", "JqXGgAhZPl");
        setField(term1928, term1928.getClass(), "jesMemberName", "jiKYgYHqIS");
        setField(term1928, term1928.getClass(), "httpProxyName", "DfISiziTgG");
        setField(term1928, term1928.getClass(), "ftpDestinationName", "XqgfKFvPSD");
        setField(term1928, term1928.getClass(), "url", "JiVRgTZvKc");
        setField(term1928, term1928.getClass(), "cpcName", "XPKmummaqg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJesMemberName", argTypes, term1928, args);
    }

};


