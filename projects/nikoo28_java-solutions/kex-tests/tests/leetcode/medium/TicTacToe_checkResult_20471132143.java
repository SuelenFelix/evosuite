package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TicTacToe_checkResult_20471132143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4593;
     Object term4627;
     Object term4629;

    public TicTacToe_checkResult_20471132143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4596 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4596, term4596.getClass(), "currentSize", -974923743);
        setBooleanField(term4596, term4596.getClass(), "allSame", false);
        setCharField(term4596, term4596.getClass(), "firstCharacter", 'R');
        Object term4600 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4600, term4600.getClass(), "currentSize", 1876738932);
        setBooleanField(term4600, term4600.getClass(), "allSame", false);
        setCharField(term4600, term4600.getClass(), "firstCharacter", 'f');
        Object term4604 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4604, term4604.getClass(), "currentSize", -1870339027);
        setBooleanField(term4604, term4604.getClass(), "allSame", false);
        setCharField(term4604, term4604.getClass(), "firstCharacter", 'L');
        ArrayList term4594 = new ArrayList();
        ((ArrayList) term4594).add(term4596);
        ((ArrayList) term4594).add(term4600);
        ((ArrayList) term4594).add(term4604);
        Object term4612 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4612, term4612.getClass(), "currentSize", -1549603566);
        setBooleanField(term4612, term4612.getClass(), "allSame", true);
        setCharField(term4612, term4612.getClass(), "firstCharacter", 'Q');
        ArrayList term4610 = new ArrayList();
        ((ArrayList) term4610).add(term4612);
        term4593 = newInstance(Class.forName("leetcode.medium.TicTacToe"));
        Object term4618 = newInstance(Class.forName("leetcode.medium.Tuple"));
        Object term4622 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setField(term4593, term4593.getClass(), "rows", term4594);
        setField(term4593, term4593.getClass(), "cols", term4610);
        setIntField(term4618, term4618.getClass(), "currentSize", 1077223540);
        setBooleanField(term4618, term4618.getClass(), "allSame", true);
        setCharField(term4618, term4618.getClass(), "firstCharacter", 'F');
        setField(term4593, term4593.getClass(), "leftDiagonal", term4618);
        setIntField(term4622, term4622.getClass(), "currentSize", -1823813592);
        setBooleanField(term4622, term4622.getClass(), "allSame", true);
        setCharField(term4622, term4622.getClass(), "firstCharacter", 'p');
        setField(term4593, term4593.getClass(), "rightDiagonal", term4622);
        setIntField(term4593, term4593.getClass(), "gridSize", -1644358555);
        term4627 = new Integer(-388591034);
        term4629 = new Integer(-1270258033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TicTacToe");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4627;
        args[1] = term4629;
        callMethod(klass, "checkResult", argTypes, term4593, args);
    }

};


