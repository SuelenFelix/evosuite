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

public class User_getPhone_3080538389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17203;

    public User_getPhone_3080538389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17204 = new Integer(-1672904007);
        Integer term17278 = new Integer(-217232010);
        Integer term17343 = new Integer(2053372601);
        Integer term17352 = new Integer(-1828855069);
        Integer term17354 = new Integer(-1213694931);
        Integer term17358 = new Integer(-1255656944);
        Object term17342 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term17345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17349 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term17342, term17342.getClass(), "id", term17343);
        setField(term17345, term17345.getClass(), "date", null);
        setField(term17345, term17345.getClass(), "time", null);
        setField(term17342, term17342.getClass(), "createTime", term17345);
        setField(term17342, term17342.getClass(), "name", "");
        setField(term17342, term17342.getClass(), "link", "");
        setField(term17342, term17342.getClass(), "introduce", "");
        setField(term17349, term17349.getClass(), "date", null);
        setField(term17349, term17349.getClass(), "time", null);
        setField(term17342, term17342.getClass(), "updateTime", term17349);
        setField(term17342, term17342.getClass(), "meetingTime", "");
        setField(term17342, term17342.getClass(), "signTime", "");
        setField(term17342, term17342.getClass(), "signNumber", term17352);
        setField(term17342, term17342.getClass(), "userNumber", term17354);
        setField(term17342, term17342.getClass(), "fileUrl", "");
        setBooleanField(term17342, term17342.getClass(), "online", true);
        setField(term17342, term17342.getClass(), "deleted", term17358);
        setField(term17342, term17342.getClass(), "host", "");
        Integer term17362 = new Integer(-377697034);
        Integer term17371 = new Integer(1102778743);
        Integer term17373 = new Integer(1300928519);
        Integer term17377 = new Integer(338172676);
        Object term17361 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term17364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17368 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term17361, term17361.getClass(), "id", term17362);
        setField(term17364, term17364.getClass(), "date", null);
        setField(term17364, term17364.getClass(), "time", null);
        setField(term17361, term17361.getClass(), "createTime", term17364);
        setField(term17361, term17361.getClass(), "name", "");
        setField(term17361, term17361.getClass(), "link", "");
        setField(term17361, term17361.getClass(), "introduce", "");
        setField(term17368, term17368.getClass(), "date", null);
        setField(term17368, term17368.getClass(), "time", null);
        setField(term17361, term17361.getClass(), "updateTime", term17368);
        setField(term17361, term17361.getClass(), "meetingTime", "");
        setField(term17361, term17361.getClass(), "signTime", "");
        setField(term17361, term17361.getClass(), "signNumber", term17371);
        setField(term17361, term17361.getClass(), "userNumber", term17373);
        setField(term17361, term17361.getClass(), "fileUrl", "");
        setBooleanField(term17361, term17361.getClass(), "online", false);
        setField(term17361, term17361.getClass(), "deleted", term17377);
        setField(term17361, term17361.getClass(), "host", "");
        ArrayList term17340 = new ArrayList();
        ((ArrayList) term17340).add(term17342);
        ((ArrayList) term17340).add(term17361);
        Integer term17385 = new Integer(-1896960942);
        Integer term17389 = new Integer(-935912608);
        ArrayList term17393 = new ArrayList();
        ((ArrayList) term17393).add((Object)null);
        ((ArrayList) term17393).add((Object)null);
        Object term17384 = newInstance(Class.forName("com.org.model.Menu"));
        Object term17396 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term17384, term17384.getClass(), "id", term17385);
        setField(term17384, term17384.getClass(), "name", "");
        setField(term17384, term17384.getClass(), "path", "");
        setField(term17384, term17384.getClass(), "parentId", term17389);
        setField(term17384, term17384.getClass(), "icon", "");
        setField(term17384, term17384.getClass(), "introduce", "");
        setField(term17384, term17384.getClass(), "children", term17393);
        setField(term17396, term17396.getClass(), "title", null);
        setField(term17396, term17396.getClass(), "icon", null);
        setField(term17384, term17384.getClass(), "meta", term17396);
        Integer term17398 = new Integer(1843465187);
        Integer term17402 = new Integer(529595969);
        ArrayList term17406 = new ArrayList();
        ((ArrayList) term17406).add((Object)null);
        ((ArrayList) term17406).add((Object)null);
        Object term17397 = newInstance(Class.forName("com.org.model.Menu"));
        Object term17409 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term17397, term17397.getClass(), "id", term17398);
        setField(term17397, term17397.getClass(), "name", "");
        setField(term17397, term17397.getClass(), "path", "");
        setField(term17397, term17397.getClass(), "parentId", term17402);
        setField(term17397, term17397.getClass(), "icon", "");
        setField(term17397, term17397.getClass(), "introduce", "");
        setField(term17397, term17397.getClass(), "children", term17406);
        setField(term17409, term17409.getClass(), "title", null);
        setField(term17409, term17409.getClass(), "icon", null);
        setField(term17397, term17397.getClass(), "meta", term17409);
        Integer term17411 = new Integer(-638126185);
        Integer term17415 = new Integer(28070985);
        ArrayList term17419 = new ArrayList();
        ((ArrayList) term17419).add((Object)null);
        ((ArrayList) term17419).add((Object)null);
        ((ArrayList) term17419).add((Object)null);
        ((ArrayList) term17419).add((Object)null);
        ((ArrayList) term17419).add((Object)null);
        ((ArrayList) term17419).add((Object)null);
        Object term17410 = newInstance(Class.forName("com.org.model.Menu"));
        Object term17422 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term17410, term17410.getClass(), "id", term17411);
        setField(term17410, term17410.getClass(), "name", "");
        setField(term17410, term17410.getClass(), "path", "");
        setField(term17410, term17410.getClass(), "parentId", term17415);
        setField(term17410, term17410.getClass(), "icon", "");
        setField(term17410, term17410.getClass(), "introduce", "");
        setField(term17410, term17410.getClass(), "children", term17419);
        setField(term17422, term17422.getClass(), "title", null);
        setField(term17422, term17422.getClass(), "icon", null);
        setField(term17410, term17410.getClass(), "meta", term17422);
        ArrayList term17382 = new ArrayList();
        ((ArrayList) term17382).add(term17384);
        ((ArrayList) term17382).add(term17397);
        ((ArrayList) term17382).add(term17410);
        term17203 = newInstance(Class.forName("com.org.model.User"));
        setField(term17203, term17203.getClass(), "id", term17204);
        setField(term17203, term17203.getClass(), "email", "yztwwqDqge");
        setField(term17203, term17203.getClass(), "password", "orSUlVDZoM");
        setField(term17203, term17203.getClass(), "username", "UwuTUXfZlO");
        setField(term17203, term17203.getClass(), "power", "BuECvnjNNp");
        setField(term17203, term17203.getClass(), "nickname", "BjCrVrqCvg");
        setField(term17203, term17203.getClass(), "sex", "yaNWgtVtAg");
        setField(term17203, term17203.getClass(), "age", term17278);
        setField(term17203, term17203.getClass(), "phone", "BbNOrjlUDe");
        setField(term17203, term17203.getClass(), "faceUrl", "tHYPJBuwZT");
        setField(term17203, term17203.getClass(), "headUrl", "bvJdvzzEbX");
        setField(term17203, term17203.getClass(), "introduce", "qkbheFUdro");
        setField(term17203, term17203.getClass(), "ip", "adnAJZpEzc");
        setField(term17203, term17203.getClass(), "meetings", term17340);
        setField(term17203, term17203.getClass(), "menus", term17382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term17203, args);
    }

};


