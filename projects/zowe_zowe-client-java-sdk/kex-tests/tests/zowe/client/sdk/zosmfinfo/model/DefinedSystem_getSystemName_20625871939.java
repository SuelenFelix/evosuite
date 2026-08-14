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

public class DefinedSystem_getSystemName_20625871939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2723;

    public DefinedSystem_getSystemName_20625871939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2723 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term2723, term2723.getClass(), "systemNickName", "XOiDvlDhdc");
        setField(term2723, term2723.getClass(), "groupNames", "AdxvLJhNLe");
        setField(term2723, term2723.getClass(), "cpcSerial", "lHfTrWKMPk");
        setField(term2723, term2723.getClass(), "zosVR", "JDaAnsVTGV");
        setField(term2723, term2723.getClass(), "systemName", "mLUZFTfjle");
        setField(term2723, term2723.getClass(), "jesType", "xIeFjkHkOe");
        setField(term2723, term2723.getClass(), "sysplexName", "SdCKLMIYnX");
        setField(term2723, term2723.getClass(), "jesMemberName", "OJJtVNPyKZ");
        setField(term2723, term2723.getClass(), "httpProxyName", "AKNapTAfmD");
        setField(term2723, term2723.getClass(), "ftpDestinationName", "xJgPlLxpgC");
        setField(term2723, term2723.getClass(), "url", "EYtfuJaxiM");
        setField(term2723, term2723.getClass(), "cpcName", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemName", argTypes, term2723, args);
    }

};


