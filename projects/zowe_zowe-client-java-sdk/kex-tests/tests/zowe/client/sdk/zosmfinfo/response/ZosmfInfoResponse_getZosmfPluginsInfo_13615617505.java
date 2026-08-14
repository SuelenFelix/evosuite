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

public class ZosmfInfoResponse_getZosmfPluginsInfo_13615617505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1851;

    public ZosmfInfoResponse_getZosmfPluginsInfo_13615617505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1851 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term1936 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 1);
        Object term1937 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term1851, term1851.getClass(), "zosVersion", "bWWfajKbEX");
        setField(term1851, term1851.getClass(), "zosmfPort", "cAPeiZHKGJ");
        setField(term1851, term1851.getClass(), "zosmfVersion", "LvJFtLBaxj");
        setField(term1851, term1851.getClass(), "zosmfHostName", "PHvxnGHptP");
        setField(term1851, term1851.getClass(), "zosmfSafRealm", "TimdotUuNC");
        setField(term1851, term1851.getClass(), "zosmfFullVersion", "PkWMRdJcBb");
        setField(term1851, term1851.getClass(), "apiVersion", "jSpAteRute");
        setField(term1937, term1937.getClass(), "pluginVersion", "swZVeJAxjt");
        setField(term1937, term1937.getClass(), "pluginDefaultName", "xOcJIiQQDu");
        setField(term1937, term1937.getClass(), "pluginStatus", "GVizqqzXpy");
        setElement(term1936, 0, term1937);
        setField(term1851, term1851.getClass(), "zosmfPluginsInfo", term1936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosmfPluginsInfo", argTypes, term1851, args);
    }

};


