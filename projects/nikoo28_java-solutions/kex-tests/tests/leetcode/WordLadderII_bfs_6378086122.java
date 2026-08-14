package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class WordLadderII_bfs_6378086122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321;
     Object term346;
     Object term363;
     Object term412;

    public WordLadderII_bfs_6378086122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321 = newInstance(Class.forName("leetcode.WordLadderII"));
        HashMap term347 = new HashMap();
        Set<Object> term471 =  ((Map) term347).keySet();
        term346 = new HashSet((Collection<? extends Object>) term471);
        term363 = new LinkedHashMap();
        term412 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.WordLadderII");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Set");
        argTypes[3] = Class.forName("java.util.HashMap");
        argTypes[4] = Class.forName("java.util.HashMap");
        Object[] args = new Object[5];
        args[0] = "uuaPigETmJ";
        args[1] = "MxlszYVzRf";
        args[2] = term346;
        args[3] = term363;
        args[4] = term412;
        callMethod(klass, "bfs", argTypes, term321, args);
    }

};


