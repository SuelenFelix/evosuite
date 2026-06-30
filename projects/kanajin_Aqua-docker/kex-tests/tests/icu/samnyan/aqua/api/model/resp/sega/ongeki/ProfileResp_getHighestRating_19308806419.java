package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProfileResp_getHighestRating_19308806419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96591;

    public ProfileResp_getHighestRating_19308806419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96591 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96591, term96591.getClass(), "userName", "hrsKgCGBqS");
        setIntField(term96591, term96591.getClass(), "level", -824513880);
        setLongField(term96591, term96591.getClass(), "exp", -6358992007411333855L);
        setLongField(term96591, term96591.getClass(), "point", 7536042680141246039L);
        setLongField(term96591, term96591.getClass(), "totalPoint", -6705665497605860386L);
        setIntField(term96591, term96591.getClass(), "playCount", 154024555);
        setIntField(term96591, term96591.getClass(), "jewelCount", -1685654546);
        setIntField(term96591, term96591.getClass(), "totalJewelCount", 1574385487);
        setIntField(term96591, term96591.getClass(), "playerRating", -1209320470);
        setIntField(term96591, term96591.getClass(), "highestRating", -1369157367);
        setIntField(term96591, term96591.getClass(), "battlePoint", 1191523930);
        setIntField(term96591, term96591.getClass(), "nameplateId", -355800678);
        setIntField(term96591, term96591.getClass(), "trophyId", 1115394242);
        setIntField(term96591, term96591.getClass(), "cardId", 1386953687);
        setIntField(term96591, term96591.getClass(), "characterId", 1151779643);
        setLongField(term96591, term96591.getClass(), "sumTechHighScore", 3197734872719272103L);
        setLongField(term96591, term96591.getClass(), "sumTechBasicHighScore", 500226617772174121L);
        setLongField(term96591, term96591.getClass(), "sumTechAdvancedHighScore", 5666766866781931229L);
        setLongField(term96591, term96591.getClass(), "sumTechExpertHighScore", 127359375245968240L);
        setLongField(term96591, term96591.getClass(), "sumTechMasterHighScore", 8826101634790046603L);
        setLongField(term96591, term96591.getClass(), "sumTechLunaticHighScore", -5828221028674344098L);
        setLongField(term96591, term96591.getClass(), "sumBattleHighScore", 8477488500751075152L);
        setLongField(term96591, term96591.getClass(), "sumBattleBasicHighScore", -9141318298668677756L);
        setLongField(term96591, term96591.getClass(), "sumBattleAdvancedHighScore", 6691895071361411350L);
        setLongField(term96591, term96591.getClass(), "sumBattleExpertHighScore", 7034780785466178614L);
        setLongField(term96591, term96591.getClass(), "sumBattleMasterHighScore", -5806903111553773932L);
        setLongField(term96591, term96591.getClass(), "sumBattleLunaticHighScore", -4695361419617939533L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term96591, args);
    }

};


