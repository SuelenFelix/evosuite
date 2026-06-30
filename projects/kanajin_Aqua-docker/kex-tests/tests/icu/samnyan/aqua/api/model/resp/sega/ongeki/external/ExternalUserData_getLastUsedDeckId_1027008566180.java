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

public class ExternalUserData_getLastUsedDeckId_1027008566180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147804;

    public ExternalUserData_getLastUsedDeckId_1027008566180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147804 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term147804, term147804.getClass(), "accessCode", null);
        setField(term147804, term147804.getClass(), "userName", null);
        setIntField(term147804, term147804.getClass(), "level", 0);
        setIntField(term147804, term147804.getClass(), "reincarnationNum", 0);
        setLongField(term147804, term147804.getClass(), "exp", 0L);
        setLongField(term147804, term147804.getClass(), "point", 0L);
        setLongField(term147804, term147804.getClass(), "totalPoint", 0L);
        setIntField(term147804, term147804.getClass(), "playCount", 0);
        setIntField(term147804, term147804.getClass(), "jewelCount", 0);
        setIntField(term147804, term147804.getClass(), "totalJewelCount", 0);
        setIntField(term147804, term147804.getClass(), "medalCount", 0);
        setIntField(term147804, term147804.getClass(), "playerRating", 0);
        setIntField(term147804, term147804.getClass(), "highestRating", 0);
        setIntField(term147804, term147804.getClass(), "battlePoint", 0);
        setIntField(term147804, term147804.getClass(), "bestBattlePoint", 0);
        setIntField(term147804, term147804.getClass(), "overDamageBattlePoint", 0);
        setIntField(term147804, term147804.getClass(), "nameplateId", 0);
        setIntField(term147804, term147804.getClass(), "trophyId", 0);
        setIntField(term147804, term147804.getClass(), "cardId", 0);
        setIntField(term147804, term147804.getClass(), "characterId", 0);
        setIntField(term147804, term147804.getClass(), "tabSetting", 0);
        setIntField(term147804, term147804.getClass(), "tabSortSetting", 0);
        setIntField(term147804, term147804.getClass(), "cardCategorySetting", 0);
        setIntField(term147804, term147804.getClass(), "cardSortSetting", 0);
        setIntField(term147804, term147804.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term147804, term147804.getClass(), "playedTutorialBit", 0);
        setIntField(term147804, term147804.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term147804, term147804.getClass(), "sumTechHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumBattleHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term147804, term147804.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term147804, term147804.getClass(), "eventWatchedDate", null);
        setField(term147804, term147804.getClass(), "cmEventWatchedDate", null);
        setField(term147804, term147804.getClass(), "firstGameId", null);
        setField(term147804, term147804.getClass(), "firstRomVersion", null);
        setField(term147804, term147804.getClass(), "firstDataVersion", null);
        setField(term147804, term147804.getClass(), "firstPlayDate", null);
        setField(term147804, term147804.getClass(), "lastGameId", null);
        setField(term147804, term147804.getClass(), "lastRomVersion", null);
        setField(term147804, term147804.getClass(), "lastDataVersion", null);
        setField(term147804, term147804.getClass(), "compatibleCmVersion", null);
        setField(term147804, term147804.getClass(), "lastPlayDate", null);
        setIntField(term147804, term147804.getClass(), "lastPlaceId", 0);
        setField(term147804, term147804.getClass(), "lastPlaceName", null);
        setIntField(term147804, term147804.getClass(), "lastRegionId", 0);
        setField(term147804, term147804.getClass(), "lastRegionName", null);
        setIntField(term147804, term147804.getClass(), "lastAllNetId", 0);
        setField(term147804, term147804.getClass(), "lastClientId", null);
        setIntField(term147804, term147804.getClass(), "lastUsedDeckId", 0);
        setIntField(term147804, term147804.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term147804, term147804.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUsedDeckId", argTypes, term147804, args);
    }

};


