package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Organization_getImage_4838291503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;

    public Organization_getImage_4838291503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term930 = new Long(5127676408959197577L);
        Long term1056 = new Long(-6573104506744284592L);
        Integer term1059 = new Integer(1585847225);
        Object term1055 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1055, term1055.getClass(), "id", term1056);
        setField(term1055, term1055.getClass(), "imageUrl", "");
        setField(term1055, term1055.getClass(), "order", term1059);
        setField(term1055, term1055.getClass(), "text", "");
        setField(term1055, term1055.getClass(), "base64FileEncoded", "");
        setField(term1055, term1055.getClass(), "contentType", "");
        Long term1065 = new Long(-4920224193275732920L);
        Integer term1068 = new Integer(597278769);
        Object term1064 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1064, term1064.getClass(), "id", term1065);
        setField(term1064, term1064.getClass(), "imageUrl", "");
        setField(term1064, term1064.getClass(), "order", term1068);
        setField(term1064, term1064.getClass(), "text", "");
        setField(term1064, term1064.getClass(), "base64FileEncoded", "");
        setField(term1064, term1064.getClass(), "contentType", "");
        Long term1074 = new Long(8428634514691209827L);
        Integer term1077 = new Integer(-1685132342);
        Object term1073 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1073, term1073.getClass(), "id", term1074);
        setField(term1073, term1073.getClass(), "imageUrl", "");
        setField(term1073, term1073.getClass(), "order", term1077);
        setField(term1073, term1073.getClass(), "text", "");
        setField(term1073, term1073.getClass(), "base64FileEncoded", "");
        setField(term1073, term1073.getClass(), "contentType", "");
        Long term1083 = new Long(-2585684163342970173L);
        Integer term1086 = new Integer(-1456670397);
        Object term1082 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1082, term1082.getClass(), "id", term1083);
        setField(term1082, term1082.getClass(), "imageUrl", "");
        setField(term1082, term1082.getClass(), "order", term1086);
        setField(term1082, term1082.getClass(), "text", "");
        setField(term1082, term1082.getClass(), "base64FileEncoded", "");
        setField(term1082, term1082.getClass(), "contentType", "");
        ArrayList term1053 = new ArrayList();
        ((ArrayList) term1053).add(term1055);
        ((ArrayList) term1053).add(term1064);
        ((ArrayList) term1053).add(term1073);
        ((ArrayList) term1053).add(term1082);
        term929 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term992 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term929, term929.getClass(), "id", term930);
        setField(term929, term929.getClass(), "name", "PHvxnGHptP");
        setField(term929, term929.getClass(), "image", "TimdotUuNC");
        setField(term929, term929.getClass(), "phone", "PkWMRdJcBb");
        setField(term929, term929.getClass(), "address", "jSpAteRute");
        setField(term929, term929.getClass(), "email", "swZVeJAxjt");
        setField(term992, term992.getClass(), "facebookUrl", "xOcJIiQQDu");
        setField(term992, term992.getClass(), "linkedInUrl", "GVizqqzXpy");
        setField(term992, term992.getClass(), "instagramUrl", "JqXGgAhZPl");
        setField(term929, term929.getClass(), "socialMedia", term992);
        setField(term929, term929.getClass(), "aboutUsText", "jiKYgYHqIS");
        setField(term929, term929.getClass(), "welcomeText", "DfISiziTgG");
        setField(term929, term929.getClass(), "slides", term1053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term929, args);
    }

};


