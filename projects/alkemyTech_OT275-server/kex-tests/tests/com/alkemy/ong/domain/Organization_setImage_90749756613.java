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

public class Organization_setImage_90749756613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3647;

    public Organization_setImage_90749756613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3648 = new Long(682356318767179819L);
        Long term3774 = new Long(-7291743527973326814L);
        Integer term3777 = new Integer(1596070772);
        Object term3773 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3773, term3773.getClass(), "id", term3774);
        setField(term3773, term3773.getClass(), "imageUrl", "");
        setField(term3773, term3773.getClass(), "order", term3777);
        setField(term3773, term3773.getClass(), "text", "");
        setField(term3773, term3773.getClass(), "base64FileEncoded", "");
        setField(term3773, term3773.getClass(), "contentType", "");
        ArrayList term3771 = new ArrayList();
        ((ArrayList) term3771).add(term3773);
        term3647 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term3710 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term3647, term3647.getClass(), "id", term3648);
        setField(term3647, term3647.getClass(), "name", "FbSIUZyBXZ");
        setField(term3647, term3647.getClass(), "image", "mhQDwIyrRi");
        setField(term3647, term3647.getClass(), "phone", "HpZXWDPhlg");
        setField(term3647, term3647.getClass(), "address", "lBOokzEPfe");
        setField(term3647, term3647.getClass(), "email", "dtGZCsKXbW");
        setField(term3710, term3710.getClass(), "facebookUrl", "bdyhHbDAmJ");
        setField(term3710, term3710.getClass(), "linkedInUrl", "BBXiTNHqGE");
        setField(term3710, term3710.getClass(), "instagramUrl", "IEYhJmgCVd");
        setField(term3647, term3647.getClass(), "socialMedia", term3710);
        setField(term3647, term3647.getClass(), "aboutUsText", "KSJeYkkvpk");
        setField(term3647, term3647.getClass(), "welcomeText", "qUtkFGMNUV");
        setField(term3647, term3647.getClass(), "slides", term3771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MgLCedQfoj";
        callMethod(klass, "setImage", argTypes, term3647, args);
    }

};


