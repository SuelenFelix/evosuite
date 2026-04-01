package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class CSVTree_readAndDisplayTree_19065484421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term44;

    public CSVTree_readAndDisplayTree_19065484421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term2 = (char[]) newCharArray(5);
        Object term14 = newInstance(Class.forName("java.lang.Object"));
        char[] term15 = (char[]) newCharArray(4);
        setField(term1, term1.getClass(), "in", null);
        setCharElement(term2, 0, 'P');
        setCharElement(term2, 1, 'A');
        setCharElement(term2, 2, 'E');
        setCharElement(term2, 3, 'B');
        setCharElement(term2, 4, 't');
        setField(term1, term1.getClass(), "cb", term2);
        setIntField(term1, term1.getClass(), "nChars", 568599855);
        setIntField(term1, term1.getClass(), "nextChar", 1162663216);
        setIntField(term1, term1.getClass(), "markedChar", 1484323161);
        setIntField(term1, term1.getClass(), "readAheadLimit", 391863371);
        setBooleanField(term1, term1.getClass(), "skipLF", false);
        setBooleanField(term1, term1.getClass(), "markedSkipLF", false);
        setField(term1, term1.getClass(), "lock", term14);
        setCharElement(term15, 0, 'n');
        setCharElement(term15, 1, 'Z');
        setCharElement(term15, 2, 't');
        setCharElement(term15, 3, 'T');
        setField(term1, term1.getClass(), "skipBuffer", term15);
        term44 = new Character('D');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.CSVTree");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.BufferedReader");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = char.class;
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = "sjlJAEtRrb";
        args[3] = term44;
        callMethod(klass, "readAndDisplayTree", argTypes, null, args);
    }

};


