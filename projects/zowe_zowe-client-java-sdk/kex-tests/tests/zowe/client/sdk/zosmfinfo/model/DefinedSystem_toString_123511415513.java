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

public class DefinedSystem_toString_123511415513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3783;

    public DefinedSystem_toString_123511415513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3783 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term3783, term3783.getClass(), "systemNickName", "rLHAoqXgPh");
        setField(term3783, term3783.getClass(), "groupNames", "zUlRdimJtU");
        setField(term3783, term3783.getClass(), "cpcSerial", "vwbEQQNQrx");
        setField(term3783, term3783.getClass(), "zosVR", "xtftXXMbem");
        setField(term3783, term3783.getClass(), "systemName", "cudZvLMQon");
        setField(term3783, term3783.getClass(), "jesType", "lihXWlGDxk");
        setField(term3783, term3783.getClass(), "sysplexName", "JmcmxoGhIK");
        setField(term3783, term3783.getClass(), "jesMemberName", "jXzmYyrnnT");
        setField(term3783, term3783.getClass(), "httpProxyName", "igCAtimmYB");
        setField(term3783, term3783.getClass(), "ftpDestinationName", "DyiXbeYIaN");
        setField(term3783, term3783.getClass(), "url", "VGizxZnyHX");
        setField(term3783, term3783.getClass(), "cpcName", "kVEZMHmRtR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3783, args);
    }

};


