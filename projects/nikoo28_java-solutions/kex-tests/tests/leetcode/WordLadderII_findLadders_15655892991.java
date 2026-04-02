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
import java.util.LinkedList;
import java.lang.Object;

public class WordLadderII_findLadders_15655892991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term220;

    public WordLadderII_findLadders_15655892991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = newInstance(Class.forName("leetcode.WordLadderII"));
        term220 = new LinkedList();
        ((LinkedList) term220).add("MuLcgQHgqz");
        ((LinkedList) term220).add("xxtlPwDYFs");
        ((LinkedList) term220).add("");
        ((LinkedList) term220).add((Object)null);
        ((LinkedList) term220).add((Object)null);
        ((LinkedList) term220).add((Object)null);
        ((LinkedList) term220).add((Object)null);
        ((LinkedList) term220).add((Object)null);
        ((LinkedList) term220).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.WordLadderII");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term220;
        callMethod(klass, "findLadders", argTypes, term195, args);
    }

};


