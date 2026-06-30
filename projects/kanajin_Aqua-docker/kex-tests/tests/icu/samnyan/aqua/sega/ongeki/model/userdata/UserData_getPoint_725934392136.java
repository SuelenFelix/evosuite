package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getPoint_725934392136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77282;

    public UserData_getPoint_725934392136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77282 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77282, term77282.getClass(), "id", 0L);
        setField(term77282, term77282.getClass(), "card", null);
        setField(term77282, term77282.getClass(), "userName", null);
        setIntField(term77282, term77282.getClass(), "level", 0);
        setIntField(term77282, term77282.getClass(), "reincarnationNum", 0);
        setLongField(term77282, term77282.getClass(), "exp", 0L);
        setLongField(term77282, term77282.getClass(), "point", 0L);
        setLongField(term77282, term77282.getClass(), "totalPoint", 0L);
        setIntField(term77282, term77282.getClass(), "playCount", 0);
        setIntField(term77282, term77282.getClass(), "jewelCount", 0);
        setIntField(term77282, term77282.getClass(), "totalJewelCount", 0);
        setIntField(term77282, term77282.getClass(), "medalCount", 0);
        setIntField(term77282, term77282.getClass(), "playerRating", 0);
        setIntField(term77282, term77282.getClass(), "highestRating", 0);
        setIntField(term77282, term77282.getClass(), "battlePoint", 0);
        setIntField(term77282, term77282.getClass(), "bestBattlePoint", 0);
        setIntField(term77282, term77282.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77282, term77282.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77282, term77282.getClass(), "nameplateId", 0);
        setIntField(term77282, term77282.getClass(), "trophyId", 0);
        setIntField(term77282, term77282.getClass(), "cardId", 0);
        setIntField(term77282, term77282.getClass(), "characterId", 0);
        setIntField(term77282, term77282.getClass(), "characterVoiceNo", 0);
        setIntField(term77282, term77282.getClass(), "tabSetting", 0);
        setIntField(term77282, term77282.getClass(), "tabSortSetting", 0);
        setIntField(term77282, term77282.getClass(), "cardCategorySetting", 0);
        setIntField(term77282, term77282.getClass(), "cardSortSetting", 0);
        setIntField(term77282, term77282.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77282, term77282.getClass(), "playedTutorialBit", 0);
        setIntField(term77282, term77282.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77282, term77282.getClass(), "sumTechHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77282, term77282.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77282, term77282.getClass(), "eventWatchedDate", null);
        setField(term77282, term77282.getClass(), "cmEventWatchedDate", null);
        setField(term77282, term77282.getClass(), "firstGameId", null);
        setField(term77282, term77282.getClass(), "firstRomVersion", null);
        setField(term77282, term77282.getClass(), "firstDataVersion", null);
        setField(term77282, term77282.getClass(), "firstPlayDate", null);
        setField(term77282, term77282.getClass(), "lastGameId", null);
        setField(term77282, term77282.getClass(), "lastRomVersion", null);
        setField(term77282, term77282.getClass(), "lastDataVersion", null);
        setField(term77282, term77282.getClass(), "compatibleCmVersion", null);
        setField(term77282, term77282.getClass(), "lastPlayDate", null);
        setIntField(term77282, term77282.getClass(), "lastPlaceId", 0);
        setField(term77282, term77282.getClass(), "lastPlaceName", null);
        setIntField(term77282, term77282.getClass(), "lastRegionId", 0);
        setField(term77282, term77282.getClass(), "lastRegionName", null);
        setIntField(term77282, term77282.getClass(), "lastAllNetId", 0);
        setField(term77282, term77282.getClass(), "lastClientId", null);
        setIntField(term77282, term77282.getClass(), "lastUsedDeckId", 0);
        setIntField(term77282, term77282.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77282, term77282.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term77282, args);
    }

};


