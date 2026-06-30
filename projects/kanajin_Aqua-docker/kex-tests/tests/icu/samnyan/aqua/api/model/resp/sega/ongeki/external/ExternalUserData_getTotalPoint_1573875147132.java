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

public class ExternalUserData_getTotalPoint_1573875147132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3214470;

    public ExternalUserData_getTotalPoint_1573875147132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3214470 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3214470, term3214470.getClass(), "accessCode", null);
        setField(term3214470, term3214470.getClass(), "userName", null);
        setIntField(term3214470, term3214470.getClass(), "level", 0);
        setIntField(term3214470, term3214470.getClass(), "reincarnationNum", 0);
        setLongField(term3214470, term3214470.getClass(), "exp", 0L);
        setLongField(term3214470, term3214470.getClass(), "point", 0L);
        setLongField(term3214470, term3214470.getClass(), "totalPoint", 0L);
        setIntField(term3214470, term3214470.getClass(), "playCount", 0);
        setIntField(term3214470, term3214470.getClass(), "jewelCount", 0);
        setIntField(term3214470, term3214470.getClass(), "totalJewelCount", 0);
        setIntField(term3214470, term3214470.getClass(), "medalCount", 0);
        setIntField(term3214470, term3214470.getClass(), "playerRating", 0);
        setIntField(term3214470, term3214470.getClass(), "highestRating", 0);
        setIntField(term3214470, term3214470.getClass(), "battlePoint", 0);
        setIntField(term3214470, term3214470.getClass(), "bestBattlePoint", 0);
        setIntField(term3214470, term3214470.getClass(), "overDamageBattlePoint", 0);
        setIntField(term3214470, term3214470.getClass(), "nameplateId", 0);
        setIntField(term3214470, term3214470.getClass(), "trophyId", 0);
        setIntField(term3214470, term3214470.getClass(), "cardId", 0);
        setIntField(term3214470, term3214470.getClass(), "characterId", 0);
        setIntField(term3214470, term3214470.getClass(), "tabSetting", 0);
        setIntField(term3214470, term3214470.getClass(), "tabSortSetting", 0);
        setIntField(term3214470, term3214470.getClass(), "cardCategorySetting", 0);
        setIntField(term3214470, term3214470.getClass(), "cardSortSetting", 0);
        setIntField(term3214470, term3214470.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term3214470, term3214470.getClass(), "playedTutorialBit", 0);
        setIntField(term3214470, term3214470.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term3214470, term3214470.getClass(), "sumTechHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumBattleHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term3214470, term3214470.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term3214470, term3214470.getClass(), "eventWatchedDate", null);
        setField(term3214470, term3214470.getClass(), "cmEventWatchedDate", null);
        setField(term3214470, term3214470.getClass(), "firstGameId", null);
        setField(term3214470, term3214470.getClass(), "firstRomVersion", null);
        setField(term3214470, term3214470.getClass(), "firstDataVersion", null);
        setField(term3214470, term3214470.getClass(), "firstPlayDate", null);
        setField(term3214470, term3214470.getClass(), "lastGameId", null);
        setField(term3214470, term3214470.getClass(), "lastRomVersion", null);
        setField(term3214470, term3214470.getClass(), "lastDataVersion", null);
        setField(term3214470, term3214470.getClass(), "compatibleCmVersion", null);
        setField(term3214470, term3214470.getClass(), "lastPlayDate", null);
        setIntField(term3214470, term3214470.getClass(), "lastPlaceId", 0);
        setField(term3214470, term3214470.getClass(), "lastPlaceName", null);
        setIntField(term3214470, term3214470.getClass(), "lastRegionId", 0);
        setField(term3214470, term3214470.getClass(), "lastRegionName", null);
        setIntField(term3214470, term3214470.getClass(), "lastAllNetId", 0);
        setField(term3214470, term3214470.getClass(), "lastClientId", null);
        setIntField(term3214470, term3214470.getClass(), "lastUsedDeckId", 0);
        setIntField(term3214470, term3214470.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term3214470, term3214470.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term3214470, args);
    }

};


