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
import java.lang.Object;

public class UpdateOrganizationResponse_getImageUrl_140621174710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4790;

    public UpdateOrganizationResponse_getImageUrl_140621174710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4790 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term4851 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term4790, term4790.getClass(), "name", "EdPAvpluZg");
        setField(term4790, term4790.getClass(), "imageUrl", "DzHVBMqWtE");
        setField(term4790, term4790.getClass(), "address", "THZSpzBRYP");
        setField(term4790, term4790.getClass(), "phone", "ZfBIVGBQOE");
        setField(term4790, term4790.getClass(), "email", "QSrDQfEsTR");
        setField(term4851, term4851.getClass(), "facebookUrl", "PsqusYmejD");
        setField(term4851, term4851.getClass(), "linkedInUrl", "NTWMiBEaDF");
        setField(term4851, term4851.getClass(), "instagramUrl", "SPBstwKFVr");
        setField(term4790, term4790.getClass(), "socialMedia", term4851);
        setField(term4790, term4790.getClass(), "aboutUsText", "WxYUTuqmIq");
        setField(term4790, term4790.getClass(), "welcomeText", "OeQLvhVERT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term4790, args);
    }

};


