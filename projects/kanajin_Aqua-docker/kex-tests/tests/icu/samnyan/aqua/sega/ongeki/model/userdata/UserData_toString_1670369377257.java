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

public class UserData_toString_1670369377257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83061;

    public UserData_toString_1670369377257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83061 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term83061, term83061.getClass(), "id", 0L);
        setField(term83061, term83061.getClass(), "card", null);
        setField(term83061, term83061.getClass(), "userName", null);
        setIntField(term83061, term83061.getClass(), "level", 0);
        setIntField(term83061, term83061.getClass(), "reincarnationNum", 0);
        setLongField(term83061, term83061.getClass(), "exp", 0L);
        setLongField(term83061, term83061.getClass(), "point", 0L);
        setLongField(term83061, term83061.getClass(), "totalPoint", 0L);
        setIntField(term83061, term83061.getClass(), "playCount", 0);
        setIntField(term83061, term83061.getClass(), "jewelCount", 0);
        setIntField(term83061, term83061.getClass(), "totalJewelCount", 0);
        setIntField(term83061, term83061.getClass(), "medalCount", 0);
        setIntField(term83061, term83061.getClass(), "playerRating", 0);
        setIntField(term83061, term83061.getClass(), "highestRating", 0);
        setIntField(term83061, term83061.getClass(), "battlePoint", 0);
        setIntField(term83061, term83061.getClass(), "bestBattlePoint", 0);
        setIntField(term83061, term83061.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term83061, term83061.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term83061, term83061.getClass(), "nameplateId", 0);
        setIntField(term83061, term83061.getClass(), "trophyId", 0);
        setIntField(term83061, term83061.getClass(), "cardId", 0);
        setIntField(term83061, term83061.getClass(), "characterId", 0);
        setIntField(term83061, term83061.getClass(), "characterVoiceNo", 0);
        setIntField(term83061, term83061.getClass(), "tabSetting", 0);
        setIntField(term83061, term83061.getClass(), "tabSortSetting", 0);
        setIntField(term83061, term83061.getClass(), "cardCategorySetting", 0);
        setIntField(term83061, term83061.getClass(), "cardSortSetting", 0);
        setIntField(term83061, term83061.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term83061, term83061.getClass(), "playedTutorialBit", 0);
        setIntField(term83061, term83061.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term83061, term83061.getClass(), "sumTechHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumBattleHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term83061, term83061.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term83061, term83061.getClass(), "eventWatchedDate", null);
        setField(term83061, term83061.getClass(), "cmEventWatchedDate", null);
        setField(term83061, term83061.getClass(), "firstGameId", null);
        setField(term83061, term83061.getClass(), "firstRomVersion", null);
        setField(term83061, term83061.getClass(), "firstDataVersion", null);
        setField(term83061, term83061.getClass(), "firstPlayDate", null);
        setField(term83061, term83061.getClass(), "lastGameId", null);
        setField(term83061, term83061.getClass(), "lastRomVersion", null);
        setField(term83061, term83061.getClass(), "lastDataVersion", null);
        setField(term83061, term83061.getClass(), "compatibleCmVersion", null);
        setField(term83061, term83061.getClass(), "lastPlayDate", null);
        setIntField(term83061, term83061.getClass(), "lastPlaceId", 0);
        setField(term83061, term83061.getClass(), "lastPlaceName", null);
        setIntField(term83061, term83061.getClass(), "lastRegionId", 0);
        setField(term83061, term83061.getClass(), "lastRegionName", null);
        setIntField(term83061, term83061.getClass(), "lastAllNetId", 0);
        setField(term83061, term83061.getClass(), "lastClientId", null);
        setIntField(term83061, term83061.getClass(), "lastUsedDeckId", 0);
        setIntField(term83061, term83061.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term83061, term83061.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term83061, args);
    }

};


