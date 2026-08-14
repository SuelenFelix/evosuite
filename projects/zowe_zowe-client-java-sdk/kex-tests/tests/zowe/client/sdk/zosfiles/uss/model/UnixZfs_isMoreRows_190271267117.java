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

public class UnixZfs_isMoreRows_190271267117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2662;

    public UnixZfs_isMoreRows_190271267117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2723 = new Long(3427570961451840069L);
        Long term2725 = new Long(4502292577098212311L);
        Long term2727 = new Long(-3730936709704460408L);
        Long term2729 = new Long(-8614778293741404325L);
        Long term2731 = new Long(-5447369594017685765L);
        Long term2745 = new Long(-5724112525188606013L);
        Long term2747 = new Long(-6100012593724108983L);
        Long term2749 = new Long(5465527210299101732L);
        Long term2751 = new Long(4699157009689333952L);
        Long term2753 = new Long(-78240609295693193L);
        term2662 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2662, term2662.getClass(), "name", "xBsXSDjXYK");
        setField(term2662, term2662.getClass(), "mountpoint", "sEnIVFtZuQ");
        setField(term2662, term2662.getClass(), "fstname", "ZVecLZMLHF");
        setField(term2662, term2662.getClass(), "status", "fztQhjqwdP");
        setField(term2662, term2662.getClass(), "mode", "eVpkWxjuki");
        setField(term2662, term2662.getClass(), "dev", term2723);
        setField(term2662, term2662.getClass(), "fstype", term2725);
        setField(term2662, term2662.getClass(), "bsize", term2727);
        setField(term2662, term2662.getClass(), "bavail", term2729);
        setField(term2662, term2662.getClass(), "blocks", term2731);
        setField(term2662, term2662.getClass(), "sysname", "SJiQaLvSKv");
        setField(term2662, term2662.getClass(), "readibc", term2745);
        setField(term2662, term2662.getClass(), "writeibc", term2747);
        setField(term2662, term2662.getClass(), "diribc", term2749);
        setField(term2662, term2662.getClass(), "returnedRows", term2751);
        setField(term2662, term2662.getClass(), "totalRows", term2753);
        setBooleanField(term2662, term2662.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMoreRows", argTypes, term2662, args);
    }

};


