package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class AITurnView_handleOlympicParticipation_112557525559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1280865;
     Object term1280870;

    public AITurnView_handleOlympicParticipation_112557525559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1280866 = new ArrayList();
        term1280865 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term1280865, term1280865.getClass(), "listOfVotes", term1280866);
        ArrayList term1280871 = new ArrayList();
        term1280870 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term1280870, term1280870.getClass(), "list", term1280871);
        setIntField(term1280870, term1280870.getClass(), "currentPlayer", -76361673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term1280865;
        args[1] = term1280870;
        callMethod(klass, "handleOlympicParticipation", argTypes, null, args);
    }

};


