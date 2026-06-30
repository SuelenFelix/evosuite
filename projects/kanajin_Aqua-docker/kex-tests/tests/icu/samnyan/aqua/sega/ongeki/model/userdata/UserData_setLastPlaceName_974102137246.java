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

public class UserData_setLastPlaceName_974102137246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82534;

    public UserData_setLastPlaceName_974102137246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82534 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82534, term82534.getClass(), "id", 0L);
        setField(term82534, term82534.getClass(), "card", null);
        setField(term82534, term82534.getClass(), "userName", null);
        setIntField(term82534, term82534.getClass(), "level", 0);
        setIntField(term82534, term82534.getClass(), "reincarnationNum", 0);
        setLongField(term82534, term82534.getClass(), "exp", 0L);
        setLongField(term82534, term82534.getClass(), "point", 0L);
        setLongField(term82534, term82534.getClass(), "totalPoint", 0L);
        setIntField(term82534, term82534.getClass(), "playCount", 0);
        setIntField(term82534, term82534.getClass(), "jewelCount", 0);
        setIntField(term82534, term82534.getClass(), "totalJewelCount", 0);
        setIntField(term82534, term82534.getClass(), "medalCount", 0);
        setIntField(term82534, term82534.getClass(), "playerRating", 0);
        setIntField(term82534, term82534.getClass(), "highestRating", 0);
        setIntField(term82534, term82534.getClass(), "battlePoint", 0);
        setIntField(term82534, term82534.getClass(), "bestBattlePoint", 0);
        setIntField(term82534, term82534.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82534, term82534.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82534, term82534.getClass(), "nameplateId", 0);
        setIntField(term82534, term82534.getClass(), "trophyId", 0);
        setIntField(term82534, term82534.getClass(), "cardId", 0);
        setIntField(term82534, term82534.getClass(), "characterId", 0);
        setIntField(term82534, term82534.getClass(), "characterVoiceNo", 0);
        setIntField(term82534, term82534.getClass(), "tabSetting", 0);
        setIntField(term82534, term82534.getClass(), "tabSortSetting", 0);
        setIntField(term82534, term82534.getClass(), "cardCategorySetting", 0);
        setIntField(term82534, term82534.getClass(), "cardSortSetting", 0);
        setIntField(term82534, term82534.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82534, term82534.getClass(), "playedTutorialBit", 0);
        setIntField(term82534, term82534.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82534, term82534.getClass(), "sumTechHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82534, term82534.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82534, term82534.getClass(), "eventWatchedDate", null);
        setField(term82534, term82534.getClass(), "cmEventWatchedDate", null);
        setField(term82534, term82534.getClass(), "firstGameId", null);
        setField(term82534, term82534.getClass(), "firstRomVersion", null);
        setField(term82534, term82534.getClass(), "firstDataVersion", null);
        setField(term82534, term82534.getClass(), "firstPlayDate", null);
        setField(term82534, term82534.getClass(), "lastGameId", null);
        setField(term82534, term82534.getClass(), "lastRomVersion", null);
        setField(term82534, term82534.getClass(), "lastDataVersion", null);
        setField(term82534, term82534.getClass(), "compatibleCmVersion", null);
        setField(term82534, term82534.getClass(), "lastPlayDate", null);
        setIntField(term82534, term82534.getClass(), "lastPlaceId", 0);
        setField(term82534, term82534.getClass(), "lastPlaceName", null);
        setIntField(term82534, term82534.getClass(), "lastRegionId", 0);
        setField(term82534, term82534.getClass(), "lastRegionName", null);
        setIntField(term82534, term82534.getClass(), "lastAllNetId", 0);
        setField(term82534, term82534.getClass(), "lastClientId", null);
        setIntField(term82534, term82534.getClass(), "lastUsedDeckId", 0);
        setIntField(term82534, term82534.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82534, term82534.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlaceName", argTypes, term82534, args);
    }

};


