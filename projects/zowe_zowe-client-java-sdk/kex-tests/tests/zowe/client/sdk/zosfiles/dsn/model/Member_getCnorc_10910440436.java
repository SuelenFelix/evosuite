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

public class Member_getCnorc_10910440436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990;

    public Member_getCnorc_10910440436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1003 = new Long(6855071767938501807L);
        Long term1005 = new Long(-5892135042702373494L);
        Long term1031 = new Long(5262507301787091109L);
        Long term1033 = new Long(-6823727938421990489L);
        Long term1035 = new Long(-484994522244390100L);
        term990 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term990, term990.getClass(), "member", "gGSMzuGICf");
        setField(term990, term990.getClass(), "vers", term1003);
        setField(term990, term990.getClass(), "mod", term1005);
        setField(term990, term990.getClass(), "c4date", "hxCBltsObl");
        setField(term990, term990.getClass(), "m4date", "BndsHwAFMv");
        setField(term990, term990.getClass(), "cnorc", term1031);
        setField(term990, term990.getClass(), "inorc", term1033);
        setField(term990, term990.getClass(), "mnorc", term1035);
        setField(term990, term990.getClass(), "mtime", "GzFkzHGYFt");
        setField(term990, term990.getClass(), "msec", "tShwQLRGNe");
        setField(term990, term990.getClass(), "user", "LvtrsXUliU");
        setField(term990, term990.getClass(), "sclm", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnorc", argTypes, term990, args);
    }

};


