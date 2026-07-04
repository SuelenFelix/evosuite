package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class User2DTO_equals_16443081227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8576;
     Object term8786;

    public User2DTO_equals_16443081227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8578 = new Integer(291864719);
        Integer term8652 = new Integer(-1549607466);
        Integer term8717 = new Integer(853609788);
        Integer term8719 = new Integer(-197820800);
        Integer term8721 = new Integer(723812297);
        Integer term8724 = new Integer(1639448749);
        Object term8716 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term8716, term8716.getClass(), "id", term8717);
        setField(term8716, term8716.getClass(), "createTime", null);
        setField(term8716, term8716.getClass(), "name", null);
        setField(term8716, term8716.getClass(), "link", null);
        setField(term8716, term8716.getClass(), "introduce", null);
        setField(term8716, term8716.getClass(), "updateTime", null);
        setField(term8716, term8716.getClass(), "meetingTime", null);
        setField(term8716, term8716.getClass(), "signTime", null);
        setField(term8716, term8716.getClass(), "signNumber", term8719);
        setField(term8716, term8716.getClass(), "userNumber", term8721);
        setField(term8716, term8716.getClass(), "fileUrl", null);
        setBooleanField(term8716, term8716.getClass(), "online", true);
        setField(term8716, term8716.getClass(), "deleted", term8724);
        setField(term8716, term8716.getClass(), "host", null);
        Integer term8727 = new Integer(873659088);
        Integer term8729 = new Integer(-975748721);
        Integer term8731 = new Integer(433248783);
        Integer term8734 = new Integer(-507944154);
        Object term8726 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term8726, term8726.getClass(), "id", term8727);
        setField(term8726, term8726.getClass(), "createTime", null);
        setField(term8726, term8726.getClass(), "name", null);
        setField(term8726, term8726.getClass(), "link", null);
        setField(term8726, term8726.getClass(), "introduce", null);
        setField(term8726, term8726.getClass(), "updateTime", null);
        setField(term8726, term8726.getClass(), "meetingTime", null);
        setField(term8726, term8726.getClass(), "signTime", null);
        setField(term8726, term8726.getClass(), "signNumber", term8729);
        setField(term8726, term8726.getClass(), "userNumber", term8731);
        setField(term8726, term8726.getClass(), "fileUrl", null);
        setBooleanField(term8726, term8726.getClass(), "online", true);
        setField(term8726, term8726.getClass(), "deleted", term8734);
        setField(term8726, term8726.getClass(), "host", null);
        Integer term8737 = new Integer(-1736183862);
        Integer term8739 = new Integer(897010381);
        Integer term8741 = new Integer(-15712667);
        Integer term8744 = new Integer(1964967720);
        Object term8736 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term8736, term8736.getClass(), "id", term8737);
        setField(term8736, term8736.getClass(), "createTime", null);
        setField(term8736, term8736.getClass(), "name", null);
        setField(term8736, term8736.getClass(), "link", null);
        setField(term8736, term8736.getClass(), "introduce", null);
        setField(term8736, term8736.getClass(), "updateTime", null);
        setField(term8736, term8736.getClass(), "meetingTime", null);
        setField(term8736, term8736.getClass(), "signTime", null);
        setField(term8736, term8736.getClass(), "signNumber", term8739);
        setField(term8736, term8736.getClass(), "userNumber", term8741);
        setField(term8736, term8736.getClass(), "fileUrl", null);
        setBooleanField(term8736, term8736.getClass(), "online", true);
        setField(term8736, term8736.getClass(), "deleted", term8744);
        setField(term8736, term8736.getClass(), "host", null);
        Integer term8747 = new Integer(1351900243);
        Integer term8749 = new Integer(-330897705);
        Integer term8751 = new Integer(1065595802);
        Integer term8754 = new Integer(21031843);
        Object term8746 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term8746, term8746.getClass(), "id", term8747);
        setField(term8746, term8746.getClass(), "createTime", null);
        setField(term8746, term8746.getClass(), "name", null);
        setField(term8746, term8746.getClass(), "link", null);
        setField(term8746, term8746.getClass(), "introduce", null);
        setField(term8746, term8746.getClass(), "updateTime", null);
        setField(term8746, term8746.getClass(), "meetingTime", null);
        setField(term8746, term8746.getClass(), "signTime", null);
        setField(term8746, term8746.getClass(), "signNumber", term8749);
        setField(term8746, term8746.getClass(), "userNumber", term8751);
        setField(term8746, term8746.getClass(), "fileUrl", null);
        setBooleanField(term8746, term8746.getClass(), "online", true);
        setField(term8746, term8746.getClass(), "deleted", term8754);
        setField(term8746, term8746.getClass(), "host", null);
        ArrayList term8714 = new ArrayList();
        ((ArrayList) term8714).add(term8716);
        ((ArrayList) term8714).add(term8726);
        ((ArrayList) term8714).add(term8736);
        ((ArrayList) term8714).add(term8746);
        Integer term8761 = new Integer(-380787857);
        Integer term8763 = new Integer(319853052);
        Object term8760 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term8760, term8760.getClass(), "id", term8761);
        setField(term8760, term8760.getClass(), "name", null);
        setField(term8760, term8760.getClass(), "path", null);
        setField(term8760, term8760.getClass(), "parentId", term8763);
        setField(term8760, term8760.getClass(), "icon", null);
        setField(term8760, term8760.getClass(), "introduce", null);
        setField(term8760, term8760.getClass(), "children", null);
        setField(term8760, term8760.getClass(), "meta", null);
        Integer term8766 = new Integer(947449400);
        Integer term8768 = new Integer(-763799087);
        Object term8765 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term8765, term8765.getClass(), "id", term8766);
        setField(term8765, term8765.getClass(), "name", null);
        setField(term8765, term8765.getClass(), "path", null);
        setField(term8765, term8765.getClass(), "parentId", term8768);
        setField(term8765, term8765.getClass(), "icon", null);
        setField(term8765, term8765.getClass(), "introduce", null);
        setField(term8765, term8765.getClass(), "children", null);
        setField(term8765, term8765.getClass(), "meta", null);
        ArrayList term8758 = new ArrayList();
        ((ArrayList) term8758).add(term8760);
        ((ArrayList) term8758).add(term8765);
        Integer term8784 = new Integer(-509349195);
        term8576 = newInstance(Class.forName("com.org.model.dto.User2DTO"));
        Object term8577 = newInstance(Class.forName("com.org.model.User"));
        setField(term8577, term8577.getClass(), "id", term8578);
        setField(term8577, term8577.getClass(), "email", "PFTdEDSbvZ");
        setField(term8577, term8577.getClass(), "password", "TbiwoiebNe");
        setField(term8577, term8577.getClass(), "username", "laTITSWZuc");
        setField(term8577, term8577.getClass(), "power", "fkzRpxlAqS");
        setField(term8577, term8577.getClass(), "nickname", "VYvbTGKslj");
        setField(term8577, term8577.getClass(), "sex", "owLqDDnwZA");
        setField(term8577, term8577.getClass(), "age", term8652);
        setField(term8577, term8577.getClass(), "phone", "eBcTbweeYp");
        setField(term8577, term8577.getClass(), "faceUrl", "drcmjfQUDq");
        setField(term8577, term8577.getClass(), "headUrl", "GjdWUoUSyA");
        setField(term8577, term8577.getClass(), "introduce", "YEkxWsWaUl");
        setField(term8577, term8577.getClass(), "ip", "RINhPkhhct");
        setField(term8577, term8577.getClass(), "meetings", term8714);
        setField(term8577, term8577.getClass(), "menus", term8758);
        setField(term8576, term8576.getClass(), "user", term8577);
        setField(term8576, term8576.getClass(), "base64Face", "RKcKwlEYZb");
        setField(term8576, term8576.getClass(), "departmentid", term8784);
        term8786 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.User2DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8786;
        callMethod(klass, "equals", argTypes, term8576, args);
    }

};


