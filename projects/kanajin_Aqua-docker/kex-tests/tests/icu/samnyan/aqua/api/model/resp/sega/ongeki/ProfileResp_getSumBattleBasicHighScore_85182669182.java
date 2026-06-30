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

public class ProfileResp_getSumBattleBasicHighScore_85182669182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99736;

    public ProfileResp_getSumBattleBasicHighScore_85182669182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99736 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term99736, term99736.getClass(), "userName", null);
        setIntField(term99736, term99736.getClass(), "level", 0);
        setLongField(term99736, term99736.getClass(), "exp", 0L);
        setLongField(term99736, term99736.getClass(), "point", 0L);
        setLongField(term99736, term99736.getClass(), "totalPoint", 0L);
        setIntField(term99736, term99736.getClass(), "playCount", 0);
        setIntField(term99736, term99736.getClass(), "jewelCount", 0);
        setIntField(term99736, term99736.getClass(), "totalJewelCount", 0);
        setIntField(term99736, term99736.getClass(), "playerRating", 0);
        setIntField(term99736, term99736.getClass(), "highestRating", 0);
        setIntField(term99736, term99736.getClass(), "battlePoint", 0);
        setIntField(term99736, term99736.getClass(), "nameplateId", 0);
        setIntField(term99736, term99736.getClass(), "trophyId", 0);
        setIntField(term99736, term99736.getClass(), "cardId", 0);
        setIntField(term99736, term99736.getClass(), "characterId", 0);
        setLongField(term99736, term99736.getClass(), "sumTechHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumBattleHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term99736, term99736.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleBasicHighScore", argTypes, term99736, args);
    }

};


