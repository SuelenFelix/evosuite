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

public class UpdateOrganizationRequest_setPhone_82676246512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2509;

    public UpdateOrganizationRequest_setPhone_82676246512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2509 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term2570 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2509, term2509.getClass(), "name", "RYdKCNNMBR");
        setField(term2509, term2509.getClass(), "imageUrl", "yGtHPyvYiQ");
        setField(term2509, term2509.getClass(), "address", "MvRIxilFMJ");
        setField(term2509, term2509.getClass(), "phone", "iNwOJRBEjp");
        setField(term2509, term2509.getClass(), "email", "XylxrMBraH");
        setField(term2570, term2570.getClass(), "facebookUrl", "pORebkoRdD");
        setField(term2570, term2570.getClass(), "linkedInUrl", "mXGCWJDOqA");
        setField(term2570, term2570.getClass(), "instagramUrl", "dpNsDgfPso");
        setField(term2509, term2509.getClass(), "socialMedia", term2570);
        setField(term2509, term2509.getClass(), "aboutUsText", "hCWPJQKpdc");
        setField(term2509, term2509.getClass(), "welcomeText", "WzMEhMXkKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XOiDvlDhdc";
        callMethod(klass, "setPhone", argTypes, term2509, args);
    }

};


