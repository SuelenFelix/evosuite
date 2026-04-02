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

public class TicTacToe_move_8974303841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4485;
     Object term4535;
     Object term4537;
     Object term4539;

    public TicTacToe_move_8974303841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4488 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4488, term4488.getClass(), "currentSize", -1954860951);
        setBooleanField(term4488, term4488.getClass(), "allSame", true);
        setCharField(term4488, term4488.getClass(), "firstCharacter", 'h');
        Object term4492 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4492, term4492.getClass(), "currentSize", -2078879114);
        setBooleanField(term4492, term4492.getClass(), "allSame", true);
        setCharField(term4492, term4492.getClass(), "firstCharacter", 'k');
        Object term4496 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4496, term4496.getClass(), "currentSize", -1186882318);
        setBooleanField(term4496, term4496.getClass(), "allSame", true);
        setCharField(term4496, term4496.getClass(), "firstCharacter", 'X');
        Object term4500 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4500, term4500.getClass(), "currentSize", 1077647088);
        setBooleanField(term4500, term4500.getClass(), "allSame", false);
        setCharField(term4500, term4500.getClass(), "firstCharacter", 'u');
        Object term4504 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4504, term4504.getClass(), "currentSize", -705176810);
        setBooleanField(term4504, term4504.getClass(), "allSame", true);
        setCharField(term4504, term4504.getClass(), "firstCharacter", 'u');
        Object term4508 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4508, term4508.getClass(), "currentSize", -1584779593);
        setBooleanField(term4508, term4508.getClass(), "allSame", false);
        setCharField(term4508, term4508.getClass(), "firstCharacter", 'a');
        Object term4512 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4512, term4512.getClass(), "currentSize", 303007547);
        setBooleanField(term4512, term4512.getClass(), "allSame", true);
        setCharField(term4512, term4512.getClass(), "firstCharacter", 'P');
        ArrayList term4486 = new ArrayList();
        ((ArrayList) term4486).add(term4488);
        ((ArrayList) term4486).add(term4492);
        ((ArrayList) term4486).add(term4496);
        ((ArrayList) term4486).add(term4500);
        ((ArrayList) term4486).add(term4504);
        ((ArrayList) term4486).add(term4508);
        ((ArrayList) term4486).add(term4512);
        Object term4520 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4520, term4520.getClass(), "currentSize", 1498738343);
        setBooleanField(term4520, term4520.getClass(), "allSame", false);
        setCharField(term4520, term4520.getClass(), "firstCharacter", 'i');
        ArrayList term4518 = new ArrayList();
        ((ArrayList) term4518).add(term4520);
        term4485 = newInstance(Class.forName("leetcode.medium.TicTacToe"));
        Object term4526 = newInstance(Class.forName("leetcode.medium.Tuple"));
        Object term4530 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setField(term4485, term4485.getClass(), "rows", term4486);
        setField(term4485, term4485.getClass(), "cols", term4518);
        setIntField(term4526, term4526.getClass(), "currentSize", -1635571857);
        setBooleanField(term4526, term4526.getClass(), "allSame", true);
        setCharField(term4526, term4526.getClass(), "firstCharacter", 'g');
        setField(term4485, term4485.getClass(), "leftDiagonal", term4526);
        setIntField(term4530, term4530.getClass(), "currentSize", 1407309162);
        setBooleanField(term4530, term4530.getClass(), "allSame", false);
        setCharField(term4530, term4530.getClass(), "firstCharacter", 'E');
        setField(term4485, term4485.getClass(), "rightDiagonal", term4530);
        setIntField(term4485, term4485.getClass(), "gridSize", -534033672);
        term4535 = new Integer(-1162790806);
        term4537 = new Integer(-1264595049);
        term4539 = new Integer(-2058884635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TicTacToe");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4535;
        args[1] = term4537;
        args[2] = term4539;
        callMethod(klass, "move", argTypes, term4485, args);
    }

};


