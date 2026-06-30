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

public class UserData_getTotalJewelCount_1124216440140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77470;

    public UserData_getTotalJewelCount_1124216440140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77470 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77470, term77470.getClass(), "id", 0L);
        setField(term77470, term77470.getClass(), "card", null);
        setField(term77470, term77470.getClass(), "userName", null);
        setIntField(term77470, term77470.getClass(), "level", 0);
        setIntField(term77470, term77470.getClass(), "reincarnationNum", 0);
        setLongField(term77470, term77470.getClass(), "exp", 0L);
        setLongField(term77470, term77470.getClass(), "point", 0L);
        setLongField(term77470, term77470.getClass(), "totalPoint", 0L);
        setIntField(term77470, term77470.getClass(), "playCount", 0);
        setIntField(term77470, term77470.getClass(), "jewelCount", 0);
        setIntField(term77470, term77470.getClass(), "totalJewelCount", 0);
        setIntField(term77470, term77470.getClass(), "medalCount", 0);
        setIntField(term77470, term77470.getClass(), "playerRating", 0);
        setIntField(term77470, term77470.getClass(), "highestRating", 0);
        setIntField(term77470, term77470.getClass(), "battlePoint", 0);
        setIntField(term77470, term77470.getClass(), "bestBattlePoint", 0);
        setIntField(term77470, term77470.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77470, term77470.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77470, term77470.getClass(), "nameplateId", 0);
        setIntField(term77470, term77470.getClass(), "trophyId", 0);
        setIntField(term77470, term77470.getClass(), "cardId", 0);
        setIntField(term77470, term77470.getClass(), "characterId", 0);
        setIntField(term77470, term77470.getClass(), "characterVoiceNo", 0);
        setIntField(term77470, term77470.getClass(), "tabSetting", 0);
        setIntField(term77470, term77470.getClass(), "tabSortSetting", 0);
        setIntField(term77470, term77470.getClass(), "cardCategorySetting", 0);
        setIntField(term77470, term77470.getClass(), "cardSortSetting", 0);
        setIntField(term77470, term77470.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77470, term77470.getClass(), "playedTutorialBit", 0);
        setIntField(term77470, term77470.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77470, term77470.getClass(), "sumTechHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77470, term77470.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77470, term77470.getClass(), "eventWatchedDate", null);
        setField(term77470, term77470.getClass(), "cmEventWatchedDate", null);
        setField(term77470, term77470.getClass(), "firstGameId", null);
        setField(term77470, term77470.getClass(), "firstRomVersion", null);
        setField(term77470, term77470.getClass(), "firstDataVersion", null);
        setField(term77470, term77470.getClass(), "firstPlayDate", null);
        setField(term77470, term77470.getClass(), "lastGameId", null);
        setField(term77470, term77470.getClass(), "lastRomVersion", null);
        setField(term77470, term77470.getClass(), "lastDataVersion", null);
        setField(term77470, term77470.getClass(), "compatibleCmVersion", null);
        setField(term77470, term77470.getClass(), "lastPlayDate", null);
        setIntField(term77470, term77470.getClass(), "lastPlaceId", 0);
        setField(term77470, term77470.getClass(), "lastPlaceName", null);
        setIntField(term77470, term77470.getClass(), "lastRegionId", 0);
        setField(term77470, term77470.getClass(), "lastRegionName", null);
        setIntField(term77470, term77470.getClass(), "lastAllNetId", 0);
        setField(term77470, term77470.getClass(), "lastClientId", null);
        setIntField(term77470, term77470.getClass(), "lastUsedDeckId", 0);
        setIntField(term77470, term77470.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77470, term77470.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalJewelCount", argTypes, term77470, args);
    }

};


