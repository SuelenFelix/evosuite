package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class UssListInputData_Builder_build_81414420213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45817;

    public UssListInputData_Builder_build_81414420213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45830 = new Integer(-1048298087);
        Integer term45868 = new Integer(292681826);
        Class<? extends Object> term45979 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term45978 = ((Class) term45979).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term45978).setAccessible(true);
        Object enum138 = ((Field) term45978).get((Object) null);
        Integer term45914 = new Integer(458147407);
        term45817 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term45817, term45817.getClass(), "path", "EKjQdtKxAM");
        setField(term45817, term45817.getClass(), "maxLength", term45830);
        setField(term45817, term45817.getClass(), "group", "TXZAIPQJHt");
        setField(term45817, term45817.getClass(), "user", "DIbeDHICho");
        setField(term45817, term45817.getClass(), "mtime", "dJGPlmSRnz");
        setField(term45817, term45817.getClass(), "size", term45868);
        setField(term45817, term45817.getClass(), "name", "DPskuFUobI");
        setField(term45817, term45817.getClass(), "perm", "wBGfLpNNiZ");
        setField(term45817, term45817.getClass(), "type", enum138);
        setField(term45817, term45817.getClass(), "depth", term45914);
        setBooleanField(term45817, term45817.getClass(), "filesys", false);
        setBooleanField(term45817, term45817.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term45817, args);
    }

};


