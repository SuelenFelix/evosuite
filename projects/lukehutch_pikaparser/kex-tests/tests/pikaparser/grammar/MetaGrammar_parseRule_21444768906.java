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
import java.util.ArrayList;
import java.lang.Object;

public class MetaGrammar_parseRule_21444768906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;

    public MetaGrammar_parseRule_21444768906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term757 = new ArrayList();
        ((ArrayList) term757).add((Object)null);
        ((ArrayList) term757).add((Object)null);
        Object term752 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term752, term752.getClass(), "label", "");
        setField(term752, term752.getClass(), "nodeType", null);
        setIntField(term752, term752.getClass(), "startPos", 590364439);
        setIntField(term752, term752.getClass(), "len", 865208305);
        setField(term752, term752.getClass(), "input", "");
        setField(term752, term752.getClass(), "children", term757);
        Object term760 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term760, term760.getClass(), "label", null);
        setField(term760, term760.getClass(), "nodeType", null);
        setIntField(term760, term760.getClass(), "startPos", 0);
        setIntField(term760, term760.getClass(), "len", 0);
        setField(term760, term760.getClass(), "input", null);
        setField(term760, term760.getClass(), "children", null);
        Object term763 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term763, term763.getClass(), "label", "");
        setField(term763, term763.getClass(), "nodeType", null);
        setIntField(term763, term763.getClass(), "startPos", 0);
        setIntField(term763, term763.getClass(), "len", 0);
        setField(term763, term763.getClass(), "input", null);
        setField(term763, term763.getClass(), "children", null);
        ArrayList term772 = new ArrayList();
        ((ArrayList) term772).add((Object)null);
        ((ArrayList) term772).add((Object)null);
        Object term767 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term767, term767.getClass(), "label", "");
        setField(term767, term767.getClass(), "nodeType", null);
        setIntField(term767, term767.getClass(), "startPos", 1193880199);
        setIntField(term767, term767.getClass(), "len", -1087774327);
        setField(term767, term767.getClass(), "input", "");
        setField(term767, term767.getClass(), "children", term772);
        ArrayList term750 = new ArrayList();
        ((ArrayList) term750).add(term752);
        ((ArrayList) term750).add(term760);
        ((ArrayList) term750).add(term763);
        ((ArrayList) term750).add(term723);
        ((ArrayList) term750).add(term767);
        term723 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term723, term723.getClass(), "label", "flxyYxBRtu");
        setField(term723, term723.getClass(), "nodeType", null);
        setIntField(term723, term723.getClass(), "startPos", -1007160944);
        setIntField(term723, term723.getClass(), "len", 1135664017);
        setField(term723, term723.getClass(), "input", "OclPbYPkcH");
        setField(term723, term723.getClass(), "children", term750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.MetaGrammar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.ast.ASTNode");
        Object[] args = new Object[1];
        args[0] = term723;
        callMethod(klass, "parseRule", argTypes, null, args);
    }

};


