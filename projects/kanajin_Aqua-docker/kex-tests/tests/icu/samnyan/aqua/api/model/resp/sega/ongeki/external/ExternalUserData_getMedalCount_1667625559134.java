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

public class ExternalUserData_getMedalCount_1667625559134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145780;

    public ExternalUserData_getMedalCount_1667625559134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145780 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145780, term145780.getClass(), "accessCode", null);
        setField(term145780, term145780.getClass(), "userName", null);
        setIntField(term145780, term145780.getClass(), "level", 0);
        setIntField(term145780, term145780.getClass(), "reincarnationNum", 0);
        setLongField(term145780, term145780.getClass(), "exp", 0L);
        setLongField(term145780, term145780.getClass(), "point", 0L);
        setLongField(term145780, term145780.getClass(), "totalPoint", 0L);
        setIntField(term145780, term145780.getClass(), "playCount", 0);
        setIntField(term145780, term145780.getClass(), "jewelCount", 0);
        setIntField(term145780, term145780.getClass(), "totalJewelCount", 0);
        setIntField(term145780, term145780.getClass(), "medalCount", 0);
        setIntField(term145780, term145780.getClass(), "playerRating", 0);
        setIntField(term145780, term145780.getClass(), "highestRating", 0);
        setIntField(term145780, term145780.getClass(), "battlePoint", 0);
        setIntField(term145780, term145780.getClass(), "bestBattlePoint", 0);
        setIntField(term145780, term145780.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145780, term145780.getClass(), "nameplateId", 0);
        setIntField(term145780, term145780.getClass(), "trophyId", 0);
        setIntField(term145780, term145780.getClass(), "cardId", 0);
        setIntField(term145780, term145780.getClass(), "characterId", 0);
        setIntField(term145780, term145780.getClass(), "tabSetting", 0);
        setIntField(term145780, term145780.getClass(), "tabSortSetting", 0);
        setIntField(term145780, term145780.getClass(), "cardCategorySetting", 0);
        setIntField(term145780, term145780.getClass(), "cardSortSetting", 0);
        setIntField(term145780, term145780.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145780, term145780.getClass(), "playedTutorialBit", 0);
        setIntField(term145780, term145780.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145780, term145780.getClass(), "sumTechHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145780, term145780.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145780, term145780.getClass(), "eventWatchedDate", null);
        setField(term145780, term145780.getClass(), "cmEventWatchedDate", null);
        setField(term145780, term145780.getClass(), "firstGameId", null);
        setField(term145780, term145780.getClass(), "firstRomVersion", null);
        setField(term145780, term145780.getClass(), "firstDataVersion", null);
        setField(term145780, term145780.getClass(), "firstPlayDate", null);
        setField(term145780, term145780.getClass(), "lastGameId", null);
        setField(term145780, term145780.getClass(), "lastRomVersion", null);
        setField(term145780, term145780.getClass(), "lastDataVersion", null);
        setField(term145780, term145780.getClass(), "compatibleCmVersion", null);
        setField(term145780, term145780.getClass(), "lastPlayDate", null);
        setIntField(term145780, term145780.getClass(), "lastPlaceId", 0);
        setField(term145780, term145780.getClass(), "lastPlaceName", null);
        setIntField(term145780, term145780.getClass(), "lastRegionId", 0);
        setField(term145780, term145780.getClass(), "lastRegionName", null);
        setIntField(term145780, term145780.getClass(), "lastAllNetId", 0);
        setField(term145780, term145780.getClass(), "lastClientId", null);
        setIntField(term145780, term145780.getClass(), "lastUsedDeckId", 0);
        setIntField(term145780, term145780.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145780, term145780.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMedalCount", argTypes, term145780, args);
    }

};


