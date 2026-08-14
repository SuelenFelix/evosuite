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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class GrammarUtils_findReachableClauses_20828157862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term31;

    public GrammarUtils_findReachableClauses_20828157862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22 = new HashMap();
        Set<Object> term35 =  ((Map) term22).keySet();
        term21 = new HashSet((Collection<? extends Object>) term35);
        term31 = new LinkedList();
        ((LinkedList) term31).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.GrammarUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        argTypes[1] = Class.forName("java.util.HashSet");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term21;
        args[2] = term31;
        callMethod(klass, "findReachableClauses", argTypes, null, args);
    }

};


