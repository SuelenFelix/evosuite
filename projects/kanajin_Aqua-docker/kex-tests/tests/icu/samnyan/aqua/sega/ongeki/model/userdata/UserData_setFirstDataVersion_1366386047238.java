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

public class UserData_setFirstDataVersion_1366386047238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82156;

    public UserData_setFirstDataVersion_1366386047238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82156 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82156, term82156.getClass(), "id", 0L);
        setField(term82156, term82156.getClass(), "card", null);
        setField(term82156, term82156.getClass(), "userName", null);
        setIntField(term82156, term82156.getClass(), "level", 0);
        setIntField(term82156, term82156.getClass(), "reincarnationNum", 0);
        setLongField(term82156, term82156.getClass(), "exp", 0L);
        setLongField(term82156, term82156.getClass(), "point", 0L);
        setLongField(term82156, term82156.getClass(), "totalPoint", 0L);
        setIntField(term82156, term82156.getClass(), "playCount", 0);
        setIntField(term82156, term82156.getClass(), "jewelCount", 0);
        setIntField(term82156, term82156.getClass(), "totalJewelCount", 0);
        setIntField(term82156, term82156.getClass(), "medalCount", 0);
        setIntField(term82156, term82156.getClass(), "playerRating", 0);
        setIntField(term82156, term82156.getClass(), "highestRating", 0);
        setIntField(term82156, term82156.getClass(), "battlePoint", 0);
        setIntField(term82156, term82156.getClass(), "bestBattlePoint", 0);
        setIntField(term82156, term82156.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82156, term82156.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82156, term82156.getClass(), "nameplateId", 0);
        setIntField(term82156, term82156.getClass(), "trophyId", 0);
        setIntField(term82156, term82156.getClass(), "cardId", 0);
        setIntField(term82156, term82156.getClass(), "characterId", 0);
        setIntField(term82156, term82156.getClass(), "characterVoiceNo", 0);
        setIntField(term82156, term82156.getClass(), "tabSetting", 0);
        setIntField(term82156, term82156.getClass(), "tabSortSetting", 0);
        setIntField(term82156, term82156.getClass(), "cardCategorySetting", 0);
        setIntField(term82156, term82156.getClass(), "cardSortSetting", 0);
        setIntField(term82156, term82156.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82156, term82156.getClass(), "playedTutorialBit", 0);
        setIntField(term82156, term82156.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82156, term82156.getClass(), "sumTechHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82156, term82156.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82156, term82156.getClass(), "eventWatchedDate", null);
        setField(term82156, term82156.getClass(), "cmEventWatchedDate", null);
        setField(term82156, term82156.getClass(), "firstGameId", null);
        setField(term82156, term82156.getClass(), "firstRomVersion", null);
        setField(term82156, term82156.getClass(), "firstDataVersion", null);
        setField(term82156, term82156.getClass(), "firstPlayDate", null);
        setField(term82156, term82156.getClass(), "lastGameId", null);
        setField(term82156, term82156.getClass(), "lastRomVersion", null);
        setField(term82156, term82156.getClass(), "lastDataVersion", null);
        setField(term82156, term82156.getClass(), "compatibleCmVersion", null);
        setField(term82156, term82156.getClass(), "lastPlayDate", null);
        setIntField(term82156, term82156.getClass(), "lastPlaceId", 0);
        setField(term82156, term82156.getClass(), "lastPlaceName", null);
        setIntField(term82156, term82156.getClass(), "lastRegionId", 0);
        setField(term82156, term82156.getClass(), "lastRegionName", null);
        setIntField(term82156, term82156.getClass(), "lastAllNetId", 0);
        setField(term82156, term82156.getClass(), "lastClientId", null);
        setIntField(term82156, term82156.getClass(), "lastUsedDeckId", 0);
        setIntField(term82156, term82156.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82156, term82156.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstDataVersion", argTypes, term82156, args);
    }

};


