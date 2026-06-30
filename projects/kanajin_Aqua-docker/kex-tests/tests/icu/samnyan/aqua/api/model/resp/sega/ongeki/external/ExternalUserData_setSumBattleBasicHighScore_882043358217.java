package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ExternalUserData_setSumBattleBasicHighScore_882043358217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149496;
     Object term149540;

    public ExternalUserData_setSumBattleBasicHighScore_882043358217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149496 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149496, term149496.getClass(), "accessCode", null);
        setField(term149496, term149496.getClass(), "userName", null);
        setIntField(term149496, term149496.getClass(), "level", 0);
        setIntField(term149496, term149496.getClass(), "reincarnationNum", 0);
        setLongField(term149496, term149496.getClass(), "exp", 0L);
        setLongField(term149496, term149496.getClass(), "point", 0L);
        setLongField(term149496, term149496.getClass(), "totalPoint", 0L);
        setIntField(term149496, term149496.getClass(), "playCount", 0);
        setIntField(term149496, term149496.getClass(), "jewelCount", 0);
        setIntField(term149496, term149496.getClass(), "totalJewelCount", 0);
        setIntField(term149496, term149496.getClass(), "medalCount", 0);
        setIntField(term149496, term149496.getClass(), "playerRating", 0);
        setIntField(term149496, term149496.getClass(), "highestRating", 0);
        setIntField(term149496, term149496.getClass(), "battlePoint", 0);
        setIntField(term149496, term149496.getClass(), "bestBattlePoint", 0);
        setIntField(term149496, term149496.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149496, term149496.getClass(), "nameplateId", 0);
        setIntField(term149496, term149496.getClass(), "trophyId", 0);
        setIntField(term149496, term149496.getClass(), "cardId", 0);
        setIntField(term149496, term149496.getClass(), "characterId", 0);
        setIntField(term149496, term149496.getClass(), "tabSetting", 0);
        setIntField(term149496, term149496.getClass(), "tabSortSetting", 0);
        setIntField(term149496, term149496.getClass(), "cardCategorySetting", 0);
        setIntField(term149496, term149496.getClass(), "cardSortSetting", 0);
        setIntField(term149496, term149496.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149496, term149496.getClass(), "playedTutorialBit", 0);
        setIntField(term149496, term149496.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149496, term149496.getClass(), "sumTechHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149496, term149496.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149496, term149496.getClass(), "eventWatchedDate", null);
        setField(term149496, term149496.getClass(), "cmEventWatchedDate", null);
        setField(term149496, term149496.getClass(), "firstGameId", null);
        setField(term149496, term149496.getClass(), "firstRomVersion", null);
        setField(term149496, term149496.getClass(), "firstDataVersion", null);
        setField(term149496, term149496.getClass(), "firstPlayDate", null);
        setField(term149496, term149496.getClass(), "lastGameId", null);
        setField(term149496, term149496.getClass(), "lastRomVersion", null);
        setField(term149496, term149496.getClass(), "lastDataVersion", null);
        setField(term149496, term149496.getClass(), "compatibleCmVersion", null);
        setField(term149496, term149496.getClass(), "lastPlayDate", null);
        setIntField(term149496, term149496.getClass(), "lastPlaceId", 0);
        setField(term149496, term149496.getClass(), "lastPlaceName", null);
        setIntField(term149496, term149496.getClass(), "lastRegionId", 0);
        setField(term149496, term149496.getClass(), "lastRegionName", null);
        setIntField(term149496, term149496.getClass(), "lastAllNetId", 0);
        setField(term149496, term149496.getClass(), "lastClientId", null);
        setIntField(term149496, term149496.getClass(), "lastUsedDeckId", 0);
        setIntField(term149496, term149496.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149496, term149496.getClass(), "lastEmoneyBrand", 0);
        term149540 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149540;
        callMethod(klass, "setSumBattleBasicHighScore", argTypes, term149496, args);
    }

};


