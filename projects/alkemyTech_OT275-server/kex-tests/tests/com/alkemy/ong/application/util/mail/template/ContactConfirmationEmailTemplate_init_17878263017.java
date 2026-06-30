package com.alkemy.ong.application.util.mail.template;

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
import static com.alkemy.ong.application.util.mail.template.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class ContactConfirmationEmailTemplate_init_17878263017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3311;

    public ContactConfirmationEmailTemplate_init_17878263017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3312 = new Long(305759998609888272L);
        Long term3438 = new Long(-8654565919063661957L);
        Integer term3441 = new Integer(292681826);
        Object term3437 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3437, term3437.getClass(), "id", term3438);
        setField(term3437, term3437.getClass(), "imageUrl", "");
        setField(term3437, term3437.getClass(), "order", term3441);
        setField(term3437, term3437.getClass(), "text", "");
        setField(term3437, term3437.getClass(), "base64FileEncoded", "");
        setField(term3437, term3437.getClass(), "contentType", "");
        Long term3447 = new Long(-5248475803419977214L);
        Integer term3450 = new Integer(458147407);
        Object term3446 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3446, term3446.getClass(), "id", term3447);
        setField(term3446, term3446.getClass(), "imageUrl", "");
        setField(term3446, term3446.getClass(), "order", term3450);
        setField(term3446, term3446.getClass(), "text", "");
        setField(term3446, term3446.getClass(), "base64FileEncoded", "");
        setField(term3446, term3446.getClass(), "contentType", "");
        ArrayList term3435 = new ArrayList();
        ((ArrayList) term3435).add(term3437);
        ((ArrayList) term3435).add(term3446);
        term3311 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term3374 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term3311, term3311.getClass(), "id", term3312);
        setField(term3311, term3311.getClass(), "name", "UPUbwyHQKN");
        setField(term3311, term3311.getClass(), "image", "lgQkrXANyI");
        setField(term3311, term3311.getClass(), "phone", "MeTmRZXErV");
        setField(term3311, term3311.getClass(), "address", "jNxbVmoZgq");
        setField(term3311, term3311.getClass(), "email", "PvmBHIXaMY");
        setField(term3374, term3374.getClass(), "facebookUrl", "hulYxtowxw");
        setField(term3374, term3374.getClass(), "linkedInUrl", "GNEmuHPNcU");
        setField(term3374, term3374.getClass(), "instagramUrl", "IoSfuKDFRe");
        setField(term3311, term3311.getClass(), "socialMedia", term3374);
        setField(term3311, term3311.getClass(), "aboutUsText", "AWYyZiNfsm");
        setField(term3311, term3311.getClass(), "welcomeText", "ITRRYiuDwH");
        setField(term3311, term3311.getClass(), "slides", term3435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.ContactConfirmationEmailTemplate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.application.util.mail.IAddressContact");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3311;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


