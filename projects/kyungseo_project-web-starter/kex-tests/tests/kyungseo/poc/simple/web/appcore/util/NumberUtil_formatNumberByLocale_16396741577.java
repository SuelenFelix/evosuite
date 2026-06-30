package kyungseo.poc.simple.web.appcore.util;

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
import static kyungseo.poc.simple.web.appcore.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class NumberUtil_formatNumberByLocale_16396741577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term328;

    public NumberUtil_formatNumberByLocale_16396741577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = new Integer(-6029667);
        term328 = newInstance(Class.forName("java.util.Locale"));
        Object term329 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term329, term329.getClass(), "language", "pt");
        setField(term329, term329.getClass(), "script", "");
        setField(term329, term329.getClass(), "region", "MO");
        setField(term329, term329.getClass(), "variant", "");
        setIntField(term329, term329.getClass(), "hash", 106966554);
        setField(term328, term328.getClass(), "baseLocale", term329);
        setField(term328, term328.getClass(), "localeExtensions", null);
        setIntField(term328, term328.getClass(), "hashCodeValue", 106966554);
        setField(term328, term328.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.NumberUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term326;
        args[1] = term328;
        callMethod(klass, "formatNumberByLocale", argTypes, null, args);
    }

};


