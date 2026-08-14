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

public class DefinedSystem_getHttpProxyName_13849876205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1663;

    public DefinedSystem_getHttpProxyName_13849876205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1663 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term1663, term1663.getClass(), "systemNickName", "MAcUBcBckh");
        setField(term1663, term1663.getClass(), "groupNames", "oVgzLbrsFr");
        setField(term1663, term1663.getClass(), "cpcSerial", "vQVyKLdtaz");
        setField(term1663, term1663.getClass(), "zosVR", "OWKQODBLzb");
        setField(term1663, term1663.getClass(), "systemName", "wGmYcqUkgE");
        setField(term1663, term1663.getClass(), "jesType", "idgaQsnJpQ");
        setField(term1663, term1663.getClass(), "sysplexName", "VgZnGoIFwQ");
        setField(term1663, term1663.getClass(), "jesMemberName", "jUbSRrkrYZ");
        setField(term1663, term1663.getClass(), "httpProxyName", "bWWfajKbEX");
        setField(term1663, term1663.getClass(), "ftpDestinationName", "cAPeiZHKGJ");
        setField(term1663, term1663.getClass(), "url", "LvJFtLBaxj");
        setField(term1663, term1663.getClass(), "cpcName", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHttpProxyName", argTypes, term1663, args);
    }

};


