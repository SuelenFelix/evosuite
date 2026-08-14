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

public class DsnCreateInputData_Builder_dataclass_2809938784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26704;

    public DsnCreateInputData_Builder_dataclass_2809938784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26753 = new Integer(-1222006000);
        Integer term26755 = new Integer(2095798786);
        Integer term26757 = new Integer(-1565502840);
        Integer term26759 = new Integer(344323424);
        Integer term26773 = new Integer(9726679);
        Integer term26775 = new Integer(-25637976);
        term26704 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term26704, term26704.getClass(), "volser", "uUgJfKAzDM");
        setField(term26704, term26704.getClass(), "unit", "gZPZNkweEp");
        setField(term26704, term26704.getClass(), "dsorg", "vfennwtmqe");
        setField(term26704, term26704.getClass(), "alcunit", "zZxoNkohbw");
        setField(term26704, term26704.getClass(), "primary", term26753);
        setField(term26704, term26704.getClass(), "secondary", term26755);
        setField(term26704, term26704.getClass(), "dirblk", term26757);
        setField(term26704, term26704.getClass(), "avgblk", term26759);
        setField(term26704, term26704.getClass(), "recfm", "DQrjPcLysX");
        setField(term26704, term26704.getClass(), "blksize", term26773);
        setField(term26704, term26704.getClass(), "lrecl", term26775);
        setField(term26704, term26704.getClass(), "storclass", "VWPFyrpmmb");
        setField(term26704, term26704.getClass(), "mgntclass", "gYYKrIeThw");
        setField(term26704, term26704.getClass(), "dataclass", "UsxeLMVkAK");
        setField(term26704, term26704.getClass(), "dsntype", "ITrhiKKzcb");
        setBooleanField(term26704, term26704.getClass(), "showAttributes", true);
        setField(term26704, term26704.getClass(), "size", "qMKmSzOQXg");
        setField(term26704, term26704.getClass(), "responseTimeout", "CURQCMkqbZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VZwkkQktrm";
        callMethod(klass, "dataclass", argTypes, term26704, args);
    }

};


