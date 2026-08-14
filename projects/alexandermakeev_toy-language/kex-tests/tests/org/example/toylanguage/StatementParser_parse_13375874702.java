package org.example.toylanguage;

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
import static org.example.toylanguage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.lang.Integer;

public class StatementParser_parse_13375874702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1689;
     Object term1692;

    public StatementParser_parse_13375874702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1689 = new LinkedList();
        ArrayList term1693 = new ArrayList();
        Integer term1697 = new Integer(-1896376975);
        term1692 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1692, term1692.getClass(), "statements2Execute", term1693);
        setField(term1692, term1692.getClass(), "rowNumber", term1697);
        setField(term1692, term1692.getClass(), "blockName", "IXPaHQnEUy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.StatementParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        Object[] args = new Object[2];
        args[0] = term1689;
        args[1] = term1692;
        callMethod(klass, "parse", argTypes, null, args);
    }

};


