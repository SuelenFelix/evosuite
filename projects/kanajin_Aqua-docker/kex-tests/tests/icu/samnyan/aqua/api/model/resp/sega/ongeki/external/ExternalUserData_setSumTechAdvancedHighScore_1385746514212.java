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

public class ExternalUserData_setSumTechAdvancedHighScore_1385746514212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149266;
     Object term149310;

    public ExternalUserData_setSumTechAdvancedHighScore_1385746514212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149266 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149266, term149266.getClass(), "accessCode", null);
        setField(term149266, term149266.getClass(), "userName", null);
        setIntField(term149266, term149266.getClass(), "level", 0);
        setIntField(term149266, term149266.getClass(), "reincarnationNum", 0);
        setLongField(term149266, term149266.getClass(), "exp", 0L);
        setLongField(term149266, term149266.getClass(), "point", 0L);
        setLongField(term149266, term149266.getClass(), "totalPoint", 0L);
        setIntField(term149266, term149266.getClass(), "playCount", 0);
        setIntField(term149266, term149266.getClass(), "jewelCount", 0);
        setIntField(term149266, term149266.getClass(), "totalJewelCount", 0);
        setIntField(term149266, term149266.getClass(), "medalCount", 0);
        setIntField(term149266, term149266.getClass(), "playerRating", 0);
        setIntField(term149266, term149266.getClass(), "highestRating", 0);
        setIntField(term149266, term149266.getClass(), "battlePoint", 0);
        setIntField(term149266, term149266.getClass(), "bestBattlePoint", 0);
        setIntField(term149266, term149266.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149266, term149266.getClass(), "nameplateId", 0);
        setIntField(term149266, term149266.getClass(), "trophyId", 0);
        setIntField(term149266, term149266.getClass(), "cardId", 0);
        setIntField(term149266, term149266.getClass(), "characterId", 0);
        setIntField(term149266, term149266.getClass(), "tabSetting", 0);
        setIntField(term149266, term149266.getClass(), "tabSortSetting", 0);
        setIntField(term149266, term149266.getClass(), "cardCategorySetting", 0);
        setIntField(term149266, term149266.getClass(), "cardSortSetting", 0);
        setIntField(term149266, term149266.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149266, term149266.getClass(), "playedTutorialBit", 0);
        setIntField(term149266, term149266.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149266, term149266.getClass(), "sumTechHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149266, term149266.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149266, term149266.getClass(), "eventWatchedDate", null);
        setField(term149266, term149266.getClass(), "cmEventWatchedDate", null);
        setField(term149266, term149266.getClass(), "firstGameId", null);
        setField(term149266, term149266.getClass(), "firstRomVersion", null);
        setField(term149266, term149266.getClass(), "firstDataVersion", null);
        setField(term149266, term149266.getClass(), "firstPlayDate", null);
        setField(term149266, term149266.getClass(), "lastGameId", null);
        setField(term149266, term149266.getClass(), "lastRomVersion", null);
        setField(term149266, term149266.getClass(), "lastDataVersion", null);
        setField(term149266, term149266.getClass(), "compatibleCmVersion", null);
        setField(term149266, term149266.getClass(), "lastPlayDate", null);
        setIntField(term149266, term149266.getClass(), "lastPlaceId", 0);
        setField(term149266, term149266.getClass(), "lastPlaceName", null);
        setIntField(term149266, term149266.getClass(), "lastRegionId", 0);
        setField(term149266, term149266.getClass(), "lastRegionName", null);
        setIntField(term149266, term149266.getClass(), "lastAllNetId", 0);
        setField(term149266, term149266.getClass(), "lastClientId", null);
        setIntField(term149266, term149266.getClass(), "lastUsedDeckId", 0);
        setIntField(term149266, term149266.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149266, term149266.getClass(), "lastEmoneyBrand", 0);
        term149310 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149310;
        callMethod(klass, "setSumTechAdvancedHighScore", argTypes, term149266, args);
    }

};


