package org.openRealmOfStars.starMap.vote;

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
import static org.openRealmOfStars.starMap.vote.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Votes_saveVotes_315966212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24374;
     Object term24379;

    public Votes_saveVotes_315966212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24375 = new ArrayList();
        term24374 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term24374, term24374.getClass(), "listOfVotes", term24375);
        term24379 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term24381 = (byte[]) newByteArray(1);
        byte[] term24383 = (byte[]) newByteArray(0);
        Object term24385 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term24379, term24379.getClass(), "written", 1901317214);
        setByteElement(term24381, 0, (byte) -22);
        setField(term24379, term24379.getClass(), "bytearr", term24381);
        setField(term24379, term24379.getClass(), "writeBuffer", term24383);
        setField(term24379, term24379.getClass(), "out", null);
        setBooleanField(term24379, term24379.getClass(), "closed", true);
        setField(term24379, term24379.getClass(), "closeLock", term24385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term24379;
        callMethod(klass, "saveVotes", argTypes, term24374, args);
    }

};


