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

public class UssListInputData_getSize_21293293726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58484;

    public UssListInputData_getSize_21293293726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term58497 = new Integer(371943306);
        Integer term58535 = new Integer(982388293);
        Class<? extends Object> term58648 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term58647 = ((Class) term58648).getDeclaredField((String) "FIFO_NAMED_PIPE");
        ((Field) term58647).setAccessible(true);
        Object enum162 = ((Field) term58647).get((Object) null);
        Integer term58583 = new Integer(-159494544);
        term58484 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term58484, term58484.getClass(), "path", "qnYaYSpDwO");
        setField(term58484, term58484.getClass(), "maxLength", term58497);
        setField(term58484, term58484.getClass(), "group", "dgbFDCdHtj");
        setField(term58484, term58484.getClass(), "user", "EKpdCBubDE");
        setField(term58484, term58484.getClass(), "mtime", "zMsSLTfGhl");
        setField(term58484, term58484.getClass(), "size", term58535);
        setField(term58484, term58484.getClass(), "name", "bEmHScVZaQ");
        setField(term58484, term58484.getClass(), "perm", "TcuXODkzBV");
        setField(term58484, term58484.getClass(), "type", enum162);
        setField(term58484, term58484.getClass(), "depth", term58583);
        setBooleanField(term58484, term58484.getClass(), "filesys", true);
        setBooleanField(term58484, term58484.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term58484, args);
    }

};


