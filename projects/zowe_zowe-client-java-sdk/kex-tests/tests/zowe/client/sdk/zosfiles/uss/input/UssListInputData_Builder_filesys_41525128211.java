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
import java.lang.Boolean;

public class UssListInputData_Builder_filesys_41525128211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44925;
     Object term45026;

    public UssListInputData_Builder_filesys_41525128211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44938 = new Integer(579005622);
        Integer term44976 = new Integer(-14890619);
        Class<? extends Object> term45089 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term45088 = ((Class) term45089).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term45088).setAccessible(true);
        Object enum136 = ((Field) term45088).get((Object) null);
        Integer term45022 = new Integer(1632125673);
        term44925 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term44925, term44925.getClass(), "path", "NBrvVzvQHe");
        setField(term44925, term44925.getClass(), "maxLength", term44938);
        setField(term44925, term44925.getClass(), "group", "FjOiNAfBOc");
        setField(term44925, term44925.getClass(), "user", "iCCsaLHohG");
        setField(term44925, term44925.getClass(), "mtime", "NJhGgctbdj");
        setField(term44925, term44925.getClass(), "size", term44976);
        setField(term44925, term44925.getClass(), "name", "MYWYUeLGOp");
        setField(term44925, term44925.getClass(), "perm", "tsTGdgQYUL");
        setField(term44925, term44925.getClass(), "type", enum136);
        setField(term44925, term44925.getClass(), "depth", term45022);
        setBooleanField(term44925, term44925.getClass(), "filesys", true);
        setBooleanField(term44925, term44925.getClass(), "symlinks", true);
        term45026 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term45026;
        callMethod(klass, "filesys", argTypes, term44925, args);
    }

};


