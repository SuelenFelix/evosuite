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

public class UserData_getHighestRating_1766657479143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77611;

    public UserData_getHighestRating_1766657479143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77611 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77611, term77611.getClass(), "id", 0L);
        setField(term77611, term77611.getClass(), "card", null);
        setField(term77611, term77611.getClass(), "userName", null);
        setIntField(term77611, term77611.getClass(), "level", 0);
        setIntField(term77611, term77611.getClass(), "reincarnationNum", 0);
        setLongField(term77611, term77611.getClass(), "exp", 0L);
        setLongField(term77611, term77611.getClass(), "point", 0L);
        setLongField(term77611, term77611.getClass(), "totalPoint", 0L);
        setIntField(term77611, term77611.getClass(), "playCount", 0);
        setIntField(term77611, term77611.getClass(), "jewelCount", 0);
        setIntField(term77611, term77611.getClass(), "totalJewelCount", 0);
        setIntField(term77611, term77611.getClass(), "medalCount", 0);
        setIntField(term77611, term77611.getClass(), "playerRating", 0);
        setIntField(term77611, term77611.getClass(), "highestRating", 0);
        setIntField(term77611, term77611.getClass(), "battlePoint", 0);
        setIntField(term77611, term77611.getClass(), "bestBattlePoint", 0);
        setIntField(term77611, term77611.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77611, term77611.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77611, term77611.getClass(), "nameplateId", 0);
        setIntField(term77611, term77611.getClass(), "trophyId", 0);
        setIntField(term77611, term77611.getClass(), "cardId", 0);
        setIntField(term77611, term77611.getClass(), "characterId", 0);
        setIntField(term77611, term77611.getClass(), "characterVoiceNo", 0);
        setIntField(term77611, term77611.getClass(), "tabSetting", 0);
        setIntField(term77611, term77611.getClass(), "tabSortSetting", 0);
        setIntField(term77611, term77611.getClass(), "cardCategorySetting", 0);
        setIntField(term77611, term77611.getClass(), "cardSortSetting", 0);
        setIntField(term77611, term77611.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77611, term77611.getClass(), "playedTutorialBit", 0);
        setIntField(term77611, term77611.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77611, term77611.getClass(), "sumTechHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77611, term77611.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77611, term77611.getClass(), "eventWatchedDate", null);
        setField(term77611, term77611.getClass(), "cmEventWatchedDate", null);
        setField(term77611, term77611.getClass(), "firstGameId", null);
        setField(term77611, term77611.getClass(), "firstRomVersion", null);
        setField(term77611, term77611.getClass(), "firstDataVersion", null);
        setField(term77611, term77611.getClass(), "firstPlayDate", null);
        setField(term77611, term77611.getClass(), "lastGameId", null);
        setField(term77611, term77611.getClass(), "lastRomVersion", null);
        setField(term77611, term77611.getClass(), "lastDataVersion", null);
        setField(term77611, term77611.getClass(), "compatibleCmVersion", null);
        setField(term77611, term77611.getClass(), "lastPlayDate", null);
        setIntField(term77611, term77611.getClass(), "lastPlaceId", 0);
        setField(term77611, term77611.getClass(), "lastPlaceName", null);
        setIntField(term77611, term77611.getClass(), "lastRegionId", 0);
        setField(term77611, term77611.getClass(), "lastRegionName", null);
        setIntField(term77611, term77611.getClass(), "lastAllNetId", 0);
        setField(term77611, term77611.getClass(), "lastClientId", null);
        setIntField(term77611, term77611.getClass(), "lastUsedDeckId", 0);
        setIntField(term77611, term77611.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77611, term77611.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term77611, args);
    }

};


