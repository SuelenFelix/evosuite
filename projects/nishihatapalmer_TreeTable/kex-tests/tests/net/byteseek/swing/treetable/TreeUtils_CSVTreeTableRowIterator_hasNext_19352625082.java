package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeUtils_CSVTreeTableRowIterator_hasNext_19352625082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;

    public TreeUtils_CSVTreeTableRowIterator_hasNext_19352625082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator"));
        Object term167 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term168 = (char[]) newCharArray(1);
        Object term176 = newInstance(Class.forName("java.lang.Object"));
        char[] term177 = (char[]) newCharArray(6);
        Object term184 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term185 = newInstance(Class.forName("java.lang.Object"));
        Object term186 = newInstance(Class.forName("java.lang.Object"));
        Object[] term187 = (Object[]) newArray("java.lang.Object", 5);
        Object term188 = newInstance(Class.forName("java.lang.Object"));
        Object term189 = newInstance(Class.forName("java.lang.Object"));
        Object term190 = newInstance(Class.forName("java.lang.Object"));
        Object term191 = newInstance(Class.forName("java.lang.Object"));
        Object term192 = newInstance(Class.forName("java.lang.Object"));
        setField(term140, term140.getClass(), "line", "MuLcgQHgqz");
        setField(term140, term140.getClass(), "separatorChar", "xxtlPwDYFs");
        setIntField(term140, term140.getClass(), "idColumnIndex", -1007160944);
        setIntField(term140, term140.getClass(), "parentIdColumnIndex", 1135664017);
        setField(term167, term167.getClass(), "in", null);
        setCharElement(term168, 0, 'L');
        setField(term167, term167.getClass(), "cb", term168);
        setIntField(term167, term167.getClass(), "nChars", 590364439);
        setIntField(term167, term167.getClass(), "nextChar", 865208305);
        setIntField(term167, term167.getClass(), "markedChar", -1275173084);
        setIntField(term167, term167.getClass(), "readAheadLimit", -244121226);
        setBooleanField(term167, term167.getClass(), "skipLF", true);
        setBooleanField(term167, term167.getClass(), "markedSkipLF", false);
        setField(term167, term167.getClass(), "lock", term176);
        setCharElement(term177, 0, 'c');
        setCharElement(term177, 1, 'g');
        setCharElement(term177, 2, 'Q');
        setCharElement(term177, 3, 'H');
        setCharElement(term177, 4, 'g');
        setCharElement(term177, 5, 'q');
        setField(term167, term167.getClass(), "skipBuffer", term177);
        setField(term140, term140.getClass(), "reader", term167);
        setField(term184, term184.getClass(), "id", term185);
        setField(term184, term184.getClass(), "parentId", term186);
        setElement(term187, 0, term188);
        setElement(term187, 1, term189);
        setElement(term187, 2, term190);
        setElement(term187, 3, term191);
        setElement(term187, 4, term192);
        setField(term184, term184.getClass(), "otherColumns", term187);
        setField(term140, term140.getClass(), "row", term184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term140, args);
    }

};


