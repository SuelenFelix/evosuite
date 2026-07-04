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

public class User_getId_6508256161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14183;

    public User_getId_6508256161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14184 = new Integer(-684064427);
        Integer term14258 = new Integer(-1981080836);
        Integer term14323 = new Integer(-176676344);
        Integer term14332 = new Integer(1949009312);
        Integer term14334 = new Integer(-432054743);
        Integer term14338 = new Integer(-859726380);
        Object term14322 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term14325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14329 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14322, term14322.getClass(), "id", term14323);
        setField(term14325, term14325.getClass(), "date", null);
        setField(term14325, term14325.getClass(), "time", null);
        setField(term14322, term14322.getClass(), "createTime", term14325);
        setField(term14322, term14322.getClass(), "name", "");
        setField(term14322, term14322.getClass(), "link", "");
        setField(term14322, term14322.getClass(), "introduce", "");
        setField(term14329, term14329.getClass(), "date", null);
        setField(term14329, term14329.getClass(), "time", null);
        setField(term14322, term14322.getClass(), "updateTime", term14329);
        setField(term14322, term14322.getClass(), "meetingTime", "");
        setField(term14322, term14322.getClass(), "signTime", "");
        setField(term14322, term14322.getClass(), "signNumber", term14332);
        setField(term14322, term14322.getClass(), "userNumber", term14334);
        setField(term14322, term14322.getClass(), "fileUrl", "");
        setBooleanField(term14322, term14322.getClass(), "online", true);
        setField(term14322, term14322.getClass(), "deleted", term14338);
        setField(term14322, term14322.getClass(), "host", "");
        Integer term14342 = new Integer(-1498422654);
        Integer term14351 = new Integer(-1499829233);
        Integer term14353 = new Integer(-888855662);
        Integer term14357 = new Integer(-1483966656);
        Object term14341 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term14344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14348 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14341, term14341.getClass(), "id", term14342);
        setField(term14344, term14344.getClass(), "date", null);
        setField(term14344, term14344.getClass(), "time", null);
        setField(term14341, term14341.getClass(), "createTime", term14344);
        setField(term14341, term14341.getClass(), "name", "");
        setField(term14341, term14341.getClass(), "link", "");
        setField(term14341, term14341.getClass(), "introduce", "");
        setField(term14348, term14348.getClass(), "date", null);
        setField(term14348, term14348.getClass(), "time", null);
        setField(term14341, term14341.getClass(), "updateTime", term14348);
        setField(term14341, term14341.getClass(), "meetingTime", "");
        setField(term14341, term14341.getClass(), "signTime", "");
        setField(term14341, term14341.getClass(), "signNumber", term14351);
        setField(term14341, term14341.getClass(), "userNumber", term14353);
        setField(term14341, term14341.getClass(), "fileUrl", "");
        setBooleanField(term14341, term14341.getClass(), "online", false);
        setField(term14341, term14341.getClass(), "deleted", term14357);
        setField(term14341, term14341.getClass(), "host", "");
        ArrayList term14320 = new ArrayList();
        ((ArrayList) term14320).add(term14322);
        ((ArrayList) term14320).add(term14341);
        Integer term14365 = new Integer(-334260786);
        Integer term14369 = new Integer(-765890956);
        ArrayList term14373 = new ArrayList();
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        ((ArrayList) term14373).add((Object)null);
        Object term14364 = newInstance(Class.forName("com.org.model.Menu"));
        Object term14376 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term14364, term14364.getClass(), "id", term14365);
        setField(term14364, term14364.getClass(), "name", "");
        setField(term14364, term14364.getClass(), "path", "");
        setField(term14364, term14364.getClass(), "parentId", term14369);
        setField(term14364, term14364.getClass(), "icon", "");
        setField(term14364, term14364.getClass(), "introduce", "");
        setField(term14364, term14364.getClass(), "children", term14373);
        setField(term14376, term14376.getClass(), "title", null);
        setField(term14376, term14376.getClass(), "icon", null);
        setField(term14364, term14364.getClass(), "meta", term14376);
        Integer term14378 = new Integer(-1642688455);
        Integer term14382 = new Integer(-1184558215);
        ArrayList term14386 = new ArrayList();
        Object term14377 = newInstance(Class.forName("com.org.model.Menu"));
        Object term14389 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term14377, term14377.getClass(), "id", term14378);
        setField(term14377, term14377.getClass(), "name", "");
        setField(term14377, term14377.getClass(), "path", "");
        setField(term14377, term14377.getClass(), "parentId", term14382);
        setField(term14377, term14377.getClass(), "icon", "");
        setField(term14377, term14377.getClass(), "introduce", "");
        setField(term14377, term14377.getClass(), "children", term14386);
        setField(term14389, term14389.getClass(), "title", null);
        setField(term14389, term14389.getClass(), "icon", null);
        setField(term14377, term14377.getClass(), "meta", term14389);
        Integer term14391 = new Integer(-1099664830);
        Integer term14395 = new Integer(873502011);
        ArrayList term14399 = new ArrayList();
        ((ArrayList) term14399).add((Object)null);
        ((ArrayList) term14399).add((Object)null);
        ((ArrayList) term14399).add((Object)null);
        ((ArrayList) term14399).add((Object)null);
        ((ArrayList) term14399).add((Object)null);
        ((ArrayList) term14399).add((Object)null);
        ((ArrayList) term14399).add((Object)null);
        Object term14390 = newInstance(Class.forName("com.org.model.Menu"));
        Object term14402 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term14390, term14390.getClass(), "id", term14391);
        setField(term14390, term14390.getClass(), "name", "");
        setField(term14390, term14390.getClass(), "path", "");
        setField(term14390, term14390.getClass(), "parentId", term14395);
        setField(term14390, term14390.getClass(), "icon", "");
        setField(term14390, term14390.getClass(), "introduce", "");
        setField(term14390, term14390.getClass(), "children", term14399);
        setField(term14402, term14402.getClass(), "title", null);
        setField(term14402, term14402.getClass(), "icon", null);
        setField(term14390, term14390.getClass(), "meta", term14402);
        ArrayList term14362 = new ArrayList();
        ((ArrayList) term14362).add(term14364);
        ((ArrayList) term14362).add(term14377);
        ((ArrayList) term14362).add(term14390);
        term14183 = newInstance(Class.forName("com.org.model.User"));
        setField(term14183, term14183.getClass(), "id", term14184);
        setField(term14183, term14183.getClass(), "email", "MmpIaMLtIl");
        setField(term14183, term14183.getClass(), "password", "NdxOgIeywq");
        setField(term14183, term14183.getClass(), "username", "CVVuyKTkfU");
        setField(term14183, term14183.getClass(), "power", "kVJJpdqrcb");
        setField(term14183, term14183.getClass(), "nickname", "lrxpxFLOlO");
        setField(term14183, term14183.getClass(), "sex", "TlaWwdzyFj");
        setField(term14183, term14183.getClass(), "age", term14258);
        setField(term14183, term14183.getClass(), "phone", "JFwtRLPoHH");
        setField(term14183, term14183.getClass(), "faceUrl", "PkFqFUDNRB");
        setField(term14183, term14183.getClass(), "headUrl", "JTaFYFigKc");
        setField(term14183, term14183.getClass(), "introduce", "UkkxEeaUAd");
        setField(term14183, term14183.getClass(), "ip", "YuCzAoZaux");
        setField(term14183, term14183.getClass(), "meetings", term14320);
        setField(term14183, term14183.getClass(), "menus", term14362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term14183, args);
    }

};


