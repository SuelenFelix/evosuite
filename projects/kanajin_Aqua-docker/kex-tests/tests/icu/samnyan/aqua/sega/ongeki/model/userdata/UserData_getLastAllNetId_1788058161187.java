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

public class UserData_getLastAllNetId_1788058161187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79679;

    public UserData_getLastAllNetId_1788058161187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79679 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79679, term79679.getClass(), "id", 0L);
        setField(term79679, term79679.getClass(), "card", null);
        setField(term79679, term79679.getClass(), "userName", null);
        setIntField(term79679, term79679.getClass(), "level", 0);
        setIntField(term79679, term79679.getClass(), "reincarnationNum", 0);
        setLongField(term79679, term79679.getClass(), "exp", 0L);
        setLongField(term79679, term79679.getClass(), "point", 0L);
        setLongField(term79679, term79679.getClass(), "totalPoint", 0L);
        setIntField(term79679, term79679.getClass(), "playCount", 0);
        setIntField(term79679, term79679.getClass(), "jewelCount", 0);
        setIntField(term79679, term79679.getClass(), "totalJewelCount", 0);
        setIntField(term79679, term79679.getClass(), "medalCount", 0);
        setIntField(term79679, term79679.getClass(), "playerRating", 0);
        setIntField(term79679, term79679.getClass(), "highestRating", 0);
        setIntField(term79679, term79679.getClass(), "battlePoint", 0);
        setIntField(term79679, term79679.getClass(), "bestBattlePoint", 0);
        setIntField(term79679, term79679.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79679, term79679.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79679, term79679.getClass(), "nameplateId", 0);
        setIntField(term79679, term79679.getClass(), "trophyId", 0);
        setIntField(term79679, term79679.getClass(), "cardId", 0);
        setIntField(term79679, term79679.getClass(), "characterId", 0);
        setIntField(term79679, term79679.getClass(), "characterVoiceNo", 0);
        setIntField(term79679, term79679.getClass(), "tabSetting", 0);
        setIntField(term79679, term79679.getClass(), "tabSortSetting", 0);
        setIntField(term79679, term79679.getClass(), "cardCategorySetting", 0);
        setIntField(term79679, term79679.getClass(), "cardSortSetting", 0);
        setIntField(term79679, term79679.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79679, term79679.getClass(), "playedTutorialBit", 0);
        setIntField(term79679, term79679.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79679, term79679.getClass(), "sumTechHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79679, term79679.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79679, term79679.getClass(), "eventWatchedDate", null);
        setField(term79679, term79679.getClass(), "cmEventWatchedDate", null);
        setField(term79679, term79679.getClass(), "firstGameId", null);
        setField(term79679, term79679.getClass(), "firstRomVersion", null);
        setField(term79679, term79679.getClass(), "firstDataVersion", null);
        setField(term79679, term79679.getClass(), "firstPlayDate", null);
        setField(term79679, term79679.getClass(), "lastGameId", null);
        setField(term79679, term79679.getClass(), "lastRomVersion", null);
        setField(term79679, term79679.getClass(), "lastDataVersion", null);
        setField(term79679, term79679.getClass(), "compatibleCmVersion", null);
        setField(term79679, term79679.getClass(), "lastPlayDate", null);
        setIntField(term79679, term79679.getClass(), "lastPlaceId", 0);
        setField(term79679, term79679.getClass(), "lastPlaceName", null);
        setIntField(term79679, term79679.getClass(), "lastRegionId", 0);
        setField(term79679, term79679.getClass(), "lastRegionName", null);
        setIntField(term79679, term79679.getClass(), "lastAllNetId", 0);
        setField(term79679, term79679.getClass(), "lastClientId", null);
        setIntField(term79679, term79679.getClass(), "lastUsedDeckId", 0);
        setIntField(term79679, term79679.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79679, term79679.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term79679, args);
    }

};


