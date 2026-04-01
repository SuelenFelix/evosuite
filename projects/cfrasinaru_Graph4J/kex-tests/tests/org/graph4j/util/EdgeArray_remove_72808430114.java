package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeArray_remove_72808430114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62287;
     Object term62323;

    public EdgeArray_remove_72808430114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62287 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62288 = (Object[]) newArray("[I", 6);
        int[] term62289 = (int[]) newIntArray(6);
        int[] term62296 = (int[]) newIntArray(9);
        int[] term62306 = (int[]) newIntArray(3);
        int[] term62310 = (int[]) newIntArray(2);
        int[] term62313 = (int[]) newIntArray(3);
        int[] term62317 = (int[]) newIntArray(4);
        setField(term62287, term62287.getClass(), "graph", null);
        setIntElement(term62289, 0, 479136541);
        setIntElement(term62289, 1, 128257372);
        setIntElement(term62289, 2, 269362552);
        setIntElement(term62289, 3, -640467775);
        setIntElement(term62289, 4, -1945181535);
        setIntElement(term62289, 5, -140143046);
        setElement(term62288, 0, term62289);
        setIntElement(term62296, 0, -1498112846);
        setIntElement(term62296, 1, -298672713);
        setIntElement(term62296, 2, 766181234);
        setIntElement(term62296, 3, -789141664);
        setIntElement(term62296, 4, -1487966462);
        setIntElement(term62296, 5, -254522021);
        setIntElement(term62296, 6, -1019541665);
        setIntElement(term62296, 7, 1803166412);
        setIntElement(term62296, 8, -1337767440);
        setElement(term62288, 1, term62296);
        setIntElement(term62306, 0, -1072471087);
        setIntElement(term62306, 1, 1054147511);
        setIntElement(term62306, 2, -872690097);
        setElement(term62288, 2, term62306);
        setIntElement(term62310, 0, -110719515);
        setIntElement(term62310, 1, 1974973897);
        setElement(term62288, 3, term62310);
        setIntElement(term62313, 0, -1698854);
        setIntElement(term62313, 1, 1352029332);
        setIntElement(term62313, 2, 1637635293);
        setElement(term62288, 4, term62313);
        setIntElement(term62317, 0, -1074960601);
        setIntElement(term62317, 1, -1987365619);
        setIntElement(term62317, 2, 662229600);
        setIntElement(term62317, 3, -1332957093);
        setElement(term62288, 5, term62317);
        setField(term62287, term62287.getClass(), "edges", term62288);
        setIntField(term62287, term62287.getClass(), "numEdges", 424707046);
        Double term62328 = new Double(0.01784667720947175);
        Double term62330 = new Double(0.4395312828193261);
        Double term62332 = new Double(0.5715204226647931);
        Double term62334 = new Double(0.6420798930164424);
        Double term62336 = new Double(0.0011409626665044303);
        Double term62338 = new Double(0.5195852993308188);
        Double term62340 = new Double(0.6533293939565151);
        Double term62342 = new Double(0.7361083671494018);
        Double term62344 = new Double(0.056643259984349825);
        term62323 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term62327 = (Object[]) newArray("java.lang.Double", 9);
        setBooleanField(term62323, term62323.getClass(), "directed", true);
        setIntField(term62323, term62323.getClass(), "source", 1963864974);
        setIntField(term62323, term62323.getClass(), "target", 1696691227);
        setElement(term62327, 0, term62328);
        setElement(term62327, 1, term62330);
        setElement(term62327, 2, term62332);
        setElement(term62327, 3, term62334);
        setElement(term62327, 4, term62336);
        setElement(term62327, 5, term62338);
        setElement(term62327, 6, term62340);
        setElement(term62327, 7, term62342);
        setElement(term62327, 8, term62344);
        setField(term62323, term62323.getClass(), "data", term62327);
        setField(term62323, term62323.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term62323;
        callMethod(klass, "remove", argTypes, term62287, args);
    }

};


