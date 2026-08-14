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

public class Dataset_getRecfm_35876666815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8607;

    public Dataset_getRecfm_35876666815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8607 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term8607, term8607.getClass(), "dsname", "KarbTXFmUU");
        setField(term8607, term8607.getClass(), "blksz", "jiUSjqwSIQ");
        setField(term8607, term8607.getClass(), "catnm", "MgLCedQfoj");
        setField(term8607, term8607.getClass(), "cdate", "zgKiINdgNu");
        setField(term8607, term8607.getClass(), "dev", "zLMTXDQHYH");
        setField(term8607, term8607.getClass(), "dsntp", "PqywFWJlpE");
        setField(term8607, term8607.getClass(), "dsorg", "OzXRsFGTIp");
        setField(term8607, term8607.getClass(), "edate", "TjWpyghUWN");
        setField(term8607, term8607.getClass(), "extx", "dkZFDZxcde");
        setField(term8607, term8607.getClass(), "lrectl", "WXcZEtUKlI");
        setField(term8607, term8607.getClass(), "migr", "IkpjUOuWQU");
        setField(term8607, term8607.getClass(), "mvol", "boSSpezHeU");
        setField(term8607, term8607.getClass(), "ovf", "OUeBWNTQDh");
        setField(term8607, term8607.getClass(), "rdate", "gltJarNuUk");
        setField(term8607, term8607.getClass(), "recfm", "ZwZIDwYcSW");
        setField(term8607, term8607.getClass(), "sizex", "sOdkipUKRu");
        setField(term8607, term8607.getClass(), "spacu", "oKwCDqywym");
        setField(term8607, term8607.getClass(), "used", "zjZYTddemL");
        setField(term8607, term8607.getClass(), "vol", "QtrylgCLiF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecfm", argTypes, term8607, args);
    }

};


