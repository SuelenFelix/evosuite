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

public class UserData_getTabSetting_1296831999153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78081;

    public UserData_getTabSetting_1296831999153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78081 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78081, term78081.getClass(), "id", 0L);
        setField(term78081, term78081.getClass(), "card", null);
        setField(term78081, term78081.getClass(), "userName", null);
        setIntField(term78081, term78081.getClass(), "level", 0);
        setIntField(term78081, term78081.getClass(), "reincarnationNum", 0);
        setLongField(term78081, term78081.getClass(), "exp", 0L);
        setLongField(term78081, term78081.getClass(), "point", 0L);
        setLongField(term78081, term78081.getClass(), "totalPoint", 0L);
        setIntField(term78081, term78081.getClass(), "playCount", 0);
        setIntField(term78081, term78081.getClass(), "jewelCount", 0);
        setIntField(term78081, term78081.getClass(), "totalJewelCount", 0);
        setIntField(term78081, term78081.getClass(), "medalCount", 0);
        setIntField(term78081, term78081.getClass(), "playerRating", 0);
        setIntField(term78081, term78081.getClass(), "highestRating", 0);
        setIntField(term78081, term78081.getClass(), "battlePoint", 0);
        setIntField(term78081, term78081.getClass(), "bestBattlePoint", 0);
        setIntField(term78081, term78081.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78081, term78081.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78081, term78081.getClass(), "nameplateId", 0);
        setIntField(term78081, term78081.getClass(), "trophyId", 0);
        setIntField(term78081, term78081.getClass(), "cardId", 0);
        setIntField(term78081, term78081.getClass(), "characterId", 0);
        setIntField(term78081, term78081.getClass(), "characterVoiceNo", 0);
        setIntField(term78081, term78081.getClass(), "tabSetting", 0);
        setIntField(term78081, term78081.getClass(), "tabSortSetting", 0);
        setIntField(term78081, term78081.getClass(), "cardCategorySetting", 0);
        setIntField(term78081, term78081.getClass(), "cardSortSetting", 0);
        setIntField(term78081, term78081.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78081, term78081.getClass(), "playedTutorialBit", 0);
        setIntField(term78081, term78081.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78081, term78081.getClass(), "sumTechHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78081, term78081.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78081, term78081.getClass(), "eventWatchedDate", null);
        setField(term78081, term78081.getClass(), "cmEventWatchedDate", null);
        setField(term78081, term78081.getClass(), "firstGameId", null);
        setField(term78081, term78081.getClass(), "firstRomVersion", null);
        setField(term78081, term78081.getClass(), "firstDataVersion", null);
        setField(term78081, term78081.getClass(), "firstPlayDate", null);
        setField(term78081, term78081.getClass(), "lastGameId", null);
        setField(term78081, term78081.getClass(), "lastRomVersion", null);
        setField(term78081, term78081.getClass(), "lastDataVersion", null);
        setField(term78081, term78081.getClass(), "compatibleCmVersion", null);
        setField(term78081, term78081.getClass(), "lastPlayDate", null);
        setIntField(term78081, term78081.getClass(), "lastPlaceId", 0);
        setField(term78081, term78081.getClass(), "lastPlaceName", null);
        setIntField(term78081, term78081.getClass(), "lastRegionId", 0);
        setField(term78081, term78081.getClass(), "lastRegionName", null);
        setIntField(term78081, term78081.getClass(), "lastAllNetId", 0);
        setField(term78081, term78081.getClass(), "lastClientId", null);
        setIntField(term78081, term78081.getClass(), "lastUsedDeckId", 0);
        setIntField(term78081, term78081.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78081, term78081.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSetting", argTypes, term78081, args);
    }

};


