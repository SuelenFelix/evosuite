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

public class User2DTO_toString_169121280910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9644;

    public User2DTO_toString_169121280910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9646 = new Integer(-1341439819);
        Integer term9720 = new Integer(-728760750);
        Integer term9785 = new Integer(-1617383807);
        Integer term9787 = new Integer(-1244386281);
        Integer term9789 = new Integer(-885788574);
        Integer term9792 = new Integer(-865722613);
        Object term9784 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term9784, term9784.getClass(), "id", term9785);
        setField(term9784, term9784.getClass(), "createTime", null);
        setField(term9784, term9784.getClass(), "name", null);
        setField(term9784, term9784.getClass(), "link", null);
        setField(term9784, term9784.getClass(), "introduce", null);
        setField(term9784, term9784.getClass(), "updateTime", null);
        setField(term9784, term9784.getClass(), "meetingTime", null);
        setField(term9784, term9784.getClass(), "signTime", null);
        setField(term9784, term9784.getClass(), "signNumber", term9787);
        setField(term9784, term9784.getClass(), "userNumber", term9789);
        setField(term9784, term9784.getClass(), "fileUrl", null);
        setBooleanField(term9784, term9784.getClass(), "online", true);
        setField(term9784, term9784.getClass(), "deleted", term9792);
        setField(term9784, term9784.getClass(), "host", null);
        Integer term9795 = new Integer(-1551355284);
        Integer term9797 = new Integer(-1381970335);
        Integer term9799 = new Integer(1213549815);
        Integer term9802 = new Integer(-1518419301);
        Object term9794 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term9794, term9794.getClass(), "id", term9795);
        setField(term9794, term9794.getClass(), "createTime", null);
        setField(term9794, term9794.getClass(), "name", null);
        setField(term9794, term9794.getClass(), "link", null);
        setField(term9794, term9794.getClass(), "introduce", null);
        setField(term9794, term9794.getClass(), "updateTime", null);
        setField(term9794, term9794.getClass(), "meetingTime", null);
        setField(term9794, term9794.getClass(), "signTime", null);
        setField(term9794, term9794.getClass(), "signNumber", term9797);
        setField(term9794, term9794.getClass(), "userNumber", term9799);
        setField(term9794, term9794.getClass(), "fileUrl", null);
        setBooleanField(term9794, term9794.getClass(), "online", false);
        setField(term9794, term9794.getClass(), "deleted", term9802);
        setField(term9794, term9794.getClass(), "host", null);
        ArrayList term9782 = new ArrayList();
        ((ArrayList) term9782).add(term9784);
        ((ArrayList) term9782).add(term9794);
        Integer term9809 = new Integer(674879025);
        Integer term9811 = new Integer(-1538936030);
        Object term9808 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9808, term9808.getClass(), "id", term9809);
        setField(term9808, term9808.getClass(), "name", null);
        setField(term9808, term9808.getClass(), "path", null);
        setField(term9808, term9808.getClass(), "parentId", term9811);
        setField(term9808, term9808.getClass(), "icon", null);
        setField(term9808, term9808.getClass(), "introduce", null);
        setField(term9808, term9808.getClass(), "children", null);
        setField(term9808, term9808.getClass(), "meta", null);
        Integer term9814 = new Integer(-752870423);
        Integer term9816 = new Integer(-1698809299);
        Object term9813 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9813, term9813.getClass(), "id", term9814);
        setField(term9813, term9813.getClass(), "name", null);
        setField(term9813, term9813.getClass(), "path", null);
        setField(term9813, term9813.getClass(), "parentId", term9816);
        setField(term9813, term9813.getClass(), "icon", null);
        setField(term9813, term9813.getClass(), "introduce", null);
        setField(term9813, term9813.getClass(), "children", null);
        setField(term9813, term9813.getClass(), "meta", null);
        Integer term9819 = new Integer(777492093);
        Integer term9821 = new Integer(1414025609);
        Object term9818 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9818, term9818.getClass(), "id", term9819);
        setField(term9818, term9818.getClass(), "name", null);
        setField(term9818, term9818.getClass(), "path", null);
        setField(term9818, term9818.getClass(), "parentId", term9821);
        setField(term9818, term9818.getClass(), "icon", null);
        setField(term9818, term9818.getClass(), "introduce", null);
        setField(term9818, term9818.getClass(), "children", null);
        setField(term9818, term9818.getClass(), "meta", null);
        Integer term9824 = new Integer(1543696412);
        Integer term9826 = new Integer(-1385748168);
        Object term9823 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9823, term9823.getClass(), "id", term9824);
        setField(term9823, term9823.getClass(), "name", null);
        setField(term9823, term9823.getClass(), "path", null);
        setField(term9823, term9823.getClass(), "parentId", term9826);
        setField(term9823, term9823.getClass(), "icon", null);
        setField(term9823, term9823.getClass(), "introduce", null);
        setField(term9823, term9823.getClass(), "children", null);
        setField(term9823, term9823.getClass(), "meta", null);
        Integer term9829 = new Integer(-270592367);
        Integer term9831 = new Integer(178847646);
        Object term9828 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9828, term9828.getClass(), "id", term9829);
        setField(term9828, term9828.getClass(), "name", null);
        setField(term9828, term9828.getClass(), "path", null);
        setField(term9828, term9828.getClass(), "parentId", term9831);
        setField(term9828, term9828.getClass(), "icon", null);
        setField(term9828, term9828.getClass(), "introduce", null);
        setField(term9828, term9828.getClass(), "children", null);
        setField(term9828, term9828.getClass(), "meta", null);
        ArrayList term9806 = new ArrayList();
        ((ArrayList) term9806).add(term9808);
        ((ArrayList) term9806).add(term9813);
        ((ArrayList) term9806).add(term9818);
        ((ArrayList) term9806).add(term9823);
        ((ArrayList) term9806).add(term9828);
        ((ArrayList) term9806).add(term9828);
        ((ArrayList) term9806).add(term9813);
        Integer term9847 = new Integer(255145822);
        term9644 = newInstance(Class.forName("com.org.model.dto.User2DTO"));
        Object term9645 = newInstance(Class.forName("com.org.model.User"));
        setField(term9645, term9645.getClass(), "id", term9646);
        setField(term9645, term9645.getClass(), "email", "FbBMtntDbw");
        setField(term9645, term9645.getClass(), "password", "zRnpRGaHlI");
        setField(term9645, term9645.getClass(), "username", "dVHfxjbMRK");
        setField(term9645, term9645.getClass(), "power", "LzwyLxKJpw");
        setField(term9645, term9645.getClass(), "nickname", "ZhWJlplAVK");
        setField(term9645, term9645.getClass(), "sex", "pnmjTuTojv");
        setField(term9645, term9645.getClass(), "age", term9720);
        setField(term9645, term9645.getClass(), "phone", "eMtshhmGEm");
        setField(term9645, term9645.getClass(), "faceUrl", "VJUbzHGOvg");
        setField(term9645, term9645.getClass(), "headUrl", "SiwcigIrfD");
        setField(term9645, term9645.getClass(), "introduce", "MFIdGVLoDo");
        setField(term9645, term9645.getClass(), "ip", "kbxgTcnXyU");
        setField(term9645, term9645.getClass(), "meetings", term9782);
        setField(term9645, term9645.getClass(), "menus", term9806);
        setField(term9644, term9644.getClass(), "user", term9645);
        setField(term9644, term9644.getClass(), "base64Face", "nQodIeQekM");
        setField(term9644, term9644.getClass(), "departmentid", term9847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.User2DTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9644, args);
    }

};


