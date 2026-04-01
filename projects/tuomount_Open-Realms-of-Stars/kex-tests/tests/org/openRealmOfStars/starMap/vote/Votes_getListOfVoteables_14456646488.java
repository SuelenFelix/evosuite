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
import java.lang.Integer;

public class Votes_getListOfVoteables_14456646488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24348;
     Object term24353;
     Object term24355;
     Object term24357;

    public Votes_getListOfVoteables_14456646488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24349 = new ArrayList();
        term24348 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term24348, term24348.getClass(), "listOfVotes", term24349);
        term24353 = new Integer(-123338791);
        term24355 = new Integer(-1467089634);
        term24357 = new Integer(413548937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term24353;
        args[1] = term24355;
        args[2] = term24357;
        callMethod(klass, "getListOfVoteables", argTypes, term24348, args);
    }

};


