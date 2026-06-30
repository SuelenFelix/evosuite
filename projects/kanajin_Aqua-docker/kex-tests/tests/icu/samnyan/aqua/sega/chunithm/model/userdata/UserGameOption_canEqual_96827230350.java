package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOption_canEqual_96827230350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71694;
     Object term71994;

    public UserGameOption_canEqual_96827230350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71700 = new Long(-2255965562447970862L);
        term71694 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term71696 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term71698 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term71714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71719 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71729 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71812 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71860 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71906 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71694, term71694.getClass(), "id", -4100892279770468602L);
        setLongField(term71696, term71696.getClass(), "id", -459560970226052057L);
        setLongField(term71698, term71698.getClass(), "id", 7829682507826908709L);
        setField(term71698, term71698.getClass(), "extId", term71700);
        setField(term71698, term71698.getClass(), "luid", "ICnzwgujDT");
        setIntField(term71715, term71715.getClass(), "year", 2019);
        setShortField(term71715, term71715.getClass(), "month", (short) 3);
        setShortField(term71715, term71715.getClass(), "day", (short) 15);
        setField(term71714, term71714.getClass(), "date", term71715);
        setByteField(term71719, term71719.getClass(), "hour", (byte) 19);
        setByteField(term71719, term71719.getClass(), "minute", (byte) 20);
        setByteField(term71719, term71719.getClass(), "second", (byte) 17);
        setIntField(term71719, term71719.getClass(), "nano", 872983779);
        setField(term71714, term71714.getClass(), "time", term71719);
        setField(term71698, term71698.getClass(), "registerTime", term71714);
        setIntField(term71725, term71725.getClass(), "year", 2028);
        setShortField(term71725, term71725.getClass(), "month", (short) 10);
        setShortField(term71725, term71725.getClass(), "day", (short) 1);
        setField(term71724, term71724.getClass(), "date", term71725);
        setByteField(term71729, term71729.getClass(), "hour", (byte) 12);
        setByteField(term71729, term71729.getClass(), "minute", (byte) 47);
        setByteField(term71729, term71729.getClass(), "second", (byte) 33);
        setIntField(term71729, term71729.getClass(), "nano", 170475636);
        setField(term71724, term71724.getClass(), "time", term71729);
        setField(term71698, term71698.getClass(), "accessTime", term71724);
        setField(term71696, term71696.getClass(), "card", term71698);
        setField(term71696, term71696.getClass(), "userName", "RfDgUkIYjW");
        setIntField(term71747, term71747.getClass(), "year", 2027);
        setShortField(term71747, term71747.getClass(), "month", (short) 2);
        setShortField(term71747, term71747.getClass(), "day", (short) 28);
        setField(term71746, term71746.getClass(), "date", term71747);
        setByteField(term71751, term71751.getClass(), "hour", (byte) 10);
        setByteField(term71751, term71751.getClass(), "minute", (byte) 42);
        setByteField(term71751, term71751.getClass(), "second", (byte) 49);
        setIntField(term71751, term71751.getClass(), "nano", 494945461);
        setField(term71746, term71746.getClass(), "time", term71751);
        setField(term71696, term71696.getClass(), "lastLoginDate", term71746);
        setBooleanField(term71696, term71696.getClass(), "isWebJoin", true);
        setField(term71696, term71696.getClass(), "webLimitDate", "QnZKCwkmMh");
        setIntField(term71696, term71696.getClass(), "level", 1156356127);
        setIntField(term71696, term71696.getClass(), "reincarnationNum", -2104118662);
        setField(term71696, term71696.getClass(), "exp", "RVQbteztJx");
        setLongField(term71696, term71696.getClass(), "point", 2414820119632962722L);
        setLongField(term71696, term71696.getClass(), "totalPoint", -6228694154790578964L);
        setIntField(term71696, term71696.getClass(), "playCount", -420723612);
        setIntField(term71696, term71696.getClass(), "multiPlayCount", -1133208152);
        setIntField(term71696, term71696.getClass(), "multiWinCount", -696625342);
        setIntField(term71696, term71696.getClass(), "requestResCount", -1414592494);
        setIntField(term71696, term71696.getClass(), "acceptResCount", 1786579332);
        setIntField(term71696, term71696.getClass(), "successResCount", 1501260437);
        setIntField(term71696, term71696.getClass(), "playerRating", -76595520);
        setIntField(term71696, term71696.getClass(), "highestRating", 1443232393);
        setIntField(term71696, term71696.getClass(), "nameplateId", -1910414427);
        setIntField(term71696, term71696.getClass(), "frameId", -2007275509);
        setIntField(term71696, term71696.getClass(), "characterId", -540049509);
        setIntField(term71696, term71696.getClass(), "trophyId", -75757335);
        setIntField(term71696, term71696.getClass(), "playedTutorialBit", 1493891481);
        setIntField(term71696, term71696.getClass(), "firstTutorialCancelNum", 1654753354);
        setIntField(term71696, term71696.getClass(), "masterTutorialCancelNum", 609765653);
        setIntField(term71696, term71696.getClass(), "totalRepertoireCount", 919376771);
        setIntField(term71696, term71696.getClass(), "totalMapNum", 632440696);
        setLongField(term71696, term71696.getClass(), "totalHiScore", 1652025727169242768L);
        setLongField(term71696, term71696.getClass(), "totalBasicHighScore", 4659041496243630964L);
        setLongField(term71696, term71696.getClass(), "totalAdvancedHighScore", -7465474190642854260L);
        setLongField(term71696, term71696.getClass(), "totalExpertHighScore", -8372788044669645675L);
        setLongField(term71696, term71696.getClass(), "totalMasterHighScore", -1591356946285738868L);
        setIntField(term71808, term71808.getClass(), "year", 2018);
        setShortField(term71808, term71808.getClass(), "month", (short) 3);
        setShortField(term71808, term71808.getClass(), "day", (short) 28);
        setField(term71807, term71807.getClass(), "date", term71808);
        setByteField(term71812, term71812.getClass(), "hour", (byte) 21);
        setByteField(term71812, term71812.getClass(), "minute", (byte) 12);
        setByteField(term71812, term71812.getClass(), "second", (byte) 31);
        setIntField(term71812, term71812.getClass(), "nano", 841920486);
        setField(term71807, term71807.getClass(), "time", term71812);
        setField(term71696, term71696.getClass(), "eventWatchedDate", term71807);
        setIntField(term71696, term71696.getClass(), "friendCount", 1176303286);
        setBooleanField(term71696, term71696.getClass(), "isMaimai", false);
        setField(term71696, term71696.getClass(), "firstGameId", "yjmUdvwSdd");
        setField(term71696, term71696.getClass(), "firstRomVersion", "COsGswsrtI");
        setField(term71696, term71696.getClass(), "firstDataVersion", "ebUWnoVDmk");
        setIntField(term71856, term71856.getClass(), "year", 2014);
        setShortField(term71856, term71856.getClass(), "month", (short) 2);
        setShortField(term71856, term71856.getClass(), "day", (short) 2);
        setField(term71855, term71855.getClass(), "date", term71856);
        setByteField(term71860, term71860.getClass(), "hour", (byte) 17);
        setByteField(term71860, term71860.getClass(), "minute", (byte) 45);
        setByteField(term71860, term71860.getClass(), "second", (byte) 37);
        setIntField(term71860, term71860.getClass(), "nano", 147840174);
        setField(term71855, term71855.getClass(), "time", term71860);
        setField(term71696, term71696.getClass(), "firstPlayDate", term71855);
        setField(term71696, term71696.getClass(), "lastGameId", "wCcojFgWKb");
        setField(term71696, term71696.getClass(), "lastRomVersion", "iHtqLPNWTt");
        setField(term71696, term71696.getClass(), "lastDataVersion", "TQgECVDMEf");
        setIntField(term71902, term71902.getClass(), "year", 2023);
        setShortField(term71902, term71902.getClass(), "month", (short) 4);
        setShortField(term71902, term71902.getClass(), "day", (short) 27);
        setField(term71901, term71901.getClass(), "date", term71902);
        setByteField(term71906, term71906.getClass(), "hour", (byte) 11);
        setByteField(term71906, term71906.getClass(), "minute", (byte) 41);
        setByteField(term71906, term71906.getClass(), "second", (byte) 10);
        setIntField(term71906, term71906.getClass(), "nano", 59265345);
        setField(term71901, term71901.getClass(), "time", term71906);
        setField(term71696, term71696.getClass(), "lastPlayDate", term71901);
        setIntField(term71696, term71696.getClass(), "lastPlaceId", -1738480762);
        setField(term71696, term71696.getClass(), "lastPlaceName", "KIBOVYItqe");
        setField(term71696, term71696.getClass(), "lastRegionId", "GUztJeVeCc");
        setField(term71696, term71696.getClass(), "lastRegionName", "YNXFGgstqj");
        setField(term71696, term71696.getClass(), "lastAllNetId", "xZTWqxWsAc");
        setField(term71696, term71696.getClass(), "lastClientId", "sWchglYniO");
        setField(term71694, term71694.getClass(), "user", term71696);
        setIntField(term71694, term71694.getClass(), "bgInfo", -1175470028);
        setIntField(term71694, term71694.getClass(), "fieldColor", -910760048);
        setIntField(term71694, term71694.getClass(), "guideSound", 702111671);
        setIntField(term71694, term71694.getClass(), "soundEffect", 1127359599);
        setIntField(term71694, term71694.getClass(), "guideLine", 890298090);
        setIntField(term71694, term71694.getClass(), "speed", 1824978585);
        setIntField(term71694, term71694.getClass(), "optionSet", 2056999648);
        setIntField(term71694, term71694.getClass(), "matching", -1235710002);
        setIntField(term71694, term71694.getClass(), "judgePos", -1092087194);
        setIntField(term71694, term71694.getClass(), "rating", 287049516);
        setIntField(term71694, term71694.getClass(), "judgeJustice", -2118245549);
        setIntField(term71694, term71694.getClass(), "judgeAttack", -974734669);
        setIntField(term71694, term71694.getClass(), "headphone", 637485378);
        setIntField(term71694, term71694.getClass(), "playerLevel", -972072842);
        setIntField(term71694, term71694.getClass(), "successTap", -1654330782);
        setIntField(term71694, term71694.getClass(), "successExTap", 618840851);
        setIntField(term71694, term71694.getClass(), "successSlideHold", 879137590);
        setIntField(term71694, term71694.getClass(), "successAir", 388908072);
        setIntField(term71694, term71694.getClass(), "successFlick", -605646727);
        setIntField(term71694, term71694.getClass(), "successSkill", -1938624293);
        setIntField(term71694, term71694.getClass(), "successTapTimbre", 1289551510);
        setIntField(term71694, term71694.getClass(), "privacy", 1397954481);
        term71994 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71994;
        callMethod(klass, "canEqual", argTypes, term71694, args);
    }

};


