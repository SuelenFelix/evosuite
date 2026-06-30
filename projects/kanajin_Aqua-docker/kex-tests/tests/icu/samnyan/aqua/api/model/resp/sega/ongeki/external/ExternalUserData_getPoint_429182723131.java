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

public class ExternalUserData_getPoint_429182723131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3214426;

    public ExternalUserData_getPoint_429182723131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3214426 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3214426, term3214426.getClass(), "accessCode", null);
        setField(term3214426, term3214426.getClass(), "userName", null);
        setIntField(term3214426, term3214426.getClass(), "level", 0);
        setIntField(term3214426, term3214426.getClass(), "reincarnationNum", 0);
        setLongField(term3214426, term3214426.getClass(), "exp", 0L);
        setLongField(term3214426, term3214426.getClass(), "point", 0L);
        setLongField(term3214426, term3214426.getClass(), "totalPoint", 0L);
        setIntField(term3214426, term3214426.getClass(), "playCount", 0);
        setIntField(term3214426, term3214426.getClass(), "jewelCount", 0);
        setIntField(term3214426, term3214426.getClass(), "totalJewelCount", 0);
        setIntField(term3214426, term3214426.getClass(), "medalCount", 0);
        setIntField(term3214426, term3214426.getClass(), "playerRating", 0);
        setIntField(term3214426, term3214426.getClass(), "highestRating", 0);
        setIntField(term3214426, term3214426.getClass(), "battlePoint", 0);
        setIntField(term3214426, term3214426.getClass(), "bestBattlePoint", 0);
        setIntField(term3214426, term3214426.getClass(), "overDamageBattlePoint", 0);
        setIntField(term3214426, term3214426.getClass(), "nameplateId", 0);
        setIntField(term3214426, term3214426.getClass(), "trophyId", 0);
        setIntField(term3214426, term3214426.getClass(), "cardId", 0);
        setIntField(term3214426, term3214426.getClass(), "characterId", 0);
        setIntField(term3214426, term3214426.getClass(), "tabSetting", 0);
        setIntField(term3214426, term3214426.getClass(), "tabSortSetting", 0);
        setIntField(term3214426, term3214426.getClass(), "cardCategorySetting", 0);
        setIntField(term3214426, term3214426.getClass(), "cardSortSetting", 0);
        setIntField(term3214426, term3214426.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term3214426, term3214426.getClass(), "playedTutorialBit", 0);
        setIntField(term3214426, term3214426.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term3214426, term3214426.getClass(), "sumTechHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumBattleHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term3214426, term3214426.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term3214426, term3214426.getClass(), "eventWatchedDate", null);
        setField(term3214426, term3214426.getClass(), "cmEventWatchedDate", null);
        setField(term3214426, term3214426.getClass(), "firstGameId", null);
        setField(term3214426, term3214426.getClass(), "firstRomVersion", null);
        setField(term3214426, term3214426.getClass(), "firstDataVersion", null);
        setField(term3214426, term3214426.getClass(), "firstPlayDate", null);
        setField(term3214426, term3214426.getClass(), "lastGameId", null);
        setField(term3214426, term3214426.getClass(), "lastRomVersion", null);
        setField(term3214426, term3214426.getClass(), "lastDataVersion", null);
        setField(term3214426, term3214426.getClass(), "compatibleCmVersion", null);
        setField(term3214426, term3214426.getClass(), "lastPlayDate", null);
        setIntField(term3214426, term3214426.getClass(), "lastPlaceId", 0);
        setField(term3214426, term3214426.getClass(), "lastPlaceName", null);
        setIntField(term3214426, term3214426.getClass(), "lastRegionId", 0);
        setField(term3214426, term3214426.getClass(), "lastRegionName", null);
        setIntField(term3214426, term3214426.getClass(), "lastAllNetId", 0);
        setField(term3214426, term3214426.getClass(), "lastClientId", null);
        setIntField(term3214426, term3214426.getClass(), "lastUsedDeckId", 0);
        setIntField(term3214426, term3214426.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term3214426, term3214426.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term3214426, args);
    }

};


