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

public class ContactConfirmationEmailTemplate_getContentType_16432461006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3057;

    public ContactConfirmationEmailTemplate_getContentType_16432461006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3059 = new Long(2443640364875054177L);
        Long term3185 = new Long(-1610676979013636850L);
        Integer term3187 = new Integer(1632125673);
        Object term3184 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3184, term3184.getClass(), "id", term3185);
        setField(term3184, term3184.getClass(), "imageUrl", null);
        setField(term3184, term3184.getClass(), "order", term3187);
        setField(term3184, term3184.getClass(), "text", null);
        setField(term3184, term3184.getClass(), "base64FileEncoded", null);
        setField(term3184, term3184.getClass(), "contentType", null);
        Long term3190 = new Long(2062173786000223358L);
        Integer term3192 = new Integer(454281060);
        Object term3189 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3189, term3189.getClass(), "id", term3190);
        setField(term3189, term3189.getClass(), "imageUrl", null);
        setField(term3189, term3189.getClass(), "order", term3192);
        setField(term3189, term3189.getClass(), "text", null);
        setField(term3189, term3189.getClass(), "base64FileEncoded", null);
        setField(term3189, term3189.getClass(), "contentType", null);
        Long term3195 = new Long(-8658027316505137504L);
        Integer term3197 = new Integer(-1786399638);
        Object term3194 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3194, term3194.getClass(), "id", term3195);
        setField(term3194, term3194.getClass(), "imageUrl", null);
        setField(term3194, term3194.getClass(), "order", term3197);
        setField(term3194, term3194.getClass(), "text", null);
        setField(term3194, term3194.getClass(), "base64FileEncoded", null);
        setField(term3194, term3194.getClass(), "contentType", null);
        Long term3200 = new Long(414749984815662075L);
        Integer term3202 = new Integer(2055867847);
        Object term3199 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3199, term3199.getClass(), "id", term3200);
        setField(term3199, term3199.getClass(), "imageUrl", null);
        setField(term3199, term3199.getClass(), "order", term3202);
        setField(term3199, term3199.getClass(), "text", null);
        setField(term3199, term3199.getClass(), "base64FileEncoded", null);
        setField(term3199, term3199.getClass(), "contentType", null);
        Long term3205 = new Long(463622836963501975L);
        Integer term3207 = new Integer(-1048298087);
        Object term3204 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term3204, term3204.getClass(), "id", term3205);
        setField(term3204, term3204.getClass(), "imageUrl", null);
        setField(term3204, term3204.getClass(), "order", term3207);
        setField(term3204, term3204.getClass(), "text", null);
        setField(term3204, term3204.getClass(), "base64FileEncoded", null);
        setField(term3204, term3204.getClass(), "contentType", null);
        ArrayList term3182 = new ArrayList();
        ((ArrayList) term3182).add(term3184);
        ((ArrayList) term3182).add(term3189);
        ((ArrayList) term3182).add(term3194);
        ((ArrayList) term3182).add(term3199);
        ((ArrayList) term3182).add(term3204);
        term3057 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.ContactConfirmationEmailTemplate"));
        Object term3058 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term3121 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term3057, term3057.getClass(), "addressContact", null);
        setField(term3058, term3058.getClass(), "id", term3059);
        setField(term3058, term3058.getClass(), "name", "riMtzCoxNj");
        setField(term3058, term3058.getClass(), "image", "YAXkVjQZcV");
        setField(term3058, term3058.getClass(), "phone", "pumvwBWvpy");
        setField(term3058, term3058.getClass(), "address", "HwLHeGLyhe");
        setField(term3058, term3058.getClass(), "email", "RDnkgWkcbz");
        setField(term3121, term3121.getClass(), "facebookUrl", "IBpaxltauX");
        setField(term3121, term3121.getClass(), "linkedInUrl", "hePqROaplw");
        setField(term3121, term3121.getClass(), "instagramUrl", "PJcSNDruWd");
        setField(term3058, term3058.getClass(), "socialMedia", term3121);
        setField(term3058, term3058.getClass(), "aboutUsText", "VVNNlAePXF");
        setField(term3058, term3058.getClass(), "welcomeText", "jnwVnmKAFv");
        setField(term3058, term3058.getClass(), "slides", term3182);
        setField(term3057, term3057.getClass(), "organization", term3058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.ContactConfirmationEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentType", argTypes, term3057, args);
    }

};


