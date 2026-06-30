package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Organization_setAboutUsText_210364432118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5041;

    public Organization_setAboutUsText_210364432118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5042 = new Long(6689117472719450333L);
        Long term5168 = new Long(5836128569274066678L);
        Integer term5171 = new Integer(962840079);
        Object term5167 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5167, term5167.getClass(), "id", term5168);
        setField(term5167, term5167.getClass(), "imageUrl", "");
        setField(term5167, term5167.getClass(), "order", term5171);
        setField(term5167, term5167.getClass(), "text", "");
        setField(term5167, term5167.getClass(), "base64FileEncoded", "");
        setField(term5167, term5167.getClass(), "contentType", "");
        Long term5177 = new Long(-2177368829816872572L);
        Integer term5180 = new Integer(1540719661);
        Object term5176 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5176, term5176.getClass(), "id", term5177);
        setField(term5176, term5176.getClass(), "imageUrl", "");
        setField(term5176, term5176.getClass(), "order", term5180);
        setField(term5176, term5176.getClass(), "text", "");
        setField(term5176, term5176.getClass(), "base64FileEncoded", "");
        setField(term5176, term5176.getClass(), "contentType", "");
        Long term5186 = new Long(-8463029266761149071L);
        Integer term5189 = new Integer(1265463001);
        Object term5185 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5185, term5185.getClass(), "id", term5186);
        setField(term5185, term5185.getClass(), "imageUrl", "");
        setField(term5185, term5185.getClass(), "order", term5189);
        setField(term5185, term5185.getClass(), "text", "");
        setField(term5185, term5185.getClass(), "base64FileEncoded", "");
        setField(term5185, term5185.getClass(), "contentType", "");
        Long term5195 = new Long(3133860696238261492L);
        Integer term5198 = new Integer(335112684);
        Object term5194 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5194, term5194.getClass(), "id", term5195);
        setField(term5194, term5194.getClass(), "imageUrl", "");
        setField(term5194, term5194.getClass(), "order", term5198);
        setField(term5194, term5194.getClass(), "text", "");
        setField(term5194, term5194.getClass(), "base64FileEncoded", "");
        setField(term5194, term5194.getClass(), "contentType", "");
        Long term5204 = new Long(7247160664318067468L);
        Integer term5207 = new Integer(1551099402);
        Object term5203 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5203, term5203.getClass(), "id", term5204);
        setField(term5203, term5203.getClass(), "imageUrl", "");
        setField(term5203, term5203.getClass(), "order", term5207);
        setField(term5203, term5203.getClass(), "text", "");
        setField(term5203, term5203.getClass(), "base64FileEncoded", "");
        setField(term5203, term5203.getClass(), "contentType", "");
        ArrayList term5165 = new ArrayList();
        ((ArrayList) term5165).add(term5167);
        ((ArrayList) term5165).add(term5176);
        ((ArrayList) term5165).add(term5185);
        ((ArrayList) term5165).add(term5194);
        ((ArrayList) term5165).add(term5203);
        term5041 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term5104 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term5041, term5041.getClass(), "id", term5042);
        setField(term5041, term5041.getClass(), "name", "RTTvrwwhou");
        setField(term5041, term5041.getClass(), "image", "lRORwXipuk");
        setField(term5041, term5041.getClass(), "phone", "fVdTcjgHdw");
        setField(term5041, term5041.getClass(), "address", "wwAwLLcLPp");
        setField(term5041, term5041.getClass(), "email", "nHpMKOmlpQ");
        setField(term5104, term5104.getClass(), "facebookUrl", "fKhrQsJToZ");
        setField(term5104, term5104.getClass(), "linkedInUrl", "wsysQLGFnl");
        setField(term5104, term5104.getClass(), "instagramUrl", "ckQLZGFjMX");
        setField(term5041, term5041.getClass(), "socialMedia", term5104);
        setField(term5041, term5041.getClass(), "aboutUsText", "qphdrqUtNx");
        setField(term5041, term5041.getClass(), "welcomeText", "bwlLFAfNWx");
        setField(term5041, term5041.getClass(), "slides", term5165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DAujxZPHJC";
        callMethod(klass, "setAboutUsText", argTypes, term5041, args);
    }

};


