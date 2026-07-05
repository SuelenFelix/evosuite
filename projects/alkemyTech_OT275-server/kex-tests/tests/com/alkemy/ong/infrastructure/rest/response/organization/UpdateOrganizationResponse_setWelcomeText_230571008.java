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

public class UpdateOrganizationResponse_setWelcomeText_230571008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4324;

    public UpdateOrganizationResponse_setWelcomeText_230571008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4324 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term4385 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term4324, term4324.getClass(), "name", "FjOiNAfBOc");
        setField(term4324, term4324.getClass(), "imageUrl", "iCCsaLHohG");
        setField(term4324, term4324.getClass(), "address", "NJhGgctbdj");
        setField(term4324, term4324.getClass(), "phone", "MYWYUeLGOp");
        setField(term4324, term4324.getClass(), "email", "tsTGdgQYUL");
        setField(term4385, term4385.getClass(), "facebookUrl", "TtGbVmKcnX");
        setField(term4385, term4385.getClass(), "linkedInUrl", "GJVkUrCVdD");
        setField(term4385, term4385.getClass(), "instagramUrl", "zNdorvdUgu");
        setField(term4324, term4324.getClass(), "socialMedia", term4385);
        setField(term4324, term4324.getClass(), "aboutUsText", "oPxuZbkYio");
        setField(term4324, term4324.getClass(), "welcomeText", "vKitydDVnM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "urCiQnUFBM";
        callMethod(klass, "setWelcomeText", argTypes, term4324, args);
    }

};


