package zowe.client.sdk.zosfiles.dsn.model;

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
import static zowe.client.sdk.zosfiles.dsn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Member_getM4date_41072474619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2314;

    public Member_getM4date_41072474619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2314 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term2314, term2314.getClass(), "member", null);
        setField(term2314, term2314.getClass(), "vers", null);
        setField(term2314, term2314.getClass(), "mod", null);
        setField(term2314, term2314.getClass(), "c4date", null);
        setField(term2314, term2314.getClass(), "m4date", null);
        setField(term2314, term2314.getClass(), "cnorc", null);
        setField(term2314, term2314.getClass(), "inorc", null);
        setField(term2314, term2314.getClass(), "mnorc", null);
        setField(term2314, term2314.getClass(), "mtime", null);
        setField(term2314, term2314.getClass(), "msec", null);
        setField(term2314, term2314.getClass(), "user", null);
        setField(term2314, term2314.getClass(), "sclm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getM4date", argTypes, term2314, args);
    }

};


