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

public class TreeUtils_CSVTreeTableRowIterator_next_9354449023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220;

    public TreeUtils_CSVTreeTableRowIterator_next_9354449023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator"));
        Object term247 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term248 = (char[]) newCharArray(5);
        Object term260 = newInstance(Class.forName("java.lang.Object"));
        char[] term261 = (char[]) newCharArray(2);
        Object term264 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term265 = newInstance(Class.forName("java.lang.Object"));
        Object term266 = newInstance(Class.forName("java.lang.Object"));
        Object[] term267 = (Object[]) newArray("java.lang.Object", 3);
        Object term268 = newInstance(Class.forName("java.lang.Object"));
        Object term269 = newInstance(Class.forName("java.lang.Object"));
        Object term270 = newInstance(Class.forName("java.lang.Object"));
        setField(term220, term220.getClass(), "line", "jJCZpVmanW");
        setField(term220, term220.getClass(), "separatorChar", "EGtDIRbSSb");
        setIntField(term220, term220.getClass(), "idColumnIndex", -203030934);
        setIntField(term220, term220.getClass(), "parentIdColumnIndex", -1179120542);
        setField(term247, term247.getClass(), "in", null);
        setCharElement(term248, 0, 'z');
        setCharElement(term248, 1, 'x');
        setCharElement(term248, 2, 'x');
        setCharElement(term248, 3, 't');
        setCharElement(term248, 4, 'l');
        setField(term247, term247.getClass(), "cb", term248);
        setIntField(term247, term247.getClass(), "nChars", -73683645);
        setIntField(term247, term247.getClass(), "nextChar", -226514366);
        setIntField(term247, term247.getClass(), "markedChar", 1193880199);
        setIntField(term247, term247.getClass(), "readAheadLimit", -1087774327);
        setBooleanField(term247, term247.getClass(), "skipLF", false);
        setBooleanField(term247, term247.getClass(), "markedSkipLF", true);
        setField(term247, term247.getClass(), "lock", term260);
        setCharElement(term261, 0, 'P');
        setCharElement(term261, 1, 'w');
        setField(term247, term247.getClass(), "skipBuffer", term261);
        setField(term220, term220.getClass(), "reader", term247);
        setField(term264, term264.getClass(), "id", term265);
        setField(term264, term264.getClass(), "parentId", term266);
        setElement(term267, 0, term268);
        setElement(term267, 1, term269);
        setElement(term267, 2, term270);
        setField(term264, term264.getClass(), "otherColumns", term267);
        setField(term220, term220.getClass(), "row", term264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term220, args);
    }

};


