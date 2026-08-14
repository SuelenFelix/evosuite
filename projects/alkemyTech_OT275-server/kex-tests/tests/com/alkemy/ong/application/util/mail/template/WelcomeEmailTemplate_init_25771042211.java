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
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class WelcomeEmailTemplate_init_25771042211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7865;

    public WelcomeEmailTemplate_init_25771042211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7866 = new Long(-4393710401270724527L);
        Long term7992 = new Long(-4822736661741380518L);
        Integer term7995 = new Integer(865208305);
        Object term7991 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term7991, term7991.getClass(), "id", term7992);
        setField(term7991, term7991.getClass(), "imageUrl", "");
        setField(term7991, term7991.getClass(), "order", term7995);
        setField(term7991, term7991.getClass(), "text", "");
        setField(term7991, term7991.getClass(), "base64FileEncoded", "");
        setField(term7991, term7991.getClass(), "contentType", "");
        Long term8001 = new Long(-5386201758403679145L);
        Integer term8004 = new Integer(-1275173084);
        Object term8000 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term8000, term8000.getClass(), "id", term8001);
        setField(term8000, term8000.getClass(), "imageUrl", "");
        setField(term8000, term8000.getClass(), "order", term8004);
        setField(term8000, term8000.getClass(), "text", "");
        setField(term8000, term8000.getClass(), "base64FileEncoded", "");
        setField(term8000, term8000.getClass(), "contentType", "");
        Long term8010 = new Long(-7268507582722666254L);
        Integer term8013 = new Integer(-244121226);
        Object term8009 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term8009, term8009.getClass(), "id", term8010);
        setField(term8009, term8009.getClass(), "imageUrl", "");
        setField(term8009, term8009.getClass(), "order", term8013);
        setField(term8009, term8009.getClass(), "text", "");
        setField(term8009, term8009.getClass(), "base64FileEncoded", "");
        setField(term8009, term8009.getClass(), "contentType", "");
        Long term8019 = new Long(5671808784468963649L);
        Integer term8022 = new Integer(-203030934);
        Object term8018 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term8018, term8018.getClass(), "id", term8019);
        setField(term8018, term8018.getClass(), "imageUrl", "");
        setField(term8018, term8018.getClass(), "order", term8022);
        setField(term8018, term8018.getClass(), "text", "");
        setField(term8018, term8018.getClass(), "base64FileEncoded", "");
        setField(term8018, term8018.getClass(), "contentType", "");
        Long term8028 = new Long(2297097306706899827L);
        Integer term8031 = new Integer(-1179120542);
        Object term8027 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term8027, term8027.getClass(), "id", term8028);
        setField(term8027, term8027.getClass(), "imageUrl", "");
        setField(term8027, term8027.getClass(), "order", term8031);
        setField(term8027, term8027.getClass(), "text", "");
        setField(term8027, term8027.getClass(), "base64FileEncoded", "");
        setField(term8027, term8027.getClass(), "contentType", "");
        ArrayList term7989 = new ArrayList();
        ((ArrayList) term7989).add(term7991);
        ((ArrayList) term7989).add(term8000);
        ((ArrayList) term7989).add(term8009);
        ((ArrayList) term7989).add(term8018);
        ((ArrayList) term7989).add(term8027);
        term7865 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term7928 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term7865, term7865.getClass(), "id", term7866);
        setField(term7865, term7865.getClass(), "name", "ZUdnQXfzCI");
        setField(term7865, term7865.getClass(), "image", "EULDrUNQvw");
        setField(term7865, term7865.getClass(), "phone", "BtvAvsJSei");
        setField(term7865, term7865.getClass(), "address", "vqnBkkxoIa");
        setField(term7865, term7865.getClass(), "email", "bycpZjxXFn");
        setField(term7928, term7928.getClass(), "facebookUrl", "jQWttOAiwL");
        setField(term7928, term7928.getClass(), "linkedInUrl", "DzKFxEuEEC");
        setField(term7928, term7928.getClass(), "instagramUrl", "CAMnvfDLJL");
        setField(term7865, term7865.getClass(), "socialMedia", term7928);
        setField(term7865, term7865.getClass(), "aboutUsText", "mfHtgSbdjD");
        setField(term7865, term7865.getClass(), "welcomeText", "cmuaUiHMVL");
        setField(term7865, term7865.getClass(), "slides", term7989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.application.util.mail.IAddressContact");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7865;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


