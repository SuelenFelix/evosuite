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

public class UserData_setCardId_622182993212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80890;
     Object term80937;

    public UserData_setCardId_622182993212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80890 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80890, term80890.getClass(), "id", 0L);
        setField(term80890, term80890.getClass(), "card", null);
        setField(term80890, term80890.getClass(), "userName", null);
        setIntField(term80890, term80890.getClass(), "level", 0);
        setIntField(term80890, term80890.getClass(), "reincarnationNum", 0);
        setLongField(term80890, term80890.getClass(), "exp", 0L);
        setLongField(term80890, term80890.getClass(), "point", 0L);
        setLongField(term80890, term80890.getClass(), "totalPoint", 0L);
        setIntField(term80890, term80890.getClass(), "playCount", 0);
        setIntField(term80890, term80890.getClass(), "jewelCount", 0);
        setIntField(term80890, term80890.getClass(), "totalJewelCount", 0);
        setIntField(term80890, term80890.getClass(), "medalCount", 0);
        setIntField(term80890, term80890.getClass(), "playerRating", 0);
        setIntField(term80890, term80890.getClass(), "highestRating", 0);
        setIntField(term80890, term80890.getClass(), "battlePoint", 0);
        setIntField(term80890, term80890.getClass(), "bestBattlePoint", 0);
        setIntField(term80890, term80890.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80890, term80890.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80890, term80890.getClass(), "nameplateId", 0);
        setIntField(term80890, term80890.getClass(), "trophyId", 0);
        setIntField(term80890, term80890.getClass(), "cardId", 0);
        setIntField(term80890, term80890.getClass(), "characterId", 0);
        setIntField(term80890, term80890.getClass(), "characterVoiceNo", 0);
        setIntField(term80890, term80890.getClass(), "tabSetting", 0);
        setIntField(term80890, term80890.getClass(), "tabSortSetting", 0);
        setIntField(term80890, term80890.getClass(), "cardCategorySetting", 0);
        setIntField(term80890, term80890.getClass(), "cardSortSetting", 0);
        setIntField(term80890, term80890.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80890, term80890.getClass(), "playedTutorialBit", 0);
        setIntField(term80890, term80890.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80890, term80890.getClass(), "sumTechHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80890, term80890.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80890, term80890.getClass(), "eventWatchedDate", null);
        setField(term80890, term80890.getClass(), "cmEventWatchedDate", null);
        setField(term80890, term80890.getClass(), "firstGameId", null);
        setField(term80890, term80890.getClass(), "firstRomVersion", null);
        setField(term80890, term80890.getClass(), "firstDataVersion", null);
        setField(term80890, term80890.getClass(), "firstPlayDate", null);
        setField(term80890, term80890.getClass(), "lastGameId", null);
        setField(term80890, term80890.getClass(), "lastRomVersion", null);
        setField(term80890, term80890.getClass(), "lastDataVersion", null);
        setField(term80890, term80890.getClass(), "compatibleCmVersion", null);
        setField(term80890, term80890.getClass(), "lastPlayDate", null);
        setIntField(term80890, term80890.getClass(), "lastPlaceId", 0);
        setField(term80890, term80890.getClass(), "lastPlaceName", null);
        setIntField(term80890, term80890.getClass(), "lastRegionId", 0);
        setField(term80890, term80890.getClass(), "lastRegionName", null);
        setIntField(term80890, term80890.getClass(), "lastAllNetId", 0);
        setField(term80890, term80890.getClass(), "lastClientId", null);
        setIntField(term80890, term80890.getClass(), "lastUsedDeckId", 0);
        setIntField(term80890, term80890.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80890, term80890.getClass(), "lastEmoneyBrand", 0);
        term80937 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80937;
        callMethod(klass, "setCardId", argTypes, term80890, args);
    }

};


