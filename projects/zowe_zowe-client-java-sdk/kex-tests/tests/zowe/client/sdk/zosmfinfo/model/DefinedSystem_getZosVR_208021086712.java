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

public class DefinedSystem_getZosVR_208021086712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3518;

    public DefinedSystem_getZosVR_208021086712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3518 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term3518, term3518.getClass(), "systemNickName", "hMmaoREuCK");
        setField(term3518, term3518.getClass(), "groupNames", "VeDtgDzGAN");
        setField(term3518, term3518.getClass(), "cpcSerial", "aWYOWZFyaX");
        setField(term3518, term3518.getClass(), "zosVR", "BRIVNtfUWU");
        setField(term3518, term3518.getClass(), "systemName", "DbiCVtPPCT");
        setField(term3518, term3518.getClass(), "jesType", "WzFopsaDuG");
        setField(term3518, term3518.getClass(), "sysplexName", "PapWxkhEWe");
        setField(term3518, term3518.getClass(), "jesMemberName", "smnHEqRFRx");
        setField(term3518, term3518.getClass(), "httpProxyName", "XYtryyobou");
        setField(term3518, term3518.getClass(), "ftpDestinationName", "OYbzXylRWW");
        setField(term3518, term3518.getClass(), "url", "DSNsTGYXDF");
        setField(term3518, term3518.getClass(), "cpcName", "sQvGcVjdEx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosVR", argTypes, term3518, args);
    }

};


