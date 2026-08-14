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
import java.lang.Object;

public class ZosmfInfoResponse_getZosmfSafRealm_21436146117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2632;

    public ZosmfInfoResponse_getZosmfSafRealm_21436146117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2632 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term2717 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 2);
        Object term2718 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term2755 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term2632, term2632.getClass(), "zosVersion", "pORebkoRdD");
        setField(term2632, term2632.getClass(), "zosmfPort", "mXGCWJDOqA");
        setField(term2632, term2632.getClass(), "zosmfVersion", "dpNsDgfPso");
        setField(term2632, term2632.getClass(), "zosmfHostName", "hCWPJQKpdc");
        setField(term2632, term2632.getClass(), "zosmfSafRealm", "WzMEhMXkKx");
        setField(term2632, term2632.getClass(), "zosmfFullVersion", "XOiDvlDhdc");
        setField(term2632, term2632.getClass(), "apiVersion", "AdxvLJhNLe");
        setField(term2718, term2718.getClass(), "pluginVersion", "lHfTrWKMPk");
        setField(term2718, term2718.getClass(), "pluginDefaultName", "JDaAnsVTGV");
        setField(term2718, term2718.getClass(), "pluginStatus", "mLUZFTfjle");
        setElement(term2717, 0, term2718);
        setField(term2755, term2755.getClass(), "pluginVersion", "xIeFjkHkOe");
        setField(term2755, term2755.getClass(), "pluginDefaultName", "SdCKLMIYnX");
        setField(term2755, term2755.getClass(), "pluginStatus", "OJJtVNPyKZ");
        setElement(term2717, 1, term2755);
        setField(term2632, term2632.getClass(), "zosmfPluginsInfo", term2717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosmfSafRealm", argTypes, term2632, args);
    }

};


