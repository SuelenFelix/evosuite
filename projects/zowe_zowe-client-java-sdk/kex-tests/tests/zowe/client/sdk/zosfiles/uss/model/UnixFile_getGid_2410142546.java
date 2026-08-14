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

public class UnixFile_getGid_2410142546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3841;

    public UnixFile_getGid_2410142546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3866 = new Long(3288941170644426558L);
        Long term3868 = new Long(-8338004844694486146L);
        Long term3882 = new Long(6426732259596412988L);
        term3841 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term3841, term3841.getClass(), "name", "XkIoWJRNwN");
        setField(term3841, term3841.getClass(), "mode", "aNWLJdrZMq");
        setField(term3841, term3841.getClass(), "size", term3866);
        setField(term3841, term3841.getClass(), "uid", term3868);
        setField(term3841, term3841.getClass(), "user", "HHmNoYxIGj");
        setField(term3841, term3841.getClass(), "gid", term3882);
        setField(term3841, term3841.getClass(), "group", "PtirvZmsGt");
        setField(term3841, term3841.getClass(), "mtime", "HWkpTmtlrc");
        setField(term3841, term3841.getClass(), "target", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGid", argTypes, term3841, args);
    }

};


