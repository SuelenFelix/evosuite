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
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class WordLadderII_dfs_7461437354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502;
     Object term527;
     Object term576;
     Object term633;
     Object term721;

    public WordLadderII_dfs_7461437354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term502 = newInstance(Class.forName("leetcode.WordLadderII"));
        term527 = new LinkedHashMap();
        term576 = new LinkedHashMap();
        term633 = new ArrayList();
        ((ArrayList) term633).add("wSQxaModmm");
        ((ArrayList) term633).add("UlajhuVLaP");
        ((ArrayList) term633).add("gGSMzuGICf");
        ((ArrayList) term633).add("hxCBltsObl");
        ((ArrayList) term633).add("BndsHwAFMv");
        ((ArrayList) term633).add("GzFkzHGYFt");
        ((ArrayList) term633).add("tShwQLRGNe");
        term721 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.WordLadderII");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.HashMap");
        argTypes[3] = Class.forName("java.util.HashMap");
        argTypes[4] = Class.forName("java.util.ArrayList");
        argTypes[5] = Class.forName("java.util.List");
        Object[] args = new Object[6];
        args[0] = "xOEqzGAmDU";
        args[1] = "eZFUvlxvGV";
        args[2] = term527;
        args[3] = term576;
        args[4] = term633;
        args[5] = term721;
        callMethod(klass, "dfs", argTypes, term502, args);
    }

};


