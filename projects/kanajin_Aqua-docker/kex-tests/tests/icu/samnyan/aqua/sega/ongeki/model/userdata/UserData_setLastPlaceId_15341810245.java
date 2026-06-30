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

public class UserData_setLastPlaceId_15341810245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82485;
     Object term82532;

    public UserData_setLastPlaceId_15341810245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82485 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82485, term82485.getClass(), "id", 0L);
        setField(term82485, term82485.getClass(), "card", null);
        setField(term82485, term82485.getClass(), "userName", null);
        setIntField(term82485, term82485.getClass(), "level", 0);
        setIntField(term82485, term82485.getClass(), "reincarnationNum", 0);
        setLongField(term82485, term82485.getClass(), "exp", 0L);
        setLongField(term82485, term82485.getClass(), "point", 0L);
        setLongField(term82485, term82485.getClass(), "totalPoint", 0L);
        setIntField(term82485, term82485.getClass(), "playCount", 0);
        setIntField(term82485, term82485.getClass(), "jewelCount", 0);
        setIntField(term82485, term82485.getClass(), "totalJewelCount", 0);
        setIntField(term82485, term82485.getClass(), "medalCount", 0);
        setIntField(term82485, term82485.getClass(), "playerRating", 0);
        setIntField(term82485, term82485.getClass(), "highestRating", 0);
        setIntField(term82485, term82485.getClass(), "battlePoint", 0);
        setIntField(term82485, term82485.getClass(), "bestBattlePoint", 0);
        setIntField(term82485, term82485.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82485, term82485.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82485, term82485.getClass(), "nameplateId", 0);
        setIntField(term82485, term82485.getClass(), "trophyId", 0);
        setIntField(term82485, term82485.getClass(), "cardId", 0);
        setIntField(term82485, term82485.getClass(), "characterId", 0);
        setIntField(term82485, term82485.getClass(), "characterVoiceNo", 0);
        setIntField(term82485, term82485.getClass(), "tabSetting", 0);
        setIntField(term82485, term82485.getClass(), "tabSortSetting", 0);
        setIntField(term82485, term82485.getClass(), "cardCategorySetting", 0);
        setIntField(term82485, term82485.getClass(), "cardSortSetting", 0);
        setIntField(term82485, term82485.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82485, term82485.getClass(), "playedTutorialBit", 0);
        setIntField(term82485, term82485.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82485, term82485.getClass(), "sumTechHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82485, term82485.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82485, term82485.getClass(), "eventWatchedDate", null);
        setField(term82485, term82485.getClass(), "cmEventWatchedDate", null);
        setField(term82485, term82485.getClass(), "firstGameId", null);
        setField(term82485, term82485.getClass(), "firstRomVersion", null);
        setField(term82485, term82485.getClass(), "firstDataVersion", null);
        setField(term82485, term82485.getClass(), "firstPlayDate", null);
        setField(term82485, term82485.getClass(), "lastGameId", null);
        setField(term82485, term82485.getClass(), "lastRomVersion", null);
        setField(term82485, term82485.getClass(), "lastDataVersion", null);
        setField(term82485, term82485.getClass(), "compatibleCmVersion", null);
        setField(term82485, term82485.getClass(), "lastPlayDate", null);
        setIntField(term82485, term82485.getClass(), "lastPlaceId", 0);
        setField(term82485, term82485.getClass(), "lastPlaceName", null);
        setIntField(term82485, term82485.getClass(), "lastRegionId", 0);
        setField(term82485, term82485.getClass(), "lastRegionName", null);
        setIntField(term82485, term82485.getClass(), "lastAllNetId", 0);
        setField(term82485, term82485.getClass(), "lastClientId", null);
        setIntField(term82485, term82485.getClass(), "lastUsedDeckId", 0);
        setIntField(term82485, term82485.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82485, term82485.getClass(), "lastEmoneyBrand", 0);
        term82532 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82532;
        callMethod(klass, "setLastPlaceId", argTypes, term82485, args);
    }

};


