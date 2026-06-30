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

public class ExternalUserData_getExp_1745714896128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145516;

    public ExternalUserData_getExp_1745714896128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145516 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145516, term145516.getClass(), "accessCode", null);
        setField(term145516, term145516.getClass(), "userName", null);
        setIntField(term145516, term145516.getClass(), "level", 0);
        setIntField(term145516, term145516.getClass(), "reincarnationNum", 0);
        setLongField(term145516, term145516.getClass(), "exp", 0L);
        setLongField(term145516, term145516.getClass(), "point", 0L);
        setLongField(term145516, term145516.getClass(), "totalPoint", 0L);
        setIntField(term145516, term145516.getClass(), "playCount", 0);
        setIntField(term145516, term145516.getClass(), "jewelCount", 0);
        setIntField(term145516, term145516.getClass(), "totalJewelCount", 0);
        setIntField(term145516, term145516.getClass(), "medalCount", 0);
        setIntField(term145516, term145516.getClass(), "playerRating", 0);
        setIntField(term145516, term145516.getClass(), "highestRating", 0);
        setIntField(term145516, term145516.getClass(), "battlePoint", 0);
        setIntField(term145516, term145516.getClass(), "bestBattlePoint", 0);
        setIntField(term145516, term145516.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145516, term145516.getClass(), "nameplateId", 0);
        setIntField(term145516, term145516.getClass(), "trophyId", 0);
        setIntField(term145516, term145516.getClass(), "cardId", 0);
        setIntField(term145516, term145516.getClass(), "characterId", 0);
        setIntField(term145516, term145516.getClass(), "tabSetting", 0);
        setIntField(term145516, term145516.getClass(), "tabSortSetting", 0);
        setIntField(term145516, term145516.getClass(), "cardCategorySetting", 0);
        setIntField(term145516, term145516.getClass(), "cardSortSetting", 0);
        setIntField(term145516, term145516.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145516, term145516.getClass(), "playedTutorialBit", 0);
        setIntField(term145516, term145516.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145516, term145516.getClass(), "sumTechHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145516, term145516.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145516, term145516.getClass(), "eventWatchedDate", null);
        setField(term145516, term145516.getClass(), "cmEventWatchedDate", null);
        setField(term145516, term145516.getClass(), "firstGameId", null);
        setField(term145516, term145516.getClass(), "firstRomVersion", null);
        setField(term145516, term145516.getClass(), "firstDataVersion", null);
        setField(term145516, term145516.getClass(), "firstPlayDate", null);
        setField(term145516, term145516.getClass(), "lastGameId", null);
        setField(term145516, term145516.getClass(), "lastRomVersion", null);
        setField(term145516, term145516.getClass(), "lastDataVersion", null);
        setField(term145516, term145516.getClass(), "compatibleCmVersion", null);
        setField(term145516, term145516.getClass(), "lastPlayDate", null);
        setIntField(term145516, term145516.getClass(), "lastPlaceId", 0);
        setField(term145516, term145516.getClass(), "lastPlaceName", null);
        setIntField(term145516, term145516.getClass(), "lastRegionId", 0);
        setField(term145516, term145516.getClass(), "lastRegionName", null);
        setIntField(term145516, term145516.getClass(), "lastAllNetId", 0);
        setField(term145516, term145516.getClass(), "lastClientId", null);
        setIntField(term145516, term145516.getClass(), "lastUsedDeckId", 0);
        setIntField(term145516, term145516.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145516, term145516.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term145516, args);
    }

};


