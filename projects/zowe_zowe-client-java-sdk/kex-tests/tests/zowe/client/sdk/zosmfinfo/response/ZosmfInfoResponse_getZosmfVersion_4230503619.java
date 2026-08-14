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

public class ZosmfInfoResponse_getZosmfVersion_4230503619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4738;

    public ZosmfInfoResponse_getZosmfVersion_4230503619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4738 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        setField(term4738, term4738.getClass(), "zosVersion", null);
        setField(term4738, term4738.getClass(), "zosmfPort", null);
        setField(term4738, term4738.getClass(), "zosmfVersion", null);
        setField(term4738, term4738.getClass(), "zosmfHostName", null);
        setField(term4738, term4738.getClass(), "zosmfSafRealm", null);
        setField(term4738, term4738.getClass(), "zosmfFullVersion", null);
        setField(term4738, term4738.getClass(), "apiVersion", null);
        setField(term4738, term4738.getClass(), "zosmfPluginsInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosmfVersion", argTypes, term4738, args);
    }

};


