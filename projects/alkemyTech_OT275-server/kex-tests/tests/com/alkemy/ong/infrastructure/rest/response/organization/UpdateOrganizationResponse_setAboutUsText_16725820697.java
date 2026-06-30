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

public class UpdateOrganizationResponse_setAboutUsText_16725820697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4080;

    public UpdateOrganizationResponse_setAboutUsText_16725820697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4080 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term4141 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term4080, term4080.getClass(), "name", "SPtPatHeOm");
        setField(term4080, term4080.getClass(), "imageUrl", "ywmcuThdfL");
        setField(term4080, term4080.getClass(), "address", "GBOEuByOfr");
        setField(term4080, term4080.getClass(), "phone", "NHbOFFjyVK");
        setField(term4080, term4080.getClass(), "email", "zaloBqlrSo");
        setField(term4141, term4141.getClass(), "facebookUrl", "vvoLrMGCoN");
        setField(term4141, term4141.getClass(), "linkedInUrl", "pXdglvyrQe");
        setField(term4141, term4141.getClass(), "instagramUrl", "OcfNzHYdki");
        setField(term4080, term4080.getClass(), "socialMedia", term4141);
        setField(term4080, term4080.getClass(), "aboutUsText", "uPuCVuZYOI");
        setField(term4080, term4080.getClass(), "welcomeText", "TweMFhxNdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NBrvVzvQHe";
        callMethod(klass, "setAboutUsText", argTypes, term4080, args);
    }

};


