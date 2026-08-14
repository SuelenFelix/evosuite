package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Boolean;

public class ParserInfo_printParseResult_48261637010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4265;
     Object term4313;
     Object term4314;

    public ParserInfo_printParseResult_48261637010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4269 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4269, term4269.getClass(), "ruleName", null);
        setIntField(term4269, term4269.getClass(), "precedence", -545275970);
        setField(term4269, term4269.getClass(), "associativity", null);
        setField(term4269, term4269.getClass(), "labeledClause", null);
        Object term4271 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4271, term4271.getClass(), "ruleName", null);
        setIntField(term4271, term4271.getClass(), "precedence", 1355471365);
        setField(term4271, term4271.getClass(), "associativity", null);
        setField(term4271, term4271.getClass(), "labeledClause", null);
        Object term4273 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4273, term4273.getClass(), "ruleName", null);
        setIntField(term4273, term4273.getClass(), "precedence", -1746962742);
        setField(term4273, term4273.getClass(), "associativity", null);
        setField(term4273, term4273.getClass(), "labeledClause", null);
        Object term4275 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4275, term4275.getClass(), "ruleName", null);
        setIntField(term4275, term4275.getClass(), "precedence", -575810668);
        setField(term4275, term4275.getClass(), "associativity", null);
        setField(term4275, term4275.getClass(), "labeledClause", null);
        Object term4277 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4277, term4277.getClass(), "ruleName", null);
        setIntField(term4277, term4277.getClass(), "precedence", 256028547);
        setField(term4277, term4277.getClass(), "associativity", null);
        setField(term4277, term4277.getClass(), "labeledClause", null);
        Object term4279 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4279, term4279.getClass(), "ruleName", null);
        setIntField(term4279, term4279.getClass(), "precedence", -750603024);
        setField(term4279, term4279.getClass(), "associativity", null);
        setField(term4279, term4279.getClass(), "labeledClause", null);
        Object term4281 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4281, term4281.getClass(), "ruleName", null);
        setIntField(term4281, term4281.getClass(), "precedence", 1255234202);
        setField(term4281, term4281.getClass(), "associativity", null);
        setField(term4281, term4281.getClass(), "labeledClause", null);
        ArrayList term4267 = new ArrayList();
        ((ArrayList) term4267).add(term4269);
        ((ArrayList) term4267).add(term4271);
        ((ArrayList) term4267).add(term4273);
        ((ArrayList) term4267).add(term4275);
        ((ArrayList) term4267).add(term4277);
        ((ArrayList) term4267).add(term4279);
        ((ArrayList) term4267).add(term4281);
        HashMap term4285 = new HashMap();
        ArrayList term4293 = new ArrayList();
        ((ArrayList) term4293).add((Object)null);
        ((ArrayList) term4293).add((Object)null);
        ((ArrayList) term4293).add((Object)null);
        ((ArrayList) term4293).add((Object)null);
        ((ArrayList) term4293).add((Object)null);
        ((ArrayList) term4293).add((Object)null);
        ((ArrayList) term4293).add((Object)null);
        ((ArrayList) term4293).add((Object)null);
        term4265 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term4266 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term4309 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term4311 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term4265, term4265.getClass(), "memoTable", null);
        setField(term4266, term4266.getClass(), "allRules", term4267);
        setField(term4266, term4266.getClass(), "ruleNameWithPrecedenceToRule", term4285);
        setField(term4266, term4266.getClass(), "allClauses", term4293);
        setField(term4265, term4265.getClass(), "grammar", term4266);
        setField(term4265, term4265.getClass(), "input", "AHbZyFOmlo");
        setIntField(term4309, term4309.getClass(), "value", 1134449235);
        setField(term4265, term4265.getClass(), "numMatchObjectsCreated", term4309);
        setIntField(term4311, term4311.getClass(), "value", -883034806);
        setField(term4265, term4265.getClass(), "numMatchObjectsMemoized", term4311);
        term4313 = (Object[]) newArray("java.lang.String", 0);
        term4314 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "zcorEihhLK";
        args[1] = term4265;
        args[2] = term4313;
        args[3] = term4314;
        callMethod(klass, "printParseResult", argTypes, null, args);
    }

};


