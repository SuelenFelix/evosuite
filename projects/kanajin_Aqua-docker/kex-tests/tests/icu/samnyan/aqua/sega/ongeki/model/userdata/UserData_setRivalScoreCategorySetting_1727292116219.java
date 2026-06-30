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

public class UserData_setRivalScoreCategorySetting_1727292116219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81233;
     Object term81280;

    public UserData_setRivalScoreCategorySetting_1727292116219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81233 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81233, term81233.getClass(), "id", 0L);
        setField(term81233, term81233.getClass(), "card", null);
        setField(term81233, term81233.getClass(), "userName", null);
        setIntField(term81233, term81233.getClass(), "level", 0);
        setIntField(term81233, term81233.getClass(), "reincarnationNum", 0);
        setLongField(term81233, term81233.getClass(), "exp", 0L);
        setLongField(term81233, term81233.getClass(), "point", 0L);
        setLongField(term81233, term81233.getClass(), "totalPoint", 0L);
        setIntField(term81233, term81233.getClass(), "playCount", 0);
        setIntField(term81233, term81233.getClass(), "jewelCount", 0);
        setIntField(term81233, term81233.getClass(), "totalJewelCount", 0);
        setIntField(term81233, term81233.getClass(), "medalCount", 0);
        setIntField(term81233, term81233.getClass(), "playerRating", 0);
        setIntField(term81233, term81233.getClass(), "highestRating", 0);
        setIntField(term81233, term81233.getClass(), "battlePoint", 0);
        setIntField(term81233, term81233.getClass(), "bestBattlePoint", 0);
        setIntField(term81233, term81233.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81233, term81233.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81233, term81233.getClass(), "nameplateId", 0);
        setIntField(term81233, term81233.getClass(), "trophyId", 0);
        setIntField(term81233, term81233.getClass(), "cardId", 0);
        setIntField(term81233, term81233.getClass(), "characterId", 0);
        setIntField(term81233, term81233.getClass(), "characterVoiceNo", 0);
        setIntField(term81233, term81233.getClass(), "tabSetting", 0);
        setIntField(term81233, term81233.getClass(), "tabSortSetting", 0);
        setIntField(term81233, term81233.getClass(), "cardCategorySetting", 0);
        setIntField(term81233, term81233.getClass(), "cardSortSetting", 0);
        setIntField(term81233, term81233.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81233, term81233.getClass(), "playedTutorialBit", 0);
        setIntField(term81233, term81233.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81233, term81233.getClass(), "sumTechHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81233, term81233.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81233, term81233.getClass(), "eventWatchedDate", null);
        setField(term81233, term81233.getClass(), "cmEventWatchedDate", null);
        setField(term81233, term81233.getClass(), "firstGameId", null);
        setField(term81233, term81233.getClass(), "firstRomVersion", null);
        setField(term81233, term81233.getClass(), "firstDataVersion", null);
        setField(term81233, term81233.getClass(), "firstPlayDate", null);
        setField(term81233, term81233.getClass(), "lastGameId", null);
        setField(term81233, term81233.getClass(), "lastRomVersion", null);
        setField(term81233, term81233.getClass(), "lastDataVersion", null);
        setField(term81233, term81233.getClass(), "compatibleCmVersion", null);
        setField(term81233, term81233.getClass(), "lastPlayDate", null);
        setIntField(term81233, term81233.getClass(), "lastPlaceId", 0);
        setField(term81233, term81233.getClass(), "lastPlaceName", null);
        setIntField(term81233, term81233.getClass(), "lastRegionId", 0);
        setField(term81233, term81233.getClass(), "lastRegionName", null);
        setIntField(term81233, term81233.getClass(), "lastAllNetId", 0);
        setField(term81233, term81233.getClass(), "lastClientId", null);
        setIntField(term81233, term81233.getClass(), "lastUsedDeckId", 0);
        setIntField(term81233, term81233.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81233, term81233.getClass(), "lastEmoneyBrand", 0);
        term81280 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81280;
        callMethod(klass, "setRivalScoreCategorySetting", argTypes, term81233, args);
    }

};


