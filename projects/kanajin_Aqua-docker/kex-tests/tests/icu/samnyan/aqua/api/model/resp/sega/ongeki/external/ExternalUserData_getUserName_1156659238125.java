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

public class ExternalUserData_getUserName_1156659238125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145384;

    public ExternalUserData_getUserName_1156659238125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145384 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145384, term145384.getClass(), "accessCode", null);
        setField(term145384, term145384.getClass(), "userName", null);
        setIntField(term145384, term145384.getClass(), "level", 0);
        setIntField(term145384, term145384.getClass(), "reincarnationNum", 0);
        setLongField(term145384, term145384.getClass(), "exp", 0L);
        setLongField(term145384, term145384.getClass(), "point", 0L);
        setLongField(term145384, term145384.getClass(), "totalPoint", 0L);
        setIntField(term145384, term145384.getClass(), "playCount", 0);
        setIntField(term145384, term145384.getClass(), "jewelCount", 0);
        setIntField(term145384, term145384.getClass(), "totalJewelCount", 0);
        setIntField(term145384, term145384.getClass(), "medalCount", 0);
        setIntField(term145384, term145384.getClass(), "playerRating", 0);
        setIntField(term145384, term145384.getClass(), "highestRating", 0);
        setIntField(term145384, term145384.getClass(), "battlePoint", 0);
        setIntField(term145384, term145384.getClass(), "bestBattlePoint", 0);
        setIntField(term145384, term145384.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145384, term145384.getClass(), "nameplateId", 0);
        setIntField(term145384, term145384.getClass(), "trophyId", 0);
        setIntField(term145384, term145384.getClass(), "cardId", 0);
        setIntField(term145384, term145384.getClass(), "characterId", 0);
        setIntField(term145384, term145384.getClass(), "tabSetting", 0);
        setIntField(term145384, term145384.getClass(), "tabSortSetting", 0);
        setIntField(term145384, term145384.getClass(), "cardCategorySetting", 0);
        setIntField(term145384, term145384.getClass(), "cardSortSetting", 0);
        setIntField(term145384, term145384.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145384, term145384.getClass(), "playedTutorialBit", 0);
        setIntField(term145384, term145384.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145384, term145384.getClass(), "sumTechHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145384, term145384.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145384, term145384.getClass(), "eventWatchedDate", null);
        setField(term145384, term145384.getClass(), "cmEventWatchedDate", null);
        setField(term145384, term145384.getClass(), "firstGameId", null);
        setField(term145384, term145384.getClass(), "firstRomVersion", null);
        setField(term145384, term145384.getClass(), "firstDataVersion", null);
        setField(term145384, term145384.getClass(), "firstPlayDate", null);
        setField(term145384, term145384.getClass(), "lastGameId", null);
        setField(term145384, term145384.getClass(), "lastRomVersion", null);
        setField(term145384, term145384.getClass(), "lastDataVersion", null);
        setField(term145384, term145384.getClass(), "compatibleCmVersion", null);
        setField(term145384, term145384.getClass(), "lastPlayDate", null);
        setIntField(term145384, term145384.getClass(), "lastPlaceId", 0);
        setField(term145384, term145384.getClass(), "lastPlaceName", null);
        setIntField(term145384, term145384.getClass(), "lastRegionId", 0);
        setField(term145384, term145384.getClass(), "lastRegionName", null);
        setIntField(term145384, term145384.getClass(), "lastAllNetId", 0);
        setField(term145384, term145384.getClass(), "lastClientId", null);
        setIntField(term145384, term145384.getClass(), "lastUsedDeckId", 0);
        setIntField(term145384, term145384.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145384, term145384.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term145384, args);
    }

};


