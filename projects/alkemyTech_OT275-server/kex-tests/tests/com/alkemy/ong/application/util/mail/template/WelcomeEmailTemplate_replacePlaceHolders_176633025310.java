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
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class WelcomeEmailTemplate_replacePlaceHolders_176633025310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7589;

    public WelcomeEmailTemplate_replacePlaceHolders_176633025310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7591 = new Long(1597484336218508869L);
        Long term7717 = new Long(-685023850445639859L);
        Integer term7719 = new Integer(-2068769794);
        Object term7716 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term7716, term7716.getClass(), "id", term7717);
        setField(term7716, term7716.getClass(), "imageUrl", null);
        setField(term7716, term7716.getClass(), "order", term7719);
        setField(term7716, term7716.getClass(), "text", null);
        setField(term7716, term7716.getClass(), "base64FileEncoded", null);
        setField(term7716, term7716.getClass(), "contentType", null);
        Long term7722 = new Long(-6950146046121430355L);
        Integer term7724 = new Integer(-117576464);
        Object term7721 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term7721, term7721.getClass(), "id", term7722);
        setField(term7721, term7721.getClass(), "imageUrl", null);
        setField(term7721, term7721.getClass(), "order", term7724);
        setField(term7721, term7721.getClass(), "text", null);
        setField(term7721, term7721.getClass(), "base64FileEncoded", null);
        setField(term7721, term7721.getClass(), "contentType", null);
        Long term7727 = new Long(1667122142089513324L);
        Integer term7729 = new Integer(-1007160944);
        Object term7726 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term7726, term7726.getClass(), "id", term7727);
        setField(term7726, term7726.getClass(), "imageUrl", null);
        setField(term7726, term7726.getClass(), "order", term7729);
        setField(term7726, term7726.getClass(), "text", null);
        setField(term7726, term7726.getClass(), "base64FileEncoded", null);
        setField(term7726, term7726.getClass(), "contentType", null);
        Long term7732 = new Long(-6342139649364011743L);
        Integer term7734 = new Integer(1135664017);
        Object term7731 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term7731, term7731.getClass(), "id", term7732);
        setField(term7731, term7731.getClass(), "imageUrl", null);
        setField(term7731, term7731.getClass(), "order", term7734);
        setField(term7731, term7731.getClass(), "text", null);
        setField(term7731, term7731.getClass(), "base64FileEncoded", null);
        setField(term7731, term7731.getClass(), "contentType", null);
        Long term7737 = new Long(-4924950707540628022L);
        Integer term7739 = new Integer(590364439);
        Object term7736 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term7736, term7736.getClass(), "id", term7737);
        setField(term7736, term7736.getClass(), "imageUrl", null);
        setField(term7736, term7736.getClass(), "order", term7739);
        setField(term7736, term7736.getClass(), "text", null);
        setField(term7736, term7736.getClass(), "base64FileEncoded", null);
        setField(term7736, term7736.getClass(), "contentType", null);
        ArrayList term7714 = new ArrayList();
        ((ArrayList) term7714).add(term7716);
        ((ArrayList) term7714).add(term7721);
        ((ArrayList) term7714).add(term7726);
        ((ArrayList) term7714).add(term7731);
        ((ArrayList) term7714).add(term7736);
        term7589 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term7590 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term7653 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term7589, term7589.getClass(), "addressContact", null);
        setField(term7590, term7590.getClass(), "id", term7591);
        setField(term7590, term7590.getClass(), "name", "AGXoIndFnm");
        setField(term7590, term7590.getClass(), "image", "mwmFMNEzkK");
        setField(term7590, term7590.getClass(), "phone", "kVAmKknVln");
        setField(term7590, term7590.getClass(), "address", "MRFLbEGYKG");
        setField(term7590, term7590.getClass(), "email", "BYrGukTyof");
        setField(term7653, term7653.getClass(), "facebookUrl", "jiCGTTzKGB");
        setField(term7653, term7653.getClass(), "linkedInUrl", "MqICFYzDJj");
        setField(term7653, term7653.getClass(), "instagramUrl", "YgQvdcBQKw");
        setField(term7590, term7590.getClass(), "socialMedia", term7653);
        setField(term7590, term7590.getClass(), "aboutUsText", "FiYYLuailz");
        setField(term7590, term7590.getClass(), "welcomeText", "XebAeSnCKZ");
        setField(term7590, term7590.getClass(), "slides", term7714);
        setField(term7589, term7589.getClass(), "organization", term7590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LrqwfrKKtS";
        callMethod(klass, "replacePlaceHolders", argTypes, term7589, args);
    }

};


