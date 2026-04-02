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
import java.lang.Object;

public class ValidSudoku_isValidSudoku_3511486491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;
     Object term626;

    public ValidSudoku_isValidSudoku_3511486491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625 = newInstance(Class.forName("leetcode.medium.ValidSudoku"));
        term626 = (Object[]) newArray("[C", 5);
        char[] term627 = (char[]) newCharArray(1);
        char[] term629 = (char[]) newCharArray(0);
        char[] term630 = (char[]) newCharArray(9);
        char[] term640 = (char[]) newCharArray(4);
        char[] term645 = (char[]) newCharArray(8);
        setCharElement(term627, 0, 'J');
        setElement(term626, 0, term627);
        setElement(term626, 1, term629);
        setCharElement(term630, 0, 'C');
        setCharElement(term630, 1, 'Z');
        setCharElement(term630, 2, 'p');
        setCharElement(term630, 3, 'V');
        setCharElement(term630, 4, 'm');
        setCharElement(term630, 5, 'a');
        setCharElement(term630, 6, 'n');
        setCharElement(term630, 7, 'W');
        setCharElement(term630, 8, 'E');
        setElement(term626, 2, term630);
        setCharElement(term640, 0, 'G');
        setCharElement(term640, 1, 't');
        setCharElement(term640, 2, 'D');
        setCharElement(term640, 3, 'I');
        setElement(term626, 3, term640);
        setCharElement(term645, 0, 'R');
        setCharElement(term645, 1, 'b');
        setCharElement(term645, 2, 'S');
        setCharElement(term645, 3, 'S');
        setCharElement(term645, 4, 'b');
        setCharElement(term645, 5, 'S');
        setCharElement(term645, 6, 'z');
        setCharElement(term645, 7, 'j');
        setElement(term626, 4, term645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ValidSudoku");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term626;
        callMethod(klass, "isValidSudoku", argTypes, term625, args);
    }

};


