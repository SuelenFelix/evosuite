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

public class Organization_setSocialMedia_181712668817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4737;
     Object term4874;

    public Organization_setSocialMedia_181712668817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4738 = new Long(-8876856890348836498L);
        Long term4864 = new Long(846579494941632714L);
        Integer term4867 = new Integer(287287233);
        Object term4863 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term4863, term4863.getClass(), "id", term4864);
        setField(term4863, term4863.getClass(), "imageUrl", "");
        setField(term4863, term4863.getClass(), "order", term4867);
        setField(term4863, term4863.getClass(), "text", "");
        setField(term4863, term4863.getClass(), "base64FileEncoded", "");
        setField(term4863, term4863.getClass(), "contentType", "");
        ArrayList term4861 = new ArrayList();
        ((ArrayList) term4861).add(term4863);
        term4737 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term4800 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term4737, term4737.getClass(), "id", term4738);
        setField(term4737, term4737.getClass(), "name", "rwKoAngzCu");
        setField(term4737, term4737.getClass(), "image", "VUkRVwROTl");
        setField(term4737, term4737.getClass(), "phone", "UDlkdccCRn");
        setField(term4737, term4737.getClass(), "address", "McpzErOcYb");
        setField(term4737, term4737.getClass(), "email", "jqrVEUvYEz");
        setField(term4800, term4800.getClass(), "facebookUrl", "QITgiBrmfj");
        setField(term4800, term4800.getClass(), "linkedInUrl", "pXxkiXgQnq");
        setField(term4800, term4800.getClass(), "instagramUrl", "tKmrUDURku");
        setField(term4737, term4737.getClass(), "socialMedia", term4800);
        setField(term4737, term4737.getClass(), "aboutUsText", "JeZbrwZmsP");
        setField(term4737, term4737.getClass(), "welcomeText", "bxyfeicqrK");
        setField(term4737, term4737.getClass(), "slides", term4861);
        term4874 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term4874, term4874.getClass(), "facebookUrl", "QNjNTLlUaV");
        setField(term4874, term4874.getClass(), "linkedInUrl", "hIYsRyOZxk");
        setField(term4874, term4874.getClass(), "instagramUrl", "RjNoEywJbC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.SocialMedia");
        Object[] args = new Object[1];
        args[0] = term4874;
        callMethod(klass, "setSocialMedia", argTypes, term4737, args);
    }

};


