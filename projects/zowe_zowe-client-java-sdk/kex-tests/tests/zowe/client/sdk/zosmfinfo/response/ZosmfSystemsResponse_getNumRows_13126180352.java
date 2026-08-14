package zowe.client.sdk.zosmfinfo.response;

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
import static zowe.client.sdk.zosmfinfo.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ZosmfSystemsResponse_getNumRows_13126180352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7398;

    public ZosmfSystemsResponse_getNumRows_13126180352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7399 = new Long(-8257434502486459194L);
        term7398 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse"));
        Object[] term7401 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.DefinedSystem", 2);
        Object term7402 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term7547 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term7398, term7398.getClass(), "numRows", term7399);
        setField(term7402, term7402.getClass(), "systemNickName", "TXyHhqeCjR");
        setField(term7402, term7402.getClass(), "groupNames", "lZIgPZPgTu");
        setField(term7402, term7402.getClass(), "cpcSerial", "iuCxnHGMoW");
        setField(term7402, term7402.getClass(), "zosVR", "GPSEWEDSTo");
        setField(term7402, term7402.getClass(), "systemName", "RCOqfVsRHt");
        setField(term7402, term7402.getClass(), "jesType", "TSyCeEZPaT");
        setField(term7402, term7402.getClass(), "sysplexName", "JeZFtaqkzW");
        setField(term7402, term7402.getClass(), "jesMemberName", "vOVuNSCCLe");
        setField(term7402, term7402.getClass(), "httpProxyName", "fzeqPnzpnt");
        setField(term7402, term7402.getClass(), "ftpDestinationName", "RxbhrFBjkO");
        setField(term7402, term7402.getClass(), "url", "aanyiAOJCl");
        setField(term7402, term7402.getClass(), "cpcName", "VDokbsCuqq");
        setElement(term7401, 0, term7402);
        setField(term7547, term7547.getClass(), "systemNickName", "xClUIcPECX");
        setField(term7547, term7547.getClass(), "groupNames", "avhRaGZaBF");
        setField(term7547, term7547.getClass(), "cpcSerial", "JkgoRtImdE");
        setField(term7547, term7547.getClass(), "zosVR", "qFGKIJjlmV");
        setField(term7547, term7547.getClass(), "systemName", "IHqvyhMtuM");
        setField(term7547, term7547.getClass(), "jesType", "dAldIGYAXV");
        setField(term7547, term7547.getClass(), "sysplexName", "mLwibAPEsa");
        setField(term7547, term7547.getClass(), "jesMemberName", "zsWKWiTFuo");
        setField(term7547, term7547.getClass(), "httpProxyName", "UPUbwyHQKN");
        setField(term7547, term7547.getClass(), "ftpDestinationName", "lgQkrXANyI");
        setField(term7547, term7547.getClass(), "url", "MeTmRZXErV");
        setField(term7547, term7547.getClass(), "cpcName", "jNxbVmoZgq");
        setElement(term7401, 1, term7547);
        setField(term7398, term7398.getClass(), "definedSystems", term7401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumRows", argTypes, term7398, args);
    }

};


