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

public class Member_getM4date_4107247465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825;

    public Member_getM4date_4107247465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term838 = new Long(7009926388951271268L);
        Long term840 = new Long(-7672528020740371001L);
        Long term866 = new Long(-4502405999831680926L);
        Long term868 = new Long(1967728129628047933L);
        Long term870 = new Long(2120084523938730454L);
        term825 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term825, term825.getClass(), "member", "Ghbwtircqb");
        setField(term825, term825.getClass(), "vers", term838);
        setField(term825, term825.getClass(), "mod", term840);
        setField(term825, term825.getClass(), "c4date", "xrwlQZdwCp");
        setField(term825, term825.getClass(), "m4date", "IDCWpPLRkE");
        setField(term825, term825.getClass(), "cnorc", term866);
        setField(term825, term825.getClass(), "inorc", term868);
        setField(term825, term825.getClass(), "mnorc", term870);
        setField(term825, term825.getClass(), "mtime", "nyiiPDVjAc");
        setField(term825, term825.getClass(), "msec", "aKnKipADSo");
        setField(term825, term825.getClass(), "user", "wSQxaModmm");
        setField(term825, term825.getClass(), "sclm", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getM4date", argTypes, term825, args);
    }

};


