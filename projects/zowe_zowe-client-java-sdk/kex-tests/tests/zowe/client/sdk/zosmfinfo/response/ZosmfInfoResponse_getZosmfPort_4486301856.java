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

public class ZosmfInfoResponse_getZosmfPort_4486301856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2074;

    public ZosmfInfoResponse_getZosmfPort_4486301856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2074 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term2159 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 6);
        Object term2160 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term2197 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term2234 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term2271 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term2308 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term2345 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term2074, term2074.getClass(), "zosVersion", "JqXGgAhZPl");
        setField(term2074, term2074.getClass(), "zosmfPort", "jiKYgYHqIS");
        setField(term2074, term2074.getClass(), "zosmfVersion", "DfISiziTgG");
        setField(term2074, term2074.getClass(), "zosmfHostName", "XqgfKFvPSD");
        setField(term2074, term2074.getClass(), "zosmfSafRealm", "JiVRgTZvKc");
        setField(term2074, term2074.getClass(), "zosmfFullVersion", "XPKmummaqg");
        setField(term2074, term2074.getClass(), "apiVersion", "BKLfkLiZTH");
        setField(term2160, term2160.getClass(), "pluginVersion", "SPpkrGcPRr");
        setField(term2160, term2160.getClass(), "pluginDefaultName", "sEccwbJKYE");
        setField(term2160, term2160.getClass(), "pluginStatus", "AWRooQKkdW");
        setElement(term2159, 0, term2160);
        setField(term2197, term2197.getClass(), "pluginVersion", "vjxIhXHxGR");
        setField(term2197, term2197.getClass(), "pluginDefaultName", "QXzGXbEXMu");
        setField(term2197, term2197.getClass(), "pluginStatus", "qxSDVejjiY");
        setElement(term2159, 1, term2197);
        setField(term2234, term2234.getClass(), "pluginVersion", "xBsXSDjXYK");
        setField(term2234, term2234.getClass(), "pluginDefaultName", "sEnIVFtZuQ");
        setField(term2234, term2234.getClass(), "pluginStatus", "ZVecLZMLHF");
        setElement(term2159, 2, term2234);
        setField(term2271, term2271.getClass(), "pluginVersion", "fztQhjqwdP");
        setField(term2271, term2271.getClass(), "pluginDefaultName", "eVpkWxjuki");
        setField(term2271, term2271.getClass(), "pluginStatus", "SJiQaLvSKv");
        setElement(term2159, 3, term2271);
        setField(term2308, term2308.getClass(), "pluginVersion", "OEXDRUKcFl");
        setField(term2308, term2308.getClass(), "pluginDefaultName", "RYdKCNNMBR");
        setField(term2308, term2308.getClass(), "pluginStatus", "yGtHPyvYiQ");
        setElement(term2159, 4, term2308);
        setField(term2345, term2345.getClass(), "pluginVersion", "MvRIxilFMJ");
        setField(term2345, term2345.getClass(), "pluginDefaultName", "iNwOJRBEjp");
        setField(term2345, term2345.getClass(), "pluginStatus", "XylxrMBraH");
        setElement(term2159, 5, term2345);
        setField(term2074, term2074.getClass(), "zosmfPluginsInfo", term2159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosmfPort", argTypes, term2074, args);
    }

};


