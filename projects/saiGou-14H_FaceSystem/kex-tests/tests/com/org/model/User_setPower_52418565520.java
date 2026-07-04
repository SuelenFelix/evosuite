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

public class User_setPower_52418565520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21369;

    public User_setPower_52418565520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21370 = new Integer(1104795023);
        Integer term21444 = new Integer(-1833777337);
        Integer term21509 = new Integer(-2068333492);
        Integer term21518 = new Integer(1892862475);
        Integer term21520 = new Integer(-807914927);
        Integer term21524 = new Integer(-313873930);
        Object term21508 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term21511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21515 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term21508, term21508.getClass(), "id", term21509);
        setField(term21511, term21511.getClass(), "date", null);
        setField(term21511, term21511.getClass(), "time", null);
        setField(term21508, term21508.getClass(), "createTime", term21511);
        setField(term21508, term21508.getClass(), "name", "");
        setField(term21508, term21508.getClass(), "link", "");
        setField(term21508, term21508.getClass(), "introduce", "");
        setField(term21515, term21515.getClass(), "date", null);
        setField(term21515, term21515.getClass(), "time", null);
        setField(term21508, term21508.getClass(), "updateTime", term21515);
        setField(term21508, term21508.getClass(), "meetingTime", "");
        setField(term21508, term21508.getClass(), "signTime", "");
        setField(term21508, term21508.getClass(), "signNumber", term21518);
        setField(term21508, term21508.getClass(), "userNumber", term21520);
        setField(term21508, term21508.getClass(), "fileUrl", "");
        setBooleanField(term21508, term21508.getClass(), "online", true);
        setField(term21508, term21508.getClass(), "deleted", term21524);
        setField(term21508, term21508.getClass(), "host", "");
        ArrayList term21506 = new ArrayList();
        ((ArrayList) term21506).add(term21508);
        Integer term21532 = new Integer(-1064231188);
        Integer term21536 = new Integer(1631564781);
        ArrayList term21540 = new ArrayList();
        ((ArrayList) term21540).add((Object)null);
        ((ArrayList) term21540).add((Object)null);
        ((ArrayList) term21540).add((Object)null);
        ((ArrayList) term21540).add((Object)null);
        ((ArrayList) term21540).add((Object)null);
        Object term21531 = newInstance(Class.forName("com.org.model.Menu"));
        Object term21543 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term21531, term21531.getClass(), "id", term21532);
        setField(term21531, term21531.getClass(), "name", "");
        setField(term21531, term21531.getClass(), "path", "");
        setField(term21531, term21531.getClass(), "parentId", term21536);
        setField(term21531, term21531.getClass(), "icon", "");
        setField(term21531, term21531.getClass(), "introduce", "");
        setField(term21531, term21531.getClass(), "children", term21540);
        setField(term21543, term21543.getClass(), "title", null);
        setField(term21543, term21543.getClass(), "icon", null);
        setField(term21531, term21531.getClass(), "meta", term21543);
        Integer term21545 = new Integer(-2045231879);
        Integer term21549 = new Integer(1678025090);
        ArrayList term21553 = new ArrayList();
        Object term21544 = newInstance(Class.forName("com.org.model.Menu"));
        Object term21556 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term21544, term21544.getClass(), "id", term21545);
        setField(term21544, term21544.getClass(), "name", "");
        setField(term21544, term21544.getClass(), "path", "");
        setField(term21544, term21544.getClass(), "parentId", term21549);
        setField(term21544, term21544.getClass(), "icon", "");
        setField(term21544, term21544.getClass(), "introduce", "");
        setField(term21544, term21544.getClass(), "children", term21553);
        setField(term21556, term21556.getClass(), "title", null);
        setField(term21556, term21556.getClass(), "icon", null);
        setField(term21544, term21544.getClass(), "meta", term21556);
        Integer term21558 = new Integer(714453255);
        Integer term21562 = new Integer(2096762388);
        ArrayList term21566 = new ArrayList();
        ((ArrayList) term21566).add((Object)null);
        ((ArrayList) term21566).add((Object)null);
        ((ArrayList) term21566).add((Object)null);
        ((ArrayList) term21566).add((Object)null);
        ((ArrayList) term21566).add((Object)null);
        ((ArrayList) term21566).add((Object)null);
        ((ArrayList) term21566).add((Object)null);
        ((ArrayList) term21566).add((Object)null);
        Object term21557 = newInstance(Class.forName("com.org.model.Menu"));
        Object term21569 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term21557, term21557.getClass(), "id", term21558);
        setField(term21557, term21557.getClass(), "name", "");
        setField(term21557, term21557.getClass(), "path", "");
        setField(term21557, term21557.getClass(), "parentId", term21562);
        setField(term21557, term21557.getClass(), "icon", "");
        setField(term21557, term21557.getClass(), "introduce", "");
        setField(term21557, term21557.getClass(), "children", term21566);
        setField(term21569, term21569.getClass(), "title", null);
        setField(term21569, term21569.getClass(), "icon", null);
        setField(term21557, term21557.getClass(), "meta", term21569);
        Integer term21571 = new Integer(-665938382);
        Integer term21575 = new Integer(325391588);
        ArrayList term21579 = new ArrayList();
        ((ArrayList) term21579).add((Object)null);
        ((ArrayList) term21579).add((Object)null);
        ((ArrayList) term21579).add((Object)null);
        Object term21570 = newInstance(Class.forName("com.org.model.Menu"));
        Object term21582 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term21570, term21570.getClass(), "id", term21571);
        setField(term21570, term21570.getClass(), "name", "");
        setField(term21570, term21570.getClass(), "path", "");
        setField(term21570, term21570.getClass(), "parentId", term21575);
        setField(term21570, term21570.getClass(), "icon", "");
        setField(term21570, term21570.getClass(), "introduce", "");
        setField(term21570, term21570.getClass(), "children", term21579);
        setField(term21582, term21582.getClass(), "title", null);
        setField(term21582, term21582.getClass(), "icon", null);
        setField(term21570, term21570.getClass(), "meta", term21582);
        Integer term21584 = new Integer(-1068878345);
        Integer term21588 = new Integer(1386128235);
        ArrayList term21592 = new ArrayList();
        ((ArrayList) term21592).add((Object)null);
        ((ArrayList) term21592).add((Object)null);
        ((ArrayList) term21592).add((Object)null);
        ((ArrayList) term21592).add((Object)null);
        ((ArrayList) term21592).add((Object)null);
        ((ArrayList) term21592).add((Object)null);
        ((ArrayList) term21592).add((Object)null);
        ((ArrayList) term21592).add((Object)null);
        Object term21583 = newInstance(Class.forName("com.org.model.Menu"));
        Object term21595 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term21583, term21583.getClass(), "id", term21584);
        setField(term21583, term21583.getClass(), "name", "");
        setField(term21583, term21583.getClass(), "path", "");
        setField(term21583, term21583.getClass(), "parentId", term21588);
        setField(term21583, term21583.getClass(), "icon", "");
        setField(term21583, term21583.getClass(), "introduce", "");
        setField(term21583, term21583.getClass(), "children", term21592);
        setField(term21595, term21595.getClass(), "title", null);
        setField(term21595, term21595.getClass(), "icon", null);
        setField(term21583, term21583.getClass(), "meta", term21595);
        ArrayList term21529 = new ArrayList();
        ((ArrayList) term21529).add(term21531);
        ((ArrayList) term21529).add(term21544);
        ((ArrayList) term21529).add(term21557);
        ((ArrayList) term21529).add(term21570);
        ((ArrayList) term21529).add(term21583);
        term21369 = newInstance(Class.forName("com.org.model.User"));
        setField(term21369, term21369.getClass(), "id", term21370);
        setField(term21369, term21369.getClass(), "email", "CrDChgXZIs");
        setField(term21369, term21369.getClass(), "password", "spKctYEaCy");
        setField(term21369, term21369.getClass(), "username", "XldxICpJKb");
        setField(term21369, term21369.getClass(), "power", "auwdUwJreL");
        setField(term21369, term21369.getClass(), "nickname", "ubCTLBFDbT");
        setField(term21369, term21369.getClass(), "sex", "lmjJUxaoYd");
        setField(term21369, term21369.getClass(), "age", term21444);
        setField(term21369, term21369.getClass(), "phone", "yvsgNBCrWW");
        setField(term21369, term21369.getClass(), "faceUrl", "dKBKbXYYRZ");
        setField(term21369, term21369.getClass(), "headUrl", "IkItfbpcap");
        setField(term21369, term21369.getClass(), "introduce", "MJzpIWKpnW");
        setField(term21369, term21369.getClass(), "ip", "OAVOvFzQXP");
        setField(term21369, term21369.getClass(), "meetings", term21506);
        setField(term21369, term21369.getClass(), "menus", term21529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Zkmgyplfwc";
        callMethod(klass, "setPower", argTypes, term21369, args);
    }

};


