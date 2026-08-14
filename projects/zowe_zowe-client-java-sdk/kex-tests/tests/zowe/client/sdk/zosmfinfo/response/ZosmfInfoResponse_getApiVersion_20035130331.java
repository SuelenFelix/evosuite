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

public class ZosmfInfoResponse_getApiVersion_20035130331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;

    public ZosmfInfoResponse_getApiVersion_20035130331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term240 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 5);
        Object term241 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term278 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term315 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term352 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term389 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term155, term155.getClass(), "zosVersion", "MjGYSRKTNF");
        setField(term155, term155.getClass(), "zosmfPort", "hRNSzYYIrc");
        setField(term155, term155.getClass(), "zosmfVersion", "RMFIsYGgne");
        setField(term155, term155.getClass(), "zosmfHostName", "NRdvgJlhkX");
        setField(term155, term155.getClass(), "zosmfSafRealm", "uuaPigETmJ");
        setField(term155, term155.getClass(), "zosmfFullVersion", "MxlszYVzRf");
        setField(term155, term155.getClass(), "apiVersion", "LQFpaHEwXR");
        setField(term241, term241.getClass(), "pluginVersion", "oVcInYnLWB");
        setField(term241, term241.getClass(), "pluginDefaultName", "aJlieCFVtF");
        setField(term241, term241.getClass(), "pluginStatus", "ZiaGIbnzTs");
        setElement(term240, 0, term241);
        setField(term278, term278.getClass(), "pluginVersion", "tbcdzjIfER");
        setField(term278, term278.getClass(), "pluginDefaultName", "HyxfbSQYBe");
        setField(term278, term278.getClass(), "pluginStatus", "pCTimMblYc");
        setElement(term240, 1, term278);
        setField(term315, term315.getClass(), "pluginVersion", "hNxWaHcfhY");
        setField(term315, term315.getClass(), "pluginDefaultName", "RkybSrpybU");
        setField(term315, term315.getClass(), "pluginStatus", "xOEqzGAmDU");
        setElement(term240, 2, term315);
        setField(term352, term352.getClass(), "pluginVersion", "eZFUvlxvGV");
        setField(term352, term352.getClass(), "pluginDefaultName", "BYqFIqCKAV");
        setField(term352, term352.getClass(), "pluginStatus", "vrQLuWIDJX");
        setElement(term240, 3, term352);
        setField(term389, term389.getClass(), "pluginVersion", "flxyYxBRtu");
        setField(term389, term389.getClass(), "pluginDefaultName", "OclPbYPkcH");
        setField(term389, term389.getClass(), "pluginStatus", "IoAlmYsBwc");
        setElement(term240, 4, term389);
        setField(term155, term155.getClass(), "zosmfPluginsInfo", term240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getApiVersion", argTypes, term155, args);
    }

};


