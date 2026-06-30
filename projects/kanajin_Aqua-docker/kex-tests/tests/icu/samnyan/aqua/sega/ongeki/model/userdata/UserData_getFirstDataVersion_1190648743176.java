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

public class UserData_getFirstDataVersion_1190648743176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79162;

    public UserData_getFirstDataVersion_1190648743176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79162 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79162, term79162.getClass(), "id", 0L);
        setField(term79162, term79162.getClass(), "card", null);
        setField(term79162, term79162.getClass(), "userName", null);
        setIntField(term79162, term79162.getClass(), "level", 0);
        setIntField(term79162, term79162.getClass(), "reincarnationNum", 0);
        setLongField(term79162, term79162.getClass(), "exp", 0L);
        setLongField(term79162, term79162.getClass(), "point", 0L);
        setLongField(term79162, term79162.getClass(), "totalPoint", 0L);
        setIntField(term79162, term79162.getClass(), "playCount", 0);
        setIntField(term79162, term79162.getClass(), "jewelCount", 0);
        setIntField(term79162, term79162.getClass(), "totalJewelCount", 0);
        setIntField(term79162, term79162.getClass(), "medalCount", 0);
        setIntField(term79162, term79162.getClass(), "playerRating", 0);
        setIntField(term79162, term79162.getClass(), "highestRating", 0);
        setIntField(term79162, term79162.getClass(), "battlePoint", 0);
        setIntField(term79162, term79162.getClass(), "bestBattlePoint", 0);
        setIntField(term79162, term79162.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79162, term79162.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79162, term79162.getClass(), "nameplateId", 0);
        setIntField(term79162, term79162.getClass(), "trophyId", 0);
        setIntField(term79162, term79162.getClass(), "cardId", 0);
        setIntField(term79162, term79162.getClass(), "characterId", 0);
        setIntField(term79162, term79162.getClass(), "characterVoiceNo", 0);
        setIntField(term79162, term79162.getClass(), "tabSetting", 0);
        setIntField(term79162, term79162.getClass(), "tabSortSetting", 0);
        setIntField(term79162, term79162.getClass(), "cardCategorySetting", 0);
        setIntField(term79162, term79162.getClass(), "cardSortSetting", 0);
        setIntField(term79162, term79162.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79162, term79162.getClass(), "playedTutorialBit", 0);
        setIntField(term79162, term79162.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79162, term79162.getClass(), "sumTechHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79162, term79162.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79162, term79162.getClass(), "eventWatchedDate", null);
        setField(term79162, term79162.getClass(), "cmEventWatchedDate", null);
        setField(term79162, term79162.getClass(), "firstGameId", null);
        setField(term79162, term79162.getClass(), "firstRomVersion", null);
        setField(term79162, term79162.getClass(), "firstDataVersion", null);
        setField(term79162, term79162.getClass(), "firstPlayDate", null);
        setField(term79162, term79162.getClass(), "lastGameId", null);
        setField(term79162, term79162.getClass(), "lastRomVersion", null);
        setField(term79162, term79162.getClass(), "lastDataVersion", null);
        setField(term79162, term79162.getClass(), "compatibleCmVersion", null);
        setField(term79162, term79162.getClass(), "lastPlayDate", null);
        setIntField(term79162, term79162.getClass(), "lastPlaceId", 0);
        setField(term79162, term79162.getClass(), "lastPlaceName", null);
        setIntField(term79162, term79162.getClass(), "lastRegionId", 0);
        setField(term79162, term79162.getClass(), "lastRegionName", null);
        setIntField(term79162, term79162.getClass(), "lastAllNetId", 0);
        setField(term79162, term79162.getClass(), "lastClientId", null);
        setIntField(term79162, term79162.getClass(), "lastUsedDeckId", 0);
        setIntField(term79162, term79162.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79162, term79162.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term79162, args);
    }

};


