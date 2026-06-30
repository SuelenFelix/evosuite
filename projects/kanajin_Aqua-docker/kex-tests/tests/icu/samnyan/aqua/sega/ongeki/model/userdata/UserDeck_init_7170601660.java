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

public class UserDeck_init_7170601660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141998;

    public UserDeck_init_7170601660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term142002 = new Long(8512025621149521819L);
        term141998 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term142000 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term142016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142021 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142031 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term141998, term141998.getClass(), "id", 5788562444185279989L);
        setLongField(term142000, term142000.getClass(), "id", -5382854252564599663L);
        setField(term142000, term142000.getClass(), "extId", term142002);
        setField(term142000, term142000.getClass(), "luid", "TKUDnkrdyn");
        setIntField(term142017, term142017.getClass(), "year", 2011);
        setShortField(term142017, term142017.getClass(), "month", (short) 10);
        setShortField(term142017, term142017.getClass(), "day", (short) 26);
        setField(term142016, term142016.getClass(), "date", term142017);
        setByteField(term142021, term142021.getClass(), "hour", (byte) 19);
        setByteField(term142021, term142021.getClass(), "minute", (byte) 15);
        setByteField(term142021, term142021.getClass(), "second", (byte) 28);
        setIntField(term142021, term142021.getClass(), "nano", 465029232);
        setField(term142016, term142016.getClass(), "time", term142021);
        setField(term142000, term142000.getClass(), "registerTime", term142016);
        setIntField(term142027, term142027.getClass(), "year", 2027);
        setShortField(term142027, term142027.getClass(), "month", (short) 2);
        setShortField(term142027, term142027.getClass(), "day", (short) 22);
        setField(term142026, term142026.getClass(), "date", term142027);
        setByteField(term142031, term142031.getClass(), "hour", (byte) 4);
        setByteField(term142031, term142031.getClass(), "minute", (byte) 59);
        setByteField(term142031, term142031.getClass(), "second", (byte) 50);
        setIntField(term142031, term142031.getClass(), "nano", 80562715);
        setField(term142026, term142026.getClass(), "time", term142031);
        setField(term142000, term142000.getClass(), "accessTime", term142026);
        setField(term141998, term141998.getClass(), "card", term142000);
        setField(term141998, term141998.getClass(), "userName", "zyGPpAGuKz");
        setIntField(term141998, term141998.getClass(), "level", -846622452);
        setIntField(term141998, term141998.getClass(), "reincarnationNum", -1069059356);
        setLongField(term141998, term141998.getClass(), "exp", -5408553498789870257L);
        setLongField(term141998, term141998.getClass(), "point", -6620687849204385962L);
        setLongField(term141998, term141998.getClass(), "totalPoint", -5220649698125218997L);
        setIntField(term141998, term141998.getClass(), "playCount", -2030213410);
        setIntField(term141998, term141998.getClass(), "jewelCount", -63736169);
        setIntField(term141998, term141998.getClass(), "totalJewelCount", 1480163997);
        setIntField(term141998, term141998.getClass(), "medalCount", -949949277);
        setIntField(term141998, term141998.getClass(), "playerRating", -1805950945);
        setIntField(term141998, term141998.getClass(), "highestRating", 674695717);
        setIntField(term141998, term141998.getClass(), "battlePoint", 1298497946);
        setIntField(term141998, term141998.getClass(), "bestBattlePoint", -1334742529);
        setIntField(term141998, term141998.getClass(), "overDamageBattlePoint", -935891827);
        setBooleanField(term141998, term141998.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term141998, term141998.getClass(), "nameplateId", 1922432280);
        setIntField(term141998, term141998.getClass(), "trophyId", -358531856);
        setIntField(term141998, term141998.getClass(), "cardId", 249710866);
        setIntField(term141998, term141998.getClass(), "characterId", -1526265440);
        setIntField(term141998, term141998.getClass(), "characterVoiceNo", 1627034192);
        setIntField(term141998, term141998.getClass(), "tabSetting", -1316138191);
        setIntField(term141998, term141998.getClass(), "tabSortSetting", 1739661119);
        setIntField(term141998, term141998.getClass(), "cardCategorySetting", -616399232);
        setIntField(term141998, term141998.getClass(), "cardSortSetting", -1754380742);
        setIntField(term141998, term141998.getClass(), "rivalScoreCategorySetting", -1377304901);
        setIntField(term141998, term141998.getClass(), "playedTutorialBit", -362697593);
        setIntField(term141998, term141998.getClass(), "firstTutorialCancelNum", -1972052281);
        setLongField(term141998, term141998.getClass(), "sumTechHighScore", 297135097396458539L);
        setLongField(term141998, term141998.getClass(), "sumTechBasicHighScore", -7861867089823318432L);
        setLongField(term141998, term141998.getClass(), "sumTechAdvancedHighScore", 2543701222737535369L);
        setLongField(term141998, term141998.getClass(), "sumTechExpertHighScore", 7838994375351309191L);
        setLongField(term141998, term141998.getClass(), "sumTechMasterHighScore", -4317192112552362030L);
        setLongField(term141998, term141998.getClass(), "sumTechLunaticHighScore", 3214320057499026462L);
        setLongField(term141998, term141998.getClass(), "sumBattleHighScore", 4733620359452531674L);
        setLongField(term141998, term141998.getClass(), "sumBattleBasicHighScore", -8611082790460156401L);
        setLongField(term141998, term141998.getClass(), "sumBattleAdvancedHighScore", 5710436081076764073L);
        setLongField(term141998, term141998.getClass(), "sumBattleExpertHighScore", -5792339917599776207L);
        setLongField(term141998, term141998.getClass(), "sumBattleMasterHighScore", 7653887766001155966L);
        setLongField(term141998, term141998.getClass(), "sumBattleLunaticHighScore", -7160442985292157714L);
        setField(term141998, term141998.getClass(), "eventWatchedDate", "vgJuNJDSQu");
        setField(term141998, term141998.getClass(), "cmEventWatchedDate", "TokIIKaqkw");
        setField(term141998, term141998.getClass(), "firstGameId", "kPOlNDAMrn");
        setField(term141998, term141998.getClass(), "firstRomVersion", "gXVfxiKYXy");
        setField(term141998, term141998.getClass(), "firstDataVersion", "wDXGaloUxi");
        setField(term141998, term141998.getClass(), "firstPlayDate", "QZpJmHsqng");
        setField(term141998, term141998.getClass(), "lastGameId", "HrbrOZKvDm");
        setField(term141998, term141998.getClass(), "lastRomVersion", "UnnFJFliAk");
        setField(term141998, term141998.getClass(), "lastDataVersion", "PgCubdnsfU");
        setField(term141998, term141998.getClass(), "compatibleCmVersion", "kwWeMEsLiI");
        setField(term141998, term141998.getClass(), "lastPlayDate", "kVRWVcbDmx");
        setIntField(term141998, term141998.getClass(), "lastPlaceId", 1935086654);
        setField(term141998, term141998.getClass(), "lastPlaceName", "jTuotqEcZK");
        setIntField(term141998, term141998.getClass(), "lastRegionId", -1631985638);
        setField(term141998, term141998.getClass(), "lastRegionName", "wddQtFrWId");
        setIntField(term141998, term141998.getClass(), "lastAllNetId", -2095728614);
        setField(term141998, term141998.getClass(), "lastClientId", "aHuJsHVnrv");
        setIntField(term141998, term141998.getClass(), "lastUsedDeckId", 436401547);
        setIntField(term141998, term141998.getClass(), "lastPlayMusicLevel", 788471676);
        setIntField(term141998, term141998.getClass(), "lastEmoneyBrand", -1768256854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term141998;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


