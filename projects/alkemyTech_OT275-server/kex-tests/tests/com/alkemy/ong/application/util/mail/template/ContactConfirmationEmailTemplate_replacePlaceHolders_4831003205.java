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

public class ContactConfirmationEmailTemplate_replacePlaceHolders_4831003205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2781;

    public ContactConfirmationEmailTemplate_replacePlaceHolders_4831003205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2783 = new Long(-7738503207562305297L);
        Long term2909 = new Long(3825396310311739952L);
        Integer term2911 = new Integer(-817164822);
        Object term2908 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2908, term2908.getClass(), "id", term2909);
        setField(term2908, term2908.getClass(), "imageUrl", null);
        setField(term2908, term2908.getClass(), "order", term2911);
        setField(term2908, term2908.getClass(), "text", null);
        setField(term2908, term2908.getClass(), "base64FileEncoded", null);
        setField(term2908, term2908.getClass(), "contentType", null);
        Long term2914 = new Long(-3838084482494604218L);
        Integer term2916 = new Integer(-1016503459);
        Object term2913 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2913, term2913.getClass(), "id", term2914);
        setField(term2913, term2913.getClass(), "imageUrl", null);
        setField(term2913, term2913.getClass(), "order", term2916);
        setField(term2913, term2913.getClass(), "text", null);
        setField(term2913, term2913.getClass(), "base64FileEncoded", null);
        setField(term2913, term2913.getClass(), "contentType", null);
        Long term2919 = new Long(3892018155439224435L);
        Integer term2921 = new Integer(-1968847291);
        Object term2918 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2918, term2918.getClass(), "id", term2919);
        setField(term2918, term2918.getClass(), "imageUrl", null);
        setField(term2918, term2918.getClass(), "order", term2921);
        setField(term2918, term2918.getClass(), "text", null);
        setField(term2918, term2918.getClass(), "base64FileEncoded", null);
        setField(term2918, term2918.getClass(), "contentType", null);
        Long term2924 = new Long(5953383087795962419L);
        Integer term2926 = new Integer(579005622);
        Object term2923 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2923, term2923.getClass(), "id", term2924);
        setField(term2923, term2923.getClass(), "imageUrl", null);
        setField(term2923, term2923.getClass(), "order", term2926);
        setField(term2923, term2923.getClass(), "text", null);
        setField(term2923, term2923.getClass(), "base64FileEncoded", null);
        setField(term2923, term2923.getClass(), "contentType", null);
        Long term2929 = new Long(7994303628307559416L);
        Integer term2931 = new Integer(-14890619);
        Object term2928 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2928, term2928.getClass(), "id", term2929);
        setField(term2928, term2928.getClass(), "imageUrl", null);
        setField(term2928, term2928.getClass(), "order", term2931);
        setField(term2928, term2928.getClass(), "text", null);
        setField(term2928, term2928.getClass(), "base64FileEncoded", null);
        setField(term2928, term2928.getClass(), "contentType", null);
        ArrayList term2906 = new ArrayList();
        ((ArrayList) term2906).add(term2908);
        ((ArrayList) term2906).add(term2913);
        ((ArrayList) term2906).add(term2918);
        ((ArrayList) term2906).add(term2923);
        ((ArrayList) term2906).add(term2928);
        term2781 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.ContactConfirmationEmailTemplate"));
        Object term2782 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term2845 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term2781, term2781.getClass(), "addressContact", null);
        setField(term2782, term2782.getClass(), "id", term2783);
        setField(term2782, term2782.getClass(), "name", "urCiQnUFBM");
        setField(term2782, term2782.getClass(), "image", "EKjQdtKxAM");
        setField(term2782, term2782.getClass(), "phone", "TXZAIPQJHt");
        setField(term2782, term2782.getClass(), "address", "DIbeDHICho");
        setField(term2782, term2782.getClass(), "email", "dJGPlmSRnz");
        setField(term2845, term2845.getClass(), "facebookUrl", "DPskuFUobI");
        setField(term2845, term2845.getClass(), "linkedInUrl", "wBGfLpNNiZ");
        setField(term2845, term2845.getClass(), "instagramUrl", "yUGCjlqgJE");
        setField(term2782, term2782.getClass(), "socialMedia", term2845);
        setField(term2782, term2782.getClass(), "aboutUsText", "PXdVZyoJyC");
        setField(term2782, term2782.getClass(), "welcomeText", "vLerpqavFM");
        setField(term2782, term2782.getClass(), "slides", term2906);
        setField(term2781, term2781.getClass(), "organization", term2782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.ContactConfirmationEmailTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BbNeQJpYPr";
        callMethod(klass, "replacePlaceHolders", argTypes, term2781, args);
    }

};


