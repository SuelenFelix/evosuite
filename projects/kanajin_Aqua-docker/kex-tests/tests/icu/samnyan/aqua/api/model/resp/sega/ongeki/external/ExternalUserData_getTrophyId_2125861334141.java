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

public class ExternalUserData_getTrophyId_2125861334141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146088;

    public ExternalUserData_getTrophyId_2125861334141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146088 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term146088, term146088.getClass(), "accessCode", null);
        setField(term146088, term146088.getClass(), "userName", null);
        setIntField(term146088, term146088.getClass(), "level", 0);
        setIntField(term146088, term146088.getClass(), "reincarnationNum", 0);
        setLongField(term146088, term146088.getClass(), "exp", 0L);
        setLongField(term146088, term146088.getClass(), "point", 0L);
        setLongField(term146088, term146088.getClass(), "totalPoint", 0L);
        setIntField(term146088, term146088.getClass(), "playCount", 0);
        setIntField(term146088, term146088.getClass(), "jewelCount", 0);
        setIntField(term146088, term146088.getClass(), "totalJewelCount", 0);
        setIntField(term146088, term146088.getClass(), "medalCount", 0);
        setIntField(term146088, term146088.getClass(), "playerRating", 0);
        setIntField(term146088, term146088.getClass(), "highestRating", 0);
        setIntField(term146088, term146088.getClass(), "battlePoint", 0);
        setIntField(term146088, term146088.getClass(), "bestBattlePoint", 0);
        setIntField(term146088, term146088.getClass(), "overDamageBattlePoint", 0);
        setIntField(term146088, term146088.getClass(), "nameplateId", 0);
        setIntField(term146088, term146088.getClass(), "trophyId", 0);
        setIntField(term146088, term146088.getClass(), "cardId", 0);
        setIntField(term146088, term146088.getClass(), "characterId", 0);
        setIntField(term146088, term146088.getClass(), "tabSetting", 0);
        setIntField(term146088, term146088.getClass(), "tabSortSetting", 0);
        setIntField(term146088, term146088.getClass(), "cardCategorySetting", 0);
        setIntField(term146088, term146088.getClass(), "cardSortSetting", 0);
        setIntField(term146088, term146088.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term146088, term146088.getClass(), "playedTutorialBit", 0);
        setIntField(term146088, term146088.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term146088, term146088.getClass(), "sumTechHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumBattleHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term146088, term146088.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term146088, term146088.getClass(), "eventWatchedDate", null);
        setField(term146088, term146088.getClass(), "cmEventWatchedDate", null);
        setField(term146088, term146088.getClass(), "firstGameId", null);
        setField(term146088, term146088.getClass(), "firstRomVersion", null);
        setField(term146088, term146088.getClass(), "firstDataVersion", null);
        setField(term146088, term146088.getClass(), "firstPlayDate", null);
        setField(term146088, term146088.getClass(), "lastGameId", null);
        setField(term146088, term146088.getClass(), "lastRomVersion", null);
        setField(term146088, term146088.getClass(), "lastDataVersion", null);
        setField(term146088, term146088.getClass(), "compatibleCmVersion", null);
        setField(term146088, term146088.getClass(), "lastPlayDate", null);
        setIntField(term146088, term146088.getClass(), "lastPlaceId", 0);
        setField(term146088, term146088.getClass(), "lastPlaceName", null);
        setIntField(term146088, term146088.getClass(), "lastRegionId", 0);
        setField(term146088, term146088.getClass(), "lastRegionName", null);
        setIntField(term146088, term146088.getClass(), "lastAllNetId", 0);
        setField(term146088, term146088.getClass(), "lastClientId", null);
        setIntField(term146088, term146088.getClass(), "lastUsedDeckId", 0);
        setIntField(term146088, term146088.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term146088, term146088.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term146088, args);
    }

};


