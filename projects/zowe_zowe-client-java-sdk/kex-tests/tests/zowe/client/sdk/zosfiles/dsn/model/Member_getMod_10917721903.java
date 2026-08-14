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

public class Member_getMod_10917721903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;

    public Member_getMod_10917721903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term508 = new Long(-872011222785455006L);
        Long term510 = new Long(-316468845751588286L);
        Long term536 = new Long(5127676408959197577L);
        Long term538 = new Long(-6573104506744284592L);
        Long term540 = new Long(-4920224193275732920L);
        term495 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member"));
        setField(term495, term495.getClass(), "member", "RkybSrpybU");
        setField(term495, term495.getClass(), "vers", term508);
        setField(term495, term495.getClass(), "mod", term510);
        setField(term495, term495.getClass(), "c4date", "xOEqzGAmDU");
        setField(term495, term495.getClass(), "m4date", "eZFUvlxvGV");
        setField(term495, term495.getClass(), "cnorc", term536);
        setField(term495, term495.getClass(), "inorc", term538);
        setField(term495, term495.getClass(), "mnorc", term540);
        setField(term495, term495.getClass(), "mtime", "BYqFIqCKAV");
        setField(term495, term495.getClass(), "msec", "vrQLuWIDJX");
        setField(term495, term495.getClass(), "user", "flxyYxBRtu");
        setField(term495, term495.getClass(), "sclm", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMod", argTypes, term495, args);
    }

};


