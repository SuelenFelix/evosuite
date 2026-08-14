package de.phip1611;

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
import static de.phip1611.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Docx4JSRUtil_ReplaceCommand_compareTo_5380755653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;
     Object term132;

    public Docx4JSRUtil_ReplaceCommand_compareTo_5380755653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116 = newInstance(Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand"));
        Object term129 = newInstance(Class.forName("de.phip1611.StringFindUtil$FoundResult"));
        setField(term116, term116.getClass(), "newValue", "jJCZpVmanW");
        setIntField(term129, term129.getClass(), "start", -522618178);
        setIntField(term129, term129.getClass(), "end", 1134449235);
        setField(term116, term116.getClass(), "foundMetaItem", term129);
        term132 = newInstance(Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand"));
        Object term145 = newInstance(Class.forName("de.phip1611.StringFindUtil$FoundResult"));
        setField(term132, term132.getClass(), "newValue", "EGtDIRbSSb");
        setIntField(term145, term145.getClass(), "start", -883034806);
        setIntField(term145, term145.getClass(), "end", 1585847225);
        setField(term132, term132.getClass(), "foundMetaItem", term145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.phip1611.Docx4JSRUtil$ReplaceCommand");
        Object[] args = new Object[1];
        args[0] = term132;
        callMethod(klass, "compareTo", argTypes, term116, args);
    }

};


