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

public class DoubleListNode_deleteFromEnd_13125327377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;
     Object term940;

    public DoubleListNode_deleteFromEnd_13125327377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term922 = newInstance(Class.forName("util.DoubleListNode"));
        Object term924 = newInstance(Class.forName("util.DoubleListNode"));
        Object term926 = newInstance(Class.forName("util.DoubleListNode"));
        Object term928 = newInstance(Class.forName("util.DoubleListNode"));
        Object term930 = newInstance(Class.forName("util.DoubleListNode"));
        Object term932 = newInstance(Class.forName("util.DoubleListNode"));
        Object term934 = newInstance(Class.forName("util.DoubleListNode"));
        Object term936 = newInstance(Class.forName("util.DoubleListNode"));
        Object term938 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term922, term922.getClass(), "val", 1559605714);
        setIntField(term924, term924.getClass(), "val", 1146601902);
        setIntField(term926, term926.getClass(), "val", -1938881385);
        setIntField(term928, term928.getClass(), "val", -1629418973);
        setIntField(term930, term930.getClass(), "val", -100825168);
        setField(term930, term930.getClass(), "prev", null);
        setField(term930, term930.getClass(), "next", term924);
        setField(term928, term928.getClass(), "prev", term930);
        setIntField(term932, term932.getClass(), "val", 1820784228);
        setField(term932, term932.getClass(), "prev", null);
        setField(term932, term932.getClass(), "next", null);
        setField(term928, term928.getClass(), "next", term932);
        setField(term926, term926.getClass(), "prev", term928);
        setIntField(term934, term934.getClass(), "val", -1148142995);
        setIntField(term936, term936.getClass(), "val", -233024044);
        setField(term936, term936.getClass(), "prev", term932);
        setField(term936, term936.getClass(), "next", term922);
        setField(term934, term934.getClass(), "prev", term936);
        setIntField(term938, term938.getClass(), "val", 768407648);
        setField(term938, term938.getClass(), "prev", null);
        setField(term938, term938.getClass(), "next", term924);
        setField(term934, term934.getClass(), "next", term938);
        setField(term926, term926.getClass(), "next", term934);
        setField(term924, term924.getClass(), "prev", term926);
        setField(term924, term924.getClass(), "next", term934);
        setField(term922, term922.getClass(), "prev", term924);
        setField(term922, term922.getClass(), "next", term930);
        term940 = newInstance(Class.forName("util.DoubleListNode"));
        Object term942 = newInstance(Class.forName("util.DoubleListNode"));
        Object term944 = newInstance(Class.forName("util.DoubleListNode"));
        Object term946 = newInstance(Class.forName("util.DoubleListNode"));
        Object term948 = newInstance(Class.forName("util.DoubleListNode"));
        Object term950 = newInstance(Class.forName("util.DoubleListNode"));
        Object term952 = newInstance(Class.forName("util.DoubleListNode"));
        Object term954 = newInstance(Class.forName("util.DoubleListNode"));
        Object term956 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term940, term940.getClass(), "val", 1390820006);
        setIntField(term942, term942.getClass(), "val", -828982065);
        setIntField(term944, term944.getClass(), "val", 1221443226);
        setIntField(term946, term946.getClass(), "val", 908108726);
        setIntField(term948, term948.getClass(), "val", 1023209512);
        setField(term948, term948.getClass(), "prev", null);
        setField(term948, term948.getClass(), "next", term942);
        setField(term946, term946.getClass(), "prev", term948);
        setIntField(term950, term950.getClass(), "val", 1658391716);
        setField(term950, term950.getClass(), "prev", null);
        setField(term950, term950.getClass(), "next", null);
        setField(term946, term946.getClass(), "next", term950);
        setField(term944, term944.getClass(), "prev", term946);
        setIntField(term952, term952.getClass(), "val", -944542900);
        setIntField(term954, term954.getClass(), "val", 2063762142);
        setField(term954, term954.getClass(), "prev", term950);
        setField(term954, term954.getClass(), "next", term940);
        setField(term952, term952.getClass(), "prev", term954);
        setIntField(term956, term956.getClass(), "val", 1084849225);
        setField(term956, term956.getClass(), "prev", null);
        setField(term956, term956.getClass(), "next", term942);
        setField(term952, term952.getClass(), "next", term956);
        setField(term944, term944.getClass(), "next", term952);
        setField(term942, term942.getClass(), "prev", term944);
        setField(term942, term942.getClass(), "next", term952);
        setField(term940, term940.getClass(), "prev", term942);
        setField(term940, term940.getClass(), "next", term948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = term940;
        callMethod(klass, "deleteFromEnd", argTypes, term922, args);
    }

};


