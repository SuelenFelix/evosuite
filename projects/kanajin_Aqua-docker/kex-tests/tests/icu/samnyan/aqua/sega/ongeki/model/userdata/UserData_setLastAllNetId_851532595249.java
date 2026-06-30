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

public class UserData_setLastAllNetId_851532595249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82677;
     Object term82724;

    public UserData_setLastAllNetId_851532595249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82677 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82677, term82677.getClass(), "id", 0L);
        setField(term82677, term82677.getClass(), "card", null);
        setField(term82677, term82677.getClass(), "userName", null);
        setIntField(term82677, term82677.getClass(), "level", 0);
        setIntField(term82677, term82677.getClass(), "reincarnationNum", 0);
        setLongField(term82677, term82677.getClass(), "exp", 0L);
        setLongField(term82677, term82677.getClass(), "point", 0L);
        setLongField(term82677, term82677.getClass(), "totalPoint", 0L);
        setIntField(term82677, term82677.getClass(), "playCount", 0);
        setIntField(term82677, term82677.getClass(), "jewelCount", 0);
        setIntField(term82677, term82677.getClass(), "totalJewelCount", 0);
        setIntField(term82677, term82677.getClass(), "medalCount", 0);
        setIntField(term82677, term82677.getClass(), "playerRating", 0);
        setIntField(term82677, term82677.getClass(), "highestRating", 0);
        setIntField(term82677, term82677.getClass(), "battlePoint", 0);
        setIntField(term82677, term82677.getClass(), "bestBattlePoint", 0);
        setIntField(term82677, term82677.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82677, term82677.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82677, term82677.getClass(), "nameplateId", 0);
        setIntField(term82677, term82677.getClass(), "trophyId", 0);
        setIntField(term82677, term82677.getClass(), "cardId", 0);
        setIntField(term82677, term82677.getClass(), "characterId", 0);
        setIntField(term82677, term82677.getClass(), "characterVoiceNo", 0);
        setIntField(term82677, term82677.getClass(), "tabSetting", 0);
        setIntField(term82677, term82677.getClass(), "tabSortSetting", 0);
        setIntField(term82677, term82677.getClass(), "cardCategorySetting", 0);
        setIntField(term82677, term82677.getClass(), "cardSortSetting", 0);
        setIntField(term82677, term82677.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82677, term82677.getClass(), "playedTutorialBit", 0);
        setIntField(term82677, term82677.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82677, term82677.getClass(), "sumTechHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82677, term82677.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82677, term82677.getClass(), "eventWatchedDate", null);
        setField(term82677, term82677.getClass(), "cmEventWatchedDate", null);
        setField(term82677, term82677.getClass(), "firstGameId", null);
        setField(term82677, term82677.getClass(), "firstRomVersion", null);
        setField(term82677, term82677.getClass(), "firstDataVersion", null);
        setField(term82677, term82677.getClass(), "firstPlayDate", null);
        setField(term82677, term82677.getClass(), "lastGameId", null);
        setField(term82677, term82677.getClass(), "lastRomVersion", null);
        setField(term82677, term82677.getClass(), "lastDataVersion", null);
        setField(term82677, term82677.getClass(), "compatibleCmVersion", null);
        setField(term82677, term82677.getClass(), "lastPlayDate", null);
        setIntField(term82677, term82677.getClass(), "lastPlaceId", 0);
        setField(term82677, term82677.getClass(), "lastPlaceName", null);
        setIntField(term82677, term82677.getClass(), "lastRegionId", 0);
        setField(term82677, term82677.getClass(), "lastRegionName", null);
        setIntField(term82677, term82677.getClass(), "lastAllNetId", 0);
        setField(term82677, term82677.getClass(), "lastClientId", null);
        setIntField(term82677, term82677.getClass(), "lastUsedDeckId", 0);
        setIntField(term82677, term82677.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82677, term82677.getClass(), "lastEmoneyBrand", 0);
        term82724 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82724;
        callMethod(klass, "setLastAllNetId", argTypes, term82677, args);
    }

};


