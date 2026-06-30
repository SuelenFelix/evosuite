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
import java.lang.Integer;

public class UserData_setJewelCount_1333999790201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80351;
     Object term80398;

    public UserData_setJewelCount_1333999790201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80351 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80351, term80351.getClass(), "id", 0L);
        setField(term80351, term80351.getClass(), "card", null);
        setField(term80351, term80351.getClass(), "userName", null);
        setIntField(term80351, term80351.getClass(), "level", 0);
        setIntField(term80351, term80351.getClass(), "reincarnationNum", 0);
        setLongField(term80351, term80351.getClass(), "exp", 0L);
        setLongField(term80351, term80351.getClass(), "point", 0L);
        setLongField(term80351, term80351.getClass(), "totalPoint", 0L);
        setIntField(term80351, term80351.getClass(), "playCount", 0);
        setIntField(term80351, term80351.getClass(), "jewelCount", 0);
        setIntField(term80351, term80351.getClass(), "totalJewelCount", 0);
        setIntField(term80351, term80351.getClass(), "medalCount", 0);
        setIntField(term80351, term80351.getClass(), "playerRating", 0);
        setIntField(term80351, term80351.getClass(), "highestRating", 0);
        setIntField(term80351, term80351.getClass(), "battlePoint", 0);
        setIntField(term80351, term80351.getClass(), "bestBattlePoint", 0);
        setIntField(term80351, term80351.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80351, term80351.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80351, term80351.getClass(), "nameplateId", 0);
        setIntField(term80351, term80351.getClass(), "trophyId", 0);
        setIntField(term80351, term80351.getClass(), "cardId", 0);
        setIntField(term80351, term80351.getClass(), "characterId", 0);
        setIntField(term80351, term80351.getClass(), "characterVoiceNo", 0);
        setIntField(term80351, term80351.getClass(), "tabSetting", 0);
        setIntField(term80351, term80351.getClass(), "tabSortSetting", 0);
        setIntField(term80351, term80351.getClass(), "cardCategorySetting", 0);
        setIntField(term80351, term80351.getClass(), "cardSortSetting", 0);
        setIntField(term80351, term80351.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80351, term80351.getClass(), "playedTutorialBit", 0);
        setIntField(term80351, term80351.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80351, term80351.getClass(), "sumTechHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80351, term80351.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80351, term80351.getClass(), "eventWatchedDate", null);
        setField(term80351, term80351.getClass(), "cmEventWatchedDate", null);
        setField(term80351, term80351.getClass(), "firstGameId", null);
        setField(term80351, term80351.getClass(), "firstRomVersion", null);
        setField(term80351, term80351.getClass(), "firstDataVersion", null);
        setField(term80351, term80351.getClass(), "firstPlayDate", null);
        setField(term80351, term80351.getClass(), "lastGameId", null);
        setField(term80351, term80351.getClass(), "lastRomVersion", null);
        setField(term80351, term80351.getClass(), "lastDataVersion", null);
        setField(term80351, term80351.getClass(), "compatibleCmVersion", null);
        setField(term80351, term80351.getClass(), "lastPlayDate", null);
        setIntField(term80351, term80351.getClass(), "lastPlaceId", 0);
        setField(term80351, term80351.getClass(), "lastPlaceName", null);
        setIntField(term80351, term80351.getClass(), "lastRegionId", 0);
        setField(term80351, term80351.getClass(), "lastRegionName", null);
        setIntField(term80351, term80351.getClass(), "lastAllNetId", 0);
        setField(term80351, term80351.getClass(), "lastClientId", null);
        setIntField(term80351, term80351.getClass(), "lastUsedDeckId", 0);
        setIntField(term80351, term80351.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80351, term80351.getClass(), "lastEmoneyBrand", 0);
        term80398 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80398;
        callMethod(klass, "setJewelCount", argTypes, term80351, args);
    }

};


