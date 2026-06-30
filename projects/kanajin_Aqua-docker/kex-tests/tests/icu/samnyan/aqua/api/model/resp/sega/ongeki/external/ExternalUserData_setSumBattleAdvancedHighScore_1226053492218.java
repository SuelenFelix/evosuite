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

public class ExternalUserData_setSumBattleAdvancedHighScore_1226053492218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149542;
     Object term149586;

    public ExternalUserData_setSumBattleAdvancedHighScore_1226053492218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149542 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149542, term149542.getClass(), "accessCode", null);
        setField(term149542, term149542.getClass(), "userName", null);
        setIntField(term149542, term149542.getClass(), "level", 0);
        setIntField(term149542, term149542.getClass(), "reincarnationNum", 0);
        setLongField(term149542, term149542.getClass(), "exp", 0L);
        setLongField(term149542, term149542.getClass(), "point", 0L);
        setLongField(term149542, term149542.getClass(), "totalPoint", 0L);
        setIntField(term149542, term149542.getClass(), "playCount", 0);
        setIntField(term149542, term149542.getClass(), "jewelCount", 0);
        setIntField(term149542, term149542.getClass(), "totalJewelCount", 0);
        setIntField(term149542, term149542.getClass(), "medalCount", 0);
        setIntField(term149542, term149542.getClass(), "playerRating", 0);
        setIntField(term149542, term149542.getClass(), "highestRating", 0);
        setIntField(term149542, term149542.getClass(), "battlePoint", 0);
        setIntField(term149542, term149542.getClass(), "bestBattlePoint", 0);
        setIntField(term149542, term149542.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149542, term149542.getClass(), "nameplateId", 0);
        setIntField(term149542, term149542.getClass(), "trophyId", 0);
        setIntField(term149542, term149542.getClass(), "cardId", 0);
        setIntField(term149542, term149542.getClass(), "characterId", 0);
        setIntField(term149542, term149542.getClass(), "tabSetting", 0);
        setIntField(term149542, term149542.getClass(), "tabSortSetting", 0);
        setIntField(term149542, term149542.getClass(), "cardCategorySetting", 0);
        setIntField(term149542, term149542.getClass(), "cardSortSetting", 0);
        setIntField(term149542, term149542.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149542, term149542.getClass(), "playedTutorialBit", 0);
        setIntField(term149542, term149542.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149542, term149542.getClass(), "sumTechHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149542, term149542.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149542, term149542.getClass(), "eventWatchedDate", null);
        setField(term149542, term149542.getClass(), "cmEventWatchedDate", null);
        setField(term149542, term149542.getClass(), "firstGameId", null);
        setField(term149542, term149542.getClass(), "firstRomVersion", null);
        setField(term149542, term149542.getClass(), "firstDataVersion", null);
        setField(term149542, term149542.getClass(), "firstPlayDate", null);
        setField(term149542, term149542.getClass(), "lastGameId", null);
        setField(term149542, term149542.getClass(), "lastRomVersion", null);
        setField(term149542, term149542.getClass(), "lastDataVersion", null);
        setField(term149542, term149542.getClass(), "compatibleCmVersion", null);
        setField(term149542, term149542.getClass(), "lastPlayDate", null);
        setIntField(term149542, term149542.getClass(), "lastPlaceId", 0);
        setField(term149542, term149542.getClass(), "lastPlaceName", null);
        setIntField(term149542, term149542.getClass(), "lastRegionId", 0);
        setField(term149542, term149542.getClass(), "lastRegionName", null);
        setIntField(term149542, term149542.getClass(), "lastAllNetId", 0);
        setField(term149542, term149542.getClass(), "lastClientId", null);
        setIntField(term149542, term149542.getClass(), "lastUsedDeckId", 0);
        setIntField(term149542, term149542.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149542, term149542.getClass(), "lastEmoneyBrand", 0);
        term149586 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149586;
        callMethod(klass, "setSumBattleAdvancedHighScore", argTypes, term149542, args);
    }

};


