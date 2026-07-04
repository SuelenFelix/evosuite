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

public class User_setEmail_177425392017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20177;

    public User_setEmail_177425392017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20178 = new Integer(787260842);
        Integer term20252 = new Integer(-137516512);
        Integer term20317 = new Integer(-585134115);
        Integer term20326 = new Integer(1435872700);
        Integer term20328 = new Integer(1421496660);
        Integer term20332 = new Integer(-1299897376);
        Object term20316 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term20319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20323 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term20316, term20316.getClass(), "id", term20317);
        setField(term20319, term20319.getClass(), "date", null);
        setField(term20319, term20319.getClass(), "time", null);
        setField(term20316, term20316.getClass(), "createTime", term20319);
        setField(term20316, term20316.getClass(), "name", "");
        setField(term20316, term20316.getClass(), "link", "");
        setField(term20316, term20316.getClass(), "introduce", "");
        setField(term20323, term20323.getClass(), "date", null);
        setField(term20323, term20323.getClass(), "time", null);
        setField(term20316, term20316.getClass(), "updateTime", term20323);
        setField(term20316, term20316.getClass(), "meetingTime", "");
        setField(term20316, term20316.getClass(), "signTime", "");
        setField(term20316, term20316.getClass(), "signNumber", term20326);
        setField(term20316, term20316.getClass(), "userNumber", term20328);
        setField(term20316, term20316.getClass(), "fileUrl", "");
        setBooleanField(term20316, term20316.getClass(), "online", false);
        setField(term20316, term20316.getClass(), "deleted", term20332);
        setField(term20316, term20316.getClass(), "host", "");
        ArrayList term20314 = new ArrayList();
        ((ArrayList) term20314).add(term20316);
        Integer term20340 = new Integer(1829266361);
        Integer term20344 = new Integer(-1296335739);
        ArrayList term20348 = new ArrayList();
        ((ArrayList) term20348).add((Object)null);
        Object term20339 = newInstance(Class.forName("com.org.model.Menu"));
        Object term20351 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term20339, term20339.getClass(), "id", term20340);
        setField(term20339, term20339.getClass(), "name", "");
        setField(term20339, term20339.getClass(), "path", "");
        setField(term20339, term20339.getClass(), "parentId", term20344);
        setField(term20339, term20339.getClass(), "icon", "");
        setField(term20339, term20339.getClass(), "introduce", "");
        setField(term20339, term20339.getClass(), "children", term20348);
        setField(term20351, term20351.getClass(), "title", null);
        setField(term20351, term20351.getClass(), "icon", null);
        setField(term20339, term20339.getClass(), "meta", term20351);
        Integer term20353 = new Integer(-520737857);
        Integer term20357 = new Integer(-2038325814);
        ArrayList term20361 = new ArrayList();
        ((ArrayList) term20361).add((Object)null);
        ((ArrayList) term20361).add((Object)null);
        ((ArrayList) term20361).add((Object)null);
        ((ArrayList) term20361).add((Object)null);
        Object term20352 = newInstance(Class.forName("com.org.model.Menu"));
        Object term20364 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term20352, term20352.getClass(), "id", term20353);
        setField(term20352, term20352.getClass(), "name", "");
        setField(term20352, term20352.getClass(), "path", "");
        setField(term20352, term20352.getClass(), "parentId", term20357);
        setField(term20352, term20352.getClass(), "icon", "");
        setField(term20352, term20352.getClass(), "introduce", "");
        setField(term20352, term20352.getClass(), "children", term20361);
        setField(term20364, term20364.getClass(), "title", null);
        setField(term20364, term20364.getClass(), "icon", null);
        setField(term20352, term20352.getClass(), "meta", term20364);
        Integer term20366 = new Integer(546963992);
        Integer term20370 = new Integer(1377120507);
        ArrayList term20374 = new ArrayList();
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        ((ArrayList) term20374).add((Object)null);
        Object term20365 = newInstance(Class.forName("com.org.model.Menu"));
        Object term20377 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term20365, term20365.getClass(), "id", term20366);
        setField(term20365, term20365.getClass(), "name", "");
        setField(term20365, term20365.getClass(), "path", "");
        setField(term20365, term20365.getClass(), "parentId", term20370);
        setField(term20365, term20365.getClass(), "icon", "");
        setField(term20365, term20365.getClass(), "introduce", "");
        setField(term20365, term20365.getClass(), "children", term20374);
        setField(term20377, term20377.getClass(), "title", null);
        setField(term20377, term20377.getClass(), "icon", null);
        setField(term20365, term20365.getClass(), "meta", term20377);
        Integer term20379 = new Integer(46781158);
        Integer term20383 = new Integer(-1987966813);
        ArrayList term20387 = new ArrayList();
        ((ArrayList) term20387).add((Object)null);
        ((ArrayList) term20387).add((Object)null);
        ((ArrayList) term20387).add((Object)null);
        ((ArrayList) term20387).add((Object)null);
        ((ArrayList) term20387).add((Object)null);
        ((ArrayList) term20387).add((Object)null);
        ((ArrayList) term20387).add((Object)null);
        ((ArrayList) term20387).add((Object)null);
        Object term20378 = newInstance(Class.forName("com.org.model.Menu"));
        Object term20390 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term20378, term20378.getClass(), "id", term20379);
        setField(term20378, term20378.getClass(), "name", "");
        setField(term20378, term20378.getClass(), "path", "");
        setField(term20378, term20378.getClass(), "parentId", term20383);
        setField(term20378, term20378.getClass(), "icon", "");
        setField(term20378, term20378.getClass(), "introduce", "");
        setField(term20378, term20378.getClass(), "children", term20387);
        setField(term20390, term20390.getClass(), "title", null);
        setField(term20390, term20390.getClass(), "icon", null);
        setField(term20378, term20378.getClass(), "meta", term20390);
        ArrayList term20337 = new ArrayList();
        ((ArrayList) term20337).add(term20339);
        ((ArrayList) term20337).add(term20352);
        ((ArrayList) term20337).add(term20365);
        ((ArrayList) term20337).add(term20378);
        ((ArrayList) term20337).add(term20378);
        term20177 = newInstance(Class.forName("com.org.model.User"));
        setField(term20177, term20177.getClass(), "id", term20178);
        setField(term20177, term20177.getClass(), "email", "kopyQNUhIV");
        setField(term20177, term20177.getClass(), "password", "jNxTZuasym");
        setField(term20177, term20177.getClass(), "username", "pqQZPnGjAE");
        setField(term20177, term20177.getClass(), "power", "wLFHiajqXh");
        setField(term20177, term20177.getClass(), "nickname", "xNZcqGsPAa");
        setField(term20177, term20177.getClass(), "sex", "JTJcXWkPMd");
        setField(term20177, term20177.getClass(), "age", term20252);
        setField(term20177, term20177.getClass(), "phone", "AAJiiNgWUi");
        setField(term20177, term20177.getClass(), "faceUrl", "OpDmORpuEC");
        setField(term20177, term20177.getClass(), "headUrl", "ARwHgcTrUV");
        setField(term20177, term20177.getClass(), "introduce", "cuVIpSGqvb");
        setField(term20177, term20177.getClass(), "ip", "nyZDBXBMYn");
        setField(term20177, term20177.getClass(), "meetings", term20314);
        setField(term20177, term20177.getClass(), "menus", term20337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aiBUdqSjno";
        callMethod(klass, "setEmail", argTypes, term20177, args);
    }

};


