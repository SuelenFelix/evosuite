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

public class ExternalUserData_getPlayCount_4663060988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3168096;

    public ExternalUserData_getPlayCount_4663060988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3168096 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3168096, term3168096.getClass(), "accessCode", null);
        setField(term3168096, term3168096.getClass(), "userName", null);
        setIntField(term3168096, term3168096.getClass(), "level", 0);
        setIntField(term3168096, term3168096.getClass(), "reincarnationNum", 0);
        setLongField(term3168096, term3168096.getClass(), "exp", 0L);
        setLongField(term3168096, term3168096.getClass(), "point", 0L);
        setLongField(term3168096, term3168096.getClass(), "totalPoint", 0L);
        setIntField(term3168096, term3168096.getClass(), "playCount", 0);
        setIntField(term3168096, term3168096.getClass(), "jewelCount", 0);
        setIntField(term3168096, term3168096.getClass(), "totalJewelCount", 0);
        setIntField(term3168096, term3168096.getClass(), "medalCount", 0);
        setIntField(term3168096, term3168096.getClass(), "playerRating", 0);
        setIntField(term3168096, term3168096.getClass(), "highestRating", 0);
        setIntField(term3168096, term3168096.getClass(), "battlePoint", 0);
        setIntField(term3168096, term3168096.getClass(), "bestBattlePoint", 0);
        setIntField(term3168096, term3168096.getClass(), "overDamageBattlePoint", 0);
        setIntField(term3168096, term3168096.getClass(), "nameplateId", 0);
        setIntField(term3168096, term3168096.getClass(), "trophyId", 0);
        setIntField(term3168096, term3168096.getClass(), "cardId", 0);
        setIntField(term3168096, term3168096.getClass(), "characterId", 0);
        setIntField(term3168096, term3168096.getClass(), "tabSetting", 0);
        setIntField(term3168096, term3168096.getClass(), "tabSortSetting", 0);
        setIntField(term3168096, term3168096.getClass(), "cardCategorySetting", 0);
        setIntField(term3168096, term3168096.getClass(), "cardSortSetting", 0);
        setIntField(term3168096, term3168096.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term3168096, term3168096.getClass(), "playedTutorialBit", 0);
        setIntField(term3168096, term3168096.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term3168096, term3168096.getClass(), "sumTechHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumBattleHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term3168096, term3168096.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term3168096, term3168096.getClass(), "eventWatchedDate", null);
        setField(term3168096, term3168096.getClass(), "cmEventWatchedDate", null);
        setField(term3168096, term3168096.getClass(), "firstGameId", null);
        setField(term3168096, term3168096.getClass(), "firstRomVersion", null);
        setField(term3168096, term3168096.getClass(), "firstDataVersion", null);
        setField(term3168096, term3168096.getClass(), "firstPlayDate", null);
        setField(term3168096, term3168096.getClass(), "lastGameId", null);
        setField(term3168096, term3168096.getClass(), "lastRomVersion", null);
        setField(term3168096, term3168096.getClass(), "lastDataVersion", null);
        setField(term3168096, term3168096.getClass(), "compatibleCmVersion", null);
        setField(term3168096, term3168096.getClass(), "lastPlayDate", null);
        setIntField(term3168096, term3168096.getClass(), "lastPlaceId", 0);
        setField(term3168096, term3168096.getClass(), "lastPlaceName", null);
        setIntField(term3168096, term3168096.getClass(), "lastRegionId", 0);
        setField(term3168096, term3168096.getClass(), "lastRegionName", null);
        setIntField(term3168096, term3168096.getClass(), "lastAllNetId", 0);
        setField(term3168096, term3168096.getClass(), "lastClientId", null);
        setIntField(term3168096, term3168096.getClass(), "lastUsedDeckId", 0);
        setIntField(term3168096, term3168096.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term3168096, term3168096.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term3168096, args);
    }

};


