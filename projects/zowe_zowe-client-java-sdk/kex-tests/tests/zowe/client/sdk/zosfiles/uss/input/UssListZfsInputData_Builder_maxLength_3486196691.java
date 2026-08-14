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

public class UssListZfsInputData_Builder_maxLength_3486196691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25776;
     Object term25803;

    public UssListZfsInputData_Builder_maxLength_3486196691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25777 = new Integer(-1339778481);
        term25776 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData$Builder"));
        setField(term25776, term25776.getClass(), "maxLength", term25777);
        setField(term25776, term25776.getClass(), "path", "RYdKCNNMBR");
        setField(term25776, term25776.getClass(), "fsname", "yGtHPyvYiQ");
        term25803 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25803;
        callMethod(klass, "maxLength", argTypes, term25776, args);
    }

};


