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

public class ExternalUserData_setSumTechHighScore_1923134928210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149174;
     Object term149218;

    public ExternalUserData_setSumTechHighScore_1923134928210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149174 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149174, term149174.getClass(), "accessCode", null);
        setField(term149174, term149174.getClass(), "userName", null);
        setIntField(term149174, term149174.getClass(), "level", 0);
        setIntField(term149174, term149174.getClass(), "reincarnationNum", 0);
        setLongField(term149174, term149174.getClass(), "exp", 0L);
        setLongField(term149174, term149174.getClass(), "point", 0L);
        setLongField(term149174, term149174.getClass(), "totalPoint", 0L);
        setIntField(term149174, term149174.getClass(), "playCount", 0);
        setIntField(term149174, term149174.getClass(), "jewelCount", 0);
        setIntField(term149174, term149174.getClass(), "totalJewelCount", 0);
        setIntField(term149174, term149174.getClass(), "medalCount", 0);
        setIntField(term149174, term149174.getClass(), "playerRating", 0);
        setIntField(term149174, term149174.getClass(), "highestRating", 0);
        setIntField(term149174, term149174.getClass(), "battlePoint", 0);
        setIntField(term149174, term149174.getClass(), "bestBattlePoint", 0);
        setIntField(term149174, term149174.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149174, term149174.getClass(), "nameplateId", 0);
        setIntField(term149174, term149174.getClass(), "trophyId", 0);
        setIntField(term149174, term149174.getClass(), "cardId", 0);
        setIntField(term149174, term149174.getClass(), "characterId", 0);
        setIntField(term149174, term149174.getClass(), "tabSetting", 0);
        setIntField(term149174, term149174.getClass(), "tabSortSetting", 0);
        setIntField(term149174, term149174.getClass(), "cardCategorySetting", 0);
        setIntField(term149174, term149174.getClass(), "cardSortSetting", 0);
        setIntField(term149174, term149174.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149174, term149174.getClass(), "playedTutorialBit", 0);
        setIntField(term149174, term149174.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149174, term149174.getClass(), "sumTechHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149174, term149174.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149174, term149174.getClass(), "eventWatchedDate", null);
        setField(term149174, term149174.getClass(), "cmEventWatchedDate", null);
        setField(term149174, term149174.getClass(), "firstGameId", null);
        setField(term149174, term149174.getClass(), "firstRomVersion", null);
        setField(term149174, term149174.getClass(), "firstDataVersion", null);
        setField(term149174, term149174.getClass(), "firstPlayDate", null);
        setField(term149174, term149174.getClass(), "lastGameId", null);
        setField(term149174, term149174.getClass(), "lastRomVersion", null);
        setField(term149174, term149174.getClass(), "lastDataVersion", null);
        setField(term149174, term149174.getClass(), "compatibleCmVersion", null);
        setField(term149174, term149174.getClass(), "lastPlayDate", null);
        setIntField(term149174, term149174.getClass(), "lastPlaceId", 0);
        setField(term149174, term149174.getClass(), "lastPlaceName", null);
        setIntField(term149174, term149174.getClass(), "lastRegionId", 0);
        setField(term149174, term149174.getClass(), "lastRegionName", null);
        setIntField(term149174, term149174.getClass(), "lastAllNetId", 0);
        setField(term149174, term149174.getClass(), "lastClientId", null);
        setIntField(term149174, term149174.getClass(), "lastUsedDeckId", 0);
        setIntField(term149174, term149174.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149174, term149174.getClass(), "lastEmoneyBrand", 0);
        term149218 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term149218;
        callMethod(klass, "setSumTechHighScore", argTypes, term149174, args);
    }

};


