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

public class AITurnView_handleOlympicParticipation_112557525556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1329719;
     Object term1329724;

    public AITurnView_handleOlympicParticipation_112557525556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1329720 = new ArrayList();
        term1329719 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term1329719, term1329719.getClass(), "listOfVotes", term1329720);
        ArrayList term1329725 = new ArrayList();
        term1329724 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term1329724, term1329724.getClass(), "list", term1329725);
        setIntField(term1329724, term1329724.getClass(), "currentPlayer", 1208926602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term1329719;
        args[1] = term1329724;
        callMethod(klass, "handleOlympicParticipation", argTypes, null, args);
    }

};


