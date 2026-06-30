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
import java.lang.Long;

public class UserData_setId_626094081192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79914;
     Object term79961;

    public UserData_setId_626094081192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79914 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79914, term79914.getClass(), "id", 0L);
        setField(term79914, term79914.getClass(), "card", null);
        setField(term79914, term79914.getClass(), "userName", null);
        setIntField(term79914, term79914.getClass(), "level", 0);
        setIntField(term79914, term79914.getClass(), "reincarnationNum", 0);
        setLongField(term79914, term79914.getClass(), "exp", 0L);
        setLongField(term79914, term79914.getClass(), "point", 0L);
        setLongField(term79914, term79914.getClass(), "totalPoint", 0L);
        setIntField(term79914, term79914.getClass(), "playCount", 0);
        setIntField(term79914, term79914.getClass(), "jewelCount", 0);
        setIntField(term79914, term79914.getClass(), "totalJewelCount", 0);
        setIntField(term79914, term79914.getClass(), "medalCount", 0);
        setIntField(term79914, term79914.getClass(), "playerRating", 0);
        setIntField(term79914, term79914.getClass(), "highestRating", 0);
        setIntField(term79914, term79914.getClass(), "battlePoint", 0);
        setIntField(term79914, term79914.getClass(), "bestBattlePoint", 0);
        setIntField(term79914, term79914.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79914, term79914.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79914, term79914.getClass(), "nameplateId", 0);
        setIntField(term79914, term79914.getClass(), "trophyId", 0);
        setIntField(term79914, term79914.getClass(), "cardId", 0);
        setIntField(term79914, term79914.getClass(), "characterId", 0);
        setIntField(term79914, term79914.getClass(), "characterVoiceNo", 0);
        setIntField(term79914, term79914.getClass(), "tabSetting", 0);
        setIntField(term79914, term79914.getClass(), "tabSortSetting", 0);
        setIntField(term79914, term79914.getClass(), "cardCategorySetting", 0);
        setIntField(term79914, term79914.getClass(), "cardSortSetting", 0);
        setIntField(term79914, term79914.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79914, term79914.getClass(), "playedTutorialBit", 0);
        setIntField(term79914, term79914.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79914, term79914.getClass(), "sumTechHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79914, term79914.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79914, term79914.getClass(), "eventWatchedDate", null);
        setField(term79914, term79914.getClass(), "cmEventWatchedDate", null);
        setField(term79914, term79914.getClass(), "firstGameId", null);
        setField(term79914, term79914.getClass(), "firstRomVersion", null);
        setField(term79914, term79914.getClass(), "firstDataVersion", null);
        setField(term79914, term79914.getClass(), "firstPlayDate", null);
        setField(term79914, term79914.getClass(), "lastGameId", null);
        setField(term79914, term79914.getClass(), "lastRomVersion", null);
        setField(term79914, term79914.getClass(), "lastDataVersion", null);
        setField(term79914, term79914.getClass(), "compatibleCmVersion", null);
        setField(term79914, term79914.getClass(), "lastPlayDate", null);
        setIntField(term79914, term79914.getClass(), "lastPlaceId", 0);
        setField(term79914, term79914.getClass(), "lastPlaceName", null);
        setIntField(term79914, term79914.getClass(), "lastRegionId", 0);
        setField(term79914, term79914.getClass(), "lastRegionName", null);
        setIntField(term79914, term79914.getClass(), "lastAllNetId", 0);
        setField(term79914, term79914.getClass(), "lastClientId", null);
        setIntField(term79914, term79914.getClass(), "lastUsedDeckId", 0);
        setIntField(term79914, term79914.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79914, term79914.getClass(), "lastEmoneyBrand", 0);
        term79961 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term79961;
        callMethod(klass, "setId", argTypes, term79914, args);
    }

};


