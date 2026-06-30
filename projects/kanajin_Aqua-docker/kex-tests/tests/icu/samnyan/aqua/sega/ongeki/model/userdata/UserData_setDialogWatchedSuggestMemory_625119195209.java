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
import java.lang.Boolean;

public class UserData_setDialogWatchedSuggestMemory_625119195209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80743;
     Object term80790;

    public UserData_setDialogWatchedSuggestMemory_625119195209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80743 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80743, term80743.getClass(), "id", 0L);
        setField(term80743, term80743.getClass(), "card", null);
        setField(term80743, term80743.getClass(), "userName", null);
        setIntField(term80743, term80743.getClass(), "level", 0);
        setIntField(term80743, term80743.getClass(), "reincarnationNum", 0);
        setLongField(term80743, term80743.getClass(), "exp", 0L);
        setLongField(term80743, term80743.getClass(), "point", 0L);
        setLongField(term80743, term80743.getClass(), "totalPoint", 0L);
        setIntField(term80743, term80743.getClass(), "playCount", 0);
        setIntField(term80743, term80743.getClass(), "jewelCount", 0);
        setIntField(term80743, term80743.getClass(), "totalJewelCount", 0);
        setIntField(term80743, term80743.getClass(), "medalCount", 0);
        setIntField(term80743, term80743.getClass(), "playerRating", 0);
        setIntField(term80743, term80743.getClass(), "highestRating", 0);
        setIntField(term80743, term80743.getClass(), "battlePoint", 0);
        setIntField(term80743, term80743.getClass(), "bestBattlePoint", 0);
        setIntField(term80743, term80743.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80743, term80743.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80743, term80743.getClass(), "nameplateId", 0);
        setIntField(term80743, term80743.getClass(), "trophyId", 0);
        setIntField(term80743, term80743.getClass(), "cardId", 0);
        setIntField(term80743, term80743.getClass(), "characterId", 0);
        setIntField(term80743, term80743.getClass(), "characterVoiceNo", 0);
        setIntField(term80743, term80743.getClass(), "tabSetting", 0);
        setIntField(term80743, term80743.getClass(), "tabSortSetting", 0);
        setIntField(term80743, term80743.getClass(), "cardCategorySetting", 0);
        setIntField(term80743, term80743.getClass(), "cardSortSetting", 0);
        setIntField(term80743, term80743.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80743, term80743.getClass(), "playedTutorialBit", 0);
        setIntField(term80743, term80743.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80743, term80743.getClass(), "sumTechHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80743, term80743.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80743, term80743.getClass(), "eventWatchedDate", null);
        setField(term80743, term80743.getClass(), "cmEventWatchedDate", null);
        setField(term80743, term80743.getClass(), "firstGameId", null);
        setField(term80743, term80743.getClass(), "firstRomVersion", null);
        setField(term80743, term80743.getClass(), "firstDataVersion", null);
        setField(term80743, term80743.getClass(), "firstPlayDate", null);
        setField(term80743, term80743.getClass(), "lastGameId", null);
        setField(term80743, term80743.getClass(), "lastRomVersion", null);
        setField(term80743, term80743.getClass(), "lastDataVersion", null);
        setField(term80743, term80743.getClass(), "compatibleCmVersion", null);
        setField(term80743, term80743.getClass(), "lastPlayDate", null);
        setIntField(term80743, term80743.getClass(), "lastPlaceId", 0);
        setField(term80743, term80743.getClass(), "lastPlaceName", null);
        setIntField(term80743, term80743.getClass(), "lastRegionId", 0);
        setField(term80743, term80743.getClass(), "lastRegionName", null);
        setIntField(term80743, term80743.getClass(), "lastAllNetId", 0);
        setField(term80743, term80743.getClass(), "lastClientId", null);
        setIntField(term80743, term80743.getClass(), "lastUsedDeckId", 0);
        setIntField(term80743, term80743.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80743, term80743.getClass(), "lastEmoneyBrand", 0);
        term80790 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term80790;
        callMethod(klass, "setDialogWatchedSuggestMemory", argTypes, term80743, args);
    }

};


