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

public class Dataset_getUsed_90044611418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9864;

    public Dataset_getUsed_90044611418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9864 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term9864, term9864.getClass(), "dsname", "FlHzxEfFzI");
        setField(term9864, term9864.getClass(), "blksz", "aSATgQUpoe");
        setField(term9864, term9864.getClass(), "catnm", "VkPSXewZfB");
        setField(term9864, term9864.getClass(), "cdate", "ubodzJoMGW");
        setField(term9864, term9864.getClass(), "dev", "weddIktxOA");
        setField(term9864, term9864.getClass(), "dsntp", "uSlMeISsDD");
        setField(term9864, term9864.getClass(), "dsorg", "WdCiTDUKqn");
        setField(term9864, term9864.getClass(), "edate", "PSizQDoxxe");
        setField(term9864, term9864.getClass(), "extx", "mKaHyMybrK");
        setField(term9864, term9864.getClass(), "lrectl", "AyrEXuGrEj");
        setField(term9864, term9864.getClass(), "migr", "yevIIoVYHq");
        setField(term9864, term9864.getClass(), "mvol", "UuYWMTqWTV");
        setField(term9864, term9864.getClass(), "ovf", "DSFGlcaXUb");
        setField(term9864, term9864.getClass(), "rdate", "sHMXNUzNeM");
        setField(term9864, term9864.getClass(), "recfm", "gPzGDOEPPw");
        setField(term9864, term9864.getClass(), "sizex", "rwKoAngzCu");
        setField(term9864, term9864.getClass(), "spacu", "VUkRVwROTl");
        setField(term9864, term9864.getClass(), "used", "UDlkdccCRn");
        setField(term9864, term9864.getClass(), "vol", "McpzErOcYb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsed", argTypes, term9864, args);
    }

};


