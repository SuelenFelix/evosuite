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

public class DsnCreateInputData_Builder_storclass_89390744016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29940;

    public DsnCreateInputData_Builder_storclass_89390744016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29989 = new Integer(-916584829);
        Integer term29991 = new Integer(-2131181468);
        Integer term29993 = new Integer(282916351);
        Integer term29995 = new Integer(880977281);
        Integer term30009 = new Integer(371943306);
        Integer term30011 = new Integer(982388293);
        term29940 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term29940, term29940.getClass(), "volser", "MrUPJzBTEn");
        setField(term29940, term29940.getClass(), "unit", "IaSymdfFGa");
        setField(term29940, term29940.getClass(), "dsorg", "FxSvJCIpul");
        setField(term29940, term29940.getClass(), "alcunit", "HCjKwpexJj");
        setField(term29940, term29940.getClass(), "primary", term29989);
        setField(term29940, term29940.getClass(), "secondary", term29991);
        setField(term29940, term29940.getClass(), "dirblk", term29993);
        setField(term29940, term29940.getClass(), "avgblk", term29995);
        setField(term29940, term29940.getClass(), "recfm", "sCpIHVPdfl");
        setField(term29940, term29940.getClass(), "blksize", term30009);
        setField(term29940, term29940.getClass(), "lrecl", term30011);
        setField(term29940, term29940.getClass(), "storclass", "lMUBBGRjfY");
        setField(term29940, term29940.getClass(), "mgntclass", "olYpqbolWL");
        setField(term29940, term29940.getClass(), "dataclass", "MCMCjxXzjw");
        setField(term29940, term29940.getClass(), "dsntype", "pZbbwCURge");
        setBooleanField(term29940, term29940.getClass(), "showAttributes", false);
        setField(term29940, term29940.getClass(), "size", "RsOfgdMCMv");
        setField(term29940, term29940.getClass(), "responseTimeout", "nsofCJqJOR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CitJiZwsjF";
        callMethod(klass, "storclass", argTypes, term29940, args);
    }

};


