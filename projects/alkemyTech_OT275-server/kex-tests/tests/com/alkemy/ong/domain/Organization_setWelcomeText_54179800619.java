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

public class Organization_setWelcomeText_54179800619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5336;

    public Organization_setWelcomeText_54179800619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5337 = new Long(2135754395358000892L);
        Long term5463 = new Long(-8085190702504231560L);
        Integer term5466 = new Integer(-2027534003);
        Object term5462 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5462, term5462.getClass(), "id", term5463);
        setField(term5462, term5462.getClass(), "imageUrl", "");
        setField(term5462, term5462.getClass(), "order", term5466);
        setField(term5462, term5462.getClass(), "text", "");
        setField(term5462, term5462.getClass(), "base64FileEncoded", "");
        setField(term5462, term5462.getClass(), "contentType", "");
        Long term5472 = new Long(1672578078364590450L);
        Integer term5475 = new Integer(1063420942);
        Object term5471 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5471, term5471.getClass(), "id", term5472);
        setField(term5471, term5471.getClass(), "imageUrl", "");
        setField(term5471, term5471.getClass(), "order", term5475);
        setField(term5471, term5471.getClass(), "text", "");
        setField(term5471, term5471.getClass(), "base64FileEncoded", "");
        setField(term5471, term5471.getClass(), "contentType", "");
        Long term5481 = new Long(4949335493504695457L);
        Integer term5484 = new Integer(1375330971);
        Object term5480 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5480, term5480.getClass(), "id", term5481);
        setField(term5480, term5480.getClass(), "imageUrl", "");
        setField(term5480, term5480.getClass(), "order", term5484);
        setField(term5480, term5480.getClass(), "text", "");
        setField(term5480, term5480.getClass(), "base64FileEncoded", "");
        setField(term5480, term5480.getClass(), "contentType", "");
        Long term5490 = new Long(-5216789073301458893L);
        Integer term5493 = new Integer(-478195677);
        Object term5489 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5489, term5489.getClass(), "id", term5490);
        setField(term5489, term5489.getClass(), "imageUrl", "");
        setField(term5489, term5489.getClass(), "order", term5493);
        setField(term5489, term5489.getClass(), "text", "");
        setField(term5489, term5489.getClass(), "base64FileEncoded", "");
        setField(term5489, term5489.getClass(), "contentType", "");
        Long term5499 = new Long(-1832940336320585644L);
        Integer term5502 = new Integer(972867650);
        Object term5498 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term5498, term5498.getClass(), "id", term5499);
        setField(term5498, term5498.getClass(), "imageUrl", "");
        setField(term5498, term5498.getClass(), "order", term5502);
        setField(term5498, term5498.getClass(), "text", "");
        setField(term5498, term5498.getClass(), "base64FileEncoded", "");
        setField(term5498, term5498.getClass(), "contentType", "");
        ArrayList term5460 = new ArrayList();
        ((ArrayList) term5460).add(term5462);
        ((ArrayList) term5460).add(term5471);
        ((ArrayList) term5460).add(term5480);
        ((ArrayList) term5460).add(term5489);
        ((ArrayList) term5460).add(term5498);
        term5336 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term5399 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term5336, term5336.getClass(), "id", term5337);
        setField(term5336, term5336.getClass(), "name", "IlBhdrCvHq");
        setField(term5336, term5336.getClass(), "image", "OirVUQhauU");
        setField(term5336, term5336.getClass(), "phone", "GLbyDfbNZI");
        setField(term5336, term5336.getClass(), "address", "oNLcCYDAsO");
        setField(term5336, term5336.getClass(), "email", "CNqMxLvtcJ");
        setField(term5399, term5399.getClass(), "facebookUrl", "ktbqerIaKW");
        setField(term5399, term5399.getClass(), "linkedInUrl", "VoghngXfsK");
        setField(term5399, term5399.getClass(), "instagramUrl", "GbahCBMvct");
        setField(term5336, term5336.getClass(), "socialMedia", term5399);
        setField(term5336, term5336.getClass(), "aboutUsText", "iiHBhsNFgk");
        setField(term5336, term5336.getClass(), "welcomeText", "HknsTajwxJ");
        setField(term5336, term5336.getClass(), "slides", term5460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bHHjfDCntT";
        callMethod(klass, "setWelcomeText", argTypes, term5336, args);
    }

};


