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

public class Member_getUser_18304187611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1815;

    public Member_getUser_18304187611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1828 = new Long(-1468719814009985452L);
        Long term1830 = new Long(-7738503207562305297L);
        Long term1856 = new Long(3825396310311739952L);
        Long term1858 = new Long(-3838084482494604218L);
        Long term1860 = new Long(3892018155439224435L);
        term1815 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term1815, term1815.getClass(), "member", "vQVyKLdtaz");
        setField(term1815, term1815.getClass(), "vers", term1828);
        setField(term1815, term1815.getClass(), "mod", term1830);
        setField(term1815, term1815.getClass(), "c4date", "OWKQODBLzb");
        setField(term1815, term1815.getClass(), "m4date", "wGmYcqUkgE");
        setField(term1815, term1815.getClass(), "cnorc", term1856);
        setField(term1815, term1815.getClass(), "inorc", term1858);
        setField(term1815, term1815.getClass(), "mnorc", term1860);
        setField(term1815, term1815.getClass(), "mtime", "idgaQsnJpQ");
        setField(term1815, term1815.getClass(), "msec", "VgZnGoIFwQ");
        setField(term1815, term1815.getClass(), "user", "jUbSRrkrYZ");
        setField(term1815, term1815.getClass(), "sclm", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term1815, args);
    }

};


