package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SQLiteQueryBuilder_appendColumns_4386806344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39914;
     Object term39934;
     Object term39995;

    public SQLiteQueryBuilder_appendColumns_4386806344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39914 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term39915 = (byte[]) newByteArray(16);
        setField(term39914, term39914.getClass(), "value", term39915);
        setByteField(term39914, term39914.getClass(), "coder", (byte) 48);
        setIntField(term39914, term39914.getClass(), "count", -1239406390);
        term39934 = (Object[]) newArray("java.lang.String", 5);
        setElement(term39934, 0, "GuwJLKquuI");
        setElement(term39934, 1, "vYMCjgnztg");
        setElement(term39934, 2, "YupgKTSEiI");
        setElement(term39934, 3, "HuOUlaFmvJ");
        setElement(term39934, 4, "dWVwcwFGNo");
        term39995 = (Object[]) newArray("java.lang.String", 9);
        setElement(term39995, 0, "PNdLRrSAIY");
        setElement(term39995, 1, "nJnRIRiLZK");
        setElement(term39995, 2, "eWnrMSbYbT");
        setElement(term39995, 3, "AjoFvDFyCY");
        setElement(term39995, 4, "OFTJwdPiTG");
        setElement(term39995, 5, "QiUprSEluR");
        setElement(term39995, 6, "cDOXXottZh");
        setElement(term39995, 7, "rfqJDkDppz");
        setElement(term39995, 8, "MGorMVGauT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.SQLiteQueryBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term39914;
        args[1] = term39934;
        args[2] = term39995;
        callMethod(klass, "appendColumns", argTypes, null, args);
    }

};


