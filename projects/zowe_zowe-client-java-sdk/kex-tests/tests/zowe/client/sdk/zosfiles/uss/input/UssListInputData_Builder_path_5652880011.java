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

public class UssListInputData_Builder_path_5652880011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40269;

    public UssListInputData_Builder_path_5652880011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40282 = new Integer(1622346318);
        Integer term40320 = new Integer(1048535127);
        Class<? extends Object> term40545 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term40544 = ((Class) term40545).getDeclaredField((String) "DIRECTORY");
        ((Field) term40544).setAccessible(true);
        Object enum126 = ((Field) term40544).get((Object) null);
        Integer term40362 = new Integer(-655067527);
        term40269 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term40269, term40269.getClass(), "path", "tlQSNgTkQX");
        setField(term40269, term40269.getClass(), "maxLength", term40282);
        setField(term40269, term40269.getClass(), "group", "PCipZnmBOF");
        setField(term40269, term40269.getClass(), "user", "zcorEihhLK");
        setField(term40269, term40269.getClass(), "mtime", "GrqozDKFOk");
        setField(term40269, term40269.getClass(), "size", term40320);
        setField(term40269, term40269.getClass(), "name", "CFyoseFGLF");
        setField(term40269, term40269.getClass(), "perm", "SFqCrhEWLm");
        setField(term40269, term40269.getClass(), "type", enum126);
        setField(term40269, term40269.getClass(), "depth", term40362);
        setBooleanField(term40269, term40269.getClass(), "filesys", false);
        setBooleanField(term40269, term40269.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GZdcJyZntS";
        callMethod(klass, "path", argTypes, term40269, args);
    }

};


