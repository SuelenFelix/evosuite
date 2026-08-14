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

public class Member_getMsec_41208949910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1650;

    public Member_getMsec_41208949910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1663 = new Long(-5788180182343976541L);
        Long term1665 = new Long(2936323121573284007L);
        Long term1691 = new Long(-1154553077993834885L);
        Long term1693 = new Long(-2850532706972744550L);
        Long term1695 = new Long(-2644215923136513282L);
        term1650 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term1650, term1650.getClass(), "member", "whBvTVIIlC");
        setField(term1650, term1650.getClass(), "vers", term1663);
        setField(term1650, term1650.getClass(), "mod", term1665);
        setField(term1650, term1650.getClass(), "c4date", "IgRJUzaCwW");
        setField(term1650, term1650.getClass(), "m4date", "JUmudUmaaV");
        setField(term1650, term1650.getClass(), "cnorc", term1691);
        setField(term1650, term1650.getClass(), "inorc", term1693);
        setField(term1650, term1650.getClass(), "mnorc", term1695);
        setField(term1650, term1650.getClass(), "mtime", "KoyGrUJeJW");
        setField(term1650, term1650.getClass(), "msec", "HqBOwkVqjD");
        setField(term1650, term1650.getClass(), "user", "MAcUBcBckh");
        setField(term1650, term1650.getClass(), "sclm", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMsec", argTypes, term1650, args);
    }

};


