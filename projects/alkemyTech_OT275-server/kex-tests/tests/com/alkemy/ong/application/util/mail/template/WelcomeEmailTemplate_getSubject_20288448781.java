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

public class WelcomeEmailTemplate_getSubject_20288448781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public WelcomeEmailTemplate_getSubject_20288448781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3 = new Long(2442117782898005296L);
        Long term129 = new Long(6375119433582206027L);
        Integer term131 = new Integer(568599855);
        Object term128 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term128, term128.getClass(), "id", term129);
        setField(term128, term128.getClass(), "imageUrl", null);
        setField(term128, term128.getClass(), "order", term131);
        setField(term128, term128.getClass(), "text", null);
        setField(term128, term128.getClass(), "base64FileEncoded", null);
        setField(term128, term128.getClass(), "contentType", null);
        Long term134 = new Long(-8257434502486459194L);
        Integer term136 = new Integer(1162663216);
        Object term133 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term133, term133.getClass(), "id", term134);
        setField(term133, term133.getClass(), "imageUrl", null);
        setField(term133, term133.getClass(), "order", term136);
        setField(term133, term133.getClass(), "text", null);
        setField(term133, term133.getClass(), "base64FileEncoded", null);
        setField(term133, term133.getClass(), "contentType", null);
        Long term139 = new Long(-8400487765614892086L);
        Integer term141 = new Integer(1484323161);
        Object term138 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term138, term138.getClass(), "id", term139);
        setField(term138, term138.getClass(), "imageUrl", null);
        setField(term138, term138.getClass(), "order", term141);
        setField(term138, term138.getClass(), "text", null);
        setField(term138, term138.getClass(), "base64FileEncoded", null);
        setField(term138, term138.getClass(), "contentType", null);
        Long term144 = new Long(5270370404989704783L);
        Integer term146 = new Integer(391863371);
        Object term143 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term143, term143.getClass(), "id", term144);
        setField(term143, term143.getClass(), "imageUrl", null);
        setField(term143, term143.getClass(), "order", term146);
        setField(term143, term143.getClass(), "text", null);
        setField(term143, term143.getClass(), "base64FileEncoded", null);
        setField(term143, term143.getClass(), "contentType", null);
        Long term149 = new Long(7411271909051562686L);
        Integer term151 = new Integer(-1922583790);
        Object term148 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term148, term148.getClass(), "id", term149);
        setField(term148, term148.getClass(), "imageUrl", null);
        setField(term148, term148.getClass(), "order", term151);
        setField(term148, term148.getClass(), "text", null);
        setField(term148, term148.getClass(), "base64FileEncoded", null);
        setField(term148, term148.getClass(), "contentType", null);
        ArrayList term126 = new ArrayList();
        ((ArrayList) term126).add(term128);
        ((ArrayList) term126).add(term133);
        ((ArrayList) term126).add(term138);
        ((ArrayList) term126).add(term143);
        ((ArrayList) term126).add(term148);
        term1 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term2 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term65 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term1, term1.getClass(), "addressContact", null);
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "image", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "phone", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "address", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "email", "jJCZpVmanW");
        setField(term65, term65.getClass(), "facebookUrl", "EGtDIRbSSb");
        setField(term65, term65.getClass(), "linkedInUrl", "SzjVpOQTyS");
        setField(term65, term65.getClass(), "instagramUrl", "MjGYSRKTNF");
        setField(term2, term2.getClass(), "socialMedia", term65);
        setField(term2, term2.getClass(), "aboutUsText", "hRNSzYYIrc");
        setField(term2, term2.getClass(), "welcomeText", "RMFIsYGgne");
        setField(term2, term2.getClass(), "slides", term126);
        setField(term1, term1.getClass(), "organization", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubject", argTypes, term1, args);
    }

};


