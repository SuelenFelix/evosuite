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

public class UssListInputData_toString_161857395913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61704;

    public UssListInputData_toString_161857395913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term61717 = new Integer(-130649791);
        Integer term61755 = new Integer(534834644);
        Class<? extends Object> term61870 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term61869 = ((Class) term61870).getDeclaredField((String) "CHAR_SPECIAL_FILE");
        ((Field) term61869).setAccessible(true);
        Object enum169 = ((Field) term61869).get((Object) null);
        Integer term61805 = new Integer(1959097203);
        term61704 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term61704, term61704.getClass(), "path", "uePedtiAfL");
        setField(term61704, term61704.getClass(), "maxLength", term61717);
        setField(term61704, term61704.getClass(), "group", "AdSHvysxQB");
        setField(term61704, term61704.getClass(), "user", "jlraKkBWFA");
        setField(term61704, term61704.getClass(), "mtime", "mRBtFTxVdE");
        setField(term61704, term61704.getClass(), "size", term61755);
        setField(term61704, term61704.getClass(), "name", "IVacFDAZcj");
        setField(term61704, term61704.getClass(), "perm", "EEYmuwyVDP");
        setField(term61704, term61704.getClass(), "type", enum169);
        setField(term61704, term61704.getClass(), "depth", term61805);
        setBooleanField(term61704, term61704.getClass(), "filesys", false);
        setBooleanField(term61704, term61704.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term61704, args);
    }

};


