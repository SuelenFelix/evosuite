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

public class UnixZfs_getDev_19245926166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term968;

    public UnixZfs_getDev_19245926166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1029 = new Long(5953383087795962419L);
        Long term1031 = new Long(7994303628307559416L);
        Long term1033 = new Long(2443640364875054177L);
        Long term1035 = new Long(-1610676979013636850L);
        Long term1037 = new Long(2062173786000223358L);
        Long term1051 = new Long(-8658027316505137504L);
        Long term1053 = new Long(414749984815662075L);
        Long term1055 = new Long(463622836963501975L);
        Long term1057 = new Long(305759998609888272L);
        Long term1059 = new Long(-8654565919063661957L);
        term968 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term968, term968.getClass(), "name", "wSQxaModmm");
        setField(term968, term968.getClass(), "mountpoint", "UlajhuVLaP");
        setField(term968, term968.getClass(), "fstname", "gGSMzuGICf");
        setField(term968, term968.getClass(), "status", "hxCBltsObl");
        setField(term968, term968.getClass(), "mode", "BndsHwAFMv");
        setField(term968, term968.getClass(), "dev", term1029);
        setField(term968, term968.getClass(), "fstype", term1031);
        setField(term968, term968.getClass(), "bsize", term1033);
        setField(term968, term968.getClass(), "bavail", term1035);
        setField(term968, term968.getClass(), "blocks", term1037);
        setField(term968, term968.getClass(), "sysname", "GzFkzHGYFt");
        setField(term968, term968.getClass(), "readibc", term1051);
        setField(term968, term968.getClass(), "writeibc", term1053);
        setField(term968, term968.getClass(), "diribc", term1055);
        setField(term968, term968.getClass(), "returnedRows", term1057);
        setField(term968, term968.getClass(), "totalRows", term1059);
        setBooleanField(term968, term968.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDev", argTypes, term968, args);
    }

};


