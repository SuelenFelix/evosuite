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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class Organization_init_6866505100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term63;
     Object term124;

    public Organization_init_6866505100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term63 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term63, term63.getClass(), "facebookUrl", "EGtDIRbSSb");
        setField(term63, term63.getClass(), "linkedInUrl", "SzjVpOQTyS");
        setField(term63, term63.getClass(), "instagramUrl", "MjGYSRKTNF");
        Long term128 = new Long(6375119433582206027L);
        Integer term142 = new Integer(568599855);
        Object term127 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term127, term127.getClass(), "id", term128);
        setField(term127, term127.getClass(), "imageUrl", "NRdvgJlhkX");
        setField(term127, term127.getClass(), "order", term142);
        setField(term127, term127.getClass(), "text", "uuaPigETmJ");
        setField(term127, term127.getClass(), "base64FileEncoded", "MxlszYVzRf");
        setField(term127, term127.getClass(), "contentType", "LQFpaHEwXR");
        Long term182 = new Long(-8257434502486459194L);
        Integer term185 = new Integer(1162663216);
        Object term181 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term181, term181.getClass(), "id", term182);
        setField(term181, term181.getClass(), "imageUrl", "");
        setField(term181, term181.getClass(), "order", term185);
        setField(term181, term181.getClass(), "text", "");
        setField(term181, term181.getClass(), "base64FileEncoded", "");
        setField(term181, term181.getClass(), "contentType", "");
        Long term192 = new Long(-8400487765614892086L);
        Integer term194 = new Integer(1484323161);
        Object term191 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term191, term191.getClass(), "id", term192);
        setField(term191, term191.getClass(), "imageUrl", null);
        setField(term191, term191.getClass(), "order", term194);
        setField(term191, term191.getClass(), "text", null);
        setField(term191, term191.getClass(), "base64FileEncoded", null);
        setField(term191, term191.getClass(), "contentType", null);
        term124 = new LinkedList();
        ((LinkedList) term124).add(term127);
        ((LinkedList) term124).add(term181);
        ((LinkedList) term124).add(term191);
        ((LinkedList) term124).add((Object)null);
        ((LinkedList) term124).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("com.alkemy.ong.domain.SocialMedia");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.util.List");
        Object[] args = new Object[10];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = "sjlJAEtRrb";
        args[3] = "MuLcgQHgqz";
        args[4] = "xxtlPwDYFs";
        args[5] = "jJCZpVmanW";
        args[6] = term63;
        args[7] = "hRNSzYYIrc";
        args[8] = "RMFIsYGgne";
        args[9] = term124;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


