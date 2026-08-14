package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ParserInfo_printSyntaxErrors_10955045335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528;

    public ParserInfo_printSyntaxErrors_10955045335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3530 = new Integer(-341152642);
        Integer term3533 = new Integer(-1963464809);
        Integer term3536 = new Integer(-2015854073);
        Integer term3540 = new Integer(-343325701);
        Integer term3545 = new Integer(480137250);
        Integer term3548 = new Integer(96566506);
        Integer term3551 = new Integer(107945604);
        Integer term3556 = new Integer(538259104);
        term3528 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3529 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3532 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3535 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3539 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3544 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3547 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3550 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3555 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3528, term3528.getClass(), "comparator", null);
        setField(term3529, term3529.getClass(), "key", term3530);
        setField(term3529, term3529.getClass(), "value", null);
        setField(term3532, term3532.getClass(), "key", term3533);
        setField(term3532, term3532.getClass(), "value", null);
        setField(term3535, term3535.getClass(), "key", term3536);
        setField(term3535, term3535.getClass(), "value", null);
        setField(term3535, term3535.getClass(), "left", null);
        setField(term3535, term3535.getClass(), "right", null);
        setField(term3535, term3535.getClass(), "parent", term3532);
        setBooleanField(term3535, term3535.getClass(), "color", false);
        setField(term3532, term3532.getClass(), "left", term3535);
        setField(term3539, term3539.getClass(), "key", term3540);
        setField(term3539, term3539.getClass(), "value", null);
        setField(term3539, term3539.getClass(), "left", null);
        setField(term3539, term3539.getClass(), "right", null);
        setField(term3539, term3539.getClass(), "parent", term3532);
        setBooleanField(term3539, term3539.getClass(), "color", false);
        setField(term3532, term3532.getClass(), "right", term3539);
        setField(term3532, term3532.getClass(), "parent", term3529);
        setBooleanField(term3532, term3532.getClass(), "color", true);
        setField(term3529, term3529.getClass(), "left", term3532);
        setField(term3544, term3544.getClass(), "key", term3545);
        setField(term3544, term3544.getClass(), "value", null);
        setField(term3547, term3547.getClass(), "key", term3548);
        setField(term3547, term3547.getClass(), "value", null);
        setField(term3547, term3547.getClass(), "left", null);
        setField(term3550, term3550.getClass(), "key", term3551);
        setField(term3550, term3550.getClass(), "value", null);
        setField(term3550, term3550.getClass(), "left", null);
        setField(term3550, term3550.getClass(), "right", null);
        setField(term3550, term3550.getClass(), "parent", term3547);
        setBooleanField(term3550, term3550.getClass(), "color", false);
        setField(term3547, term3547.getClass(), "right", term3550);
        setField(term3547, term3547.getClass(), "parent", term3544);
        setBooleanField(term3547, term3547.getClass(), "color", true);
        setField(term3544, term3544.getClass(), "left", term3547);
        setField(term3555, term3555.getClass(), "key", term3556);
        setField(term3555, term3555.getClass(), "value", null);
        setField(term3555, term3555.getClass(), "left", null);
        setField(term3555, term3555.getClass(), "right", null);
        setField(term3555, term3555.getClass(), "parent", term3544);
        setBooleanField(term3555, term3555.getClass(), "color", true);
        setField(term3544, term3544.getClass(), "right", term3555);
        setField(term3544, term3544.getClass(), "parent", term3529);
        setBooleanField(term3544, term3544.getClass(), "color", false);
        setField(term3529, term3529.getClass(), "right", term3544);
        setField(term3529, term3529.getClass(), "parent", null);
        setBooleanField(term3529, term3529.getClass(), "color", true);
        setField(term3528, term3528.getClass(), "root", term3529);
        setIntField(term3528, term3528.getClass(), "size", 8);
        setIntField(term3528, term3528.getClass(), "modCount", 8);
        setField(term3528, term3528.getClass(), "entrySet", null);
        setField(term3528, term3528.getClass(), "navigableKeySet", null);
        setField(term3528, term3528.getClass(), "descendingMap", null);
        setField(term3528, term3528.getClass(), "keySet", null);
        setField(term3528, term3528.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.NavigableMap");
        Object[] args = new Object[1];
        args[0] = term3528;
        callMethod(klass, "printSyntaxErrors", argTypes, null, args);
    }

};


