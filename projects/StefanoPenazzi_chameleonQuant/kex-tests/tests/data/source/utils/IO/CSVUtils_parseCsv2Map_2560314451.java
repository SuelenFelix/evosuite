package data.source.utils.IO;

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
import static data.source.utils.IO.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Character;

public class CSVUtils_parseCsv2Map_2560314451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term26;
     Object term28;
     Object term30;

    public CSVUtils_parseCsv2Map_2560314451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65 = Class.forName((String) "java.io.File$PathStatus");
        Field term64 = ((Class) term65).getDeclaredField((String) "INVALID");
        ((Field) term64).setAccessible(true);
        Object enum0 = ((Field) term64).get((Object) null);
        term1 = newInstance(Class.forName("java.io.File"));
        setField(term1, term1.getClass(), "path", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "status", enum0);
        setIntField(term1, term1.getClass(), "prefixLength", 568599855);
        setField(term1, term1.getClass(), "filePath", null);
        term26 = new Boolean(false);
        term28 = new Character('P');
        term30 = new Character('A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.utils.IO.CSVUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = boolean.class;
        argTypes[2] = char.class;
        argTypes[3] = char.class;
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = term26;
        args[2] = term28;
        args[3] = term30;
        callMethod(klass, "parseCsv2Map", argTypes, null, args);
    }

};


