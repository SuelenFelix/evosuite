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

public class WelcomeEmailTemplate_setContent_11455505415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997;

    public WelcomeEmailTemplate_setContent_11455505415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term999 = new Long(8428634514691209827L);
        Long term1125 = new Long(-2585684163342970173L);
        Integer term1127 = new Integer(-1685132342);
        Object term1124 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1124, term1124.getClass(), "id", term1125);
        setField(term1124, term1124.getClass(), "imageUrl", null);
        setField(term1124, term1124.getClass(), "order", term1127);
        setField(term1124, term1124.getClass(), "text", null);
        setField(term1124, term1124.getClass(), "base64FileEncoded", null);
        setField(term1124, term1124.getClass(), "contentType", null);
        ArrayList term1122 = new ArrayList();
        ((ArrayList) term1122).add(term1124);
        term997 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term998 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term1061 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term997, term997.getClass(), "addressContact", null);
        setField(term998, term998.getClass(), "id", term999);
        setField(term998, term998.getClass(), "name", "QXzGXbEXMu");
        setField(term998, term998.getClass(), "image", "qxSDVejjiY");
        setField(term998, term998.getClass(), "phone", "xBsXSDjXYK");
        setField(term998, term998.getClass(), "address", "sEnIVFtZuQ");
        setField(term998, term998.getClass(), "email", "ZVecLZMLHF");
        setField(term1061, term1061.getClass(), "facebookUrl", "fztQhjqwdP");
        setField(term1061, term1061.getClass(), "linkedInUrl", "eVpkWxjuki");
        setField(term1061, term1061.getClass(), "instagramUrl", "SJiQaLvSKv");
        setField(term998, term998.getClass(), "socialMedia", term1061);
        setField(term998, term998.getClass(), "aboutUsText", "OEXDRUKcFl");
        setField(term998, term998.getClass(), "welcomeText", "RYdKCNNMBR");
        setField(term998, term998.getClass(), "slides", term1122);
        setField(term997, term997.getClass(), "organization", term998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setContent", argTypes, term997, args);
    }

};


