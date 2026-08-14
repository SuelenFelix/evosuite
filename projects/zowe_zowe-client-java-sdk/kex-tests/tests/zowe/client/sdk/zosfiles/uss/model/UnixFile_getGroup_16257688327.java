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

public class UnixFile_getGroup_16257688327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3980;

    public UnixFile_getGroup_16257688327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4005 = new Long(185793058502220865L);
        Long term4007 = new Long(-7698746988132548371L);
        Long term4021 = new Long(2145420811068634601L);
        term3980 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term3980, term3980.getClass(), "name", "VeDtgDzGAN");
        setField(term3980, term3980.getClass(), "mode", "aWYOWZFyaX");
        setField(term3980, term3980.getClass(), "size", term4005);
        setField(term3980, term3980.getClass(), "uid", term4007);
        setField(term3980, term3980.getClass(), "user", "BRIVNtfUWU");
        setField(term3980, term3980.getClass(), "gid", term4021);
        setField(term3980, term3980.getClass(), "group", "DbiCVtPPCT");
        setField(term3980, term3980.getClass(), "mtime", "WzFopsaDuG");
        setField(term3980, term3980.getClass(), "target", "PapWxkhEWe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroup", argTypes, term3980, args);
    }

};


