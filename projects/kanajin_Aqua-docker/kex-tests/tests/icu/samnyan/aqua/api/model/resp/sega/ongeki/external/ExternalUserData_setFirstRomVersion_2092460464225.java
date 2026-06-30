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

public class ExternalUserData_setFirstRomVersion_2092460464225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149858;

    public ExternalUserData_setFirstRomVersion_2092460464225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149858 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149858, term149858.getClass(), "accessCode", null);
        setField(term149858, term149858.getClass(), "userName", null);
        setIntField(term149858, term149858.getClass(), "level", 0);
        setIntField(term149858, term149858.getClass(), "reincarnationNum", 0);
        setLongField(term149858, term149858.getClass(), "exp", 0L);
        setLongField(term149858, term149858.getClass(), "point", 0L);
        setLongField(term149858, term149858.getClass(), "totalPoint", 0L);
        setIntField(term149858, term149858.getClass(), "playCount", 0);
        setIntField(term149858, term149858.getClass(), "jewelCount", 0);
        setIntField(term149858, term149858.getClass(), "totalJewelCount", 0);
        setIntField(term149858, term149858.getClass(), "medalCount", 0);
        setIntField(term149858, term149858.getClass(), "playerRating", 0);
        setIntField(term149858, term149858.getClass(), "highestRating", 0);
        setIntField(term149858, term149858.getClass(), "battlePoint", 0);
        setIntField(term149858, term149858.getClass(), "bestBattlePoint", 0);
        setIntField(term149858, term149858.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149858, term149858.getClass(), "nameplateId", 0);
        setIntField(term149858, term149858.getClass(), "trophyId", 0);
        setIntField(term149858, term149858.getClass(), "cardId", 0);
        setIntField(term149858, term149858.getClass(), "characterId", 0);
        setIntField(term149858, term149858.getClass(), "tabSetting", 0);
        setIntField(term149858, term149858.getClass(), "tabSortSetting", 0);
        setIntField(term149858, term149858.getClass(), "cardCategorySetting", 0);
        setIntField(term149858, term149858.getClass(), "cardSortSetting", 0);
        setIntField(term149858, term149858.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149858, term149858.getClass(), "playedTutorialBit", 0);
        setIntField(term149858, term149858.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149858, term149858.getClass(), "sumTechHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149858, term149858.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149858, term149858.getClass(), "eventWatchedDate", null);
        setField(term149858, term149858.getClass(), "cmEventWatchedDate", null);
        setField(term149858, term149858.getClass(), "firstGameId", null);
        setField(term149858, term149858.getClass(), "firstRomVersion", null);
        setField(term149858, term149858.getClass(), "firstDataVersion", null);
        setField(term149858, term149858.getClass(), "firstPlayDate", null);
        setField(term149858, term149858.getClass(), "lastGameId", null);
        setField(term149858, term149858.getClass(), "lastRomVersion", null);
        setField(term149858, term149858.getClass(), "lastDataVersion", null);
        setField(term149858, term149858.getClass(), "compatibleCmVersion", null);
        setField(term149858, term149858.getClass(), "lastPlayDate", null);
        setIntField(term149858, term149858.getClass(), "lastPlaceId", 0);
        setField(term149858, term149858.getClass(), "lastPlaceName", null);
        setIntField(term149858, term149858.getClass(), "lastRegionId", 0);
        setField(term149858, term149858.getClass(), "lastRegionName", null);
        setIntField(term149858, term149858.getClass(), "lastAllNetId", 0);
        setField(term149858, term149858.getClass(), "lastClientId", null);
        setIntField(term149858, term149858.getClass(), "lastUsedDeckId", 0);
        setIntField(term149858, term149858.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149858, term149858.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstRomVersion", argTypes, term149858, args);
    }

};


