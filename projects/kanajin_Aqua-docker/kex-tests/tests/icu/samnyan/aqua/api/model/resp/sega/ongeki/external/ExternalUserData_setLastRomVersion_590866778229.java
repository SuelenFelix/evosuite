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

public class ExternalUserData_setLastRomVersion_590866778229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150034;

    public ExternalUserData_setLastRomVersion_590866778229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150034 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150034, term150034.getClass(), "accessCode", null);
        setField(term150034, term150034.getClass(), "userName", null);
        setIntField(term150034, term150034.getClass(), "level", 0);
        setIntField(term150034, term150034.getClass(), "reincarnationNum", 0);
        setLongField(term150034, term150034.getClass(), "exp", 0L);
        setLongField(term150034, term150034.getClass(), "point", 0L);
        setLongField(term150034, term150034.getClass(), "totalPoint", 0L);
        setIntField(term150034, term150034.getClass(), "playCount", 0);
        setIntField(term150034, term150034.getClass(), "jewelCount", 0);
        setIntField(term150034, term150034.getClass(), "totalJewelCount", 0);
        setIntField(term150034, term150034.getClass(), "medalCount", 0);
        setIntField(term150034, term150034.getClass(), "playerRating", 0);
        setIntField(term150034, term150034.getClass(), "highestRating", 0);
        setIntField(term150034, term150034.getClass(), "battlePoint", 0);
        setIntField(term150034, term150034.getClass(), "bestBattlePoint", 0);
        setIntField(term150034, term150034.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150034, term150034.getClass(), "nameplateId", 0);
        setIntField(term150034, term150034.getClass(), "trophyId", 0);
        setIntField(term150034, term150034.getClass(), "cardId", 0);
        setIntField(term150034, term150034.getClass(), "characterId", 0);
        setIntField(term150034, term150034.getClass(), "tabSetting", 0);
        setIntField(term150034, term150034.getClass(), "tabSortSetting", 0);
        setIntField(term150034, term150034.getClass(), "cardCategorySetting", 0);
        setIntField(term150034, term150034.getClass(), "cardSortSetting", 0);
        setIntField(term150034, term150034.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150034, term150034.getClass(), "playedTutorialBit", 0);
        setIntField(term150034, term150034.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150034, term150034.getClass(), "sumTechHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150034, term150034.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150034, term150034.getClass(), "eventWatchedDate", null);
        setField(term150034, term150034.getClass(), "cmEventWatchedDate", null);
        setField(term150034, term150034.getClass(), "firstGameId", null);
        setField(term150034, term150034.getClass(), "firstRomVersion", null);
        setField(term150034, term150034.getClass(), "firstDataVersion", null);
        setField(term150034, term150034.getClass(), "firstPlayDate", null);
        setField(term150034, term150034.getClass(), "lastGameId", null);
        setField(term150034, term150034.getClass(), "lastRomVersion", null);
        setField(term150034, term150034.getClass(), "lastDataVersion", null);
        setField(term150034, term150034.getClass(), "compatibleCmVersion", null);
        setField(term150034, term150034.getClass(), "lastPlayDate", null);
        setIntField(term150034, term150034.getClass(), "lastPlaceId", 0);
        setField(term150034, term150034.getClass(), "lastPlaceName", null);
        setIntField(term150034, term150034.getClass(), "lastRegionId", 0);
        setField(term150034, term150034.getClass(), "lastRegionName", null);
        setIntField(term150034, term150034.getClass(), "lastAllNetId", 0);
        setField(term150034, term150034.getClass(), "lastClientId", null);
        setIntField(term150034, term150034.getClass(), "lastUsedDeckId", 0);
        setIntField(term150034, term150034.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150034, term150034.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRomVersion", argTypes, term150034, args);
    }

};


