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

public class UssListInputData_Builder_depth_102746991610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44463;
     Object term44566;

    public UssListInputData_Builder_depth_102746991610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44476 = new Integer(-817164822);
        Integer term44514 = new Integer(-1016503459);
        Class<? extends Object> term44629 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term44628 = ((Class) term44629).getDeclaredField((String) "FIFO_NAMED_PIPE");
        ((Field) term44628).setAccessible(true);
        Object enum135 = ((Field) term44628).get((Object) null);
        Integer term44562 = new Integer(-1968847291);
        term44463 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term44463, term44463.getClass(), "path", "zaloBqlrSo");
        setField(term44463, term44463.getClass(), "maxLength", term44476);
        setField(term44463, term44463.getClass(), "group", "vvoLrMGCoN");
        setField(term44463, term44463.getClass(), "user", "pXdglvyrQe");
        setField(term44463, term44463.getClass(), "mtime", "OcfNzHYdki");
        setField(term44463, term44463.getClass(), "size", term44514);
        setField(term44463, term44463.getClass(), "name", "uPuCVuZYOI");
        setField(term44463, term44463.getClass(), "perm", "TweMFhxNdj");
        setField(term44463, term44463.getClass(), "type", enum135);
        setField(term44463, term44463.getClass(), "depth", term44562);
        setBooleanField(term44463, term44463.getClass(), "filesys", true);
        setBooleanField(term44463, term44463.getClass(), "symlinks", false);
        term44566 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44566;
        callMethod(klass, "depth", argTypes, term44463, args);
    }

};


