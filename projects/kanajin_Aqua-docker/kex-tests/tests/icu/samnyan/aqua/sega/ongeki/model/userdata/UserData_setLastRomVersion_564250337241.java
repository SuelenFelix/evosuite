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

public class UserData_setLastRomVersion_564250337241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82297;

    public UserData_setLastRomVersion_564250337241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82297 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82297, term82297.getClass(), "id", 0L);
        setField(term82297, term82297.getClass(), "card", null);
        setField(term82297, term82297.getClass(), "userName", null);
        setIntField(term82297, term82297.getClass(), "level", 0);
        setIntField(term82297, term82297.getClass(), "reincarnationNum", 0);
        setLongField(term82297, term82297.getClass(), "exp", 0L);
        setLongField(term82297, term82297.getClass(), "point", 0L);
        setLongField(term82297, term82297.getClass(), "totalPoint", 0L);
        setIntField(term82297, term82297.getClass(), "playCount", 0);
        setIntField(term82297, term82297.getClass(), "jewelCount", 0);
        setIntField(term82297, term82297.getClass(), "totalJewelCount", 0);
        setIntField(term82297, term82297.getClass(), "medalCount", 0);
        setIntField(term82297, term82297.getClass(), "playerRating", 0);
        setIntField(term82297, term82297.getClass(), "highestRating", 0);
        setIntField(term82297, term82297.getClass(), "battlePoint", 0);
        setIntField(term82297, term82297.getClass(), "bestBattlePoint", 0);
        setIntField(term82297, term82297.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82297, term82297.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82297, term82297.getClass(), "nameplateId", 0);
        setIntField(term82297, term82297.getClass(), "trophyId", 0);
        setIntField(term82297, term82297.getClass(), "cardId", 0);
        setIntField(term82297, term82297.getClass(), "characterId", 0);
        setIntField(term82297, term82297.getClass(), "characterVoiceNo", 0);
        setIntField(term82297, term82297.getClass(), "tabSetting", 0);
        setIntField(term82297, term82297.getClass(), "tabSortSetting", 0);
        setIntField(term82297, term82297.getClass(), "cardCategorySetting", 0);
        setIntField(term82297, term82297.getClass(), "cardSortSetting", 0);
        setIntField(term82297, term82297.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82297, term82297.getClass(), "playedTutorialBit", 0);
        setIntField(term82297, term82297.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82297, term82297.getClass(), "sumTechHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82297, term82297.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82297, term82297.getClass(), "eventWatchedDate", null);
        setField(term82297, term82297.getClass(), "cmEventWatchedDate", null);
        setField(term82297, term82297.getClass(), "firstGameId", null);
        setField(term82297, term82297.getClass(), "firstRomVersion", null);
        setField(term82297, term82297.getClass(), "firstDataVersion", null);
        setField(term82297, term82297.getClass(), "firstPlayDate", null);
        setField(term82297, term82297.getClass(), "lastGameId", null);
        setField(term82297, term82297.getClass(), "lastRomVersion", null);
        setField(term82297, term82297.getClass(), "lastDataVersion", null);
        setField(term82297, term82297.getClass(), "compatibleCmVersion", null);
        setField(term82297, term82297.getClass(), "lastPlayDate", null);
        setIntField(term82297, term82297.getClass(), "lastPlaceId", 0);
        setField(term82297, term82297.getClass(), "lastPlaceName", null);
        setIntField(term82297, term82297.getClass(), "lastRegionId", 0);
        setField(term82297, term82297.getClass(), "lastRegionName", null);
        setIntField(term82297, term82297.getClass(), "lastAllNetId", 0);
        setField(term82297, term82297.getClass(), "lastClientId", null);
        setIntField(term82297, term82297.getClass(), "lastUsedDeckId", 0);
        setIntField(term82297, term82297.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82297, term82297.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRomVersion", argTypes, term82297, args);
    }

};


