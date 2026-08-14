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

public class Dataset_getEdate_16760538968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5674;

    public Dataset_getEdate_16760538968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5674 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term5674, term5674.getClass(), "dsname", "qYzsiuXOgS");
        setField(term5674, term5674.getClass(), "blksz", "bxrCBbrrct");
        setField(term5674, term5674.getClass(), "catnm", "CKWpJaaaxX");
        setField(term5674, term5674.getClass(), "cdate", "UBRmXJmfrt");
        setField(term5674, term5674.getClass(), "dev", "WZzvmIHhzZ");
        setField(term5674, term5674.getClass(), "dsntp", "doQLHkjpNm");
        setField(term5674, term5674.getClass(), "dsorg", "lCyLIcSuom");
        setField(term5674, term5674.getClass(), "edate", "CGOpQSZZwI");
        setField(term5674, term5674.getClass(), "extx", "ypEdrstygY");
        setField(term5674, term5674.getClass(), "lrectl", "sNQFlATEeQ");
        setField(term5674, term5674.getClass(), "migr", "ZKMLioamsY");
        setField(term5674, term5674.getClass(), "mvol", "WVbxuoDBcn");
        setField(term5674, term5674.getClass(), "ovf", "pvDEABOxLt");
        setField(term5674, term5674.getClass(), "rdate", "beAMpkroCQ");
        setField(term5674, term5674.getClass(), "recfm", "uSUvKAyuvd");
        setField(term5674, term5674.getClass(), "sizex", "onQLVONGuf");
        setField(term5674, term5674.getClass(), "spacu", "SOrEHbcbmn");
        setField(term5674, term5674.getClass(), "used", "bnsyeQXFdu");
        setField(term5674, term5674.getClass(), "vol", "BwtdjiefJn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdate", argTypes, term5674, args);
    }

};


