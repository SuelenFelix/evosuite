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

public class UserData_setCharacterId_1803103706213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80939;
     Object term80986;

    public UserData_setCharacterId_1803103706213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80939 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80939, term80939.getClass(), "id", 0L);
        setField(term80939, term80939.getClass(), "card", null);
        setField(term80939, term80939.getClass(), "userName", null);
        setIntField(term80939, term80939.getClass(), "level", 0);
        setIntField(term80939, term80939.getClass(), "reincarnationNum", 0);
        setLongField(term80939, term80939.getClass(), "exp", 0L);
        setLongField(term80939, term80939.getClass(), "point", 0L);
        setLongField(term80939, term80939.getClass(), "totalPoint", 0L);
        setIntField(term80939, term80939.getClass(), "playCount", 0);
        setIntField(term80939, term80939.getClass(), "jewelCount", 0);
        setIntField(term80939, term80939.getClass(), "totalJewelCount", 0);
        setIntField(term80939, term80939.getClass(), "medalCount", 0);
        setIntField(term80939, term80939.getClass(), "playerRating", 0);
        setIntField(term80939, term80939.getClass(), "highestRating", 0);
        setIntField(term80939, term80939.getClass(), "battlePoint", 0);
        setIntField(term80939, term80939.getClass(), "bestBattlePoint", 0);
        setIntField(term80939, term80939.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80939, term80939.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80939, term80939.getClass(), "nameplateId", 0);
        setIntField(term80939, term80939.getClass(), "trophyId", 0);
        setIntField(term80939, term80939.getClass(), "cardId", 0);
        setIntField(term80939, term80939.getClass(), "characterId", 0);
        setIntField(term80939, term80939.getClass(), "characterVoiceNo", 0);
        setIntField(term80939, term80939.getClass(), "tabSetting", 0);
        setIntField(term80939, term80939.getClass(), "tabSortSetting", 0);
        setIntField(term80939, term80939.getClass(), "cardCategorySetting", 0);
        setIntField(term80939, term80939.getClass(), "cardSortSetting", 0);
        setIntField(term80939, term80939.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80939, term80939.getClass(), "playedTutorialBit", 0);
        setIntField(term80939, term80939.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80939, term80939.getClass(), "sumTechHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80939, term80939.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80939, term80939.getClass(), "eventWatchedDate", null);
        setField(term80939, term80939.getClass(), "cmEventWatchedDate", null);
        setField(term80939, term80939.getClass(), "firstGameId", null);
        setField(term80939, term80939.getClass(), "firstRomVersion", null);
        setField(term80939, term80939.getClass(), "firstDataVersion", null);
        setField(term80939, term80939.getClass(), "firstPlayDate", null);
        setField(term80939, term80939.getClass(), "lastGameId", null);
        setField(term80939, term80939.getClass(), "lastRomVersion", null);
        setField(term80939, term80939.getClass(), "lastDataVersion", null);
        setField(term80939, term80939.getClass(), "compatibleCmVersion", null);
        setField(term80939, term80939.getClass(), "lastPlayDate", null);
        setIntField(term80939, term80939.getClass(), "lastPlaceId", 0);
        setField(term80939, term80939.getClass(), "lastPlaceName", null);
        setIntField(term80939, term80939.getClass(), "lastRegionId", 0);
        setField(term80939, term80939.getClass(), "lastRegionName", null);
        setIntField(term80939, term80939.getClass(), "lastAllNetId", 0);
        setField(term80939, term80939.getClass(), "lastClientId", null);
        setIntField(term80939, term80939.getClass(), "lastUsedDeckId", 0);
        setIntField(term80939, term80939.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80939, term80939.getClass(), "lastEmoneyBrand", 0);
        term80986 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80986;
        callMethod(klass, "setCharacterId", argTypes, term80939, args);
    }

};


