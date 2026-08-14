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

public class Member_getMnorc_8059418258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1320;

    public Member_getMnorc_8059418258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1333 = new Long(4178434741742309755L);
        Long term1335 = new Long(-2068172595987555756L);
        Long term1361 = new Long(-6292278961887936280L);
        Long term1363 = new Long(-6645965768855543712L);
        Long term1365 = new Long(4784595517102746672L);
        term1320 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term1320, term1320.getClass(), "member", "ffYhPOzlUs");
        setField(term1320, term1320.getClass(), "vers", term1333);
        setField(term1320, term1320.getClass(), "mod", term1335);
        setField(term1320, term1320.getClass(), "c4date", "MLqYREekMl");
        setField(term1320, term1320.getClass(), "m4date", "ytSBIKXogI");
        setField(term1320, term1320.getClass(), "cnorc", term1361);
        setField(term1320, term1320.getClass(), "inorc", term1363);
        setField(term1320, term1320.getClass(), "mnorc", term1365);
        setField(term1320, term1320.getClass(), "mtime", "nHXjMycHlU");
        setField(term1320, term1320.getClass(), "msec", "ieCtQFdkii");
        setField(term1320, term1320.getClass(), "user", "dEnhdmILtU");
        setField(term1320, term1320.getClass(), "sclm", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMnorc", argTypes, term1320, args);
    }

};


