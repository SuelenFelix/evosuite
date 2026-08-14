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

public class Dataset_getDsntp_12300038246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4836;

    public Dataset_getDsntp_12300038246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4836 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term4836, term4836.getClass(), "dsname", "izPpKDErnQ");
        setField(term4836, term4836.getClass(), "blksz", "NnpwZBUTvx");
        setField(term4836, term4836.getClass(), "catnm", "tlQSNgTkQX");
        setField(term4836, term4836.getClass(), "cdate", "PCipZnmBOF");
        setField(term4836, term4836.getClass(), "dev", "zcorEihhLK");
        setField(term4836, term4836.getClass(), "dsntp", "GrqozDKFOk");
        setField(term4836, term4836.getClass(), "dsorg", "CFyoseFGLF");
        setField(term4836, term4836.getClass(), "edate", "SFqCrhEWLm");
        setField(term4836, term4836.getClass(), "extx", "GZdcJyZntS");
        setField(term4836, term4836.getClass(), "lrectl", "OIHoJeysUi");
        setField(term4836, term4836.getClass(), "migr", "WXMWFDGcLB");
        setField(term4836, term4836.getClass(), "mvol", "wKWbJssZuG");
        setField(term4836, term4836.getClass(), "ovf", "NzBMMhkhpT");
        setField(term4836, term4836.getClass(), "rdate", "qCpEbQDHdF");
        setField(term4836, term4836.getClass(), "recfm", "AHbZyFOmlo");
        setField(term4836, term4836.getClass(), "sizex", "TwfWVQGiIj");
        setField(term4836, term4836.getClass(), "spacu", "gUvcueTURF");
        setField(term4836, term4836.getClass(), "used", "EwQBhZjCIT");
        setField(term4836, term4836.getClass(), "vol", "aSkmSwTnEw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDsntp", argTypes, term4836, args);
    }

};


