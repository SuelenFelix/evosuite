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

public class ExternalUserData_setLastRegionId_1077595686235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150300;
     Object term150344;

    public ExternalUserData_setLastRegionId_1077595686235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150300 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150300, term150300.getClass(), "accessCode", null);
        setField(term150300, term150300.getClass(), "userName", null);
        setIntField(term150300, term150300.getClass(), "level", 0);
        setIntField(term150300, term150300.getClass(), "reincarnationNum", 0);
        setLongField(term150300, term150300.getClass(), "exp", 0L);
        setLongField(term150300, term150300.getClass(), "point", 0L);
        setLongField(term150300, term150300.getClass(), "totalPoint", 0L);
        setIntField(term150300, term150300.getClass(), "playCount", 0);
        setIntField(term150300, term150300.getClass(), "jewelCount", 0);
        setIntField(term150300, term150300.getClass(), "totalJewelCount", 0);
        setIntField(term150300, term150300.getClass(), "medalCount", 0);
        setIntField(term150300, term150300.getClass(), "playerRating", 0);
        setIntField(term150300, term150300.getClass(), "highestRating", 0);
        setIntField(term150300, term150300.getClass(), "battlePoint", 0);
        setIntField(term150300, term150300.getClass(), "bestBattlePoint", 0);
        setIntField(term150300, term150300.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150300, term150300.getClass(), "nameplateId", 0);
        setIntField(term150300, term150300.getClass(), "trophyId", 0);
        setIntField(term150300, term150300.getClass(), "cardId", 0);
        setIntField(term150300, term150300.getClass(), "characterId", 0);
        setIntField(term150300, term150300.getClass(), "tabSetting", 0);
        setIntField(term150300, term150300.getClass(), "tabSortSetting", 0);
        setIntField(term150300, term150300.getClass(), "cardCategorySetting", 0);
        setIntField(term150300, term150300.getClass(), "cardSortSetting", 0);
        setIntField(term150300, term150300.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150300, term150300.getClass(), "playedTutorialBit", 0);
        setIntField(term150300, term150300.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150300, term150300.getClass(), "sumTechHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150300, term150300.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150300, term150300.getClass(), "eventWatchedDate", null);
        setField(term150300, term150300.getClass(), "cmEventWatchedDate", null);
        setField(term150300, term150300.getClass(), "firstGameId", null);
        setField(term150300, term150300.getClass(), "firstRomVersion", null);
        setField(term150300, term150300.getClass(), "firstDataVersion", null);
        setField(term150300, term150300.getClass(), "firstPlayDate", null);
        setField(term150300, term150300.getClass(), "lastGameId", null);
        setField(term150300, term150300.getClass(), "lastRomVersion", null);
        setField(term150300, term150300.getClass(), "lastDataVersion", null);
        setField(term150300, term150300.getClass(), "compatibleCmVersion", null);
        setField(term150300, term150300.getClass(), "lastPlayDate", null);
        setIntField(term150300, term150300.getClass(), "lastPlaceId", 0);
        setField(term150300, term150300.getClass(), "lastPlaceName", null);
        setIntField(term150300, term150300.getClass(), "lastRegionId", 0);
        setField(term150300, term150300.getClass(), "lastRegionName", null);
        setIntField(term150300, term150300.getClass(), "lastAllNetId", 0);
        setField(term150300, term150300.getClass(), "lastClientId", null);
        setIntField(term150300, term150300.getClass(), "lastUsedDeckId", 0);
        setIntField(term150300, term150300.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150300, term150300.getClass(), "lastEmoneyBrand", 0);
        term150344 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150344;
        callMethod(klass, "setLastRegionId", argTypes, term150300, args);
    }

};


