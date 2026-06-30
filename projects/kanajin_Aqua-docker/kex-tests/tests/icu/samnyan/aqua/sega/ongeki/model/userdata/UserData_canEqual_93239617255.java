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

public class UserData_canEqual_93239617255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82967;

    public UserData_canEqual_93239617255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82967 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82967, term82967.getClass(), "id", 0L);
        setField(term82967, term82967.getClass(), "card", null);
        setField(term82967, term82967.getClass(), "userName", null);
        setIntField(term82967, term82967.getClass(), "level", 0);
        setIntField(term82967, term82967.getClass(), "reincarnationNum", 0);
        setLongField(term82967, term82967.getClass(), "exp", 0L);
        setLongField(term82967, term82967.getClass(), "point", 0L);
        setLongField(term82967, term82967.getClass(), "totalPoint", 0L);
        setIntField(term82967, term82967.getClass(), "playCount", 0);
        setIntField(term82967, term82967.getClass(), "jewelCount", 0);
        setIntField(term82967, term82967.getClass(), "totalJewelCount", 0);
        setIntField(term82967, term82967.getClass(), "medalCount", 0);
        setIntField(term82967, term82967.getClass(), "playerRating", 0);
        setIntField(term82967, term82967.getClass(), "highestRating", 0);
        setIntField(term82967, term82967.getClass(), "battlePoint", 0);
        setIntField(term82967, term82967.getClass(), "bestBattlePoint", 0);
        setIntField(term82967, term82967.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82967, term82967.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82967, term82967.getClass(), "nameplateId", 0);
        setIntField(term82967, term82967.getClass(), "trophyId", 0);
        setIntField(term82967, term82967.getClass(), "cardId", 0);
        setIntField(term82967, term82967.getClass(), "characterId", 0);
        setIntField(term82967, term82967.getClass(), "characterVoiceNo", 0);
        setIntField(term82967, term82967.getClass(), "tabSetting", 0);
        setIntField(term82967, term82967.getClass(), "tabSortSetting", 0);
        setIntField(term82967, term82967.getClass(), "cardCategorySetting", 0);
        setIntField(term82967, term82967.getClass(), "cardSortSetting", 0);
        setIntField(term82967, term82967.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82967, term82967.getClass(), "playedTutorialBit", 0);
        setIntField(term82967, term82967.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82967, term82967.getClass(), "sumTechHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82967, term82967.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82967, term82967.getClass(), "eventWatchedDate", null);
        setField(term82967, term82967.getClass(), "cmEventWatchedDate", null);
        setField(term82967, term82967.getClass(), "firstGameId", null);
        setField(term82967, term82967.getClass(), "firstRomVersion", null);
        setField(term82967, term82967.getClass(), "firstDataVersion", null);
        setField(term82967, term82967.getClass(), "firstPlayDate", null);
        setField(term82967, term82967.getClass(), "lastGameId", null);
        setField(term82967, term82967.getClass(), "lastRomVersion", null);
        setField(term82967, term82967.getClass(), "lastDataVersion", null);
        setField(term82967, term82967.getClass(), "compatibleCmVersion", null);
        setField(term82967, term82967.getClass(), "lastPlayDate", null);
        setIntField(term82967, term82967.getClass(), "lastPlaceId", 0);
        setField(term82967, term82967.getClass(), "lastPlaceName", null);
        setIntField(term82967, term82967.getClass(), "lastRegionId", 0);
        setField(term82967, term82967.getClass(), "lastRegionName", null);
        setIntField(term82967, term82967.getClass(), "lastAllNetId", 0);
        setField(term82967, term82967.getClass(), "lastClientId", null);
        setIntField(term82967, term82967.getClass(), "lastUsedDeckId", 0);
        setIntField(term82967, term82967.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82967, term82967.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term82967, args);
    }

};


