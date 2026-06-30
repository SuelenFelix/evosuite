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

public class UserData_setBattlePoint_883549882206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80596;
     Object term80643;

    public UserData_setBattlePoint_883549882206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80596 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80596, term80596.getClass(), "id", 0L);
        setField(term80596, term80596.getClass(), "card", null);
        setField(term80596, term80596.getClass(), "userName", null);
        setIntField(term80596, term80596.getClass(), "level", 0);
        setIntField(term80596, term80596.getClass(), "reincarnationNum", 0);
        setLongField(term80596, term80596.getClass(), "exp", 0L);
        setLongField(term80596, term80596.getClass(), "point", 0L);
        setLongField(term80596, term80596.getClass(), "totalPoint", 0L);
        setIntField(term80596, term80596.getClass(), "playCount", 0);
        setIntField(term80596, term80596.getClass(), "jewelCount", 0);
        setIntField(term80596, term80596.getClass(), "totalJewelCount", 0);
        setIntField(term80596, term80596.getClass(), "medalCount", 0);
        setIntField(term80596, term80596.getClass(), "playerRating", 0);
        setIntField(term80596, term80596.getClass(), "highestRating", 0);
        setIntField(term80596, term80596.getClass(), "battlePoint", 0);
        setIntField(term80596, term80596.getClass(), "bestBattlePoint", 0);
        setIntField(term80596, term80596.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80596, term80596.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80596, term80596.getClass(), "nameplateId", 0);
        setIntField(term80596, term80596.getClass(), "trophyId", 0);
        setIntField(term80596, term80596.getClass(), "cardId", 0);
        setIntField(term80596, term80596.getClass(), "characterId", 0);
        setIntField(term80596, term80596.getClass(), "characterVoiceNo", 0);
        setIntField(term80596, term80596.getClass(), "tabSetting", 0);
        setIntField(term80596, term80596.getClass(), "tabSortSetting", 0);
        setIntField(term80596, term80596.getClass(), "cardCategorySetting", 0);
        setIntField(term80596, term80596.getClass(), "cardSortSetting", 0);
        setIntField(term80596, term80596.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80596, term80596.getClass(), "playedTutorialBit", 0);
        setIntField(term80596, term80596.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80596, term80596.getClass(), "sumTechHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80596, term80596.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80596, term80596.getClass(), "eventWatchedDate", null);
        setField(term80596, term80596.getClass(), "cmEventWatchedDate", null);
        setField(term80596, term80596.getClass(), "firstGameId", null);
        setField(term80596, term80596.getClass(), "firstRomVersion", null);
        setField(term80596, term80596.getClass(), "firstDataVersion", null);
        setField(term80596, term80596.getClass(), "firstPlayDate", null);
        setField(term80596, term80596.getClass(), "lastGameId", null);
        setField(term80596, term80596.getClass(), "lastRomVersion", null);
        setField(term80596, term80596.getClass(), "lastDataVersion", null);
        setField(term80596, term80596.getClass(), "compatibleCmVersion", null);
        setField(term80596, term80596.getClass(), "lastPlayDate", null);
        setIntField(term80596, term80596.getClass(), "lastPlaceId", 0);
        setField(term80596, term80596.getClass(), "lastPlaceName", null);
        setIntField(term80596, term80596.getClass(), "lastRegionId", 0);
        setField(term80596, term80596.getClass(), "lastRegionName", null);
        setIntField(term80596, term80596.getClass(), "lastAllNetId", 0);
        setField(term80596, term80596.getClass(), "lastClientId", null);
        setIntField(term80596, term80596.getClass(), "lastUsedDeckId", 0);
        setIntField(term80596, term80596.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80596, term80596.getClass(), "lastEmoneyBrand", 0);
        term80643 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80643;
        callMethod(klass, "setBattlePoint", argTypes, term80596, args);
    }

};


