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

public class UnixZfs_getDiribc_154830440414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2200;

    public UnixZfs_getDiribc_154830440414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2261 = new Long(-7115418542247301000L);
        Long term2263 = new Long(8034714140377562739L);
        Long term2265 = new Long(-2924531382671518368L);
        Long term2267 = new Long(-3948863953565024517L);
        Long term2269 = new Long(-6587807377747738663L);
        Long term2283 = new Long(-6301101997917060727L);
        Long term2285 = new Long(8166095254618543564L);
        Long term2287 = new Long(-4598158870068953328L);
        Long term2289 = new Long(138235087558060686L);
        Long term2291 = new Long(5381386339318883012L);
        term2200 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term2200, term2200.getClass(), "name", "PkWMRdJcBb");
        setField(term2200, term2200.getClass(), "mountpoint", "jSpAteRute");
        setField(term2200, term2200.getClass(), "fstname", "swZVeJAxjt");
        setField(term2200, term2200.getClass(), "status", "xOcJIiQQDu");
        setField(term2200, term2200.getClass(), "mode", "GVizqqzXpy");
        setField(term2200, term2200.getClass(), "dev", term2261);
        setField(term2200, term2200.getClass(), "fstype", term2263);
        setField(term2200, term2200.getClass(), "bsize", term2265);
        setField(term2200, term2200.getClass(), "bavail", term2267);
        setField(term2200, term2200.getClass(), "blocks", term2269);
        setField(term2200, term2200.getClass(), "sysname", "JqXGgAhZPl");
        setField(term2200, term2200.getClass(), "readibc", term2283);
        setField(term2200, term2200.getClass(), "writeibc", term2285);
        setField(term2200, term2200.getClass(), "diribc", term2287);
        setField(term2200, term2200.getClass(), "returnedRows", term2289);
        setField(term2200, term2200.getClass(), "totalRows", term2291);
        setBooleanField(term2200, term2200.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiribc", argTypes, term2200, args);
    }

};


