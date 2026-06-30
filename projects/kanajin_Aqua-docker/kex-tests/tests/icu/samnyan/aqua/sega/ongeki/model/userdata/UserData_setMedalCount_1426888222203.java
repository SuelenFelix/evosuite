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

public class UserData_setMedalCount_1426888222203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80449;
     Object term80496;

    public UserData_setMedalCount_1426888222203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80449 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80449, term80449.getClass(), "id", 0L);
        setField(term80449, term80449.getClass(), "card", null);
        setField(term80449, term80449.getClass(), "userName", null);
        setIntField(term80449, term80449.getClass(), "level", 0);
        setIntField(term80449, term80449.getClass(), "reincarnationNum", 0);
        setLongField(term80449, term80449.getClass(), "exp", 0L);
        setLongField(term80449, term80449.getClass(), "point", 0L);
        setLongField(term80449, term80449.getClass(), "totalPoint", 0L);
        setIntField(term80449, term80449.getClass(), "playCount", 0);
        setIntField(term80449, term80449.getClass(), "jewelCount", 0);
        setIntField(term80449, term80449.getClass(), "totalJewelCount", 0);
        setIntField(term80449, term80449.getClass(), "medalCount", 0);
        setIntField(term80449, term80449.getClass(), "playerRating", 0);
        setIntField(term80449, term80449.getClass(), "highestRating", 0);
        setIntField(term80449, term80449.getClass(), "battlePoint", 0);
        setIntField(term80449, term80449.getClass(), "bestBattlePoint", 0);
        setIntField(term80449, term80449.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80449, term80449.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80449, term80449.getClass(), "nameplateId", 0);
        setIntField(term80449, term80449.getClass(), "trophyId", 0);
        setIntField(term80449, term80449.getClass(), "cardId", 0);
        setIntField(term80449, term80449.getClass(), "characterId", 0);
        setIntField(term80449, term80449.getClass(), "characterVoiceNo", 0);
        setIntField(term80449, term80449.getClass(), "tabSetting", 0);
        setIntField(term80449, term80449.getClass(), "tabSortSetting", 0);
        setIntField(term80449, term80449.getClass(), "cardCategorySetting", 0);
        setIntField(term80449, term80449.getClass(), "cardSortSetting", 0);
        setIntField(term80449, term80449.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80449, term80449.getClass(), "playedTutorialBit", 0);
        setIntField(term80449, term80449.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80449, term80449.getClass(), "sumTechHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80449, term80449.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80449, term80449.getClass(), "eventWatchedDate", null);
        setField(term80449, term80449.getClass(), "cmEventWatchedDate", null);
        setField(term80449, term80449.getClass(), "firstGameId", null);
        setField(term80449, term80449.getClass(), "firstRomVersion", null);
        setField(term80449, term80449.getClass(), "firstDataVersion", null);
        setField(term80449, term80449.getClass(), "firstPlayDate", null);
        setField(term80449, term80449.getClass(), "lastGameId", null);
        setField(term80449, term80449.getClass(), "lastRomVersion", null);
        setField(term80449, term80449.getClass(), "lastDataVersion", null);
        setField(term80449, term80449.getClass(), "compatibleCmVersion", null);
        setField(term80449, term80449.getClass(), "lastPlayDate", null);
        setIntField(term80449, term80449.getClass(), "lastPlaceId", 0);
        setField(term80449, term80449.getClass(), "lastPlaceName", null);
        setIntField(term80449, term80449.getClass(), "lastRegionId", 0);
        setField(term80449, term80449.getClass(), "lastRegionName", null);
        setIntField(term80449, term80449.getClass(), "lastAllNetId", 0);
        setField(term80449, term80449.getClass(), "lastClientId", null);
        setIntField(term80449, term80449.getClass(), "lastUsedDeckId", 0);
        setIntField(term80449, term80449.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80449, term80449.getClass(), "lastEmoneyBrand", 0);
        term80496 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80496;
        callMethod(klass, "setMedalCount", argTypes, term80449, args);
    }

};


