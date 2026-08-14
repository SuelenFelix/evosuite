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

public class UnixFile_getUid_2539435484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;

    public UnixFile_getUid_2539435484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3588 = new Long(5731563613239387113L);
        Long term3590 = new Long(3381333711768010594L);
        Long term3604 = new Long(3580984732036213717L);
        term3563 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term3563, term3563.getClass(), "name", "mvrkADEgpp");
        setField(term3563, term3563.getClass(), "mode", "pXOkjyeIRb");
        setField(term3563, term3563.getClass(), "size", term3588);
        setField(term3563, term3563.getClass(), "uid", term3590);
        setField(term3563, term3563.getClass(), "user", "GgZWSjxjyE");
        setField(term3563, term3563.getClass(), "gid", term3604);
        setField(term3563, term3563.getClass(), "group", "EeBVbzjcCI");
        setField(term3563, term3563.getClass(), "mtime", "UfQtPRyWRC");
        setField(term3563, term3563.getClass(), "target", "FPvxVzzSvD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUid", argTypes, term3563, args);
    }

};


