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

public class ExternalUserData_getLastEmoneyBrand_1755045975182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147892;

    public ExternalUserData_getLastEmoneyBrand_1755045975182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147892 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term147892, term147892.getClass(), "accessCode", null);
        setField(term147892, term147892.getClass(), "userName", null);
        setIntField(term147892, term147892.getClass(), "level", 0);
        setIntField(term147892, term147892.getClass(), "reincarnationNum", 0);
        setLongField(term147892, term147892.getClass(), "exp", 0L);
        setLongField(term147892, term147892.getClass(), "point", 0L);
        setLongField(term147892, term147892.getClass(), "totalPoint", 0L);
        setIntField(term147892, term147892.getClass(), "playCount", 0);
        setIntField(term147892, term147892.getClass(), "jewelCount", 0);
        setIntField(term147892, term147892.getClass(), "totalJewelCount", 0);
        setIntField(term147892, term147892.getClass(), "medalCount", 0);
        setIntField(term147892, term147892.getClass(), "playerRating", 0);
        setIntField(term147892, term147892.getClass(), "highestRating", 0);
        setIntField(term147892, term147892.getClass(), "battlePoint", 0);
        setIntField(term147892, term147892.getClass(), "bestBattlePoint", 0);
        setIntField(term147892, term147892.getClass(), "overDamageBattlePoint", 0);
        setIntField(term147892, term147892.getClass(), "nameplateId", 0);
        setIntField(term147892, term147892.getClass(), "trophyId", 0);
        setIntField(term147892, term147892.getClass(), "cardId", 0);
        setIntField(term147892, term147892.getClass(), "characterId", 0);
        setIntField(term147892, term147892.getClass(), "tabSetting", 0);
        setIntField(term147892, term147892.getClass(), "tabSortSetting", 0);
        setIntField(term147892, term147892.getClass(), "cardCategorySetting", 0);
        setIntField(term147892, term147892.getClass(), "cardSortSetting", 0);
        setIntField(term147892, term147892.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term147892, term147892.getClass(), "playedTutorialBit", 0);
        setIntField(term147892, term147892.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term147892, term147892.getClass(), "sumTechHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumBattleHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term147892, term147892.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term147892, term147892.getClass(), "eventWatchedDate", null);
        setField(term147892, term147892.getClass(), "cmEventWatchedDate", null);
        setField(term147892, term147892.getClass(), "firstGameId", null);
        setField(term147892, term147892.getClass(), "firstRomVersion", null);
        setField(term147892, term147892.getClass(), "firstDataVersion", null);
        setField(term147892, term147892.getClass(), "firstPlayDate", null);
        setField(term147892, term147892.getClass(), "lastGameId", null);
        setField(term147892, term147892.getClass(), "lastRomVersion", null);
        setField(term147892, term147892.getClass(), "lastDataVersion", null);
        setField(term147892, term147892.getClass(), "compatibleCmVersion", null);
        setField(term147892, term147892.getClass(), "lastPlayDate", null);
        setIntField(term147892, term147892.getClass(), "lastPlaceId", 0);
        setField(term147892, term147892.getClass(), "lastPlaceName", null);
        setIntField(term147892, term147892.getClass(), "lastRegionId", 0);
        setField(term147892, term147892.getClass(), "lastRegionName", null);
        setIntField(term147892, term147892.getClass(), "lastAllNetId", 0);
        setField(term147892, term147892.getClass(), "lastClientId", null);
        setIntField(term147892, term147892.getClass(), "lastUsedDeckId", 0);
        setIntField(term147892, term147892.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term147892, term147892.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastEmoneyBrand", argTypes, term147892, args);
    }

};


