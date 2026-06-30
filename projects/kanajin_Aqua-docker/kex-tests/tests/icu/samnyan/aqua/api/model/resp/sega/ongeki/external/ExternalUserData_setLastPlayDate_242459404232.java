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

public class ExternalUserData_setLastPlayDate_242459404232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150166;

    public ExternalUserData_setLastPlayDate_242459404232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150166 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150166, term150166.getClass(), "accessCode", null);
        setField(term150166, term150166.getClass(), "userName", null);
        setIntField(term150166, term150166.getClass(), "level", 0);
        setIntField(term150166, term150166.getClass(), "reincarnationNum", 0);
        setLongField(term150166, term150166.getClass(), "exp", 0L);
        setLongField(term150166, term150166.getClass(), "point", 0L);
        setLongField(term150166, term150166.getClass(), "totalPoint", 0L);
        setIntField(term150166, term150166.getClass(), "playCount", 0);
        setIntField(term150166, term150166.getClass(), "jewelCount", 0);
        setIntField(term150166, term150166.getClass(), "totalJewelCount", 0);
        setIntField(term150166, term150166.getClass(), "medalCount", 0);
        setIntField(term150166, term150166.getClass(), "playerRating", 0);
        setIntField(term150166, term150166.getClass(), "highestRating", 0);
        setIntField(term150166, term150166.getClass(), "battlePoint", 0);
        setIntField(term150166, term150166.getClass(), "bestBattlePoint", 0);
        setIntField(term150166, term150166.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150166, term150166.getClass(), "nameplateId", 0);
        setIntField(term150166, term150166.getClass(), "trophyId", 0);
        setIntField(term150166, term150166.getClass(), "cardId", 0);
        setIntField(term150166, term150166.getClass(), "characterId", 0);
        setIntField(term150166, term150166.getClass(), "tabSetting", 0);
        setIntField(term150166, term150166.getClass(), "tabSortSetting", 0);
        setIntField(term150166, term150166.getClass(), "cardCategorySetting", 0);
        setIntField(term150166, term150166.getClass(), "cardSortSetting", 0);
        setIntField(term150166, term150166.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150166, term150166.getClass(), "playedTutorialBit", 0);
        setIntField(term150166, term150166.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150166, term150166.getClass(), "sumTechHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150166, term150166.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150166, term150166.getClass(), "eventWatchedDate", null);
        setField(term150166, term150166.getClass(), "cmEventWatchedDate", null);
        setField(term150166, term150166.getClass(), "firstGameId", null);
        setField(term150166, term150166.getClass(), "firstRomVersion", null);
        setField(term150166, term150166.getClass(), "firstDataVersion", null);
        setField(term150166, term150166.getClass(), "firstPlayDate", null);
        setField(term150166, term150166.getClass(), "lastGameId", null);
        setField(term150166, term150166.getClass(), "lastRomVersion", null);
        setField(term150166, term150166.getClass(), "lastDataVersion", null);
        setField(term150166, term150166.getClass(), "compatibleCmVersion", null);
        setField(term150166, term150166.getClass(), "lastPlayDate", null);
        setIntField(term150166, term150166.getClass(), "lastPlaceId", 0);
        setField(term150166, term150166.getClass(), "lastPlaceName", null);
        setIntField(term150166, term150166.getClass(), "lastRegionId", 0);
        setField(term150166, term150166.getClass(), "lastRegionName", null);
        setIntField(term150166, term150166.getClass(), "lastAllNetId", 0);
        setField(term150166, term150166.getClass(), "lastClientId", null);
        setIntField(term150166, term150166.getClass(), "lastUsedDeckId", 0);
        setIntField(term150166, term150166.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150166, term150166.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term150166, args);
    }

};


