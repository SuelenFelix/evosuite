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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class HandleExceptionStatement_getEnsureStatement_5976782464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1774;

    public HandleExceptionStatement_getEnsureStatement_5976782464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1776 = new ArrayList();
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        ((ArrayList) term1776).add((Object)null);
        Integer term1780 = new Integer(292681826);
        ArrayList term1795 = new ArrayList();
        ((ArrayList) term1795).add((Object)null);
        ((ArrayList) term1795).add((Object)null);
        ((ArrayList) term1795).add((Object)null);
        ((ArrayList) term1795).add((Object)null);
        ((ArrayList) term1795).add((Object)null);
        ((ArrayList) term1795).add((Object)null);
        Integer term1799 = new Integer(458147407);
        ArrayList term1814 = new ArrayList();
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        Integer term1818 = new Integer(-184153539);
        Integer term1844 = new Integer(493620644);
        term1774 = newInstance(Class.forName("org.example.toylanguage.statement.HandleExceptionStatement"));
        Object term1775 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1794 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1813 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1775, term1775.getClass(), "statements2Execute", term1776);
        setField(term1775, term1775.getClass(), "rowNumber", term1780);
        setField(term1775, term1775.getClass(), "blockName", "tPlsykYBqO");
        setField(term1774, term1774.getClass(), "beginStatement", term1775);
        setField(term1794, term1794.getClass(), "statements2Execute", term1795);
        setField(term1794, term1794.getClass(), "rowNumber", term1799);
        setField(term1794, term1794.getClass(), "blockName", "bLPjGVBhlX");
        setField(term1774, term1774.getClass(), "rescueStatement", term1794);
        setField(term1813, term1813.getClass(), "statements2Execute", term1814);
        setField(term1813, term1813.getClass(), "rowNumber", term1818);
        setField(term1813, term1813.getClass(), "blockName", "whBvTVIIlC");
        setField(term1774, term1774.getClass(), "ensureStatement", term1813);
        setField(term1774, term1774.getClass(), "errorVariable", "IgRJUzaCwW");
        setField(term1774, term1774.getClass(), "rowNumber", term1844);
        setField(term1774, term1774.getClass(), "blockName", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.HandleExceptionStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnsureStatement", argTypes, term1774, args);
    }

};


