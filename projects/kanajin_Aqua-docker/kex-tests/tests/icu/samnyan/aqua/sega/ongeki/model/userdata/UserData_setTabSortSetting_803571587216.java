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

public class UserData_setTabSortSetting_803571587216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81086;
     Object term81133;

    public UserData_setTabSortSetting_803571587216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81086 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81086, term81086.getClass(), "id", 0L);
        setField(term81086, term81086.getClass(), "card", null);
        setField(term81086, term81086.getClass(), "userName", null);
        setIntField(term81086, term81086.getClass(), "level", 0);
        setIntField(term81086, term81086.getClass(), "reincarnationNum", 0);
        setLongField(term81086, term81086.getClass(), "exp", 0L);
        setLongField(term81086, term81086.getClass(), "point", 0L);
        setLongField(term81086, term81086.getClass(), "totalPoint", 0L);
        setIntField(term81086, term81086.getClass(), "playCount", 0);
        setIntField(term81086, term81086.getClass(), "jewelCount", 0);
        setIntField(term81086, term81086.getClass(), "totalJewelCount", 0);
        setIntField(term81086, term81086.getClass(), "medalCount", 0);
        setIntField(term81086, term81086.getClass(), "playerRating", 0);
        setIntField(term81086, term81086.getClass(), "highestRating", 0);
        setIntField(term81086, term81086.getClass(), "battlePoint", 0);
        setIntField(term81086, term81086.getClass(), "bestBattlePoint", 0);
        setIntField(term81086, term81086.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81086, term81086.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81086, term81086.getClass(), "nameplateId", 0);
        setIntField(term81086, term81086.getClass(), "trophyId", 0);
        setIntField(term81086, term81086.getClass(), "cardId", 0);
        setIntField(term81086, term81086.getClass(), "characterId", 0);
        setIntField(term81086, term81086.getClass(), "characterVoiceNo", 0);
        setIntField(term81086, term81086.getClass(), "tabSetting", 0);
        setIntField(term81086, term81086.getClass(), "tabSortSetting", 0);
        setIntField(term81086, term81086.getClass(), "cardCategorySetting", 0);
        setIntField(term81086, term81086.getClass(), "cardSortSetting", 0);
        setIntField(term81086, term81086.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81086, term81086.getClass(), "playedTutorialBit", 0);
        setIntField(term81086, term81086.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81086, term81086.getClass(), "sumTechHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81086, term81086.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81086, term81086.getClass(), "eventWatchedDate", null);
        setField(term81086, term81086.getClass(), "cmEventWatchedDate", null);
        setField(term81086, term81086.getClass(), "firstGameId", null);
        setField(term81086, term81086.getClass(), "firstRomVersion", null);
        setField(term81086, term81086.getClass(), "firstDataVersion", null);
        setField(term81086, term81086.getClass(), "firstPlayDate", null);
        setField(term81086, term81086.getClass(), "lastGameId", null);
        setField(term81086, term81086.getClass(), "lastRomVersion", null);
        setField(term81086, term81086.getClass(), "lastDataVersion", null);
        setField(term81086, term81086.getClass(), "compatibleCmVersion", null);
        setField(term81086, term81086.getClass(), "lastPlayDate", null);
        setIntField(term81086, term81086.getClass(), "lastPlaceId", 0);
        setField(term81086, term81086.getClass(), "lastPlaceName", null);
        setIntField(term81086, term81086.getClass(), "lastRegionId", 0);
        setField(term81086, term81086.getClass(), "lastRegionName", null);
        setIntField(term81086, term81086.getClass(), "lastAllNetId", 0);
        setField(term81086, term81086.getClass(), "lastClientId", null);
        setIntField(term81086, term81086.getClass(), "lastUsedDeckId", 0);
        setIntField(term81086, term81086.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81086, term81086.getClass(), "lastEmoneyBrand", 0);
        term81133 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81133;
        callMethod(klass, "setTabSortSetting", argTypes, term81086, args);
    }

};


