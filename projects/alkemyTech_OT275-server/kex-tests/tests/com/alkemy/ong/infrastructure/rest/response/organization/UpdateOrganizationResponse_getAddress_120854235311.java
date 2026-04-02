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

public class UpdateOrganizationResponse_getAddress_120854235311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5012;

    public UpdateOrganizationResponse_getAddress_120854235311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5012 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term5073 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term5012, term5012.getClass(), "name", "IlvgFINwIa");
        setField(term5012, term5012.getClass(), "imageUrl", "GEJABPlHSI");
        setField(term5012, term5012.getClass(), "address", "aQFUvuaYxd");
        setField(term5012, term5012.getClass(), "phone", "zNFLXMifnS");
        setField(term5012, term5012.getClass(), "email", "HHQcYMSBVc");
        setField(term5073, term5073.getClass(), "facebookUrl", "wdoqITnaAP");
        setField(term5073, term5073.getClass(), "linkedInUrl", "rIPMBcrNqB");
        setField(term5073, term5073.getClass(), "instagramUrl", "UDaboHZHhz");
        setField(term5012, term5012.getClass(), "socialMedia", term5073);
        setField(term5012, term5012.getClass(), "aboutUsText", "nRvKihUSPj");
        setField(term5012, term5012.getClass(), "welcomeText", "BbNeQJpYPr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term5012, args);
    }

};


