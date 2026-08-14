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

public class ZosmfInfoResponse_getZosmfHostName_11170788254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1427;

    public ZosmfInfoResponse_getZosmfHostName_11170788254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1427 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term1512 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 4);
        Object term1513 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term1550 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term1587 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term1624 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term1427, term1427.getClass(), "zosVersion", "fhkbdRViHi");
        setField(term1427, term1427.getClass(), "zosmfPort", "uWHnvSvaPl");
        setField(term1427, term1427.getClass(), "zosmfVersion", "kBdSllIBVz");
        setField(term1427, term1427.getClass(), "zosmfHostName", "TJmVBGfTML");
        setField(term1427, term1427.getClass(), "zosmfSafRealm", "tPlsykYBqO");
        setField(term1427, term1427.getClass(), "zosmfFullVersion", "bLPjGVBhlX");
        setField(term1427, term1427.getClass(), "apiVersion", "whBvTVIIlC");
        setField(term1513, term1513.getClass(), "pluginVersion", "IgRJUzaCwW");
        setField(term1513, term1513.getClass(), "pluginDefaultName", "JUmudUmaaV");
        setField(term1513, term1513.getClass(), "pluginStatus", "KoyGrUJeJW");
        setElement(term1512, 0, term1513);
        setField(term1550, term1550.getClass(), "pluginVersion", "HqBOwkVqjD");
        setField(term1550, term1550.getClass(), "pluginDefaultName", "MAcUBcBckh");
        setField(term1550, term1550.getClass(), "pluginStatus", "oVgzLbrsFr");
        setElement(term1512, 1, term1550);
        setField(term1587, term1587.getClass(), "pluginVersion", "vQVyKLdtaz");
        setField(term1587, term1587.getClass(), "pluginDefaultName", "OWKQODBLzb");
        setField(term1587, term1587.getClass(), "pluginStatus", "wGmYcqUkgE");
        setElement(term1512, 2, term1587);
        setField(term1624, term1624.getClass(), "pluginVersion", "idgaQsnJpQ");
        setField(term1624, term1624.getClass(), "pluginDefaultName", "VgZnGoIFwQ");
        setField(term1624, term1624.getClass(), "pluginStatus", "jUbSRrkrYZ");
        setElement(term1512, 3, term1624);
        setField(term1427, term1427.getClass(), "zosmfPluginsInfo", term1512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosmfHostName", argTypes, term1427, args);
    }

};


