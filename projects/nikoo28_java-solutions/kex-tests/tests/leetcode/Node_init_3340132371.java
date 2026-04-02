package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Node_init_3340132371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6985;
     Object term6987;
     Object term7005;

    public Node_init_3340132371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6985 = new Integer(1641342112);
        term6987 = newInstance(Class.forName("leetcode.Node"));
        Object term6989 = newInstance(Class.forName("leetcode.Node"));
        Object term6991 = newInstance(Class.forName("leetcode.Node"));
        Object term6993 = newInstance(Class.forName("leetcode.Node"));
        Object term6995 = newInstance(Class.forName("leetcode.Node"));
        Object term6997 = newInstance(Class.forName("leetcode.Node"));
        Object term6999 = newInstance(Class.forName("leetcode.Node"));
        Object term7001 = newInstance(Class.forName("leetcode.Node"));
        Object term7003 = newInstance(Class.forName("leetcode.Node"));
        setIntField(term6987, term6987.getClass(), "val", -1551790945);
        setIntField(term6989, term6989.getClass(), "val", 2039538484);
        setIntField(term6991, term6991.getClass(), "val", 1235736068);
        setIntField(term6993, term6993.getClass(), "val", 329424176);
        setIntField(term6995, term6995.getClass(), "val", -1897199214);
        setField(term6995, term6995.getClass(), "next", null);
        setField(term6995, term6995.getClass(), "random", term6989);
        setField(term6993, term6993.getClass(), "next", term6995);
        setIntField(term6997, term6997.getClass(), "val", -1654552020);
        setField(term6997, term6997.getClass(), "next", null);
        setField(term6997, term6997.getClass(), "random", null);
        setField(term6993, term6993.getClass(), "random", term6997);
        setField(term6991, term6991.getClass(), "next", term6993);
        setIntField(term6999, term6999.getClass(), "val", 638046409);
        setIntField(term7001, term7001.getClass(), "val", 427274898);
        setField(term7001, term7001.getClass(), "next", term6997);
        setField(term7001, term7001.getClass(), "random", term6987);
        setField(term6999, term6999.getClass(), "next", term7001);
        setIntField(term7003, term7003.getClass(), "val", -1016478729);
        setField(term7003, term7003.getClass(), "next", null);
        setField(term7003, term7003.getClass(), "random", term6989);
        setField(term6999, term6999.getClass(), "random", term7003);
        setField(term6991, term6991.getClass(), "random", term6999);
        setField(term6989, term6989.getClass(), "next", term6991);
        setField(term6989, term6989.getClass(), "random", term6999);
        setField(term6987, term6987.getClass(), "next", term6989);
        setField(term6987, term6987.getClass(), "random", term6995);
        term7005 = newInstance(Class.forName("leetcode.Node"));
        Object term7007 = newInstance(Class.forName("leetcode.Node"));
        Object term7009 = newInstance(Class.forName("leetcode.Node"));
        Object term7011 = newInstance(Class.forName("leetcode.Node"));
        Object term7013 = newInstance(Class.forName("leetcode.Node"));
        Object term7015 = newInstance(Class.forName("leetcode.Node"));
        Object term7017 = newInstance(Class.forName("leetcode.Node"));
        Object term7019 = newInstance(Class.forName("leetcode.Node"));
        Object term7021 = newInstance(Class.forName("leetcode.Node"));
        setIntField(term7005, term7005.getClass(), "val", -1049546692);
        setIntField(term7007, term7007.getClass(), "val", 1397781598);
        setIntField(term7009, term7009.getClass(), "val", -44720365);
        setIntField(term7011, term7011.getClass(), "val", 1963632911);
        setIntField(term7013, term7013.getClass(), "val", -1100497683);
        setField(term7013, term7013.getClass(), "next", null);
        setField(term7013, term7013.getClass(), "random", term7007);
        setField(term7011, term7011.getClass(), "next", term7013);
        setIntField(term7015, term7015.getClass(), "val", -945759470);
        setField(term7015, term7015.getClass(), "next", null);
        setField(term7015, term7015.getClass(), "random", null);
        setField(term7011, term7011.getClass(), "random", term7015);
        setField(term7009, term7009.getClass(), "next", term7011);
        setIntField(term7017, term7017.getClass(), "val", -1469668708);
        setIntField(term7019, term7019.getClass(), "val", 1796950482);
        setField(term7019, term7019.getClass(), "next", term7015);
        setField(term7019, term7019.getClass(), "random", term7005);
        setField(term7017, term7017.getClass(), "next", term7019);
        setIntField(term7021, term7021.getClass(), "val", 155423433);
        setField(term7021, term7021.getClass(), "next", null);
        setField(term7021, term7021.getClass(), "random", term7007);
        setField(term7017, term7017.getClass(), "random", term7021);
        setField(term7009, term7009.getClass(), "random", term7017);
        setField(term7007, term7007.getClass(), "next", term7009);
        setField(term7007, term7007.getClass(), "random", term7017);
        setField(term7005, term7005.getClass(), "next", term7007);
        setField(term7005, term7005.getClass(), "random", term7013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("leetcode.Node");
        argTypes[2] = Class.forName("leetcode.Node");
        Object[] args = new Object[3];
        args[0] = term6985;
        args[1] = term6987;
        args[2] = term7005;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


