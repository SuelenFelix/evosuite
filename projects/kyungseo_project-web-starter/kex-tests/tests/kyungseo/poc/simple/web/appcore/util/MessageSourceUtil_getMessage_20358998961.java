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
import java.lang.Object;

public class MessageSourceUtil_getMessage_20358998961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;
     Object term1694;

    public MessageSourceUtil_getMessage_20358998961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1680 = newInstance(Class.forName("java.util.Locale"));
        Object term1681 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1681, term1681.getClass(), "language", "ps");
        setField(term1681, term1681.getClass(), "script", "");
        setField(term1681, term1681.getClass(), "region", "");
        setField(term1681, term1681.getClass(), "variant", "");
        setIntField(term1681, term1681.getClass(), "hash", 106860317);
        setField(term1680, term1680.getClass(), "baseLocale", term1681);
        setField(term1680, term1680.getClass(), "localeExtensions", null);
        setIntField(term1680, term1680.getClass(), "hashCodeValue", 106860317);
        setField(term1680, term1680.getClass(), "languageTag", null);
        term1694 = (Object[]) newArray("java.lang.Object", 4);
        Object term1695 = newInstance(Class.forName("java.lang.Object"));
        Object term1696 = newInstance(Class.forName("java.lang.Object"));
        Object term1697 = newInstance(Class.forName("java.lang.Object"));
        Object term1698 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1694, 0, term1695);
        setElement(term1694, 1, term1696);
        setElement(term1694, 2, term1697);
        setElement(term1694, 3, term1698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.MessageSourceUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "gGSMzuGICf";
        args[1] = term1680;
        args[2] = term1694;
        callMethod(klass, "getMessage", argTypes, null, args);
    }

};


