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

public class Member_getMember_3854341711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;

    public Member_getMember_3854341711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term178 = new Long(7411271909051562686L);
        Long term180 = new Long(4872422362414183754L);
        Long term206 = new Long(6811161968424632369L);
        Long term208 = new Long(-7237588299778557629L);
        Long term210 = new Long(6967924379644551255L);
        term165 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term165, term165.getClass(), "member", "MjGYSRKTNF");
        setField(term165, term165.getClass(), "vers", term178);
        setField(term165, term165.getClass(), "mod", term180);
        setField(term165, term165.getClass(), "c4date", "hRNSzYYIrc");
        setField(term165, term165.getClass(), "m4date", "RMFIsYGgne");
        setField(term165, term165.getClass(), "cnorc", term206);
        setField(term165, term165.getClass(), "inorc", term208);
        setField(term165, term165.getClass(), "mnorc", term210);
        setField(term165, term165.getClass(), "mtime", "NRdvgJlhkX");
        setField(term165, term165.getClass(), "msec", "uuaPigETmJ");
        setField(term165, term165.getClass(), "user", "MxlszYVzRf");
        setField(term165, term165.getClass(), "sclm", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMember", argTypes, term165, args);
    }

};


