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

public class ExternalUserData_setCmEventWatchedDate_1727595320223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149770;

    public ExternalUserData_setCmEventWatchedDate_1727595320223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149770 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term149770, term149770.getClass(), "accessCode", null);
        setField(term149770, term149770.getClass(), "userName", null);
        setIntField(term149770, term149770.getClass(), "level", 0);
        setIntField(term149770, term149770.getClass(), "reincarnationNum", 0);
        setLongField(term149770, term149770.getClass(), "exp", 0L);
        setLongField(term149770, term149770.getClass(), "point", 0L);
        setLongField(term149770, term149770.getClass(), "totalPoint", 0L);
        setIntField(term149770, term149770.getClass(), "playCount", 0);
        setIntField(term149770, term149770.getClass(), "jewelCount", 0);
        setIntField(term149770, term149770.getClass(), "totalJewelCount", 0);
        setIntField(term149770, term149770.getClass(), "medalCount", 0);
        setIntField(term149770, term149770.getClass(), "playerRating", 0);
        setIntField(term149770, term149770.getClass(), "highestRating", 0);
        setIntField(term149770, term149770.getClass(), "battlePoint", 0);
        setIntField(term149770, term149770.getClass(), "bestBattlePoint", 0);
        setIntField(term149770, term149770.getClass(), "overDamageBattlePoint", 0);
        setIntField(term149770, term149770.getClass(), "nameplateId", 0);
        setIntField(term149770, term149770.getClass(), "trophyId", 0);
        setIntField(term149770, term149770.getClass(), "cardId", 0);
        setIntField(term149770, term149770.getClass(), "characterId", 0);
        setIntField(term149770, term149770.getClass(), "tabSetting", 0);
        setIntField(term149770, term149770.getClass(), "tabSortSetting", 0);
        setIntField(term149770, term149770.getClass(), "cardCategorySetting", 0);
        setIntField(term149770, term149770.getClass(), "cardSortSetting", 0);
        setIntField(term149770, term149770.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term149770, term149770.getClass(), "playedTutorialBit", 0);
        setIntField(term149770, term149770.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term149770, term149770.getClass(), "sumTechHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumBattleHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term149770, term149770.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term149770, term149770.getClass(), "eventWatchedDate", null);
        setField(term149770, term149770.getClass(), "cmEventWatchedDate", null);
        setField(term149770, term149770.getClass(), "firstGameId", null);
        setField(term149770, term149770.getClass(), "firstRomVersion", null);
        setField(term149770, term149770.getClass(), "firstDataVersion", null);
        setField(term149770, term149770.getClass(), "firstPlayDate", null);
        setField(term149770, term149770.getClass(), "lastGameId", null);
        setField(term149770, term149770.getClass(), "lastRomVersion", null);
        setField(term149770, term149770.getClass(), "lastDataVersion", null);
        setField(term149770, term149770.getClass(), "compatibleCmVersion", null);
        setField(term149770, term149770.getClass(), "lastPlayDate", null);
        setIntField(term149770, term149770.getClass(), "lastPlaceId", 0);
        setField(term149770, term149770.getClass(), "lastPlaceName", null);
        setIntField(term149770, term149770.getClass(), "lastRegionId", 0);
        setField(term149770, term149770.getClass(), "lastRegionName", null);
        setIntField(term149770, term149770.getClass(), "lastAllNetId", 0);
        setField(term149770, term149770.getClass(), "lastClientId", null);
        setIntField(term149770, term149770.getClass(), "lastUsedDeckId", 0);
        setIntField(term149770, term149770.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term149770, term149770.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCmEventWatchedDate", argTypes, term149770, args);
    }

};


