package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixZfs_getFstype_20000951787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1122;

    public UnixZfs_getFstype_20000951787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1183 = new Long(-5248475803419977214L);
        Long term1185 = new Long(-6723783499250797216L);
        Long term1187 = new Long(41775768178052008L);
        Long term1189 = new Long(6682528376118987775L);
        Long term1191 = new Long(682356318767179819L);
        Long term1205 = new Long(-7291743527973326814L);
        Long term1207 = new Long(-5963439350418910964L);
        Long term1209 = new Long(9013624480170062917L);
        Long term1211 = new Long(7862575738391801707L);
        Long term1213 = new Long(50358265865610362L);
        term1122 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs"));
        setField(term1122, term1122.getClass(), "name", "tShwQLRGNe");
        setField(term1122, term1122.getClass(), "mountpoint", "LvtrsXUliU");
        setField(term1122, term1122.getClass(), "fstname", "xLbjWUgOIL");
        setField(term1122, term1122.getClass(), "status", "jDtqGUpnZN");
        setField(term1122, term1122.getClass(), "mode", "nGKItKLYNC");
        setField(term1122, term1122.getClass(), "dev", term1183);
        setField(term1122, term1122.getClass(), "fstype", term1185);
        setField(term1122, term1122.getClass(), "bsize", term1187);
        setField(term1122, term1122.getClass(), "bavail", term1189);
        setField(term1122, term1122.getClass(), "blocks", term1191);
        setField(term1122, term1122.getClass(), "sysname", "UiUYnPrcCi");
        setField(term1122, term1122.getClass(), "readibc", term1205);
        setField(term1122, term1122.getClass(), "writeibc", term1207);
        setField(term1122, term1122.getClass(), "diribc", term1209);
        setField(term1122, term1122.getClass(), "returnedRows", term1211);
        setField(term1122, term1122.getClass(), "totalRows", term1213);
        setBooleanField(term1122, term1122.getClass(), "moreRows", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFstype", argTypes, term1122, args);
    }

};


