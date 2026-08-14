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

public class DsnCreateInputData_getDsntype_360044056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5386;

    public DsnCreateInputData_getDsntype_360044056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5435 = new Integer(-1530420153);
        Integer term5437 = new Integer(-469968304);
        Integer term5439 = new Integer(-1145578966);
        Integer term5441 = new Integer(679763016);
        Integer term5455 = new Integer(1962444399);
        Integer term5457 = new Integer(767834723);
        term5386 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term5386, term5386.getClass(), "volser", "doQLHkjpNm");
        setField(term5386, term5386.getClass(), "unit", "lCyLIcSuom");
        setField(term5386, term5386.getClass(), "dsorg", "CGOpQSZZwI");
        setField(term5386, term5386.getClass(), "alcunit", "ypEdrstygY");
        setField(term5386, term5386.getClass(), "primary", term5435);
        setField(term5386, term5386.getClass(), "secondary", term5437);
        setField(term5386, term5386.getClass(), "dirblk", term5439);
        setField(term5386, term5386.getClass(), "avgblk", term5441);
        setField(term5386, term5386.getClass(), "recfm", "sNQFlATEeQ");
        setField(term5386, term5386.getClass(), "blksize", term5455);
        setField(term5386, term5386.getClass(), "lrecl", term5457);
        setField(term5386, term5386.getClass(), "storclass", "ZKMLioamsY");
        setField(term5386, term5386.getClass(), "mgntclass", "WVbxuoDBcn");
        setField(term5386, term5386.getClass(), "dataclass", "pvDEABOxLt");
        setField(term5386, term5386.getClass(), "dsntype", "beAMpkroCQ");
        setBooleanField(term5386, term5386.getClass(), "showAttributes", false);
        setField(term5386, term5386.getClass(), "size", "uSUvKAyuvd");
        setField(term5386, term5386.getClass(), "responseTimeout", "onQLVONGuf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDsntype", argTypes, term5386, args);
    }

};


