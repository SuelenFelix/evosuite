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

public class Votes_generateNextVote_3607907307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24337;
     Object term24342;
     Object term24344;
     Object term24346;

    public Votes_generateNextVote_3607907307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24338 = new ArrayList();
        term24337 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term24337, term24337.getClass(), "listOfVotes", term24338);
        term24342 = new Integer(-919416536);
        term24344 = new Integer(-43417861);
        term24346 = new Integer(-1533843432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term24342;
        args[1] = term24344;
        args[2] = term24346;
        callMethod(klass, "generateNextVote", argTypes, term24337, args);
    }

};


