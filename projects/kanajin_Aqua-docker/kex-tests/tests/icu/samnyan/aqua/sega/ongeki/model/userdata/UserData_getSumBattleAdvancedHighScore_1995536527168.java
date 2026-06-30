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

public class UserData_getSumBattleAdvancedHighScore_1995536527168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78786;

    public UserData_getSumBattleAdvancedHighScore_1995536527168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78786 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78786, term78786.getClass(), "id", 0L);
        setField(term78786, term78786.getClass(), "card", null);
        setField(term78786, term78786.getClass(), "userName", null);
        setIntField(term78786, term78786.getClass(), "level", 0);
        setIntField(term78786, term78786.getClass(), "reincarnationNum", 0);
        setLongField(term78786, term78786.getClass(), "exp", 0L);
        setLongField(term78786, term78786.getClass(), "point", 0L);
        setLongField(term78786, term78786.getClass(), "totalPoint", 0L);
        setIntField(term78786, term78786.getClass(), "playCount", 0);
        setIntField(term78786, term78786.getClass(), "jewelCount", 0);
        setIntField(term78786, term78786.getClass(), "totalJewelCount", 0);
        setIntField(term78786, term78786.getClass(), "medalCount", 0);
        setIntField(term78786, term78786.getClass(), "playerRating", 0);
        setIntField(term78786, term78786.getClass(), "highestRating", 0);
        setIntField(term78786, term78786.getClass(), "battlePoint", 0);
        setIntField(term78786, term78786.getClass(), "bestBattlePoint", 0);
        setIntField(term78786, term78786.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78786, term78786.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78786, term78786.getClass(), "nameplateId", 0);
        setIntField(term78786, term78786.getClass(), "trophyId", 0);
        setIntField(term78786, term78786.getClass(), "cardId", 0);
        setIntField(term78786, term78786.getClass(), "characterId", 0);
        setIntField(term78786, term78786.getClass(), "characterVoiceNo", 0);
        setIntField(term78786, term78786.getClass(), "tabSetting", 0);
        setIntField(term78786, term78786.getClass(), "tabSortSetting", 0);
        setIntField(term78786, term78786.getClass(), "cardCategorySetting", 0);
        setIntField(term78786, term78786.getClass(), "cardSortSetting", 0);
        setIntField(term78786, term78786.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78786, term78786.getClass(), "playedTutorialBit", 0);
        setIntField(term78786, term78786.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78786, term78786.getClass(), "sumTechHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78786, term78786.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78786, term78786.getClass(), "eventWatchedDate", null);
        setField(term78786, term78786.getClass(), "cmEventWatchedDate", null);
        setField(term78786, term78786.getClass(), "firstGameId", null);
        setField(term78786, term78786.getClass(), "firstRomVersion", null);
        setField(term78786, term78786.getClass(), "firstDataVersion", null);
        setField(term78786, term78786.getClass(), "firstPlayDate", null);
        setField(term78786, term78786.getClass(), "lastGameId", null);
        setField(term78786, term78786.getClass(), "lastRomVersion", null);
        setField(term78786, term78786.getClass(), "lastDataVersion", null);
        setField(term78786, term78786.getClass(), "compatibleCmVersion", null);
        setField(term78786, term78786.getClass(), "lastPlayDate", null);
        setIntField(term78786, term78786.getClass(), "lastPlaceId", 0);
        setField(term78786, term78786.getClass(), "lastPlaceName", null);
        setIntField(term78786, term78786.getClass(), "lastRegionId", 0);
        setField(term78786, term78786.getClass(), "lastRegionName", null);
        setIntField(term78786, term78786.getClass(), "lastAllNetId", 0);
        setField(term78786, term78786.getClass(), "lastClientId", null);
        setIntField(term78786, term78786.getClass(), "lastUsedDeckId", 0);
        setIntField(term78786, term78786.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78786, term78786.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleAdvancedHighScore", argTypes, term78786, args);
    }

};


