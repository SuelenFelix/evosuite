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

public class Member_getCnorc_109104404320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2315;

    public Member_getCnorc_109104404320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2315 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term2315, term2315.getClass(), "member", null);
        setField(term2315, term2315.getClass(), "vers", null);
        setField(term2315, term2315.getClass(), "mod", null);
        setField(term2315, term2315.getClass(), "c4date", null);
        setField(term2315, term2315.getClass(), "m4date", null);
        setField(term2315, term2315.getClass(), "cnorc", null);
        setField(term2315, term2315.getClass(), "inorc", null);
        setField(term2315, term2315.getClass(), "mnorc", null);
        setField(term2315, term2315.getClass(), "mtime", null);
        setField(term2315, term2315.getClass(), "msec", null);
        setField(term2315, term2315.getClass(), "user", null);
        setField(term2315, term2315.getClass(), "sclm", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnorc", argTypes, term2315, args);
    }

};


