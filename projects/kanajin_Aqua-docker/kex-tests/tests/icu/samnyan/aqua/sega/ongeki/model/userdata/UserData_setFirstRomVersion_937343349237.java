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

public class UserData_setFirstRomVersion_937343349237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82109;

    public UserData_setFirstRomVersion_937343349237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82109 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82109, term82109.getClass(), "id", 0L);
        setField(term82109, term82109.getClass(), "card", null);
        setField(term82109, term82109.getClass(), "userName", null);
        setIntField(term82109, term82109.getClass(), "level", 0);
        setIntField(term82109, term82109.getClass(), "reincarnationNum", 0);
        setLongField(term82109, term82109.getClass(), "exp", 0L);
        setLongField(term82109, term82109.getClass(), "point", 0L);
        setLongField(term82109, term82109.getClass(), "totalPoint", 0L);
        setIntField(term82109, term82109.getClass(), "playCount", 0);
        setIntField(term82109, term82109.getClass(), "jewelCount", 0);
        setIntField(term82109, term82109.getClass(), "totalJewelCount", 0);
        setIntField(term82109, term82109.getClass(), "medalCount", 0);
        setIntField(term82109, term82109.getClass(), "playerRating", 0);
        setIntField(term82109, term82109.getClass(), "highestRating", 0);
        setIntField(term82109, term82109.getClass(), "battlePoint", 0);
        setIntField(term82109, term82109.getClass(), "bestBattlePoint", 0);
        setIntField(term82109, term82109.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82109, term82109.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82109, term82109.getClass(), "nameplateId", 0);
        setIntField(term82109, term82109.getClass(), "trophyId", 0);
        setIntField(term82109, term82109.getClass(), "cardId", 0);
        setIntField(term82109, term82109.getClass(), "characterId", 0);
        setIntField(term82109, term82109.getClass(), "characterVoiceNo", 0);
        setIntField(term82109, term82109.getClass(), "tabSetting", 0);
        setIntField(term82109, term82109.getClass(), "tabSortSetting", 0);
        setIntField(term82109, term82109.getClass(), "cardCategorySetting", 0);
        setIntField(term82109, term82109.getClass(), "cardSortSetting", 0);
        setIntField(term82109, term82109.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82109, term82109.getClass(), "playedTutorialBit", 0);
        setIntField(term82109, term82109.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82109, term82109.getClass(), "sumTechHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82109, term82109.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82109, term82109.getClass(), "eventWatchedDate", null);
        setField(term82109, term82109.getClass(), "cmEventWatchedDate", null);
        setField(term82109, term82109.getClass(), "firstGameId", null);
        setField(term82109, term82109.getClass(), "firstRomVersion", null);
        setField(term82109, term82109.getClass(), "firstDataVersion", null);
        setField(term82109, term82109.getClass(), "firstPlayDate", null);
        setField(term82109, term82109.getClass(), "lastGameId", null);
        setField(term82109, term82109.getClass(), "lastRomVersion", null);
        setField(term82109, term82109.getClass(), "lastDataVersion", null);
        setField(term82109, term82109.getClass(), "compatibleCmVersion", null);
        setField(term82109, term82109.getClass(), "lastPlayDate", null);
        setIntField(term82109, term82109.getClass(), "lastPlaceId", 0);
        setField(term82109, term82109.getClass(), "lastPlaceName", null);
        setIntField(term82109, term82109.getClass(), "lastRegionId", 0);
        setField(term82109, term82109.getClass(), "lastRegionName", null);
        setIntField(term82109, term82109.getClass(), "lastAllNetId", 0);
        setField(term82109, term82109.getClass(), "lastClientId", null);
        setIntField(term82109, term82109.getClass(), "lastUsedDeckId", 0);
        setIntField(term82109, term82109.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82109, term82109.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstRomVersion", argTypes, term82109, args);
    }

};


