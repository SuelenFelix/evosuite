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

public class ExternalUserData_equals_444194103242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150618;

    public ExternalUserData_equals_444194103242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150618 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term150618, term150618.getClass(), "accessCode", null);
        setField(term150618, term150618.getClass(), "userName", null);
        setIntField(term150618, term150618.getClass(), "level", 0);
        setIntField(term150618, term150618.getClass(), "reincarnationNum", 0);
        setLongField(term150618, term150618.getClass(), "exp", 0L);
        setLongField(term150618, term150618.getClass(), "point", 0L);
        setLongField(term150618, term150618.getClass(), "totalPoint", 0L);
        setIntField(term150618, term150618.getClass(), "playCount", 0);
        setIntField(term150618, term150618.getClass(), "jewelCount", 0);
        setIntField(term150618, term150618.getClass(), "totalJewelCount", 0);
        setIntField(term150618, term150618.getClass(), "medalCount", 0);
        setIntField(term150618, term150618.getClass(), "playerRating", 0);
        setIntField(term150618, term150618.getClass(), "highestRating", 0);
        setIntField(term150618, term150618.getClass(), "battlePoint", 0);
        setIntField(term150618, term150618.getClass(), "bestBattlePoint", 0);
        setIntField(term150618, term150618.getClass(), "overDamageBattlePoint", 0);
        setIntField(term150618, term150618.getClass(), "nameplateId", 0);
        setIntField(term150618, term150618.getClass(), "trophyId", 0);
        setIntField(term150618, term150618.getClass(), "cardId", 0);
        setIntField(term150618, term150618.getClass(), "characterId", 0);
        setIntField(term150618, term150618.getClass(), "tabSetting", 0);
        setIntField(term150618, term150618.getClass(), "tabSortSetting", 0);
        setIntField(term150618, term150618.getClass(), "cardCategorySetting", 0);
        setIntField(term150618, term150618.getClass(), "cardSortSetting", 0);
        setIntField(term150618, term150618.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term150618, term150618.getClass(), "playedTutorialBit", 0);
        setIntField(term150618, term150618.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term150618, term150618.getClass(), "sumTechHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumBattleHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term150618, term150618.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term150618, term150618.getClass(), "eventWatchedDate", null);
        setField(term150618, term150618.getClass(), "cmEventWatchedDate", null);
        setField(term150618, term150618.getClass(), "firstGameId", null);
        setField(term150618, term150618.getClass(), "firstRomVersion", null);
        setField(term150618, term150618.getClass(), "firstDataVersion", null);
        setField(term150618, term150618.getClass(), "firstPlayDate", null);
        setField(term150618, term150618.getClass(), "lastGameId", null);
        setField(term150618, term150618.getClass(), "lastRomVersion", null);
        setField(term150618, term150618.getClass(), "lastDataVersion", null);
        setField(term150618, term150618.getClass(), "compatibleCmVersion", null);
        setField(term150618, term150618.getClass(), "lastPlayDate", null);
        setIntField(term150618, term150618.getClass(), "lastPlaceId", 0);
        setField(term150618, term150618.getClass(), "lastPlaceName", null);
        setIntField(term150618, term150618.getClass(), "lastRegionId", 0);
        setField(term150618, term150618.getClass(), "lastRegionName", null);
        setIntField(term150618, term150618.getClass(), "lastAllNetId", 0);
        setField(term150618, term150618.getClass(), "lastClientId", null);
        setIntField(term150618, term150618.getClass(), "lastUsedDeckId", 0);
        setIntField(term150618, term150618.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term150618, term150618.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term150618, args);
    }

};


