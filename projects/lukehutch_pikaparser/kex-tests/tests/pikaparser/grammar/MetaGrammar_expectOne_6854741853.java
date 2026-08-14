package pikaparser.grammar;

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
import static pikaparser.grammar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class MetaGrammar_expectOne_6854741853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539;
     Object term547;

    public MetaGrammar_expectOne_6854741853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539 = new LinkedList();
        ((LinkedList) term539).add((Object)null);
        ((LinkedList) term539).add((Object)null);
        ((LinkedList) term539).add((Object)null);
        ((LinkedList) term539).add((Object)null);
        ((LinkedList) term539).add((Object)null);
        ArrayList term581 = new ArrayList();
        Object term576 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term576, term576.getClass(), "label", "");
        setField(term576, term576.getClass(), "nodeType", null);
        setIntField(term576, term576.getClass(), "startPos", -1922583790);
        setIntField(term576, term576.getClass(), "len", -616727354);
        setField(term576, term576.getClass(), "input", "");
        setField(term576, term576.getClass(), "children", term581);
        ArrayList term589 = new ArrayList();
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        Object term584 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term584, term584.getClass(), "label", "");
        setField(term584, term584.getClass(), "nodeType", null);
        setIntField(term584, term584.getClass(), "startPos", -1955890973);
        setIntField(term584, term584.getClass(), "len", -2038273078);
        setField(term584, term584.getClass(), "input", "");
        setField(term584, term584.getClass(), "children", term589);
        Object term592 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term592, term592.getClass(), "label", null);
        setField(term592, term592.getClass(), "nodeType", null);
        setIntField(term592, term592.getClass(), "startPos", 0);
        setIntField(term592, term592.getClass(), "len", 0);
        setField(term592, term592.getClass(), "input", null);
        setField(term592, term592.getClass(), "children", null);
        Object term595 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term595, term595.getClass(), "label", null);
        setField(term595, term595.getClass(), "nodeType", null);
        setIntField(term595, term595.getClass(), "startPos", 0);
        setIntField(term595, term595.getClass(), "len", 0);
        setField(term595, term595.getClass(), "input", null);
        setField(term595, term595.getClass(), "children", null);
        ArrayList term603 = new ArrayList();
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        ((ArrayList) term603).add((Object)null);
        Object term598 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term598, term598.getClass(), "label", "");
        setField(term598, term598.getClass(), "nodeType", null);
        setIntField(term598, term598.getClass(), "startPos", 1134449235);
        setIntField(term598, term598.getClass(), "len", -883034806);
        setField(term598, term598.getClass(), "input", "");
        setField(term598, term598.getClass(), "children", term603);
        ArrayList term611 = new ArrayList();
        Object term606 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term606, term606.getClass(), "label", "");
        setField(term606, term606.getClass(), "nodeType", null);
        setIntField(term606, term606.getClass(), "startPos", 1725571209);
        setIntField(term606, term606.getClass(), "len", -522618178);
        setField(term606, term606.getClass(), "input", "");
        setField(term606, term606.getClass(), "children", term611);
        ArrayList term574 = new ArrayList();
        ((ArrayList) term574).add(term576);
        ((ArrayList) term574).add(term584);
        ((ArrayList) term574).add(term592);
        ((ArrayList) term574).add(term595);
        ((ArrayList) term574).add(term598);
        ((ArrayList) term574).add(term584);
        ((ArrayList) term574).add(term606);
        ((ArrayList) term574).add(term595);
        ((ArrayList) term574).add(term592);
        term547 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term547, term547.getClass(), "label", "jJCZpVmanW");
        setField(term547, term547.getClass(), "nodeType", null);
        setIntField(term547, term547.getClass(), "startPos", 1484323161);
        setIntField(term547, term547.getClass(), "len", 391863371);
        setField(term547, term547.getClass(), "input", "EGtDIRbSSb");
        setField(term547, term547.getClass(), "children", term574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.MetaGrammar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("pikaparser.ast.ASTNode");
        Object[] args = new Object[2];
        args[0] = term539;
        args[1] = term547;
        callMethod(klass, "expectOne", argTypes, null, args);
    }

};


