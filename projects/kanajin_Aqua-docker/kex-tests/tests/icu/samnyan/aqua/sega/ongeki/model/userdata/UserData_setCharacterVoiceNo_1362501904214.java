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

public class UserData_setCharacterVoiceNo_1362501904214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80988;
     Object term81035;

    public UserData_setCharacterVoiceNo_1362501904214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80988 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80988, term80988.getClass(), "id", 0L);
        setField(term80988, term80988.getClass(), "card", null);
        setField(term80988, term80988.getClass(), "userName", null);
        setIntField(term80988, term80988.getClass(), "level", 0);
        setIntField(term80988, term80988.getClass(), "reincarnationNum", 0);
        setLongField(term80988, term80988.getClass(), "exp", 0L);
        setLongField(term80988, term80988.getClass(), "point", 0L);
        setLongField(term80988, term80988.getClass(), "totalPoint", 0L);
        setIntField(term80988, term80988.getClass(), "playCount", 0);
        setIntField(term80988, term80988.getClass(), "jewelCount", 0);
        setIntField(term80988, term80988.getClass(), "totalJewelCount", 0);
        setIntField(term80988, term80988.getClass(), "medalCount", 0);
        setIntField(term80988, term80988.getClass(), "playerRating", 0);
        setIntField(term80988, term80988.getClass(), "highestRating", 0);
        setIntField(term80988, term80988.getClass(), "battlePoint", 0);
        setIntField(term80988, term80988.getClass(), "bestBattlePoint", 0);
        setIntField(term80988, term80988.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80988, term80988.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80988, term80988.getClass(), "nameplateId", 0);
        setIntField(term80988, term80988.getClass(), "trophyId", 0);
        setIntField(term80988, term80988.getClass(), "cardId", 0);
        setIntField(term80988, term80988.getClass(), "characterId", 0);
        setIntField(term80988, term80988.getClass(), "characterVoiceNo", 0);
        setIntField(term80988, term80988.getClass(), "tabSetting", 0);
        setIntField(term80988, term80988.getClass(), "tabSortSetting", 0);
        setIntField(term80988, term80988.getClass(), "cardCategorySetting", 0);
        setIntField(term80988, term80988.getClass(), "cardSortSetting", 0);
        setIntField(term80988, term80988.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80988, term80988.getClass(), "playedTutorialBit", 0);
        setIntField(term80988, term80988.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80988, term80988.getClass(), "sumTechHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80988, term80988.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80988, term80988.getClass(), "eventWatchedDate", null);
        setField(term80988, term80988.getClass(), "cmEventWatchedDate", null);
        setField(term80988, term80988.getClass(), "firstGameId", null);
        setField(term80988, term80988.getClass(), "firstRomVersion", null);
        setField(term80988, term80988.getClass(), "firstDataVersion", null);
        setField(term80988, term80988.getClass(), "firstPlayDate", null);
        setField(term80988, term80988.getClass(), "lastGameId", null);
        setField(term80988, term80988.getClass(), "lastRomVersion", null);
        setField(term80988, term80988.getClass(), "lastDataVersion", null);
        setField(term80988, term80988.getClass(), "compatibleCmVersion", null);
        setField(term80988, term80988.getClass(), "lastPlayDate", null);
        setIntField(term80988, term80988.getClass(), "lastPlaceId", 0);
        setField(term80988, term80988.getClass(), "lastPlaceName", null);
        setIntField(term80988, term80988.getClass(), "lastRegionId", 0);
        setField(term80988, term80988.getClass(), "lastRegionName", null);
        setIntField(term80988, term80988.getClass(), "lastAllNetId", 0);
        setField(term80988, term80988.getClass(), "lastClientId", null);
        setIntField(term80988, term80988.getClass(), "lastUsedDeckId", 0);
        setIntField(term80988, term80988.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80988, term80988.getClass(), "lastEmoneyBrand", 0);
        term81035 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81035;
        callMethod(klass, "setCharacterVoiceNo", argTypes, term80988, args);
    }

};


