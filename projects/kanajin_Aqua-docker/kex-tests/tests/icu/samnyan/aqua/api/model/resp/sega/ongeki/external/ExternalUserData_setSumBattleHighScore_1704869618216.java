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

public class ExternalUserData_setSumBattleHighScore_1704869618216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149450;
     Object term149494;

    public ExternalUserData_setSumBattleHighScore_1704869618216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149450 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149450, term149450.getClass(), "accessCode", null);
        setField(term149450, term149450.getClass(), "userName", null);
        setIntField(term149450, term149450.getClass(), "level", 0);
        setIntField(term149450, term149450.getClass(), "reincarnationNum", 0);
        setLongField(term149450, term149450.getClass(), "exp", 0L);
        setLongField(term149450, term149450.getClass(), "point", 0L);
        setLongField(term149450, term149450.getClass(), "totalPoint", 0L);
        setIntField(term149450, term149450.getClass(), "playCount", 0);
        setIntField(term149450, term149450.getClass(), "jewelCount", 0);
        setIntField(term149450, term149450.getClass(), "totalJewelCount", 0);
        setIntField(term149450, term149450.getClass(), "medalCount", 0);
        setIntField(term149450, term149450.getClass(), "playerRating", 0);
        setIntField(term149450, term149450.getClass(), "highestRating", 0);
        setIntField(term149450, term149450.getClass(), "battlePoint", 0);
        setIntField(term149450, term149450.getClass(), "bestBattlePoint", 0);
        setIntField(term149450, term149450.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149450, term149450.getClass(), "nameplateId", 0);
        setIntField(term149450, term149450.getClass(), "trophyId", 0);
        setIntField(term149450, term149450.getClass(), "cardId", 0);
        setIntField(term149450, term149450.getClass(), "characterId", 0);
        setIntField(term149450, term149450.getClass(), "tabSetting", 0);
        setIntField(term149450, term149450.getClass(), "tabSortSetting", 0);
        setIntField(term149450, term149450.getClass(), "cardCategorySetting", 0);
        setIntField(term149450, term149450.getClass(), "cardSortSetting", 0);
        setIntField(term149450, term149450.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149450, term149450.getClass(), "playedTutorialBit", 0);
        setIntField(term149450, term149450.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149450, term149450.getClass(), "sumTechHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149450, term149450.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149450, term149450.getClass(), "eventWatchedDate", null);
        setField(term149450, term149450.getClass(), "cmEventWatchedDate", null);
        setField(term149450, term149450.getClass(), "firstGameId", null);
        setField(term149450, term149450.getClass(), "firstRomVersion", null);
        setField(term149450, term149450.getClass(), "firstDataVersion", null);
        setField(term149450, term149450.getClass(), "firstPlayDate", null);
        setField(term149450, term149450.getClass(), "lastGameId", null);
        setField(term149450, term149450.getClass(), "lastRomVersion", null);
        setField(term149450, term149450.getClass(), "lastDataVersion", null);
        setField(term149450, term149450.getClass(), "compatibleCmVersion", null);
        setField(term149450, term149450.getClass(), "lastPlayDate", null);
        setIntField(term149450, term149450.getClass(), "lastPlaceId", 0);
        setField(term149450, term149450.getClass(), "lastPlaceName", null);
        setIntField(term149450, term149450.getClass(), "lastRegionId", 0);
        setField(term149450, term149450.getClass(), "lastRegionName", null);
        setIntField(term149450, term149450.getClass(), "lastAllNetId", 0);
        setField(term149450, term149450.getClass(), "lastClientId", null);
        setIntField(term149450, term149450.getClass(), "lastUsedDeckId", 0);
        setIntField(term149450, term149450.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149450, term149450.getClass(), "lastEmoneyBrand", 0);
        term149494 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149494;
        callMethod(klass, "setSumBattleHighScore", argTypes, term149450, args);
    }

};


