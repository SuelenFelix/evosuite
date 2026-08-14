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

public class Dataset_getExtx_13534288409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6093;

    public Dataset_getExtx_13534288409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6093 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term6093, term6093.getClass(), "dsname", "jDmhBrIoDa");
        setField(term6093, term6093.getClass(), "blksz", "SPtPatHeOm");
        setField(term6093, term6093.getClass(), "catnm", "ywmcuThdfL");
        setField(term6093, term6093.getClass(), "cdate", "GBOEuByOfr");
        setField(term6093, term6093.getClass(), "dev", "NHbOFFjyVK");
        setField(term6093, term6093.getClass(), "dsntp", "zaloBqlrSo");
        setField(term6093, term6093.getClass(), "dsorg", "vvoLrMGCoN");
        setField(term6093, term6093.getClass(), "edate", "pXdglvyrQe");
        setField(term6093, term6093.getClass(), "extx", "OcfNzHYdki");
        setField(term6093, term6093.getClass(), "lrectl", "uPuCVuZYOI");
        setField(term6093, term6093.getClass(), "migr", "TweMFhxNdj");
        setField(term6093, term6093.getClass(), "mvol", "NBrvVzvQHe");
        setField(term6093, term6093.getClass(), "ovf", "FjOiNAfBOc");
        setField(term6093, term6093.getClass(), "rdate", "iCCsaLHohG");
        setField(term6093, term6093.getClass(), "recfm", "NJhGgctbdj");
        setField(term6093, term6093.getClass(), "sizex", "MYWYUeLGOp");
        setField(term6093, term6093.getClass(), "spacu", "tsTGdgQYUL");
        setField(term6093, term6093.getClass(), "used", "TtGbVmKcnX");
        setField(term6093, term6093.getClass(), "vol", "GJVkUrCVdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtx", argTypes, term6093, args);
    }

};


