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

public class DsnCreateInputData_Builder_mgntclass_5556822289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28054;

    public DsnCreateInputData_Builder_mgntclass_5556822289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28103 = new Integer(1041916673);
        Integer term28105 = new Integer(-601863069);
        Integer term28107 = new Integer(663292551);
        Integer term28109 = new Integer(-1885090354);
        Integer term28123 = new Integer(-2066804303);
        Integer term28125 = new Integer(-1731761810);
        term28054 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term28054, term28054.getClass(), "volser", "XJbkXbljvz");
        setField(term28054, term28054.getClass(), "unit", "fuvdkDwBeH");
        setField(term28054, term28054.getClass(), "dsorg", "NTefzwLPhx");
        setField(term28054, term28054.getClass(), "alcunit", "dirFuhqyNu");
        setField(term28054, term28054.getClass(), "primary", term28103);
        setField(term28054, term28054.getClass(), "secondary", term28105);
        setField(term28054, term28054.getClass(), "dirblk", term28107);
        setField(term28054, term28054.getClass(), "avgblk", term28109);
        setField(term28054, term28054.getClass(), "recfm", "YVLRenzuoR");
        setField(term28054, term28054.getClass(), "blksize", term28123);
        setField(term28054, term28054.getClass(), "lrecl", term28125);
        setField(term28054, term28054.getClass(), "storclass", "JukEMhPWql");
        setField(term28054, term28054.getClass(), "mgntclass", "ZdNcodHERG");
        setField(term28054, term28054.getClass(), "dataclass", "CLHomjAqIM");
        setField(term28054, term28054.getClass(), "dsntype", "mzCFLzFuSj");
        setBooleanField(term28054, term28054.getClass(), "showAttributes", false);
        setField(term28054, term28054.getClass(), "size", "WQnMpDlSfA");
        setField(term28054, term28054.getClass(), "responseTimeout", "aOIvTQtXiv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IyjDiknqhA";
        callMethod(klass, "mgntclass", argTypes, term28054, args);
    }

};


