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

public class UserVO_getPower_1240248884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5270;

    public UserVO_getPower_1240248884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5271 = new Integer(962840079);
        Integer term5312 = new Integer(1540719661);
        Integer term5316 = new Integer(1265463001);
        ArrayList term5320 = new ArrayList();
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        Object term5311 = newInstance(Class.forName("com.org.model.Menu"));
        Object term5323 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term5311, term5311.getClass(), "id", term5312);
        setField(term5311, term5311.getClass(), "name", "");
        setField(term5311, term5311.getClass(), "path", "");
        setField(term5311, term5311.getClass(), "parentId", term5316);
        setField(term5311, term5311.getClass(), "icon", "");
        setField(term5311, term5311.getClass(), "introduce", "");
        setField(term5311, term5311.getClass(), "children", term5320);
        setField(term5323, term5323.getClass(), "title", null);
        setField(term5323, term5323.getClass(), "icon", null);
        setField(term5311, term5311.getClass(), "meta", term5323);
        Integer term5325 = new Integer(1114000454);
        Integer term5329 = new Integer(-556405712);
        ArrayList term5333 = new ArrayList();
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        ((ArrayList) term5333).add((Object)null);
        Object term5324 = newInstance(Class.forName("com.org.model.Menu"));
        Object term5336 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term5324, term5324.getClass(), "id", term5325);
        setField(term5324, term5324.getClass(), "name", "");
        setField(term5324, term5324.getClass(), "path", "");
        setField(term5324, term5324.getClass(), "parentId", term5329);
        setField(term5324, term5324.getClass(), "icon", "");
        setField(term5324, term5324.getClass(), "introduce", "");
        setField(term5324, term5324.getClass(), "children", term5333);
        setField(term5336, term5336.getClass(), "title", null);
        setField(term5336, term5336.getClass(), "icon", null);
        setField(term5324, term5324.getClass(), "meta", term5336);
        Object term5337 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term5337, term5337.getClass(), "id", null);
        setField(term5337, term5337.getClass(), "name", null);
        setField(term5337, term5337.getClass(), "path", null);
        setField(term5337, term5337.getClass(), "parentId", null);
        setField(term5337, term5337.getClass(), "icon", null);
        setField(term5337, term5337.getClass(), "introduce", null);
        setField(term5337, term5337.getClass(), "children", null);
        setField(term5337, term5337.getClass(), "meta", null);
        ArrayList term5309 = new ArrayList();
        ((ArrayList) term5309).add(term5311);
        ((ArrayList) term5309).add(term5324);
        ((ArrayList) term5309).add(term5337);
        term5270 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term5270, term5270.getClass(), "id", term5271);
        setField(term5270, term5270.getClass(), "email", "cTCixEbHYT");
        setField(term5270, term5270.getClass(), "username", "bqKksqtAdT");
        setField(term5270, term5270.getClass(), "power", "jAIAdEmULK");
        setField(term5270, term5270.getClass(), "menus", term5309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term5270, args);
    }

};


