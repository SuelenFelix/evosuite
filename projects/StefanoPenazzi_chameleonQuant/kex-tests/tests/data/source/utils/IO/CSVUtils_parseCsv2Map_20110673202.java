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
import java.lang.Boolean;
import java.lang.Character;

public class CSVUtils_parseCsv2Map_20110673202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219;
     Object term221;
     Object term223;

    public CSVUtils_parseCsv2Map_20110673202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219 = new Boolean(false);
        term221 = new Character('E');
        term223 = new Character('B');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.utils.IO.CSVUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = char.class;
        argTypes[3] = char.class;
        Object[] args = new Object[4];
        args[0] = "sjlJAEtRrb";
        args[1] = term219;
        args[2] = term221;
        args[3] = term223;
        callMethod(klass, "parseCsv2Map", argTypes, null, args);
    }

};


