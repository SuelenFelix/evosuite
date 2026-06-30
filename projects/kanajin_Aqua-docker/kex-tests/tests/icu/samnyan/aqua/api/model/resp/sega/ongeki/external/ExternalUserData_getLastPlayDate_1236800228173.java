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

public class ExternalUserData_getLastPlayDate_1236800228173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147496;

    public ExternalUserData_getLastPlayDate_1236800228173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147496 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term147496, term147496.getClass(), "accessCode", null);
        setField(term147496, term147496.getClass(), "userName", null);
        setIntField(term147496, term147496.getClass(), "level", 0);
        setIntField(term147496, term147496.getClass(), "reincarnationNum", 0);
        setLongField(term147496, term147496.getClass(), "exp", 0L);
        setLongField(term147496, term147496.getClass(), "point", 0L);
        setLongField(term147496, term147496.getClass(), "totalPoint", 0L);
        setIntField(term147496, term147496.getClass(), "playCount", 0);
        setIntField(term147496, term147496.getClass(), "jewelCount", 0);
        setIntField(term147496, term147496.getClass(), "totalJewelCount", 0);
        setIntField(term147496, term147496.getClass(), "medalCount", 0);
        setIntField(term147496, term147496.getClass(), "playerRating", 0);
        setIntField(term147496, term147496.getClass(), "highestRating", 0);
        setIntField(term147496, term147496.getClass(), "battlePoint", 0);
        setIntField(term147496, term147496.getClass(), "bestBattlePoint", 0);
        setIntField(term147496, term147496.getClass(), "overDamageBattlePoint", 0);
        setIntField(term147496, term147496.getClass(), "nameplateId", 0);
        setIntField(term147496, term147496.getClass(), "trophyId", 0);
        setIntField(term147496, term147496.getClass(), "cardId", 0);
        setIntField(term147496, term147496.getClass(), "characterId", 0);
        setIntField(term147496, term147496.getClass(), "tabSetting", 0);
        setIntField(term147496, term147496.getClass(), "tabSortSetting", 0);
        setIntField(term147496, term147496.getClass(), "cardCategorySetting", 0);
        setIntField(term147496, term147496.getClass(), "cardSortSetting", 0);
        setIntField(term147496, term147496.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term147496, term147496.getClass(), "playedTutorialBit", 0);
        setIntField(term147496, term147496.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term147496, term147496.getClass(), "sumTechHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumBattleHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term147496, term147496.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term147496, term147496.getClass(), "eventWatchedDate", null);
        setField(term147496, term147496.getClass(), "cmEventWatchedDate", null);
        setField(term147496, term147496.getClass(), "firstGameId", null);
        setField(term147496, term147496.getClass(), "firstRomVersion", null);
        setField(term147496, term147496.getClass(), "firstDataVersion", null);
        setField(term147496, term147496.getClass(), "firstPlayDate", null);
        setField(term147496, term147496.getClass(), "lastGameId", null);
        setField(term147496, term147496.getClass(), "lastRomVersion", null);
        setField(term147496, term147496.getClass(), "lastDataVersion", null);
        setField(term147496, term147496.getClass(), "compatibleCmVersion", null);
        setField(term147496, term147496.getClass(), "lastPlayDate", null);
        setIntField(term147496, term147496.getClass(), "lastPlaceId", 0);
        setField(term147496, term147496.getClass(), "lastPlaceName", null);
        setIntField(term147496, term147496.getClass(), "lastRegionId", 0);
        setField(term147496, term147496.getClass(), "lastRegionName", null);
        setIntField(term147496, term147496.getClass(), "lastAllNetId", 0);
        setField(term147496, term147496.getClass(), "lastClientId", null);
        setIntField(term147496, term147496.getClass(), "lastUsedDeckId", 0);
        setIntField(term147496, term147496.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term147496, term147496.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term147496, args);
    }

};


