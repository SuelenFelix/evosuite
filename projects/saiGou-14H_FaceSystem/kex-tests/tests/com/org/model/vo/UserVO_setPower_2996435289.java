package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class UserVO_setPower_2996435289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5983;

    public UserVO_setPower_2996435289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5984 = new Integer(-1274456137);
        Integer term6025 = new Integer(1041916673);
        Integer term6029 = new Integer(-601863069);
        ArrayList term6033 = new ArrayList();
        ((ArrayList) term6033).add((Object)null);
        Object term6024 = newInstance(Class.forName("com.org.model.Menu"));
        Object term6036 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term6024, term6024.getClass(), "id", term6025);
        setField(term6024, term6024.getClass(), "name", "");
        setField(term6024, term6024.getClass(), "path", "");
        setField(term6024, term6024.getClass(), "parentId", term6029);
        setField(term6024, term6024.getClass(), "icon", "");
        setField(term6024, term6024.getClass(), "introduce", "");
        setField(term6024, term6024.getClass(), "children", term6033);
        setField(term6036, term6036.getClass(), "title", null);
        setField(term6036, term6036.getClass(), "icon", null);
        setField(term6024, term6024.getClass(), "meta", term6036);
        Integer term6038 = new Integer(663292551);
        Integer term6042 = new Integer(-1885090354);
        ArrayList term6046 = new ArrayList();
        ((ArrayList) term6046).add((Object)null);
        ((ArrayList) term6046).add((Object)null);
        ((ArrayList) term6046).add((Object)null);
        ((ArrayList) term6046).add((Object)null);
        ((ArrayList) term6046).add((Object)null);
        ((ArrayList) term6046).add((Object)null);
        Object term6037 = newInstance(Class.forName("com.org.model.Menu"));
        Object term6049 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term6037, term6037.getClass(), "id", term6038);
        setField(term6037, term6037.getClass(), "name", "");
        setField(term6037, term6037.getClass(), "path", "");
        setField(term6037, term6037.getClass(), "parentId", term6042);
        setField(term6037, term6037.getClass(), "icon", "");
        setField(term6037, term6037.getClass(), "introduce", "");
        setField(term6037, term6037.getClass(), "children", term6046);
        setField(term6049, term6049.getClass(), "title", null);
        setField(term6049, term6049.getClass(), "icon", null);
        setField(term6037, term6037.getClass(), "meta", term6049);
        ArrayList term6022 = new ArrayList();
        ((ArrayList) term6022).add(term6024);
        ((ArrayList) term6022).add(term6037);
        term5983 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term5983, term5983.getClass(), "id", term5984);
        setField(term5983, term5983.getClass(), "email", "WmVcapKAeJ");
        setField(term5983, term5983.getClass(), "username", "jevOVdQdpc");
        setField(term5983, term5983.getClass(), "power", "TLLVSGTNsz");
        setField(term5983, term5983.getClass(), "menus", term6022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "skwxdosvQV";
        callMethod(klass, "setPower", argTypes, term5983, args);
    }

};


