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

public class UssListInputData_getPerm_4436859568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59412;

    public UssListInputData_getPerm_4436859568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term59425 = new Integer(388157121);
        Integer term59463 = new Integer(1684998508);
        Class<? extends Object> term59574 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term59573 = ((Class) term59574).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term59573).setAccessible(true);
        Object enum164 = ((Field) term59573).get((Object) null);
        Integer term59509 = new Integer(-1476644457);
        term59412 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term59412, term59412.getClass(), "path", "nrQjODRMLD");
        setField(term59412, term59412.getClass(), "maxLength", term59425);
        setField(term59412, term59412.getClass(), "group", "PNoWXrsFic");
        setField(term59412, term59412.getClass(), "user", "QZBHZqZope");
        setField(term59412, term59412.getClass(), "mtime", "VBUahCvyxC");
        setField(term59412, term59412.getClass(), "size", term59463);
        setField(term59412, term59412.getClass(), "name", "MlzTkzKMCX");
        setField(term59412, term59412.getClass(), "perm", "UqKUbMyPMJ");
        setField(term59412, term59412.getClass(), "type", enum164);
        setField(term59412, term59412.getClass(), "depth", term59509);
        setBooleanField(term59412, term59412.getClass(), "filesys", true);
        setBooleanField(term59412, term59412.getClass(), "symlinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerm", argTypes, term59412, args);
    }

};


