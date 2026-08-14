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

public class Member_getSclm_25487278212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1980;

    public Member_getSclm_25487278212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1993 = new Long(5953383087795962419L);
        Long term1995 = new Long(7994303628307559416L);
        Long term2021 = new Long(2443640364875054177L);
        Long term2023 = new Long(-1610676979013636850L);
        Long term2025 = new Long(2062173786000223358L);
        term1980 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term1980, term1980.getClass(), "member", "cAPeiZHKGJ");
        setField(term1980, term1980.getClass(), "vers", term1993);
        setField(term1980, term1980.getClass(), "mod", term1995);
        setField(term1980, term1980.getClass(), "c4date", "LvJFtLBaxj");
        setField(term1980, term1980.getClass(), "m4date", "PHvxnGHptP");
        setField(term1980, term1980.getClass(), "cnorc", term2021);
        setField(term1980, term1980.getClass(), "inorc", term2023);
        setField(term1980, term1980.getClass(), "mnorc", term2025);
        setField(term1980, term1980.getClass(), "mtime", "TimdotUuNC");
        setField(term1980, term1980.getClass(), "msec", "PkWMRdJcBb");
        setField(term1980, term1980.getClass(), "user", "jSpAteRute");
        setField(term1980, term1980.getClass(), "sclm", "swZVeJAxjt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSclm", argTypes, term1980, args);
    }

};


