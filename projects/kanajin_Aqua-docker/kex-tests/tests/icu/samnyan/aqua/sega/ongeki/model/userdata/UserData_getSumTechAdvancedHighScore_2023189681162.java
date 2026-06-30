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

public class UserData_getSumTechAdvancedHighScore_2023189681162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78504;

    public UserData_getSumTechAdvancedHighScore_2023189681162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78504 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78504, term78504.getClass(), "id", 0L);
        setField(term78504, term78504.getClass(), "card", null);
        setField(term78504, term78504.getClass(), "userName", null);
        setIntField(term78504, term78504.getClass(), "level", 0);
        setIntField(term78504, term78504.getClass(), "reincarnationNum", 0);
        setLongField(term78504, term78504.getClass(), "exp", 0L);
        setLongField(term78504, term78504.getClass(), "point", 0L);
        setLongField(term78504, term78504.getClass(), "totalPoint", 0L);
        setIntField(term78504, term78504.getClass(), "playCount", 0);
        setIntField(term78504, term78504.getClass(), "jewelCount", 0);
        setIntField(term78504, term78504.getClass(), "totalJewelCount", 0);
        setIntField(term78504, term78504.getClass(), "medalCount", 0);
        setIntField(term78504, term78504.getClass(), "playerRating", 0);
        setIntField(term78504, term78504.getClass(), "highestRating", 0);
        setIntField(term78504, term78504.getClass(), "battlePoint", 0);
        setIntField(term78504, term78504.getClass(), "bestBattlePoint", 0);
        setIntField(term78504, term78504.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78504, term78504.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78504, term78504.getClass(), "nameplateId", 0);
        setIntField(term78504, term78504.getClass(), "trophyId", 0);
        setIntField(term78504, term78504.getClass(), "cardId", 0);
        setIntField(term78504, term78504.getClass(), "characterId", 0);
        setIntField(term78504, term78504.getClass(), "characterVoiceNo", 0);
        setIntField(term78504, term78504.getClass(), "tabSetting", 0);
        setIntField(term78504, term78504.getClass(), "tabSortSetting", 0);
        setIntField(term78504, term78504.getClass(), "cardCategorySetting", 0);
        setIntField(term78504, term78504.getClass(), "cardSortSetting", 0);
        setIntField(term78504, term78504.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78504, term78504.getClass(), "playedTutorialBit", 0);
        setIntField(term78504, term78504.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78504, term78504.getClass(), "sumTechHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78504, term78504.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78504, term78504.getClass(), "eventWatchedDate", null);
        setField(term78504, term78504.getClass(), "cmEventWatchedDate", null);
        setField(term78504, term78504.getClass(), "firstGameId", null);
        setField(term78504, term78504.getClass(), "firstRomVersion", null);
        setField(term78504, term78504.getClass(), "firstDataVersion", null);
        setField(term78504, term78504.getClass(), "firstPlayDate", null);
        setField(term78504, term78504.getClass(), "lastGameId", null);
        setField(term78504, term78504.getClass(), "lastRomVersion", null);
        setField(term78504, term78504.getClass(), "lastDataVersion", null);
        setField(term78504, term78504.getClass(), "compatibleCmVersion", null);
        setField(term78504, term78504.getClass(), "lastPlayDate", null);
        setIntField(term78504, term78504.getClass(), "lastPlaceId", 0);
        setField(term78504, term78504.getClass(), "lastPlaceName", null);
        setIntField(term78504, term78504.getClass(), "lastRegionId", 0);
        setField(term78504, term78504.getClass(), "lastRegionName", null);
        setIntField(term78504, term78504.getClass(), "lastAllNetId", 0);
        setField(term78504, term78504.getClass(), "lastClientId", null);
        setIntField(term78504, term78504.getClass(), "lastUsedDeckId", 0);
        setIntField(term78504, term78504.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78504, term78504.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechAdvancedHighScore", argTypes, term78504, args);
    }

};


