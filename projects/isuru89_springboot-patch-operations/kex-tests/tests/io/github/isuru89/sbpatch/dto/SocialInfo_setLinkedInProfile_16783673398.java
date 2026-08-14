package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class SocialInfo_setLinkedInProfile_16783673398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1343;

    public SocialInfo_setLinkedInProfile_16783673398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1345 = new Long(2486810210675247493L);
        Object term1397 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1397, term1397.getClass(), "email", null);
        Object term1398 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1398, term1398.getClass(), "email", null);
        Object term1399 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1399, term1399.getClass(), "email", null);
        Object term1400 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1400, term1400.getClass(), "email", null);
        Object term1401 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1401, term1401.getClass(), "email", null);
        Object term1402 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1402, term1402.getClass(), "email", null);
        Object term1403 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term1403, term1403.getClass(), "email", null);
        ArrayList term1395 = new ArrayList();
        ((ArrayList) term1395).add(term1397);
        ((ArrayList) term1395).add(term1398);
        ((ArrayList) term1395).add(term1399);
        ((ArrayList) term1395).add(term1400);
        ((ArrayList) term1395).add(term1401);
        ((ArrayList) term1395).add(term1402);
        ((ArrayList) term1395).add(term1403);
        Long term1406 = new Long(7009926388951271268L);
        Long term1408 = new Long(-7672528020740371001L);
        term1343 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term1344 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term1344, term1344.getClass(), "id", term1345);
        setField(term1344, term1344.getClass(), "userName", "PHvxnGHptP");
        setField(term1344, term1344.getClass(), "firstName", "TimdotUuNC");
        setField(term1344, term1344.getClass(), "lastName", "PkWMRdJcBb");
        setField(term1344, term1344.getClass(), "primaryEmail", "jSpAteRute");
        setField(term1344, term1344.getClass(), "secondaryEmails", term1395);
        setField(term1344, term1344.getClass(), "createdAt", term1406);
        setField(term1344, term1344.getClass(), "updatedAt", term1408);
        setField(term1343, term1343.getClass(), "user", term1344);
        setField(term1343, term1343.getClass(), "githubProfile", "JiVRgTZvKc");
        setField(term1343, term1343.getClass(), "twitterProfile", "XPKmummaqg");
        setField(term1343, term1343.getClass(), "linkedInProfile", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPpkrGcPRr";
        callMethod(klass, "setLinkedInProfile", argTypes, term1343, args);
    }

};


