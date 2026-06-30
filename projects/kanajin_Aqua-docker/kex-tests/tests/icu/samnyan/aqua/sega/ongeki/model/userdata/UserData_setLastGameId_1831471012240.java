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

public class UserData_setLastGameId_1831471012240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82250;

    public UserData_setLastGameId_1831471012240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82250 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82250, term82250.getClass(), "id", 0L);
        setField(term82250, term82250.getClass(), "card", null);
        setField(term82250, term82250.getClass(), "userName", null);
        setIntField(term82250, term82250.getClass(), "level", 0);
        setIntField(term82250, term82250.getClass(), "reincarnationNum", 0);
        setLongField(term82250, term82250.getClass(), "exp", 0L);
        setLongField(term82250, term82250.getClass(), "point", 0L);
        setLongField(term82250, term82250.getClass(), "totalPoint", 0L);
        setIntField(term82250, term82250.getClass(), "playCount", 0);
        setIntField(term82250, term82250.getClass(), "jewelCount", 0);
        setIntField(term82250, term82250.getClass(), "totalJewelCount", 0);
        setIntField(term82250, term82250.getClass(), "medalCount", 0);
        setIntField(term82250, term82250.getClass(), "playerRating", 0);
        setIntField(term82250, term82250.getClass(), "highestRating", 0);
        setIntField(term82250, term82250.getClass(), "battlePoint", 0);
        setIntField(term82250, term82250.getClass(), "bestBattlePoint", 0);
        setIntField(term82250, term82250.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82250, term82250.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82250, term82250.getClass(), "nameplateId", 0);
        setIntField(term82250, term82250.getClass(), "trophyId", 0);
        setIntField(term82250, term82250.getClass(), "cardId", 0);
        setIntField(term82250, term82250.getClass(), "characterId", 0);
        setIntField(term82250, term82250.getClass(), "characterVoiceNo", 0);
        setIntField(term82250, term82250.getClass(), "tabSetting", 0);
        setIntField(term82250, term82250.getClass(), "tabSortSetting", 0);
        setIntField(term82250, term82250.getClass(), "cardCategorySetting", 0);
        setIntField(term82250, term82250.getClass(), "cardSortSetting", 0);
        setIntField(term82250, term82250.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82250, term82250.getClass(), "playedTutorialBit", 0);
        setIntField(term82250, term82250.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82250, term82250.getClass(), "sumTechHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82250, term82250.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82250, term82250.getClass(), "eventWatchedDate", null);
        setField(term82250, term82250.getClass(), "cmEventWatchedDate", null);
        setField(term82250, term82250.getClass(), "firstGameId", null);
        setField(term82250, term82250.getClass(), "firstRomVersion", null);
        setField(term82250, term82250.getClass(), "firstDataVersion", null);
        setField(term82250, term82250.getClass(), "firstPlayDate", null);
        setField(term82250, term82250.getClass(), "lastGameId", null);
        setField(term82250, term82250.getClass(), "lastRomVersion", null);
        setField(term82250, term82250.getClass(), "lastDataVersion", null);
        setField(term82250, term82250.getClass(), "compatibleCmVersion", null);
        setField(term82250, term82250.getClass(), "lastPlayDate", null);
        setIntField(term82250, term82250.getClass(), "lastPlaceId", 0);
        setField(term82250, term82250.getClass(), "lastPlaceName", null);
        setIntField(term82250, term82250.getClass(), "lastRegionId", 0);
        setField(term82250, term82250.getClass(), "lastRegionName", null);
        setIntField(term82250, term82250.getClass(), "lastAllNetId", 0);
        setField(term82250, term82250.getClass(), "lastClientId", null);
        setIntField(term82250, term82250.getClass(), "lastUsedDeckId", 0);
        setIntField(term82250, term82250.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82250, term82250.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastGameId", argTypes, term82250, args);
    }

};


