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

public class DsnRenameInputData_getSourceMemberName_13550825016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10550;

    public DsnRenameInputData_getSourceMemberName_13550825016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10610 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.RenameType");
        Field term10609 = ((Class) term10610).getDeclaredField((String) "MEMBER");
        ((Field) term10609).setAccessible(true);
        Object enum4 = ((Field) term10609).get((Object) null);
        term10550 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData"));
        setField(term10550, term10550.getClass(), "type", enum4);
        setField(term10550, term10550.getClass(), "sourceDatasetName", "dwlZSxlXOo");
        setField(term10550, term10550.getClass(), "destinationDatasetName", "lKrEAkypza");
        setField(term10550, term10550.getClass(), "sourceMemberName", "KtuuNAqGCQ");
        setField(term10550, term10550.getClass(), "destinationMemberName", "OGQsfjmReM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnRenameInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSourceMemberName", argTypes, term10550, args);
    }

};


