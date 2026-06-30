package io.github.janlely.jparser;

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
import static io.github.janlely.jparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Parser_merge_57559214919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;
     Object term712;

    public Parser_merge_57559214919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term694 = new ArrayList();
        term693 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term693, term693.getClass(), "result", term694);
        setField(term693, term693.getClass(), "errorMsg", "sjlJAEtRrb");
        setIntField(term693, term693.getClass(), "length", 1725571209);
        setIntField(term693, term693.getClass(), "pos", -522618178);
        ArrayList term713 = new ArrayList();
        term712 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term712, term712.getClass(), "result", term713);
        setField(term712, term712.getClass(), "errorMsg", "MuLcgQHgqz");
        setIntField(term712, term712.getClass(), "length", 1134449235);
        setIntField(term712, term712.getClass(), "pos", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Result");
        argTypes[1] = Class.forName("io.github.janlely.jparser.Result");
        Object[] args = new Object[2];
        args[0] = term693;
        args[1] = term712;
        callMethod(klass, "merge", argTypes, null, args);
    }

};


