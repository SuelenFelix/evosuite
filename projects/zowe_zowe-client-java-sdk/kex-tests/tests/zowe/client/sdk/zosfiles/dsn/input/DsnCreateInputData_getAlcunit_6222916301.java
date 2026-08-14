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

public class DsnCreateInputData_getAlcunit_6222916301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4106;

    public DsnCreateInputData_getAlcunit_6222916301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4155 = new Integer(-1955890973);
        Integer term4157 = new Integer(-2038273078);
        Integer term4159 = new Integer(1227103734);
        Integer term4161 = new Integer(-1339778481);
        Integer term4175 = new Integer(1725571209);
        Integer term4177 = new Integer(-522618178);
        term4106 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term4106, term4106.getClass(), "volser", "iikZEapDlu");
        setField(term4106, term4106.getClass(), "unit", "nhoHrZfnIN");
        setField(term4106, term4106.getClass(), "dsorg", "ZkMALXpEAZ");
        setField(term4106, term4106.getClass(), "alcunit", "tXfQjSqDzN");
        setField(term4106, term4106.getClass(), "primary", term4155);
        setField(term4106, term4106.getClass(), "secondary", term4157);
        setField(term4106, term4106.getClass(), "dirblk", term4159);
        setField(term4106, term4106.getClass(), "avgblk", term4161);
        setField(term4106, term4106.getClass(), "recfm", "BjugTaMcxJ");
        setField(term4106, term4106.getClass(), "blksize", term4175);
        setField(term4106, term4106.getClass(), "lrecl", term4177);
        setField(term4106, term4106.getClass(), "storclass", "vGiuZVPJNH");
        setField(term4106, term4106.getClass(), "mgntclass", "tlzpzIjMib");
        setField(term4106, term4106.getClass(), "dataclass", "AZdLeSugwv");
        setField(term4106, term4106.getClass(), "dsntype", "RMsXuyzKJV");
        setBooleanField(term4106, term4106.getClass(), "showAttributes", false);
        setField(term4106, term4106.getClass(), "size", "FwPbDZcHmB");
        setField(term4106, term4106.getClass(), "responseTimeout", "hOncybyCAH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlcunit", argTypes, term4106, args);
    }

};


