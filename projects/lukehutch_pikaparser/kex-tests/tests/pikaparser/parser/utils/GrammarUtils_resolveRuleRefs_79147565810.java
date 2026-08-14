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
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GrammarUtils_resolveRuleRefs_79147565810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126;
     Object term1139;
     Object term1279;
     Object term1402;

    public GrammarUtils_resolveRuleRefs_79147565810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1126 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1126, term1126.getClass(), "clause", null);
        setField(term1126, term1126.getClass(), "astNodeLabel", "UlajhuVLaP");
        term1139 = new LinkedHashMap();
        term1279 = new LinkedHashMap();
        HashMap term1403 = new HashMap();
        Set<Object> term1422 =  ((Map) term1403).keySet();
        term1402 = new HashSet((Collection<? extends Object>) term1422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.GrammarUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("pikaparser.ast.LabeledClause");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = term1126;
        args[1] = term1139;
        args[2] = term1279;
        args[3] = term1402;
        callMethod(klass, "resolveRuleRefs", argTypes, null, args);
    }

};


