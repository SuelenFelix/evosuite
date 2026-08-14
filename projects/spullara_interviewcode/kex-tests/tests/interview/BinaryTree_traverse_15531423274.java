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

public class BinaryTree_traverse_15531423274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term139;
     Object term163;

    public BinaryTree_traverse_15531423274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = newInstance(Class.forName("interview.BinaryTree"));
        term139 = newInstance(Class.forName("interview.Node"));
        Object term142 = newInstance(Class.forName("interview.Node"));
        Object term145 = newInstance(Class.forName("interview.Node"));
        Object term148 = newInstance(Class.forName("interview.Node"));
        Object term151 = newInstance(Class.forName("interview.Node"));
        Object term154 = newInstance(Class.forName("interview.Node"));
        Object term157 = newInstance(Class.forName("interview.Node"));
        Object term160 = newInstance(Class.forName("interview.Node"));
        setField(term139, term139.getClass(), "text", null);
        setIntField(term139, term139.getClass(), "start", 1962444399);
        setIntField(term139, term139.getClass(), "end", 767834723);
        setField(term142, term142.getClass(), "text", null);
        setIntField(term142, term142.getClass(), "start", -602026508);
        setIntField(term142, term142.getClass(), "end", -157887805);
        setField(term145, term145.getClass(), "text", null);
        setIntField(term145, term145.getClass(), "start", 1876565163);
        setIntField(term145, term145.getClass(), "end", -817164822);
        setField(term148, term148.getClass(), "text", null);
        setIntField(term148, term148.getClass(), "start", -1016503459);
        setIntField(term148, term148.getClass(), "end", -1968847291);
        setField(term151, term151.getClass(), "text", null);
        setIntField(term151, term151.getClass(), "start", 579005622);
        setIntField(term151, term151.getClass(), "end", -14890619);
        setField(term151, term151.getClass(), "left", null);
        setField(term151, term151.getClass(), "right", null);
        setField(term148, term148.getClass(), "left", term151);
        setField(term154, term154.getClass(), "text", null);
        setIntField(term154, term154.getClass(), "start", 0);
        setIntField(term154, term154.getClass(), "end", 0);
        setField(term154, term154.getClass(), "left", null);
        setField(term154, term154.getClass(), "right", null);
        setField(term148, term148.getClass(), "right", term154);
        setField(term145, term145.getClass(), "left", term148);
        setField(term157, term157.getClass(), "text", null);
        setIntField(term157, term157.getClass(), "start", 0);
        setIntField(term157, term157.getClass(), "end", 0);
        setField(term157, term157.getClass(), "left", null);
        setField(term157, term157.getClass(), "right", null);
        setField(term145, term145.getClass(), "right", term157);
        setField(term142, term142.getClass(), "left", term145);
        setField(term160, term160.getClass(), "text", null);
        setIntField(term160, term160.getClass(), "start", 0);
        setIntField(term160, term160.getClass(), "end", 0);
        setField(term160, term160.getClass(), "left", null);
        setField(term160, term160.getClass(), "right", null);
        setField(term142, term142.getClass(), "right", term160);
        setField(term139, term139.getClass(), "left", term142);
        setField(term139, term139.getClass(), "right", term154);
        term163 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term164 = (byte[]) newByteArray(16);
        setField(term163, term163.getClass(), "value", term164);
        setByteField(term163, term163.getClass(), "coder", (byte) 47);
        setIntField(term163, term163.getClass(), "count", 1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interview.BinaryTree");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Class.forName("interview.Node");
        argTypes[2] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term139;
        args[2] = term163;
        callMethod(klass, "traverse", argTypes, term138, args);
    }

};


