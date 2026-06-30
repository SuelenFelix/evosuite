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
import java.lang.Integer;

public class UserGameOption_setPrivacy_182925583448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70791;
     Object term71091;

    public UserGameOption_setPrivacy_182925583448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70797 = new Long(-1804015692891701666L);
        term70791 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term70793 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term70795 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70816 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70909 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71003 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70791, term70791.getClass(), "id", 337617062500822936L);
        setLongField(term70793, term70793.getClass(), "id", -6622023497681653956L);
        setLongField(term70795, term70795.getClass(), "id", -6753978337878946291L);
        setField(term70795, term70795.getClass(), "extId", term70797);
        setField(term70795, term70795.getClass(), "luid", "VdHqujFzSo");
        setIntField(term70812, term70812.getClass(), "year", 2011);
        setShortField(term70812, term70812.getClass(), "month", (short) 12);
        setShortField(term70812, term70812.getClass(), "day", (short) 8);
        setField(term70811, term70811.getClass(), "date", term70812);
        setByteField(term70816, term70816.getClass(), "hour", (byte) 14);
        setByteField(term70816, term70816.getClass(), "minute", (byte) 21);
        setByteField(term70816, term70816.getClass(), "second", (byte) 41);
        setIntField(term70816, term70816.getClass(), "nano", 831066682);
        setField(term70811, term70811.getClass(), "time", term70816);
        setField(term70795, term70795.getClass(), "registerTime", term70811);
        setIntField(term70822, term70822.getClass(), "year", 2018);
        setShortField(term70822, term70822.getClass(), "month", (short) 12);
        setShortField(term70822, term70822.getClass(), "day", (short) 8);
        setField(term70821, term70821.getClass(), "date", term70822);
        setByteField(term70826, term70826.getClass(), "hour", (byte) 14);
        setByteField(term70826, term70826.getClass(), "minute", (byte) 50);
        setByteField(term70826, term70826.getClass(), "second", (byte) 10);
        setIntField(term70826, term70826.getClass(), "nano", 698726170);
        setField(term70821, term70821.getClass(), "time", term70826);
        setField(term70795, term70795.getClass(), "accessTime", term70821);
        setField(term70793, term70793.getClass(), "card", term70795);
        setField(term70793, term70793.getClass(), "userName", "cZbOKEdKPs");
        setIntField(term70844, term70844.getClass(), "year", 2010);
        setShortField(term70844, term70844.getClass(), "month", (short) 7);
        setShortField(term70844, term70844.getClass(), "day", (short) 21);
        setField(term70843, term70843.getClass(), "date", term70844);
        setByteField(term70848, term70848.getClass(), "hour", (byte) 12);
        setByteField(term70848, term70848.getClass(), "minute", (byte) 18);
        setByteField(term70848, term70848.getClass(), "second", (byte) 51);
        setIntField(term70848, term70848.getClass(), "nano", 209901550);
        setField(term70843, term70843.getClass(), "time", term70848);
        setField(term70793, term70793.getClass(), "lastLoginDate", term70843);
        setBooleanField(term70793, term70793.getClass(), "isWebJoin", true);
        setField(term70793, term70793.getClass(), "webLimitDate", "nvXqvMSAjc");
        setIntField(term70793, term70793.getClass(), "level", 98451832);
        setIntField(term70793, term70793.getClass(), "reincarnationNum", 584008261);
        setField(term70793, term70793.getClass(), "exp", "agbhgbQisl");
        setLongField(term70793, term70793.getClass(), "point", -6937950410603484933L);
        setLongField(term70793, term70793.getClass(), "totalPoint", 4560845347692916950L);
        setIntField(term70793, term70793.getClass(), "playCount", -881683610);
        setIntField(term70793, term70793.getClass(), "multiPlayCount", -109698584);
        setIntField(term70793, term70793.getClass(), "multiWinCount", 2001696613);
        setIntField(term70793, term70793.getClass(), "requestResCount", -1753516884);
        setIntField(term70793, term70793.getClass(), "acceptResCount", -1562955063);
        setIntField(term70793, term70793.getClass(), "successResCount", -1549644922);
        setIntField(term70793, term70793.getClass(), "playerRating", 1217352889);
        setIntField(term70793, term70793.getClass(), "highestRating", 159996093);
        setIntField(term70793, term70793.getClass(), "nameplateId", 1937937383);
        setIntField(term70793, term70793.getClass(), "frameId", -639813848);
        setIntField(term70793, term70793.getClass(), "characterId", 1894367611);
        setIntField(term70793, term70793.getClass(), "trophyId", 2121003177);
        setIntField(term70793, term70793.getClass(), "playedTutorialBit", 1093708386);
        setIntField(term70793, term70793.getClass(), "firstTutorialCancelNum", 1609837057);
        setIntField(term70793, term70793.getClass(), "masterTutorialCancelNum", 895453282);
        setIntField(term70793, term70793.getClass(), "totalRepertoireCount", -1488970453);
        setIntField(term70793, term70793.getClass(), "totalMapNum", -289323354);
        setLongField(term70793, term70793.getClass(), "totalHiScore", 310539009137263944L);
        setLongField(term70793, term70793.getClass(), "totalBasicHighScore", 2625120506837282980L);
        setLongField(term70793, term70793.getClass(), "totalAdvancedHighScore", -3791275881622301002L);
        setLongField(term70793, term70793.getClass(), "totalExpertHighScore", -3269743329730619135L);
        setLongField(term70793, term70793.getClass(), "totalMasterHighScore", 7289941847234084104L);
        setIntField(term70905, term70905.getClass(), "year", 2028);
        setShortField(term70905, term70905.getClass(), "month", (short) 7);
        setShortField(term70905, term70905.getClass(), "day", (short) 2);
        setField(term70904, term70904.getClass(), "date", term70905);
        setByteField(term70909, term70909.getClass(), "hour", (byte) 23);
        setByteField(term70909, term70909.getClass(), "minute", (byte) 41);
        setByteField(term70909, term70909.getClass(), "second", (byte) 2);
        setIntField(term70909, term70909.getClass(), "nano", 187705257);
        setField(term70904, term70904.getClass(), "time", term70909);
        setField(term70793, term70793.getClass(), "eventWatchedDate", term70904);
        setIntField(term70793, term70793.getClass(), "friendCount", 1649025249);
        setBooleanField(term70793, term70793.getClass(), "isMaimai", false);
        setField(term70793, term70793.getClass(), "firstGameId", "EZvlAVCXCm");
        setField(term70793, term70793.getClass(), "firstRomVersion", "axtbmWOSRY");
        setField(term70793, term70793.getClass(), "firstDataVersion", "TLlyjzxJUz");
        setIntField(term70953, term70953.getClass(), "year", 2014);
        setShortField(term70953, term70953.getClass(), "month", (short) 9);
        setShortField(term70953, term70953.getClass(), "day", (short) 26);
        setField(term70952, term70952.getClass(), "date", term70953);
        setByteField(term70957, term70957.getClass(), "hour", (byte) 5);
        setByteField(term70957, term70957.getClass(), "minute", (byte) 40);
        setByteField(term70957, term70957.getClass(), "second", (byte) 6);
        setIntField(term70957, term70957.getClass(), "nano", 923937756);
        setField(term70952, term70952.getClass(), "time", term70957);
        setField(term70793, term70793.getClass(), "firstPlayDate", term70952);
        setField(term70793, term70793.getClass(), "lastGameId", "YclIWGPKZY");
        setField(term70793, term70793.getClass(), "lastRomVersion", "gChBjLUhbg");
        setField(term70793, term70793.getClass(), "lastDataVersion", "enWkULOykY");
        setIntField(term70999, term70999.getClass(), "year", 2023);
        setShortField(term70999, term70999.getClass(), "month", (short) 8);
        setShortField(term70999, term70999.getClass(), "day", (short) 18);
        setField(term70998, term70998.getClass(), "date", term70999);
        setByteField(term71003, term71003.getClass(), "hour", (byte) 14);
        setByteField(term71003, term71003.getClass(), "minute", (byte) 2);
        setByteField(term71003, term71003.getClass(), "second", (byte) 54);
        setIntField(term71003, term71003.getClass(), "nano", 97633516);
        setField(term70998, term70998.getClass(), "time", term71003);
        setField(term70793, term70793.getClass(), "lastPlayDate", term70998);
        setIntField(term70793, term70793.getClass(), "lastPlaceId", -937498214);
        setField(term70793, term70793.getClass(), "lastPlaceName", "BPdcafiAQX");
        setField(term70793, term70793.getClass(), "lastRegionId", "GvmOxwMrOk");
        setField(term70793, term70793.getClass(), "lastRegionName", "WXUKmhwFsK");
        setField(term70793, term70793.getClass(), "lastAllNetId", "OcfokBTzZZ");
        setField(term70793, term70793.getClass(), "lastClientId", "zeBhlhyhkL");
        setField(term70791, term70791.getClass(), "user", term70793);
        setIntField(term70791, term70791.getClass(), "bgInfo", 1605317373);
        setIntField(term70791, term70791.getClass(), "fieldColor", 904392784);
        setIntField(term70791, term70791.getClass(), "guideSound", -165829430);
        setIntField(term70791, term70791.getClass(), "soundEffect", -206826041);
        setIntField(term70791, term70791.getClass(), "guideLine", -866061427);
        setIntField(term70791, term70791.getClass(), "speed", 1628734156);
        setIntField(term70791, term70791.getClass(), "optionSet", -578890556);
        setIntField(term70791, term70791.getClass(), "matching", 2129122634);
        setIntField(term70791, term70791.getClass(), "judgePos", 382196976);
        setIntField(term70791, term70791.getClass(), "rating", 506884160);
        setIntField(term70791, term70791.getClass(), "judgeJustice", 347846893);
        setIntField(term70791, term70791.getClass(), "judgeAttack", -1522343998);
        setIntField(term70791, term70791.getClass(), "headphone", -514980586);
        setIntField(term70791, term70791.getClass(), "playerLevel", 1857474216);
        setIntField(term70791, term70791.getClass(), "successTap", -53071149);
        setIntField(term70791, term70791.getClass(), "successExTap", -2041534507);
        setIntField(term70791, term70791.getClass(), "successSlideHold", 2090333247);
        setIntField(term70791, term70791.getClass(), "successAir", 1612944193);
        setIntField(term70791, term70791.getClass(), "successFlick", 1274552070);
        setIntField(term70791, term70791.getClass(), "successSkill", 701800239);
        setIntField(term70791, term70791.getClass(), "successTapTimbre", -1208601938);
        setIntField(term70791, term70791.getClass(), "privacy", -1949786069);
        term71091 = new Integer(-1357939737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71091;
        callMethod(klass, "setPrivacy", argTypes, term70791, args);
    }

};


