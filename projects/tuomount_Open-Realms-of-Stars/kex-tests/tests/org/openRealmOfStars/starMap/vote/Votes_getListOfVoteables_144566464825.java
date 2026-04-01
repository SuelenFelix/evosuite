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
import java.lang.Integer;

public class Votes_getListOfVoteables_144566464825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24712;
     Object term24713;
     Object term24715;
     Object term24717;

    public Votes_getListOfVoteables_144566464825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24712 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term24712, term24712.getClass(), "listOfVotes", null);
        term24713 = new Integer(0);
        term24715 = new Integer(0);
        term24717 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term24713;
        args[1] = term24715;
        args[2] = term24717;
        callMethod(klass, "getListOfVoteables", argTypes, term24712, args);
    }

};


