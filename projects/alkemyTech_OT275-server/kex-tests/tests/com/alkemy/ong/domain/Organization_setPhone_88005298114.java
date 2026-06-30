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

public class Organization_setPhone_88005298114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3906;

    public Organization_setPhone_88005298114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3907 = new Long(-5963439350418910964L);
        ArrayList term4030 = new ArrayList();
        term3906 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term3969 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term3906, term3906.getClass(), "id", term3907);
        setField(term3906, term3906.getClass(), "name", "zgKiINdgNu");
        setField(term3906, term3906.getClass(), "image", "zLMTXDQHYH");
        setField(term3906, term3906.getClass(), "phone", "PqywFWJlpE");
        setField(term3906, term3906.getClass(), "address", "OzXRsFGTIp");
        setField(term3906, term3906.getClass(), "email", "TjWpyghUWN");
        setField(term3969, term3969.getClass(), "facebookUrl", "dkZFDZxcde");
        setField(term3969, term3969.getClass(), "linkedInUrl", "WXcZEtUKlI");
        setField(term3969, term3969.getClass(), "instagramUrl", "IkpjUOuWQU");
        setField(term3906, term3906.getClass(), "socialMedia", term3969);
        setField(term3906, term3906.getClass(), "aboutUsText", "boSSpezHeU");
        setField(term3906, term3906.getClass(), "welcomeText", "OUeBWNTQDh");
        setField(term3906, term3906.getClass(), "slides", term4030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gltJarNuUk";
        callMethod(klass, "setPhone", argTypes, term3906, args);
    }

};


