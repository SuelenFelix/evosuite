package org.example.toylanguage.statement;

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
import static org.example.toylanguage.statement.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class InputStatement_getConsoleSupplier_19846182733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;

    public InputStatement_getConsoleSupplier_19846182733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term970 = new Integer(-1275173084);
        term957 = newInstance(Class.forName("org.example.toylanguage.statement.InputStatement"));
        setField(term957, term957.getClass(), "name", "IDCWpPLRkE");
        setField(term957, term957.getClass(), "consoleSupplier", null);
        setField(term957, term957.getClass(), "rowNumber", term970);
        setField(term957, term957.getClass(), "blockName", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.InputStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConsoleSupplier", argTypes, term957, args);
    }

};


