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

public class UserData_setUserName_396848503194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80010;

    public UserData_setUserName_396848503194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80010 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80010, term80010.getClass(), "id", 0L);
        setField(term80010, term80010.getClass(), "card", null);
        setField(term80010, term80010.getClass(), "userName", null);
        setIntField(term80010, term80010.getClass(), "level", 0);
        setIntField(term80010, term80010.getClass(), "reincarnationNum", 0);
        setLongField(term80010, term80010.getClass(), "exp", 0L);
        setLongField(term80010, term80010.getClass(), "point", 0L);
        setLongField(term80010, term80010.getClass(), "totalPoint", 0L);
        setIntField(term80010, term80010.getClass(), "playCount", 0);
        setIntField(term80010, term80010.getClass(), "jewelCount", 0);
        setIntField(term80010, term80010.getClass(), "totalJewelCount", 0);
        setIntField(term80010, term80010.getClass(), "medalCount", 0);
        setIntField(term80010, term80010.getClass(), "playerRating", 0);
        setIntField(term80010, term80010.getClass(), "highestRating", 0);
        setIntField(term80010, term80010.getClass(), "battlePoint", 0);
        setIntField(term80010, term80010.getClass(), "bestBattlePoint", 0);
        setIntField(term80010, term80010.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80010, term80010.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80010, term80010.getClass(), "nameplateId", 0);
        setIntField(term80010, term80010.getClass(), "trophyId", 0);
        setIntField(term80010, term80010.getClass(), "cardId", 0);
        setIntField(term80010, term80010.getClass(), "characterId", 0);
        setIntField(term80010, term80010.getClass(), "characterVoiceNo", 0);
        setIntField(term80010, term80010.getClass(), "tabSetting", 0);
        setIntField(term80010, term80010.getClass(), "tabSortSetting", 0);
        setIntField(term80010, term80010.getClass(), "cardCategorySetting", 0);
        setIntField(term80010, term80010.getClass(), "cardSortSetting", 0);
        setIntField(term80010, term80010.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80010, term80010.getClass(), "playedTutorialBit", 0);
        setIntField(term80010, term80010.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80010, term80010.getClass(), "sumTechHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80010, term80010.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80010, term80010.getClass(), "eventWatchedDate", null);
        setField(term80010, term80010.getClass(), "cmEventWatchedDate", null);
        setField(term80010, term80010.getClass(), "firstGameId", null);
        setField(term80010, term80010.getClass(), "firstRomVersion", null);
        setField(term80010, term80010.getClass(), "firstDataVersion", null);
        setField(term80010, term80010.getClass(), "firstPlayDate", null);
        setField(term80010, term80010.getClass(), "lastGameId", null);
        setField(term80010, term80010.getClass(), "lastRomVersion", null);
        setField(term80010, term80010.getClass(), "lastDataVersion", null);
        setField(term80010, term80010.getClass(), "compatibleCmVersion", null);
        setField(term80010, term80010.getClass(), "lastPlayDate", null);
        setIntField(term80010, term80010.getClass(), "lastPlaceId", 0);
        setField(term80010, term80010.getClass(), "lastPlaceName", null);
        setIntField(term80010, term80010.getClass(), "lastRegionId", 0);
        setField(term80010, term80010.getClass(), "lastRegionName", null);
        setIntField(term80010, term80010.getClass(), "lastAllNetId", 0);
        setField(term80010, term80010.getClass(), "lastClientId", null);
        setIntField(term80010, term80010.getClass(), "lastUsedDeckId", 0);
        setIntField(term80010, term80010.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80010, term80010.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term80010, args);
    }

};


