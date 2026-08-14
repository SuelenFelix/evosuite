package interview;

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
import static interview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BinaryTree_insert_14236664022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term107;
     Object term131;

    public BinaryTree_insert_14236664022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("interview.BinaryTree"));
        term107 = newInstance(Class.forName("interview.Node"));
        Object term110 = newInstance(Class.forName("interview.Node"));
        Object term113 = newInstance(Class.forName("interview.Node"));
        Object term116 = newInstance(Class.forName("interview.Node"));
        Object term119 = newInstance(Class.forName("interview.Node"));
        Object term122 = newInstance(Class.forName("interview.Node"));
        Object term125 = newInstance(Class.forName("interview.Node"));
        Object term128 = newInstance(Class.forName("interview.Node"));
        setField(term107, term107.getClass(), "text", null);
        setIntField(term107, term107.getClass(), "start", 590364439);
        setIntField(term107, term107.getClass(), "end", 865208305);
        setField(term110, term110.getClass(), "text", null);
        setIntField(term110, term110.getClass(), "start", -1275173084);
        setIntField(term110, term110.getClass(), "end", -244121226);
        setField(term113, term113.getClass(), "text", null);
        setIntField(term113, term113.getClass(), "start", -203030934);
        setIntField(term113, term113.getClass(), "end", -1179120542);
        setField(term116, term116.getClass(), "text", null);
        setIntField(term116, term116.getClass(), "start", -73683645);
        setIntField(term116, term116.getClass(), "end", -226514366);
        setField(term119, term119.getClass(), "text", null);
        setIntField(term119, term119.getClass(), "start", 1193880199);
        setIntField(term119, term119.getClass(), "end", -1087774327);
        setField(term119, term119.getClass(), "left", null);
        setField(term119, term119.getClass(), "right", null);
        setField(term116, term116.getClass(), "left", term119);
        setField(term122, term122.getClass(), "text", null);
        setIntField(term122, term122.getClass(), "start", 0);
        setIntField(term122, term122.getClass(), "end", 0);
        setField(term122, term122.getClass(), "left", null);
        setField(term122, term122.getClass(), "right", null);
        setField(term116, term116.getClass(), "right", term122);
        setField(term113, term113.getClass(), "left", term116);
        setField(term125, term125.getClass(), "text", null);
        setIntField(term125, term125.getClass(), "start", 0);
        setIntField(term125, term125.getClass(), "end", 0);
        setField(term125, term125.getClass(), "left", null);
        setField(term125, term125.getClass(), "right", null);
        setField(term113, term113.getClass(), "right", term125);
        setField(term110, term110.getClass(), "left", term113);
        setField(term128, term128.getClass(), "text", null);
        setIntField(term128, term128.getClass(), "start", 0);
        setIntField(term128, term128.getClass(), "end", 0);
        setField(term128, term128.getClass(), "left", null);
        setField(term128, term128.getClass(), "right", null);
        setField(term110, term110.getClass(), "right", term128);
        setField(term107, term107.getClass(), "left", term110);
        setField(term107, term107.getClass(), "right", term122);
        term131 = newInstance(Class.forName("interview.Entity"));
        setIntField(term131, term131.getClass(), "start", -1530420153);
        setIntField(term131, term131.getClass(), "end", -469968304);
        setField(term131, term131.getClass(), "html", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interview.BinaryTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("interview.Node");
        argTypes[1] = Class.forName("interview.Entity");
        Object[] args = new Object[2];
        args[0] = term107;
        args[1] = term131;
        callMethod(klass, "insert", argTypes, term106, args);
    }

};


