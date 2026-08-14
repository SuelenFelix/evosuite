package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnDeleteInputData_getDatasetName_12300162975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16115;

    public DsnDeleteInputData_getDatasetName_12300162975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16163 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.DeleteType");
        Field term16162 = ((Class) term16163).getDeclaredField((String) "MEMBER");
        ((Field) term16162).setAccessible(true);
        Object enum8 = ((Field) term16162).get((Object) null);
        term16115 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData"));
        setField(term16115, term16115.getClass(), "type", enum8);
        setField(term16115, term16115.getClass(), "datasetName", "GTmoNrziyc");
        setField(term16115, term16115.getClass(), "memberName", "LvztehSlhM");
        setField(term16115, term16115.getClass(), "volume", "njvnWFTMxN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDeleteInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDatasetName", argTypes, term16115, args);
    }

};


