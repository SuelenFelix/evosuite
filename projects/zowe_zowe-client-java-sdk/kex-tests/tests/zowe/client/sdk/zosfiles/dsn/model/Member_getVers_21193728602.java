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

public class Member_getVers_21193728602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;

    public Member_getVers_21193728602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term343 = new Long(-2813493605142626659L);
        Long term345 = new Long(-8885298608300233488L);
        Long term371 = new Long(-4325723315152823407L);
        Long term373 = new Long(2535595959091595249L);
        Long term375 = new Long(-5476826692763582090L);
        term330 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term330, term330.getClass(), "member", "oVcInYnLWB");
        setField(term330, term330.getClass(), "vers", term343);
        setField(term330, term330.getClass(), "mod", term345);
        setField(term330, term330.getClass(), "c4date", "aJlieCFVtF");
        setField(term330, term330.getClass(), "m4date", "ZiaGIbnzTs");
        setField(term330, term330.getClass(), "cnorc", term371);
        setField(term330, term330.getClass(), "inorc", term373);
        setField(term330, term330.getClass(), "mnorc", term375);
        setField(term330, term330.getClass(), "mtime", "tbcdzjIfER");
        setField(term330, term330.getClass(), "msec", "HyxfbSQYBe");
        setField(term330, term330.getClass(), "user", "pCTimMblYc");
        setField(term330, term330.getClass(), "sclm", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVers", argTypes, term330, args);
    }

};


