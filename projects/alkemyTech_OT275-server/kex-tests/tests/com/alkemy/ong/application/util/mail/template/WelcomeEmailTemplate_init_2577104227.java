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

public class WelcomeEmailTemplate_init_2577104227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1512;

    public WelcomeEmailTemplate_init_2577104227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1513 = new Long(2120084523938730454L);
        Long term1639 = new Long(6855071767938501807L);
        Integer term1642 = new Integer(-117576464);
        Object term1638 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1638, term1638.getClass(), "id", term1639);
        setField(term1638, term1638.getClass(), "imageUrl", "");
        setField(term1638, term1638.getClass(), "order", term1642);
        setField(term1638, term1638.getClass(), "text", "");
        setField(term1638, term1638.getClass(), "base64FileEncoded", "");
        setField(term1638, term1638.getClass(), "contentType", "");
        Long term1648 = new Long(-5892135042702373494L);
        Integer term1651 = new Integer(-1007160944);
        Object term1647 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1647, term1647.getClass(), "id", term1648);
        setField(term1647, term1647.getClass(), "imageUrl", "");
        setField(term1647, term1647.getClass(), "order", term1651);
        setField(term1647, term1647.getClass(), "text", "");
        setField(term1647, term1647.getClass(), "base64FileEncoded", "");
        setField(term1647, term1647.getClass(), "contentType", "");
        ArrayList term1636 = new ArrayList();
        ((ArrayList) term1636).add(term1638);
        ((ArrayList) term1636).add(term1647);
        term1512 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term1575 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term1512, term1512.getClass(), "id", term1513);
        setField(term1512, term1512.getClass(), "name", "VYkqXKVlAJ");
        setField(term1512, term1512.getClass(), "image", "XkIoWJRNwN");
        setField(term1512, term1512.getClass(), "phone", "aNWLJdrZMq");
        setField(term1512, term1512.getClass(), "address", "HHmNoYxIGj");
        setField(term1512, term1512.getClass(), "email", "PtirvZmsGt");
        setField(term1575, term1575.getClass(), "facebookUrl", "HWkpTmtlrc");
        setField(term1575, term1575.getClass(), "linkedInUrl", "hMmaoREuCK");
        setField(term1575, term1575.getClass(), "instagramUrl", "VeDtgDzGAN");
        setField(term1512, term1512.getClass(), "socialMedia", term1575);
        setField(term1512, term1512.getClass(), "aboutUsText", "aWYOWZFyaX");
        setField(term1512, term1512.getClass(), "welcomeText", "BRIVNtfUWU");
        setField(term1512, term1512.getClass(), "slides", term1636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.application.util.mail.IAddressContact");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1512;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


