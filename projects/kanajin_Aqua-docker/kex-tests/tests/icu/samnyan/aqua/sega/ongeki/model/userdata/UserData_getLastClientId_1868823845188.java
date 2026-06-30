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

public class UserData_getLastClientId_1868823845188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79726;

    public UserData_getLastClientId_1868823845188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79726 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79726, term79726.getClass(), "id", 0L);
        setField(term79726, term79726.getClass(), "card", null);
        setField(term79726, term79726.getClass(), "userName", null);
        setIntField(term79726, term79726.getClass(), "level", 0);
        setIntField(term79726, term79726.getClass(), "reincarnationNum", 0);
        setLongField(term79726, term79726.getClass(), "exp", 0L);
        setLongField(term79726, term79726.getClass(), "point", 0L);
        setLongField(term79726, term79726.getClass(), "totalPoint", 0L);
        setIntField(term79726, term79726.getClass(), "playCount", 0);
        setIntField(term79726, term79726.getClass(), "jewelCount", 0);
        setIntField(term79726, term79726.getClass(), "totalJewelCount", 0);
        setIntField(term79726, term79726.getClass(), "medalCount", 0);
        setIntField(term79726, term79726.getClass(), "playerRating", 0);
        setIntField(term79726, term79726.getClass(), "highestRating", 0);
        setIntField(term79726, term79726.getClass(), "battlePoint", 0);
        setIntField(term79726, term79726.getClass(), "bestBattlePoint", 0);
        setIntField(term79726, term79726.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79726, term79726.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79726, term79726.getClass(), "nameplateId", 0);
        setIntField(term79726, term79726.getClass(), "trophyId", 0);
        setIntField(term79726, term79726.getClass(), "cardId", 0);
        setIntField(term79726, term79726.getClass(), "characterId", 0);
        setIntField(term79726, term79726.getClass(), "characterVoiceNo", 0);
        setIntField(term79726, term79726.getClass(), "tabSetting", 0);
        setIntField(term79726, term79726.getClass(), "tabSortSetting", 0);
        setIntField(term79726, term79726.getClass(), "cardCategorySetting", 0);
        setIntField(term79726, term79726.getClass(), "cardSortSetting", 0);
        setIntField(term79726, term79726.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79726, term79726.getClass(), "playedTutorialBit", 0);
        setIntField(term79726, term79726.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79726, term79726.getClass(), "sumTechHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79726, term79726.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79726, term79726.getClass(), "eventWatchedDate", null);
        setField(term79726, term79726.getClass(), "cmEventWatchedDate", null);
        setField(term79726, term79726.getClass(), "firstGameId", null);
        setField(term79726, term79726.getClass(), "firstRomVersion", null);
        setField(term79726, term79726.getClass(), "firstDataVersion", null);
        setField(term79726, term79726.getClass(), "firstPlayDate", null);
        setField(term79726, term79726.getClass(), "lastGameId", null);
        setField(term79726, term79726.getClass(), "lastRomVersion", null);
        setField(term79726, term79726.getClass(), "lastDataVersion", null);
        setField(term79726, term79726.getClass(), "compatibleCmVersion", null);
        setField(term79726, term79726.getClass(), "lastPlayDate", null);
        setIntField(term79726, term79726.getClass(), "lastPlaceId", 0);
        setField(term79726, term79726.getClass(), "lastPlaceName", null);
        setIntField(term79726, term79726.getClass(), "lastRegionId", 0);
        setField(term79726, term79726.getClass(), "lastRegionName", null);
        setIntField(term79726, term79726.getClass(), "lastAllNetId", 0);
        setField(term79726, term79726.getClass(), "lastClientId", null);
        setIntField(term79726, term79726.getClass(), "lastUsedDeckId", 0);
        setIntField(term79726, term79726.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79726, term79726.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term79726, args);
    }

};


