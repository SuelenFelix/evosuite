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

public class Member_getMtime_13687855839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485;

    public Member_getMtime_13687855839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1498 = new Long(-7612550318181586304L);
        Long term1500 = new Long(-2170847986967241072L);
        Long term1526 = new Long(4044358158040652353L);
        Long term1528 = new Long(-4443169559037975007L);
        Long term1530 = new Long(-3842548265506930260L);
        term1485 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term1485, term1485.getClass(), "member", "eqJfYWRaEL");
        setField(term1485, term1485.getClass(), "vers", term1498);
        setField(term1485, term1485.getClass(), "mod", term1500);
        setField(term1485, term1485.getClass(), "c4date", "fhkbdRViHi");
        setField(term1485, term1485.getClass(), "m4date", "uWHnvSvaPl");
        setField(term1485, term1485.getClass(), "cnorc", term1526);
        setField(term1485, term1485.getClass(), "inorc", term1528);
        setField(term1485, term1485.getClass(), "mnorc", term1530);
        setField(term1485, term1485.getClass(), "mtime", "kBdSllIBVz");
        setField(term1485, term1485.getClass(), "msec", "TJmVBGfTML");
        setField(term1485, term1485.getClass(), "user", "tPlsykYBqO");
        setField(term1485, term1485.getClass(), "sclm", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMtime", argTypes, term1485, args);
    }

};


