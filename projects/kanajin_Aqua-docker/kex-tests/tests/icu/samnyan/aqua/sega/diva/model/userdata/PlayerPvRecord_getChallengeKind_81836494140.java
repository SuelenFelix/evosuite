package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerPvRecord_getChallengeKind_81836494140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652935;

    public PlayerPvRecord_getChallengeKind_81836494140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652935 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        setLongField(term652935, term652935.getClass(), "id", 0L);
        setField(term652935, term652935.getClass(), "pdId", null);
        setIntField(term652935, term652935.getClass(), "pvId", 0);
        setField(term652935, term652935.getClass(), "edition", null);
        setField(term652935, term652935.getClass(), "difficulty", null);
        setField(term652935, term652935.getClass(), "result", null);
        setIntField(term652935, term652935.getClass(), "maxScore", 0);
        setIntField(term652935, term652935.getClass(), "maxAttain", 0);
        setField(term652935, term652935.getClass(), "challengeKind", null);
        setField(term652935, term652935.getClass(), "rgoPurchased", null);
        setField(term652935, term652935.getClass(), "rgoPlayed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeKind", argTypes, term652935, args);
    }

};


