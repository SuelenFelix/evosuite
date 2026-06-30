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

public class ExternalUserData_getPlayCount_466306098131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145648;

    public ExternalUserData_getPlayCount_466306098131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145648 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145648, term145648.getClass(), "accessCode", null);
        setField(term145648, term145648.getClass(), "userName", null);
        setIntField(term145648, term145648.getClass(), "level", 0);
        setIntField(term145648, term145648.getClass(), "reincarnationNum", 0);
        setLongField(term145648, term145648.getClass(), "exp", 0L);
        setLongField(term145648, term145648.getClass(), "point", 0L);
        setLongField(term145648, term145648.getClass(), "totalPoint", 0L);
        setIntField(term145648, term145648.getClass(), "playCount", 0);
        setIntField(term145648, term145648.getClass(), "jewelCount", 0);
        setIntField(term145648, term145648.getClass(), "totalJewelCount", 0);
        setIntField(term145648, term145648.getClass(), "medalCount", 0);
        setIntField(term145648, term145648.getClass(), "playerRating", 0);
        setIntField(term145648, term145648.getClass(), "highestRating", 0);
        setIntField(term145648, term145648.getClass(), "battlePoint", 0);
        setIntField(term145648, term145648.getClass(), "bestBattlePoint", 0);
        setIntField(term145648, term145648.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145648, term145648.getClass(), "nameplateId", 0);
        setIntField(term145648, term145648.getClass(), "trophyId", 0);
        setIntField(term145648, term145648.getClass(), "cardId", 0);
        setIntField(term145648, term145648.getClass(), "characterId", 0);
        setIntField(term145648, term145648.getClass(), "tabSetting", 0);
        setIntField(term145648, term145648.getClass(), "tabSortSetting", 0);
        setIntField(term145648, term145648.getClass(), "cardCategorySetting", 0);
        setIntField(term145648, term145648.getClass(), "cardSortSetting", 0);
        setIntField(term145648, term145648.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145648, term145648.getClass(), "playedTutorialBit", 0);
        setIntField(term145648, term145648.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145648, term145648.getClass(), "sumTechHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145648, term145648.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145648, term145648.getClass(), "eventWatchedDate", null);
        setField(term145648, term145648.getClass(), "cmEventWatchedDate", null);
        setField(term145648, term145648.getClass(), "firstGameId", null);
        setField(term145648, term145648.getClass(), "firstRomVersion", null);
        setField(term145648, term145648.getClass(), "firstDataVersion", null);
        setField(term145648, term145648.getClass(), "firstPlayDate", null);
        setField(term145648, term145648.getClass(), "lastGameId", null);
        setField(term145648, term145648.getClass(), "lastRomVersion", null);
        setField(term145648, term145648.getClass(), "lastDataVersion", null);
        setField(term145648, term145648.getClass(), "compatibleCmVersion", null);
        setField(term145648, term145648.getClass(), "lastPlayDate", null);
        setIntField(term145648, term145648.getClass(), "lastPlaceId", 0);
        setField(term145648, term145648.getClass(), "lastPlaceName", null);
        setIntField(term145648, term145648.getClass(), "lastRegionId", 0);
        setField(term145648, term145648.getClass(), "lastRegionName", null);
        setIntField(term145648, term145648.getClass(), "lastAllNetId", 0);
        setField(term145648, term145648.getClass(), "lastClientId", null);
        setIntField(term145648, term145648.getClass(), "lastUsedDeckId", 0);
        setIntField(term145648, term145648.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145648, term145648.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term145648, args);
    }

};


