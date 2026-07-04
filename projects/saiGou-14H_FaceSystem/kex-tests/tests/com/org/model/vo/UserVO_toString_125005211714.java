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

public class UserVO_toString_125005211714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6819;

    public UserVO_toString_125005211714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6820 = new Integer(-2070466617);
        Integer term6861 = new Integer(-1127721881);
        Integer term6865 = new Integer(1074848808);
        ArrayList term6869 = new ArrayList();
        ((ArrayList) term6869).add((Object)null);
        ((ArrayList) term6869).add((Object)null);
        ((ArrayList) term6869).add((Object)null);
        ((ArrayList) term6869).add((Object)null);
        ((ArrayList) term6869).add((Object)null);
        ((ArrayList) term6869).add((Object)null);
        ((ArrayList) term6869).add((Object)null);
        Object term6860 = newInstance(Class.forName("com.org.model.Menu"));
        Object term6872 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term6860, term6860.getClass(), "id", term6861);
        setField(term6860, term6860.getClass(), "name", "");
        setField(term6860, term6860.getClass(), "path", "");
        setField(term6860, term6860.getClass(), "parentId", term6865);
        setField(term6860, term6860.getClass(), "icon", "");
        setField(term6860, term6860.getClass(), "introduce", "");
        setField(term6860, term6860.getClass(), "children", term6869);
        setField(term6872, term6872.getClass(), "title", null);
        setField(term6872, term6872.getClass(), "icon", null);
        setField(term6860, term6860.getClass(), "meta", term6872);
        Integer term6874 = new Integer(-288604325);
        Integer term6878 = new Integer(-1268314569);
        ArrayList term6882 = new ArrayList();
        ((ArrayList) term6882).add((Object)null);
        Object term6873 = newInstance(Class.forName("com.org.model.Menu"));
        Object term6885 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term6873, term6873.getClass(), "id", term6874);
        setField(term6873, term6873.getClass(), "name", "");
        setField(term6873, term6873.getClass(), "path", "");
        setField(term6873, term6873.getClass(), "parentId", term6878);
        setField(term6873, term6873.getClass(), "icon", "");
        setField(term6873, term6873.getClass(), "introduce", "");
        setField(term6873, term6873.getClass(), "children", term6882);
        setField(term6885, term6885.getClass(), "title", null);
        setField(term6885, term6885.getClass(), "icon", null);
        setField(term6873, term6873.getClass(), "meta", term6885);
        Integer term6887 = new Integer(-2119545015);
        Integer term6891 = new Integer(1272542218);
        ArrayList term6895 = new ArrayList();
        ((ArrayList) term6895).add((Object)null);
        Object term6886 = newInstance(Class.forName("com.org.model.Menu"));
        Object term6898 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term6886, term6886.getClass(), "id", term6887);
        setField(term6886, term6886.getClass(), "name", "");
        setField(term6886, term6886.getClass(), "path", "");
        setField(term6886, term6886.getClass(), "parentId", term6891);
        setField(term6886, term6886.getClass(), "icon", "");
        setField(term6886, term6886.getClass(), "introduce", "");
        setField(term6886, term6886.getClass(), "children", term6895);
        setField(term6898, term6898.getClass(), "title", null);
        setField(term6898, term6898.getClass(), "icon", null);
        setField(term6886, term6886.getClass(), "meta", term6898);
        ArrayList term6858 = new ArrayList();
        ((ArrayList) term6858).add(term6860);
        ((ArrayList) term6858).add(term6873);
        ((ArrayList) term6858).add(term6886);
        term6819 = newInstance(Class.forName("com.org.model.vo.UserVO"));
        setField(term6819, term6819.getClass(), "id", term6820);
        setField(term6819, term6819.getClass(), "email", "qShfKMgKGs");
        setField(term6819, term6819.getClass(), "username", "bLCaDnEUyS");
        setField(term6819, term6819.getClass(), "power", "yfHcOCDrGy");
        setField(term6819, term6819.getClass(), "menus", term6858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.UserVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6819, args);
    }

};


