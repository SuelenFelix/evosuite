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

public class ExternalUserData_setCompatibleCmVersion_2052573422231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150122;

    public ExternalUserData_setCompatibleCmVersion_2052573422231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150122 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150122, term150122.getClass(), "accessCode", null);
        setField(term150122, term150122.getClass(), "userName", null);
        setIntField(term150122, term150122.getClass(), "level", 0);
        setIntField(term150122, term150122.getClass(), "reincarnationNum", 0);
        setLongField(term150122, term150122.getClass(), "exp", 0L);
        setLongField(term150122, term150122.getClass(), "point", 0L);
        setLongField(term150122, term150122.getClass(), "totalPoint", 0L);
        setIntField(term150122, term150122.getClass(), "playCount", 0);
        setIntField(term150122, term150122.getClass(), "jewelCount", 0);
        setIntField(term150122, term150122.getClass(), "totalJewelCount", 0);
        setIntField(term150122, term150122.getClass(), "medalCount", 0);
        setIntField(term150122, term150122.getClass(), "playerRating", 0);
        setIntField(term150122, term150122.getClass(), "highestRating", 0);
        setIntField(term150122, term150122.getClass(), "battlePoint", 0);
        setIntField(term150122, term150122.getClass(), "bestBattlePoint", 0);
        setIntField(term150122, term150122.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150122, term150122.getClass(), "nameplateId", 0);
        setIntField(term150122, term150122.getClass(), "trophyId", 0);
        setIntField(term150122, term150122.getClass(), "cardId", 0);
        setIntField(term150122, term150122.getClass(), "characterId", 0);
        setIntField(term150122, term150122.getClass(), "tabSetting", 0);
        setIntField(term150122, term150122.getClass(), "tabSortSetting", 0);
        setIntField(term150122, term150122.getClass(), "cardCategorySetting", 0);
        setIntField(term150122, term150122.getClass(), "cardSortSetting", 0);
        setIntField(term150122, term150122.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150122, term150122.getClass(), "playedTutorialBit", 0);
        setIntField(term150122, term150122.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150122, term150122.getClass(), "sumTechHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150122, term150122.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150122, term150122.getClass(), "eventWatchedDate", null);
        setField(term150122, term150122.getClass(), "cmEventWatchedDate", null);
        setField(term150122, term150122.getClass(), "firstGameId", null);
        setField(term150122, term150122.getClass(), "firstRomVersion", null);
        setField(term150122, term150122.getClass(), "firstDataVersion", null);
        setField(term150122, term150122.getClass(), "firstPlayDate", null);
        setField(term150122, term150122.getClass(), "lastGameId", null);
        setField(term150122, term150122.getClass(), "lastRomVersion", null);
        setField(term150122, term150122.getClass(), "lastDataVersion", null);
        setField(term150122, term150122.getClass(), "compatibleCmVersion", null);
        setField(term150122, term150122.getClass(), "lastPlayDate", null);
        setIntField(term150122, term150122.getClass(), "lastPlaceId", 0);
        setField(term150122, term150122.getClass(), "lastPlaceName", null);
        setIntField(term150122, term150122.getClass(), "lastRegionId", 0);
        setField(term150122, term150122.getClass(), "lastRegionName", null);
        setIntField(term150122, term150122.getClass(), "lastAllNetId", 0);
        setField(term150122, term150122.getClass(), "lastClientId", null);
        setIntField(term150122, term150122.getClass(), "lastUsedDeckId", 0);
        setIntField(term150122, term150122.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150122, term150122.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCompatibleCmVersion", argTypes, term150122, args);
    }

};


