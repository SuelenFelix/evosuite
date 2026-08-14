package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixZfs_getFstname_1194518183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;

    public UnixZfs_getFstname_1194518183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567 = new Long(6855071767938501807L);
        Long term569 = new Long(-5892135042702373494L);
        Long term571 = new Long(5262507301787091109L);
        Long term573 = new Long(-6823727938421990489L);
        Long term575 = new Long(-484994522244390100L);
        Long term589 = new Long(1233889271256172047L);
        Long term591 = new Long(6617340557564669657L);
        Long term593 = new Long(1439298019805881866L);
        Long term595 = new Long(-8708192233349544946L);
        Long term597 = new Long(5907001541142728739L);
        term506 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term506, term506.getClass(), "name", "xOEqzGAmDU");
        setField(term506, term506.getClass(), "mountpoint", "eZFUvlxvGV");
        setField(term506, term506.getClass(), "fstname", "BYqFIqCKAV");
        setField(term506, term506.getClass(), "status", "vrQLuWIDJX");
        setField(term506, term506.getClass(), "mode", "flxyYxBRtu");
        setField(term506, term506.getClass(), "dev", term567);
        setField(term506, term506.getClass(), "fstype", term569);
        setField(term506, term506.getClass(), "bsize", term571);
        setField(term506, term506.getClass(), "bavail", term573);
        setField(term506, term506.getClass(), "blocks", term575);
        setField(term506, term506.getClass(), "sysname", "OclPbYPkcH");
        setField(term506, term506.getClass(), "readibc", term589);
        setField(term506, term506.getClass(), "writeibc", term591);
        setField(term506, term506.getClass(), "diribc", term593);
        setField(term506, term506.getClass(), "returnedRows", term595);
        setField(term506, term506.getClass(), "totalRows", term597);
        setBooleanField(term506, term506.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFstname", argTypes, term506, args);
    }

};


