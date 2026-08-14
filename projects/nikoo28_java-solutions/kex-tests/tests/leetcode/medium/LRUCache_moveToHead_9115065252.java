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
import java.util.HashMap;

public class LRUCache_moveToHead_9115065252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1936;
     Object term1972;

    public LRUCache_moveToHead_9115065252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1958 = new HashMap();
        term1936 = newInstance(Class.forName("leetcode.medium.LRUCache"));
        Object term1937 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1940 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1943 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1946 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1949 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1952 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1955 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term1937, term1937.getClass(), "key", -1133405894);
        setIntField(term1937, term1937.getClass(), "val", 1289741214);
        setIntField(term1940, term1940.getClass(), "key", 243280944);
        setIntField(term1940, term1940.getClass(), "val", -726681073);
        setIntField(term1943, term1943.getClass(), "key", -1724487863);
        setIntField(term1943, term1943.getClass(), "val", -128490829);
        setIntField(term1946, term1946.getClass(), "key", 202214133);
        setIntField(term1946, term1946.getClass(), "val", 1543091617);
        setField(term1946, term1946.getClass(), "next", null);
        setField(term1946, term1946.getClass(), "prev", term1940);
        setField(term1943, term1943.getClass(), "next", term1946);
        setField(term1943, term1943.getClass(), "prev", term1940);
        setField(term1940, term1940.getClass(), "next", term1943);
        setIntField(term1949, term1949.getClass(), "key", 0);
        setIntField(term1949, term1949.getClass(), "val", 0);
        setField(term1949, term1949.getClass(), "next", null);
        setField(term1949, term1949.getClass(), "prev", null);
        setField(term1940, term1940.getClass(), "prev", term1949);
        setField(term1937, term1937.getClass(), "next", term1940);
        setIntField(term1952, term1952.getClass(), "key", 723812297);
        setIntField(term1952, term1952.getClass(), "val", 1639448749);
        setIntField(term1955, term1955.getClass(), "key", 873659088);
        setIntField(term1955, term1955.getClass(), "val", -975748721);
        setField(term1955, term1955.getClass(), "next", term1949);
        setField(term1955, term1955.getClass(), "prev", term1952);
        setField(term1952, term1952.getClass(), "next", term1955);
        setField(term1952, term1952.getClass(), "prev", term1955);
        setField(term1937, term1937.getClass(), "prev", term1952);
        setField(term1936, term1936.getClass(), "head", term1937);
        setField(term1936, term1936.getClass(), "tail", term1952);
        setField(term1936, term1936.getClass(), "keyNodeAddressMap", term1958);
        setIntField(term1936, term1936.getClass(), "maxCapacity", 433248783);
        term1972 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1975 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1978 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1981 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1984 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1987 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1990 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1993 = newInstance(Class.forName("leetcode.DoubleListNode"));
        Object term1996 = newInstance(Class.forName("leetcode.DoubleListNode"));
        setIntField(term1972, term1972.getClass(), "key", -507944154);
        setIntField(term1972, term1972.getClass(), "val", -1736183862);
        setIntField(term1975, term1975.getClass(), "key", 897010381);
        setIntField(term1975, term1975.getClass(), "val", -15712667);
        setIntField(term1978, term1978.getClass(), "key", 1964967720);
        setIntField(term1978, term1978.getClass(), "val", 1351900243);
        setIntField(term1981, term1981.getClass(), "key", -330897705);
        setIntField(term1981, term1981.getClass(), "val", 1065595802);
        setIntField(term1984, term1984.getClass(), "key", 21031843);
        setIntField(term1984, term1984.getClass(), "val", -380787857);
        setField(term1984, term1984.getClass(), "next", null);
        setField(term1984, term1984.getClass(), "prev", term1975);
        setField(term1981, term1981.getClass(), "next", term1984);
        setIntField(term1987, term1987.getClass(), "key", -27944011);
        setIntField(term1987, term1987.getClass(), "val", -20614472);
        setField(term1987, term1987.getClass(), "next", null);
        setField(term1987, term1987.getClass(), "prev", null);
        setField(term1981, term1981.getClass(), "prev", term1987);
        setField(term1978, term1978.getClass(), "next", term1981);
        setIntField(term1990, term1990.getClass(), "key", -516303035);
        setIntField(term1990, term1990.getClass(), "val", -2143043890);
        setIntField(term1993, term1993.getClass(), "key", -2138825831);
        setIntField(term1993, term1993.getClass(), "val", 1454781562);
        setField(term1993, term1993.getClass(), "next", term1987);
        setField(term1993, term1993.getClass(), "prev", term1972);
        setField(term1990, term1990.getClass(), "next", term1993);
        setIntField(term1996, term1996.getClass(), "key", 319853052);
        setIntField(term1996, term1996.getClass(), "val", -1097563716);
        setField(term1996, term1996.getClass(), "next", null);
        setField(term1996, term1996.getClass(), "prev", term1975);
        setField(term1990, term1990.getClass(), "prev", term1996);
        setField(term1978, term1978.getClass(), "prev", term1990);
        setField(term1975, term1975.getClass(), "next", term1978);
        setField(term1975, term1975.getClass(), "prev", term1990);
        setField(term1972, term1972.getClass(), "next", term1975);
        setField(term1972, term1972.getClass(), "prev", term1984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LRUCache");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("leetcode.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = term1972;
        callMethod(klass, "moveToHead", argTypes, term1936, args);
    }

};


