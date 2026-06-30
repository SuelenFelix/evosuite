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

public class UserMusicDetail_setPlayCount_79501124624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98743;
     Object term99037;

    public UserMusicDetail_setPlayCount_79501124624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term98749 = new Long(6698455537431331246L);
        term98743 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term98745 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term98747 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term98763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98909 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98955 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term98743, term98743.getClass(), "id", -5251321271779688724L);
        setLongField(term98745, term98745.getClass(), "id", -2563454768051334217L);
        setLongField(term98747, term98747.getClass(), "id", -5735822732056753596L);
        setField(term98747, term98747.getClass(), "extId", term98749);
        setField(term98747, term98747.getClass(), "luid", "OIXYYXGdlX");
        setIntField(term98764, term98764.getClass(), "year", 2019);
        setShortField(term98764, term98764.getClass(), "month", (short) 2);
        setShortField(term98764, term98764.getClass(), "day", (short) 12);
        setField(term98763, term98763.getClass(), "date", term98764);
        setByteField(term98768, term98768.getClass(), "hour", (byte) 18);
        setByteField(term98768, term98768.getClass(), "minute", (byte) 10);
        setByteField(term98768, term98768.getClass(), "second", (byte) 44);
        setIntField(term98768, term98768.getClass(), "nano", 113415617);
        setField(term98763, term98763.getClass(), "time", term98768);
        setField(term98747, term98747.getClass(), "registerTime", term98763);
        setIntField(term98774, term98774.getClass(), "year", 2016);
        setShortField(term98774, term98774.getClass(), "month", (short) 12);
        setShortField(term98774, term98774.getClass(), "day", (short) 11);
        setField(term98773, term98773.getClass(), "date", term98774);
        setByteField(term98778, term98778.getClass(), "hour", (byte) 18);
        setByteField(term98778, term98778.getClass(), "minute", (byte) 33);
        setByteField(term98778, term98778.getClass(), "second", (byte) 27);
        setIntField(term98778, term98778.getClass(), "nano", 194521435);
        setField(term98773, term98773.getClass(), "time", term98778);
        setField(term98747, term98747.getClass(), "accessTime", term98773);
        setField(term98745, term98745.getClass(), "card", term98747);
        setField(term98745, term98745.getClass(), "userName", "VBfWgJrVqV");
        setIntField(term98796, term98796.getClass(), "year", 2012);
        setShortField(term98796, term98796.getClass(), "month", (short) 1);
        setShortField(term98796, term98796.getClass(), "day", (short) 10);
        setField(term98795, term98795.getClass(), "date", term98796);
        setByteField(term98800, term98800.getClass(), "hour", (byte) 20);
        setByteField(term98800, term98800.getClass(), "minute", (byte) 40);
        setByteField(term98800, term98800.getClass(), "second", (byte) 42);
        setIntField(term98800, term98800.getClass(), "nano", 885594893);
        setField(term98795, term98795.getClass(), "time", term98800);
        setField(term98745, term98745.getClass(), "lastLoginDate", term98795);
        setBooleanField(term98745, term98745.getClass(), "isWebJoin", true);
        setField(term98745, term98745.getClass(), "webLimitDate", "BgFpfnZiJG");
        setIntField(term98745, term98745.getClass(), "level", -1878642551);
        setIntField(term98745, term98745.getClass(), "reincarnationNum", 300043927);
        setField(term98745, term98745.getClass(), "exp", "tMDFwEQAGW");
        setLongField(term98745, term98745.getClass(), "point", 8187221303948483835L);
        setLongField(term98745, term98745.getClass(), "totalPoint", -2465500898055958051L);
        setIntField(term98745, term98745.getClass(), "playCount", 2122930718);
        setIntField(term98745, term98745.getClass(), "multiPlayCount", -578301288);
        setIntField(term98745, term98745.getClass(), "multiWinCount", -977176926);
        setIntField(term98745, term98745.getClass(), "requestResCount", 57300217);
        setIntField(term98745, term98745.getClass(), "acceptResCount", -296773597);
        setIntField(term98745, term98745.getClass(), "successResCount", 1865713857);
        setIntField(term98745, term98745.getClass(), "playerRating", 1621042327);
        setIntField(term98745, term98745.getClass(), "highestRating", -1687833420);
        setIntField(term98745, term98745.getClass(), "nameplateId", -1302564054);
        setIntField(term98745, term98745.getClass(), "frameId", 1902301591);
        setIntField(term98745, term98745.getClass(), "characterId", 1413243835);
        setIntField(term98745, term98745.getClass(), "trophyId", 267793727);
        setIntField(term98745, term98745.getClass(), "playedTutorialBit", 824213114);
        setIntField(term98745, term98745.getClass(), "firstTutorialCancelNum", -1652054445);
        setIntField(term98745, term98745.getClass(), "masterTutorialCancelNum", -2032148548);
        setIntField(term98745, term98745.getClass(), "totalRepertoireCount", 1592642995);
        setIntField(term98745, term98745.getClass(), "totalMapNum", 537031810);
        setLongField(term98745, term98745.getClass(), "totalHiScore", 3840348555099491893L);
        setLongField(term98745, term98745.getClass(), "totalBasicHighScore", 4998922959033216897L);
        setLongField(term98745, term98745.getClass(), "totalAdvancedHighScore", 2782559589071225543L);
        setLongField(term98745, term98745.getClass(), "totalExpertHighScore", -3924790970169443418L);
        setLongField(term98745, term98745.getClass(), "totalMasterHighScore", -1803333754619597089L);
        setIntField(term98857, term98857.getClass(), "year", 2019);
        setShortField(term98857, term98857.getClass(), "month", (short) 12);
        setShortField(term98857, term98857.getClass(), "day", (short) 14);
        setField(term98856, term98856.getClass(), "date", term98857);
        setByteField(term98861, term98861.getClass(), "hour", (byte) 20);
        setByteField(term98861, term98861.getClass(), "minute", (byte) 41);
        setByteField(term98861, term98861.getClass(), "second", (byte) 18);
        setIntField(term98861, term98861.getClass(), "nano", 942558211);
        setField(term98856, term98856.getClass(), "time", term98861);
        setField(term98745, term98745.getClass(), "eventWatchedDate", term98856);
        setIntField(term98745, term98745.getClass(), "friendCount", -1280322093);
        setBooleanField(term98745, term98745.getClass(), "isMaimai", false);
        setField(term98745, term98745.getClass(), "firstGameId", "heAByNySVP");
        setField(term98745, term98745.getClass(), "firstRomVersion", "gPuVkQobYQ");
        setField(term98745, term98745.getClass(), "firstDataVersion", "sAHDMENVSp");
        setIntField(term98905, term98905.getClass(), "year", 2016);
        setShortField(term98905, term98905.getClass(), "month", (short) 10);
        setShortField(term98905, term98905.getClass(), "day", (short) 2);
        setField(term98904, term98904.getClass(), "date", term98905);
        setByteField(term98909, term98909.getClass(), "hour", (byte) 0);
        setByteField(term98909, term98909.getClass(), "minute", (byte) 16);
        setByteField(term98909, term98909.getClass(), "second", (byte) 21);
        setIntField(term98909, term98909.getClass(), "nano", 353747821);
        setField(term98904, term98904.getClass(), "time", term98909);
        setField(term98745, term98745.getClass(), "firstPlayDate", term98904);
        setField(term98745, term98745.getClass(), "lastGameId", "oLoxfeWIGH");
        setField(term98745, term98745.getClass(), "lastRomVersion", "vdErTHSsJu");
        setField(term98745, term98745.getClass(), "lastDataVersion", "MeFZCtLbdV");
        setIntField(term98951, term98951.getClass(), "year", 2021);
        setShortField(term98951, term98951.getClass(), "month", (short) 4);
        setShortField(term98951, term98951.getClass(), "day", (short) 26);
        setField(term98950, term98950.getClass(), "date", term98951);
        setByteField(term98955, term98955.getClass(), "hour", (byte) 1);
        setByteField(term98955, term98955.getClass(), "minute", (byte) 51);
        setByteField(term98955, term98955.getClass(), "second", (byte) 48);
        setIntField(term98955, term98955.getClass(), "nano", 602595192);
        setField(term98950, term98950.getClass(), "time", term98955);
        setField(term98745, term98745.getClass(), "lastPlayDate", term98950);
        setIntField(term98745, term98745.getClass(), "lastPlaceId", -614078903);
        setField(term98745, term98745.getClass(), "lastPlaceName", "oNgxBniAuz");
        setField(term98745, term98745.getClass(), "lastRegionId", "hvbJVpbmAQ");
        setField(term98745, term98745.getClass(), "lastRegionName", "aqayJgOWOQ");
        setField(term98745, term98745.getClass(), "lastAllNetId", "YStxlrcedL");
        setField(term98745, term98745.getClass(), "lastClientId", "mDLwflwlja");
        setField(term98743, term98743.getClass(), "user", term98745);
        setIntField(term98743, term98743.getClass(), "musicId", 250967452);
        setIntField(term98743, term98743.getClass(), "level", -67856100);
        setIntField(term98743, term98743.getClass(), "playCount", -1760300151);
        setIntField(term98743, term98743.getClass(), "scoreMax", 635198715);
        setIntField(term98743, term98743.getClass(), "resRequestCount", -619729133);
        setIntField(term98743, term98743.getClass(), "resAcceptCount", -91784171);
        setIntField(term98743, term98743.getClass(), "resSuccessCount", -1752710731);
        setIntField(term98743, term98743.getClass(), "missCount", -1991397007);
        setIntField(term98743, term98743.getClass(), "maxComboCount", -1896800756);
        setBooleanField(term98743, term98743.getClass(), "isFullCombo", false);
        setBooleanField(term98743, term98743.getClass(), "isAllJustice", true);
        setBooleanField(term98743, term98743.getClass(), "isSuccess", false);
        setIntField(term98743, term98743.getClass(), "fullChain", -855121939);
        setIntField(term98743, term98743.getClass(), "maxChain", 389647062);
        setIntField(term98743, term98743.getClass(), "scoreRank", 59254717);
        setBooleanField(term98743, term98743.getClass(), "isLock", false);
        term99037 = new Integer(-1753562901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99037;
        callMethod(klass, "setPlayCount", argTypes, term98743, args);
    }

};


