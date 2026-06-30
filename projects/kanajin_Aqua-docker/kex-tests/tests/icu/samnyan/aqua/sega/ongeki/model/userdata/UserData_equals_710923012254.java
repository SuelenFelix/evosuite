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

public class UserData_equals_710923012254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82920;

    public UserData_equals_710923012254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82920 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82920, term82920.getClass(), "id", 0L);
        setField(term82920, term82920.getClass(), "card", null);
        setField(term82920, term82920.getClass(), "userName", null);
        setIntField(term82920, term82920.getClass(), "level", 0);
        setIntField(term82920, term82920.getClass(), "reincarnationNum", 0);
        setLongField(term82920, term82920.getClass(), "exp", 0L);
        setLongField(term82920, term82920.getClass(), "point", 0L);
        setLongField(term82920, term82920.getClass(), "totalPoint", 0L);
        setIntField(term82920, term82920.getClass(), "playCount", 0);
        setIntField(term82920, term82920.getClass(), "jewelCount", 0);
        setIntField(term82920, term82920.getClass(), "totalJewelCount", 0);
        setIntField(term82920, term82920.getClass(), "medalCount", 0);
        setIntField(term82920, term82920.getClass(), "playerRating", 0);
        setIntField(term82920, term82920.getClass(), "highestRating", 0);
        setIntField(term82920, term82920.getClass(), "battlePoint", 0);
        setIntField(term82920, term82920.getClass(), "bestBattlePoint", 0);
        setIntField(term82920, term82920.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82920, term82920.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82920, term82920.getClass(), "nameplateId", 0);
        setIntField(term82920, term82920.getClass(), "trophyId", 0);
        setIntField(term82920, term82920.getClass(), "cardId", 0);
        setIntField(term82920, term82920.getClass(), "characterId", 0);
        setIntField(term82920, term82920.getClass(), "characterVoiceNo", 0);
        setIntField(term82920, term82920.getClass(), "tabSetting", 0);
        setIntField(term82920, term82920.getClass(), "tabSortSetting", 0);
        setIntField(term82920, term82920.getClass(), "cardCategorySetting", 0);
        setIntField(term82920, term82920.getClass(), "cardSortSetting", 0);
        setIntField(term82920, term82920.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82920, term82920.getClass(), "playedTutorialBit", 0);
        setIntField(term82920, term82920.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82920, term82920.getClass(), "sumTechHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82920, term82920.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82920, term82920.getClass(), "eventWatchedDate", null);
        setField(term82920, term82920.getClass(), "cmEventWatchedDate", null);
        setField(term82920, term82920.getClass(), "firstGameId", null);
        setField(term82920, term82920.getClass(), "firstRomVersion", null);
        setField(term82920, term82920.getClass(), "firstDataVersion", null);
        setField(term82920, term82920.getClass(), "firstPlayDate", null);
        setField(term82920, term82920.getClass(), "lastGameId", null);
        setField(term82920, term82920.getClass(), "lastRomVersion", null);
        setField(term82920, term82920.getClass(), "lastDataVersion", null);
        setField(term82920, term82920.getClass(), "compatibleCmVersion", null);
        setField(term82920, term82920.getClass(), "lastPlayDate", null);
        setIntField(term82920, term82920.getClass(), "lastPlaceId", 0);
        setField(term82920, term82920.getClass(), "lastPlaceName", null);
        setIntField(term82920, term82920.getClass(), "lastRegionId", 0);
        setField(term82920, term82920.getClass(), "lastRegionName", null);
        setIntField(term82920, term82920.getClass(), "lastAllNetId", 0);
        setField(term82920, term82920.getClass(), "lastClientId", null);
        setIntField(term82920, term82920.getClass(), "lastUsedDeckId", 0);
        setIntField(term82920, term82920.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82920, term82920.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term82920, args);
    }

};


