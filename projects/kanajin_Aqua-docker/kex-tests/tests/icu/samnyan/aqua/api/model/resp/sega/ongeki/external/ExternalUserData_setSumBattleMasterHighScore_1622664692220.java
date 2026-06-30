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

public class ExternalUserData_setSumBattleMasterHighScore_1622664692220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149634;
     Object term149678;

    public ExternalUserData_setSumBattleMasterHighScore_1622664692220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149634 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149634, term149634.getClass(), "accessCode", null);
        setField(term149634, term149634.getClass(), "userName", null);
        setIntField(term149634, term149634.getClass(), "level", 0);
        setIntField(term149634, term149634.getClass(), "reincarnationNum", 0);
        setLongField(term149634, term149634.getClass(), "exp", 0L);
        setLongField(term149634, term149634.getClass(), "point", 0L);
        setLongField(term149634, term149634.getClass(), "totalPoint", 0L);
        setIntField(term149634, term149634.getClass(), "playCount", 0);
        setIntField(term149634, term149634.getClass(), "jewelCount", 0);
        setIntField(term149634, term149634.getClass(), "totalJewelCount", 0);
        setIntField(term149634, term149634.getClass(), "medalCount", 0);
        setIntField(term149634, term149634.getClass(), "playerRating", 0);
        setIntField(term149634, term149634.getClass(), "highestRating", 0);
        setIntField(term149634, term149634.getClass(), "battlePoint", 0);
        setIntField(term149634, term149634.getClass(), "bestBattlePoint", 0);
        setIntField(term149634, term149634.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149634, term149634.getClass(), "nameplateId", 0);
        setIntField(term149634, term149634.getClass(), "trophyId", 0);
        setIntField(term149634, term149634.getClass(), "cardId", 0);
        setIntField(term149634, term149634.getClass(), "characterId", 0);
        setIntField(term149634, term149634.getClass(), "tabSetting", 0);
        setIntField(term149634, term149634.getClass(), "tabSortSetting", 0);
        setIntField(term149634, term149634.getClass(), "cardCategorySetting", 0);
        setIntField(term149634, term149634.getClass(), "cardSortSetting", 0);
        setIntField(term149634, term149634.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149634, term149634.getClass(), "playedTutorialBit", 0);
        setIntField(term149634, term149634.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149634, term149634.getClass(), "sumTechHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149634, term149634.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149634, term149634.getClass(), "eventWatchedDate", null);
        setField(term149634, term149634.getClass(), "cmEventWatchedDate", null);
        setField(term149634, term149634.getClass(), "firstGameId", null);
        setField(term149634, term149634.getClass(), "firstRomVersion", null);
        setField(term149634, term149634.getClass(), "firstDataVersion", null);
        setField(term149634, term149634.getClass(), "firstPlayDate", null);
        setField(term149634, term149634.getClass(), "lastGameId", null);
        setField(term149634, term149634.getClass(), "lastRomVersion", null);
        setField(term149634, term149634.getClass(), "lastDataVersion", null);
        setField(term149634, term149634.getClass(), "compatibleCmVersion", null);
        setField(term149634, term149634.getClass(), "lastPlayDate", null);
        setIntField(term149634, term149634.getClass(), "lastPlaceId", 0);
        setField(term149634, term149634.getClass(), "lastPlaceName", null);
        setIntField(term149634, term149634.getClass(), "lastRegionId", 0);
        setField(term149634, term149634.getClass(), "lastRegionName", null);
        setIntField(term149634, term149634.getClass(), "lastAllNetId", 0);
        setField(term149634, term149634.getClass(), "lastClientId", null);
        setIntField(term149634, term149634.getClass(), "lastUsedDeckId", 0);
        setIntField(term149634, term149634.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149634, term149634.getClass(), "lastEmoneyBrand", 0);
        term149678 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149678;
        callMethod(klass, "setSumBattleMasterHighScore", argTypes, term149634, args);
    }

};


