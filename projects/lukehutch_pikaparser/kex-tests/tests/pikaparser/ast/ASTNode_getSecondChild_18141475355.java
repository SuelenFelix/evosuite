package pikaparser.ast;

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
import static pikaparser.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ASTNode_getSecondChild_18141475355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;

    public ASTNode_getSecondChild_18141475355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term592 = new ArrayList();
        ((ArrayList) term592).add((Object)null);
        ((ArrayList) term592).add((Object)null);
        ((ArrayList) term592).add((Object)null);
        ((ArrayList) term592).add((Object)null);
        ((ArrayList) term592).add((Object)null);
        ((ArrayList) term592).add((Object)null);
        ((ArrayList) term592).add((Object)null);
        ((ArrayList) term592).add((Object)null);
        Object term587 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term587, term587.getClass(), "label", "");
        setField(term587, term587.getClass(), "nodeType", null);
        setIntField(term587, term587.getClass(), "startPos", -1347665717);
        setIntField(term587, term587.getClass(), "len", -1888585309);
        setField(term587, term587.getClass(), "input", "");
        setField(term587, term587.getClass(), "children", term592);
        Object term595 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term595, term595.getClass(), "label", null);
        setField(term595, term595.getClass(), "nodeType", null);
        setIntField(term595, term595.getClass(), "startPos", 0);
        setIntField(term595, term595.getClass(), "len", 0);
        setField(term595, term595.getClass(), "input", null);
        setField(term595, term595.getClass(), "children", null);
        Object term598 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term598, term598.getClass(), "label", null);
        setField(term598, term598.getClass(), "nodeType", null);
        setIntField(term598, term598.getClass(), "startPos", 0);
        setIntField(term598, term598.getClass(), "len", 0);
        setField(term598, term598.getClass(), "input", null);
        setField(term598, term598.getClass(), "children", null);
        ArrayList term585 = new ArrayList();
        ((ArrayList) term585).add(term587);
        ((ArrayList) term585).add(term595);
        ((ArrayList) term585).add(term598);
        ((ArrayList) term585).add(term598);
        term558 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term558, term558.getClass(), "label", "gGSMzuGICf");
        setField(term558, term558.getClass(), "nodeType", null);
        setIntField(term558, term558.getClass(), "startPos", -894662986);
        setIntField(term558, term558.getClass(), "len", 304775596);
        setField(term558, term558.getClass(), "input", "hxCBltsObl");
        setField(term558, term558.getClass(), "children", term585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondChild", argTypes, term558, args);
    }

};


