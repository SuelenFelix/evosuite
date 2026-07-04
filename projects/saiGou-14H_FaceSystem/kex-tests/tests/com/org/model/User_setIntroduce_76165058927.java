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

public class User_setIntroduce_76165058927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24368;

    public User_setIntroduce_76165058927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24369 = new Integer(-482193296);
        Integer term24443 = new Integer(1506869786);
        Integer term24508 = new Integer(950749769);
        Integer term24517 = new Integer(1497396124);
        Integer term24519 = new Integer(1013816325);
        Integer term24523 = new Integer(-756785345);
        Object term24507 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term24510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24514 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term24507, term24507.getClass(), "id", term24508);
        setField(term24510, term24510.getClass(), "date", null);
        setField(term24510, term24510.getClass(), "time", null);
        setField(term24507, term24507.getClass(), "createTime", term24510);
        setField(term24507, term24507.getClass(), "name", "");
        setField(term24507, term24507.getClass(), "link", "");
        setField(term24507, term24507.getClass(), "introduce", "");
        setField(term24514, term24514.getClass(), "date", null);
        setField(term24514, term24514.getClass(), "time", null);
        setField(term24507, term24507.getClass(), "updateTime", term24514);
        setField(term24507, term24507.getClass(), "meetingTime", "");
        setField(term24507, term24507.getClass(), "signTime", "");
        setField(term24507, term24507.getClass(), "signNumber", term24517);
        setField(term24507, term24507.getClass(), "userNumber", term24519);
        setField(term24507, term24507.getClass(), "fileUrl", "");
        setBooleanField(term24507, term24507.getClass(), "online", false);
        setField(term24507, term24507.getClass(), "deleted", term24523);
        setField(term24507, term24507.getClass(), "host", "");
        Integer term24527 = new Integer(-1077451707);
        Integer term24536 = new Integer(-580180892);
        Integer term24538 = new Integer(862135498);
        Integer term24542 = new Integer(-1640521852);
        Object term24526 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term24529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24533 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term24526, term24526.getClass(), "id", term24527);
        setField(term24529, term24529.getClass(), "date", null);
        setField(term24529, term24529.getClass(), "time", null);
        setField(term24526, term24526.getClass(), "createTime", term24529);
        setField(term24526, term24526.getClass(), "name", "");
        setField(term24526, term24526.getClass(), "link", "");
        setField(term24526, term24526.getClass(), "introduce", "");
        setField(term24533, term24533.getClass(), "date", null);
        setField(term24533, term24533.getClass(), "time", null);
        setField(term24526, term24526.getClass(), "updateTime", term24533);
        setField(term24526, term24526.getClass(), "meetingTime", "");
        setField(term24526, term24526.getClass(), "signTime", "");
        setField(term24526, term24526.getClass(), "signNumber", term24536);
        setField(term24526, term24526.getClass(), "userNumber", term24538);
        setField(term24526, term24526.getClass(), "fileUrl", "");
        setBooleanField(term24526, term24526.getClass(), "online", false);
        setField(term24526, term24526.getClass(), "deleted", term24542);
        setField(term24526, term24526.getClass(), "host", "");
        ArrayList term24505 = new ArrayList();
        ((ArrayList) term24505).add(term24507);
        ((ArrayList) term24505).add(term24526);
        ArrayList term24547 = new ArrayList();
        term24368 = newInstance(Class.forName("com.org.model.User"));
        setField(term24368, term24368.getClass(), "id", term24369);
        setField(term24368, term24368.getClass(), "email", "BhnXbJKpVL");
        setField(term24368, term24368.getClass(), "password", "qItcoIgEyi");
        setField(term24368, term24368.getClass(), "username", "iSagnJzhui");
        setField(term24368, term24368.getClass(), "power", "OaAAAMaerG");
        setField(term24368, term24368.getClass(), "nickname", "LjWsBZjyXH");
        setField(term24368, term24368.getClass(), "sex", "IzVaWJAeHd");
        setField(term24368, term24368.getClass(), "age", term24443);
        setField(term24368, term24368.getClass(), "phone", "tjPkQolRer");
        setField(term24368, term24368.getClass(), "faceUrl", "ngoLwQfpWZ");
        setField(term24368, term24368.getClass(), "headUrl", "uTWBfvAsyO");
        setField(term24368, term24368.getClass(), "introduce", "PjflZBjLQm");
        setField(term24368, term24368.getClass(), "ip", "vKTFdmINnO");
        setField(term24368, term24368.getClass(), "meetings", term24505);
        setField(term24368, term24368.getClass(), "menus", term24547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zYbZAMKJJx";
        callMethod(klass, "setIntroduce", argTypes, term24368, args);
    }

};


