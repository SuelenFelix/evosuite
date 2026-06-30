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
import java.lang.Integer;

public class ProfileResp_setBattlePoint_71932672097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100159;
     Object term100186;

    public ProfileResp_setBattlePoint_71932672097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100159 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100159, term100159.getClass(), "userName", null);
        setIntField(term100159, term100159.getClass(), "level", 0);
        setLongField(term100159, term100159.getClass(), "exp", 0L);
        setLongField(term100159, term100159.getClass(), "point", 0L);
        setLongField(term100159, term100159.getClass(), "totalPoint", 0L);
        setIntField(term100159, term100159.getClass(), "playCount", 0);
        setIntField(term100159, term100159.getClass(), "jewelCount", 0);
        setIntField(term100159, term100159.getClass(), "totalJewelCount", 0);
        setIntField(term100159, term100159.getClass(), "playerRating", 0);
        setIntField(term100159, term100159.getClass(), "highestRating", 0);
        setIntField(term100159, term100159.getClass(), "battlePoint", 0);
        setIntField(term100159, term100159.getClass(), "nameplateId", 0);
        setIntField(term100159, term100159.getClass(), "trophyId", 0);
        setIntField(term100159, term100159.getClass(), "cardId", 0);
        setIntField(term100159, term100159.getClass(), "characterId", 0);
        setLongField(term100159, term100159.getClass(), "sumTechHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100159, term100159.getClass(), "sumBattleLunaticHighScore", 0L);
        term100186 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100186;
        callMethod(klass, "setBattlePoint", argTypes, term100159, args);
    }

};


