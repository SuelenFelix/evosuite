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

public class ExternalUserData_getLevel_899573719126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145428;

    public ExternalUserData_getLevel_899573719126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145428 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145428, term145428.getClass(), "accessCode", null);
        setField(term145428, term145428.getClass(), "userName", null);
        setIntField(term145428, term145428.getClass(), "level", 0);
        setIntField(term145428, term145428.getClass(), "reincarnationNum", 0);
        setLongField(term145428, term145428.getClass(), "exp", 0L);
        setLongField(term145428, term145428.getClass(), "point", 0L);
        setLongField(term145428, term145428.getClass(), "totalPoint", 0L);
        setIntField(term145428, term145428.getClass(), "playCount", 0);
        setIntField(term145428, term145428.getClass(), "jewelCount", 0);
        setIntField(term145428, term145428.getClass(), "totalJewelCount", 0);
        setIntField(term145428, term145428.getClass(), "medalCount", 0);
        setIntField(term145428, term145428.getClass(), "playerRating", 0);
        setIntField(term145428, term145428.getClass(), "highestRating", 0);
        setIntField(term145428, term145428.getClass(), "battlePoint", 0);
        setIntField(term145428, term145428.getClass(), "bestBattlePoint", 0);
        setIntField(term145428, term145428.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145428, term145428.getClass(), "nameplateId", 0);
        setIntField(term145428, term145428.getClass(), "trophyId", 0);
        setIntField(term145428, term145428.getClass(), "cardId", 0);
        setIntField(term145428, term145428.getClass(), "characterId", 0);
        setIntField(term145428, term145428.getClass(), "tabSetting", 0);
        setIntField(term145428, term145428.getClass(), "tabSortSetting", 0);
        setIntField(term145428, term145428.getClass(), "cardCategorySetting", 0);
        setIntField(term145428, term145428.getClass(), "cardSortSetting", 0);
        setIntField(term145428, term145428.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145428, term145428.getClass(), "playedTutorialBit", 0);
        setIntField(term145428, term145428.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145428, term145428.getClass(), "sumTechHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145428, term145428.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145428, term145428.getClass(), "eventWatchedDate", null);
        setField(term145428, term145428.getClass(), "cmEventWatchedDate", null);
        setField(term145428, term145428.getClass(), "firstGameId", null);
        setField(term145428, term145428.getClass(), "firstRomVersion", null);
        setField(term145428, term145428.getClass(), "firstDataVersion", null);
        setField(term145428, term145428.getClass(), "firstPlayDate", null);
        setField(term145428, term145428.getClass(), "lastGameId", null);
        setField(term145428, term145428.getClass(), "lastRomVersion", null);
        setField(term145428, term145428.getClass(), "lastDataVersion", null);
        setField(term145428, term145428.getClass(), "compatibleCmVersion", null);
        setField(term145428, term145428.getClass(), "lastPlayDate", null);
        setIntField(term145428, term145428.getClass(), "lastPlaceId", 0);
        setField(term145428, term145428.getClass(), "lastPlaceName", null);
        setIntField(term145428, term145428.getClass(), "lastRegionId", 0);
        setField(term145428, term145428.getClass(), "lastRegionName", null);
        setIntField(term145428, term145428.getClass(), "lastAllNetId", 0);
        setField(term145428, term145428.getClass(), "lastClientId", null);
        setIntField(term145428, term145428.getClass(), "lastUsedDeckId", 0);
        setIntField(term145428, term145428.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145428, term145428.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term145428, args);
    }

};


