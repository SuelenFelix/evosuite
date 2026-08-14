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
import java.lang.Long;

public class Member_toString_73191426313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2145;

    public Member_toString_73191426313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2158 = new Long(-8658027316505137504L);
        Long term2160 = new Long(414749984815662075L);
        Long term2186 = new Long(463622836963501975L);
        Long term2188 = new Long(305759998609888272L);
        Long term2190 = new Long(-8654565919063661957L);
        term2145 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term2145, term2145.getClass(), "member", "xOcJIiQQDu");
        setField(term2145, term2145.getClass(), "vers", term2158);
        setField(term2145, term2145.getClass(), "mod", term2160);
        setField(term2145, term2145.getClass(), "c4date", "GVizqqzXpy");
        setField(term2145, term2145.getClass(), "m4date", "JqXGgAhZPl");
        setField(term2145, term2145.getClass(), "cnorc", term2186);
        setField(term2145, term2145.getClass(), "inorc", term2188);
        setField(term2145, term2145.getClass(), "mnorc", term2190);
        setField(term2145, term2145.getClass(), "mtime", "jiKYgYHqIS");
        setField(term2145, term2145.getClass(), "msec", "DfISiziTgG");
        setField(term2145, term2145.getClass(), "user", "XqgfKFvPSD");
        setField(term2145, term2145.getClass(), "sclm", "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2145, args);
    }

};


