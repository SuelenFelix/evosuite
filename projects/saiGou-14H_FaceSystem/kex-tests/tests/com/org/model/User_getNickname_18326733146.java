package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class User_getNickname_18326733146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16282;

    public User_getNickname_18326733146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16283 = new Integer(-1443119347);
        Integer term16357 = new Integer(1962181481);
        ArrayList term16419 = new ArrayList();
        Integer term16426 = new Integer(1798831879);
        Integer term16430 = new Integer(1393855580);
        ArrayList term16434 = new ArrayList();
        ((ArrayList) term16434).add((Object)null);
        ((ArrayList) term16434).add((Object)null);
        ((ArrayList) term16434).add((Object)null);
        ((ArrayList) term16434).add((Object)null);
        ((ArrayList) term16434).add((Object)null);
        ((ArrayList) term16434).add((Object)null);
        Object term16425 = newInstance(Class.forName("com.org.model.Menu"));
        Object term16437 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term16425, term16425.getClass(), "id", term16426);
        setField(term16425, term16425.getClass(), "name", "");
        setField(term16425, term16425.getClass(), "path", "");
        setField(term16425, term16425.getClass(), "parentId", term16430);
        setField(term16425, term16425.getClass(), "icon", "");
        setField(term16425, term16425.getClass(), "introduce", "");
        setField(term16425, term16425.getClass(), "children", term16434);
        setField(term16437, term16437.getClass(), "title", null);
        setField(term16437, term16437.getClass(), "icon", null);
        setField(term16425, term16425.getClass(), "meta", term16437);
        Integer term16439 = new Integer(957091706);
        Integer term16443 = new Integer(-2011802805);
        ArrayList term16447 = new ArrayList();
        ((ArrayList) term16447).add((Object)null);
        ((ArrayList) term16447).add((Object)null);
        ((ArrayList) term16447).add((Object)null);
        ((ArrayList) term16447).add((Object)null);
        ((ArrayList) term16447).add((Object)null);
        ((ArrayList) term16447).add((Object)null);
        Object term16438 = newInstance(Class.forName("com.org.model.Menu"));
        Object term16450 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term16438, term16438.getClass(), "id", term16439);
        setField(term16438, term16438.getClass(), "name", "");
        setField(term16438, term16438.getClass(), "path", "");
        setField(term16438, term16438.getClass(), "parentId", term16443);
        setField(term16438, term16438.getClass(), "icon", "");
        setField(term16438, term16438.getClass(), "introduce", "");
        setField(term16438, term16438.getClass(), "children", term16447);
        setField(term16450, term16450.getClass(), "title", null);
        setField(term16450, term16450.getClass(), "icon", null);
        setField(term16438, term16438.getClass(), "meta", term16450);
        Integer term16452 = new Integer(629005618);
        Integer term16456 = new Integer(-2006508013);
        ArrayList term16460 = new ArrayList();
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        ((ArrayList) term16460).add((Object)null);
        Object term16451 = newInstance(Class.forName("com.org.model.Menu"));
        Object term16463 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term16451, term16451.getClass(), "id", term16452);
        setField(term16451, term16451.getClass(), "name", "");
        setField(term16451, term16451.getClass(), "path", "");
        setField(term16451, term16451.getClass(), "parentId", term16456);
        setField(term16451, term16451.getClass(), "icon", "");
        setField(term16451, term16451.getClass(), "introduce", "");
        setField(term16451, term16451.getClass(), "children", term16460);
        setField(term16463, term16463.getClass(), "title", null);
        setField(term16463, term16463.getClass(), "icon", null);
        setField(term16451, term16451.getClass(), "meta", term16463);
        ArrayList term16423 = new ArrayList();
        ((ArrayList) term16423).add(term16425);
        ((ArrayList) term16423).add(term16438);
        ((ArrayList) term16423).add(term16451);
        term16282 = newInstance(Class.forName("com.org.model.User"));
        setField(term16282, term16282.getClass(), "id", term16283);
        setField(term16282, term16282.getClass(), "email", "fMURyzrrea");
        setField(term16282, term16282.getClass(), "password", "ygrjPzcZKQ");
        setField(term16282, term16282.getClass(), "username", "grvnzDWRmO");
        setField(term16282, term16282.getClass(), "power", "eYEANXeClm");
        setField(term16282, term16282.getClass(), "nickname", "JwZLjiquUU");
        setField(term16282, term16282.getClass(), "sex", "JAwwxWQgmr");
        setField(term16282, term16282.getClass(), "age", term16357);
        setField(term16282, term16282.getClass(), "phone", "lAdAYXKfnL");
        setField(term16282, term16282.getClass(), "faceUrl", "lTNqOlLdpl");
        setField(term16282, term16282.getClass(), "headUrl", "SPhkdbcCTv");
        setField(term16282, term16282.getClass(), "introduce", "MdyRBldsUU");
        setField(term16282, term16282.getClass(), "ip", "bMomxgTVVZ");
        setField(term16282, term16282.getClass(), "meetings", term16419);
        setField(term16282, term16282.getClass(), "menus", term16423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickname", argTypes, term16282, args);
    }

};


