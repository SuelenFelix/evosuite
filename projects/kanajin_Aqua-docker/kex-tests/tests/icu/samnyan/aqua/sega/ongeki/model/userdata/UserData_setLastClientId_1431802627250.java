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

public class UserData_setLastClientId_1431802627250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82726;

    public UserData_setLastClientId_1431802627250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82726 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82726, term82726.getClass(), "id", 0L);
        setField(term82726, term82726.getClass(), "card", null);
        setField(term82726, term82726.getClass(), "userName", null);
        setIntField(term82726, term82726.getClass(), "level", 0);
        setIntField(term82726, term82726.getClass(), "reincarnationNum", 0);
        setLongField(term82726, term82726.getClass(), "exp", 0L);
        setLongField(term82726, term82726.getClass(), "point", 0L);
        setLongField(term82726, term82726.getClass(), "totalPoint", 0L);
        setIntField(term82726, term82726.getClass(), "playCount", 0);
        setIntField(term82726, term82726.getClass(), "jewelCount", 0);
        setIntField(term82726, term82726.getClass(), "totalJewelCount", 0);
        setIntField(term82726, term82726.getClass(), "medalCount", 0);
        setIntField(term82726, term82726.getClass(), "playerRating", 0);
        setIntField(term82726, term82726.getClass(), "highestRating", 0);
        setIntField(term82726, term82726.getClass(), "battlePoint", 0);
        setIntField(term82726, term82726.getClass(), "bestBattlePoint", 0);
        setIntField(term82726, term82726.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82726, term82726.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82726, term82726.getClass(), "nameplateId", 0);
        setIntField(term82726, term82726.getClass(), "trophyId", 0);
        setIntField(term82726, term82726.getClass(), "cardId", 0);
        setIntField(term82726, term82726.getClass(), "characterId", 0);
        setIntField(term82726, term82726.getClass(), "characterVoiceNo", 0);
        setIntField(term82726, term82726.getClass(), "tabSetting", 0);
        setIntField(term82726, term82726.getClass(), "tabSortSetting", 0);
        setIntField(term82726, term82726.getClass(), "cardCategorySetting", 0);
        setIntField(term82726, term82726.getClass(), "cardSortSetting", 0);
        setIntField(term82726, term82726.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82726, term82726.getClass(), "playedTutorialBit", 0);
        setIntField(term82726, term82726.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82726, term82726.getClass(), "sumTechHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82726, term82726.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82726, term82726.getClass(), "eventWatchedDate", null);
        setField(term82726, term82726.getClass(), "cmEventWatchedDate", null);
        setField(term82726, term82726.getClass(), "firstGameId", null);
        setField(term82726, term82726.getClass(), "firstRomVersion", null);
        setField(term82726, term82726.getClass(), "firstDataVersion", null);
        setField(term82726, term82726.getClass(), "firstPlayDate", null);
        setField(term82726, term82726.getClass(), "lastGameId", null);
        setField(term82726, term82726.getClass(), "lastRomVersion", null);
        setField(term82726, term82726.getClass(), "lastDataVersion", null);
        setField(term82726, term82726.getClass(), "compatibleCmVersion", null);
        setField(term82726, term82726.getClass(), "lastPlayDate", null);
        setIntField(term82726, term82726.getClass(), "lastPlaceId", 0);
        setField(term82726, term82726.getClass(), "lastPlaceName", null);
        setIntField(term82726, term82726.getClass(), "lastRegionId", 0);
        setField(term82726, term82726.getClass(), "lastRegionName", null);
        setIntField(term82726, term82726.getClass(), "lastAllNetId", 0);
        setField(term82726, term82726.getClass(), "lastClientId", null);
        setIntField(term82726, term82726.getClass(), "lastUsedDeckId", 0);
        setIntField(term82726, term82726.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82726, term82726.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastClientId", argTypes, term82726, args);
    }

};


