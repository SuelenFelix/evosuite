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

public class ExternalUserData_getPlayedTutorialBit_1538719921149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146440;

    public ExternalUserData_getPlayedTutorialBit_1538719921149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146440 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term146440, term146440.getClass(), "accessCode", null);
        setField(term146440, term146440.getClass(), "userName", null);
        setIntField(term146440, term146440.getClass(), "level", 0);
        setIntField(term146440, term146440.getClass(), "reincarnationNum", 0);
        setLongField(term146440, term146440.getClass(), "exp", 0L);
        setLongField(term146440, term146440.getClass(), "point", 0L);
        setLongField(term146440, term146440.getClass(), "totalPoint", 0L);
        setIntField(term146440, term146440.getClass(), "playCount", 0);
        setIntField(term146440, term146440.getClass(), "jewelCount", 0);
        setIntField(term146440, term146440.getClass(), "totalJewelCount", 0);
        setIntField(term146440, term146440.getClass(), "medalCount", 0);
        setIntField(term146440, term146440.getClass(), "playerRating", 0);
        setIntField(term146440, term146440.getClass(), "highestRating", 0);
        setIntField(term146440, term146440.getClass(), "battlePoint", 0);
        setIntField(term146440, term146440.getClass(), "bestBattlePoint", 0);
        setIntField(term146440, term146440.getClass(), "overDamageBattlePoint", 0);
        setIntField(term146440, term146440.getClass(), "nameplateId", 0);
        setIntField(term146440, term146440.getClass(), "trophyId", 0);
        setIntField(term146440, term146440.getClass(), "cardId", 0);
        setIntField(term146440, term146440.getClass(), "characterId", 0);
        setIntField(term146440, term146440.getClass(), "tabSetting", 0);
        setIntField(term146440, term146440.getClass(), "tabSortSetting", 0);
        setIntField(term146440, term146440.getClass(), "cardCategorySetting", 0);
        setIntField(term146440, term146440.getClass(), "cardSortSetting", 0);
        setIntField(term146440, term146440.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term146440, term146440.getClass(), "playedTutorialBit", 0);
        setIntField(term146440, term146440.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term146440, term146440.getClass(), "sumTechHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumBattleHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term146440, term146440.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term146440, term146440.getClass(), "eventWatchedDate", null);
        setField(term146440, term146440.getClass(), "cmEventWatchedDate", null);
        setField(term146440, term146440.getClass(), "firstGameId", null);
        setField(term146440, term146440.getClass(), "firstRomVersion", null);
        setField(term146440, term146440.getClass(), "firstDataVersion", null);
        setField(term146440, term146440.getClass(), "firstPlayDate", null);
        setField(term146440, term146440.getClass(), "lastGameId", null);
        setField(term146440, term146440.getClass(), "lastRomVersion", null);
        setField(term146440, term146440.getClass(), "lastDataVersion", null);
        setField(term146440, term146440.getClass(), "compatibleCmVersion", null);
        setField(term146440, term146440.getClass(), "lastPlayDate", null);
        setIntField(term146440, term146440.getClass(), "lastPlaceId", 0);
        setField(term146440, term146440.getClass(), "lastPlaceName", null);
        setIntField(term146440, term146440.getClass(), "lastRegionId", 0);
        setField(term146440, term146440.getClass(), "lastRegionName", null);
        setIntField(term146440, term146440.getClass(), "lastAllNetId", 0);
        setField(term146440, term146440.getClass(), "lastClientId", null);
        setIntField(term146440, term146440.getClass(), "lastUsedDeckId", 0);
        setIntField(term146440, term146440.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term146440, term146440.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term146440, args);
    }

};


