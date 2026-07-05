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

public class WelcomeEmailTemplate_getTo_19420204612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;

    public WelcomeEmailTemplate_getTo_19420204612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term257 = new Long(4872422362414183754L);
        Long term383 = new Long(6811161968424632369L);
        Integer term385 = new Integer(-616727354);
        Object term382 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term382, term382.getClass(), "id", term383);
        setField(term382, term382.getClass(), "imageUrl", null);
        setField(term382, term382.getClass(), "order", term385);
        setField(term382, term382.getClass(), "text", null);
        setField(term382, term382.getClass(), "base64FileEncoded", null);
        setField(term382, term382.getClass(), "contentType", null);
        Long term388 = new Long(-7237588299778557629L);
        Integer term390 = new Integer(-1955890973);
        Object term387 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term387, term387.getClass(), "id", term388);
        setField(term387, term387.getClass(), "imageUrl", null);
        setField(term387, term387.getClass(), "order", term390);
        setField(term387, term387.getClass(), "text", null);
        setField(term387, term387.getClass(), "base64FileEncoded", null);
        setField(term387, term387.getClass(), "contentType", null);
        Long term393 = new Long(6967924379644551255L);
        Integer term395 = new Integer(-2038273078);
        Object term392 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term392, term392.getClass(), "id", term393);
        setField(term392, term392.getClass(), "imageUrl", null);
        setField(term392, term392.getClass(), "order", term395);
        setField(term392, term392.getClass(), "text", null);
        setField(term392, term392.getClass(), "base64FileEncoded", null);
        setField(term392, term392.getClass(), "contentType", null);
        Long term398 = new Long(-2813493605142626659L);
        Integer term400 = new Integer(1227103734);
        Object term397 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term397, term397.getClass(), "id", term398);
        setField(term397, term397.getClass(), "imageUrl", null);
        setField(term397, term397.getClass(), "order", term400);
        setField(term397, term397.getClass(), "text", null);
        setField(term397, term397.getClass(), "base64FileEncoded", null);
        setField(term397, term397.getClass(), "contentType", null);
        ArrayList term380 = new ArrayList();
        ((ArrayList) term380).add(term382);
        ((ArrayList) term380).add(term387);
        ((ArrayList) term380).add(term392);
        ((ArrayList) term380).add(term397);
        term255 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term256 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term319 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term255, term255.getClass(), "addressContact", null);
        setField(term256, term256.getClass(), "id", term257);
        setField(term256, term256.getClass(), "name", "OWDIEULEFu");
        setField(term256, term256.getClass(), "image", "dWRymuLBtr");
        setField(term256, term256.getClass(), "phone", "AijpHYOFuy");
        setField(term256, term256.getClass(), "address", "SbAoxhfrkn");
        setField(term256, term256.getClass(), "email", "kuTXqwMtDB");
        setField(term319, term319.getClass(), "facebookUrl", "Ghbwtircqb");
        setField(term319, term319.getClass(), "linkedInUrl", "xrwlQZdwCp");
        setField(term319, term319.getClass(), "instagramUrl", "IDCWpPLRkE");
        setField(term256, term256.getClass(), "socialMedia", term319);
        setField(term256, term256.getClass(), "aboutUsText", "nyiiPDVjAc");
        setField(term256, term256.getClass(), "welcomeText", "aKnKipADSo");
        setField(term256, term256.getClass(), "slides", term380);
        setField(term255, term255.getClass(), "organization", term256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTo", argTypes, term255, args);
    }

};


