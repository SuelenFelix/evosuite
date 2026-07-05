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

public class WelcomeEmailTemplate_replacePlaceHolders_17663302536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;

    public WelcomeEmailTemplate_replacePlaceHolders_17663302536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1233 = new Long(8059786003080744426L);
        Long term1359 = new Long(-4365849114644724155L);
        Integer term1361 = new Integer(-1456670397);
        Object term1358 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1358, term1358.getClass(), "id", term1359);
        setField(term1358, term1358.getClass(), "imageUrl", null);
        setField(term1358, term1358.getClass(), "order", term1361);
        setField(term1358, term1358.getClass(), "text", null);
        setField(term1358, term1358.getClass(), "base64FileEncoded", null);
        setField(term1358, term1358.getClass(), "contentType", null);
        Long term1364 = new Long(2486810210675247493L);
        Integer term1366 = new Integer(1622346318);
        Object term1363 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1363, term1363.getClass(), "id", term1364);
        setField(term1363, term1363.getClass(), "imageUrl", null);
        setField(term1363, term1363.getClass(), "order", term1366);
        setField(term1363, term1363.getClass(), "text", null);
        setField(term1363, term1363.getClass(), "base64FileEncoded", null);
        setField(term1363, term1363.getClass(), "contentType", null);
        Long term1369 = new Long(7009926388951271268L);
        Integer term1371 = new Integer(1048535127);
        Object term1368 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1368, term1368.getClass(), "id", term1369);
        setField(term1368, term1368.getClass(), "imageUrl", null);
        setField(term1368, term1368.getClass(), "order", term1371);
        setField(term1368, term1368.getClass(), "text", null);
        setField(term1368, term1368.getClass(), "base64FileEncoded", null);
        setField(term1368, term1368.getClass(), "contentType", null);
        Long term1374 = new Long(-7672528020740371001L);
        Integer term1376 = new Integer(-655067527);
        Object term1373 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1373, term1373.getClass(), "id", term1374);
        setField(term1373, term1373.getClass(), "imageUrl", null);
        setField(term1373, term1373.getClass(), "order", term1376);
        setField(term1373, term1373.getClass(), "text", null);
        setField(term1373, term1373.getClass(), "base64FileEncoded", null);
        setField(term1373, term1373.getClass(), "contentType", null);
        Long term1379 = new Long(-4502405999831680926L);
        Integer term1381 = new Integer(-6029667);
        Object term1378 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1378, term1378.getClass(), "id", term1379);
        setField(term1378, term1378.getClass(), "imageUrl", null);
        setField(term1378, term1378.getClass(), "order", term1381);
        setField(term1378, term1378.getClass(), "text", null);
        setField(term1378, term1378.getClass(), "base64FileEncoded", null);
        setField(term1378, term1378.getClass(), "contentType", null);
        Long term1384 = new Long(1967728129628047933L);
        Integer term1386 = new Integer(-2068769794);
        Object term1383 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1383, term1383.getClass(), "id", term1384);
        setField(term1383, term1383.getClass(), "imageUrl", null);
        setField(term1383, term1383.getClass(), "order", term1386);
        setField(term1383, term1383.getClass(), "text", null);
        setField(term1383, term1383.getClass(), "base64FileEncoded", null);
        setField(term1383, term1383.getClass(), "contentType", null);
        ArrayList term1356 = new ArrayList();
        ((ArrayList) term1356).add(term1358);
        ((ArrayList) term1356).add(term1363);
        ((ArrayList) term1356).add(term1368);
        ((ArrayList) term1356).add(term1373);
        ((ArrayList) term1356).add(term1378);
        ((ArrayList) term1356).add(term1383);
        term1231 = newInstance(Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate"));
        Object term1232 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term1295 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term1231, term1231.getClass(), "addressContact", null);
        setField(term1232, term1232.getClass(), "id", term1233);
        setField(term1232, term1232.getClass(), "name", "pORebkoRdD");
        setField(term1232, term1232.getClass(), "image", "mXGCWJDOqA");
        setField(term1232, term1232.getClass(), "phone", "dpNsDgfPso");
        setField(term1232, term1232.getClass(), "address", "hCWPJQKpdc");
        setField(term1232, term1232.getClass(), "email", "WzMEhMXkKx");
        setField(term1295, term1295.getClass(), "facebookUrl", "XOiDvlDhdc");
        setField(term1295, term1295.getClass(), "linkedInUrl", "AdxvLJhNLe");
        setField(term1295, term1295.getClass(), "instagramUrl", "lHfTrWKMPk");
        setField(term1232, term1232.getClass(), "socialMedia", term1295);
        setField(term1232, term1232.getClass(), "aboutUsText", "JDaAnsVTGV");
        setField(term1232, term1232.getClass(), "welcomeText", "mLUZFTfjle");
        setField(term1232, term1232.getClass(), "slides", term1356);
        setField(term1231, term1231.getClass(), "organization", term1232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.util.mail.template.WelcomeEmailTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MwwjNtdOFT";
        callMethod(klass, "replacePlaceHolders", argTypes, term1231, args);
    }

};


