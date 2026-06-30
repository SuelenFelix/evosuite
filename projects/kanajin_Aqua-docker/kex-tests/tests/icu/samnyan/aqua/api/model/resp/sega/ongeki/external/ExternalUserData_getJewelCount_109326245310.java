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

public class ExternalUserData_getJewelCount_109326245310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3168536;

    public ExternalUserData_getJewelCount_109326245310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3168536 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3168536, term3168536.getClass(), "accessCode", null);
        setField(term3168536, term3168536.getClass(), "userName", null);
        setIntField(term3168536, term3168536.getClass(), "level", 0);
        setIntField(term3168536, term3168536.getClass(), "reincarnationNum", 0);
        setLongField(term3168536, term3168536.getClass(), "exp", 0L);
        setLongField(term3168536, term3168536.getClass(), "point", 0L);
        setLongField(term3168536, term3168536.getClass(), "totalPoint", 0L);
        setIntField(term3168536, term3168536.getClass(), "playCount", 0);
        setIntField(term3168536, term3168536.getClass(), "jewelCount", 0);
        setIntField(term3168536, term3168536.getClass(), "totalJewelCount", 0);
        setIntField(term3168536, term3168536.getClass(), "medalCount", 0);
        setIntField(term3168536, term3168536.getClass(), "playerRating", 0);
        setIntField(term3168536, term3168536.getClass(), "highestRating", 0);
        setIntField(term3168536, term3168536.getClass(), "battlePoint", 0);
        setIntField(term3168536, term3168536.getClass(), "bestBattlePoint", 0);
        setIntField(term3168536, term3168536.getClass(), "overDamageBattlePoint", 0);
        setIntField(term3168536, term3168536.getClass(), "nameplateId", 0);
        setIntField(term3168536, term3168536.getClass(), "trophyId", 0);
        setIntField(term3168536, term3168536.getClass(), "cardId", 0);
        setIntField(term3168536, term3168536.getClass(), "characterId", 0);
        setIntField(term3168536, term3168536.getClass(), "tabSetting", 0);
        setIntField(term3168536, term3168536.getClass(), "tabSortSetting", 0);
        setIntField(term3168536, term3168536.getClass(), "cardCategorySetting", 0);
        setIntField(term3168536, term3168536.getClass(), "cardSortSetting", 0);
        setIntField(term3168536, term3168536.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term3168536, term3168536.getClass(), "playedTutorialBit", 0);
        setIntField(term3168536, term3168536.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term3168536, term3168536.getClass(), "sumTechHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumBattleHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term3168536, term3168536.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term3168536, term3168536.getClass(), "eventWatchedDate", null);
        setField(term3168536, term3168536.getClass(), "cmEventWatchedDate", null);
        setField(term3168536, term3168536.getClass(), "firstGameId", null);
        setField(term3168536, term3168536.getClass(), "firstRomVersion", null);
        setField(term3168536, term3168536.getClass(), "firstDataVersion", null);
        setField(term3168536, term3168536.getClass(), "firstPlayDate", null);
        setField(term3168536, term3168536.getClass(), "lastGameId", null);
        setField(term3168536, term3168536.getClass(), "lastRomVersion", null);
        setField(term3168536, term3168536.getClass(), "lastDataVersion", null);
        setField(term3168536, term3168536.getClass(), "compatibleCmVersion", null);
        setField(term3168536, term3168536.getClass(), "lastPlayDate", null);
        setIntField(term3168536, term3168536.getClass(), "lastPlaceId", 0);
        setField(term3168536, term3168536.getClass(), "lastPlaceName", null);
        setIntField(term3168536, term3168536.getClass(), "lastRegionId", 0);
        setField(term3168536, term3168536.getClass(), "lastRegionName", null);
        setIntField(term3168536, term3168536.getClass(), "lastAllNetId", 0);
        setField(term3168536, term3168536.getClass(), "lastClientId", null);
        setIntField(term3168536, term3168536.getClass(), "lastUsedDeckId", 0);
        setIntField(term3168536, term3168536.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term3168536, term3168536.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term3168536, args);
    }

};


