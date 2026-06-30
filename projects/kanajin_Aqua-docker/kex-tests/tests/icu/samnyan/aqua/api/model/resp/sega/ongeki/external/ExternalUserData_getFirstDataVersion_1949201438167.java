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

public class ExternalUserData_getFirstDataVersion_1949201438167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147232;

    public ExternalUserData_getFirstDataVersion_1949201438167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147232 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term147232, term147232.getClass(), "accessCode", null);
        setField(term147232, term147232.getClass(), "userName", null);
        setIntField(term147232, term147232.getClass(), "level", 0);
        setIntField(term147232, term147232.getClass(), "reincarnationNum", 0);
        setLongField(term147232, term147232.getClass(), "exp", 0L);
        setLongField(term147232, term147232.getClass(), "point", 0L);
        setLongField(term147232, term147232.getClass(), "totalPoint", 0L);
        setIntField(term147232, term147232.getClass(), "playCount", 0);
        setIntField(term147232, term147232.getClass(), "jewelCount", 0);
        setIntField(term147232, term147232.getClass(), "totalJewelCount", 0);
        setIntField(term147232, term147232.getClass(), "medalCount", 0);
        setIntField(term147232, term147232.getClass(), "playerRating", 0);
        setIntField(term147232, term147232.getClass(), "highestRating", 0);
        setIntField(term147232, term147232.getClass(), "battlePoint", 0);
        setIntField(term147232, term147232.getClass(), "bestBattlePoint", 0);
        setIntField(term147232, term147232.getClass(), "overDamageBattlePoint", 0);
        setIntField(term147232, term147232.getClass(), "nameplateId", 0);
        setIntField(term147232, term147232.getClass(), "trophyId", 0);
        setIntField(term147232, term147232.getClass(), "cardId", 0);
        setIntField(term147232, term147232.getClass(), "characterId", 0);
        setIntField(term147232, term147232.getClass(), "tabSetting", 0);
        setIntField(term147232, term147232.getClass(), "tabSortSetting", 0);
        setIntField(term147232, term147232.getClass(), "cardCategorySetting", 0);
        setIntField(term147232, term147232.getClass(), "cardSortSetting", 0);
        setIntField(term147232, term147232.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term147232, term147232.getClass(), "playedTutorialBit", 0);
        setIntField(term147232, term147232.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term147232, term147232.getClass(), "sumTechHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumBattleHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term147232, term147232.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term147232, term147232.getClass(), "eventWatchedDate", null);
        setField(term147232, term147232.getClass(), "cmEventWatchedDate", null);
        setField(term147232, term147232.getClass(), "firstGameId", null);
        setField(term147232, term147232.getClass(), "firstRomVersion", null);
        setField(term147232, term147232.getClass(), "firstDataVersion", null);
        setField(term147232, term147232.getClass(), "firstPlayDate", null);
        setField(term147232, term147232.getClass(), "lastGameId", null);
        setField(term147232, term147232.getClass(), "lastRomVersion", null);
        setField(term147232, term147232.getClass(), "lastDataVersion", null);
        setField(term147232, term147232.getClass(), "compatibleCmVersion", null);
        setField(term147232, term147232.getClass(), "lastPlayDate", null);
        setIntField(term147232, term147232.getClass(), "lastPlaceId", 0);
        setField(term147232, term147232.getClass(), "lastPlaceName", null);
        setIntField(term147232, term147232.getClass(), "lastRegionId", 0);
        setField(term147232, term147232.getClass(), "lastRegionName", null);
        setIntField(term147232, term147232.getClass(), "lastAllNetId", 0);
        setField(term147232, term147232.getClass(), "lastClientId", null);
        setIntField(term147232, term147232.getClass(), "lastUsedDeckId", 0);
        setIntField(term147232, term147232.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term147232, term147232.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term147232, args);
    }

};


