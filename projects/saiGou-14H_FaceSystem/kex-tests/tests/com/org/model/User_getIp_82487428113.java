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

public class User_getIp_82487428113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18666;

    public User_getIp_82487428113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18667 = new Integer(-1568339070);
        Integer term18741 = new Integer(-1427059961);
        Integer term18806 = new Integer(1120685189);
        Integer term18815 = new Integer(654585209);
        Integer term18817 = new Integer(-1661685401);
        Integer term18821 = new Integer(1427434947);
        Object term18805 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term18808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18812 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18805, term18805.getClass(), "id", term18806);
        setField(term18808, term18808.getClass(), "date", null);
        setField(term18808, term18808.getClass(), "time", null);
        setField(term18805, term18805.getClass(), "createTime", term18808);
        setField(term18805, term18805.getClass(), "name", "");
        setField(term18805, term18805.getClass(), "link", "");
        setField(term18805, term18805.getClass(), "introduce", "");
        setField(term18812, term18812.getClass(), "date", null);
        setField(term18812, term18812.getClass(), "time", null);
        setField(term18805, term18805.getClass(), "updateTime", term18812);
        setField(term18805, term18805.getClass(), "meetingTime", "");
        setField(term18805, term18805.getClass(), "signTime", "");
        setField(term18805, term18805.getClass(), "signNumber", term18815);
        setField(term18805, term18805.getClass(), "userNumber", term18817);
        setField(term18805, term18805.getClass(), "fileUrl", "");
        setBooleanField(term18805, term18805.getClass(), "online", false);
        setField(term18805, term18805.getClass(), "deleted", term18821);
        setField(term18805, term18805.getClass(), "host", "");
        Integer term18825 = new Integer(2130990985);
        Integer term18834 = new Integer(523197189);
        Integer term18836 = new Integer(658684460);
        Integer term18840 = new Integer(2073367039);
        Object term18824 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term18827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18831 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18824, term18824.getClass(), "id", term18825);
        setField(term18827, term18827.getClass(), "date", null);
        setField(term18827, term18827.getClass(), "time", null);
        setField(term18824, term18824.getClass(), "createTime", term18827);
        setField(term18824, term18824.getClass(), "name", "");
        setField(term18824, term18824.getClass(), "link", "");
        setField(term18824, term18824.getClass(), "introduce", "");
        setField(term18831, term18831.getClass(), "date", null);
        setField(term18831, term18831.getClass(), "time", null);
        setField(term18824, term18824.getClass(), "updateTime", term18831);
        setField(term18824, term18824.getClass(), "meetingTime", "");
        setField(term18824, term18824.getClass(), "signTime", "");
        setField(term18824, term18824.getClass(), "signNumber", term18834);
        setField(term18824, term18824.getClass(), "userNumber", term18836);
        setField(term18824, term18824.getClass(), "fileUrl", "");
        setBooleanField(term18824, term18824.getClass(), "online", true);
        setField(term18824, term18824.getClass(), "deleted", term18840);
        setField(term18824, term18824.getClass(), "host", "");
        Integer term18844 = new Integer(-365877126);
        Integer term18853 = new Integer(251018856);
        Integer term18855 = new Integer(-1965331640);
        Integer term18859 = new Integer(-514392629);
        Object term18843 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term18846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18850 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18843, term18843.getClass(), "id", term18844);
        setField(term18846, term18846.getClass(), "date", null);
        setField(term18846, term18846.getClass(), "time", null);
        setField(term18843, term18843.getClass(), "createTime", term18846);
        setField(term18843, term18843.getClass(), "name", "");
        setField(term18843, term18843.getClass(), "link", "");
        setField(term18843, term18843.getClass(), "introduce", "");
        setField(term18850, term18850.getClass(), "date", null);
        setField(term18850, term18850.getClass(), "time", null);
        setField(term18843, term18843.getClass(), "updateTime", term18850);
        setField(term18843, term18843.getClass(), "meetingTime", "");
        setField(term18843, term18843.getClass(), "signTime", "");
        setField(term18843, term18843.getClass(), "signNumber", term18853);
        setField(term18843, term18843.getClass(), "userNumber", term18855);
        setField(term18843, term18843.getClass(), "fileUrl", "");
        setBooleanField(term18843, term18843.getClass(), "online", true);
        setField(term18843, term18843.getClass(), "deleted", term18859);
        setField(term18843, term18843.getClass(), "host", "");
        Integer term18863 = new Integer(-166633123);
        Integer term18872 = new Integer(373110517);
        Integer term18874 = new Integer(-1632703926);
        Integer term18878 = new Integer(-1031499401);
        Object term18862 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term18865 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18869 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term18862, term18862.getClass(), "id", term18863);
        setField(term18865, term18865.getClass(), "date", null);
        setField(term18865, term18865.getClass(), "time", null);
        setField(term18862, term18862.getClass(), "createTime", term18865);
        setField(term18862, term18862.getClass(), "name", "");
        setField(term18862, term18862.getClass(), "link", "");
        setField(term18862, term18862.getClass(), "introduce", "");
        setField(term18869, term18869.getClass(), "date", null);
        setField(term18869, term18869.getClass(), "time", null);
        setField(term18862, term18862.getClass(), "updateTime", term18869);
        setField(term18862, term18862.getClass(), "meetingTime", "");
        setField(term18862, term18862.getClass(), "signTime", "");
        setField(term18862, term18862.getClass(), "signNumber", term18872);
        setField(term18862, term18862.getClass(), "userNumber", term18874);
        setField(term18862, term18862.getClass(), "fileUrl", "");
        setBooleanField(term18862, term18862.getClass(), "online", true);
        setField(term18862, term18862.getClass(), "deleted", term18878);
        setField(term18862, term18862.getClass(), "host", "");
        ArrayList term18803 = new ArrayList();
        ((ArrayList) term18803).add(term18805);
        ((ArrayList) term18803).add(term18824);
        ((ArrayList) term18803).add(term18843);
        ((ArrayList) term18803).add(term18862);
        Integer term18886 = new Integer(280202002);
        Integer term18890 = new Integer(-1074402599);
        ArrayList term18894 = new ArrayList();
        ((ArrayList) term18894).add((Object)null);
        ((ArrayList) term18894).add((Object)null);
        ((ArrayList) term18894).add((Object)null);
        Object term18885 = newInstance(Class.forName("com.org.model.Menu"));
        Object term18897 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term18885, term18885.getClass(), "id", term18886);
        setField(term18885, term18885.getClass(), "name", "");
        setField(term18885, term18885.getClass(), "path", "");
        setField(term18885, term18885.getClass(), "parentId", term18890);
        setField(term18885, term18885.getClass(), "icon", "");
        setField(term18885, term18885.getClass(), "introduce", "");
        setField(term18885, term18885.getClass(), "children", term18894);
        setField(term18897, term18897.getClass(), "title", null);
        setField(term18897, term18897.getClass(), "icon", null);
        setField(term18885, term18885.getClass(), "meta", term18897);
        ArrayList term18883 = new ArrayList();
        ((ArrayList) term18883).add(term18885);
        term18666 = newInstance(Class.forName("com.org.model.User"));
        setField(term18666, term18666.getClass(), "id", term18667);
        setField(term18666, term18666.getClass(), "email", "AmYGzDcymG");
        setField(term18666, term18666.getClass(), "password", "OuPFXYLHnZ");
        setField(term18666, term18666.getClass(), "username", "LvqRPoVTcD");
        setField(term18666, term18666.getClass(), "power", "kMMtGnlzVA");
        setField(term18666, term18666.getClass(), "nickname", "BEoDKOnmGz");
        setField(term18666, term18666.getClass(), "sex", "bWdbzxGXLQ");
        setField(term18666, term18666.getClass(), "age", term18741);
        setField(term18666, term18666.getClass(), "phone", "JMTsbSARpN");
        setField(term18666, term18666.getClass(), "faceUrl", "XAadPSqCed");
        setField(term18666, term18666.getClass(), "headUrl", "munBmcPVsD");
        setField(term18666, term18666.getClass(), "introduce", "rCWvaRZdUo");
        setField(term18666, term18666.getClass(), "ip", "BMnJwMRfdp");
        setField(term18666, term18666.getClass(), "meetings", term18803);
        setField(term18666, term18666.getClass(), "menus", term18883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIp", argTypes, term18666, args);
    }

};


