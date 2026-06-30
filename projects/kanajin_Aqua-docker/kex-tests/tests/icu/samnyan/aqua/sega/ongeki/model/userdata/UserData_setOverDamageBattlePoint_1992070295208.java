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

public class UserData_setOverDamageBattlePoint_1992070295208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80694;
     Object term80741;

    public UserData_setOverDamageBattlePoint_1992070295208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80694 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80694, term80694.getClass(), "id", 0L);
        setField(term80694, term80694.getClass(), "card", null);
        setField(term80694, term80694.getClass(), "userName", null);
        setIntField(term80694, term80694.getClass(), "level", 0);
        setIntField(term80694, term80694.getClass(), "reincarnationNum", 0);
        setLongField(term80694, term80694.getClass(), "exp", 0L);
        setLongField(term80694, term80694.getClass(), "point", 0L);
        setLongField(term80694, term80694.getClass(), "totalPoint", 0L);
        setIntField(term80694, term80694.getClass(), "playCount", 0);
        setIntField(term80694, term80694.getClass(), "jewelCount", 0);
        setIntField(term80694, term80694.getClass(), "totalJewelCount", 0);
        setIntField(term80694, term80694.getClass(), "medalCount", 0);
        setIntField(term80694, term80694.getClass(), "playerRating", 0);
        setIntField(term80694, term80694.getClass(), "highestRating", 0);
        setIntField(term80694, term80694.getClass(), "battlePoint", 0);
        setIntField(term80694, term80694.getClass(), "bestBattlePoint", 0);
        setIntField(term80694, term80694.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80694, term80694.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80694, term80694.getClass(), "nameplateId", 0);
        setIntField(term80694, term80694.getClass(), "trophyId", 0);
        setIntField(term80694, term80694.getClass(), "cardId", 0);
        setIntField(term80694, term80694.getClass(), "characterId", 0);
        setIntField(term80694, term80694.getClass(), "characterVoiceNo", 0);
        setIntField(term80694, term80694.getClass(), "tabSetting", 0);
        setIntField(term80694, term80694.getClass(), "tabSortSetting", 0);
        setIntField(term80694, term80694.getClass(), "cardCategorySetting", 0);
        setIntField(term80694, term80694.getClass(), "cardSortSetting", 0);
        setIntField(term80694, term80694.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80694, term80694.getClass(), "playedTutorialBit", 0);
        setIntField(term80694, term80694.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80694, term80694.getClass(), "sumTechHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80694, term80694.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80694, term80694.getClass(), "eventWatchedDate", null);
        setField(term80694, term80694.getClass(), "cmEventWatchedDate", null);
        setField(term80694, term80694.getClass(), "firstGameId", null);
        setField(term80694, term80694.getClass(), "firstRomVersion", null);
        setField(term80694, term80694.getClass(), "firstDataVersion", null);
        setField(term80694, term80694.getClass(), "firstPlayDate", null);
        setField(term80694, term80694.getClass(), "lastGameId", null);
        setField(term80694, term80694.getClass(), "lastRomVersion", null);
        setField(term80694, term80694.getClass(), "lastDataVersion", null);
        setField(term80694, term80694.getClass(), "compatibleCmVersion", null);
        setField(term80694, term80694.getClass(), "lastPlayDate", null);
        setIntField(term80694, term80694.getClass(), "lastPlaceId", 0);
        setField(term80694, term80694.getClass(), "lastPlaceName", null);
        setIntField(term80694, term80694.getClass(), "lastRegionId", 0);
        setField(term80694, term80694.getClass(), "lastRegionName", null);
        setIntField(term80694, term80694.getClass(), "lastAllNetId", 0);
        setField(term80694, term80694.getClass(), "lastClientId", null);
        setIntField(term80694, term80694.getClass(), "lastUsedDeckId", 0);
        setIntField(term80694, term80694.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80694, term80694.getClass(), "lastEmoneyBrand", 0);
        term80741 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80741;
        callMethod(klass, "setOverDamageBattlePoint", argTypes, term80694, args);
    }

};


