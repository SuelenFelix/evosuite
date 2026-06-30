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
import java.lang.Long;

public class UserData_setExp_33113535197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80155;
     Object term80202;

    public UserData_setExp_33113535197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80155 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80155, term80155.getClass(), "id", 0L);
        setField(term80155, term80155.getClass(), "card", null);
        setField(term80155, term80155.getClass(), "userName", null);
        setIntField(term80155, term80155.getClass(), "level", 0);
        setIntField(term80155, term80155.getClass(), "reincarnationNum", 0);
        setLongField(term80155, term80155.getClass(), "exp", 0L);
        setLongField(term80155, term80155.getClass(), "point", 0L);
        setLongField(term80155, term80155.getClass(), "totalPoint", 0L);
        setIntField(term80155, term80155.getClass(), "playCount", 0);
        setIntField(term80155, term80155.getClass(), "jewelCount", 0);
        setIntField(term80155, term80155.getClass(), "totalJewelCount", 0);
        setIntField(term80155, term80155.getClass(), "medalCount", 0);
        setIntField(term80155, term80155.getClass(), "playerRating", 0);
        setIntField(term80155, term80155.getClass(), "highestRating", 0);
        setIntField(term80155, term80155.getClass(), "battlePoint", 0);
        setIntField(term80155, term80155.getClass(), "bestBattlePoint", 0);
        setIntField(term80155, term80155.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80155, term80155.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80155, term80155.getClass(), "nameplateId", 0);
        setIntField(term80155, term80155.getClass(), "trophyId", 0);
        setIntField(term80155, term80155.getClass(), "cardId", 0);
        setIntField(term80155, term80155.getClass(), "characterId", 0);
        setIntField(term80155, term80155.getClass(), "characterVoiceNo", 0);
        setIntField(term80155, term80155.getClass(), "tabSetting", 0);
        setIntField(term80155, term80155.getClass(), "tabSortSetting", 0);
        setIntField(term80155, term80155.getClass(), "cardCategorySetting", 0);
        setIntField(term80155, term80155.getClass(), "cardSortSetting", 0);
        setIntField(term80155, term80155.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80155, term80155.getClass(), "playedTutorialBit", 0);
        setIntField(term80155, term80155.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80155, term80155.getClass(), "sumTechHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80155, term80155.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80155, term80155.getClass(), "eventWatchedDate", null);
        setField(term80155, term80155.getClass(), "cmEventWatchedDate", null);
        setField(term80155, term80155.getClass(), "firstGameId", null);
        setField(term80155, term80155.getClass(), "firstRomVersion", null);
        setField(term80155, term80155.getClass(), "firstDataVersion", null);
        setField(term80155, term80155.getClass(), "firstPlayDate", null);
        setField(term80155, term80155.getClass(), "lastGameId", null);
        setField(term80155, term80155.getClass(), "lastRomVersion", null);
        setField(term80155, term80155.getClass(), "lastDataVersion", null);
        setField(term80155, term80155.getClass(), "compatibleCmVersion", null);
        setField(term80155, term80155.getClass(), "lastPlayDate", null);
        setIntField(term80155, term80155.getClass(), "lastPlaceId", 0);
        setField(term80155, term80155.getClass(), "lastPlaceName", null);
        setIntField(term80155, term80155.getClass(), "lastRegionId", 0);
        setField(term80155, term80155.getClass(), "lastRegionName", null);
        setIntField(term80155, term80155.getClass(), "lastAllNetId", 0);
        setField(term80155, term80155.getClass(), "lastClientId", null);
        setIntField(term80155, term80155.getClass(), "lastUsedDeckId", 0);
        setIntField(term80155, term80155.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80155, term80155.getClass(), "lastEmoneyBrand", 0);
        term80202 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term80202;
        callMethod(klass, "setExp", argTypes, term80155, args);
    }

};


