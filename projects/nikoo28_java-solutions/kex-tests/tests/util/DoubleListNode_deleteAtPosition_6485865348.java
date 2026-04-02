package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DoubleListNode_deleteAtPosition_6485865348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term958;
     Object term976;
     Object term994;

    public DoubleListNode_deleteAtPosition_6485865348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term958 = newInstance(Class.forName("util.DoubleListNode"));
        Object term960 = newInstance(Class.forName("util.DoubleListNode"));
        Object term962 = newInstance(Class.forName("util.DoubleListNode"));
        Object term964 = newInstance(Class.forName("util.DoubleListNode"));
        Object term966 = newInstance(Class.forName("util.DoubleListNode"));
        Object term968 = newInstance(Class.forName("util.DoubleListNode"));
        Object term970 = newInstance(Class.forName("util.DoubleListNode"));
        Object term972 = newInstance(Class.forName("util.DoubleListNode"));
        Object term974 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term958, term958.getClass(), "val", 2143282300);
        setIntField(term960, term960.getClass(), "val", 1137624258);
        setIntField(term962, term962.getClass(), "val", 977862393);
        setIntField(term964, term964.getClass(), "val", 301401782);
        setIntField(term966, term966.getClass(), "val", 1988605357);
        setField(term966, term966.getClass(), "prev", null);
        setField(term966, term966.getClass(), "next", term960);
        setField(term964, term964.getClass(), "prev", term966);
        setIntField(term968, term968.getClass(), "val", -1849105286);
        setField(term968, term968.getClass(), "prev", null);
        setField(term968, term968.getClass(), "next", null);
        setField(term964, term964.getClass(), "next", term968);
        setField(term962, term962.getClass(), "prev", term964);
        setIntField(term970, term970.getClass(), "val", -1830198043);
        setIntField(term972, term972.getClass(), "val", -439048495);
        setField(term972, term972.getClass(), "prev", term968);
        setField(term972, term972.getClass(), "next", term958);
        setField(term970, term970.getClass(), "prev", term972);
        setIntField(term974, term974.getClass(), "val", 808203320);
        setField(term974, term974.getClass(), "prev", null);
        setField(term974, term974.getClass(), "next", term960);
        setField(term970, term970.getClass(), "next", term974);
        setField(term962, term962.getClass(), "next", term970);
        setField(term960, term960.getClass(), "prev", term962);
        setField(term960, term960.getClass(), "next", term970);
        setField(term958, term958.getClass(), "prev", term960);
        setField(term958, term958.getClass(), "next", term966);
        term976 = newInstance(Class.forName("util.DoubleListNode"));
        Object term978 = newInstance(Class.forName("util.DoubleListNode"));
        Object term980 = newInstance(Class.forName("util.DoubleListNode"));
        Object term982 = newInstance(Class.forName("util.DoubleListNode"));
        Object term984 = newInstance(Class.forName("util.DoubleListNode"));
        Object term986 = newInstance(Class.forName("util.DoubleListNode"));
        Object term988 = newInstance(Class.forName("util.DoubleListNode"));
        Object term990 = newInstance(Class.forName("util.DoubleListNode"));
        Object term992 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term976, term976.getClass(), "val", 1334483645);
        setIntField(term978, term978.getClass(), "val", 917513193);
        setIntField(term980, term980.getClass(), "val", 787278105);
        setIntField(term982, term982.getClass(), "val", -2063843486);
        setIntField(term984, term984.getClass(), "val", 833762980);
        setField(term984, term984.getClass(), "prev", null);
        setField(term984, term984.getClass(), "next", term978);
        setField(term982, term982.getClass(), "prev", term984);
        setIntField(term986, term986.getClass(), "val", -1631697577);
        setField(term986, term986.getClass(), "prev", null);
        setField(term986, term986.getClass(), "next", null);
        setField(term982, term982.getClass(), "next", term986);
        setField(term980, term980.getClass(), "prev", term982);
        setIntField(term988, term988.getClass(), "val", 1723148410);
        setIntField(term990, term990.getClass(), "val", -920797484);
        setField(term990, term990.getClass(), "prev", term986);
        setField(term990, term990.getClass(), "next", term976);
        setField(term988, term988.getClass(), "prev", term990);
        setIntField(term992, term992.getClass(), "val", 320711637);
        setField(term992, term992.getClass(), "prev", null);
        setField(term992, term992.getClass(), "next", term978);
        setField(term988, term988.getClass(), "next", term992);
        setField(term980, term980.getClass(), "next", term988);
        setField(term978, term978.getClass(), "prev", term980);
        setField(term978, term978.getClass(), "next", term988);
        setField(term976, term976.getClass(), "prev", term978);
        setField(term976, term976.getClass(), "next", term984);
        term994 = new Integer(765731371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.DoubleListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term976;
        args[1] = term994;
        callMethod(klass, "deleteAtPosition", argTypes, term958, args);
    }

};


