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

public class Member_getInorc_609892537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1155;

    public Member_getInorc_609892537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1168 = new Long(1233889271256172047L);
        Long term1170 = new Long(6617340557564669657L);
        Long term1196 = new Long(1439298019805881866L);
        Long term1198 = new Long(-8708192233349544946L);
        Long term1200 = new Long(5907001541142728739L);
        term1155 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term1155, term1155.getClass(), "member", "jDtqGUpnZN");
        setField(term1155, term1155.getClass(), "vers", term1168);
        setField(term1155, term1155.getClass(), "mod", term1170);
        setField(term1155, term1155.getClass(), "c4date", "nGKItKLYNC");
        setField(term1155, term1155.getClass(), "m4date", "UiUYnPrcCi");
        setField(term1155, term1155.getClass(), "cnorc", term1196);
        setField(term1155, term1155.getClass(), "inorc", term1198);
        setField(term1155, term1155.getClass(), "mnorc", term1200);
        setField(term1155, term1155.getClass(), "mtime", "UoYtihxVaS");
        setField(term1155, term1155.getClass(), "msec", "JDswTTCZHV");
        setField(term1155, term1155.getClass(), "user", "onpbIeEKoi");
        setField(term1155, term1155.getClass(), "sclm", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInorc", argTypes, term1155, args);
    }

};


