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

public class User_getEmail_13505855042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14515;

    public User_getEmail_13505855042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14516 = new Integer(962385185);
        Integer term14590 = new Integer(2146718886);
        Integer term14655 = new Integer(-985577036);
        Integer term14664 = new Integer(802539130);
        Integer term14666 = new Integer(2105146188);
        Integer term14670 = new Integer(-862415480);
        Object term14654 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term14657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14661 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14654, term14654.getClass(), "id", term14655);
        setField(term14657, term14657.getClass(), "date", null);
        setField(term14657, term14657.getClass(), "time", null);
        setField(term14654, term14654.getClass(), "createTime", term14657);
        setField(term14654, term14654.getClass(), "name", "");
        setField(term14654, term14654.getClass(), "link", "");
        setField(term14654, term14654.getClass(), "introduce", "");
        setField(term14661, term14661.getClass(), "date", null);
        setField(term14661, term14661.getClass(), "time", null);
        setField(term14654, term14654.getClass(), "updateTime", term14661);
        setField(term14654, term14654.getClass(), "meetingTime", "");
        setField(term14654, term14654.getClass(), "signTime", "");
        setField(term14654, term14654.getClass(), "signNumber", term14664);
        setField(term14654, term14654.getClass(), "userNumber", term14666);
        setField(term14654, term14654.getClass(), "fileUrl", "");
        setBooleanField(term14654, term14654.getClass(), "online", true);
        setField(term14654, term14654.getClass(), "deleted", term14670);
        setField(term14654, term14654.getClass(), "host", "");
        Integer term14674 = new Integer(312605349);
        Integer term14683 = new Integer(-402072606);
        Integer term14685 = new Integer(-477355193);
        Integer term14689 = new Integer(168425089);
        Object term14673 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term14676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14680 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14673, term14673.getClass(), "id", term14674);
        setField(term14676, term14676.getClass(), "date", null);
        setField(term14676, term14676.getClass(), "time", null);
        setField(term14673, term14673.getClass(), "createTime", term14676);
        setField(term14673, term14673.getClass(), "name", "");
        setField(term14673, term14673.getClass(), "link", "");
        setField(term14673, term14673.getClass(), "introduce", "");
        setField(term14680, term14680.getClass(), "date", null);
        setField(term14680, term14680.getClass(), "time", null);
        setField(term14673, term14673.getClass(), "updateTime", term14680);
        setField(term14673, term14673.getClass(), "meetingTime", "");
        setField(term14673, term14673.getClass(), "signTime", "");
        setField(term14673, term14673.getClass(), "signNumber", term14683);
        setField(term14673, term14673.getClass(), "userNumber", term14685);
        setField(term14673, term14673.getClass(), "fileUrl", "");
        setBooleanField(term14673, term14673.getClass(), "online", true);
        setField(term14673, term14673.getClass(), "deleted", term14689);
        setField(term14673, term14673.getClass(), "host", "");
        Integer term14693 = new Integer(-571931590);
        Integer term14702 = new Integer(37757400);
        Integer term14704 = new Integer(-1632221612);
        Integer term14708 = new Integer(1545314376);
        Object term14692 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term14695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14699 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14692, term14692.getClass(), "id", term14693);
        setField(term14695, term14695.getClass(), "date", null);
        setField(term14695, term14695.getClass(), "time", null);
        setField(term14692, term14692.getClass(), "createTime", term14695);
        setField(term14692, term14692.getClass(), "name", "");
        setField(term14692, term14692.getClass(), "link", "");
        setField(term14692, term14692.getClass(), "introduce", "");
        setField(term14699, term14699.getClass(), "date", null);
        setField(term14699, term14699.getClass(), "time", null);
        setField(term14692, term14692.getClass(), "updateTime", term14699);
        setField(term14692, term14692.getClass(), "meetingTime", "");
        setField(term14692, term14692.getClass(), "signTime", "");
        setField(term14692, term14692.getClass(), "signNumber", term14702);
        setField(term14692, term14692.getClass(), "userNumber", term14704);
        setField(term14692, term14692.getClass(), "fileUrl", "");
        setBooleanField(term14692, term14692.getClass(), "online", false);
        setField(term14692, term14692.getClass(), "deleted", term14708);
        setField(term14692, term14692.getClass(), "host", "");
        Integer term14712 = new Integer(437959151);
        Integer term14721 = new Integer(27780241);
        Integer term14723 = new Integer(-683868408);
        Integer term14727 = new Integer(-381130069);
        Object term14711 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term14714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14718 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term14711, term14711.getClass(), "id", term14712);
        setField(term14714, term14714.getClass(), "date", null);
        setField(term14714, term14714.getClass(), "time", null);
        setField(term14711, term14711.getClass(), "createTime", term14714);
        setField(term14711, term14711.getClass(), "name", "");
        setField(term14711, term14711.getClass(), "link", "");
        setField(term14711, term14711.getClass(), "introduce", "");
        setField(term14718, term14718.getClass(), "date", null);
        setField(term14718, term14718.getClass(), "time", null);
        setField(term14711, term14711.getClass(), "updateTime", term14718);
        setField(term14711, term14711.getClass(), "meetingTime", "");
        setField(term14711, term14711.getClass(), "signTime", "");
        setField(term14711, term14711.getClass(), "signNumber", term14721);
        setField(term14711, term14711.getClass(), "userNumber", term14723);
        setField(term14711, term14711.getClass(), "fileUrl", "");
        setBooleanField(term14711, term14711.getClass(), "online", false);
        setField(term14711, term14711.getClass(), "deleted", term14727);
        setField(term14711, term14711.getClass(), "host", "");
        ArrayList term14652 = new ArrayList();
        ((ArrayList) term14652).add(term14654);
        ((ArrayList) term14652).add(term14673);
        ((ArrayList) term14652).add(term14692);
        ((ArrayList) term14652).add(term14711);
        Integer term14735 = new Integer(885769749);
        Integer term14739 = new Integer(-1021168716);
        ArrayList term14743 = new ArrayList();
        Object term14734 = newInstance(Class.forName("com.org.model.Menu"));
        Object term14746 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term14734, term14734.getClass(), "id", term14735);
        setField(term14734, term14734.getClass(), "name", "");
        setField(term14734, term14734.getClass(), "path", "");
        setField(term14734, term14734.getClass(), "parentId", term14739);
        setField(term14734, term14734.getClass(), "icon", "");
        setField(term14734, term14734.getClass(), "introduce", "");
        setField(term14734, term14734.getClass(), "children", term14743);
        setField(term14746, term14746.getClass(), "title", null);
        setField(term14746, term14746.getClass(), "icon", null);
        setField(term14734, term14734.getClass(), "meta", term14746);
        ArrayList term14732 = new ArrayList();
        ((ArrayList) term14732).add(term14734);
        term14515 = newInstance(Class.forName("com.org.model.User"));
        setField(term14515, term14515.getClass(), "id", term14516);
        setField(term14515, term14515.getClass(), "email", "hGULbvEJOJ");
        setField(term14515, term14515.getClass(), "password", "mHRhpRdJAm");
        setField(term14515, term14515.getClass(), "username", "JPPiPXJaoa");
        setField(term14515, term14515.getClass(), "power", "fGLEhwmSAi");
        setField(term14515, term14515.getClass(), "nickname", "oBoeDHJtuf");
        setField(term14515, term14515.getClass(), "sex", "NVbdJpwYOX");
        setField(term14515, term14515.getClass(), "age", term14590);
        setField(term14515, term14515.getClass(), "phone", "zDqikHgSHj");
        setField(term14515, term14515.getClass(), "faceUrl", "JwEjJzczOl");
        setField(term14515, term14515.getClass(), "headUrl", "FsIwpRCskv");
        setField(term14515, term14515.getClass(), "introduce", "tuIzCHeOzK");
        setField(term14515, term14515.getClass(), "ip", "czPFpmmjeR");
        setField(term14515, term14515.getClass(), "meetings", term14652);
        setField(term14515, term14515.getClass(), "menus", term14732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term14515, args);
    }

};


