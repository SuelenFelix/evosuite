package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ReverseWordsInAStringIII_reverse_4466513292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1832;
     Object term1833;
     Object term1838;
     Object term1840;

    public ReverseWordsInAStringIII_reverse_4466513292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1832 = newInstance(Class.forName("leetcode.easy.ReverseWordsInAStringIII"));
        term1833 = (char[]) newCharArray(4);
        setCharElement(term1833, 0, 'P');
        setCharElement(term1833, 1, 'A');
        setCharElement(term1833, 2, 'E');
        setCharElement(term1833, 3, 'B');
        term1838 = new Integer(-100825168);
        term1840 = new Integer(768407648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.ReverseWordsInAStringIII");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1833;
        args[1] = term1838;
        args[2] = term1840;
        callMethod(klass, "reverse", argTypes, term1832, args);
    }

};


