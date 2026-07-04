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

public class User_getAge_16201112888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16909;

    public User_getAge_16201112888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16910 = new Integer(-655035002);
        Integer term16984 = new Integer(1841475189);
        ArrayList term17046 = new ArrayList();
        Integer term17053 = new Integer(-456566581);
        Integer term17057 = new Integer(2114761003);
        ArrayList term17061 = new ArrayList();
        ((ArrayList) term17061).add((Object)null);
        ((ArrayList) term17061).add((Object)null);
        ((ArrayList) term17061).add((Object)null);
        ((ArrayList) term17061).add((Object)null);
        ((ArrayList) term17061).add((Object)null);
        ((ArrayList) term17061).add((Object)null);
        Object term17052 = newInstance(Class.forName("com.org.model.Menu"));
        Object term17064 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term17052, term17052.getClass(), "id", term17053);
        setField(term17052, term17052.getClass(), "name", "");
        setField(term17052, term17052.getClass(), "path", "");
        setField(term17052, term17052.getClass(), "parentId", term17057);
        setField(term17052, term17052.getClass(), "icon", "");
        setField(term17052, term17052.getClass(), "introduce", "");
        setField(term17052, term17052.getClass(), "children", term17061);
        setField(term17064, term17064.getClass(), "title", null);
        setField(term17064, term17064.getClass(), "icon", null);
        setField(term17052, term17052.getClass(), "meta", term17064);
        Integer term17066 = new Integer(622731276);
        Integer term17070 = new Integer(-1302341502);
        ArrayList term17074 = new ArrayList();
        ((ArrayList) term17074).add((Object)null);
        Object term17065 = newInstance(Class.forName("com.org.model.Menu"));
        Object term17077 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term17065, term17065.getClass(), "id", term17066);
        setField(term17065, term17065.getClass(), "name", "");
        setField(term17065, term17065.getClass(), "path", "");
        setField(term17065, term17065.getClass(), "parentId", term17070);
        setField(term17065, term17065.getClass(), "icon", "");
        setField(term17065, term17065.getClass(), "introduce", "");
        setField(term17065, term17065.getClass(), "children", term17074);
        setField(term17077, term17077.getClass(), "title", null);
        setField(term17077, term17077.getClass(), "icon", null);
        setField(term17065, term17065.getClass(), "meta", term17077);
        Integer term17079 = new Integer(-1948910444);
        Integer term17083 = new Integer(-1099061955);
        ArrayList term17087 = new ArrayList();
        ((ArrayList) term17087).add((Object)null);
        Object term17078 = newInstance(Class.forName("com.org.model.Menu"));
        Object term17090 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term17078, term17078.getClass(), "id", term17079);
        setField(term17078, term17078.getClass(), "name", "");
        setField(term17078, term17078.getClass(), "path", "");
        setField(term17078, term17078.getClass(), "parentId", term17083);
        setField(term17078, term17078.getClass(), "icon", "");
        setField(term17078, term17078.getClass(), "introduce", "");
        setField(term17078, term17078.getClass(), "children", term17087);
        setField(term17090, term17090.getClass(), "title", null);
        setField(term17090, term17090.getClass(), "icon", null);
        setField(term17078, term17078.getClass(), "meta", term17090);
        ArrayList term17050 = new ArrayList();
        ((ArrayList) term17050).add(term17052);
        ((ArrayList) term17050).add(term17065);
        ((ArrayList) term17050).add(term17065);
        ((ArrayList) term17050).add(term17078);
        term16909 = newInstance(Class.forName("com.org.model.User"));
        setField(term16909, term16909.getClass(), "id", term16910);
        setField(term16909, term16909.getClass(), "email", "JpNgFUEtkd");
        setField(term16909, term16909.getClass(), "password", "HAvelKHpob");
        setField(term16909, term16909.getClass(), "username", "nFKhEfljjj");
        setField(term16909, term16909.getClass(), "power", "TbAlefWyzU");
        setField(term16909, term16909.getClass(), "nickname", "CVIsKWEpTu");
        setField(term16909, term16909.getClass(), "sex", "HlqCQVVCvy");
        setField(term16909, term16909.getClass(), "age", term16984);
        setField(term16909, term16909.getClass(), "phone", "eSjqyipIEH");
        setField(term16909, term16909.getClass(), "faceUrl", "DoHfdWKluP");
        setField(term16909, term16909.getClass(), "headUrl", "APjhJaIDgk");
        setField(term16909, term16909.getClass(), "introduce", "QoFSUTaQng");
        setField(term16909, term16909.getClass(), "ip", "zRpqQnOFBI");
        setField(term16909, term16909.getClass(), "meetings", term17046);
        setField(term16909, term16909.getClass(), "menus", term17050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term16909, args);
    }

};


