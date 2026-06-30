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

public class UserData_setLevel_1684889094195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80057;
     Object term80104;

    public UserData_setLevel_1684889094195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80057 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80057, term80057.getClass(), "id", 0L);
        setField(term80057, term80057.getClass(), "card", null);
        setField(term80057, term80057.getClass(), "userName", null);
        setIntField(term80057, term80057.getClass(), "level", 0);
        setIntField(term80057, term80057.getClass(), "reincarnationNum", 0);
        setLongField(term80057, term80057.getClass(), "exp", 0L);
        setLongField(term80057, term80057.getClass(), "point", 0L);
        setLongField(term80057, term80057.getClass(), "totalPoint", 0L);
        setIntField(term80057, term80057.getClass(), "playCount", 0);
        setIntField(term80057, term80057.getClass(), "jewelCount", 0);
        setIntField(term80057, term80057.getClass(), "totalJewelCount", 0);
        setIntField(term80057, term80057.getClass(), "medalCount", 0);
        setIntField(term80057, term80057.getClass(), "playerRating", 0);
        setIntField(term80057, term80057.getClass(), "highestRating", 0);
        setIntField(term80057, term80057.getClass(), "battlePoint", 0);
        setIntField(term80057, term80057.getClass(), "bestBattlePoint", 0);
        setIntField(term80057, term80057.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80057, term80057.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80057, term80057.getClass(), "nameplateId", 0);
        setIntField(term80057, term80057.getClass(), "trophyId", 0);
        setIntField(term80057, term80057.getClass(), "cardId", 0);
        setIntField(term80057, term80057.getClass(), "characterId", 0);
        setIntField(term80057, term80057.getClass(), "characterVoiceNo", 0);
        setIntField(term80057, term80057.getClass(), "tabSetting", 0);
        setIntField(term80057, term80057.getClass(), "tabSortSetting", 0);
        setIntField(term80057, term80057.getClass(), "cardCategorySetting", 0);
        setIntField(term80057, term80057.getClass(), "cardSortSetting", 0);
        setIntField(term80057, term80057.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80057, term80057.getClass(), "playedTutorialBit", 0);
        setIntField(term80057, term80057.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80057, term80057.getClass(), "sumTechHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80057, term80057.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80057, term80057.getClass(), "eventWatchedDate", null);
        setField(term80057, term80057.getClass(), "cmEventWatchedDate", null);
        setField(term80057, term80057.getClass(), "firstGameId", null);
        setField(term80057, term80057.getClass(), "firstRomVersion", null);
        setField(term80057, term80057.getClass(), "firstDataVersion", null);
        setField(term80057, term80057.getClass(), "firstPlayDate", null);
        setField(term80057, term80057.getClass(), "lastGameId", null);
        setField(term80057, term80057.getClass(), "lastRomVersion", null);
        setField(term80057, term80057.getClass(), "lastDataVersion", null);
        setField(term80057, term80057.getClass(), "compatibleCmVersion", null);
        setField(term80057, term80057.getClass(), "lastPlayDate", null);
        setIntField(term80057, term80057.getClass(), "lastPlaceId", 0);
        setField(term80057, term80057.getClass(), "lastPlaceName", null);
        setIntField(term80057, term80057.getClass(), "lastRegionId", 0);
        setField(term80057, term80057.getClass(), "lastRegionName", null);
        setIntField(term80057, term80057.getClass(), "lastAllNetId", 0);
        setField(term80057, term80057.getClass(), "lastClientId", null);
        setIntField(term80057, term80057.getClass(), "lastUsedDeckId", 0);
        setIntField(term80057, term80057.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80057, term80057.getClass(), "lastEmoneyBrand", 0);
        term80104 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80104;
        callMethod(klass, "setLevel", argTypes, term80057, args);
    }

};


