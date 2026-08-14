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

public class DsnCreateInputData_Builder_size_110933474915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29662;

    public DsnCreateInputData_Builder_size_110933474915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29711 = new Integer(-1347358701);
        Integer term29713 = new Integer(806595993);
        Integer term29715 = new Integer(548228925);
        Integer term29717 = new Integer(-749861210);
        Integer term29731 = new Integer(1694224101);
        Integer term29733 = new Integer(937859191);
        term29662 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term29662, term29662.getClass(), "volser", "SPQVzOlOzZ");
        setField(term29662, term29662.getClass(), "unit", "bOUAgAptAI");
        setField(term29662, term29662.getClass(), "dsorg", "KSZfGbvzPE");
        setField(term29662, term29662.getClass(), "alcunit", "YfgYGgzYER");
        setField(term29662, term29662.getClass(), "primary", term29711);
        setField(term29662, term29662.getClass(), "secondary", term29713);
        setField(term29662, term29662.getClass(), "dirblk", term29715);
        setField(term29662, term29662.getClass(), "avgblk", term29717);
        setField(term29662, term29662.getClass(), "recfm", "IDClvDZuqE");
        setField(term29662, term29662.getClass(), "blksize", term29731);
        setField(term29662, term29662.getClass(), "lrecl", term29733);
        setField(term29662, term29662.getClass(), "storclass", "cMvKxpZOvg");
        setField(term29662, term29662.getClass(), "mgntclass", "WWBYemIuiK");
        setField(term29662, term29662.getClass(), "dataclass", "nHYQYkycCR");
        setField(term29662, term29662.getClass(), "dsntype", "yBiVacDcZX");
        setBooleanField(term29662, term29662.getClass(), "showAttributes", true);
        setField(term29662, term29662.getClass(), "size", "QrKfEgQeoy");
        setField(term29662, term29662.getClass(), "responseTimeout", "oApgdbwnti");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YcgHACNgyo";
        callMethod(klass, "size", argTypes, term29662, args);
    }

};


