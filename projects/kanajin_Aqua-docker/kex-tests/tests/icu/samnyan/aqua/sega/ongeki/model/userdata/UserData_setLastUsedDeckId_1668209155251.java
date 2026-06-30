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

public class UserData_setLastUsedDeckId_1668209155251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82773;
     Object term82820;

    public UserData_setLastUsedDeckId_1668209155251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82773 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82773, term82773.getClass(), "id", 0L);
        setField(term82773, term82773.getClass(), "card", null);
        setField(term82773, term82773.getClass(), "userName", null);
        setIntField(term82773, term82773.getClass(), "level", 0);
        setIntField(term82773, term82773.getClass(), "reincarnationNum", 0);
        setLongField(term82773, term82773.getClass(), "exp", 0L);
        setLongField(term82773, term82773.getClass(), "point", 0L);
        setLongField(term82773, term82773.getClass(), "totalPoint", 0L);
        setIntField(term82773, term82773.getClass(), "playCount", 0);
        setIntField(term82773, term82773.getClass(), "jewelCount", 0);
        setIntField(term82773, term82773.getClass(), "totalJewelCount", 0);
        setIntField(term82773, term82773.getClass(), "medalCount", 0);
        setIntField(term82773, term82773.getClass(), "playerRating", 0);
        setIntField(term82773, term82773.getClass(), "highestRating", 0);
        setIntField(term82773, term82773.getClass(), "battlePoint", 0);
        setIntField(term82773, term82773.getClass(), "bestBattlePoint", 0);
        setIntField(term82773, term82773.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82773, term82773.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82773, term82773.getClass(), "nameplateId", 0);
        setIntField(term82773, term82773.getClass(), "trophyId", 0);
        setIntField(term82773, term82773.getClass(), "cardId", 0);
        setIntField(term82773, term82773.getClass(), "characterId", 0);
        setIntField(term82773, term82773.getClass(), "characterVoiceNo", 0);
        setIntField(term82773, term82773.getClass(), "tabSetting", 0);
        setIntField(term82773, term82773.getClass(), "tabSortSetting", 0);
        setIntField(term82773, term82773.getClass(), "cardCategorySetting", 0);
        setIntField(term82773, term82773.getClass(), "cardSortSetting", 0);
        setIntField(term82773, term82773.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82773, term82773.getClass(), "playedTutorialBit", 0);
        setIntField(term82773, term82773.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82773, term82773.getClass(), "sumTechHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82773, term82773.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82773, term82773.getClass(), "eventWatchedDate", null);
        setField(term82773, term82773.getClass(), "cmEventWatchedDate", null);
        setField(term82773, term82773.getClass(), "firstGameId", null);
        setField(term82773, term82773.getClass(), "firstRomVersion", null);
        setField(term82773, term82773.getClass(), "firstDataVersion", null);
        setField(term82773, term82773.getClass(), "firstPlayDate", null);
        setField(term82773, term82773.getClass(), "lastGameId", null);
        setField(term82773, term82773.getClass(), "lastRomVersion", null);
        setField(term82773, term82773.getClass(), "lastDataVersion", null);
        setField(term82773, term82773.getClass(), "compatibleCmVersion", null);
        setField(term82773, term82773.getClass(), "lastPlayDate", null);
        setIntField(term82773, term82773.getClass(), "lastPlaceId", 0);
        setField(term82773, term82773.getClass(), "lastPlaceName", null);
        setIntField(term82773, term82773.getClass(), "lastRegionId", 0);
        setField(term82773, term82773.getClass(), "lastRegionName", null);
        setIntField(term82773, term82773.getClass(), "lastAllNetId", 0);
        setField(term82773, term82773.getClass(), "lastClientId", null);
        setIntField(term82773, term82773.getClass(), "lastUsedDeckId", 0);
        setIntField(term82773, term82773.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82773, term82773.getClass(), "lastEmoneyBrand", 0);
        term82820 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82820;
        callMethod(klass, "setLastUsedDeckId", argTypes, term82773, args);
    }

};


