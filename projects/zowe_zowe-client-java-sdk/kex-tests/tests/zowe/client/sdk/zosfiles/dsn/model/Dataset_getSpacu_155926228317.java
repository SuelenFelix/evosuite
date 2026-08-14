package zowe.client.sdk.zosfiles.dsn.model;

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
import static zowe.client.sdk.zosfiles.dsn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Dataset_getSpacu_155926228317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9445;

    public Dataset_getSpacu_155926228317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9445 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term9445, term9445.getClass(), "dsname", "SScVQYSvWH");
        setField(term9445, term9445.getClass(), "blksz", "MnovcqFhCl");
        setField(term9445, term9445.getClass(), "catnm", "qYtAeLzOhW");
        setField(term9445, term9445.getClass(), "cdate", "tJzmOfcUnY");
        setField(term9445, term9445.getClass(), "dev", "TKlccZUpjz");
        setField(term9445, term9445.getClass(), "dsntp", "GGzwMoHZXC");
        setField(term9445, term9445.getClass(), "dsorg", "IpmgwHTgnG");
        setField(term9445, term9445.getClass(), "edate", "tIpkeYIezR");
        setField(term9445, term9445.getClass(), "extx", "YkZtEtthvz");
        setField(term9445, term9445.getClass(), "lrectl", "dwlZSxlXOo");
        setField(term9445, term9445.getClass(), "migr", "lKrEAkypza");
        setField(term9445, term9445.getClass(), "mvol", "KtuuNAqGCQ");
        setField(term9445, term9445.getClass(), "ovf", "OGQsfjmReM");
        setField(term9445, term9445.getClass(), "rdate", "YsUtbngnRO");
        setField(term9445, term9445.getClass(), "recfm", "JisaWUxcNb");
        setField(term9445, term9445.getClass(), "sizex", "NxgmYPzWCI");
        setField(term9445, term9445.getClass(), "spacu", "SqjyKmayBx");
        setField(term9445, term9445.getClass(), "used", "XjDhvToxJy");
        setField(term9445, term9445.getClass(), "vol", "nxSTJflLQy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpacu", argTypes, term9445, args);
    }

};


