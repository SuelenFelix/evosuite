package zowe.client.sdk.zosmfinfo.model;

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
import static zowe.client.sdk.zosmfinfo.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefinedSystem_getCpcSerial_11876944292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public DefinedSystem_getCpcSerial_11876944292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term868, term868.getClass(), "systemNickName", "aKnKipADSo");
        setField(term868, term868.getClass(), "groupNames", "wSQxaModmm");
        setField(term868, term868.getClass(), "cpcSerial", "UlajhuVLaP");
        setField(term868, term868.getClass(), "zosVR", "gGSMzuGICf");
        setField(term868, term868.getClass(), "systemName", "hxCBltsObl");
        setField(term868, term868.getClass(), "jesType", "BndsHwAFMv");
        setField(term868, term868.getClass(), "sysplexName", "GzFkzHGYFt");
        setField(term868, term868.getClass(), "jesMemberName", "tShwQLRGNe");
        setField(term868, term868.getClass(), "httpProxyName", "LvtrsXUliU");
        setField(term868, term868.getClass(), "ftpDestinationName", "xLbjWUgOIL");
        setField(term868, term868.getClass(), "url", "jDtqGUpnZN");
        setField(term868, term868.getClass(), "cpcName", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpcSerial", argTypes, term868, args);
    }

};


