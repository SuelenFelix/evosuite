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

public class UpdateOrganizationRequest_getAddress_204678133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public UpdateOrganizationRequest_getAddress_204678133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term506 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term445, term445.getClass(), "name", "hNxWaHcfhY");
        setField(term445, term445.getClass(), "imageUrl", "RkybSrpybU");
        setField(term445, term445.getClass(), "address", "xOEqzGAmDU");
        setField(term445, term445.getClass(), "phone", "eZFUvlxvGV");
        setField(term445, term445.getClass(), "email", "BYqFIqCKAV");
        setField(term506, term506.getClass(), "facebookUrl", "vrQLuWIDJX");
        setField(term506, term506.getClass(), "linkedInUrl", "flxyYxBRtu");
        setField(term506, term506.getClass(), "instagramUrl", "OclPbYPkcH");
        setField(term445, term445.getClass(), "socialMedia", term506);
        setField(term445, term445.getClass(), "aboutUsText", "IoAlmYsBwc");
        setField(term445, term445.getClass(), "welcomeText", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term445, args);
    }

};


