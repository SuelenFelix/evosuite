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

public class UserData_setTabSetting_2083755519215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81037;
     Object term81084;

    public UserData_setTabSetting_2083755519215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81037 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81037, term81037.getClass(), "id", 0L);
        setField(term81037, term81037.getClass(), "card", null);
        setField(term81037, term81037.getClass(), "userName", null);
        setIntField(term81037, term81037.getClass(), "level", 0);
        setIntField(term81037, term81037.getClass(), "reincarnationNum", 0);
        setLongField(term81037, term81037.getClass(), "exp", 0L);
        setLongField(term81037, term81037.getClass(), "point", 0L);
        setLongField(term81037, term81037.getClass(), "totalPoint", 0L);
        setIntField(term81037, term81037.getClass(), "playCount", 0);
        setIntField(term81037, term81037.getClass(), "jewelCount", 0);
        setIntField(term81037, term81037.getClass(), "totalJewelCount", 0);
        setIntField(term81037, term81037.getClass(), "medalCount", 0);
        setIntField(term81037, term81037.getClass(), "playerRating", 0);
        setIntField(term81037, term81037.getClass(), "highestRating", 0);
        setIntField(term81037, term81037.getClass(), "battlePoint", 0);
        setIntField(term81037, term81037.getClass(), "bestBattlePoint", 0);
        setIntField(term81037, term81037.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81037, term81037.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81037, term81037.getClass(), "nameplateId", 0);
        setIntField(term81037, term81037.getClass(), "trophyId", 0);
        setIntField(term81037, term81037.getClass(), "cardId", 0);
        setIntField(term81037, term81037.getClass(), "characterId", 0);
        setIntField(term81037, term81037.getClass(), "characterVoiceNo", 0);
        setIntField(term81037, term81037.getClass(), "tabSetting", 0);
        setIntField(term81037, term81037.getClass(), "tabSortSetting", 0);
        setIntField(term81037, term81037.getClass(), "cardCategorySetting", 0);
        setIntField(term81037, term81037.getClass(), "cardSortSetting", 0);
        setIntField(term81037, term81037.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81037, term81037.getClass(), "playedTutorialBit", 0);
        setIntField(term81037, term81037.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81037, term81037.getClass(), "sumTechHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81037, term81037.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81037, term81037.getClass(), "eventWatchedDate", null);
        setField(term81037, term81037.getClass(), "cmEventWatchedDate", null);
        setField(term81037, term81037.getClass(), "firstGameId", null);
        setField(term81037, term81037.getClass(), "firstRomVersion", null);
        setField(term81037, term81037.getClass(), "firstDataVersion", null);
        setField(term81037, term81037.getClass(), "firstPlayDate", null);
        setField(term81037, term81037.getClass(), "lastGameId", null);
        setField(term81037, term81037.getClass(), "lastRomVersion", null);
        setField(term81037, term81037.getClass(), "lastDataVersion", null);
        setField(term81037, term81037.getClass(), "compatibleCmVersion", null);
        setField(term81037, term81037.getClass(), "lastPlayDate", null);
        setIntField(term81037, term81037.getClass(), "lastPlaceId", 0);
        setField(term81037, term81037.getClass(), "lastPlaceName", null);
        setIntField(term81037, term81037.getClass(), "lastRegionId", 0);
        setField(term81037, term81037.getClass(), "lastRegionName", null);
        setIntField(term81037, term81037.getClass(), "lastAllNetId", 0);
        setField(term81037, term81037.getClass(), "lastClientId", null);
        setIntField(term81037, term81037.getClass(), "lastUsedDeckId", 0);
        setIntField(term81037, term81037.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81037, term81037.getClass(), "lastEmoneyBrand", 0);
        term81084 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81084;
        callMethod(klass, "setTabSetting", argTypes, term81037, args);
    }

};


