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

public class DefinedSystem_getUrl_104267471811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3253;

    public DefinedSystem_getUrl_104267471811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3253 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term3253, term3253.getClass(), "systemNickName", "FPvxVzzSvD");
        setField(term3253, term3253.getClass(), "groupNames", "WHcwFgsGFC");
        setField(term3253, term3253.getClass(), "cpcSerial", "HzqpegHiRq");
        setField(term3253, term3253.getClass(), "zosVR", "jwsfVjMoJT");
        setField(term3253, term3253.getClass(), "systemName", "ZfdXfCCFDf");
        setField(term3253, term3253.getClass(), "jesType", "MwwjNtdOFT");
        setField(term3253, term3253.getClass(), "sysplexName", "VYkqXKVlAJ");
        setField(term3253, term3253.getClass(), "jesMemberName", "XkIoWJRNwN");
        setField(term3253, term3253.getClass(), "httpProxyName", "aNWLJdrZMq");
        setField(term3253, term3253.getClass(), "ftpDestinationName", "HHmNoYxIGj");
        setField(term3253, term3253.getClass(), "url", "PtirvZmsGt");
        setField(term3253, term3253.getClass(), "cpcName", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term3253, args);
    }

};


