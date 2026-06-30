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

public class ExternalUserData_getTotalPoint_1573875147130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145604;

    public ExternalUserData_getTotalPoint_1573875147130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145604 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term145604, term145604.getClass(), "accessCode", null);
        setField(term145604, term145604.getClass(), "userName", null);
        setIntField(term145604, term145604.getClass(), "level", 0);
        setIntField(term145604, term145604.getClass(), "reincarnationNum", 0);
        setLongField(term145604, term145604.getClass(), "exp", 0L);
        setLongField(term145604, term145604.getClass(), "point", 0L);
        setLongField(term145604, term145604.getClass(), "totalPoint", 0L);
        setIntField(term145604, term145604.getClass(), "playCount", 0);
        setIntField(term145604, term145604.getClass(), "jewelCount", 0);
        setIntField(term145604, term145604.getClass(), "totalJewelCount", 0);
        setIntField(term145604, term145604.getClass(), "medalCount", 0);
        setIntField(term145604, term145604.getClass(), "playerRating", 0);
        setIntField(term145604, term145604.getClass(), "highestRating", 0);
        setIntField(term145604, term145604.getClass(), "battlePoint", 0);
        setIntField(term145604, term145604.getClass(), "bestBattlePoint", 0);
        setIntField(term145604, term145604.getClass(), "overDamageBattlePoint", 0);
        setIntField(term145604, term145604.getClass(), "nameplateId", 0);
        setIntField(term145604, term145604.getClass(), "trophyId", 0);
        setIntField(term145604, term145604.getClass(), "cardId", 0);
        setIntField(term145604, term145604.getClass(), "characterId", 0);
        setIntField(term145604, term145604.getClass(), "tabSetting", 0);
        setIntField(term145604, term145604.getClass(), "tabSortSetting", 0);
        setIntField(term145604, term145604.getClass(), "cardCategorySetting", 0);
        setIntField(term145604, term145604.getClass(), "cardSortSetting", 0);
        setIntField(term145604, term145604.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term145604, term145604.getClass(), "playedTutorialBit", 0);
        setIntField(term145604, term145604.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term145604, term145604.getClass(), "sumTechHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumBattleHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term145604, term145604.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term145604, term145604.getClass(), "eventWatchedDate", null);
        setField(term145604, term145604.getClass(), "cmEventWatchedDate", null);
        setField(term145604, term145604.getClass(), "firstGameId", null);
        setField(term145604, term145604.getClass(), "firstRomVersion", null);
        setField(term145604, term145604.getClass(), "firstDataVersion", null);
        setField(term145604, term145604.getClass(), "firstPlayDate", null);
        setField(term145604, term145604.getClass(), "lastGameId", null);
        setField(term145604, term145604.getClass(), "lastRomVersion", null);
        setField(term145604, term145604.getClass(), "lastDataVersion", null);
        setField(term145604, term145604.getClass(), "compatibleCmVersion", null);
        setField(term145604, term145604.getClass(), "lastPlayDate", null);
        setIntField(term145604, term145604.getClass(), "lastPlaceId", 0);
        setField(term145604, term145604.getClass(), "lastPlaceName", null);
        setIntField(term145604, term145604.getClass(), "lastRegionId", 0);
        setField(term145604, term145604.getClass(), "lastRegionName", null);
        setIntField(term145604, term145604.getClass(), "lastAllNetId", 0);
        setField(term145604, term145604.getClass(), "lastClientId", null);
        setIntField(term145604, term145604.getClass(), "lastUsedDeckId", 0);
        setIntField(term145604, term145604.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term145604, term145604.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term145604, args);
    }

};


