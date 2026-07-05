package com.alkemy.ong.infrastructure.rest.request.organization;

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
import static com.alkemy.ong.infrastructure.rest.request.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UpdateOrganizationRequest_setAddress_79101321111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2265;

    public UpdateOrganizationRequest_setAddress_79101321111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2265 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term2326 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2265, term2265.getClass(), "name", "AWRooQKkdW");
        setField(term2265, term2265.getClass(), "imageUrl", "vjxIhXHxGR");
        setField(term2265, term2265.getClass(), "address", "QXzGXbEXMu");
        setField(term2265, term2265.getClass(), "phone", "qxSDVejjiY");
        setField(term2265, term2265.getClass(), "email", "xBsXSDjXYK");
        setField(term2326, term2326.getClass(), "facebookUrl", "sEnIVFtZuQ");
        setField(term2326, term2326.getClass(), "linkedInUrl", "ZVecLZMLHF");
        setField(term2326, term2326.getClass(), "instagramUrl", "fztQhjqwdP");
        setField(term2265, term2265.getClass(), "socialMedia", term2326);
        setField(term2265, term2265.getClass(), "aboutUsText", "eVpkWxjuki");
        setField(term2265, term2265.getClass(), "welcomeText", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        callMethod(klass, "setAddress", argTypes, term2265, args);
    }

};


