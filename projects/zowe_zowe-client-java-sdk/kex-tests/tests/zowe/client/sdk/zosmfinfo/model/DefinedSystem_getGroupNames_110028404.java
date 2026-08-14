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

public class DefinedSystem_getGroupNames_110028404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1398;

    public DefinedSystem_getGroupNames_110028404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1398 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term1398, term1398.getClass(), "systemNickName", "eqJfYWRaEL");
        setField(term1398, term1398.getClass(), "groupNames", "fhkbdRViHi");
        setField(term1398, term1398.getClass(), "cpcSerial", "uWHnvSvaPl");
        setField(term1398, term1398.getClass(), "zosVR", "kBdSllIBVz");
        setField(term1398, term1398.getClass(), "systemName", "TJmVBGfTML");
        setField(term1398, term1398.getClass(), "jesType", "tPlsykYBqO");
        setField(term1398, term1398.getClass(), "sysplexName", "bLPjGVBhlX");
        setField(term1398, term1398.getClass(), "jesMemberName", "whBvTVIIlC");
        setField(term1398, term1398.getClass(), "httpProxyName", "IgRJUzaCwW");
        setField(term1398, term1398.getClass(), "ftpDestinationName", "JUmudUmaaV");
        setField(term1398, term1398.getClass(), "url", "KoyGrUJeJW");
        setField(term1398, term1398.getClass(), "cpcName", "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupNames", argTypes, term1398, args);
    }

};


