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

public class UnixZfs_getBlocks_183240818110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1584;

    public UnixZfs_getBlocks_183240818110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1645 = new Long(-5216789073301458893L);
        Long term1647 = new Long(-1832940336320585644L);
        Long term1649 = new Long(-8033714905181142681L);
        Long term1651 = new Long(-9040825890007374809L);
        Long term1653 = new Long(1368340889161782793L);
        Long term1667 = new Long(-5786861555969446503L);
        Long term1669 = new Long(2354625302846375590L);
        Long term1671 = new Long(7276637106827860087L);
        Long term1673 = new Long(-3936701866695933852L);
        Long term1675 = new Long(1215116475929634177L);
        term1584 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term1584, term1584.getClass(), "name", "fhkbdRViHi");
        setField(term1584, term1584.getClass(), "mountpoint", "uWHnvSvaPl");
        setField(term1584, term1584.getClass(), "fstname", "kBdSllIBVz");
        setField(term1584, term1584.getClass(), "status", "TJmVBGfTML");
        setField(term1584, term1584.getClass(), "mode", "tPlsykYBqO");
        setField(term1584, term1584.getClass(), "dev", term1645);
        setField(term1584, term1584.getClass(), "fstype", term1647);
        setField(term1584, term1584.getClass(), "bsize", term1649);
        setField(term1584, term1584.getClass(), "bavail", term1651);
        setField(term1584, term1584.getClass(), "blocks", term1653);
        setField(term1584, term1584.getClass(), "sysname", "bLPjGVBhlX");
        setField(term1584, term1584.getClass(), "readibc", term1667);
        setField(term1584, term1584.getClass(), "writeibc", term1669);
        setField(term1584, term1584.getClass(), "diribc", term1671);
        setField(term1584, term1584.getClass(), "returnedRows", term1673);
        setField(term1584, term1584.getClass(), "totalRows", term1675);
        setBooleanField(term1584, term1584.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlocks", argTypes, term1584, args);
    }

};


