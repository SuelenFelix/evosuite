package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixFile_getTarget_19314287989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4258;

    public UnixFile_getTarget_19314287989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4283 = new Long(-1145146470850585022L);
        Long term4285 = new Long(1993646237353405740L);
        Long term4299 = new Long(-4043093655001688454L);
        term4258 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term4258, term4258.getClass(), "name", "zUlRdimJtU");
        setField(term4258, term4258.getClass(), "mode", "vwbEQQNQrx");
        setField(term4258, term4258.getClass(), "size", term4283);
        setField(term4258, term4258.getClass(), "uid", term4285);
        setField(term4258, term4258.getClass(), "user", "xtftXXMbem");
        setField(term4258, term4258.getClass(), "gid", term4299);
        setField(term4258, term4258.getClass(), "group", "cudZvLMQon");
        setField(term4258, term4258.getClass(), "mtime", "lihXWlGDxk");
        setField(term4258, term4258.getClass(), "target", "JmcmxoGhIK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term4258, args);
    }

};


