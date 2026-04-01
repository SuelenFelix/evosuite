package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NewsFactory_createVotingString_38109528594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670506;
     Object term670598;

    public NewsFactory_createVotingString_38109528594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term670708 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term670707 = ((Class) term670708).getDeclaredField((String) "FIRST_CANDIDATE");
        ((Field) term670707).setAccessible(true);
        Object enum2020 = ((Field) term670707).get((Object) null);
        Class<? extends Object> term670980 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term670979 = ((Class) term670980).getDeclaredField((String) "ABSTAIN");
        ((Field) term670979).setAccessible(true);
        Object enum2021 = ((Field) term670979).get((Object) null);
        Class<? extends Object> term671273 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term671272 = ((Class) term671273).getDeclaredField((String) "VOTED_YES");
        ((Field) term671272).setAccessible(true);
        Object enum2022 = ((Field) term671272).get((Object) null);
        Class<? extends Object> term671572 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term671571 = ((Class) term671572).getDeclaredField((String) "NOT_VOTED");
        ((Field) term671571).setAccessible(true);
        Object enum2023 = ((Field) term671571).get((Object) null);
        Class<? extends Object> term671871 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term671870 = ((Class) term671871).getDeclaredField((String) "VOTED_NO");
        ((Field) term671870).setAccessible(true);
        Object enum2024 = ((Field) term671870).get((Object) null);
        term670506 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term670526 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 7);
        int[] term670576 = (int[]) newIntArray(6);
        setField(term670506, term670506.getClass(), "type", enum2020);
        setElement(term670526, 0, enum2021);
        setElement(term670526, 1, enum2022);
        setElement(term670526, 2, enum2021);
        setElement(term670526, 3, enum2022);
        setElement(term670526, 4, enum2023);
        setElement(term670526, 5, enum2024);
        setElement(term670526, 6, enum2024);
        setField(term670506, term670506.getClass(), "choices", term670526);
        setIntElement(term670576, 0, 437573893);
        setIntElement(term670576, 1, -1662719279);
        setIntElement(term670576, 2, -2103009673);
        setIntElement(term670576, 3, -833974170);
        setIntElement(term670576, 4, -814411921);
        setIntElement(term670576, 5, 1852815037);
        setField(term670506, term670506.getClass(), "numberOfVotes", term670576);
        setIntField(term670506, term670506.getClass(), "turnsToVote", -2088339057);
        setIntField(term670506, term670506.getClass(), "organizerIndex", -1600084871);
        setIntField(term670506, term670506.getClass(), "secondCandidateIndex", 1608941244);
        setField(term670506, term670506.getClass(), "planetName", "cnRZTPuurt");
        term670598 = (Object[]) newArray("java.lang.String", 9);
        setElement(term670598, 0, "ZTfDYDFGRH");
        setElement(term670598, 1, "mjFpDxfcpo");
        setElement(term670598, 2, "gxbBYfuUmN");
        setElement(term670598, 3, "RYIQulGVSE");
        setElement(term670598, 4, "SipMCYxYjg");
        setElement(term670598, 5, "CrBjmbzooL");
        setElement(term670598, 6, "VCMcdsNOYY");
        setElement(term670598, 7, "QgSbktRyXj");
        setElement(term670598, 8, "afYqpgOPsG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term670506;
        args[1] = term670598;
        callMethod(klass, "createVotingString", argTypes, null, args);
    }

};


