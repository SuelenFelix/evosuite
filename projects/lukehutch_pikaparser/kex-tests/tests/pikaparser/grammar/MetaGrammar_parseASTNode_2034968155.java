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

public class MetaGrammar_parseASTNode_2034968155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;

    public MetaGrammar_parseASTNode_2034968155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term673 = new ArrayList();
        ((ArrayList) term673).add((Object)null);
        ((ArrayList) term673).add((Object)null);
        ((ArrayList) term673).add((Object)null);
        ((ArrayList) term673).add((Object)null);
        ((ArrayList) term673).add((Object)null);
        ((ArrayList) term673).add((Object)null);
        ((ArrayList) term673).add((Object)null);
        Object term668 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term668, term668.getClass(), "label", "");
        setField(term668, term668.getClass(), "nodeType", null);
        setIntField(term668, term668.getClass(), "startPos", -1685132342);
        setIntField(term668, term668.getClass(), "len", -1456670397);
        setField(term668, term668.getClass(), "input", "");
        setField(term668, term668.getClass(), "children", term673);
        Object term676 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term676, term676.getClass(), "label", null);
        setField(term676, term676.getClass(), "nodeType", null);
        setIntField(term676, term676.getClass(), "startPos", 0);
        setIntField(term676, term676.getClass(), "len", 0);
        setField(term676, term676.getClass(), "input", null);
        setField(term676, term676.getClass(), "children", null);
        Object term679 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term679, term679.getClass(), "label", null);
        setField(term679, term679.getClass(), "nodeType", null);
        setIntField(term679, term679.getClass(), "startPos", 0);
        setIntField(term679, term679.getClass(), "len", 0);
        setField(term679, term679.getClass(), "input", null);
        setField(term679, term679.getClass(), "children", null);
        Object term682 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term682, term682.getClass(), "label", null);
        setField(term682, term682.getClass(), "nodeType", null);
        setIntField(term682, term682.getClass(), "startPos", 0);
        setIntField(term682, term682.getClass(), "len", 0);
        setField(term682, term682.getClass(), "input", null);
        setField(term682, term682.getClass(), "children", null);
        ArrayList term690 = new ArrayList();
        ((ArrayList) term690).add((Object)null);
        Object term685 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term685, term685.getClass(), "label", "");
        setField(term685, term685.getClass(), "nodeType", null);
        setIntField(term685, term685.getClass(), "startPos", 1622346318);
        setIntField(term685, term685.getClass(), "len", 1048535127);
        setField(term685, term685.getClass(), "input", "");
        setField(term685, term685.getClass(), "children", term690);
        ArrayList term698 = new ArrayList();
        ((ArrayList) term698).add((Object)null);
        ((ArrayList) term698).add((Object)null);
        ((ArrayList) term698).add((Object)null);
        ((ArrayList) term698).add((Object)null);
        ((ArrayList) term698).add((Object)null);
        Object term693 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term693, term693.getClass(), "label", "");
        setField(term693, term693.getClass(), "nodeType", null);
        setIntField(term693, term693.getClass(), "startPos", -2068769794);
        setIntField(term693, term693.getClass(), "len", -117576464);
        setField(term693, term693.getClass(), "input", "");
        setField(term693, term693.getClass(), "children", term698);
        ArrayList term666 = new ArrayList();
        ((ArrayList) term666).add(term668);
        ((ArrayList) term666).add(term676);
        ((ArrayList) term666).add(term679);
        ((ArrayList) term666).add(term682);
        ((ArrayList) term666).add(term685);
        ((ArrayList) term666).add(term693);
        term639 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term639, term639.getClass(), "label", "ZiaGIbnzTs");
        setField(term639, term639.getClass(), "nodeType", null);
        setIntField(term639, term639.getClass(), "startPos", 1585847225);
        setIntField(term639, term639.getClass(), "len", 597278769);
        setField(term639, term639.getClass(), "input", "tbcdzjIfER");
        setField(term639, term639.getClass(), "children", term666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.MetaGrammar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.ast.ASTNode");
        Object[] args = new Object[1];
        args[0] = term639;
        callMethod(klass, "parseASTNode", argTypes, null, args);
    }

};


