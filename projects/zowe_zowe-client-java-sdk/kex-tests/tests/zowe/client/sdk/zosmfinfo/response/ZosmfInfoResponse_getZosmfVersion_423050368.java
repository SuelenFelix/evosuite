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

public class ZosmfInfoResponse_getZosmfVersion_423050368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2922;

    public ZosmfInfoResponse_getZosmfVersion_423050368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2922 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term3007 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 6);
        Object term3008 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3045 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3082 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3119 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3156 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term3193 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term2922, term2922.getClass(), "zosVersion", "AKNapTAfmD");
        setField(term2922, term2922.getClass(), "zosmfPort", "xJgPlLxpgC");
        setField(term2922, term2922.getClass(), "zosmfVersion", "EYtfuJaxiM");
        setField(term2922, term2922.getClass(), "zosmfHostName", "gCWtLVKVVe");
        setField(term2922, term2922.getClass(), "zosmfSafRealm", "fWKJoSoCwE");
        setField(term2922, term2922.getClass(), "zosmfFullVersion", "wfaXBpWAUH");
        setField(term2922, term2922.getClass(), "apiVersion", "VMeAzAHwZj");
        setField(term3008, term3008.getClass(), "pluginVersion", "PznxWXsZME");
        setField(term3008, term3008.getClass(), "pluginDefaultName", "ZzIujlwVsw");
        setField(term3008, term3008.getClass(), "pluginStatus", "LWyEaeIyAo");
        setElement(term3007, 0, term3008);
        setField(term3045, term3045.getClass(), "pluginVersion", "yVMkkQhvmN");
        setField(term3045, term3045.getClass(), "pluginDefaultName", "mvrkADEgpp");
        setField(term3045, term3045.getClass(), "pluginStatus", "pXOkjyeIRb");
        setElement(term3007, 1, term3045);
        setField(term3082, term3082.getClass(), "pluginVersion", "GgZWSjxjyE");
        setField(term3082, term3082.getClass(), "pluginDefaultName", "EeBVbzjcCI");
        setField(term3082, term3082.getClass(), "pluginStatus", "UfQtPRyWRC");
        setElement(term3007, 2, term3082);
        setField(term3119, term3119.getClass(), "pluginVersion", "FPvxVzzSvD");
        setField(term3119, term3119.getClass(), "pluginDefaultName", "WHcwFgsGFC");
        setField(term3119, term3119.getClass(), "pluginStatus", "HzqpegHiRq");
        setElement(term3007, 3, term3119);
        setField(term3156, term3156.getClass(), "pluginVersion", "jwsfVjMoJT");
        setField(term3156, term3156.getClass(), "pluginDefaultName", "ZfdXfCCFDf");
        setField(term3156, term3156.getClass(), "pluginStatus", "MwwjNtdOFT");
        setElement(term3007, 4, term3156);
        setField(term3193, term3193.getClass(), "pluginVersion", "VYkqXKVlAJ");
        setField(term3193, term3193.getClass(), "pluginDefaultName", "XkIoWJRNwN");
        setField(term3193, term3193.getClass(), "pluginStatus", "aNWLJdrZMq");
        setElement(term3007, 5, term3193);
        setField(term2922, term2922.getClass(), "zosmfPluginsInfo", term3007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosmfVersion", argTypes, term2922, args);
    }

};


