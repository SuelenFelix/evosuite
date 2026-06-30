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

public class UserData_setReincarnationNum_11274633196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80106;
     Object term80153;

    public UserData_setReincarnationNum_11274633196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80106 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80106, term80106.getClass(), "id", 0L);
        setField(term80106, term80106.getClass(), "card", null);
        setField(term80106, term80106.getClass(), "userName", null);
        setIntField(term80106, term80106.getClass(), "level", 0);
        setIntField(term80106, term80106.getClass(), "reincarnationNum", 0);
        setLongField(term80106, term80106.getClass(), "exp", 0L);
        setLongField(term80106, term80106.getClass(), "point", 0L);
        setLongField(term80106, term80106.getClass(), "totalPoint", 0L);
        setIntField(term80106, term80106.getClass(), "playCount", 0);
        setIntField(term80106, term80106.getClass(), "jewelCount", 0);
        setIntField(term80106, term80106.getClass(), "totalJewelCount", 0);
        setIntField(term80106, term80106.getClass(), "medalCount", 0);
        setIntField(term80106, term80106.getClass(), "playerRating", 0);
        setIntField(term80106, term80106.getClass(), "highestRating", 0);
        setIntField(term80106, term80106.getClass(), "battlePoint", 0);
        setIntField(term80106, term80106.getClass(), "bestBattlePoint", 0);
        setIntField(term80106, term80106.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80106, term80106.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80106, term80106.getClass(), "nameplateId", 0);
        setIntField(term80106, term80106.getClass(), "trophyId", 0);
        setIntField(term80106, term80106.getClass(), "cardId", 0);
        setIntField(term80106, term80106.getClass(), "characterId", 0);
        setIntField(term80106, term80106.getClass(), "characterVoiceNo", 0);
        setIntField(term80106, term80106.getClass(), "tabSetting", 0);
        setIntField(term80106, term80106.getClass(), "tabSortSetting", 0);
        setIntField(term80106, term80106.getClass(), "cardCategorySetting", 0);
        setIntField(term80106, term80106.getClass(), "cardSortSetting", 0);
        setIntField(term80106, term80106.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80106, term80106.getClass(), "playedTutorialBit", 0);
        setIntField(term80106, term80106.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80106, term80106.getClass(), "sumTechHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80106, term80106.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80106, term80106.getClass(), "eventWatchedDate", null);
        setField(term80106, term80106.getClass(), "cmEventWatchedDate", null);
        setField(term80106, term80106.getClass(), "firstGameId", null);
        setField(term80106, term80106.getClass(), "firstRomVersion", null);
        setField(term80106, term80106.getClass(), "firstDataVersion", null);
        setField(term80106, term80106.getClass(), "firstPlayDate", null);
        setField(term80106, term80106.getClass(), "lastGameId", null);
        setField(term80106, term80106.getClass(), "lastRomVersion", null);
        setField(term80106, term80106.getClass(), "lastDataVersion", null);
        setField(term80106, term80106.getClass(), "compatibleCmVersion", null);
        setField(term80106, term80106.getClass(), "lastPlayDate", null);
        setIntField(term80106, term80106.getClass(), "lastPlaceId", 0);
        setField(term80106, term80106.getClass(), "lastPlaceName", null);
        setIntField(term80106, term80106.getClass(), "lastRegionId", 0);
        setField(term80106, term80106.getClass(), "lastRegionName", null);
        setIntField(term80106, term80106.getClass(), "lastAllNetId", 0);
        setField(term80106, term80106.getClass(), "lastClientId", null);
        setIntField(term80106, term80106.getClass(), "lastUsedDeckId", 0);
        setIntField(term80106, term80106.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80106, term80106.getClass(), "lastEmoneyBrand", 0);
        term80153 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80153;
        callMethod(klass, "setReincarnationNum", argTypes, term80106, args);
    }

};


