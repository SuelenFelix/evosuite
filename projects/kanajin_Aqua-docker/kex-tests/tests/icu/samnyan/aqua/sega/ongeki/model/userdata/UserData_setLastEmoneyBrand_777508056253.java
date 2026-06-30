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

public class UserData_setLastEmoneyBrand_777508056253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82871;
     Object term82918;

    public UserData_setLastEmoneyBrand_777508056253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82871 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82871, term82871.getClass(), "id", 0L);
        setField(term82871, term82871.getClass(), "card", null);
        setField(term82871, term82871.getClass(), "userName", null);
        setIntField(term82871, term82871.getClass(), "level", 0);
        setIntField(term82871, term82871.getClass(), "reincarnationNum", 0);
        setLongField(term82871, term82871.getClass(), "exp", 0L);
        setLongField(term82871, term82871.getClass(), "point", 0L);
        setLongField(term82871, term82871.getClass(), "totalPoint", 0L);
        setIntField(term82871, term82871.getClass(), "playCount", 0);
        setIntField(term82871, term82871.getClass(), "jewelCount", 0);
        setIntField(term82871, term82871.getClass(), "totalJewelCount", 0);
        setIntField(term82871, term82871.getClass(), "medalCount", 0);
        setIntField(term82871, term82871.getClass(), "playerRating", 0);
        setIntField(term82871, term82871.getClass(), "highestRating", 0);
        setIntField(term82871, term82871.getClass(), "battlePoint", 0);
        setIntField(term82871, term82871.getClass(), "bestBattlePoint", 0);
        setIntField(term82871, term82871.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82871, term82871.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82871, term82871.getClass(), "nameplateId", 0);
        setIntField(term82871, term82871.getClass(), "trophyId", 0);
        setIntField(term82871, term82871.getClass(), "cardId", 0);
        setIntField(term82871, term82871.getClass(), "characterId", 0);
        setIntField(term82871, term82871.getClass(), "characterVoiceNo", 0);
        setIntField(term82871, term82871.getClass(), "tabSetting", 0);
        setIntField(term82871, term82871.getClass(), "tabSortSetting", 0);
        setIntField(term82871, term82871.getClass(), "cardCategorySetting", 0);
        setIntField(term82871, term82871.getClass(), "cardSortSetting", 0);
        setIntField(term82871, term82871.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82871, term82871.getClass(), "playedTutorialBit", 0);
        setIntField(term82871, term82871.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82871, term82871.getClass(), "sumTechHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82871, term82871.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82871, term82871.getClass(), "eventWatchedDate", null);
        setField(term82871, term82871.getClass(), "cmEventWatchedDate", null);
        setField(term82871, term82871.getClass(), "firstGameId", null);
        setField(term82871, term82871.getClass(), "firstRomVersion", null);
        setField(term82871, term82871.getClass(), "firstDataVersion", null);
        setField(term82871, term82871.getClass(), "firstPlayDate", null);
        setField(term82871, term82871.getClass(), "lastGameId", null);
        setField(term82871, term82871.getClass(), "lastRomVersion", null);
        setField(term82871, term82871.getClass(), "lastDataVersion", null);
        setField(term82871, term82871.getClass(), "compatibleCmVersion", null);
        setField(term82871, term82871.getClass(), "lastPlayDate", null);
        setIntField(term82871, term82871.getClass(), "lastPlaceId", 0);
        setField(term82871, term82871.getClass(), "lastPlaceName", null);
        setIntField(term82871, term82871.getClass(), "lastRegionId", 0);
        setField(term82871, term82871.getClass(), "lastRegionName", null);
        setIntField(term82871, term82871.getClass(), "lastAllNetId", 0);
        setField(term82871, term82871.getClass(), "lastClientId", null);
        setIntField(term82871, term82871.getClass(), "lastUsedDeckId", 0);
        setIntField(term82871, term82871.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82871, term82871.getClass(), "lastEmoneyBrand", 0);
        term82918 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82918;
        callMethod(klass, "setLastEmoneyBrand", argTypes, term82871, args);
    }

};


