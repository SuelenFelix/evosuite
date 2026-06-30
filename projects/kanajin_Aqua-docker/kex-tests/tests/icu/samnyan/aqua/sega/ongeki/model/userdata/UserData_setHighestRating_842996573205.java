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

public class UserData_setHighestRating_842996573205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80547;
     Object term80594;

    public UserData_setHighestRating_842996573205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80547 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80547, term80547.getClass(), "id", 0L);
        setField(term80547, term80547.getClass(), "card", null);
        setField(term80547, term80547.getClass(), "userName", null);
        setIntField(term80547, term80547.getClass(), "level", 0);
        setIntField(term80547, term80547.getClass(), "reincarnationNum", 0);
        setLongField(term80547, term80547.getClass(), "exp", 0L);
        setLongField(term80547, term80547.getClass(), "point", 0L);
        setLongField(term80547, term80547.getClass(), "totalPoint", 0L);
        setIntField(term80547, term80547.getClass(), "playCount", 0);
        setIntField(term80547, term80547.getClass(), "jewelCount", 0);
        setIntField(term80547, term80547.getClass(), "totalJewelCount", 0);
        setIntField(term80547, term80547.getClass(), "medalCount", 0);
        setIntField(term80547, term80547.getClass(), "playerRating", 0);
        setIntField(term80547, term80547.getClass(), "highestRating", 0);
        setIntField(term80547, term80547.getClass(), "battlePoint", 0);
        setIntField(term80547, term80547.getClass(), "bestBattlePoint", 0);
        setIntField(term80547, term80547.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80547, term80547.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80547, term80547.getClass(), "nameplateId", 0);
        setIntField(term80547, term80547.getClass(), "trophyId", 0);
        setIntField(term80547, term80547.getClass(), "cardId", 0);
        setIntField(term80547, term80547.getClass(), "characterId", 0);
        setIntField(term80547, term80547.getClass(), "characterVoiceNo", 0);
        setIntField(term80547, term80547.getClass(), "tabSetting", 0);
        setIntField(term80547, term80547.getClass(), "tabSortSetting", 0);
        setIntField(term80547, term80547.getClass(), "cardCategorySetting", 0);
        setIntField(term80547, term80547.getClass(), "cardSortSetting", 0);
        setIntField(term80547, term80547.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80547, term80547.getClass(), "playedTutorialBit", 0);
        setIntField(term80547, term80547.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80547, term80547.getClass(), "sumTechHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80547, term80547.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80547, term80547.getClass(), "eventWatchedDate", null);
        setField(term80547, term80547.getClass(), "cmEventWatchedDate", null);
        setField(term80547, term80547.getClass(), "firstGameId", null);
        setField(term80547, term80547.getClass(), "firstRomVersion", null);
        setField(term80547, term80547.getClass(), "firstDataVersion", null);
        setField(term80547, term80547.getClass(), "firstPlayDate", null);
        setField(term80547, term80547.getClass(), "lastGameId", null);
        setField(term80547, term80547.getClass(), "lastRomVersion", null);
        setField(term80547, term80547.getClass(), "lastDataVersion", null);
        setField(term80547, term80547.getClass(), "compatibleCmVersion", null);
        setField(term80547, term80547.getClass(), "lastPlayDate", null);
        setIntField(term80547, term80547.getClass(), "lastPlaceId", 0);
        setField(term80547, term80547.getClass(), "lastPlaceName", null);
        setIntField(term80547, term80547.getClass(), "lastRegionId", 0);
        setField(term80547, term80547.getClass(), "lastRegionName", null);
        setIntField(term80547, term80547.getClass(), "lastAllNetId", 0);
        setField(term80547, term80547.getClass(), "lastClientId", null);
        setIntField(term80547, term80547.getClass(), "lastUsedDeckId", 0);
        setIntField(term80547, term80547.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80547, term80547.getClass(), "lastEmoneyBrand", 0);
        term80594 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80594;
        callMethod(klass, "setHighestRating", argTypes, term80547, args);
    }

};


