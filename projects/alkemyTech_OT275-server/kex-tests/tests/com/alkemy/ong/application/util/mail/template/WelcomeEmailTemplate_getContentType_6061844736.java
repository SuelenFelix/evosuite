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

public class WelcomeEmailTemplate_getContentType_6061844736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7094;

    public WelcomeEmailTemplate_getContentType_6061844736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7096 = new Long(-1832940336320585644L);
        Long term7222 = new Long(-8033714905181142681L);
        Integer term7224 = new Integer(597278769);
        Object term7221 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term7221, term7221.getClass(), "id", term7222);
        setField(term7221, term7221.getClass(), "imageUrl", null);
        setField(term7221, term7221.getClass(), "order", term7224);
        setField(term7221, term7221.getClass(), "text", null);
        setField(term7221, term7221.getClass(), "base64FileEncoded", null);
        setField(term7221, term7221.getClass(), "contentType", null);
        ArrayList term7219 = new ArrayList();
        ((ArrayList) term7219).add(term7221);
        term7094 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term7095 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term7158 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term7094, term7094.getClass(), "addressContact", null);
        setField(term7095, term7095.getClass(), "id", term7096);
        setField(term7095, term7095.getClass(), "name", "XjDhvToxJy");
        setField(term7095, term7095.getClass(), "image", "nxSTJflLQy");
        setField(term7095, term7095.getClass(), "phone", "FlHzxEfFzI");
        setField(term7095, term7095.getClass(), "address", "aSATgQUpoe");
        setField(term7095, term7095.getClass(), "email", "VkPSXewZfB");
        setField(term7158, term7158.getClass(), "facebookUrl", "ubodzJoMGW");
        setField(term7158, term7158.getClass(), "linkedInUrl", "weddIktxOA");
        setField(term7158, term7158.getClass(), "instagramUrl", "uSlMeISsDD");
        setField(term7095, term7095.getClass(), "socialMedia", term7158);
        setField(term7095, term7095.getClass(), "aboutUsText", "WdCiTDUKqn");
        setField(term7095, term7095.getClass(), "welcomeText", "PSizQDoxxe");
        setField(term7095, term7095.getClass(), "slides", term7219);
        setField(term7094, term7094.getClass(), "organization", term7095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentType", argTypes, term7094, args);
    }

};


