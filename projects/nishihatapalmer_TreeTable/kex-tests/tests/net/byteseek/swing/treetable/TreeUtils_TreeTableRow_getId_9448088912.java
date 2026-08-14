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

public class TreeUtils_TreeTableRow_getId_9448088912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80734;

    public TreeUtils_TreeTableRow_getId_9448088912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80734 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term80735 = newInstance(Class.forName("java.lang.Object"));
        Object term80736 = newInstance(Class.forName("java.lang.Object"));
        Object[] term80737 = (Object[]) newArray("java.lang.Object", 7);
        Object term80738 = newInstance(Class.forName("java.lang.Object"));
        Object term80739 = newInstance(Class.forName("java.lang.Object"));
        Object term80740 = newInstance(Class.forName("java.lang.Object"));
        Object term80741 = newInstance(Class.forName("java.lang.Object"));
        Object term80742 = newInstance(Class.forName("java.lang.Object"));
        Object term80743 = newInstance(Class.forName("java.lang.Object"));
        Object term80744 = newInstance(Class.forName("java.lang.Object"));
        setField(term80734, term80734.getClass(), "id", term80735);
        setField(term80734, term80734.getClass(), "parentId", term80736);
        setElement(term80737, 0, term80738);
        setElement(term80737, 1, term80739);
        setElement(term80737, 2, term80740);
        setElement(term80737, 3, term80741);
        setElement(term80737, 4, term80742);
        setElement(term80737, 5, term80743);
        setElement(term80737, 6, term80744);
        setField(term80734, term80734.getClass(), "otherColumns", term80737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term80734, args);
    }

};


