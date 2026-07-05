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

public class ContactConfirmationEmailTemplate_getContent_6490064463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288;

    public ContactConfirmationEmailTemplate_getContent_6490064463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2290 = new Long(4044358158040652353L);
        Long term2416 = new Long(-4443169559037975007L);
        Integer term2418 = new Integer(-1145578966);
        Object term2415 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2415, term2415.getClass(), "id", term2416);
        setField(term2415, term2415.getClass(), "imageUrl", null);
        setField(term2415, term2415.getClass(), "order", term2418);
        setField(term2415, term2415.getClass(), "text", null);
        setField(term2415, term2415.getClass(), "base64FileEncoded", null);
        setField(term2415, term2415.getClass(), "contentType", null);
        ArrayList term2413 = new ArrayList();
        ((ArrayList) term2413).add(term2415);
        term2288 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.ContactConfirmationEmailTemplate"));
        Object term2289 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term2352 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term2288, term2288.getClass(), "addressContact", null);
        setField(term2289, term2289.getClass(), "id", term2290);
        setField(term2289, term2289.getClass(), "name", "PqtVXXZMqK");
        setField(term2289, term2289.getClass(), "image", "rYbtIDVdnd");
        setField(term2289, term2289.getClass(), "phone", "UKAReurpHG");
        setField(term2289, term2289.getClass(), "address", "WVRMUmrljA");
        setField(term2289, term2289.getClass(), "email", "NTlKJDDWlk");
        setField(term2352, term2352.getClass(), "facebookUrl", "vOuMEpOQAg");
        setField(term2352, term2352.getClass(), "linkedInUrl", "SIODFGaQhr");
        setField(term2352, term2352.getClass(), "instagramUrl", "qYzsiuXOgS");
        setField(term2289, term2289.getClass(), "socialMedia", term2352);
        setField(term2289, term2289.getClass(), "aboutUsText", "bxrCBbrrct");
        setField(term2289, term2289.getClass(), "welcomeText", "CKWpJaaaxX");
        setField(term2289, term2289.getClass(), "slides", term2413);
        setField(term2288, term2288.getClass(), "organization", term2289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.ContactConfirmationEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term2288, args);
    }

};


