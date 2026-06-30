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

public class WelcomeEmailTemplate_getContentType_6061844734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;

    public WelcomeEmailTemplate_getContentType_6061844734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term750 = new Long(-872011222785455006L);
        Long term876 = new Long(-316468845751588286L);
        Integer term878 = new Integer(1134449235);
        Object term875 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term875, term875.getClass(), "id", term876);
        setField(term875, term875.getClass(), "imageUrl", null);
        setField(term875, term875.getClass(), "order", term878);
        setField(term875, term875.getClass(), "text", null);
        setField(term875, term875.getClass(), "base64FileEncoded", null);
        setField(term875, term875.getClass(), "contentType", null);
        Long term881 = new Long(5127676408959197577L);
        Integer term883 = new Integer(-883034806);
        Object term880 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term880, term880.getClass(), "id", term881);
        setField(term880, term880.getClass(), "imageUrl", null);
        setField(term880, term880.getClass(), "order", term883);
        setField(term880, term880.getClass(), "text", null);
        setField(term880, term880.getClass(), "base64FileEncoded", null);
        setField(term880, term880.getClass(), "contentType", null);
        Long term886 = new Long(-6573104506744284592L);
        Integer term888 = new Integer(1585847225);
        Object term885 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term885, term885.getClass(), "id", term886);
        setField(term885, term885.getClass(), "imageUrl", null);
        setField(term885, term885.getClass(), "order", term888);
        setField(term885, term885.getClass(), "text", null);
        setField(term885, term885.getClass(), "base64FileEncoded", null);
        setField(term885, term885.getClass(), "contentType", null);
        Long term891 = new Long(-4920224193275732920L);
        Integer term893 = new Integer(597278769);
        Object term890 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term890, term890.getClass(), "id", term891);
        setField(term890, term890.getClass(), "imageUrl", null);
        setField(term890, term890.getClass(), "order", term893);
        setField(term890, term890.getClass(), "text", null);
        setField(term890, term890.getClass(), "base64FileEncoded", null);
        setField(term890, term890.getClass(), "contentType", null);
        ArrayList term873 = new ArrayList();
        ((ArrayList) term873).add(term875);
        ((ArrayList) term873).add(term880);
        ((ArrayList) term873).add(term885);
        ((ArrayList) term873).add(term890);
        term748 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term749 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term812 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term748, term748.getClass(), "addressContact", null);
        setField(term749, term749.getClass(), "id", term750);
        setField(term749, term749.getClass(), "name", "OWKQODBLzb");
        setField(term749, term749.getClass(), "image", "wGmYcqUkgE");
        setField(term749, term749.getClass(), "phone", "idgaQsnJpQ");
        setField(term749, term749.getClass(), "address", "VgZnGoIFwQ");
        setField(term749, term749.getClass(), "email", "jUbSRrkrYZ");
        setField(term812, term812.getClass(), "facebookUrl", "bWWfajKbEX");
        setField(term812, term812.getClass(), "linkedInUrl", "cAPeiZHKGJ");
        setField(term812, term812.getClass(), "instagramUrl", "LvJFtLBaxj");
        setField(term749, term749.getClass(), "socialMedia", term812);
        setField(term749, term749.getClass(), "aboutUsText", "PHvxnGHptP");
        setField(term749, term749.getClass(), "welcomeText", "TimdotUuNC");
        setField(term749, term749.getClass(), "slides", term873);
        setField(term748, term748.getClass(), "organization", term749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentType", argTypes, term748, args);
    }

};


