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

public class UserData_setSumTechExpertHighScore_96014353195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62233;
     Object term62496;

    public UserData_setSumTechExpertHighScore_96014353195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62237 = new Long(-6301101997917060727L);
        term62233 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term62235 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term62251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62266 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62233, term62233.getClass(), "id", 5112631327574323651L);
        setLongField(term62235, term62235.getClass(), "id", -166481681441578938L);
        setField(term62235, term62235.getClass(), "extId", term62237);
        setField(term62235, term62235.getClass(), "luid", "QJuqwUQEyr");
        setIntField(term62252, term62252.getClass(), "year", 2027);
        setShortField(term62252, term62252.getClass(), "month", (short) 5);
        setShortField(term62252, term62252.getClass(), "day", (short) 22);
        setField(term62251, term62251.getClass(), "date", term62252);
        setByteField(term62256, term62256.getClass(), "hour", (byte) 6);
        setByteField(term62256, term62256.getClass(), "minute", (byte) 8);
        setByteField(term62256, term62256.getClass(), "second", (byte) 27);
        setIntField(term62256, term62256.getClass(), "nano", 955380448);
        setField(term62251, term62251.getClass(), "time", term62256);
        setField(term62235, term62235.getClass(), "registerTime", term62251);
        setIntField(term62262, term62262.getClass(), "year", 2029);
        setShortField(term62262, term62262.getClass(), "month", (short) 1);
        setShortField(term62262, term62262.getClass(), "day", (short) 12);
        setField(term62261, term62261.getClass(), "date", term62262);
        setByteField(term62266, term62266.getClass(), "hour", (byte) 15);
        setByteField(term62266, term62266.getClass(), "minute", (byte) 27);
        setByteField(term62266, term62266.getClass(), "second", (byte) 0);
        setIntField(term62266, term62266.getClass(), "nano", 592641552);
        setField(term62261, term62261.getClass(), "time", term62266);
        setField(term62235, term62235.getClass(), "accessTime", term62261);
        setField(term62233, term62233.getClass(), "card", term62235);
        setField(term62233, term62233.getClass(), "userName", "qqUAzxxpNB");
        setIntField(term62233, term62233.getClass(), "level", 102632361);
        setIntField(term62233, term62233.getClass(), "reincarnationNum", -871963633);
        setLongField(term62233, term62233.getClass(), "exp", -4633318477485324682L);
        setLongField(term62233, term62233.getClass(), "point", 5380478321033986380L);
        setLongField(term62233, term62233.getClass(), "totalPoint", -5286169278330415236L);
        setIntField(term62233, term62233.getClass(), "playCount", -572352492);
        setIntField(term62233, term62233.getClass(), "jewelCount", -583361854);
        setIntField(term62233, term62233.getClass(), "totalJewelCount", 717140857);
        setIntField(term62233, term62233.getClass(), "medalCount", 891889211);
        setIntField(term62233, term62233.getClass(), "playerRating", 265502816);
        setIntField(term62233, term62233.getClass(), "highestRating", -1730476579);
        setIntField(term62233, term62233.getClass(), "battlePoint", -1501333599);
        setIntField(term62233, term62233.getClass(), "bestBattlePoint", 1525193088);
        setIntField(term62233, term62233.getClass(), "overDamageBattlePoint", 1734906845);
        setBooleanField(term62233, term62233.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term62233, term62233.getClass(), "nameplateId", 678776902);
        setIntField(term62233, term62233.getClass(), "trophyId", -1148076813);
        setIntField(term62233, term62233.getClass(), "cardId", 1450586432);
        setIntField(term62233, term62233.getClass(), "characterId", 1726648633);
        setIntField(term62233, term62233.getClass(), "characterVoiceNo", 859999867);
        setIntField(term62233, term62233.getClass(), "tabSetting", 469845570);
        setIntField(term62233, term62233.getClass(), "tabSortSetting", 1192737321);
        setIntField(term62233, term62233.getClass(), "cardCategorySetting", 827191651);
        setIntField(term62233, term62233.getClass(), "cardSortSetting", -432140549);
        setIntField(term62233, term62233.getClass(), "rivalScoreCategorySetting", -1134516117);
        setIntField(term62233, term62233.getClass(), "playedTutorialBit", 1618532335);
        setIntField(term62233, term62233.getClass(), "firstTutorialCancelNum", 1620043047);
        setLongField(term62233, term62233.getClass(), "sumTechHighScore", -6466670514888869637L);
        setLongField(term62233, term62233.getClass(), "sumTechBasicHighScore", 1092970910177761761L);
        setLongField(term62233, term62233.getClass(), "sumTechAdvancedHighScore", 4106733769705635532L);
        setLongField(term62233, term62233.getClass(), "sumTechExpertHighScore", -983658954375044823L);
        setLongField(term62233, term62233.getClass(), "sumTechMasterHighScore", -2344830742558802930L);
        setLongField(term62233, term62233.getClass(), "sumTechLunaticHighScore", -2400272512040933740L);
        setLongField(term62233, term62233.getClass(), "sumBattleHighScore", 2471459865342914246L);
        setLongField(term62233, term62233.getClass(), "sumBattleBasicHighScore", 1298833491565248675L);
        setLongField(term62233, term62233.getClass(), "sumBattleAdvancedHighScore", -5282656070291958064L);
        setLongField(term62233, term62233.getClass(), "sumBattleExpertHighScore", -4217861566486163749L);
        setLongField(term62233, term62233.getClass(), "sumBattleMasterHighScore", -4945539086208200375L);
        setLongField(term62233, term62233.getClass(), "sumBattleLunaticHighScore", -1244149061151367736L);
        setField(term62233, term62233.getClass(), "eventWatchedDate", "WqaQxuPbzr");
        setField(term62233, term62233.getClass(), "cmEventWatchedDate", "bjLZqJqmnv");
        setField(term62233, term62233.getClass(), "firstGameId", "TPbMBzbcHs");
        setField(term62233, term62233.getClass(), "firstRomVersion", "spkDvqsOhJ");
        setField(term62233, term62233.getClass(), "firstDataVersion", "faFVBESzWc");
        setField(term62233, term62233.getClass(), "firstPlayDate", "baFwYJAfPz");
        setField(term62233, term62233.getClass(), "lastGameId", "PxBSOwkatN");
        setField(term62233, term62233.getClass(), "lastRomVersion", "uKjlgaHcoc");
        setField(term62233, term62233.getClass(), "lastDataVersion", "ITJMSWaPGZ");
        setField(term62233, term62233.getClass(), "compatibleCmVersion", "ivvEvcUacU");
        setField(term62233, term62233.getClass(), "lastPlayDate", "gbSukHPGfP");
        setIntField(term62233, term62233.getClass(), "lastPlaceId", -1329172198);
        setField(term62233, term62233.getClass(), "lastPlaceName", "jEDnJjwhoo");
        setIntField(term62233, term62233.getClass(), "lastRegionId", -1036092775);
        setField(term62233, term62233.getClass(), "lastRegionName", "TkTHRRicKc");
        setIntField(term62233, term62233.getClass(), "lastAllNetId", 857844283);
        setField(term62233, term62233.getClass(), "lastClientId", "xwBoTnuoQg");
        setIntField(term62233, term62233.getClass(), "lastUsedDeckId", 559778075);
        setIntField(term62233, term62233.getClass(), "lastPlayMusicLevel", 188273941);
        setIntField(term62233, term62233.getClass(), "lastEmoneyBrand", 736020163);
        term62496 = new Long(985346718698079792L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term62496;
        callMethod(klass, "setSumTechExpertHighScore", argTypes, term62233, args);
    }

};


