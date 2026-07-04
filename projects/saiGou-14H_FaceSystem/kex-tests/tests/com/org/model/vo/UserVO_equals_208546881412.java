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

public class UserVO_equals_208546881412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43838;
     Object term43907;

    public UserVO_equals_208546881412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43839 = new Integer(1544325432);
        Integer term43880 = new Integer(908157389);
        Integer term43884 = new Integer(691619263);
        ArrayList term43888 = new ArrayList();
        ((ArrayList) term43888).add((Object)null);
        ((ArrayList) term43888).add((Object)null);
        ((ArrayList) term43888).add((Object)null);
        ((ArrayList) term43888).add((Object)null);
        ((ArrayList) term43888).add((Object)null);
        ((ArrayList) term43888).add((Object)null);
        ((ArrayList) term43888).add((Object)null);
        Object term43879 = newInstance(Class.forName("com.org.model.Menu"));
        Object term43891 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term43879, term43879.getClass(), "id", term43880);
        setField(term43879, term43879.getClass(), "name", "");
        setField(term43879, term43879.getClass(), "path", "");
        setField(term43879, term43879.getClass(), "parentId", term43884);
        setField(term43879, term43879.getClass(), "icon", "");
        setField(term43879, term43879.getClass(), "introduce", "");
        setField(term43879, term43879.getClass(), "children", term43888);
        setField(term43891, term43891.getClass(), "title", null);
        setField(term43891, term43891.getClass(), "icon", null);
        setField(term43879, term43879.getClass(), "meta", term43891);
        Integer term43893 = new Integer(-170630873);
        Integer term43897 = new Integer(-1246900588);
        ArrayList term43901 = new ArrayList();
        ((ArrayList) term43901).add((Object)null);
        ((ArrayList) term43901).add((Object)null);
        ((ArrayList) term43901).add((Object)null);
        Object term43892 = newInstance(Class.forName("com.org.model.Menu"));
        Object term43904 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term43892, term43892.getClass(), "id", term43893);
        setField(term43892, term43892.getClass(), "name", "");
        setField(term43892, term43892.getClass(), "path", "");
        setField(term43892, term43892.getClass(), "parentId", term43897);
        setField(term43892, term43892.getClass(), "icon", "");
        setField(term43892, term43892.getClass(), "introduce", "");
        setField(term43892, term43892.getClass(), "children", term43901);
        setField(term43904, term43904.getClass(), "title", null);
        setField(term43904, term43904.getClass(), "icon", null);
        setField(term43892, term43892.getClass(), "meta", term43904);
        ArrayList term43877 = new ArrayList();
        ((ArrayList) term43877).add(term43879);
        ((ArrayList) term43877).add(term43892);
        term43838 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term43838, term43838.getClass(), "id", term43839);
        setField(term43838, term43838.getClass(), "email", "srliSRcrzg");
        setField(term43838, term43838.getClass(), "username", "odkRikRcOr");
        setField(term43838, term43838.getClass(), "power", "MutJLhZOKV");
        setField(term43838, term43838.getClass(), "menus", term43877);
        term43907 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43907;
        callMethod(klass, "equals", argTypes, term43838, args);
    }

};


