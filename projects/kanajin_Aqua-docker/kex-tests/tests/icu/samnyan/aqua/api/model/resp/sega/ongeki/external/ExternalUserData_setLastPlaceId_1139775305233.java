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

public class ExternalUserData_setLastPlaceId_1139775305233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150210;
     Object term150254;

    public ExternalUserData_setLastPlaceId_1139775305233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150210 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150210, term150210.getClass(), "accessCode", null);
        setField(term150210, term150210.getClass(), "userName", null);
        setIntField(term150210, term150210.getClass(), "level", 0);
        setIntField(term150210, term150210.getClass(), "reincarnationNum", 0);
        setLongField(term150210, term150210.getClass(), "exp", 0L);
        setLongField(term150210, term150210.getClass(), "point", 0L);
        setLongField(term150210, term150210.getClass(), "totalPoint", 0L);
        setIntField(term150210, term150210.getClass(), "playCount", 0);
        setIntField(term150210, term150210.getClass(), "jewelCount", 0);
        setIntField(term150210, term150210.getClass(), "totalJewelCount", 0);
        setIntField(term150210, term150210.getClass(), "medalCount", 0);
        setIntField(term150210, term150210.getClass(), "playerRating", 0);
        setIntField(term150210, term150210.getClass(), "highestRating", 0);
        setIntField(term150210, term150210.getClass(), "battlePoint", 0);
        setIntField(term150210, term150210.getClass(), "bestBattlePoint", 0);
        setIntField(term150210, term150210.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150210, term150210.getClass(), "nameplateId", 0);
        setIntField(term150210, term150210.getClass(), "trophyId", 0);
        setIntField(term150210, term150210.getClass(), "cardId", 0);
        setIntField(term150210, term150210.getClass(), "characterId", 0);
        setIntField(term150210, term150210.getClass(), "tabSetting", 0);
        setIntField(term150210, term150210.getClass(), "tabSortSetting", 0);
        setIntField(term150210, term150210.getClass(), "cardCategorySetting", 0);
        setIntField(term150210, term150210.getClass(), "cardSortSetting", 0);
        setIntField(term150210, term150210.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150210, term150210.getClass(), "playedTutorialBit", 0);
        setIntField(term150210, term150210.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150210, term150210.getClass(), "sumTechHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150210, term150210.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150210, term150210.getClass(), "eventWatchedDate", null);
        setField(term150210, term150210.getClass(), "cmEventWatchedDate", null);
        setField(term150210, term150210.getClass(), "firstGameId", null);
        setField(term150210, term150210.getClass(), "firstRomVersion", null);
        setField(term150210, term150210.getClass(), "firstDataVersion", null);
        setField(term150210, term150210.getClass(), "firstPlayDate", null);
        setField(term150210, term150210.getClass(), "lastGameId", null);
        setField(term150210, term150210.getClass(), "lastRomVersion", null);
        setField(term150210, term150210.getClass(), "lastDataVersion", null);
        setField(term150210, term150210.getClass(), "compatibleCmVersion", null);
        setField(term150210, term150210.getClass(), "lastPlayDate", null);
        setIntField(term150210, term150210.getClass(), "lastPlaceId", 0);
        setField(term150210, term150210.getClass(), "lastPlaceName", null);
        setIntField(term150210, term150210.getClass(), "lastRegionId", 0);
        setField(term150210, term150210.getClass(), "lastRegionName", null);
        setIntField(term150210, term150210.getClass(), "lastAllNetId", 0);
        setField(term150210, term150210.getClass(), "lastClientId", null);
        setIntField(term150210, term150210.getClass(), "lastUsedDeckId", 0);
        setIntField(term150210, term150210.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150210, term150210.getClass(), "lastEmoneyBrand", 0);
        term150254 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150254;
        callMethod(klass, "setLastPlaceId", argTypes, term150210, args);
    }

};


