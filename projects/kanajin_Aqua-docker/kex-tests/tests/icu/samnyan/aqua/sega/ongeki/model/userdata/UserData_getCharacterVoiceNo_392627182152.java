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

public class UserData_getCharacterVoiceNo_392627182152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78034;

    public UserData_getCharacterVoiceNo_392627182152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78034 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78034, term78034.getClass(), "id", 0L);
        setField(term78034, term78034.getClass(), "card", null);
        setField(term78034, term78034.getClass(), "userName", null);
        setIntField(term78034, term78034.getClass(), "level", 0);
        setIntField(term78034, term78034.getClass(), "reincarnationNum", 0);
        setLongField(term78034, term78034.getClass(), "exp", 0L);
        setLongField(term78034, term78034.getClass(), "point", 0L);
        setLongField(term78034, term78034.getClass(), "totalPoint", 0L);
        setIntField(term78034, term78034.getClass(), "playCount", 0);
        setIntField(term78034, term78034.getClass(), "jewelCount", 0);
        setIntField(term78034, term78034.getClass(), "totalJewelCount", 0);
        setIntField(term78034, term78034.getClass(), "medalCount", 0);
        setIntField(term78034, term78034.getClass(), "playerRating", 0);
        setIntField(term78034, term78034.getClass(), "highestRating", 0);
        setIntField(term78034, term78034.getClass(), "battlePoint", 0);
        setIntField(term78034, term78034.getClass(), "bestBattlePoint", 0);
        setIntField(term78034, term78034.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78034, term78034.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78034, term78034.getClass(), "nameplateId", 0);
        setIntField(term78034, term78034.getClass(), "trophyId", 0);
        setIntField(term78034, term78034.getClass(), "cardId", 0);
        setIntField(term78034, term78034.getClass(), "characterId", 0);
        setIntField(term78034, term78034.getClass(), "characterVoiceNo", 0);
        setIntField(term78034, term78034.getClass(), "tabSetting", 0);
        setIntField(term78034, term78034.getClass(), "tabSortSetting", 0);
        setIntField(term78034, term78034.getClass(), "cardCategorySetting", 0);
        setIntField(term78034, term78034.getClass(), "cardSortSetting", 0);
        setIntField(term78034, term78034.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78034, term78034.getClass(), "playedTutorialBit", 0);
        setIntField(term78034, term78034.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78034, term78034.getClass(), "sumTechHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78034, term78034.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78034, term78034.getClass(), "eventWatchedDate", null);
        setField(term78034, term78034.getClass(), "cmEventWatchedDate", null);
        setField(term78034, term78034.getClass(), "firstGameId", null);
        setField(term78034, term78034.getClass(), "firstRomVersion", null);
        setField(term78034, term78034.getClass(), "firstDataVersion", null);
        setField(term78034, term78034.getClass(), "firstPlayDate", null);
        setField(term78034, term78034.getClass(), "lastGameId", null);
        setField(term78034, term78034.getClass(), "lastRomVersion", null);
        setField(term78034, term78034.getClass(), "lastDataVersion", null);
        setField(term78034, term78034.getClass(), "compatibleCmVersion", null);
        setField(term78034, term78034.getClass(), "lastPlayDate", null);
        setIntField(term78034, term78034.getClass(), "lastPlaceId", 0);
        setField(term78034, term78034.getClass(), "lastPlaceName", null);
        setIntField(term78034, term78034.getClass(), "lastRegionId", 0);
        setField(term78034, term78034.getClass(), "lastRegionName", null);
        setIntField(term78034, term78034.getClass(), "lastAllNetId", 0);
        setField(term78034, term78034.getClass(), "lastClientId", null);
        setIntField(term78034, term78034.getClass(), "lastUsedDeckId", 0);
        setIntField(term78034, term78034.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78034, term78034.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterVoiceNo", argTypes, term78034, args);
    }

};


