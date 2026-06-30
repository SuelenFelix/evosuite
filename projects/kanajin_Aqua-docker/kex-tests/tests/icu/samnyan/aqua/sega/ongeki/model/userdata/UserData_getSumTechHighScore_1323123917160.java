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

public class UserData_getSumTechHighScore_1323123917160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78410;

    public UserData_getSumTechHighScore_1323123917160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78410 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78410, term78410.getClass(), "id", 0L);
        setField(term78410, term78410.getClass(), "card", null);
        setField(term78410, term78410.getClass(), "userName", null);
        setIntField(term78410, term78410.getClass(), "level", 0);
        setIntField(term78410, term78410.getClass(), "reincarnationNum", 0);
        setLongField(term78410, term78410.getClass(), "exp", 0L);
        setLongField(term78410, term78410.getClass(), "point", 0L);
        setLongField(term78410, term78410.getClass(), "totalPoint", 0L);
        setIntField(term78410, term78410.getClass(), "playCount", 0);
        setIntField(term78410, term78410.getClass(), "jewelCount", 0);
        setIntField(term78410, term78410.getClass(), "totalJewelCount", 0);
        setIntField(term78410, term78410.getClass(), "medalCount", 0);
        setIntField(term78410, term78410.getClass(), "playerRating", 0);
        setIntField(term78410, term78410.getClass(), "highestRating", 0);
        setIntField(term78410, term78410.getClass(), "battlePoint", 0);
        setIntField(term78410, term78410.getClass(), "bestBattlePoint", 0);
        setIntField(term78410, term78410.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78410, term78410.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78410, term78410.getClass(), "nameplateId", 0);
        setIntField(term78410, term78410.getClass(), "trophyId", 0);
        setIntField(term78410, term78410.getClass(), "cardId", 0);
        setIntField(term78410, term78410.getClass(), "characterId", 0);
        setIntField(term78410, term78410.getClass(), "characterVoiceNo", 0);
        setIntField(term78410, term78410.getClass(), "tabSetting", 0);
        setIntField(term78410, term78410.getClass(), "tabSortSetting", 0);
        setIntField(term78410, term78410.getClass(), "cardCategorySetting", 0);
        setIntField(term78410, term78410.getClass(), "cardSortSetting", 0);
        setIntField(term78410, term78410.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78410, term78410.getClass(), "playedTutorialBit", 0);
        setIntField(term78410, term78410.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78410, term78410.getClass(), "sumTechHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78410, term78410.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78410, term78410.getClass(), "eventWatchedDate", null);
        setField(term78410, term78410.getClass(), "cmEventWatchedDate", null);
        setField(term78410, term78410.getClass(), "firstGameId", null);
        setField(term78410, term78410.getClass(), "firstRomVersion", null);
        setField(term78410, term78410.getClass(), "firstDataVersion", null);
        setField(term78410, term78410.getClass(), "firstPlayDate", null);
        setField(term78410, term78410.getClass(), "lastGameId", null);
        setField(term78410, term78410.getClass(), "lastRomVersion", null);
        setField(term78410, term78410.getClass(), "lastDataVersion", null);
        setField(term78410, term78410.getClass(), "compatibleCmVersion", null);
        setField(term78410, term78410.getClass(), "lastPlayDate", null);
        setIntField(term78410, term78410.getClass(), "lastPlaceId", 0);
        setField(term78410, term78410.getClass(), "lastPlaceName", null);
        setIntField(term78410, term78410.getClass(), "lastRegionId", 0);
        setField(term78410, term78410.getClass(), "lastRegionName", null);
        setIntField(term78410, term78410.getClass(), "lastAllNetId", 0);
        setField(term78410, term78410.getClass(), "lastClientId", null);
        setIntField(term78410, term78410.getClass(), "lastUsedDeckId", 0);
        setIntField(term78410, term78410.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78410, term78410.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechHighScore", argTypes, term78410, args);
    }

};


