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

public class ZosmfSystemsResponse_toString_3904270933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7932;

    public ZosmfSystemsResponse_toString_3904270933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7933 = new Long(-8400487765614892086L);
        term7932 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse"));
        Object[] term7935 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.DefinedSystem", 3);
        Object term7936 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term8081 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        Object term8226 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term7932, term7932.getClass(), "numRows", term7933);
        setField(term7936, term7936.getClass(), "systemNickName", "PvmBHIXaMY");
        setField(term7936, term7936.getClass(), "groupNames", "hulYxtowxw");
        setField(term7936, term7936.getClass(), "cpcSerial", "GNEmuHPNcU");
        setField(term7936, term7936.getClass(), "zosVR", "IoSfuKDFRe");
        setField(term7936, term7936.getClass(), "systemName", "AWYyZiNfsm");
        setField(term7936, term7936.getClass(), "jesType", "ITRRYiuDwH");
        setField(term7936, term7936.getClass(), "sysplexName", "llRfwANcVF");
        setField(term7936, term7936.getClass(), "jesMemberName", "sUEeHQTWkA");
        setField(term7936, term7936.getClass(), "httpProxyName", "BDIRCxAWLA");
        setField(term7936, term7936.getClass(), "ftpDestinationName", "eOJfbiZLnb");
        setField(term7936, term7936.getClass(), "url", "nKZKnxWYCK");
        setField(term7936, term7936.getClass(), "cpcName", "JOqQxuzRuZ");
        setElement(term7935, 0, term7936);
        setField(term8081, term8081.getClass(), "systemNickName", "RSaoipUlsg");
        setField(term8081, term8081.getClass(), "groupNames", "cSHGbqKqlN");
        setField(term8081, term8081.getClass(), "cpcSerial", "pFAfANnxup");
        setField(term8081, term8081.getClass(), "zosVR", "FbSIUZyBXZ");
        setField(term8081, term8081.getClass(), "systemName", "mhQDwIyrRi");
        setField(term8081, term8081.getClass(), "jesType", "HpZXWDPhlg");
        setField(term8081, term8081.getClass(), "sysplexName", "lBOokzEPfe");
        setField(term8081, term8081.getClass(), "jesMemberName", "dtGZCsKXbW");
        setField(term8081, term8081.getClass(), "httpProxyName", "bdyhHbDAmJ");
        setField(term8081, term8081.getClass(), "ftpDestinationName", "BBXiTNHqGE");
        setField(term8081, term8081.getClass(), "url", "IEYhJmgCVd");
        setField(term8081, term8081.getClass(), "cpcName", "KSJeYkkvpk");
        setElement(term7935, 1, term8081);
        setField(term8226, term8226.getClass(), "systemNickName", "qUtkFGMNUV");
        setField(term8226, term8226.getClass(), "groupNames", "mGRiYhnMcR");
        setField(term8226, term8226.getClass(), "cpcSerial", "NFlvfJCVPO");
        setField(term8226, term8226.getClass(), "zosVR", "KarbTXFmUU");
        setField(term8226, term8226.getClass(), "systemName", "jiUSjqwSIQ");
        setField(term8226, term8226.getClass(), "jesType", "MgLCedQfoj");
        setField(term8226, term8226.getClass(), "sysplexName", "zgKiINdgNu");
        setField(term8226, term8226.getClass(), "jesMemberName", "zLMTXDQHYH");
        setField(term8226, term8226.getClass(), "httpProxyName", "PqywFWJlpE");
        setField(term8226, term8226.getClass(), "ftpDestinationName", "OzXRsFGTIp");
        setField(term8226, term8226.getClass(), "url", "TjWpyghUWN");
        setField(term8226, term8226.getClass(), "cpcName", "dkZFDZxcde");
        setElement(term7935, 2, term8226);
        setField(term7932, term7932.getClass(), "definedSystems", term7935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfSystemsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7932, args);
    }

};


