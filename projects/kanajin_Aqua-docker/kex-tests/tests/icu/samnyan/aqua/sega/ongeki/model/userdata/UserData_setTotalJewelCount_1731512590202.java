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

public class UserData_setTotalJewelCount_1731512590202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80400;
     Object term80447;

    public UserData_setTotalJewelCount_1731512590202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80400 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80400, term80400.getClass(), "id", 0L);
        setField(term80400, term80400.getClass(), "card", null);
        setField(term80400, term80400.getClass(), "userName", null);
        setIntField(term80400, term80400.getClass(), "level", 0);
        setIntField(term80400, term80400.getClass(), "reincarnationNum", 0);
        setLongField(term80400, term80400.getClass(), "exp", 0L);
        setLongField(term80400, term80400.getClass(), "point", 0L);
        setLongField(term80400, term80400.getClass(), "totalPoint", 0L);
        setIntField(term80400, term80400.getClass(), "playCount", 0);
        setIntField(term80400, term80400.getClass(), "jewelCount", 0);
        setIntField(term80400, term80400.getClass(), "totalJewelCount", 0);
        setIntField(term80400, term80400.getClass(), "medalCount", 0);
        setIntField(term80400, term80400.getClass(), "playerRating", 0);
        setIntField(term80400, term80400.getClass(), "highestRating", 0);
        setIntField(term80400, term80400.getClass(), "battlePoint", 0);
        setIntField(term80400, term80400.getClass(), "bestBattlePoint", 0);
        setIntField(term80400, term80400.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80400, term80400.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80400, term80400.getClass(), "nameplateId", 0);
        setIntField(term80400, term80400.getClass(), "trophyId", 0);
        setIntField(term80400, term80400.getClass(), "cardId", 0);
        setIntField(term80400, term80400.getClass(), "characterId", 0);
        setIntField(term80400, term80400.getClass(), "characterVoiceNo", 0);
        setIntField(term80400, term80400.getClass(), "tabSetting", 0);
        setIntField(term80400, term80400.getClass(), "tabSortSetting", 0);
        setIntField(term80400, term80400.getClass(), "cardCategorySetting", 0);
        setIntField(term80400, term80400.getClass(), "cardSortSetting", 0);
        setIntField(term80400, term80400.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80400, term80400.getClass(), "playedTutorialBit", 0);
        setIntField(term80400, term80400.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80400, term80400.getClass(), "sumTechHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80400, term80400.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80400, term80400.getClass(), "eventWatchedDate", null);
        setField(term80400, term80400.getClass(), "cmEventWatchedDate", null);
        setField(term80400, term80400.getClass(), "firstGameId", null);
        setField(term80400, term80400.getClass(), "firstRomVersion", null);
        setField(term80400, term80400.getClass(), "firstDataVersion", null);
        setField(term80400, term80400.getClass(), "firstPlayDate", null);
        setField(term80400, term80400.getClass(), "lastGameId", null);
        setField(term80400, term80400.getClass(), "lastRomVersion", null);
        setField(term80400, term80400.getClass(), "lastDataVersion", null);
        setField(term80400, term80400.getClass(), "compatibleCmVersion", null);
        setField(term80400, term80400.getClass(), "lastPlayDate", null);
        setIntField(term80400, term80400.getClass(), "lastPlaceId", 0);
        setField(term80400, term80400.getClass(), "lastPlaceName", null);
        setIntField(term80400, term80400.getClass(), "lastRegionId", 0);
        setField(term80400, term80400.getClass(), "lastRegionName", null);
        setIntField(term80400, term80400.getClass(), "lastAllNetId", 0);
        setField(term80400, term80400.getClass(), "lastClientId", null);
        setIntField(term80400, term80400.getClass(), "lastUsedDeckId", 0);
        setIntField(term80400, term80400.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80400, term80400.getClass(), "lastEmoneyBrand", 0);
        term80447 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80447;
        callMethod(klass, "setTotalJewelCount", argTypes, term80400, args);
    }

};


