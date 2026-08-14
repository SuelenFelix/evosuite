package zowe.client.sdk.core;

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
import static zowe.client.sdk.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SshConnection_toString_13684920195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;

    public SshConnection_toString_13684920195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = newInstance(Class.forName("zowe.client.sdk.core.SshConnection"));
        setField(term341, term341.getClass(), "host", "aJlieCFVtF");
        setIntField(term341, term341.getClass(), "port", -616727354);
        setField(term341, term341.getClass(), "user", "ZiaGIbnzTs");
        setField(term341, term341.getClass(), "password", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.core.SshConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term341, args);
    }

};


