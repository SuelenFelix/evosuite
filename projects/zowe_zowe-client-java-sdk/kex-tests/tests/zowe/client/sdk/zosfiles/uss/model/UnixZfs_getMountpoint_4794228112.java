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

public class UnixZfs_getMountpoint_4794228112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;

    public UnixZfs_getMountpoint_4794228112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413 = new Long(8428634514691209827L);
        Long term415 = new Long(-2585684163342970173L);
        Long term417 = new Long(8059786003080744426L);
        Long term419 = new Long(-4365849114644724155L);
        Long term421 = new Long(2486810210675247493L);
        Long term435 = new Long(7009926388951271268L);
        Long term437 = new Long(-7672528020740371001L);
        Long term439 = new Long(-4502405999831680926L);
        Long term441 = new Long(1967728129628047933L);
        Long term443 = new Long(2120084523938730454L);
        term352 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term352, term352.getClass(), "name", "ZiaGIbnzTs");
        setField(term352, term352.getClass(), "mountpoint", "tbcdzjIfER");
        setField(term352, term352.getClass(), "fstname", "HyxfbSQYBe");
        setField(term352, term352.getClass(), "status", "pCTimMblYc");
        setField(term352, term352.getClass(), "mode", "hNxWaHcfhY");
        setField(term352, term352.getClass(), "dev", term413);
        setField(term352, term352.getClass(), "fstype", term415);
        setField(term352, term352.getClass(), "bsize", term417);
        setField(term352, term352.getClass(), "bavail", term419);
        setField(term352, term352.getClass(), "blocks", term421);
        setField(term352, term352.getClass(), "sysname", "RkybSrpybU");
        setField(term352, term352.getClass(), "readibc", term435);
        setField(term352, term352.getClass(), "writeibc", term437);
        setField(term352, term352.getClass(), "diribc", term439);
        setField(term352, term352.getClass(), "returnedRows", term441);
        setField(term352, term352.getClass(), "totalRows", term443);
        setBooleanField(term352, term352.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMountpoint", argTypes, term352, args);
    }

};


