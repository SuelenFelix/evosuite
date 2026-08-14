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

public class ZosmfInfoResponse_withZosmfPluginsInfo_3397229919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3480;
     Object term3825;

    public ZosmfInfoResponse_withZosmfPluginsInfo_3397229919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3480 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term3565 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 7);
        Object term3566 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3603 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3640 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3677 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3714 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3751 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3788 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term3480, term3480.getClass(), "zosVersion", "HHmNoYxIGj");
        setField(term3480, term3480.getClass(), "zosmfPort", "PtirvZmsGt");
        setField(term3480, term3480.getClass(), "zosmfVersion", "HWkpTmtlrc");
        setField(term3480, term3480.getClass(), "zosmfHostName", "hMmaoREuCK");
        setField(term3480, term3480.getClass(), "zosmfSafRealm", "VeDtgDzGAN");
        setField(term3480, term3480.getClass(), "zosmfFullVersion", "aWYOWZFyaX");
        setField(term3480, term3480.getClass(), "apiVersion", "BRIVNtfUWU");
        setField(term3566, term3566.getClass(), "pluginVersion", "DbiCVtPPCT");
        setField(term3566, term3566.getClass(), "pluginDefaultName", "WzFopsaDuG");
        setField(term3566, term3566.getClass(), "pluginStatus", "PapWxkhEWe");
        setElement(term3565, 0, term3566);
        setField(term3603, term3603.getClass(), "pluginVersion", "smnHEqRFRx");
        setField(term3603, term3603.getClass(), "pluginDefaultName", "XYtryyobou");
        setField(term3603, term3603.getClass(), "pluginStatus", "OYbzXylRWW");
        setElement(term3565, 1, term3603);
        setField(term3640, term3640.getClass(), "pluginVersion", "DSNsTGYXDF");
        setField(term3640, term3640.getClass(), "pluginDefaultName", "sQvGcVjdEx");
        setField(term3640, term3640.getClass(), "pluginStatus", "rLHAoqXgPh");
        setElement(term3565, 2, term3640);
        setField(term3677, term3677.getClass(), "pluginVersion", "zUlRdimJtU");
        setField(term3677, term3677.getClass(), "pluginDefaultName", "vwbEQQNQrx");
        setField(term3677, term3677.getClass(), "pluginStatus", "xtftXXMbem");
        setElement(term3565, 3, term3677);
        setField(term3714, term3714.getClass(), "pluginVersion", "cudZvLMQon");
        setField(term3714, term3714.getClass(), "pluginDefaultName", "lihXWlGDxk");
        setField(term3714, term3714.getClass(), "pluginStatus", "JmcmxoGhIK");
        setElement(term3565, 4, term3714);
        setField(term3751, term3751.getClass(), "pluginVersion", "jXzmYyrnnT");
        setField(term3751, term3751.getClass(), "pluginDefaultName", "igCAtimmYB");
        setField(term3751, term3751.getClass(), "pluginStatus", "DyiXbeYIaN");
        setElement(term3565, 5, term3751);
        setField(term3788, term3788.getClass(), "pluginVersion", "VGizxZnyHX");
        setField(term3788, term3788.getClass(), "pluginDefaultName", "kVEZMHmRtR");
        setField(term3788, term3788.getClass(), "pluginStatus", "ekxGuOYIwi");
        setElement(term3565, 6, term3788);
        setField(term3480, term3480.getClass(), "zosmfPluginsInfo", term3565);
        term3825 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 1);
        Object term3826 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term3826, term3826.getClass(), "pluginVersion", "RbVQXSpxXy");
        setField(term3826, term3826.getClass(), "pluginDefaultName", "YpJbIgJWWv");
        setField(term3826, term3826.getClass(), "pluginStatus", "JppkknKVOw");
        setElement(term3825, 0, term3826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3825;
        callMethod(klass, "withZosmfPluginsInfo", argTypes, term3480, args);
    }

};


