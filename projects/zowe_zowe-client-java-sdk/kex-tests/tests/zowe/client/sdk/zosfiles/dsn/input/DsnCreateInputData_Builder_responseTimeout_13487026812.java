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

public class DsnCreateInputData_Builder_responseTimeout_13487026812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28868;

    public DsnCreateInputData_Builder_responseTimeout_13487026812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28917 = new Integer(584893196);
        Integer term28919 = new Integer(497269071);
        Integer term28921 = new Integer(-1899301124);
        Integer term28923 = new Integer(-1882480155);
        Integer term28937 = new Integer(-1410220680);
        Integer term28939 = new Integer(389427431);
        term28868 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term28868, term28868.getClass(), "volser", "laTITSWZuc");
        setField(term28868, term28868.getClass(), "unit", "fkzRpxlAqS");
        setField(term28868, term28868.getClass(), "dsorg", "VYvbTGKslj");
        setField(term28868, term28868.getClass(), "alcunit", "owLqDDnwZA");
        setField(term28868, term28868.getClass(), "primary", term28917);
        setField(term28868, term28868.getClass(), "secondary", term28919);
        setField(term28868, term28868.getClass(), "dirblk", term28921);
        setField(term28868, term28868.getClass(), "avgblk", term28923);
        setField(term28868, term28868.getClass(), "recfm", "eBcTbweeYp");
        setField(term28868, term28868.getClass(), "blksize", term28937);
        setField(term28868, term28868.getClass(), "lrecl", term28939);
        setField(term28868, term28868.getClass(), "storclass", "drcmjfQUDq");
        setField(term28868, term28868.getClass(), "mgntclass", "GjdWUoUSyA");
        setField(term28868, term28868.getClass(), "dataclass", "YEkxWsWaUl");
        setField(term28868, term28868.getClass(), "dsntype", "RINhPkhhct");
        setBooleanField(term28868, term28868.getClass(), "showAttributes", false);
        setField(term28868, term28868.getClass(), "size", "vjNPcTSqmS");
        setField(term28868, term28868.getClass(), "responseTimeout", "fFhdWuJbdC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JlgLIHPabR";
        callMethod(klass, "responseTimeout", argTypes, term28868, args);
    }

};


