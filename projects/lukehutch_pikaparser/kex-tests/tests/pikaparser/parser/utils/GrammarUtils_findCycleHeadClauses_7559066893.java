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

public class GrammarUtils_findCycleHeadClauses_7559066893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;
     Object term42;
     Object term48;

    public GrammarUtils_findCycleHeadClauses_7559066893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37 = new HashMap();
        Set<Object> term54 =  ((Map) term37).keySet();
        term36 = new HashSet((Collection<? extends Object>) term54);
        HashMap term43 = new HashMap();
        Set<Object> term55 =  ((Map) term43).keySet();
        term42 = new HashSet((Collection<? extends Object>) term55);
        HashMap term49 = new HashMap();
        Set<Object> term56 =  ((Map) term49).keySet();
        term48 = new HashSet((Collection<? extends Object>) term56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.GrammarUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term36;
        args[2] = term42;
        args[3] = term48;
        callMethod(klass, "findCycleHeadClauses", argTypes, null, args);
    }

};


