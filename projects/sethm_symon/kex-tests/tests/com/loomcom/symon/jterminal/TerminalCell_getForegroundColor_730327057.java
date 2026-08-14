package com.loomcom.symon.jterminal;

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
import static com.loomcom.symon.jterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TerminalCell_getForegroundColor_730327057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11422;

    public TerminalCell_getForegroundColor_730327057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11422 = newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"));
        setCharField(term11422, term11422.getClass(), "character", (char) 0);
        setField(term11422, term11422.getClass(), "backgroundColor", null);
        setField(term11422, term11422.getClass(), "foregroundColor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.TerminalCell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getForegroundColor", argTypes, term11422, args);
    }

};


