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

public class ExternalUserData_getHighestRating_611540364136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145868;

    public ExternalUserData_getHighestRating_611540364136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145868 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145868, term145868.getClass(), "accessCode", null);
        setField(term145868, term145868.getClass(), "userName", null);
        setIntField(term145868, term145868.getClass(), "level", 0);
        setIntField(term145868, term145868.getClass(), "reincarnationNum", 0);
        setLongField(term145868, term145868.getClass(), "exp", 0L);
        setLongField(term145868, term145868.getClass(), "point", 0L);
        setLongField(term145868, term145868.getClass(), "totalPoint", 0L);
        setIntField(term145868, term145868.getClass(), "playCount", 0);
        setIntField(term145868, term145868.getClass(), "jewelCount", 0);
        setIntField(term145868, term145868.getClass(), "totalJewelCount", 0);
        setIntField(term145868, term145868.getClass(), "medalCount", 0);
        setIntField(term145868, term145868.getClass(), "playerRating", 0);
        setIntField(term145868, term145868.getClass(), "highestRating", 0);
        setIntField(term145868, term145868.getClass(), "battlePoint", 0);
        setIntField(term145868, term145868.getClass(), "bestBattlePoint", 0);
        setIntField(term145868, term145868.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145868, term145868.getClass(), "nameplateId", 0);
        setIntField(term145868, term145868.getClass(), "trophyId", 0);
        setIntField(term145868, term145868.getClass(), "cardId", 0);
        setIntField(term145868, term145868.getClass(), "characterId", 0);
        setIntField(term145868, term145868.getClass(), "tabSetting", 0);
        setIntField(term145868, term145868.getClass(), "tabSortSetting", 0);
        setIntField(term145868, term145868.getClass(), "cardCategorySetting", 0);
        setIntField(term145868, term145868.getClass(), "cardSortSetting", 0);
        setIntField(term145868, term145868.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145868, term145868.getClass(), "playedTutorialBit", 0);
        setIntField(term145868, term145868.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145868, term145868.getClass(), "sumTechHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145868, term145868.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145868, term145868.getClass(), "eventWatchedDate", null);
        setField(term145868, term145868.getClass(), "cmEventWatchedDate", null);
        setField(term145868, term145868.getClass(), "firstGameId", null);
        setField(term145868, term145868.getClass(), "firstRomVersion", null);
        setField(term145868, term145868.getClass(), "firstDataVersion", null);
        setField(term145868, term145868.getClass(), "firstPlayDate", null);
        setField(term145868, term145868.getClass(), "lastGameId", null);
        setField(term145868, term145868.getClass(), "lastRomVersion", null);
        setField(term145868, term145868.getClass(), "lastDataVersion", null);
        setField(term145868, term145868.getClass(), "compatibleCmVersion", null);
        setField(term145868, term145868.getClass(), "lastPlayDate", null);
        setIntField(term145868, term145868.getClass(), "lastPlaceId", 0);
        setField(term145868, term145868.getClass(), "lastPlaceName", null);
        setIntField(term145868, term145868.getClass(), "lastRegionId", 0);
        setField(term145868, term145868.getClass(), "lastRegionName", null);
        setIntField(term145868, term145868.getClass(), "lastAllNetId", 0);
        setField(term145868, term145868.getClass(), "lastClientId", null);
        setIntField(term145868, term145868.getClass(), "lastUsedDeckId", 0);
        setIntField(term145868, term145868.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145868, term145868.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term145868, args);
    }

};


