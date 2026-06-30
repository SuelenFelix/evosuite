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

public class ExternalUserData_setLastDataVersion_1078228144230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150078;

    public ExternalUserData_setLastDataVersion_1078228144230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150078 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150078, term150078.getClass(), "accessCode", null);
        setField(term150078, term150078.getClass(), "userName", null);
        setIntField(term150078, term150078.getClass(), "level", 0);
        setIntField(term150078, term150078.getClass(), "reincarnationNum", 0);
        setLongField(term150078, term150078.getClass(), "exp", 0L);
        setLongField(term150078, term150078.getClass(), "point", 0L);
        setLongField(term150078, term150078.getClass(), "totalPoint", 0L);
        setIntField(term150078, term150078.getClass(), "playCount", 0);
        setIntField(term150078, term150078.getClass(), "jewelCount", 0);
        setIntField(term150078, term150078.getClass(), "totalJewelCount", 0);
        setIntField(term150078, term150078.getClass(), "medalCount", 0);
        setIntField(term150078, term150078.getClass(), "playerRating", 0);
        setIntField(term150078, term150078.getClass(), "highestRating", 0);
        setIntField(term150078, term150078.getClass(), "battlePoint", 0);
        setIntField(term150078, term150078.getClass(), "bestBattlePoint", 0);
        setIntField(term150078, term150078.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150078, term150078.getClass(), "nameplateId", 0);
        setIntField(term150078, term150078.getClass(), "trophyId", 0);
        setIntField(term150078, term150078.getClass(), "cardId", 0);
        setIntField(term150078, term150078.getClass(), "characterId", 0);
        setIntField(term150078, term150078.getClass(), "tabSetting", 0);
        setIntField(term150078, term150078.getClass(), "tabSortSetting", 0);
        setIntField(term150078, term150078.getClass(), "cardCategorySetting", 0);
        setIntField(term150078, term150078.getClass(), "cardSortSetting", 0);
        setIntField(term150078, term150078.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150078, term150078.getClass(), "playedTutorialBit", 0);
        setIntField(term150078, term150078.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150078, term150078.getClass(), "sumTechHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150078, term150078.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150078, term150078.getClass(), "eventWatchedDate", null);
        setField(term150078, term150078.getClass(), "cmEventWatchedDate", null);
        setField(term150078, term150078.getClass(), "firstGameId", null);
        setField(term150078, term150078.getClass(), "firstRomVersion", null);
        setField(term150078, term150078.getClass(), "firstDataVersion", null);
        setField(term150078, term150078.getClass(), "firstPlayDate", null);
        setField(term150078, term150078.getClass(), "lastGameId", null);
        setField(term150078, term150078.getClass(), "lastRomVersion", null);
        setField(term150078, term150078.getClass(), "lastDataVersion", null);
        setField(term150078, term150078.getClass(), "compatibleCmVersion", null);
        setField(term150078, term150078.getClass(), "lastPlayDate", null);
        setIntField(term150078, term150078.getClass(), "lastPlaceId", 0);
        setField(term150078, term150078.getClass(), "lastPlaceName", null);
        setIntField(term150078, term150078.getClass(), "lastRegionId", 0);
        setField(term150078, term150078.getClass(), "lastRegionName", null);
        setIntField(term150078, term150078.getClass(), "lastAllNetId", 0);
        setField(term150078, term150078.getClass(), "lastClientId", null);
        setIntField(term150078, term150078.getClass(), "lastUsedDeckId", 0);
        setIntField(term150078, term150078.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150078, term150078.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastDataVersion", argTypes, term150078, args);
    }

};


