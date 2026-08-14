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

public class ZosmfInfoResponse_getZosmfFullVersion_10516242593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1070;

    public ZosmfInfoResponse_getZosmfFullVersion_10516242593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1070 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term1155 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 3);
        Object term1156 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term1193 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term1230 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term1070, term1070.getClass(), "zosVersion", "xLbjWUgOIL");
        setField(term1070, term1070.getClass(), "zosmfPort", "jDtqGUpnZN");
        setField(term1070, term1070.getClass(), "zosmfVersion", "nGKItKLYNC");
        setField(term1070, term1070.getClass(), "zosmfHostName", "UiUYnPrcCi");
        setField(term1070, term1070.getClass(), "zosmfSafRealm", "UoYtihxVaS");
        setField(term1070, term1070.getClass(), "zosmfFullVersion", "JDswTTCZHV");
        setField(term1070, term1070.getClass(), "apiVersion", "onpbIeEKoi");
        setField(term1156, term1156.getClass(), "pluginVersion", "YRHGsAkhxb");
        setField(term1156, term1156.getClass(), "pluginDefaultName", "ffYhPOzlUs");
        setField(term1156, term1156.getClass(), "pluginStatus", "MLqYREekMl");
        setElement(term1155, 0, term1156);
        setField(term1193, term1193.getClass(), "pluginVersion", "ytSBIKXogI");
        setField(term1193, term1193.getClass(), "pluginDefaultName", "nHXjMycHlU");
        setField(term1193, term1193.getClass(), "pluginStatus", "ieCtQFdkii");
        setElement(term1155, 1, term1193);
        setField(term1230, term1230.getClass(), "pluginVersion", "dEnhdmILtU");
        setField(term1230, term1230.getClass(), "pluginDefaultName", "hoicvmsovO");
        setField(term1230, term1230.getClass(), "pluginStatus", "eqJfYWRaEL");
        setElement(term1155, 2, term1230);
        setField(term1070, term1070.getClass(), "zosmfPluginsInfo", term1155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosmfFullVersion", argTypes, term1070, args);
    }

};


