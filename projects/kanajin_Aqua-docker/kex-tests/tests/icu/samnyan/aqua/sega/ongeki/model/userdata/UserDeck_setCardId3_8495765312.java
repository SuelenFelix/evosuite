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
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserDeck_setCardId3_8495765312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147571;
     Object term147840;

    public UserDeck_setCardId3_8495765312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147577 = new Long(768144790810175653L);
        term147571 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term147573 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term147575 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147606 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147571, term147571.getClass(), "id", -1437005206846486394L);
        setLongField(term147573, term147573.getClass(), "id", -8108380960063290080L);
        setLongField(term147575, term147575.getClass(), "id", 663031728882071881L);
        setField(term147575, term147575.getClass(), "extId", term147577);
        setField(term147575, term147575.getClass(), "luid", "MXZXoFMvzy");
        setIntField(term147592, term147592.getClass(), "year", 2019);
        setShortField(term147592, term147592.getClass(), "month", (short) 12);
        setShortField(term147592, term147592.getClass(), "day", (short) 8);
        setField(term147591, term147591.getClass(), "date", term147592);
        setByteField(term147596, term147596.getClass(), "hour", (byte) 20);
        setByteField(term147596, term147596.getClass(), "minute", (byte) 33);
        setByteField(term147596, term147596.getClass(), "second", (byte) 47);
        setIntField(term147596, term147596.getClass(), "nano", 329455724);
        setField(term147591, term147591.getClass(), "time", term147596);
        setField(term147575, term147575.getClass(), "registerTime", term147591);
        setIntField(term147602, term147602.getClass(), "year", 2023);
        setShortField(term147602, term147602.getClass(), "month", (short) 9);
        setShortField(term147602, term147602.getClass(), "day", (short) 17);
        setField(term147601, term147601.getClass(), "date", term147602);
        setByteField(term147606, term147606.getClass(), "hour", (byte) 16);
        setByteField(term147606, term147606.getClass(), "minute", (byte) 1);
        setByteField(term147606, term147606.getClass(), "second", (byte) 2);
        setIntField(term147606, term147606.getClass(), "nano", 296390053);
        setField(term147601, term147601.getClass(), "time", term147606);
        setField(term147575, term147575.getClass(), "accessTime", term147601);
        setField(term147573, term147573.getClass(), "card", term147575);
        setField(term147573, term147573.getClass(), "userName", "OKprzLoTRc");
        setIntField(term147573, term147573.getClass(), "level", -2050329736);
        setIntField(term147573, term147573.getClass(), "reincarnationNum", 1971429499);
        setLongField(term147573, term147573.getClass(), "exp", -8413820035688077926L);
        setLongField(term147573, term147573.getClass(), "point", 6631429181314051846L);
        setLongField(term147573, term147573.getClass(), "totalPoint", 3533237209348387327L);
        setIntField(term147573, term147573.getClass(), "playCount", 761194460);
        setIntField(term147573, term147573.getClass(), "jewelCount", 2101170479);
        setIntField(term147573, term147573.getClass(), "totalJewelCount", 1016127323);
        setIntField(term147573, term147573.getClass(), "medalCount", -1424228916);
        setIntField(term147573, term147573.getClass(), "playerRating", -1330367712);
        setIntField(term147573, term147573.getClass(), "highestRating", 1127423658);
        setIntField(term147573, term147573.getClass(), "battlePoint", 1769148291);
        setIntField(term147573, term147573.getClass(), "bestBattlePoint", -589939936);
        setIntField(term147573, term147573.getClass(), "overDamageBattlePoint", -1648554957);
        setBooleanField(term147573, term147573.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term147573, term147573.getClass(), "nameplateId", -562928205);
        setIntField(term147573, term147573.getClass(), "trophyId", 1606784584);
        setIntField(term147573, term147573.getClass(), "cardId", -1363533335);
        setIntField(term147573, term147573.getClass(), "characterId", 366895162);
        setIntField(term147573, term147573.getClass(), "characterVoiceNo", 1724693880);
        setIntField(term147573, term147573.getClass(), "tabSetting", -1087721009);
        setIntField(term147573, term147573.getClass(), "tabSortSetting", -2015236116);
        setIntField(term147573, term147573.getClass(), "cardCategorySetting", 23503476);
        setIntField(term147573, term147573.getClass(), "cardSortSetting", 1507237625);
        setIntField(term147573, term147573.getClass(), "rivalScoreCategorySetting", 845255343);
        setIntField(term147573, term147573.getClass(), "playedTutorialBit", 1633731345);
        setIntField(term147573, term147573.getClass(), "firstTutorialCancelNum", 953429371);
        setLongField(term147573, term147573.getClass(), "sumTechHighScore", 3535414163266530170L);
        setLongField(term147573, term147573.getClass(), "sumTechBasicHighScore", -1952096123587544940L);
        setLongField(term147573, term147573.getClass(), "sumTechAdvancedHighScore", 3898957359496937885L);
        setLongField(term147573, term147573.getClass(), "sumTechExpertHighScore", -8514979512910662698L);
        setLongField(term147573, term147573.getClass(), "sumTechMasterHighScore", 2016672709521507624L);
        setLongField(term147573, term147573.getClass(), "sumTechLunaticHighScore", 7288950281376018330L);
        setLongField(term147573, term147573.getClass(), "sumBattleHighScore", 4021229814046551638L);
        setLongField(term147573, term147573.getClass(), "sumBattleBasicHighScore", 2627287577291824245L);
        setLongField(term147573, term147573.getClass(), "sumBattleAdvancedHighScore", -4237838550103001619L);
        setLongField(term147573, term147573.getClass(), "sumBattleExpertHighScore", -497880700601191075L);
        setLongField(term147573, term147573.getClass(), "sumBattleMasterHighScore", 4366163691443514751L);
        setLongField(term147573, term147573.getClass(), "sumBattleLunaticHighScore", -3132394690122867825L);
        setField(term147573, term147573.getClass(), "eventWatchedDate", "gnyquIPoBE");
        setField(term147573, term147573.getClass(), "cmEventWatchedDate", "Teoezfwsmm");
        setField(term147573, term147573.getClass(), "firstGameId", "KmAyeYnpeZ");
        setField(term147573, term147573.getClass(), "firstRomVersion", "jPXLhQFRXw");
        setField(term147573, term147573.getClass(), "firstDataVersion", "awecmBkpdf");
        setField(term147573, term147573.getClass(), "firstPlayDate", "JpqRemAQer");
        setField(term147573, term147573.getClass(), "lastGameId", "AiWObYbsEu");
        setField(term147573, term147573.getClass(), "lastRomVersion", "ZgWEffEuOS");
        setField(term147573, term147573.getClass(), "lastDataVersion", "ytfTCVidbO");
        setField(term147573, term147573.getClass(), "compatibleCmVersion", "ZNBXGdVsZF");
        setField(term147573, term147573.getClass(), "lastPlayDate", "grGHJeQdYI");
        setIntField(term147573, term147573.getClass(), "lastPlaceId", 200402683);
        setField(term147573, term147573.getClass(), "lastPlaceName", "jtnUMbjYGn");
        setIntField(term147573, term147573.getClass(), "lastRegionId", 1718675670);
        setField(term147573, term147573.getClass(), "lastRegionName", "SoDnZfByBc");
        setIntField(term147573, term147573.getClass(), "lastAllNetId", -668635527);
        setField(term147573, term147573.getClass(), "lastClientId", "IzEVeLWAzF");
        setIntField(term147573, term147573.getClass(), "lastUsedDeckId", -1270221622);
        setIntField(term147573, term147573.getClass(), "lastPlayMusicLevel", -768998591);
        setIntField(term147573, term147573.getClass(), "lastEmoneyBrand", 1911741101);
        setField(term147571, term147571.getClass(), "user", term147573);
        setIntField(term147571, term147571.getClass(), "deckId", 1972178133);
        setIntField(term147571, term147571.getClass(), "cardId1", -555791745);
        setIntField(term147571, term147571.getClass(), "cardId2", 1871265534);
        setIntField(term147571, term147571.getClass(), "cardId3", 403098234);
        term147840 = new Integer(400286709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term147840;
        callMethod(klass, "setCardId3", argTypes, term147571, args);
    }

};


