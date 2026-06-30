package com.alkemy.ong.infrastructure.rest.response.organization;

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
import static com.alkemy.ong.infrastructure.rest.response.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class GetOrganizationResponse_getName_10774248810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GetOrganizationResponse_getName_10774248810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term55 = new Integer(568599855);
        Object term52 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term52, term52.getClass(), "text", "");
        setField(term52, term52.getClass(), "imageUrl", "");
        setField(term52, term52.getClass(), "order", term55);
        Integer term60 = new Integer(1162663216);
        Object term57 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term57, term57.getClass(), "text", "");
        setField(term57, term57.getClass(), "imageUrl", "");
        setField(term57, term57.getClass(), "order", term60);
        Integer term65 = new Integer(1484323161);
        Object term62 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term62, term62.getClass(), "text", "");
        setField(term62, term62.getClass(), "imageUrl", "");
        setField(term62, term62.getClass(), "order", term65);
        Integer term70 = new Integer(391863371);
        Object term67 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term67, term67.getClass(), "text", "");
        setField(term67, term67.getClass(), "imageUrl", "");
        setField(term67, term67.getClass(), "order", term70);
        Integer term75 = new Integer(-1922583790);
        Object term72 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideWithTextResponse"));
        setField(term72, term72.getClass(), "text", "");
        setField(term72, term72.getClass(), "imageUrl", "");
        setField(term72, term72.getClass(), "order", term75);
        ArrayList term50 = new ArrayList();
        ((ArrayList) term50).add(term52);
        ((ArrayList) term50).add(term57);
        ((ArrayList) term50).add(term62);
        ((ArrayList) term50).add(term67);
        ((ArrayList) term50).add(term72);
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term79 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "image", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "phone", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "address", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "slides", term50);
        setField(term79, term79.getClass(), "facebookUrl", "oVcInYnLWB");
        setField(term79, term79.getClass(), "linkedInUrl", "aJlieCFVtF");
        setField(term79, term79.getClass(), "instagramUrl", "ZiaGIbnzTs");
        setField(term1, term1.getClass(), "socialMedia", term79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1, args);
    }

};


