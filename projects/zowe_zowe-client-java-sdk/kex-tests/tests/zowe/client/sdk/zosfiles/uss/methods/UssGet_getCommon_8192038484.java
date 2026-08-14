package zowe.client.sdk.zosfiles.uss.methods;

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
import static zowe.client.sdk.zosfiles.uss.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UssGet_getCommon_8192038484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5548;
     Object term5561;

    public UssGet_getCommon_8192038484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5548 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssGet"));
        setField(term5548, term5548.getClass(), "connection", null);
        setField(term5548, term5548.getClass(), "request", null);
        Integer term5587 = new Integer(1725571209);
        term5561 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term5561, term5561.getClass(), "search", "vQVyKLdtaz");
        setField(term5561, term5561.getClass(), "research", "OWKQODBLzb");
        setBooleanField(term5561, term5561.getClass(), "insensitive", true);
        setField(term5561, term5561.getClass(), "maxreturnsize", term5587);
        setIntField(term5561, term5561.getClass(), "queryCount", 568599855);
        setBooleanField(term5561, term5561.getClass(), "binary", false);
        setField(term5561, term5561.getClass(), "recordsRange", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.methods.UssGet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Object[] args = new Object[2];
        args[0] = "oVgzLbrsFr";
        args[1] = term5561;
        callMethod(klass, "getCommon", argTypes, term5548, args);
    }

};


