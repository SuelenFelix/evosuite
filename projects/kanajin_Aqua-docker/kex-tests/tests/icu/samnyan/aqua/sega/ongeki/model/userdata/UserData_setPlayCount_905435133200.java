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

public class UserData_setPlayCount_905435133200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80302;
     Object term80349;

    public UserData_setPlayCount_905435133200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80302 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80302, term80302.getClass(), "id", 0L);
        setField(term80302, term80302.getClass(), "card", null);
        setField(term80302, term80302.getClass(), "userName", null);
        setIntField(term80302, term80302.getClass(), "level", 0);
        setIntField(term80302, term80302.getClass(), "reincarnationNum", 0);
        setLongField(term80302, term80302.getClass(), "exp", 0L);
        setLongField(term80302, term80302.getClass(), "point", 0L);
        setLongField(term80302, term80302.getClass(), "totalPoint", 0L);
        setIntField(term80302, term80302.getClass(), "playCount", 0);
        setIntField(term80302, term80302.getClass(), "jewelCount", 0);
        setIntField(term80302, term80302.getClass(), "totalJewelCount", 0);
        setIntField(term80302, term80302.getClass(), "medalCount", 0);
        setIntField(term80302, term80302.getClass(), "playerRating", 0);
        setIntField(term80302, term80302.getClass(), "highestRating", 0);
        setIntField(term80302, term80302.getClass(), "battlePoint", 0);
        setIntField(term80302, term80302.getClass(), "bestBattlePoint", 0);
        setIntField(term80302, term80302.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80302, term80302.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80302, term80302.getClass(), "nameplateId", 0);
        setIntField(term80302, term80302.getClass(), "trophyId", 0);
        setIntField(term80302, term80302.getClass(), "cardId", 0);
        setIntField(term80302, term80302.getClass(), "characterId", 0);
        setIntField(term80302, term80302.getClass(), "characterVoiceNo", 0);
        setIntField(term80302, term80302.getClass(), "tabSetting", 0);
        setIntField(term80302, term80302.getClass(), "tabSortSetting", 0);
        setIntField(term80302, term80302.getClass(), "cardCategorySetting", 0);
        setIntField(term80302, term80302.getClass(), "cardSortSetting", 0);
        setIntField(term80302, term80302.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80302, term80302.getClass(), "playedTutorialBit", 0);
        setIntField(term80302, term80302.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80302, term80302.getClass(), "sumTechHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80302, term80302.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80302, term80302.getClass(), "eventWatchedDate", null);
        setField(term80302, term80302.getClass(), "cmEventWatchedDate", null);
        setField(term80302, term80302.getClass(), "firstGameId", null);
        setField(term80302, term80302.getClass(), "firstRomVersion", null);
        setField(term80302, term80302.getClass(), "firstDataVersion", null);
        setField(term80302, term80302.getClass(), "firstPlayDate", null);
        setField(term80302, term80302.getClass(), "lastGameId", null);
        setField(term80302, term80302.getClass(), "lastRomVersion", null);
        setField(term80302, term80302.getClass(), "lastDataVersion", null);
        setField(term80302, term80302.getClass(), "compatibleCmVersion", null);
        setField(term80302, term80302.getClass(), "lastPlayDate", null);
        setIntField(term80302, term80302.getClass(), "lastPlaceId", 0);
        setField(term80302, term80302.getClass(), "lastPlaceName", null);
        setIntField(term80302, term80302.getClass(), "lastRegionId", 0);
        setField(term80302, term80302.getClass(), "lastRegionName", null);
        setIntField(term80302, term80302.getClass(), "lastAllNetId", 0);
        setField(term80302, term80302.getClass(), "lastClientId", null);
        setIntField(term80302, term80302.getClass(), "lastUsedDeckId", 0);
        setIntField(term80302, term80302.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80302, term80302.getClass(), "lastEmoneyBrand", 0);
        term80349 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80349;
        callMethod(klass, "setPlayCount", argTypes, term80302, args);
    }

};


