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
import java.lang.Integer;

public class ExternalUserData_setTotalJewelCount_576395475192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148346;
     Object term148390;

    public ExternalUserData_setTotalJewelCount_576395475192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148346 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term148346, term148346.getClass(), "accessCode", null);
        setField(term148346, term148346.getClass(), "userName", null);
        setIntField(term148346, term148346.getClass(), "level", 0);
        setIntField(term148346, term148346.getClass(), "reincarnationNum", 0);
        setLongField(term148346, term148346.getClass(), "exp", 0L);
        setLongField(term148346, term148346.getClass(), "point", 0L);
        setLongField(term148346, term148346.getClass(), "totalPoint", 0L);
        setIntField(term148346, term148346.getClass(), "playCount", 0);
        setIntField(term148346, term148346.getClass(), "jewelCount", 0);
        setIntField(term148346, term148346.getClass(), "totalJewelCount", 0);
        setIntField(term148346, term148346.getClass(), "medalCount", 0);
        setIntField(term148346, term148346.getClass(), "playerRating", 0);
        setIntField(term148346, term148346.getClass(), "highestRating", 0);
        setIntField(term148346, term148346.getClass(), "battlePoint", 0);
        setIntField(term148346, term148346.getClass(), "bestBattlePoint", 0);
        setIntField(term148346, term148346.getClass(), "overDamageBattlePoint", 0);
        setIntField(term148346, term148346.getClass(), "nameplateId", 0);
        setIntField(term148346, term148346.getClass(), "trophyId", 0);
        setIntField(term148346, term148346.getClass(), "cardId", 0);
        setIntField(term148346, term148346.getClass(), "characterId", 0);
        setIntField(term148346, term148346.getClass(), "tabSetting", 0);
        setIntField(term148346, term148346.getClass(), "tabSortSetting", 0);
        setIntField(term148346, term148346.getClass(), "cardCategorySetting", 0);
        setIntField(term148346, term148346.getClass(), "cardSortSetting", 0);
        setIntField(term148346, term148346.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term148346, term148346.getClass(), "playedTutorialBit", 0);
        setIntField(term148346, term148346.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term148346, term148346.getClass(), "sumTechHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumBattleHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term148346, term148346.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term148346, term148346.getClass(), "eventWatchedDate", null);
        setField(term148346, term148346.getClass(), "cmEventWatchedDate", null);
        setField(term148346, term148346.getClass(), "firstGameId", null);
        setField(term148346, term148346.getClass(), "firstRomVersion", null);
        setField(term148346, term148346.getClass(), "firstDataVersion", null);
        setField(term148346, term148346.getClass(), "firstPlayDate", null);
        setField(term148346, term148346.getClass(), "lastGameId", null);
        setField(term148346, term148346.getClass(), "lastRomVersion", null);
        setField(term148346, term148346.getClass(), "lastDataVersion", null);
        setField(term148346, term148346.getClass(), "compatibleCmVersion", null);
        setField(term148346, term148346.getClass(), "lastPlayDate", null);
        setIntField(term148346, term148346.getClass(), "lastPlaceId", 0);
        setField(term148346, term148346.getClass(), "lastPlaceName", null);
        setIntField(term148346, term148346.getClass(), "lastRegionId", 0);
        setField(term148346, term148346.getClass(), "lastRegionName", null);
        setIntField(term148346, term148346.getClass(), "lastAllNetId", 0);
        setField(term148346, term148346.getClass(), "lastClientId", null);
        setIntField(term148346, term148346.getClass(), "lastUsedDeckId", 0);
        setIntField(term148346, term148346.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term148346, term148346.getClass(), "lastEmoneyBrand", 0);
        term148390 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148390;
        callMethod(klass, "setTotalJewelCount", argTypes, term148346, args);
    }

};


