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

public class UnixZfs_getName_12240716011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public UnixZfs_getName_12240716011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term259 = new Long(-2813493605142626659L);
        Long term261 = new Long(-8885298608300233488L);
        Long term263 = new Long(-4325723315152823407L);
        Long term265 = new Long(2535595959091595249L);
        Long term267 = new Long(-5476826692763582090L);
        Long term281 = new Long(-872011222785455006L);
        Long term283 = new Long(-316468845751588286L);
        Long term285 = new Long(5127676408959197577L);
        Long term287 = new Long(-6573104506744284592L);
        Long term289 = new Long(-4920224193275732920L);
        term198 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term198, term198.getClass(), "name", "NRdvgJlhkX");
        setField(term198, term198.getClass(), "mountpoint", "uuaPigETmJ");
        setField(term198, term198.getClass(), "fstname", "MxlszYVzRf");
        setField(term198, term198.getClass(), "status", "LQFpaHEwXR");
        setField(term198, term198.getClass(), "mode", "oVcInYnLWB");
        setField(term198, term198.getClass(), "dev", term259);
        setField(term198, term198.getClass(), "fstype", term261);
        setField(term198, term198.getClass(), "bsize", term263);
        setField(term198, term198.getClass(), "bavail", term265);
        setField(term198, term198.getClass(), "blocks", term267);
        setField(term198, term198.getClass(), "sysname", "aJlieCFVtF");
        setField(term198, term198.getClass(), "readibc", term281);
        setField(term198, term198.getClass(), "writeibc", term283);
        setField(term198, term198.getClass(), "diribc", term285);
        setField(term198, term198.getClass(), "returnedRows", term287);
        setField(term198, term198.getClass(), "totalRows", term289);
        setBooleanField(term198, term198.getClass(), "moreRows", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term198, args);
    }

};


