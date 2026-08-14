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
import java.lang.Integer;

public class DsnCreateInputData_init_3503869100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3850;

    public DsnCreateInputData_init_3503869100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3899 = new Integer(568599855);
        Integer term3901 = new Integer(1162663216);
        Integer term3903 = new Integer(1484323161);
        Integer term3905 = new Integer(391863371);
        Integer term3919 = new Integer(-1922583790);
        Integer term3921 = new Integer(-616727354);
        term3850 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term3850, term3850.getClass(), "volser", "vKQukfbJUd");
        setField(term3850, term3850.getClass(), "unit", "lFRJFUMVbx");
        setField(term3850, term3850.getClass(), "dsorg", "sZdUNdggUW");
        setField(term3850, term3850.getClass(), "alcunit", "OqbwYQfvAe");
        setField(term3850, term3850.getClass(), "primary", term3899);
        setField(term3850, term3850.getClass(), "secondary", term3901);
        setField(term3850, term3850.getClass(), "dirblk", term3903);
        setField(term3850, term3850.getClass(), "avgblk", term3905);
        setField(term3850, term3850.getClass(), "recfm", "tRxZafjqIx");
        setField(term3850, term3850.getClass(), "blksize", term3919);
        setField(term3850, term3850.getClass(), "lrecl", term3921);
        setField(term3850, term3850.getClass(), "storclass", "DhjNLmRMCu");
        setField(term3850, term3850.getClass(), "mgntclass", "PgPzMSEjjX");
        setField(term3850, term3850.getClass(), "dataclass", "wzsPSPcRdj");
        setField(term3850, term3850.getClass(), "dsntype", "kGMQdqJYyB");
        setBooleanField(term3850, term3850.getClass(), "showAttributes", false);
        setField(term3850, term3850.getClass(), "size", "XJJNClzHRf");
        setField(term3850, term3850.getClass(), "responseTimeout", "HDaezxQfQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term3850;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


