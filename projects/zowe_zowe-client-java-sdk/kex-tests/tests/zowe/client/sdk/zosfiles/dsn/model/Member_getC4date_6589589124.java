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

public class Member_getC4date_6589589124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;

    public Member_getC4date_6589589124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term673 = new Long(8428634514691209827L);
        Long term675 = new Long(-2585684163342970173L);
        Long term701 = new Long(8059786003080744426L);
        Long term703 = new Long(-4365849114644724155L);
        Long term705 = new Long(2486810210675247493L);
        term660 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term660, term660.getClass(), "member", "IoAlmYsBwc");
        setField(term660, term660.getClass(), "vers", term673);
        setField(term660, term660.getClass(), "mod", term675);
        setField(term660, term660.getClass(), "c4date", "TEParAifyi");
        setField(term660, term660.getClass(), "m4date", "OWDIEULEFu");
        setField(term660, term660.getClass(), "cnorc", term701);
        setField(term660, term660.getClass(), "inorc", term703);
        setField(term660, term660.getClass(), "mnorc", term705);
        setField(term660, term660.getClass(), "mtime", "dWRymuLBtr");
        setField(term660, term660.getClass(), "msec", "AijpHYOFuy");
        setField(term660, term660.getClass(), "user", "SbAoxhfrkn");
        setField(term660, term660.getClass(), "sclm", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getC4date", argTypes, term660, args);
    }

};


