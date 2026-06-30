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

public class ExternalUserData_setSumTechMasterHighScore_590429778214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149358;
     Object term149402;

    public ExternalUserData_setSumTechMasterHighScore_590429778214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149358 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149358, term149358.getClass(), "accessCode", null);
        setField(term149358, term149358.getClass(), "userName", null);
        setIntField(term149358, term149358.getClass(), "level", 0);
        setIntField(term149358, term149358.getClass(), "reincarnationNum", 0);
        setLongField(term149358, term149358.getClass(), "exp", 0L);
        setLongField(term149358, term149358.getClass(), "point", 0L);
        setLongField(term149358, term149358.getClass(), "totalPoint", 0L);
        setIntField(term149358, term149358.getClass(), "playCount", 0);
        setIntField(term149358, term149358.getClass(), "jewelCount", 0);
        setIntField(term149358, term149358.getClass(), "totalJewelCount", 0);
        setIntField(term149358, term149358.getClass(), "medalCount", 0);
        setIntField(term149358, term149358.getClass(), "playerRating", 0);
        setIntField(term149358, term149358.getClass(), "highestRating", 0);
        setIntField(term149358, term149358.getClass(), "battlePoint", 0);
        setIntField(term149358, term149358.getClass(), "bestBattlePoint", 0);
        setIntField(term149358, term149358.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149358, term149358.getClass(), "nameplateId", 0);
        setIntField(term149358, term149358.getClass(), "trophyId", 0);
        setIntField(term149358, term149358.getClass(), "cardId", 0);
        setIntField(term149358, term149358.getClass(), "characterId", 0);
        setIntField(term149358, term149358.getClass(), "tabSetting", 0);
        setIntField(term149358, term149358.getClass(), "tabSortSetting", 0);
        setIntField(term149358, term149358.getClass(), "cardCategorySetting", 0);
        setIntField(term149358, term149358.getClass(), "cardSortSetting", 0);
        setIntField(term149358, term149358.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149358, term149358.getClass(), "playedTutorialBit", 0);
        setIntField(term149358, term149358.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149358, term149358.getClass(), "sumTechHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149358, term149358.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149358, term149358.getClass(), "eventWatchedDate", null);
        setField(term149358, term149358.getClass(), "cmEventWatchedDate", null);
        setField(term149358, term149358.getClass(), "firstGameId", null);
        setField(term149358, term149358.getClass(), "firstRomVersion", null);
        setField(term149358, term149358.getClass(), "firstDataVersion", null);
        setField(term149358, term149358.getClass(), "firstPlayDate", null);
        setField(term149358, term149358.getClass(), "lastGameId", null);
        setField(term149358, term149358.getClass(), "lastRomVersion", null);
        setField(term149358, term149358.getClass(), "lastDataVersion", null);
        setField(term149358, term149358.getClass(), "compatibleCmVersion", null);
        setField(term149358, term149358.getClass(), "lastPlayDate", null);
        setIntField(term149358, term149358.getClass(), "lastPlaceId", 0);
        setField(term149358, term149358.getClass(), "lastPlaceName", null);
        setIntField(term149358, term149358.getClass(), "lastRegionId", 0);
        setField(term149358, term149358.getClass(), "lastRegionName", null);
        setIntField(term149358, term149358.getClass(), "lastAllNetId", 0);
        setField(term149358, term149358.getClass(), "lastClientId", null);
        setIntField(term149358, term149358.getClass(), "lastUsedDeckId", 0);
        setIntField(term149358, term149358.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149358, term149358.getClass(), "lastEmoneyBrand", 0);
        term149402 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149402;
        callMethod(klass, "setSumTechMasterHighScore", argTypes, term149358, args);
    }

};


