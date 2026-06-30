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

public class UserData_setPlayerRating_1526166620204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80498;
     Object term80545;

    public UserData_setPlayerRating_1526166620204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80498 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80498, term80498.getClass(), "id", 0L);
        setField(term80498, term80498.getClass(), "card", null);
        setField(term80498, term80498.getClass(), "userName", null);
        setIntField(term80498, term80498.getClass(), "level", 0);
        setIntField(term80498, term80498.getClass(), "reincarnationNum", 0);
        setLongField(term80498, term80498.getClass(), "exp", 0L);
        setLongField(term80498, term80498.getClass(), "point", 0L);
        setLongField(term80498, term80498.getClass(), "totalPoint", 0L);
        setIntField(term80498, term80498.getClass(), "playCount", 0);
        setIntField(term80498, term80498.getClass(), "jewelCount", 0);
        setIntField(term80498, term80498.getClass(), "totalJewelCount", 0);
        setIntField(term80498, term80498.getClass(), "medalCount", 0);
        setIntField(term80498, term80498.getClass(), "playerRating", 0);
        setIntField(term80498, term80498.getClass(), "highestRating", 0);
        setIntField(term80498, term80498.getClass(), "battlePoint", 0);
        setIntField(term80498, term80498.getClass(), "bestBattlePoint", 0);
        setIntField(term80498, term80498.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80498, term80498.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80498, term80498.getClass(), "nameplateId", 0);
        setIntField(term80498, term80498.getClass(), "trophyId", 0);
        setIntField(term80498, term80498.getClass(), "cardId", 0);
        setIntField(term80498, term80498.getClass(), "characterId", 0);
        setIntField(term80498, term80498.getClass(), "characterVoiceNo", 0);
        setIntField(term80498, term80498.getClass(), "tabSetting", 0);
        setIntField(term80498, term80498.getClass(), "tabSortSetting", 0);
        setIntField(term80498, term80498.getClass(), "cardCategorySetting", 0);
        setIntField(term80498, term80498.getClass(), "cardSortSetting", 0);
        setIntField(term80498, term80498.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80498, term80498.getClass(), "playedTutorialBit", 0);
        setIntField(term80498, term80498.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80498, term80498.getClass(), "sumTechHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80498, term80498.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80498, term80498.getClass(), "eventWatchedDate", null);
        setField(term80498, term80498.getClass(), "cmEventWatchedDate", null);
        setField(term80498, term80498.getClass(), "firstGameId", null);
        setField(term80498, term80498.getClass(), "firstRomVersion", null);
        setField(term80498, term80498.getClass(), "firstDataVersion", null);
        setField(term80498, term80498.getClass(), "firstPlayDate", null);
        setField(term80498, term80498.getClass(), "lastGameId", null);
        setField(term80498, term80498.getClass(), "lastRomVersion", null);
        setField(term80498, term80498.getClass(), "lastDataVersion", null);
        setField(term80498, term80498.getClass(), "compatibleCmVersion", null);
        setField(term80498, term80498.getClass(), "lastPlayDate", null);
        setIntField(term80498, term80498.getClass(), "lastPlaceId", 0);
        setField(term80498, term80498.getClass(), "lastPlaceName", null);
        setIntField(term80498, term80498.getClass(), "lastRegionId", 0);
        setField(term80498, term80498.getClass(), "lastRegionName", null);
        setIntField(term80498, term80498.getClass(), "lastAllNetId", 0);
        setField(term80498, term80498.getClass(), "lastClientId", null);
        setIntField(term80498, term80498.getClass(), "lastUsedDeckId", 0);
        setIntField(term80498, term80498.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80498, term80498.getClass(), "lastEmoneyBrand", 0);
        term80545 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80545;
        callMethod(klass, "setPlayerRating", argTypes, term80498, args);
    }

};


