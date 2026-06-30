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

public class UserDeck_setCardId1_8495957510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146709;
     Object term146978;

    public UserDeck_setCardId1_8495957510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146715 = new Long(-8890284990655172580L);
        term146709 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term146711 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term146713 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146744 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146709, term146709.getClass(), "id", -5116073733063398721L);
        setLongField(term146711, term146711.getClass(), "id", 1018320935977743885L);
        setLongField(term146713, term146713.getClass(), "id", 8152024596143145906L);
        setField(term146713, term146713.getClass(), "extId", term146715);
        setField(term146713, term146713.getClass(), "luid", "zVFIRDapJz");
        setIntField(term146730, term146730.getClass(), "year", 2022);
        setShortField(term146730, term146730.getClass(), "month", (short) 4);
        setShortField(term146730, term146730.getClass(), "day", (short) 26);
        setField(term146729, term146729.getClass(), "date", term146730);
        setByteField(term146734, term146734.getClass(), "hour", (byte) 4);
        setByteField(term146734, term146734.getClass(), "minute", (byte) 26);
        setByteField(term146734, term146734.getClass(), "second", (byte) 22);
        setIntField(term146734, term146734.getClass(), "nano", 390695663);
        setField(term146729, term146729.getClass(), "time", term146734);
        setField(term146713, term146713.getClass(), "registerTime", term146729);
        setIntField(term146740, term146740.getClass(), "year", 2019);
        setShortField(term146740, term146740.getClass(), "month", (short) 10);
        setShortField(term146740, term146740.getClass(), "day", (short) 7);
        setField(term146739, term146739.getClass(), "date", term146740);
        setByteField(term146744, term146744.getClass(), "hour", (byte) 17);
        setByteField(term146744, term146744.getClass(), "minute", (byte) 16);
        setByteField(term146744, term146744.getClass(), "second", (byte) 55);
        setIntField(term146744, term146744.getClass(), "nano", 967207750);
        setField(term146739, term146739.getClass(), "time", term146744);
        setField(term146713, term146713.getClass(), "accessTime", term146739);
        setField(term146711, term146711.getClass(), "card", term146713);
        setField(term146711, term146711.getClass(), "userName", "loIwFxbUPE");
        setIntField(term146711, term146711.getClass(), "level", -1310947684);
        setIntField(term146711, term146711.getClass(), "reincarnationNum", -690317377);
        setLongField(term146711, term146711.getClass(), "exp", 9038591050440033817L);
        setLongField(term146711, term146711.getClass(), "point", 7337418622122443287L);
        setLongField(term146711, term146711.getClass(), "totalPoint", 1369655687269266263L);
        setIntField(term146711, term146711.getClass(), "playCount", -2109129464);
        setIntField(term146711, term146711.getClass(), "jewelCount", 1463240297);
        setIntField(term146711, term146711.getClass(), "totalJewelCount", 1844126940);
        setIntField(term146711, term146711.getClass(), "medalCount", 1709305254);
        setIntField(term146711, term146711.getClass(), "playerRating", 572620811);
        setIntField(term146711, term146711.getClass(), "highestRating", -266178819);
        setIntField(term146711, term146711.getClass(), "battlePoint", -710586279);
        setIntField(term146711, term146711.getClass(), "bestBattlePoint", -1876275628);
        setIntField(term146711, term146711.getClass(), "overDamageBattlePoint", 818078390);
        setBooleanField(term146711, term146711.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term146711, term146711.getClass(), "nameplateId", 216907802);
        setIntField(term146711, term146711.getClass(), "trophyId", 799118971);
        setIntField(term146711, term146711.getClass(), "cardId", 1833196618);
        setIntField(term146711, term146711.getClass(), "characterId", -887554572);
        setIntField(term146711, term146711.getClass(), "characterVoiceNo", 817654648);
        setIntField(term146711, term146711.getClass(), "tabSetting", 1717336021);
        setIntField(term146711, term146711.getClass(), "tabSortSetting", -2070660986);
        setIntField(term146711, term146711.getClass(), "cardCategorySetting", 666357129);
        setIntField(term146711, term146711.getClass(), "cardSortSetting", 2136565937);
        setIntField(term146711, term146711.getClass(), "rivalScoreCategorySetting", -891860855);
        setIntField(term146711, term146711.getClass(), "playedTutorialBit", -54467304);
        setIntField(term146711, term146711.getClass(), "firstTutorialCancelNum", 340369679);
        setLongField(term146711, term146711.getClass(), "sumTechHighScore", -4784225715819756136L);
        setLongField(term146711, term146711.getClass(), "sumTechBasicHighScore", 1559294259802975817L);
        setLongField(term146711, term146711.getClass(), "sumTechAdvancedHighScore", -7567812530552226155L);
        setLongField(term146711, term146711.getClass(), "sumTechExpertHighScore", -1691229894144177187L);
        setLongField(term146711, term146711.getClass(), "sumTechMasterHighScore", -7277657840437519066L);
        setLongField(term146711, term146711.getClass(), "sumTechLunaticHighScore", 2339040478572213781L);
        setLongField(term146711, term146711.getClass(), "sumBattleHighScore", -4176857137260336032L);
        setLongField(term146711, term146711.getClass(), "sumBattleBasicHighScore", 6640284141533790953L);
        setLongField(term146711, term146711.getClass(), "sumBattleAdvancedHighScore", -5503115711139045929L);
        setLongField(term146711, term146711.getClass(), "sumBattleExpertHighScore", 6751820714370618731L);
        setLongField(term146711, term146711.getClass(), "sumBattleMasterHighScore", -5133179556763006620L);
        setLongField(term146711, term146711.getClass(), "sumBattleLunaticHighScore", -7281038479888257748L);
        setField(term146711, term146711.getClass(), "eventWatchedDate", "VqpICJekjO");
        setField(term146711, term146711.getClass(), "cmEventWatchedDate", "MflCXDvTuO");
        setField(term146711, term146711.getClass(), "firstGameId", "XQFFoiySPq");
        setField(term146711, term146711.getClass(), "firstRomVersion", "IRtNRIRHTg");
        setField(term146711, term146711.getClass(), "firstDataVersion", "fHocghEAVR");
        setField(term146711, term146711.getClass(), "firstPlayDate", "FXngdpZyuo");
        setField(term146711, term146711.getClass(), "lastGameId", "DTerqIWqcp");
        setField(term146711, term146711.getClass(), "lastRomVersion", "fpCIxbJMhb");
        setField(term146711, term146711.getClass(), "lastDataVersion", "CpdmHeeJjh");
        setField(term146711, term146711.getClass(), "compatibleCmVersion", "hKmPOZlKjI");
        setField(term146711, term146711.getClass(), "lastPlayDate", "cTCkotLNPq");
        setIntField(term146711, term146711.getClass(), "lastPlaceId", -1824478225);
        setField(term146711, term146711.getClass(), "lastPlaceName", "VhQqTFwKnM");
        setIntField(term146711, term146711.getClass(), "lastRegionId", 60437225);
        setField(term146711, term146711.getClass(), "lastRegionName", "WCbIcScYSo");
        setIntField(term146711, term146711.getClass(), "lastAllNetId", -719405836);
        setField(term146711, term146711.getClass(), "lastClientId", "sAQCrZMYTg");
        setIntField(term146711, term146711.getClass(), "lastUsedDeckId", 1593612603);
        setIntField(term146711, term146711.getClass(), "lastPlayMusicLevel", 846762982);
        setIntField(term146711, term146711.getClass(), "lastEmoneyBrand", 1526808674);
        setField(term146709, term146709.getClass(), "user", term146711);
        setIntField(term146709, term146709.getClass(), "deckId", 1554584842);
        setIntField(term146709, term146709.getClass(), "cardId1", -1678494364);
        setIntField(term146709, term146709.getClass(), "cardId2", 1388299013);
        setIntField(term146709, term146709.getClass(), "cardId3", 198610069);
        term146978 = new Integer(-1228121453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term146978;
        callMethod(klass, "setCardId1", argTypes, term146709, args);
    }

};


