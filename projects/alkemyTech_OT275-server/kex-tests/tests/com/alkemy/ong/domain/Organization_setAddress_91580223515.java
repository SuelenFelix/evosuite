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

public class Organization_setAddress_91580223515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4156;

    public Organization_setAddress_91580223515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4157 = new Long(9013624480170062917L);
        Long term4283 = new Long(7862575738391801707L);
        Integer term4286 = new Integer(97029295);
        Object term4282 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term4282, term4282.getClass(), "id", term4283);
        setField(term4282, term4282.getClass(), "imageUrl", "");
        setField(term4282, term4282.getClass(), "order", term4286);
        setField(term4282, term4282.getClass(), "text", "");
        setField(term4282, term4282.getClass(), "base64FileEncoded", "");
        setField(term4282, term4282.getClass(), "contentType", "");
        Long term4292 = new Long(50358265865610362L);
        Integer term4295 = new Integer(-1371869594);
        Object term4291 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term4291, term4291.getClass(), "id", term4292);
        setField(term4291, term4291.getClass(), "imageUrl", "");
        setField(term4291, term4291.getClass(), "order", term4295);
        setField(term4291, term4291.getClass(), "text", "");
        setField(term4291, term4291.getClass(), "base64FileEncoded", "");
        setField(term4291, term4291.getClass(), "contentType", "");
        ArrayList term4280 = new ArrayList();
        ((ArrayList) term4280).add(term4282);
        ((ArrayList) term4280).add(term4291);
        term4156 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term4219 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term4156, term4156.getClass(), "id", term4157);
        setField(term4156, term4156.getClass(), "name", "ZwZIDwYcSW");
        setField(term4156, term4156.getClass(), "image", "sOdkipUKRu");
        setField(term4156, term4156.getClass(), "phone", "oKwCDqywym");
        setField(term4156, term4156.getClass(), "address", "zjZYTddemL");
        setField(term4156, term4156.getClass(), "email", "QtrylgCLiF");
        setField(term4219, term4219.getClass(), "facebookUrl", "orEuhCStGM");
        setField(term4219, term4219.getClass(), "linkedInUrl", "HhEaSXWvrY");
        setField(term4219, term4219.getClass(), "instagramUrl", "CVRGEomOth");
        setField(term4156, term4156.getClass(), "socialMedia", term4219);
        setField(term4156, term4156.getClass(), "aboutUsText", "vSeruUyNWX");
        setField(term4156, term4156.getClass(), "welcomeText", "UkKvaeJfEC");
        setField(term4156, term4156.getClass(), "slides", term4280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KAORSSPSeV";
        callMethod(klass, "setAddress", argTypes, term4156, args);
    }

};


