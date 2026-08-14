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

public class Dataset_getSizex_138200871616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9026;

    public Dataset_getSizex_138200871616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9026 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term9026, term9026.getClass(), "dsname", "orEuhCStGM");
        setField(term9026, term9026.getClass(), "blksz", "HhEaSXWvrY");
        setField(term9026, term9026.getClass(), "catnm", "CVRGEomOth");
        setField(term9026, term9026.getClass(), "cdate", "vSeruUyNWX");
        setField(term9026, term9026.getClass(), "dev", "UkKvaeJfEC");
        setField(term9026, term9026.getClass(), "dsntp", "WPxXsahPRq");
        setField(term9026, term9026.getClass(), "dsorg", "IENRuqmwUU");
        setField(term9026, term9026.getClass(), "edate", "GsWxOwXvSu");
        setField(term9026, term9026.getClass(), "extx", "bKBSncrMEZ");
        setField(term9026, term9026.getClass(), "lrectl", "yeSXGqQExb");
        setField(term9026, term9026.getClass(), "migr", "uXYcXVYJZM");
        setField(term9026, term9026.getClass(), "mvol", "BJhjdJUhkz");
        setField(term9026, term9026.getClass(), "ovf", "cdHYQDgUZR");
        setField(term9026, term9026.getClass(), "rdate", "KAORSSPSeV");
        setField(term9026, term9026.getClass(), "recfm", "UimMMORkzd");
        setField(term9026, term9026.getClass(), "sizex", "huVIXUWLtI");
        setField(term9026, term9026.getClass(), "spacu", "vhKzFyKPOT");
        setField(term9026, term9026.getClass(), "used", "nQhIgWXdRc");
        setField(term9026, term9026.getClass(), "vol", "EusenEbIoF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSizex", argTypes, term9026, args);
    }

};


