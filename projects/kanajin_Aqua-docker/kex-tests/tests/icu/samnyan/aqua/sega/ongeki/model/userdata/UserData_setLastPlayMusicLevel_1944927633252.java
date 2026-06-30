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

public class UserData_setLastPlayMusicLevel_1944927633252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82822;
     Object term82869;

    public UserData_setLastPlayMusicLevel_1944927633252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82822 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82822, term82822.getClass(), "id", 0L);
        setField(term82822, term82822.getClass(), "card", null);
        setField(term82822, term82822.getClass(), "userName", null);
        setIntField(term82822, term82822.getClass(), "level", 0);
        setIntField(term82822, term82822.getClass(), "reincarnationNum", 0);
        setLongField(term82822, term82822.getClass(), "exp", 0L);
        setLongField(term82822, term82822.getClass(), "point", 0L);
        setLongField(term82822, term82822.getClass(), "totalPoint", 0L);
        setIntField(term82822, term82822.getClass(), "playCount", 0);
        setIntField(term82822, term82822.getClass(), "jewelCount", 0);
        setIntField(term82822, term82822.getClass(), "totalJewelCount", 0);
        setIntField(term82822, term82822.getClass(), "medalCount", 0);
        setIntField(term82822, term82822.getClass(), "playerRating", 0);
        setIntField(term82822, term82822.getClass(), "highestRating", 0);
        setIntField(term82822, term82822.getClass(), "battlePoint", 0);
        setIntField(term82822, term82822.getClass(), "bestBattlePoint", 0);
        setIntField(term82822, term82822.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82822, term82822.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82822, term82822.getClass(), "nameplateId", 0);
        setIntField(term82822, term82822.getClass(), "trophyId", 0);
        setIntField(term82822, term82822.getClass(), "cardId", 0);
        setIntField(term82822, term82822.getClass(), "characterId", 0);
        setIntField(term82822, term82822.getClass(), "characterVoiceNo", 0);
        setIntField(term82822, term82822.getClass(), "tabSetting", 0);
        setIntField(term82822, term82822.getClass(), "tabSortSetting", 0);
        setIntField(term82822, term82822.getClass(), "cardCategorySetting", 0);
        setIntField(term82822, term82822.getClass(), "cardSortSetting", 0);
        setIntField(term82822, term82822.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82822, term82822.getClass(), "playedTutorialBit", 0);
        setIntField(term82822, term82822.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82822, term82822.getClass(), "sumTechHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82822, term82822.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82822, term82822.getClass(), "eventWatchedDate", null);
        setField(term82822, term82822.getClass(), "cmEventWatchedDate", null);
        setField(term82822, term82822.getClass(), "firstGameId", null);
        setField(term82822, term82822.getClass(), "firstRomVersion", null);
        setField(term82822, term82822.getClass(), "firstDataVersion", null);
        setField(term82822, term82822.getClass(), "firstPlayDate", null);
        setField(term82822, term82822.getClass(), "lastGameId", null);
        setField(term82822, term82822.getClass(), "lastRomVersion", null);
        setField(term82822, term82822.getClass(), "lastDataVersion", null);
        setField(term82822, term82822.getClass(), "compatibleCmVersion", null);
        setField(term82822, term82822.getClass(), "lastPlayDate", null);
        setIntField(term82822, term82822.getClass(), "lastPlaceId", 0);
        setField(term82822, term82822.getClass(), "lastPlaceName", null);
        setIntField(term82822, term82822.getClass(), "lastRegionId", 0);
        setField(term82822, term82822.getClass(), "lastRegionName", null);
        setIntField(term82822, term82822.getClass(), "lastAllNetId", 0);
        setField(term82822, term82822.getClass(), "lastClientId", null);
        setIntField(term82822, term82822.getClass(), "lastUsedDeckId", 0);
        setIntField(term82822, term82822.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82822, term82822.getClass(), "lastEmoneyBrand", 0);
        term82869 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82869;
        callMethod(klass, "setLastPlayMusicLevel", argTypes, term82822, args);
    }

};


