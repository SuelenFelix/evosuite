package com.loomcom.symon.jterminal.vt100;

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
import static com.loomcom.symon.jterminal.vt100.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Vt100TerminalModel_Vt100Listener_parsedControlSequence_12036380061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term81;

    public Vt100TerminalModel_Vt100Listener_parsedControlSequence_12036380061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener"));
        setIntField(term78, term78.getClass(), "savedCursorRow", -1922583790);
        setIntField(term78, term78.getClass(), "savedCursorColumn", -616727354);
        setField(term78, term78.getClass(), "this$0", null);
        term81 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequence"));
        Object[] term83 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term81, term81.getClass(), "command", 'P');
        setElement(term83, 0, "PAEBtnZtTD");
        setElement(term83, 1, "sjlJAEtRrb");
        setElement(term83, 2, "MuLcgQHgqz");
        setElement(term83, 3, "xxtlPwDYFs");
        setElement(term83, 4, "jJCZpVmanW");
        setField(term81, term81.getClass(), "parameters", term83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.Vt100TerminalModel$Vt100Listener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequence");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "parsedControlSequence", argTypes, term78, args);
    }

};


