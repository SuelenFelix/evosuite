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

public class User_setIntroduce_76165058930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24396;

    public User_setIntroduce_76165058930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24397 = new Integer(-482193296);
        Integer term24471 = new Integer(1506869786);
        Integer term24536 = new Integer(950749769);
        Integer term24545 = new Integer(1497396124);
        Integer term24547 = new Integer(1013816325);
        Integer term24551 = new Integer(-756785345);
        Object term24535 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term24538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24542 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term24535, term24535.getClass(), "id", term24536);
        setField(term24538, term24538.getClass(), "date", null);
        setField(term24538, term24538.getClass(), "time", null);
        setField(term24535, term24535.getClass(), "createTime", term24538);
        setField(term24535, term24535.getClass(), "name", "");
        setField(term24535, term24535.getClass(), "link", "");
        setField(term24535, term24535.getClass(), "introduce", "");
        setField(term24542, term24542.getClass(), "date", null);
        setField(term24542, term24542.getClass(), "time", null);
        setField(term24535, term24535.getClass(), "updateTime", term24542);
        setField(term24535, term24535.getClass(), "meetingTime", "");
        setField(term24535, term24535.getClass(), "signTime", "");
        setField(term24535, term24535.getClass(), "signNumber", term24545);
        setField(term24535, term24535.getClass(), "userNumber", term24547);
        setField(term24535, term24535.getClass(), "fileUrl", "");
        setBooleanField(term24535, term24535.getClass(), "online", false);
        setField(term24535, term24535.getClass(), "deleted", term24551);
        setField(term24535, term24535.getClass(), "host", "");
        Integer term24555 = new Integer(-1077451707);
        Integer term24564 = new Integer(-580180892);
        Integer term24566 = new Integer(862135498);
        Integer term24570 = new Integer(-1640521852);
        Object term24554 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term24557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24561 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term24554, term24554.getClass(), "id", term24555);
        setField(term24557, term24557.getClass(), "date", null);
        setField(term24557, term24557.getClass(), "time", null);
        setField(term24554, term24554.getClass(), "createTime", term24557);
        setField(term24554, term24554.getClass(), "name", "");
        setField(term24554, term24554.getClass(), "link", "");
        setField(term24554, term24554.getClass(), "introduce", "");
        setField(term24561, term24561.getClass(), "date", null);
        setField(term24561, term24561.getClass(), "time", null);
        setField(term24554, term24554.getClass(), "updateTime", term24561);
        setField(term24554, term24554.getClass(), "meetingTime", "");
        setField(term24554, term24554.getClass(), "signTime", "");
        setField(term24554, term24554.getClass(), "signNumber", term24564);
        setField(term24554, term24554.getClass(), "userNumber", term24566);
        setField(term24554, term24554.getClass(), "fileUrl", "");
        setBooleanField(term24554, term24554.getClass(), "online", false);
        setField(term24554, term24554.getClass(), "deleted", term24570);
        setField(term24554, term24554.getClass(), "host", "");
        ArrayList term24533 = new ArrayList();
        ((ArrayList) term24533).add(term24535);
        ((ArrayList) term24533).add(term24554);
        ArrayList term24575 = new ArrayList();
        term24396 = newInstance(Class.forName("com.org.model.User"));
        setField(term24396, term24396.getClass(), "id", term24397);
        setField(term24396, term24396.getClass(), "email", "qItcoIgEyi");
        setField(term24396, term24396.getClass(), "password", "iSagnJzhui");
        setField(term24396, term24396.getClass(), "username", "OaAAAMaerG");
        setField(term24396, term24396.getClass(), "power", "LjWsBZjyXH");
        setField(term24396, term24396.getClass(), "nickname", "IzVaWJAeHd");
        setField(term24396, term24396.getClass(), "sex", "tjPkQolRer");
        setField(term24396, term24396.getClass(), "age", term24471);
        setField(term24396, term24396.getClass(), "phone", "ngoLwQfpWZ");
        setField(term24396, term24396.getClass(), "faceUrl", "uTWBfvAsyO");
        setField(term24396, term24396.getClass(), "headUrl", "PjflZBjLQm");
        setField(term24396, term24396.getClass(), "introduce", "vKTFdmINnO");
        setField(term24396, term24396.getClass(), "ip", "yluqSskhal");
        setField(term24396, term24396.getClass(), "meetings", term24533);
        setField(term24396, term24396.getClass(), "menus", term24575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UbkdwQOyIg";
        callMethod(klass, "setIntroduce", argTypes, term24396, args);
    }

};


