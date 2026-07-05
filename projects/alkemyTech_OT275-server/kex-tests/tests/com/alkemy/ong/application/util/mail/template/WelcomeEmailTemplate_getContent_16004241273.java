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

public class WelcomeEmailTemplate_getContent_16004241273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504;

    public WelcomeEmailTemplate_getContent_16004241273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term506 = new Long(-8885298608300233488L);
        Long term632 = new Long(-4325723315152823407L);
        Integer term634 = new Integer(-1339778481);
        Object term631 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term631, term631.getClass(), "id", term632);
        setField(term631, term631.getClass(), "imageUrl", null);
        setField(term631, term631.getClass(), "order", term634);
        setField(term631, term631.getClass(), "text", null);
        setField(term631, term631.getClass(), "base64FileEncoded", null);
        setField(term631, term631.getClass(), "contentType", null);
        Long term637 = new Long(2535595959091595249L);
        Integer term639 = new Integer(1725571209);
        Object term636 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term636, term636.getClass(), "id", term637);
        setField(term636, term636.getClass(), "imageUrl", null);
        setField(term636, term636.getClass(), "order", term639);
        setField(term636, term636.getClass(), "text", null);
        setField(term636, term636.getClass(), "base64FileEncoded", null);
        setField(term636, term636.getClass(), "contentType", null);
        Long term642 = new Long(-5476826692763582090L);
        Integer term644 = new Integer(-522618178);
        Object term641 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term641, term641.getClass(), "id", term642);
        setField(term641, term641.getClass(), "imageUrl", null);
        setField(term641, term641.getClass(), "order", term644);
        setField(term641, term641.getClass(), "text", null);
        setField(term641, term641.getClass(), "base64FileEncoded", null);
        setField(term641, term641.getClass(), "contentType", null);
        ArrayList term629 = new ArrayList();
        ((ArrayList) term629).add(term631);
        ((ArrayList) term629).add(term636);
        ((ArrayList) term629).add(term641);
        term504 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term505 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term568 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term504, term504.getClass(), "addressContact", null);
        setField(term505, term505.getClass(), "id", term506);
        setField(term505, term505.getClass(), "name", "ffYhPOzlUs");
        setField(term505, term505.getClass(), "image", "MLqYREekMl");
        setField(term505, term505.getClass(), "phone", "ytSBIKXogI");
        setField(term505, term505.getClass(), "address", "nHXjMycHlU");
        setField(term505, term505.getClass(), "email", "ieCtQFdkii");
        setField(term568, term568.getClass(), "facebookUrl", "dEnhdmILtU");
        setField(term568, term568.getClass(), "linkedInUrl", "hoicvmsovO");
        setField(term568, term568.getClass(), "instagramUrl", "eqJfYWRaEL");
        setField(term505, term505.getClass(), "socialMedia", term568);
        setField(term505, term505.getClass(), "aboutUsText", "fhkbdRViHi");
        setField(term505, term505.getClass(), "welcomeText", "uWHnvSvaPl");
        setField(term505, term505.getClass(), "slides", term629);
        setField(term504, term504.getClass(), "organization", term505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term504, args);
    }

};


